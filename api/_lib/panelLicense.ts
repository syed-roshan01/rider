/**
 * api/_lib/panelLicense.ts -- panel licence records + the AcceptPro RA- key
 * engine (ADMIN-PORT §2).
 *
 * ONE record = zyqora's commercial licence shape (license_meta row) joined to
 * the engine row in `licenses` (minted via the `create_license` rpc exactly
 * like api/admin/licenses/index.ts). All key crypto -- generateKey/hashKey/
 * sealKey/unsealKey/keyPrefixOf/normalizeKey/hashDeviceCode -- comes from the
 * single source of truth supabase/functions/_shared/license.ts, imported by
 * relative path and NEVER reimplemented.
 *
 * Mapping (zyqora plan -> engine planType/durationDays, ADMIN-PORT §2):
 *   trial1day -> DAY/1     trial    -> DAY/3     weekly   -> WEEK/7
 *   monthly   -> MONTH/30  3months  -> MONTH/90  6months  -> MONTH/180
 *   yearly    -> YEAR/365  lifetime -> YEAR/36500 (isLifetime, expiryTs fixed
 *   at 253402300799)      custom   -> MONTH/customDays
 *   anything else -> MONTH/30 (zyqora planToExpiry's `?? 30` fallback)
 *
 * license_meta.expiryTs = issuedAt + durationDays*86400 (unix SECONDS) -- the
 * "Valid until ..." figure the UI shows. The engine keeps its own lifecycle
 * (key `unused` until the app first activates it; engine expiresAt then runs
 * from activation) and is surfaced read-only in the `engine` sub-object.
 */
import type { DbRow } from './server.js';
import { masterSealKey, sb, sbRows, sbRpc, sbWrite, toLicenseRecord } from './server.js';
import {
    generateKey,
    hashDeviceCode,
    hashKey,
    keyPrefixOf,
    normalizeDeviceCode,
    normalizeKey,
    sealKey,
    unsealKey,
    type LicenseRecord,
    type LicenseStatus,
    type PlanType,
} from '../../supabase/functions/_shared/license.js';

// ---------------------------------------------------------------------------
// wire record -- the zyqora licence shape + the AcceptPro binding section
// ---------------------------------------------------------------------------

export interface PanelEngineBinding {
    keyHash: string;
    status: LicenseStatus;
    planType: PlanType;
    durationDays: number;
    maxDevices: number;
    activatedAt: number | null; // unix s
    expiresAt: number | null; // unix s
    boundDeviceCodeHashes: string[];
}

export interface PanelLicense {
    key: string; // plaintext RA- key, unsealed on demand (UI masks key.slice(0,18) + '…')
    plan: string;
    planTier?: string; // checkout tier id -- absent on manual records
    deviceLimit: number;
    expiryTs: number;
    isLifetime: boolean;
    price: number;
    discountedPrice: number;
    discountAmount: number;
    licenseMode: string;
    machineId: string | null;
    clientName: string;
    clientPhone: string;
    clientEmail: string;
    businessCategory: string;
    website: string;
    notes: string;
    features: Record<string, unknown>;
    affiliateId: string | null;
    affiliateName: string | null;
    affiliateCommissionAmount: number | null;
    reviewAccess?: boolean; // absent on convert()-created records, exactly like the JSON store
    validationException?: boolean; // absent until a super admin sets it
    exceptionBoundMachineId?: string | null;
    whitelabelIssued?: boolean; // present (true) only for reseller-issued keys
    whitelabelName: string | null;
    issuedBy: string;
    issuedByName: string;
    issuedAt: number;
    activated: boolean;
    activatedAt: number | null;
    revoked: boolean;
    revokedBy: string | null;
    revokedByName: string | null;
    revokedAt: number | null;
    revokedReason: string | null;
    convertedFromKey?: string;
    source?: string;
    orderId?: string | null;
    cfOrderId?: string | null;
    /** additive (ADMIN-PORT §2): engine status / activation / expiry / binding */
    engine: PanelEngineBinding;
}

