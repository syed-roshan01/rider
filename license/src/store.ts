/**
 * license/store.ts — persistence for the license system.
 *
 * A tiny JSON document store behind a repository interface. Swappable for
 * Firestore later: every method here maps 1:1 onto a Firestore collection
 * (licenses / devices / audit / config) so the move is mechanical.
 *
 * Secrets policy enforced here too: we never persist a plaintext key, only
 * keyHash (lookup) + keySealed (admin re-reveal).
 */
import { readFileSync, writeFileSync, mkdirSync, renameSync, existsSync } from 'node:fs';
import { dirname, join } from 'node:path';
import { randomUUID } from 'node:crypto';
import {
    hashKey,
    hashDeviceCode,
    keyPrefixOf,
    sealKey,
    unsealKey,
    formatKey,
    generateKey,
    normalizeKey,
    PLAN_DAYS,
    type LicenseRecord,
    type DeviceRecord,
    type PlanType,
    type LicenseStatus,
} from './core.ts';

export interface AuditEntry {
    id: string;
    at: number;
    actor: string; // 'admin:<name>' | 'device:<hwidPrefix>' | 'system'
    action: string;
    detail: string;
}

export interface AppConfig {
    maintenanceMode: boolean;
    maintenanceMessage: string;
    forceUpdateVersion: number;
    updateDownloadUrl: string;
    updatePageUrl: string;
    minAllowedFare: number;
    maxAllowedFare: number;
    versionBlocked: string[];
    dialogMessage: string;
    dialogButtonText: string;
}

export const DEFAULT_CONFIG: AppConfig = {
    maintenanceMode: false,
    maintenanceMessage: 'App is under maintenance. Please try again later.',
    forceUpdateVersion: 0,
    updateDownloadUrl: '',
    updatePageUrl: '',
    minAllowedFare: 10,
    maxAllowedFare: 5000,
    versionBlocked: [],
    dialogMessage: '',
    dialogButtonText: 'OK',
};

// ---------------------------------------------------------------------------
// Admin-panel collections (ADMIN-PORT.md §4). Records are camelCase and match
// the API wire shape 1:1; all zyqora timestamps on these records are unix
// SECONDS (engine records above keep their ms fields — convert at the wire
// boundary). Additive: existing collections/behaviour above are untouched.
// ---------------------------------------------------------------------------

export interface AdminUserRecord {
    id: string;
    username: string;
    passwordHash: string;
    role: 'super' | 'admin';
    createdBy: string | null;
    createdByName: string | null;
    createdAt: number;
    active: boolean;
    sharePercent?: number;
}

export interface WhitelabelRecord {
    id: string;
    username: string;
    name: string;
    passwordHash: string;
    phone: string;
    email: string;
    businessName: string;
    businessCategory: string;
    website: string;
    notes: string;
    allowedModes: string[];
    allowedPlans: string[];
    maxDevices: number;
    licenseLimit: number;
    partnershipStartTs: number | null;
    partnershipMonths: number | null;
    partnershipEndTs: number | null;
    active: boolean;
    createdBy: string | null;
    createdByName: string | null;
    createdAt: number;
    updatedAt?: number;
    updatedBy?: string;
    updatedByName?: string;
}

export interface AffiliateRecord {
    id: string;
    username: string;
    name: string;
    passwordHash: string;
    commission: number;
    active: boolean;
    createdBy: string | null;
    createdByName: string | null;
    createdAt: number;
}

export interface PaymentRecord {
    id: string; // `pay_…`
    affiliateId: string;
    affiliateName: string;
    amount: number;
    note: string; // ≤200
    paidBy: string;
    paidByName: string;
    paidAt: number;
    updatedAt?: number;
    updatedBy?: string;
    updatedByName?: string;
}

export interface ExpenseOriginalValues {
    title: string;
    amount: number;
    category: string;
    location: string;
    notes: string;
    spentAt: number;
}

export interface ExpenseRecord {
    id: string;
    title: string;
    amount: number;
    category: string;
    location: string;
    notes: string;
    spentBy: string;
    spentByName: string;
    spentAt: number;
    createdAt: number;
    editedAt?: number;
    editedBy?: string;
    editedByName?: string;
    originalValues?: ExpenseOriginalValues;
}

export interface WithdrawalRecord {
    id: string; // `wd_…`
    adminId: string;
    adminUsername: string;
    amount: number;
    note: string; // ≤300
    withdrawnAt: number;
    recordedBy: string;
    recordedByName: string;
    createdAt: number;
    updatedAt?: number;
    updatedBy?: string;
    updatedByName?: string;
}

/**
 * license_meta — keyed by keyHash; `key` holds the DISPLAY PREFIX (e.g.
 * "RA-7QK2M"). The plaintext RA- key is never persisted here: it is unsealed
 * from the engine record on demand (`unsealKey`) exactly like the
 * /api/admin/licenses/[keyHash]/reveal endpoint already does.
 */
export interface LicenseMetaRecord {
    keyHash: string;
    key: string;
    plan: string;
    planTier?: string | null;
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
    features: Record<string, boolean>;
    affiliateId: string | null;
    affiliateName: string | null;
    affiliateCommissionAmount: number | null;
    reviewAccess: boolean;
    validationException?: boolean;
    exceptionBoundMachineId?: string | null;
    whitelabelIssued?: boolean;
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
    convertedFromKey?: string | null;
    source?: string | null;
    orderId?: string | null;
    cfOrderId?: string | null;
}

