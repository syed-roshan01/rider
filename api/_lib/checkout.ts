/**
 * api/_lib/checkout.ts -- automatic Cashfree checkout. Port of zyqora-admin
 * lib/checkout.js: order ids are `AP` + 24 hex UPPER (ADMIN-PORT §1), the
 * licence is minted as a REAL AcceptPro RA- key through the engine (the ZYQ
 * HMAC key format does not exist anywhere), and fulfilment is idempotent via
 * the `order:lock:{orderId}` SET-NX-EX-30 lock (panel_settings conditional
 * insert -- see panelStore.acquireOrderLock).
 *
 * Device ID value space (ADMIN-PORT §2.1): "Machine ID" = the app's Device ID,
 * validated with normalizeDeviceCode + /^[0-9A-HJKMNP-TV-Z]{15}$/ and stored
 * in display form XXXXX-XXXXX-XXXXX. The `pending:` / `claim:` side keys use
 * the BARE normalized 15-char form so claiming is hyphenation-insensitive.
 */
import { randomBytes, randomUUID } from 'node:crypto';
import { keyPrefixOf, unsealKey } from '../../supabase/functions/_shared/license.js';
import { masterSealKey, sb, sbRows } from './server.js';
import type { DbRow } from './server.js';
import { getCashfreeOrder } from './cashfree.js';
import { sendKeyEmail } from './email.js';
import {
    boundHashOf,
    deviceIdKey,
    engineMaxDevices,
    mintRaKey,
    planDurationDays,
    planEngineType,
    planExpiryTs,
    saveLicenseMeta,
    type PanelLicense,
} from './panelLicense.js';
import {
    acquireOrderLock,
    releaseOrderLock,
    saveLog,
    setClaim,
    type CheckoutCustomer,
    type CheckoutOrder,
    type PanelLog,
} from './panelStore.js';
import { PLANS, type PlanDef } from './plans.js';

export const ORDER_TTL = 60 * 60 * 24 * 90;
export const SELLABLE_MODES = ['desktop', 'app']; // cloud keys are still issued manually

export function isSellableMode(mode: string): boolean {
    return SELLABLE_MODES.includes(mode);
}

/** `AP` + 24 hex UPPER (ADMIN-PORT §1; zyqora used `ZQ`+24 hex). */
export function newOrderId(): string {
    return 'AP' + randomBytes(12).toString('hex').toUpperCase();
}

export const ORDER_ID_RE = /^AP[A-F0-9]{24}$/;

function eq(v: string): string {
    return encodeURIComponent(v);
}

function one(rows: DbRow[]): DbRow | null {
    return rows[0] ?? null;
}

/** kv.saveOrder: TTL refreshed on every save (90d). */
export async function saveOrder(order: CheckoutOrder): Promise<void> {
    await sb('POST', '/checkout_orders', {
        order_id: order.orderId,
        plan_id: order.planId,
        mode: order.mode,
        machine_id: order.machineId,
        amount: order.amount,
        status: order.status,
        customer: {
            name: order.customer?.name ?? '',
            phone: order.customer?.phone ?? '',
            email: order.customer?.email ?? '',
        },
        created_at: order.createdAt,
        paid_at: order.paidAt ?? null,
        license_key_hash: order.licenseKeyHash ?? null,
        expires_at: Math.floor(Date.now() / 1000) + ORDER_TTL,
    }, { prefer: 'return=representation,resolution=merge-duplicates' });
}