// ---------------------------------------------------------------------------
// zyqora plan vocabulary (lib/license.js, minus the ZYQ-HMAC key functions)
// ---------------------------------------------------------------------------

export const LICENSE_MODES = ['desktop', 'cloud', 'app'];

export const WL_PLAN_OPTIONS = [
    { value: 'monthly', label: '1 Month', days: 30 },
    { value: '3months', label: '3 Months', days: 90 },
    { value: '6months', label: '6 Months', days: 180 },
    { value: 'yearly', label: '1 Year', days: 365 },
    { value: 'custom', label: 'Custom Days', days: null },
];
export const WL_PLANS = WL_PLAN_OPTIONS.map((o) => o.value);

/** zyqora resolveWlPlans(): unusable/missing allow-lists fall back to "all". */
export function resolveWlPlans(whitelabel: { allowedPlans?: unknown } | null): string[] {
    const list = Array.isArray(whitelabel?.allowedPlans)
        ? (whitelabel.allowedPlans as unknown[]).filter((p) => WL_PLANS.includes(String(p))).map(String)
        : [];
    return list.length ? list : [...WL_PLANS];
}

/** zyqora resolveWlMaxDevices(): missing field means unrestricted (255). */
export function resolveWlMaxDevices(whitelabel: { maxDevices?: unknown } | null): number {
    const n = Math.floor(Number(whitelabel?.maxDevices));
    return Number.isFinite(n) && n >= 1 && n <= 255 ? n : 255;
}

/** Verbatim from the generate/convert routes (note: no aiCampaigns). */
export const DEFAULT_FEATURES: Record<string, boolean> = {
    mobile: true,
    trustBuilder: true,
    autoReply: true,
    chatbot: true,
    liveChat: true,
    groupGrabber: true,
    aiAutomation: true,
    forms: true,
};

/** zyqora surface deviceLimit: clamp 1..255 (lib/license.js generateKey clamp). */
export function surfaceDeviceLimit(deviceLimit: unknown): number {
    return Math.max(1, Math.min(255, parseInt(String(deviceLimit)) || 1));
}

/** zyqora planToExpiry days table (custom uses customDays, min 1). */
export function planDurationDays(plan: string, customDays?: unknown): number {
    switch (plan) {
        case 'trial1day': return 1;
        case 'trial': return 3;
        case 'weekly': return 7;
        case 'monthly': return 30;
        case '3months': return 90;
        case '6months': return 180;
        case 'yearly': return 365;
        case 'lifetime': return 36500;
        case 'custom': return Math.max(1, parseInt(String(customDays)) || 1);
        default: return 30; // zyqora planToExpiry `?? 30`
    }
}

/** zyqora label -> engine PlanType (ADMIN-PORT §2 table). */
export function planEngineType(plan: string): PlanType {
    switch (plan) {
        case 'trial1day':
        case 'trial':
            return 'DAY';
        case 'weekly':
            return 'WEEK';
        case 'yearly':
        case 'lifetime':
            return 'YEAR';
        default: // monthly, 3months, 6months, custom, unknown
            return 'MONTH';
    }
}

export const LIFETIME_EXPIRY_TS = 253402300799;

/**
 * ADMIN-PORT §2: expiryTs = issuedAt + durationDays*86400 (unix s); lifetime
 * keys use the fixed 253402300799. `expiryTs` may be nudged by the collision
 * retry loop exactly like zyqora's generate/convert routes.
 */
export function planExpiryTs(issuedAt: number, plan: string, customDays?: unknown): number {
    if (plan === 'lifetime') return LIFETIME_EXPIRY_TS;
    return issuedAt + planDurationDays(plan, customDays) * 86400;
}

/**
 * Engine max_devices (ADMIN-PORT §2): desktop/app keys are pre-bound to the
 * one submitted device code, so the engine locks them to exactly the codes
 * they were minted for; cloud keys carry the device cap (engine cap is 10 --
 * the zyqora 1..255 surface value lives in license_meta.deviceLimit).
 */