/** checkout_orders — spec §2. TTL semantics via `expiresAt` (unix seconds). */
export interface CheckoutOrderRecord {
    orderId: string; // `AP` + 24 hex UPPER
    planId: string;
    mode: string;
    machineId: string;
    amount: number;
    status: string; // 'created' | 'paid' | 'amount_mismatch'
    customer: { name: string; phone: string; email: string };
    createdAt: number;
    /**
     * Wire-only: the plaintext RA- key is NEVER persisted (secrets policy,
     * header above) — `saveOrder` strips it and `getOrder` rehydrates it from
     * `licenseKeyHash` via unsealKey, mirroring api/_lib/checkout.revealOrderKey.
     */
    licenseKey?: string | null;
    /** Persisted keyHash of the fulfilled licence; null until fulfilled. */
    licenseKeyHash?: string | null;
    paidAt?: number | null;
    cfOrderId?: string | null;
    /**
     * DEV/TEST ONLY: set when the fake gateway (CHECKOUT_FAKE_GATEWAY=1)
     * auto-approved the mock payment. `fulfilOrder` trusts this local mark
     * instead of re-fetching Cashfree. Never written in production.
     */
    fakePaid?: boolean;
    /** DEV/TEST ONLY: locally recorded paid amount, for money-check testing. */
    fakePaidAmount?: number | null;
    /** internal TTL marker (unix seconds); absent = never expires */
    expiresAt?: number;
}

export interface PanelLogRecord {
    id: string;
    action: string;
    actorId: string;
    actorName: string;
    actorRole: string;
    ts: number;
    flag: string | null;
    meta: Record<string, unknown>;
}

export interface DemoSettings {
    enabled: boolean;
    updatedAt?: number;
    updatedBy?: string;
}

/** TTL of a checkout order / claim link, mirroring zyqora lib/checkout.js ORDER_TTL. */
export const ORDER_TTL_SEC = 60 * 60 * 24 * 90;
/** TTL of the `pending:{mode}:{machineId}` side key (zyqora create-order: 24h). */
export const PENDING_TTL_SEC = 60 * 60 * 24;
/** TTL of the `order:lock:{orderId}` fulfilment lock (zyqora fulfilOrder: 30s). */
export const ORDER_LOCK_TTL_SEC = 30;
/** panel_logs ring size (spec §7: max 1000 newest-first; GET returns 300). */
export const MAX_PANEL_LOGS = 1000;

interface PanelDb {
    adminUsers: Record<string, AdminUserRecord>;
    whitelabels: Record<string, WhitelabelRecord>;
    affiliates: Record<string, AffiliateRecord>;
    payments: Record<string, PaymentRecord>;
    withdrawals: Record<string, WithdrawalRecord>;
    expenses: Record<string, ExpenseRecord>;
    licenseMeta: Record<string, LicenseMetaRecord>; // keyed by keyHash
    orders: Record<string, CheckoutOrderRecord>;
    /** TTL side keys: `pending:{mode}:{machineId}` / `claim:{mode}:{machineId}` / `order:lock:{orderId}` */
    orderSideKeys: Record<string, { value: string; expiresAt: number }>;
    panelLogs: PanelLogRecord[]; // newest-first, max MAX_PANEL_LOGS
    panelSettings: { demo: DemoSettings };
    /** secondary indexes (the kv.js set mirrors) */
    panelIndexes: {
        licensesByIssuer: Record<string, string[]>; // issuerId -> keyHashes
        paymentsByAffiliate: Record<string, string[]>;
        expensesByAdmin: Record<string, string[]>;
        withdrawalsByAdmin: Record<string, string[]>;
    };
}

interface Db {
    licenses: Record<string, LicenseRecord>;
    devices: Record<string, DeviceRecord>; // keyed by hwidHash
    audit: AuditEntry[];
    config: AppConfig;
    // ── admin-suite collections (PanelDb), lazily initialized ──
    adminUsers: Record<string, AdminUserRecord>;
    whitelabels: Record<string, WhitelabelRecord>;
    affiliates: Record<string, AffiliateRecord>;
    payments: Record<string, PaymentRecord>;
    withdrawals: Record<string, WithdrawalRecord>;
    expenses: Record<string, ExpenseRecord>;
    licenseMeta: Record<string, LicenseMetaRecord>;
    orders: Record<string, CheckoutOrderRecord>;
    orderSideKeys: Record<string, { value: string; expiresAt: number }>;
    panelLogs: PanelLogRecord[];
    panelSettings: { demo: DemoSettings };
    panelIndexes: PanelDb['panelIndexes'];
}

export class Store {
    private db: Db;
    private readonly path: string;
    private readonly masterSecret: Buffer;

    constructor(path: string, masterSecret: Buffer) {
        this.path = path;
        this.masterSecret = masterSecret;
        if (existsSync(path)) {
            this.db = JSON.parse(readFileSync(path, 'utf8'));
            this.db.config = { ...DEFAULT_CONFIG, ...(this.db.config ?? {}) };
        } else {
            this.db = { licenses: {}, devices: {}, audit: [], config: { ...DEFAULT_CONFIG } };
            this.persist();
        }
        this.ensurePanelDb(); // additive: fill admin-panel collections lazily
    }

    /** Crash-safe write: write to a temp file then atomically rename over. */
    private persist(): void {
        mkdirSync(dirname(this.path), { recursive: true });
        const tmp = `${this.path}.${randomUUID()}.tmp`;
        writeFileSync(tmp, JSON.stringify(this.db, null, 2), 'utf8');
        renameSync(tmp, this.path);
    }

    // ---- audit -----------------------------------------------------------
    log(actor: string, action: string, detail: string): void {
        this.db.audit.unshift({ id: randomUUID(), at: Date.now(), actor, action, detail });
        if (this.db.audit.length > 5000) this.db.audit.length = 5000;
    }

