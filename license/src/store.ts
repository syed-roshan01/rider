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

interface Db {
    licenses: Record<string, LicenseRecord>;
    devices: Record<string, DeviceRecord>; // keyed by hwidHash
    audit: AuditEntry[];
    config: AppConfig;
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
}

/** Directory helper so callers do not repeat the layout. */
export function defaultPaths(root: string): { db: string; keys: string } {
    return { db: join(root, 'data', 'db.json'), keys: join(root, 'keys') };
}

export { formatKey, normalizeKey };