export function engineMaxDevices(licenseMode: string, surfaceLimit: number, boundCount: number): number {
    if (boundCount) return boundCount;
    return Math.max(1, Math.min(10, surfaceLimit));
}

/** Hash the "Machine ID"/"Android ID" input = the app's device code. */
export function boundHashOf(deviceCode: string): string[] {
    const h = hashDeviceCode(deviceCode);
    return h ? [h] : [];
}

// ---------------------------------------------------------------------------
// Device ID value space (ADMIN-PORT §2.1, LOCKED)
// ---------------------------------------------------------------------------
// The "Machine ID" / "Android ID" field takes the app's DEVICE ID: display
// form XXXXX-XXXXX-XXXXX, 15 Crockford base32 chars (e.g. 7QK2M-3XW8H-PTD4R).
// zyqora's MACHINE_ID_RE (/^[A-F0-9]{16}$/) is NOT ported: normalize first
// with normalizeDeviceCode (shared crypto module -- strips separators, folds
// O->0, I/L->1), then require exactly 15 chars of the Crockford alphabet.

export const DEVICE_CODE_RE = /^[0-9A-HJKMNP-TV-Z]{15}$/;

/** normalizeDeviceCode from the single crypto source of truth. */
export function normalizeDeviceId(input: string): string {
    return normalizeDeviceCode(String(input ?? ''));
}

/** Valid Device ID = 15 Crockford chars after normalization. */
export function isDeviceId(input: string): boolean {
    return DEVICE_CODE_RE.test(normalizeDeviceId(input));
}

/** Bare normalized 15-char form -- used by the checkout side keys
 *  (`pending:` / `claim:`) so claiming is hyphenation-insensitive. */
export function deviceIdKey(input: string): string {
    return normalizeDeviceId(input);
}

/** Re-hyphenated display form XXXXX-XXXXX-XXXXX -- what license_meta.machineId
 *  (and checkout_orders.machine_id) stores. */
export function deviceIdDisplay(input: string): string {
    return normalizeDeviceId(input).match(/.{1,5}/g)?.join('-') ?? '';
}

// ---------------------------------------------------------------------------
// row <-> record
// ---------------------------------------------------------------------------

function eq(v: string): string {
    return encodeURIComponent(v);
}

function one(rows: DbRow[]): DbRow | null {
    return rows[0] ?? null;
}

function toEngineBinding(rec: LicenseRecord): PanelEngineBinding {
    return {
        keyHash: rec.keyHash,
        status: rec.status,
        planType: rec.planType,
        durationDays: rec.durationDays,
        maxDevices: rec.maxDevices,
        activatedAt: rec.activatedAt == null ? null : Math.floor(rec.activatedAt / 1000),
        expiresAt: rec.expiresAt == null ? null : Math.floor(rec.expiresAt / 1000),
        boundDeviceCodeHashes: rec.boundDeviceCodeHashes ?? [],
    };
}

/** Resolve the wire `key`: the plaintext RA- key, unsealed on demand. */
function revealKey(engine: LicenseRecord | null, fallbackPrefix: string): string {
    if (engine?.keySealed) {
        try {
            return unsealKey(masterSealKey(), engine.keySealed);
        } catch {
            /* fall through to the display prefix */
        }
    }
    return fallbackPrefix;
}