    audit(limit = 200, offset = 0): AuditEntry[] {
        return this.db.audit.slice(offset, offset + limit);
    }

    // ---- config ----------------------------------------------------------
    getConfig(): AppConfig {
        return { ...this.db.config };
    }

    setConfig(actor: string, patch: Partial<AppConfig>): AppConfig {
        this.db.config = { ...this.db.config, ...patch };
        this.log(actor, 'config.update', JSON.stringify(patch));
        this.persist();
        return this.getConfig();
    }

    // ---- licenses --------------------------------------------------------

    /**
     * Mint one or more keys. The plaintext is returned ONCE for display/copy;
     * it is never stored. Persisted form is keyHash + a sealed copy.
     */
    createLicenses(
        actor: string,
        opts: {
            count: number;
            planType: PlanType;
            durationDays?: number;
            maxDevices?: number;
            /** device codes from the customer's login screen; the key is bound to these */
            deviceCodes?: string[];
            note?: string;
        },
    ): { key: string; record: LicenseRecord }[] {
        const count = Math.max(1, Math.min(500, opts.count | 0));
        const bound = [...new Set((opts.deviceCodes ?? []).map(hashDeviceCode).filter(Boolean))];
        const out: { key: string; record: LicenseRecord }[] = [];
        for (let i = 0; i < count; i++) {
            const key = generateKey();
            const kh = hashKey(key);
            const record: LicenseRecord = {
                keyHash: kh,
                keySealed: sealKey(this.masterSecret, key),
                keyPrefix: keyPrefixOf(key),
                planType: opts.planType,
                durationDays: opts.durationDays ?? PLAN_DAYS[opts.planType],
                status: 'unused',
                createdAt: Date.now(),
                activatedAt: null,
                expiresAt: null,
                // a pre-bound key is locked to exactly the codes it was minted for
                maxDevices: bound.length ? bound.length : (opts.maxDevices ?? 1),
                boundDeviceCodeHashes: bound,
                note: opts.note ?? '',
                createdBy: actor,
            };
            this.db.licenses[kh] = record;
            out.push({ key, record });
        }
        this.log(actor, 'license.create', `${count}x ${opts.planType}${bound.length ? ` bound to ${bound.length} device(s)` : ''}`);
        this.persist();
        return out;
    }

    getLicense(keyHash: string): LicenseRecord | null {
        return this.db.licenses[keyHash] ?? null;
    }

    /** Resolve user-typed key -> record. Throws LicenseError('UNKNOWN_KEY'). */
    findByKey(key: string): LicenseRecord | null {
        let kh: string;
        try {
            kh = hashKey(key);
        } catch {
            return null;
        }
        return this.getLicense(kh);
    }

    revealKey(keyHash: string): string {
        const rec = this.getLicense(keyHash);
        if (!rec) throw new Error('unknown key');
        return unsealKey(this.masterSecret, rec.keySealed);
    }

    listLicenses(opts: { status?: LicenseStatus; q?: string; limit?: number; offset?: number }): {
        rows: (LicenseRecord & { revealed?: string })[];
        total: number;
    } {
        let rows = Object.values(this.db.licenses);
        if (opts.status) rows = rows.filter((r) => r.status === opts.status);
        if (opts.q) {
            const q = opts.q.toLowerCase();
            // support "paste the customer's key to find it": we never store the
            // plaintext, but we can hash the query and match on keyHash
            let qHash = '';
            try {
                qHash = hashKey(opts.q);
            } catch {
                /* not key-shaped — fall through to text search */
            }
            rows = rows.filter(
                (r) =>
                    (qHash && r.keyHash === qHash) ||
                    r.keyPrefix.toLowerCase().includes(q) ||
                    r.note.toLowerCase().includes(q) ||
                    r.createdBy.toLowerCase().includes(q) ||
                    r.planType.toLowerCase().includes(q),
            );
        }
        rows.sort((a, b) => b.createdAt - a.createdAt);
        const total = rows.length;
        const offset = opts.offset ?? 0;
        return { rows: rows.slice(offset, offset + (opts.limit ?? 100)), total };
    }

    /** Extend an already-active license; keeps it usable and logs the change. */
    extend(actor: string, keyHash: string, days: number): LicenseRecord {
        const rec = this.getLicense(keyHash);
        if (!rec) throw new Error('unknown key');
        const base = rec.expiresAt && rec.expiresAt > Date.now() ? rec.expiresAt : Date.now();
        rec.expiresAt = base + days * 86_400_000;
        if (rec.status === 'unused') {
            // extending an unused key pre-loads its duration
            rec.durationDays += days;
        } else if (rec.status === 'expired') {
            rec.status = 'active';
        }
        this.log(actor, 'license.extend', `${rec.keyPrefix} +${days}d`);
        this.persist();
        return rec;
    }

    /**
     * Revoke: the single most important control. Sets status so every
     * subsequent validate/refresh fails, regardless of any held token.
     */
    revoke(actor: string, keyHash: string): LicenseRecord {
        const rec = this.getLicense(keyHash);
        if (!rec) throw new Error('unknown key');
        rec.status = 'revoked';
        this.log(actor, 'license.revoke', rec.keyPrefix);
        this.persist();
        return rec;
    }

    unrevoke(actor: string, keyHash: string): LicenseRecord {
        const rec = this.getLicense(keyHash);
        if (!rec) throw new Error('unknown key');
        if (rec.status === 'revoked') {
            rec.status = rec.expiresAt && rec.expiresAt > Date.now() ? 'active' : 'expired';
        }
        this.log(actor, 'license.unrevoke', rec.keyPrefix);
        this.persist();
        return rec;
    }