/** kv.getOrder: orderId shape-checked; expired rows read as "unknown order". */
export async function getOrder(orderId: string): Promise<CheckoutOrder | null> {
    if (!orderId || !ORDER_ID_RE.test(orderId)) return null;
    const rows = await sbRows(`/checkout_orders?select=*&order_id=eq.${eq(orderId)}`);
    const row = one(rows);
    if (!row) return null;
    const expiresAt = Number(row.expires_at ?? 0);
    if (expiresAt && expiresAt <= Math.floor(Date.now() / 1000)) return null; // KV TTL semantics
    const customer = (row.customer ?? {}) as DbRow;
    const keyHash = row.license_key_hash == null ? null : String(row.license_key_hash);
    return {
        orderId: String(row.order_id ?? ''),
        planId: String(row.plan_id ?? ''),
        mode: String(row.mode ?? ''),
        machineId: String(row.machine_id ?? ''),
        amount: Number(row.amount ?? 0),
        status: String(row.status ?? ''),
        customer: {
            name: String(customer.name ?? ''),
            phone: String(customer.phone ?? ''),
            email: String(customer.email ?? ''),
        },
        createdAt: Number(row.created_at ?? 0),
        paidAt: row.paid_at == null ? null : Number(row.paid_at),
        licenseKey: await revealOrderKey(keyHash),
        licenseKeyHash: keyHash,
        expiresAt,
    };
}

/** The wire `licenseKey` is resolved on read via unsealKey -- never persisted. */
async function revealOrderKey(keyHash: string | null): Promise<string | null> {
    if (!keyHash) return null;
    const rows = await sbRows(`/licenses?select=key_sealed&key_hash=eq.${eq(keyHash)}`);
    const row = one(rows);
    const sealed = row ? String(row.key_sealed ?? '') : '';
    if (!sealed) return null;
    try {
        return unsealKey(masterSealKey(), sealed);
    } catch {
        return null;
    }
}

// ---------------------------------------------------------------------------
// issueLicense -- "the record looks exactly like one made in the admin panel
// (plus source/order fields)" (zyqora lib/checkout.js), but minted as a real
// RA- licence through the engine (ADMIN-PORT §2/§6).
// ---------------------------------------------------------------------------

interface IssueOptions {
    machineId: string; // display form XXXXX-XXXXX-XXXXX
    licenseMode: string;
    planKey: string; // the catalog's durationPlan, e.g. 'yearly'
    tierId: string; // starter | pro | business
    deviceLimit: number;
    features: Record<string, boolean>;
    price: number;
    customer: CheckoutCustomer;
    source: string;
    orderId?: string | null;
    cfOrderId?: string | number | null;
    notes?: string;
}

async function issueLicense(opts: IssueOptions): Promise<PanelLicense> {
    const issuedAt = Math.floor(Date.now() / 1000);
    const durationDays = planDurationDays(opts.planKey);
    const expiryTs = planExpiryTs(issuedAt, opts.planKey);
    const bound = opts.licenseMode === 'cloud' ? [] : boundHashOf(opts.machineId);
    const mint = await mintRaKey({
        planType: planEngineType(opts.planKey),
        durationDays,
        maxDevices: engineMaxDevices(opts.licenseMode, opts.deviceLimit, bound.length),
        bound,
        note: opts.notes || '',
        createdBy: 'system',
        isLifetime: false,
        expiryTs,
    });

    const license: PanelLicense = {
        key: mint.key,
        plan: opts.planKey,
        planTier: opts.tierId,
        deviceLimit: opts.deviceLimit,
        expiryTs: mint.expiryTs,
        isLifetime: false,
        price: opts.price,
        discountedPrice: opts.price,
        discountAmount: 0,
        licenseMode: opts.licenseMode,
        machineId: opts.machineId,
        clientName: opts.customer.name,
        clientPhone: opts.customer.phone,
        clientEmail: opts.customer.email || '',
        businessCategory: '',
        website: 'No website',
        notes: opts.notes || '',
        features: opts.features,
        affiliateId: null,
        affiliateName: null,
        affiliateCommissionAmount: null,
        reviewAccess: false,
        whitelabelName: null,
        issuedBy: 'system',
        issuedByName: 'Auto checkout',
        issuedAt,
        activated: false,
        activatedAt: null,
        revoked: false,
        revokedBy: null,
        revokedByName: null,
        revokedAt: null,
        revokedReason: null,
        source: opts.source, // 'auto' = paid checkout
        orderId: opts.orderId || null,
        cfOrderId: opts.cfOrderId == null ? null : String(opts.cfOrderId),
        engine: {
            keyHash: mint.engine.keyHash,
            status: mint.engine.status,
            planType: mint.engine.planType,
            durationDays: mint.engine.durationDays,
            maxDevices: mint.engine.maxDevices,
            activatedAt: null,
            expiresAt: null,
            boundDeviceCodeHashes: mint.engine.boundDeviceCodeHashes ?? [],
        },
    };
    await saveLicenseMeta(license);

    const log: PanelLog = {
        id: randomUUID(),
        action: 'LICENSE_GENERATED',
        actorId: 'system',
        actorName: license.issuedByName,
        actorRole: 'system',
        ts: issuedAt,
        flag: null,
        meta: {
            key: keyPrefixOf(license.key),
            clientName: opts.customer.name,
            clientPhone: opts.customer.phone,
            plan: opts.planKey,
            tier: opts.tierId,
            price: opts.price,
            discountedPrice: opts.price,
            deviceLimit: opts.deviceLimit,
            issuedByName: license.issuedByName,
            source: opts.source,
            orderId: opts.orderId || null,
        },
    };
    await saveLog(log);
    return license;
}