function toPanelLicense(metaRow: DbRow, engineRow: DbRow | null): PanelLicense {
    const engine = engineRow ? toLicenseRecord(engineRow) : null;
    const rec: PanelLicense = {
        key: revealKey(engine, String(metaRow.key_prefix ?? '')),
        plan: String(metaRow.plan ?? ''),
        deviceLimit: Number(metaRow.device_limit ?? 1),
        expiryTs: Number(metaRow.expiry_ts ?? 0),
        isLifetime: metaRow.is_lifetime === true,
        price: Number(metaRow.price ?? 0),
        discountedPrice: Number(metaRow.discounted_price ?? 0),
        discountAmount: Number(metaRow.discount_amount ?? 0),
        licenseMode: String(metaRow.license_mode ?? 'desktop'),
        machineId: metaRow.machine_id == null ? null : String(metaRow.machine_id),
        clientName: String(metaRow.client_name ?? ''),
        clientPhone: String(metaRow.client_phone ?? ''),
        clientEmail: String(metaRow.client_email ?? ''),
        businessCategory: String(metaRow.business_category ?? ''),
        website: String(metaRow.website ?? ''),
        notes: String(metaRow.notes ?? ''),
        features: (metaRow.features ?? {}) as Record<string, unknown>,
        affiliateId: metaRow.affiliate_id == null ? null : String(metaRow.affiliate_id),
        affiliateName: metaRow.affiliate_name == null ? null : String(metaRow.affiliate_name),
        affiliateCommissionAmount:
            metaRow.affiliate_commission_amount == null ? null : Number(metaRow.affiliate_commission_amount),
        whitelabelName: metaRow.whitelabel_name == null ? null : String(metaRow.whitelabel_name),
        issuedBy: String(metaRow.issued_by ?? ''),
        issuedByName: String(metaRow.issued_by_name ?? ''),
        issuedAt: Number(metaRow.issued_at ?? 0),
        // INTEGRATION SEAM (normative): the ENGINE is authoritative for the
        // lifecycle flags -- revoked = engine status === 'revoked', activated =
        // engine activatedAt != null. Meta mirrors them (updated by every
        // mutation path) and only leads when the engine row is gone. The panel
        // validate route keeps zyqora's meta side effects, but the wire never
        // contradicts the engine.
        activated: engine ? engine.activatedAt != null : metaRow.activated === true,
        activatedAt: engine
            ? engine.activatedAt == null
                ? null
                : Math.floor(engine.activatedAt / 1000)
            : metaRow.activated_at == null
              ? null
              : Number(metaRow.activated_at),
        revoked: engine ? engine.status === 'revoked' : metaRow.revoked === true,
        revokedBy: metaRow.revoked_by == null ? null : String(metaRow.revoked_by),
        revokedByName: metaRow.revoked_by_name == null ? null : String(metaRow.revoked_by_name),
        revokedAt: metaRow.revoked_at == null ? null : Number(metaRow.revoked_at),
        revokedReason: metaRow.revoked_reason == null ? null : String(metaRow.revoked_reason),
        engine: toEngineBinding(
            engine ?? {
                keyHash: String(metaRow.key_hash ?? ''),
                keySealed: '',
                keyPrefix: String(metaRow.key_prefix ?? ''),
                planType: 'MONTH',
                durationDays: 0,
                status: 'revoked',
                createdAt: 0,
                activatedAt: null,
                expiresAt: null,
                maxDevices: 1,
                boundDeviceCodeHashes: [],
                note: '',
                createdBy: '',
            },
        ),
    };
    // Nullable columns are omitted from the JSON exactly where the zyqora
    // record simply lacks the key (JSON.stringify drops `undefined`).
    if (metaRow.plan_tier != null) rec.planTier = String(metaRow.plan_tier);
    if (metaRow.review_access != null) rec.reviewAccess = metaRow.review_access === true;
    if (metaRow.validation_exception != null) rec.validationException = metaRow.validation_exception === true;
    if (metaRow.exception_bound_machine_id != null) rec.exceptionBoundMachineId = String(metaRow.exception_bound_machine_id);
    if (metaRow.whitelabel_issued === true) rec.whitelabelIssued = true;
    if (metaRow.converted_from_key != null) rec.convertedFromKey = String(metaRow.converted_from_key);
    if (metaRow.source != null) rec.source = String(metaRow.source);
    if (metaRow.order_id != null) rec.orderId = String(metaRow.order_id);
    if (metaRow.cf_order_id != null) rec.cfOrderId = String(metaRow.cf_order_id);
    return rec;
}

/**
 * Full-record save (kv.set semantics). Optional fields are written explicitly
 * as NULL so a full save can clear them, while the READ mapper omits them
 * again -- tri-state parity with the JSON records.
 */