    setMaxDevices(actor: string, keyHash: string, maxDevices: number): LicenseRecord {
        const rec = this.getLicense(keyHash);
        if (!rec) throw new Error('unknown key');
        rec.maxDevices = Math.max(1, Math.min(10, maxDevices | 0));
        this.log(actor, 'license.maxDevices', `${rec.keyPrefix} -> ${rec.maxDevices}`);
        this.persist();
        return rec;
    }

    deleteLicense(actor: string, keyHash: string): void {
        const rec = this.getLicense(keyHash);
        if (!rec) throw new Error('unknown key');
        delete this.db.licenses[keyHash];
        for (const [h, d] of Object.entries(this.db.devices)) {
            if (d.keyHash === keyHash) delete this.db.devices[h];
        }
        this.log(actor, 'license.delete', rec.keyPrefix);
        this.persist();
    }

    // ---- devices ---------------------------------------------------------

    devicesFor(keyHash?: string): DeviceRecord[] {
        const all = Object.values(this.db.devices);
        return (keyHash ? all.filter((d) => d.keyHash === keyHash) : all).sort(
            (a, b) => b.lastSeenAt - a.lastSeenAt,
        );
    }

    boundHwids(keyHash: string): string[] {
        return Object.values(this.db.devices)
            .filter((d) => d.keyHash === keyHash)
            .map((d) => d.hwidHash);
    }

    bindDevice(rec: LicenseRecord, dev: Omit<DeviceRecord, 'activatedAt' | 'lastSeenAt'>): DeviceRecord {
        const existing = this.db.devices[dev.hwidHash];
        const full: DeviceRecord = {
            ...dev,
            activatedAt: existing?.activatedAt ?? Date.now(),
            lastSeenAt: Date.now(),
        };
        this.db.devices[dev.hwidHash] = full;
        this.persist();
        return full;
    }

    touchDevice(hwidHash: string, patch: Partial<DeviceRecord> = {}): void {
        const d = this.db.devices[hwidHash];
        if (!d) return;
        Object.assign(d, patch, { lastSeenAt: Date.now() });
        this.persist();
    }

    /** Free a device slot ("customer got a new phone"). */
    unbindDevice(actor: string, hwidHash: string): boolean {
        const d = this.db.devices[hwidHash];
        if (!d) return false;
        const rec = this.getLicense(d.keyHash);
        delete this.db.devices[hwidHash];
        this.log(actor, 'device.unbind', `${rec?.keyPrefix ?? '?'} ${hwidHash.slice(0, 12)}`);
        this.persist();
        return true;
    }

    // ---- stats -----------------------------------------------------------

    stats(): Record<string, number> {
        const now = Date.now();
        const all = Object.values(this.db.licenses);
        const byStatus: Record<string, number> = { unused: 0, active: 0, expired: 0, revoked: 0 };
        for (const r of all) {
            byStatus[r.status] = (byStatus[r.status] ?? 0) + 1;
            if (r.status === 'active' && r.expiresAt != null && r.expiresAt <= now) {
                byStatus.active--;
                byStatus.expired++;
            }
        }
        return {
            total: all.length,
            ...byStatus,
            devices: Object.keys(this.db.devices).length,
            expiringSoon: all.filter(
                (r) => r.status === 'active' && r.expiresAt != null && r.expiresAt > now && r.expiresAt < now + 7 * 86_400_000,
            ).length,
        };
    }

    // ---- activation (device-facing) --------------------------------------

    /**
     * Activate a key on a device. Enforces maxDevices at the store level so two
     * concurrent activations cannot both slip past the last free slot.
     */
    activate(
        key: string,
        dev: Omit<DeviceRecord, 'activatedAt' | 'lastSeenAt' | 'keyHash'>,
        deviceCode?: string,
    ): { ok: true; record: LicenseRecord; device: DeviceRecord } | { ok: false; reason: string } {
        const rec = this.findByKey(key);
        if (!rec) return { ok: false, reason: 'UNKNOWN_KEY' };
        if (rec.status === 'revoked') return { ok: false, reason: 'REVOKED' };

        // A key minted for specific device codes is bound to them from birth.
        // Any other device is refused before anything else is considered, so a
        // leaked key cannot even be activated anywhere else.
        const boundCodes = rec.boundDeviceCodeHashes ?? [];
        if (boundCodes.length) {
            const mine = deviceCode ? hashDeviceCode(deviceCode) : null;
            if (!mine || !boundCodes.includes(mine)) {
                this.log(`device:${dev.hwidHash.slice(0, 12)}`, 'activate.denied', `${rec.keyPrefix} DEVICE_MISMATCH`);
                this.persist();
                return { ok: false, reason: 'DEVICE_MISMATCH' };
            }
        }

        // An expired key must NOT be revived just by calling activate() again —
        // that would hand out an infinite free subscription. Only an admin
        // `extend` may open a new window.
        if (rec.status === 'expired') return { ok: false, reason: 'EXPIRED' };
        if (rec.status === 'active' && rec.expiresAt != null && rec.expiresAt <= Date.now()) {
            rec.status = 'expired';
            this.persist();
            return { ok: false, reason: 'EXPIRED' };
        }

        const alreadyBound = this.boundHwids(rec.keyHash).includes(dev.hwidHash);
        if (!alreadyBound && this.boundHwids(rec.keyHash).length >= rec.maxDevices) {
            this.log(`device:${dev.hwidHash.slice(0, 12)}`, 'activate.denied', `${rec.keyPrefix} DEVICE_LIMIT`);
            this.persist();
            return { ok: false, reason: 'DEVICE_LIMIT' };
        }

        const now = Date.now();
        if (rec.status === 'unused') {
            rec.status = 'active';
            rec.activatedAt = now;
            rec.expiresAt = now + rec.durationDays * 86_400_000;
        }
        this.bindDevice(rec, { ...dev, keyHash: rec.keyHash });
        this.log(`device:${dev.hwidHash.slice(0, 12)}`, 'activate.ok', rec.keyPrefix);
        this.persist();
        return { ok: true, record: rec, device: this.db.devices[dev.hwidHash] };
    }