// ---------------------------------------------------------------------------
// fulfilOrder -- called by the webhook, the status poll and the in-app claim.
// All safe to run repeatedly and concurrently. Pays out exactly one license
// per order.
// ---------------------------------------------------------------------------

export type FulfilResult =
    | { ok: true; key: string; order: CheckoutOrder }
    | { ok: false; error?: string; status?: string; pending?: boolean };

export async function fulfilOrder(orderId: string): Promise<FulfilResult> {
    const order = await getOrder(orderId);
    if (!order) return { ok: false, error: 'Unknown order' };
    if (order.licenseKey) return { ok: true, key: order.licenseKey, order };

    const locked = await acquireOrderLock(orderId); // SET order:lock:{id} 1 NX EX 30
    if (!locked) {
        await new Promise((r) => setTimeout(r, 1500));
        const again = await getOrder(orderId);
        return again?.licenseKey
            ? { ok: true, key: again.licenseKey, order: again }
            : { ok: false, pending: true };
    }

    try {
        const fresh = await getOrder(orderId);
        if (fresh?.licenseKey) return { ok: true, key: fresh.licenseKey, order: fresh };

        // Ask Cashfree directly -- the webhook body alone is never trusted for money.
        const cf = await getCashfreeOrder(orderId);
        if (cf.order_status !== 'PAID') return { ok: false, status: cf.order_status || 'UNKNOWN' };

        const plan: PlanDef | undefined = PLANS[order.planId];
        if (!plan || Number(cf.order_amount) !== plan.price || (cf.order_currency && cf.order_currency !== 'INR')) {
            order.status = 'amount_mismatch';
            await saveOrder(order);
            const log: PanelLog = {
                id: randomUUID(),
                action: 'CHECKOUT_MISMATCH',
                actorId: 'system',
                actorName: 'Auto checkout',
                actorRole: 'system',
                ts: Math.floor(Date.now() / 1000),
                flag: 'warning',
                meta: { orderId, paid: cf.order_amount, expected: plan?.price },
            };
            await saveLog(log);
            return { ok: false, error: 'Payment amount did not match the plan' };
        }

        const license = await issueLicense({
            machineId: order.machineId,
            licenseMode: order.mode,
            planKey: plan.durationPlan,
            tierId: plan.id,
            deviceLimit: plan.deviceLimit,
            features: plan.features,
            price: plan.price,
            customer: order.customer,
            source: 'auto',
            orderId,
            cfOrderId: cf.cf_order_id,
            notes: `Auto checkout (${plan.name})`,
        });

        order.status = 'paid';
        order.licenseKey = license.key;
        order.licenseKeyHash = license.engine.keyHash;
        order.paidAt = Math.floor(Date.now() / 1000);
        await saveOrder(order);
        await setClaim(order.mode, deviceIdKey(order.machineId), orderId);

        // Best-effort email; delivery of the key never depends on it.
        sendKeyEmail({
            to: order.customer.email,
            name: order.customer.name,
            key: license.key,
            planName: plan.name,
            expiryText: new Date(license.expiryTs * 1000).toDateString(),
        });
        return { ok: true, key: license.key, order };
    } finally {
        await releaseOrderLock(orderId);
    }
}