function toMetaRow(rec: PanelLicense): DbRow {
    return {
        key_hash: rec.engine.keyHash,
        key_prefix: keyPrefixOf(rec.key) || String(rec.engine.keyHash).slice(0, 9),
        plan: rec.plan,
        plan_tier: rec.planTier ?? null,
        device_limit: rec.deviceLimit,
        expiry_ts: rec.expiryTs,
        is_lifetime: rec.isLifetime,
        price: rec.price,
        discounted_price: rec.discountedPrice,
        discount_amount: rec.discountAmount,
        license_mode: rec.licenseMode,
        machine_id: rec.machineId,
        client_name: rec.clientName,
        client_phone: rec.clientPhone,
        client_email: rec.clientEmail,
        business_category: rec.businessCategory,
        website: rec.website,
        notes: rec.notes,
        features: rec.features ?? {},
        affiliate_id: rec.affiliateId,
        affiliate_name: rec.affiliateName,
        affiliate_commission_amount: rec.affiliateCommissionAmount,
        review_access: rec.reviewAccess ?? null,
        validation_exception: rec.validationException ?? null,
        exception_bound_machine_id: rec.exceptionBoundMachineId ?? null,
        whitelabel_issued: rec.whitelabelIssued === true ? true : null,
        whitelabel_name: rec.whitelabelName,
        issued_by: rec.issuedBy,
        issued_by_name: rec.issuedByName,
        issued_at: rec.issuedAt,
        activated: rec.activated,
        activated_at: rec.activatedAt,
        revoked: rec.revoked,
        revoked_by: rec.revokedBy,
        revoked_by_name: rec.revokedByName,
        revoked_at: rec.revokedAt,
        revoked_reason: rec.revokedReason,
        converted_from_key: rec.convertedFromKey ?? null,
        source: rec.source ?? null,
        order_id: rec.orderId ?? null,
        cf_order_id: rec.cfOrderId ?? null,
    };
}

async function joinEngineRows(metaRows: DbRow[]): Promise<PanelLicense[]> {
    const engineRows = await sbRows('/licenses?select=*');
    const byHash = new Map<string, DbRow>();
    for (const r of engineRows) byHash.set(String(r.key_hash ?? ''), r);
    return metaRows.map((m) => toPanelLicense(m, byHash.get(String(m.key_hash ?? '')) ?? null));
}

// ---------------------------------------------------------------------------
// accessors (license_meta + the engine `licenses` join)
// ---------------------------------------------------------------------------

/** Resolve user-typed key -> panel record (hashKey lookup; null when absent). */
export async function getPanelLicense(keyInput: string): Promise<PanelLicense | null> {
    let kh: string;
    try {
        kh = hashKey(keyInput);
    } catch {
        return null;
    }
    return getPanelLicenseByHash(kh);
}

export async function getPanelLicenseByHash(keyHash: string): Promise<PanelLicense | null> {
    const metaRows = await sbRows(`/license_meta?select=*&key_hash=eq.${eq(keyHash)}`);
    const meta = one(metaRows);
    if (!meta) return null;
    const engineRows = await sbRows(`/licenses?select=*&key_hash=eq.${eq(keyHash)}`);
    return toPanelLicense(meta, one(engineRows));
}

export async function listAllLicenses(): Promise<PanelLicense[]> {
    const metaRows = await sbRows('/license_meta?select=*&order=issued_at.desc');
    return joinEngineRows(metaRows);
}

export async function listAdminLicenses(adminId: string): Promise<PanelLicense[]> {
    const metaRows = await sbRows(
        `/license_meta?select=*&issued_by=eq.${eq(adminId)}&order=issued_at.desc`,
    );
    return joinEngineRows(metaRows);
}