    /** Roll an active license to 'expired' when its window has passed. */
    sweepExpired(): number {
        const now = Date.now();
        let n = 0;
        for (const r of Object.values(this.db.licenses)) {
            if (r.status === 'active' && r.expiresAt != null && r.expiresAt <= now) {
                r.status = 'expired';
                n++;
            }
        }
        if (n) this.persist();
        return n;
    }

    // =========================================================================
    // Admin-panel collections (ADMIN-PORT.md §4) — ADDITIVE. Existing methods
    // above are untouched; these only read/write the new collections. Records
    // are camelCase = the wire shape; timestamps are unix SECONDS.
    // =========================================================================

    /** Lazy init: fill the panel collections missing from a pre-panel db.json. */
    private ensurePanelDb(): void {
        const d = this.db;
        d.adminUsers ??= {};
        d.whitelabels ??= {};
        d.affiliates ??= {};
        d.payments ??= {};
        d.withdrawals ??= {};
        d.expenses ??= {};
        d.licenseMeta ??= {};
        d.orders ??= {};
        d.orderSideKeys ??= {};
        d.panelLogs ??= [];
        d.panelSettings ??= { demo: { enabled: true } };
        d.panelIndexes ??= {
            licensesByIssuer: {},
            paymentsByAffiliate: {},
            expensesByAdmin: {},
            withdrawalsByAdmin: {},
        };
    }

    private static idxAdd(map: Record<string, string[]>, k: string, id: string): void {
        if (!k) return;
        const list = (map[k] ??= []);
        if (!list.includes(id)) list.push(id);
    }

    private static idxRemove(map: Record<string, string[]>, k: string, id: string): void {
        const list = map[k];
        if (!list) return;
        const i = list.indexOf(id);
        if (i >= 0) list.splice(i, 1);
        if (!list.length) delete map[k];
    }

    // ---- admin users -------------------------------------------------------

    getAdminUser(id: string): AdminUserRecord | null {
        this.ensurePanelDb();
        return this.db.adminUsers[id] ?? null;
    }

    getAdminUserByUsername(username: string): AdminUserRecord | null {
        this.ensurePanelDb();
        const uname = String(username ?? '').toLowerCase();
        for (const a of Object.values(this.db.adminUsers)) {
            if (a.username.toLowerCase() === uname) return a;
        }
        return null;
    }

    saveAdminUser(admin: AdminUserRecord): void {
        this.ensurePanelDb();
        this.db.adminUsers[admin.id] = { ...admin };
        this.persist();
    }

    listAdminUsers(): AdminUserRecord[] {
        this.ensurePanelDb();
        return Object.values(this.db.adminUsers);
    }

    // ---- whitelabel clients ------------------------------------------------

    getWhitelabel(id: string): WhitelabelRecord | null {
        this.ensurePanelDb();
        return this.db.whitelabels[id] ?? null;
    }

    getWhitelabelByUsername(username: string): WhitelabelRecord | null {
        this.ensurePanelDb();
        const uname = String(username ?? '').toLowerCase();
        for (const w of Object.values(this.db.whitelabels)) {
            if (w.username.toLowerCase() === uname) return w;
        }
        return null;
    }

    /** Mirrors kv.js saveWhitelabel's corruption guard. */
    saveWhitelabel(whitelabel: WhitelabelRecord): void {
        this.ensurePanelDb();
        if (!whitelabel?.id || !whitelabel?.username)
            throw new Error('saveWhitelabel: record is missing id/username — refusing to write');
        this.db.whitelabels[whitelabel.id] = { ...whitelabel };
        this.persist();
    }

    /** Mirrors kv.js listWhitelabels' corruption filter. */
    listWhitelabels(): WhitelabelRecord[] {
        this.ensurePanelDb();
        return Object.values(this.db.whitelabels).filter((r) => r && typeof r === 'object' && r.id && r.username);
    }

    /**
     * Remove a whitelabel client account (record only — licences they issued
     * deliberately stay: deleting the reseller must not erase sales history).
     */
    deleteWhitelabel(whitelabel: { id?: string; username?: string }): void {
        this.ensurePanelDb();
        if (whitelabel?.id) delete this.db.whitelabels[whitelabel.id];
        this.persist();
    }

    // ---- affiliates --------------------------------------------------------

    getAffiliate(id: string): AffiliateRecord | null {
        this.ensurePanelDb();
        return this.db.affiliates[id] ?? null;
    }

    getAffiliateByUsername(username: string): AffiliateRecord | null {
        this.ensurePanelDb();
        const uname = String(username ?? '').toLowerCase();
        for (const a of Object.values(this.db.affiliates)) {
            if (a.username.toLowerCase() === uname) return a;
        }
        return null;
    }

    saveAffiliate(affiliate: AffiliateRecord): void {
        this.ensurePanelDb();
        this.db.affiliates[affiliate.id] = { ...affiliate };
        this.persist();
    }

    listAffiliates(): AffiliateRecord[] {
        this.ensurePanelDb();
        return Object.values(this.db.affiliates);
    }

    deleteAffiliate(affiliate: { id: string }): void {
        this.ensurePanelDb();
        delete this.db.affiliates[affiliate.id];
        this.persist();
    }

    // ---- cross-account lookups (one login endpoint: usernames are globally unique) --

