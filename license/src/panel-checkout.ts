/**
 * license/panel-checkout.ts — automatic checkout (ADMIN-PORT.md §6, spec §2/§6).
 *
 * Copied-verbatim-style mirror of zyqora-admin lib/checkout.js + lib/cashfree.js
 * + lib/email.js + lib/rateLimit.js, retargeted at the AcceptPro RA- key engine:
 *
 *   - order ids `AP` + 24 hex UPPER (regex ^AP[A-F0-9]{24}$)
 *   - create-order validation strings verbatim (spec §6) with the §2.1 Device ID
 *     rule: normalizeDeviceCode(input) then ^[0-9A-HJKMNP-TV-Z]{15}$;
 *     zyqora's MACHINE_ID_RE is NOT ported
 *   - fulfilOrder mints a REAL RA- key through Store.createLicenses + core.ts
 *     (desktop/app → pre-bound `boundDeviceCodeHashes=[hashDeviceCode(code)]`;
 *     `issuedBy:'system'`, `issuedByName:'Auto checkout'`, `source:'auto'`) —
 *     the key is the only thing that can ever unlock the app
 *   - fulfilOrder is idempotent via `order:lock:{orderId}` (set-if-absent with
 *     30s expiry), performs the exact money check and logs CHECKOUT_MISMATCH
 *
 * ── DEV/TEST ONLY — the mock gateway ─────────────────────────────────────────
 * Real Cashfree calls go through fetch() and ONLY when CASHFREE_CLIENT_ID /
 * CASHFREE_CLIENT_SECRET are set; otherwise create-order answers 503
 * 'Online payment is not available right now. Please contact support.'
 *
 * Two mock triggers exist for local development and the test suite:
 *   1. CHECKOUT_FAKE_GATEWAY=1        — fully offline mock: create-order
 *      succeeds WITHOUT any network call (fabricated paymentSessionId) and the
 *      fake gateway auto-approves the payment, marking the order `fakePaid`
 *      locally.
 *   2. CASHFREE_BASE_URL=<stub url>   — zyqora's own "test override": requests
 *      go to a local stub instead of Cashfree (loopback, no external network).
 *
 * In BOTH modes fulfilOrder trusts a LOCALLY-MARKED-PAID order (`fakePaid`)
 * instead of re-fetching Cashfree. `fakePaid`/`fakePaidAmount` are written only
 * by the mock gateway or tests — never in production. Cashfree's webhook HMAC
 * verification is unchanged in every mode (bad signature → 400 'Bad signature').
 */
import { createHmac, randomBytes, timingSafeEqual } from 'node:crypto';
import { hashDeviceCode, keyPrefixOf } from './core.ts';
import type { CheckoutOrderRecord, LicenseMetaRecord, Store } from './store.ts';
import { ORDER_TTL_SEC, PENDING_TTL_SEC, ORDER_LOCK_TTL_SEC } from './store.ts';
import {
    PLANS,
    displayDeviceCode,
    enginePlan,
    isDeviceIdInput,
    normalizeDeviceId,
    LIFETIME_EXPIRY_TS,
} from './panel-plans.ts';

// ---------------------------------------------------------------------------
// zyqora lib/checkout.js constants — verbatim semantics, AcceptPro branding
// ---------------------------------------------------------------------------

export const SELLABLE_MODES = ['desktop', 'app']; // cloud keys are still issued manually

export const ORDER_ID_RE = /^AP[A-F0-9]{24}$/;

export function newOrderId(): string {
    return 'AP' + randomBytes(12).toString('hex').toUpperCase();
}

export function isSellableMode(mode: string): boolean {
    return SELLABLE_MODES.includes(mode);
}

/** §2.1: the "Machine ID" value is the app's Device ID (15 Crockford chars). */
export function isDeviceIdField(input: unknown): boolean {
    return isDeviceIdInput(input);
}