export async function saveLicenseMeta(rec: PanelLicense): Promise<PanelLicense> {
    const res = await sb('POST', '/license_meta', toMetaRow(rec), {
        prefer: 'return=representation,resolution=merge-duplicates',
    });
    if (!res.ok) throw new Error('write failed');
    const rows: unknown = await res.json().catch(() => []);
    const row = Array.isArray(rows) ? ((rows as DbRow[])[0] ?? null) : null;
    if (!row) return rec;
    const engineRows = await sbRows(`/licenses?select=*&key_hash=eq.${eq(rec.engine.keyHash)}`);
    return toPanelLicense(row, one(engineRows));
}

export async function patchLicenseMeta(keyHash: string, patch: DbRow): Promise<void> {
    await sbWrite('PATCH', `/license_meta?key_hash=eq.${eq(keyHash)}`, patch);
}

/** The engine record itself (ms fields, LicenseRecord shape) -- what
 *  evaluateEntitlement consumes in the /api/licenses/validate parity check. */
export async function getEngineLicense(keyHash: string): Promise<LicenseRecord | null> {
    const rows = await sbRows(`/licenses?select=*&key_hash=eq.${eq(keyHash)}`);
    const row = one(rows);
    return row ? toLicenseRecord(row) : null;
}

/** Devices currently bound to a licence (device rows = "the licence's own
 *  devices" for evaluateEntitlement's boundDeviceCount/boundHwidHashes). */
export async function boundDeviceHashes(keyHash: string): Promise<string[]> {
    const rows = await sbRows(`/devices?select=device_code_hash&key_hash=eq.${eq(keyHash)}`);
    return rows.map((r) => String(r.device_code_hash ?? '')).filter(Boolean);
}

/** PATCH the engine `licenses` row (legacy /api/admin surface). */
export async function patchEngineLicense(keyHash: string, patch: DbRow): Promise<void> {
    await sbWrite('PATCH', `/licenses?key_hash=eq.${eq(keyHash)}`, patch);
}

// ---------------------------------------------------------------------------
// engine <-> meta sync (INTEGRATION SEAM, normative)
// ---------------------------------------------------------------------------
// The wire record has two lifecycle sources -- the engine row and
// license_meta -- and they MUST NOT drift, because the UI drives both the
// zyqora row-menu actions (/api/licenses/*) and the legacy engine actions
// (/api/admin/licenses/{keyHash}/{action}). EVERY mutation path calls the
// matching helper below so both sides always move together.

/** Meta side of a revoke (revokedAt/By/ByName + reason). */
export async function markMetaRevoked(
    keyHash: string,
    by: string,
    byName: string,
    reason: string,
): Promise<void> {
    await patchLicenseMeta(keyHash, {
        revoked: true,
        revoked_by: by,
        revoked_by_name: byName,
        revoked_at: Math.floor(Date.now() / 1000),
        revoked_reason: reason,
    });
}

/** Meta side of an unrevoke (clears the whole revoked* block). */
export async function clearMetaRevoked(keyHash: string): Promise<void> {
    await patchLicenseMeta(keyHash, {
        revoked: false,
        revoked_by: null,
        revoked_by_name: null,
        revoked_at: null,
        revoked_reason: null,
    });
}

/** Meta side of a legacy extend: license_meta.expiryTs += days*86400. */
export async function bumpMetaExpiry(keyHash: string, days: number): Promise<void> {
    const rows = await sbRows(`/license_meta?select=expiry_ts&key_hash=eq.${eq(keyHash)}`);
    const row = one(rows);
    if (!row) return; // admin-API-only licence: no commercial record to sync
    const current = Number(row.expiry_ts ?? 0);
    await patchLicenseMeta(keyHash, { expiry_ts: current + Math.trunc(days) * 86400 });
}

/** Meta side of a delete (the licence row itself). */
export async function deleteMetaRow(keyHash: string): Promise<void> {
    await sbWrite('DELETE', `/license_meta?key_hash=eq.${eq(keyHash)}`);
}

/** Meta side of a legacy max-devices: NONE -- meta.deviceLimit is the SOLD
 *  device count and deliberately stays untouched. */