    /** Lookup order admin → affiliate → whitelabel, mirroring zyqora auth/login. */
    findPanelAccount(
        username: string,
    ): { kind: 'admin'; record: AdminUserRecord } | { kind: 'affiliate'; record: AffiliateRecord } | { kind: 'whitelabel'; record: WhitelabelRecord } | null {
        const admin = this.getAdminUserByUsername(username);
        if (admin) return { kind: 'admin', record: admin };
        const affiliate = this.getAffiliateByUsername(username);
        if (affiliate) return { kind: 'affiliate', record: affiliate };
        const whitelabel = this.getWhitelabelByUsername(username);
        if (whitelabel) return { kind: 'whitelabel', record: whitelabel };
        return null;
    }

    /** Usernames are unique across adminUsers / affiliates / whitelabels. */
    usernameTaken(username: string): boolean {
        return !!(
            this.getAdminUserByUsername(username) ||
            this.getAffiliateByUsername(username) ||
            this.getWhitelabelByUsername(username)
        );
    }

    // ---- affiliate payments (payouts) --------------------------------------

    getPayment(id: string): PaymentRecord | null {
        this.ensurePanelDb();
        return this.db.payments[id] ?? null;
    }

    savePayment(payment: PaymentRecord): void {
        this.ensurePanelDb();
        const existing = this.db.payments[payment.id];
        if (existing) Store.idxRemove(this.db.panelIndexes.paymentsByAffiliate, existing.affiliateId, payment.id);
        this.db.payments[payment.id] = { ...payment };
        Store.idxAdd(this.db.panelIndexes.paymentsByAffiliate, payment.affiliateId, payment.id);
        this.persist();
    }

    /** kv.js parity: newest (paidAt) first. */
    listAffiliatePayments(affiliateId: string): PaymentRecord[] {
        this.ensurePanelDb();
        const ids = this.db.panelIndexes.paymentsByAffiliate[affiliateId] ?? [];
        return ids
            .map((id) => this.db.payments[id])
            .filter(Boolean)
            .sort((a, b) => (b.paidAt || 0) - (a.paidAt || 0));
    }

    /** kv.js parity: newest (paidAt) first. */
    listAllPayments(): PaymentRecord[] {
        this.ensurePanelDb();
        return Object.values(this.db.payments).sort((a, b) => (b.paidAt || 0) - (a.paidAt || 0));
    }

    // ---- admin withdrawals --------------------------------------------------

    getWithdrawal(id: string): WithdrawalRecord | null {
        this.ensurePanelDb();
        return this.db.withdrawals[id] ?? null;
    }

    saveWithdrawal(withdrawal: WithdrawalRecord): void {
        this.ensurePanelDb();
        const existing = this.db.withdrawals[withdrawal.id];
        if (existing) Store.idxRemove(this.db.panelIndexes.withdrawalsByAdmin, existing.adminId, withdrawal.id);
        this.db.withdrawals[withdrawal.id] = { ...withdrawal };
        Store.idxAdd(this.db.panelIndexes.withdrawalsByAdmin, withdrawal.adminId, withdrawal.id);
        this.persist();
    }

    /** kv.js parity: newest (withdrawnAt) first. */
    listAllWithdrawals(): WithdrawalRecord[] {
        this.ensurePanelDb();
        return Object.values(this.db.withdrawals).sort((a, b) => (b.withdrawnAt || 0) - (a.withdrawnAt || 0));
    }

    /** kv.js parity: newest (withdrawnAt) first. */
    listAdminWithdrawals(adminId: string): WithdrawalRecord[] {
        this.ensurePanelDb();
        const ids = this.db.panelIndexes.withdrawalsByAdmin[adminId] ?? [];
        return ids
            .map((id) => this.db.withdrawals[id])
            .filter(Boolean)
            .sort((a, b) => (b.withdrawnAt || 0) - (a.withdrawnAt || 0));
    }

    // ---- expenses ----------------------------------------------------------

    getExpense(id: string): ExpenseRecord | null {
        this.ensurePanelDb();
        return this.db.expenses[id] ?? null;
    }

    saveExpense(expense: ExpenseRecord): void {
        this.ensurePanelDb();
        const existing = this.db.expenses[expense.id];
        if (existing) Store.idxRemove(this.db.panelIndexes.expensesByAdmin, existing.spentBy, expense.id);
        this.db.expenses[expense.id] = { ...expense };
        Store.idxAdd(this.db.panelIndexes.expensesByAdmin, expense.spentBy, expense.id);
        this.persist();
    }

    listAllExpenses(): ExpenseRecord[] {
        this.ensurePanelDb();
        return Object.values(this.db.expenses);
    }

    listAdminExpenses(adminId: string): ExpenseRecord[] {
        this.ensurePanelDb();
        const ids = this.db.panelIndexes.expensesByAdmin[adminId] ?? [];
        return ids.map((id) => this.db.expenses[id]).filter(Boolean);
    }

    // ---- license_meta (keyed by keyHash) ------------------------------------

    getLicenseMeta(keyHash: string): LicenseMetaRecord | null {
        this.ensurePanelDb();
        return this.db.licenseMeta[keyHash] ?? null;
    }

    saveLicenseMeta(meta: LicenseMetaRecord): void {
        this.ensurePanelDb();
        const existing = this.db.licenseMeta[meta.keyHash];
        if (existing && existing.issuedBy !== meta.issuedBy) {
            Store.idxRemove(this.db.panelIndexes.licensesByIssuer, existing.issuedBy, meta.keyHash);
        }
        this.db.licenseMeta[meta.keyHash] = { ...meta };
        Store.idxAdd(this.db.panelIndexes.licensesByIssuer, meta.issuedBy, meta.keyHash);
        this.persist();
    }