/** Side keys use the BARE normalized 15-char form — claim is hyphenation-insensitive. */
export const pendingSideKey = (mode: string, norm: string): string => `pending:${mode}:${norm}`;
export const claimSideKey = (mode: string, norm: string): string => `claim:${mode}:${norm}`;
export const orderLockKey = (orderId: string): string => `order:lock:${orderId}`;

/** getOrder with zyqora's id-shape guard (`/^ZQ[A-F0-9]{24}$/` → `^AP…`). */
export function getCheckoutOrder(store: Store, orderId: string): CheckoutOrderRecord | null {
    if (!orderId || !ORDER_ID_RE.test(orderId)) return null;
    return store.getOrder(orderId);
}

// ---------------------------------------------------------------------------
// Mock-gateway switches (DEV/TEST ONLY — see the header comment)
// ---------------------------------------------------------------------------

/** Fully offline mock: no network at all, payments auto-approved. */
export function fakeGateway(): boolean {
    return process.env.CHECKOUT_FAKE_GATEWAY === '1';
}

/** zyqora lib/cashfree.js "test override": requests go to a local stub. */
export function stubGateway(): boolean {
    return !!process.env.CASHFREE_BASE_URL;
}

export function gatewayMocked(): boolean {
    return fakeGateway() || stubGateway();
}

// ---------------------------------------------------------------------------
// zyqora lib/cashfree.js — verbatim request/response handling
// ---------------------------------------------------------------------------

function apiVersion(): string {
    return process.env.CASHFREE_API_VERSION || '2026-01-01';
}

export function cashfreeMode(): string {
    return process.env.CASHFREE_ENV === 'production' ? 'production' : 'sandbox';
}

function baseUrl(): string {
    if (process.env.CASHFREE_BASE_URL) return process.env.CASHFREE_BASE_URL; // test override
    return cashfreeMode() === 'production'
        ? 'https://api.cashfree.com/pg'
        : 'https://sandbox.cashfree.com/pg';
}

export function cashfreeConfigured(): boolean {
    return !!(process.env.CASHFREE_CLIENT_ID && process.env.CASHFREE_CLIENT_SECRET);
}

function headers(): Record<string, string> {
    return {
        'Content-Type': 'application/json',
        'x-client-id': process.env.CASHFREE_CLIENT_ID ?? '',
        'x-client-secret': process.env.CASHFREE_CLIENT_SECRET ?? '',
        'x-api-version': apiVersion(),
    };
}

export interface CfOrderState {
    order_status?: string;
    order_amount?: unknown;
    order_currency?: string;
    cf_order_id?: string;
    payment_session_id?: string;
    [k: string]: unknown;
}

export async function createCashfreeOrder(args: {
    orderId: string;
    amount: number;
    customer: { id: string; name: string; phone: string; email: string };
    returnUrl: string;
    notifyUrl: string;
    note: string;
}): Promise<CfOrderState> {
    const res = await fetch(`${baseUrl()}/orders`, {
        method: 'POST',
        headers: headers(),
        body: JSON.stringify({
            order_id: args.orderId,
            order_amount: args.amount,
            order_currency: 'INR',
            customer_details: {
                customer_id: args.customer.id,
                customer_name: args.customer.name,
                customer_phone: args.customer.phone,
                customer_email: args.customer.email,
            },
            order_meta: { return_url: args.returnUrl, notify_url: args.notifyUrl },
            order_note: args.note,
        }),
    });
    const data = (await res.json().catch(() => ({}))) as CfOrderState;
    if (!res.ok || !data.payment_session_id) {
        throw new Error((data.message as string) || `Cashfree order failed (${res.status})`);
    }
    return data;
}

// Authoritative order state straight from Cashfree (never trust the webhook body alone).
export async function getCashfreeOrder(orderId: string): Promise<CfOrderState> {
    const res = await fetch(`${baseUrl()}/orders/${encodeURIComponent(orderId)}`, { headers: headers() });
    const data = (await res.json().catch(() => ({}))) as CfOrderState;
    if (!res.ok) throw new Error((data.message as string) || `Cashfree get-order failed (${res.status})`);
    return data;
}