/**
 * store.deleteLicense(): drop the licence record AND its bound devices (and
 * the engine row -- the AcceptPro licence ceases to exist everywhere).
 */
export async function deletePanelLicense(rec: PanelLicense): Promise<void> {
    const kh = rec.engine.keyHash;
    await sbWrite('DELETE', `/license_meta?key_hash=eq.${eq(kh)}`);
    await sbWrite('DELETE', `/licenses?key_hash=eq.${eq(kh)}`);
    await sbWrite('DELETE', `/devices?key_hash=eq.${eq(kh)}`);
}

/**
 * kv.countIssuedLicenses(): licences an account issued, counted against a
 * whitelabel quota. Deleted licences are gone; keys auto-revoked by a
 * trial->paid conversion are excluded so a conversion stays net-neutral.
 */
export async function countIssuedLicenses(adminId: string): Promise<number> {
    const rows = await sbRows(`/license_meta?select=*&issued_by=eq.${eq(adminId)}`);
    return rows
        .map((r) => toPanelLicense(r, null))
        .filter(
            (l) =>
                !(
                    l.revoked &&
                    typeof l.revokedReason === 'string' &&
                    l.revokedReason.startsWith('Converted to')
                ),
        ).length;
}

/** Raw row count for the admins list (kv `licenses:admin:{id}` set size --
 *  no conversion exclusion). */
export async function countIssuedLicenseRows(adminId: string): Promise<number> {
    const rows = await sbRows(`/license_meta?select=id&issued_by=eq.${eq(adminId)}`);
    return rows.length;
}

// ---------------------------------------------------------------------------
// the RA- mint (copied from api/admin/licenses/index.ts -- never reimplemented)
// ---------------------------------------------------------------------------

export interface MintOptions {
    planType: PlanType;
    durationDays: number;
    maxDevices: number;
    bound: string[]; // [hashDeviceCode(code)] for desktop/app, [] for cloud
    note: string;
    createdBy: string; // session sub, or 'system' for auto checkout
    /** ADMIN-PORT §2 collision-guard knobs (zyqora nudges expiryTs by 1s) */
    isLifetime: boolean;
    expiryTs: number;
}

export interface MintResult {
    key: string;
    engine: LicenseRecord;
    expiryTs: number;
}

/**
 * Mint one REAL AcceptPro licence through the `create_license` rpc: each key
 * goes through the security-definer SQL function (pgcrypto digest + unique
 * key_hash) and is sealed with sealKey(MASTER_SEAL_KEY, key) so `/reveal` can
 * unseal it later. 23505 (unique violation) -> mint a fresh key and retry,
 * nudging expiryTs by 1 second exactly like the zyqora same-second collision
 * guard (lifetime keys keep their fixed expiry and stay idempotent).
 */
export async function mintRaKey(opts: MintOptions): Promise<MintResult> {
    let expiryTs = opts.expiryTs;
    for (let tries = 0; ; tries++) {
        const key = generateKey();
        // p_key must be exactly the preimage of hashKey(): the normalized key
        // body. create_license computes key_hash = digest(p_key,'sha256') in
        // the database and the unique index rejects any duplicate.
        const out = await sbRpc('create_license', {
            p_key: normalizeKey(key),
            p_key_sealed: sealKey(masterSealKey(), key),
            p_key_prefix: keyPrefixOf(key),
            p_plan_type: opts.planType,
            p_duration_days: opts.durationDays,
            p_max_devices: opts.maxDevices,
            p_bound_device_code_hashes: opts.bound,
            p_note: opts.note,
            p_created_by: opts.createdBy,
        });
        if (out.ok && out.data && typeof out.data === 'object') {
            const rec = toLicenseRecord(out.data as DbRow);
            // defence in depth: the DB must hash exactly like the shared module
            if (rec.keyHash !== hashKey(key)) throw new Error('key hash mismatch');
            return { key, engine: rec, expiryTs };
        }
        if (out.code !== '23505' || tries >= 5) throw new Error('create failed');
        if (!opts.isLifetime) expiryTs += 1;
    }
}