    deleteLicenseMeta(keyHash: string): void {
        this.ensurePanelDb();
        const existing = this.db.licenseMeta[keyHash];
        if (existing) Store.idxRemove(this.db.panelIndexes.licensesByIssuer, existing.issuedBy, keyHash);
        delete this.db.licenseMeta[keyHash];
        this.persist();
    }

    /** Meta rows whose engine record still exists (orphans are invisible). */
    listAllLicenseMeta(): LicenseMetaRecord[] {
        this.ensurePanelDb();
        return Object.values(this.db.licenseMeta).filter((m) => !!this.db.licenses[m.keyHash]);
    }

    /** kv.js `licenses:admin:{id}` set mirror — the issuer's per-key set. */
    listIssuerLicenseMeta(issuerId: string): LicenseMetaRecord[] {
        this.ensurePanelDb();
        const ids = this.db.panelIndexes.licensesByIssuer[issuerId] ?? [];
        return ids
            .map((id) => this.db.licenseMeta[id])
            .filter((m): m is LicenseMetaRecord => !!m && !!this.db.licenses[m.keyHash]);
    }

    /**
     * kv.js countIssuedLicenses parity — number of licences an account has
     * issued, counted against a whitelabel quota. Deleted licences are already
     * absent; keys auto-revoked by a trial→paid conversion are excluded so a
     * conversion stays net-neutral against the quota.
     */
    countIssuedLicenses(issuerId: string): number {
        return this.listIssuerLicenseMeta(issuerId).filter(
            (l) => !(l.revoked && typeof l.revokedReason === 'string' && l.revokedReason.startsWith('Converted to')),
        ).length;
    }

    /**
     * license_meta for an ENGINE-ONLY record (minted through the legacy
     * /api/admin flow, no zyqora commercial fields). Synthesized from the
     * engine record — zero revenue, so it never perturbs sales/stats money.
     */
    synthLicenseMeta(rec: LicenseRecord): LicenseMetaRecord {
        const issuedAt = Math.floor(rec.createdAt / 1000);
        const expiryTs = rec.expiresAt != null ? Math.floor(rec.expiresAt / 1000) : issuedAt + rec.durationDays * 86400;
        return {
            keyHash: rec.keyHash,
            key: rec.keyPrefix,
            plan: rec.planType,
            planTier: null,
            deviceLimit: rec.maxDevices,
            expiryTs,
            isLifetime: rec.durationDays >= 36500,
            price: 0,
            discountedPrice: 0,
            discountAmount: 0,
            licenseMode: (rec.boundDeviceCodeHashes ?? []).length ? 'desktop' : 'cloud',
            machineId: null,
            clientName: '',
            clientPhone: '',
            clientEmail: '',
            businessCategory: '',
            website: '',
            notes: rec.note ?? '',
            features: {},
            affiliateId: null,
            affiliateName: null,
            affiliateCommissionAmount: null,
            reviewAccess: false,
            whitelabelName: null,
            issuedBy: rec.createdBy || 'system',
            issuedByName: rec.createdBy || 'system',
            issuedAt,
            activated: rec.activatedAt != null,
            activatedAt: rec.activatedAt != null ? Math.floor(rec.activatedAt / 1000) : null,
            revoked: rec.status === 'revoked',
            revokedBy: null,
            revokedByName: null,
            revokedAt: null,
            revokedReason: '',
            source: null,
            orderId: null,
            cfOrderId: null,
        };
    }

    /**
     * Integration seam: every mutation path syncs engine AND license_meta.
     * Returns the meta row for a keyHash, materializing (persisting) a
     * synthesized one for engine-only records so legacy mutations stay visible.
     */
    ensureLicenseMeta(keyHash: string): LicenseMetaRecord | null {
        const existing = this.getLicenseMeta(keyHash);
        if (existing) return existing;
        const rec = this.getLicense(keyHash);
        if (!rec) return null;
        const meta = this.synthLicenseMeta(rec);
        this.saveLicenseMeta(meta);
        return meta;
    }

    /**
     * The zyqora wire shape: meta (camelCase, unix-second timestamps) + the
     * unsealed plaintext key + the "AcceptPro binding" engine section.
     * Integration seam: `revoked`/`activated` come from the ENGINE (the app
     * validates against it — meta-only revocation must never leak through);
     * `expiryTs` stays the meta commercial display value.
     */
    licenseWire(meta: LicenseMetaRecord): Record<string, unknown> | null {
        const rec = this.getLicense(meta.keyHash);
        if (!rec) return null;
        return {
            ...meta,
            key: this.revealKey(meta.keyHash),
            revoked: rec.status === 'revoked',
            activated: rec.activatedAt != null,
            activatedAt: rec.activatedAt != null ? Math.floor(rec.activatedAt / 1000) : (meta.activatedAt ?? null),
            // "AcceptPro binding" detail section (ADMIN-PORT.md §2) — engine
            // lifecycle, times converted ms → unix SECONDS at the wire boundary.
            engine: {
                status: rec.status,
                planType: rec.planType,
                durationDays: rec.durationDays,
                createdAt: Math.floor(rec.createdAt / 1000),
                activatedAt: rec.activatedAt != null ? Math.floor(rec.activatedAt / 1000) : null,
                expiresAt: rec.expiresAt != null ? Math.floor(rec.expiresAt / 1000) : null,
                maxDevices: rec.maxDevices,
                boundDeviceCodeHashes: rec.boundDeviceCodeHashes ?? [],
            },
        };
    }

