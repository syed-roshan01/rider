/**
 * POST /api/admin/licenses/{keyHash}/{action}
 *   reveal     -> { key }                  (unsealKey; the plaintext, once)
 *   extend     -> store.extend() shape     (LicenseRecord; { days: 30 })
 *   revoke     -> store.revoke() shape     (LicenseRecord)
 *   unrevoke   -> store.unrevoke() shape   (LicenseRecord)
 *   delete     -> { ok:true }
 *   max-devices-> store.setMaxDevices() shape (LicenseRecord; { maxDevices })
 *
 * Each action mirrors the matching store.ts method field-for-field (including
 * the 400 { error: 'unknown key' } for a missing row). Crypto comes from
 * supabase/functions/_shared/license.ts -- never reimplemented here.
 *
 * INTEGRATION SEAM (normative): the wire licence record has two lifecycle
 * sources -- the engine row and license_meta -- and they must NOT drift,
 * because the UI drives both this legacy surface and /api/licenses/*. Every
 * lifecycle mutation here therefore syncs BOTH sides (extend bumps
 * license_meta.expiryTs, revoke/unrevoke flip the meta revoked* block, delete
 * drops the meta row). max-devices touches the ENGINE ONLY: meta.deviceLimit
 * is the SOLD device count and deliberately stays untouched. Audit action
 * strings match license/src/store.ts exactly ('license.maxDevices', ...).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { unsealKey, type LicenseRecord } from '../../../../../supabase/functions/_shared/license.js';
import type { DbRow } from '../../../../_lib/server.js';
import {
    audit,
    bodyOf,
    json,
    masterSealKey,
    requireAdmin,
    sbRows,
    sbWrite,
    toLicenseRecord,
} from '../../../../_lib/server.js';
import {
    bumpMetaExpiry,
    clearMetaRevoked,
    deleteMetaRow,
    markMetaRevoked,
} from '../../../../_lib/panelLicense.js';

const KEY_RE = /^[a-f0-9]{64}$/;
const DAY_MS = 86_400_000;
const ACTIONS = ['reveal', 'extend', 'revoke', 'unrevoke', 'delete', 'max-devices'];

async function findRow(keyHash: string): Promise<DbRow | null> {
    const rows = await sbRows(`/licenses?select=*&key_hash=eq.${keyHash}`);
    return rows[0] ?? null;
}

/** store.extend(): extend from max(expiresAt, now); unused pre-loads duration. */
async function extend(keyHash: string, row: DbRow, req: VercelRequest, res: VercelResponse): Promise<void> {
    const b = bodyOf(req);
    const days = Number(b.days ?? 30);
    const d = Number.isFinite(days) ? days : 30;
    const rec: LicenseRecord = toLicenseRecord(row);
    const base = rec.expiresAt && rec.expiresAt > Date.now() ? rec.expiresAt : Date.now();
    const patch: DbRow = { expires_at: new Date(base + d * DAY_MS).toISOString() };
    if (rec.status === 'unused') {
        patch.duration_days = rec.durationDays + d;
    } else if (rec.status === 'expired') {
        patch.status = 'active';
    }
    const updated = await sbWrite('PATCH', `/licenses?key_hash=eq.${keyHash}`, patch);
    await audit('admin', 'license.extend', `${rec.keyPrefix} +${d}d`);
    // INTEGRATION SEAM: keep the commercial "Valid until" (license_meta.expiryTs)
    // in step with the engine window.
    await bumpMetaExpiry(keyHash, d);
    json(res, 200, toLicenseRecord(updated[0] ?? { ...row, ...patch }));
}

/** store.setMaxDevices(): clamp 1..10 -- engine only (meta.deviceLimit stays). */
async function setMaxDevices(keyHash: string, row: DbRow, req: VercelRequest, res: VercelResponse): Promise<void> {
    const b = bodyOf(req);
    const maxDevices = Math.max(1, Math.min(10, Number(b.maxDevices ?? 1) | 0));
    const patch: DbRow = { max_devices: maxDevices };
    const updated = await sbWrite('PATCH', `/licenses?key_hash=eq.${keyHash}`, patch);
    const rec = toLicenseRecord(row);
    await audit('admin', 'license.maxDevices', `${rec.keyPrefix} -> ${maxDevices}`);
    json(res, 200, toLicenseRecord(updated[0] ?? { ...row, ...patch }));
}

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        if (!requireAdmin(req, res)) return;

        const keyHash = String(req.query.key ?? '');
        const action = String(req.query.action ?? '');
        if (!KEY_RE.test(keyHash)) {
            json(res, 404, { error: 'unknown admin endpoint' });
            return;
        }
        if (!ACTIONS.includes(action)) {
            json(res, 404, { error: 'unknown action' });
            return;
        }

        const row = await findRow(keyHash);
        if (!row) {
            json(res, 400, { error: 'unknown key' });
            return;
        }
        const rec = toLicenseRecord(row);

        switch (action) {
            case 'reveal': {
                // reveal must actually work: created keys are sealed at mint.
                const sealed = String(row.key_sealed ?? '');
                if (!sealed) {
                    json(res, 400, { error: 'key is not sealed' });
                    return;
                }
                let key: string;
                try {
                    key = unsealKey(masterSealKey(), sealed);
                } catch {
                    json(res, 400, { error: 'unable to reveal key' });
                    return;
                }
                json(res, 200, { key });
                return;
            }

            case 'extend':
                await extend(keyHash, row, req, res);
                return;

            case 'max-devices':
                await setMaxDevices(keyHash, row, req, res);
                return;

            case 'revoke': {
                // the single most important control: every subsequent
                // validate/refresh fails regardless of any held token
                const updated = await sbWrite('PATCH', `/licenses?key_hash=eq.${keyHash}`, {
                    status: 'revoked',
                });
                await audit('admin', 'license.revoke', rec.keyPrefix);
                // INTEGRATION SEAM: meta mirrors the engine lifecycle (reason '')
                await markMetaRevoked(keyHash, 'admin', 'admin', '');
                json(res, 200, toLicenseRecord(updated[0] ?? { ...row, status: 'revoked' }));
                return;
            }

            case 'unrevoke': {
                const patch: DbRow = {};
                if (rec.status === 'revoked') {
                    patch.status =
                        rec.expiresAt && rec.expiresAt > Date.now() ? 'active' : 'expired';
                }
                const updated = Object.keys(patch).length
                    ? await sbWrite('PATCH', `/licenses?key_hash=eq.${keyHash}`, patch)
                    : [];
                await audit('admin', 'license.unrevoke', rec.keyPrefix);
                // INTEGRATION SEAM: clear the meta revoked* block
                await clearMetaRevoked(keyHash);
                json(res, 200, toLicenseRecord(updated[0] ?? { ...row, ...patch }));
                return;
            }

            case 'delete': {
                // store.deleteLicense(): drop the licence AND its bound devices
                await sbWrite('DELETE', `/licenses?key_hash=eq.${keyHash}`);
                await sbWrite('DELETE', `/devices?key_hash=eq.${keyHash}`);
                await audit('admin', 'license.delete', rec.keyPrefix);
                // INTEGRATION SEAM: the commercial record dies with the engine row
                await deleteMetaRow(keyHash);
                json(res, 200, { ok: true });
                return;
            }
        }
    } catch (e) {
        // never leak key material or internals
        console.error('admin license action error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
