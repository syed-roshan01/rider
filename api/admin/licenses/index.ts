/**
 * GET  /api/admin/licenses?q=&status=&limit=250 -> { total, rows }
 * POST /api/admin/licenses                       -> { ok:true, created:[{ key, record }] }
 *
 * Shapes are the store.ts contract: rows are LicenseRecord (camelCase) sorted
 * newest-first; created returns the plaintext key EXACTLY ONCE plus its record.
 *
 * Minting is race-safe: each key goes through the `create_license(...)` security
 * definer SQL function (pgcrypto digest + unique key_hash). The key is sealed
 * with sealKey(Buffer.from(MASTER_SEAL_KEY, 'base64'), key) into licenses.key_sealed
 * so `/reveal` can unseal it later. All crypto is imported from the single
 * source of truth, supabase/functions/_shared/license.ts -- never reimplemented.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import type { LicenseRecord, PlanType } from '../../../supabase/functions/_shared/license.ts';
import {
    generateKey,
    hashDeviceCode,
    hashKey,
    keyPrefixOf,
    normalizeKey,
    sealKey,
    PLAN_DAYS,
} from '../../../supabase/functions/_shared/license.ts';
import type { DbRow } from '../../_lib/server.ts';
import {
    audit,
    bodyOf,
    intParam,
    json,
    masterSealKey,
    requireAdmin,
    sbRpc,
    sbRows,
    toLicenseRecord,
} from '../../_lib/server.ts';

const asPlan = (v: unknown): PlanType =>
    v === 'DAY' || v === 'WEEK' || v === 'HALF_MONTH' || v === 'MONTH' || v === 'YEAR' ? v : 'MONTH';

// ---------------------------------------------------------------------------
// GET: store.listLicenses() semantics (filter, key-hash search, sort, page)
// ---------------------------------------------------------------------------

async function list(req: VercelRequest, res: VercelResponse): Promise<void> {
    const q = String(req.query.q ?? '');
    const status = String(req.query.status ?? '');
    const limit = Math.max(0, intParam(req.query.limit ?? 100, 100));
    const offset = Math.max(0, intParam(req.query.offset ?? 0, 0));

    const path = `/licenses?select=*${
        status ? `&status=eq.${encodeURIComponent(status)}` : ''
    }`;
    let records: LicenseRecord[] = (await sbRows(path)).map(toLicenseRecord);

    if (q) {
        const ql = q.toLowerCase();
        // support "paste the customer's key to find it": hash the query and
        // match keyHash (the plaintext is never stored)
        let qHash = '';
        try {
            qHash = hashKey(q);
        } catch {
            /* not key-shaped -- fall through to text search */
        }
        records = records.filter(
            (r) =>
                (qHash !== '' && r.keyHash === qHash) ||
                r.keyPrefix.toLowerCase().includes(ql) ||
                r.note.toLowerCase().includes(ql) ||
                r.createdBy.toLowerCase().includes(ql) ||
                r.planType.toLowerCase().includes(ql),
        );
    }

    records.sort((a, b) => b.createdAt - a.createdAt);
    const total = records.length;
    json(res, 200, { total, rows: records.slice(offset, offset + limit) });
}

// ---------------------------------------------------------------------------
// POST: store.createLicenses() semantics, sealed + race-safe in SQL
// ---------------------------------------------------------------------------

const MAX_CREATE = 3; // retries only on a (near-impossible) key-hash collision

async function create(req: VercelRequest, res: VercelResponse): Promise<void> {
    const b = bodyOf(req);
    const planType = asPlan(b.planType);
    const count = Math.max(1, Math.min(500, Number(b.count ?? 1) | 0));
    const days = Number(b.durationDays ?? NaN);
    const durationDays = Number.isFinite(days) ? days : PLAN_DAYS[planType];
    const deviceCodes = Array.isArray(b.deviceCodes) ? b.deviceCodes.map(String) : [];
    const bound = [...new Set(deviceCodes.map(hashDeviceCode).filter(Boolean))];
    const maxDevices = bound.length
        ? bound.length
        : b.maxDevices && Number.isFinite(Number(b.maxDevices))
          ? Number(b.maxDevices)
          : 1;
    const note = String(b.note ?? '');

    const created: { key: string; record: LicenseRecord }[] = [];
    for (let i = 0; i < count; i++) {
        let record: LicenseRecord | null = null;
        let key = '';
        for (let attempt = 1; attempt <= MAX_CREATE && !record; attempt++) {
            key = generateKey();
            // p_key must be exactly the preimage of hashKey(): the normalized
            // key body. create_license computes key_hash = digest(p_key,'sha256')
            // in the database and the unique index rejects any duplicate.
            const out = await sbRpc('create_license', {
                p_key: normalizeKey(key),
                p_key_sealed: sealKey(masterSealKey(), key),
                p_key_prefix: keyPrefixOf(key),
                p_plan_type: planType,
                p_duration_days: durationDays,
                p_max_devices: maxDevices,
                p_bound_device_code_hashes: bound,
                p_note: note,
                p_created_by: 'admin',
            });
            if (out.ok && out.data && typeof out.data === 'object') {
                const rec = toLicenseRecord(out.data as DbRow);
                // defence in depth: the DB must hash exactly like the shared module
                if (rec.keyHash !== hashKey(key)) throw new Error('key hash mismatch');
                record = rec;
            } else if (out.code !== '23505') {
                throw new Error('create failed');
            }
            // 23505 (unique violation) -> mint a fresh key and retry
        }
        if (!record) throw new Error('create failed');
        created.push({ key, record });
    }

    await audit(
        'admin',
        'license.create',
        `${count}x ${planType}${bound.length ? ` bound to ${bound.length} device(s)` : ''}`,
    );
    json(res, 200, { ok: true, created });
}

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    try {
        if (!requireAdmin(req, res)) return;
        if (req.method === 'GET') {
            await list(req, res);
            return;
        }
        if (req.method === 'POST') {
            await create(req, res);
            return;
        }
        json(res, 405, { error: 'method not allowed' });
    } catch (e) {
        // never leak key material or internals
        console.error('admin licenses error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