    /** Wire rows for every licence (meta-backed or engine-synthesized). */
    listWireLicenses(issuerId?: string): Record<string, unknown>[] {
        const metas = issuerId === undefined ? this.listAllLicenseMeta() : this.listIssuerLicenseMeta(issuerId);
        const seen = new Set(metas.map((m) => m.keyHash));
        const out: Record<string, unknown>[] = [];
        for (const m of metas) {
            const w = this.licenseWire(m);
            if (w) out.push(w);
        }
        // engine-only records (legacy /api/admin flow) still belong in the list
        for (const rec of Object.values(this.db.licenses)) {
            if (seen.has(rec.keyHash)) continue;
            if (issuerId !== undefined && rec.createdBy !== issuerId) continue;
            const w = this.licenseWire(this.synthLicenseMeta(rec));
            if (w) out.push(w);
        }
        out.sort((a, b) => (Number(b.issuedAt) || 0) - (Number(a.issuedAt) || 0));
        return out;
    }

    /** Legacy-extend seam: keep meta.expiryTs in step with the engine window. */
    shiftMetaExpiry(keyHash: string, deltaSec: number): LicenseMetaRecord | null {
        this.ensurePanelDb();
        const meta = this.db.licenseMeta[keyHash];
        if (!meta) return null;
        meta.expiryTs = meta.expiryTs + deltaSec;
        this.persist();
        return meta;
    }

    // ---- checkout orders + TTL side keys ------------------------------------

    /**
     * kv.js `order:{id}` with `{ ex: ORDER_TTL }` parity: every save refreshes
     * the TTL (unix seconds).
     */
    saveOrder(order: CheckoutOrderRecord, ttlSec: number = ORDER_TTL_SEC): void {
        this.ensurePanelDb();
        // Secrets policy: persist keyHash only — the plaintext `licenseKey` is
        // stripped here and rehydrated on read (see getOrder).
        const { licenseKey: _plaintext, ...rest } = order;
        const licenseKeyHash =
            order.licenseKeyHash ?? (order.licenseKey ? hashKey(order.licenseKey) : null);
        this.db.orders[order.orderId] = {
            ...rest,
            licenseKeyHash,
            expiresAt: Math.floor(Date.now() / 1000) + ttlSec,
        };
        this.persist();
    }

    getOrder(orderId: string): CheckoutOrderRecord | null {
        this.ensurePanelDb();
        const o = this.db.orders[orderId];
        if (!o) return null;
        if (o.expiresAt != null && o.expiresAt <= Math.floor(Date.now() / 1000)) {
            delete this.db.orders[orderId];
            return null;
        }
        const out = { ...o };
        // Rehydrate the wire key (never persisted) — parity with api/_lib/checkout
        // revealOrderKey: absent or unsealable resolves to null.
        if (out.licenseKey == null && out.licenseKeyHash) {
            try {
                out.licenseKey = this.revealKey(out.licenseKeyHash);
            } catch {
                out.licenseKey = null;
            }
        }
        return out;
    }

    /** TTL side keys: `pending:`/`claim:`/`order:lock:` (spec §2). */
    setSideKey(key: string, value: string, ttlSec: number): void {
        this.ensurePanelDb();
        this.db.orderSideKeys[key] = { value, expiresAt: Math.floor(Date.now() / 1000) + ttlSec };
        this.persist();
    }

    /** kv.set(key, 1, { nx: true, ex }) parity — set-if-absent with expiry. */
    setSideKeyNx(key: string, value: string, ttlSec: number): boolean {
        this.ensurePanelDb();
        this.sweepSideKeys();
        if (this.db.orderSideKeys[key]) return false;
        this.db.orderSideKeys[key] = { value, expiresAt: Math.floor(Date.now() / 1000) + ttlSec };
        this.persist();
        return true;
    }

    getSideKey(key: string): string | null {
        this.ensurePanelDb();
        this.sweepSideKeys();
        return this.db.orderSideKeys[key]?.value ?? null;
    }

    delSideKey(key: string): void {
        this.ensurePanelDb();
        delete this.db.orderSideKeys[key];
        this.persist();
    }

    private sweepSideKeys(): void {
        const now = Math.floor(Date.now() / 1000);
        for (const [k, v] of Object.entries(this.db.orderSideKeys)) {
            if (v.expiresAt <= now) delete this.db.orderSideKeys[k];
        }
    }

    // ---- panel_logs (max 1000, newest-first; GET returns 300) ---------------

    savePanelLog(log: PanelLogRecord): void {
        this.ensurePanelDb();
        this.db.panelLogs.unshift({ ...log, meta: { ...log.meta } });
        if (this.db.panelLogs.length > MAX_PANEL_LOGS) this.db.panelLogs.length = MAX_PANEL_LOGS;
        this.persist();
    }

    listPanelLogs(limit = 300): PanelLogRecord[] {
        this.ensurePanelDb();
        return this.db.panelLogs.slice(0, limit);
    }

    clearPanelLogs(): void {
        this.ensurePanelDb();
        this.db.panelLogs = [];
        this.persist();
    }

    // ---- panel_settings ----------------------------------------------------

    /** kv.js getDemoSettings parity: defaults to { enabled: true }. */
    getDemoSettings(): DemoSettings {
        this.ensurePanelDb();
        return { ...(this.db.panelSettings.demo ?? { enabled: true }) };
    }

    saveDemoSettings(settings: DemoSettings): DemoSettings {
        this.ensurePanelDb();
        this.db.panelSettings.demo = { ...settings };
        this.persist();
        return this.getDemoSettings();
    }
}

/** Directory helper so callers do not repeat the layout. */
export function defaultPaths(root: string): { db: string; keys: string } {
    return { db: join(root, 'data', 'db.json'), keys: join(root, 'keys') };
}

export { formatKey, normalizeKey };