// Signature = base64(HMAC-SHA256(timestamp + rawBody, clientSecret)).
export function verifyWebhookSignature(rawBody: string, timestamp: string | undefined, signature: string | undefined): boolean {
    const secret = process.env.CASHFREE_CLIENT_SECRET;
    if (!secret || !timestamp || !signature) return false;
    const expected = createHmac('sha256', secret).update(timestamp + rawBody).digest('base64');
    const a = Buffer.from(expected);
    const b = Buffer.from(signature);
    return a.length === b.length && timingSafeEqual(a, b);
}

// ---------------------------------------------------------------------------
// zyqora lib/rateLimit.js — fixed-window counter, fail-open (no KV here: an
// in-memory map). Bucket keys `rl:{bucket}` (spec §7).
// ---------------------------------------------------------------------------

const rateWindows = new Map<string, { n: number; resetAt: number }>();

/** Returns true if the request is allowed. Never blocks on limiter failure. */
export function allow(bucket: string, limit: number, windowSec: number): boolean {
    try {
        const k = `rl:${bucket}`;
        const now = Date.now();
        const w = rateWindows.get(k);
        if (!w || w.resetAt <= now) {
            rateWindows.set(k, { n: 1, resetAt: now + windowSec * 1000 });
            return true;
        }
        w.n += 1;
        return w.n <= limit;
    } catch {
        return true; // never block real customers because the limiter itself failed
    }
}

export function clientIp(req: { headers?: Record<string, string | string[] | undefined> }): string {
    const xfRaw = req.headers?.['x-forwarded-for'];
    const xf = Array.isArray(xfRaw) ? xfRaw[0] : xfRaw;
    const realRaw = req.headers?.['x-real-ip'];
    const real = Array.isArray(realRaw) ? realRaw[0] : realRaw;
    return (xf ? xf.split(',')[0].trim() : real) || 'unknown';
}

// ---------------------------------------------------------------------------
// zyqora lib/email.js — optional key email, branded AcceptPro (ADMIN-PORT §1:
// subject `Your AcceptPro <planName> license key`), errors swallowed: a failure
// here must never affect key delivery.
// ---------------------------------------------------------------------------

export async function sendKeyEmail(args: {
    to: string;
    name: string;
    key: string;
    planName: string;
    expiryText: string;
}): Promise<boolean> {
    const apiKey = process.env.RESEND_API_KEY;
    const from = process.env.EMAIL_FROM;
    if (!apiKey || !from || !args.to) return false;
    try {
        const res = await fetch('https://api.resend.com/emails', {
            method: 'POST',
            headers: { Authorization: `Bearer ${apiKey}`, 'Content-Type': 'application/json' },
            body: JSON.stringify({
                from,
                to: [args.to],
                subject: `Your AcceptPro ${args.planName} license key`,
                html: `<p>Hi ${escapeHtml(args.name || 'there')},</p>
<p>Thank you for choosing AcceptPro ${escapeHtml(args.planName)}. Your license key:</p>
<p style="font-size:18px;font-family:monospace;background:#f3f4f6;padding:12px;border-radius:8px">${escapeHtml(args.key)}</p>
<p>${args.expiryText ? `Valid until ${escapeHtml(args.expiryText)}.<br>` : ''}Open AcceptPro, go to the License screen and paste the key (the app activates automatically if you bought from inside it).</p>
<p>Need help? Reply to this email or WhatsApp +91 92177 58442.</p>`,
            }),
        });
        return res.ok;
    } catch {
        return false;
    }
}

function escapeHtml(s: string): string {
    return String(s).replace(/[&<>"']/g, (c) => ({ '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;' }[c] as string));
}

// ---------------------------------------------------------------------------
// Fulfilment (zyqora lib/checkout.js issueLicense + fulfilOrder)
// ---------------------------------------------------------------------------

/**
 * Creates and stores a licence for a paid order so the record looks exactly
 * like one made in the admin panel (plus source/order fields) — but minted as
 * a REAL AcceptPro RA- licence through the engine (ADMIN-PORT.md §2/§6).
 */
export function issueAutoLicense(
    store: Store,
    args: {
        machineId: string; // bare normalized device code (or '' for cloud)
        licenseMode: string;
        planKey: string;
        tierId: string;
        deviceLimit: number;
        features: Record<string, boolean>;
        price: number;
        customer: { name: string; phone: string; email: string };
        source: string; // 'auto' = paid checkout
        orderId: string | null;
        cfOrderId: string | null;
        notes: string;
    },
): { key: string; meta: LicenseMetaRecord } {
    const now = Math.floor(Date.now() / 1000);
    const e = enginePlan(args.planKey);
    // desktop/app keys are pre-bound to the submitted Device ID (engine locks a
    // pre-bound key to exactly the codes it was minted for); cloud is unbound
    // with the engine's own 10-device cap.
    const bound = args.licenseMode === 'cloud' ? [] : [args.machineId];
    const created = store.createLicenses('system', {
        count: 1,
        planType: e.planType,
        durationDays: e.durationDays,
        maxDevices: bound.length ? 1 : Math.min(10, Math.max(1, args.deviceLimit)),
        deviceCodes: bound,
        note: args.notes,
    })[0];

    const meta: LicenseMetaRecord = {
        keyHash: created.record.keyHash,
        key: keyPrefixOf(created.key),
        plan: args.planKey,
        planTier: args.tierId,
        deviceLimit: args.deviceLimit,
        expiryTs: e.isLifetime ? LIFETIME_EXPIRY_TS : now + e.durationDays * 86400,
        isLifetime: e.isLifetime,
        price: args.price,
        discountedPrice: args.price,
        discountAmount: 0,
        licenseMode: args.licenseMode,
        machineId: args.licenseMode === 'cloud' ? null : displayDeviceCode(args.machineId),
        clientName: args.customer.name,
        clientPhone: args.customer.phone,
        clientEmail: args.customer.email || '',
        businessCategory: '',
        website: 'No website',
        notes: args.notes,
        features: args.features,
        affiliateId: null,
        affiliateName: null,
        affiliateCommissionAmount: null,
        reviewAccess: false,
        whitelabelName: null,
        issuedBy: 'system',
        issuedByName: 'Auto checkout',
        issuedAt: now,
        activated: false,
        activatedAt: null,
        revoked: false,
        revokedBy: null,
        revokedByName: null,
        revokedAt: null,
        revokedReason: null,
        source: args.source,
        orderId: args.orderId,
        cfOrderId: args.cfOrderId,
    };
    store.saveLicenseMeta(meta);

    // SECRETS POLICY: the log's `key` carries the DISPLAY PREFIX, not the
    // plaintext (spec §7 meta shape kept byte-for-byte otherwise).
    store.savePanelLog({
        id: randomUUID(),
        action: 'LICENSE_GENERATED',
        actorId: 'system',
        actorName: meta.issuedByName,
        actorRole: 'system',
        ts: now,
        flag: null,
        meta: {
            key: meta.key,
            clientName: args.customer.name,
            clientPhone: args.customer.phone,
            plan: args.planKey,
            tier: args.tierId,
            price: args.price,
            discountedPrice: args.price,
            deviceLimit: args.deviceLimit,
            issuedByName: meta.issuedByName,
            source: args.source,
            orderId: args.orderId,
        },
    });
    return { key: created.key, meta };
}

export type FulfilResult =
    | { ok: true; key: string; order: CheckoutOrderRecord }
    | { ok: false; pending: true }
    | { ok: false; status: string }
    | { ok: false; error: string };

/**
 * Called by the Cashfree webhook, the status poll and the in-app claim — all
 * safe to run repeatedly and concurrently. Pays out exactly one licence per
 * order.
 *
 * DEV/TEST ONLY: when the order carries the fake gateway's local `fakePaid`
 * mark, that mark IS the payment truth (no Cashfree re-fetch). See the header.
 */
export async function fulfilOrder(store: Store, orderId: string): Promise<FulfilResult> {
    const order = getCheckoutOrder(store, orderId);
    if (!order) return { ok: false, error: 'Unknown order' };
    if (order.licenseKey) return { ok: true, key: order.licenseKey, order };

    const lock = orderLockKey(orderId);
    const locked = store.setSideKeyNx(lock, '1', ORDER_LOCK_TTL_SEC);
    if (!locked) {
        await new Promise((r) => setTimeout(r, 1500));
        const again = getCheckoutOrder(store, orderId);
        return again?.licenseKey ? { ok: true, key: again.licenseKey, order: again } : { ok: false, pending: true };
    }

    try {
        const fresh = getCheckoutOrder(store, orderId);
        if (fresh?.licenseKey) return { ok: true, key: fresh.licenseKey, order: fresh };

        // ── payment truth ────────────────────────────────────────────────
        // DEV/TEST ONLY: a locally-marked-paid order is trusted verbatim (the
        // fake gateway auto-approved it). Otherwise ask Cashfree directly —
        // the webhook body alone is never trusted for money.
        let cf: CfOrderState;
        if (order.fakePaid === true) {
            cf = {
                order_status: 'PAID',
                order_amount: order.fakePaidAmount ?? PLANS[order.planId]?.price,
                order_currency: 'INR',
                cf_order_id: `FAKE-${orderId}`,
            };
        } else if (fakeGateway()) {
            cf = { order_status: 'PENDING' }; // offline mock: nothing can pay
        } else {
            cf = await getCashfreeOrder(orderId);
        }
        if (cf.order_status !== 'PAID') return { ok: false, status: cf.order_status || 'UNKNOWN' };

        const plan = PLANS[order.planId];
        if (!plan || Number(cf.order_amount) !== plan.price || (cf.order_currency && cf.order_currency !== 'INR')) {
            order.status = 'amount_mismatch';
            store.saveOrder(order);
            store.savePanelLog({
                id: randomUUID(),
                action: 'CHECKOUT_MISMATCH',
                actorId: 'system',
                actorName: 'Auto checkout',
                actorRole: 'system',
                ts: Math.floor(Date.now() / 1000),
                flag: 'warning',
                meta: { orderId, paid: cf.order_amount, expected: plan?.price },
            });
            return { ok: false, error: 'Payment amount did not match the plan' };
        }

        const license = issueAutoLicense(store, {
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
            cfOrderId: (cf.cf_order_id as string) ?? null,
            notes: `Auto checkout (${plan.name})`,
        });

        order.status = 'paid';
        order.licenseKey = license.key;
        order.licenseKeyHash = license.meta.keyHash;
        order.paidAt = Math.floor(Date.now() / 1000);
        order.cfOrderId = (cf.cf_order_id as string) ?? null;
        store.saveOrder(order);
        store.setSideKey(claimSideKey(order.mode, order.machineId), orderId, ORDER_TTL_SEC);

        // Best-effort email; delivery of the key never depends on it.
        void sendKeyEmail({
            to: order.customer.email,
            name: order.customer.name,
            key: license.key,
            planName: plan.name,
            expiryText: new Date(license.meta.expiryTs * 1000).toDateString(),
        });
        return { ok: true, key: license.key, order };
    } finally {
        store.delSideKey(lock);
    }
}

export { PENDING_TTL_SEC, ORDER_TTL_SEC, ORDER_LOCK_TTL_SEC };
