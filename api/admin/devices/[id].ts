/**
 * DELETE /api/admin/devices/{id} -> { ok:boolean }
 *
 * id is the device code hash (hwidHash in app.js). Mirrors store.unbindDevice():
 * false when nothing is bound, otherwise free the device slot, audit the
 * unbind, and return true. The devices table is keyed by (device_code_hash,
 * key_hash), so every row for that device code is removed -- the device is
 * freed completely, exactly like the single store entry it replaces.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { audit, json, requireAdmin, sbRows, sbWrite } from '../../_lib/server.ts';

const ID_RE = /^[a-f0-9]{64}$/;

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'DELETE') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        if (!requireAdmin(req, res)) return;

        const id = String(req.query.id ?? '');
        if (!ID_RE.test(id)) {
            json(res, 404, { error: 'unknown admin endpoint' });
            return;
        }

        const rows = await sbRows(
            `/devices?select=key_hash&device_code_hash=eq.${id}`,
        );
        if (!rows.length) {
            json(res, 200, { ok: false });
            return;
        }

        let prefix = '?';
        const keyHash = String(rows[0].key_hash ?? '');
        if (keyHash) {
            const lic = await sbRows(`/licenses?select=key_prefix&key_hash=eq.${keyHash}`);
            prefix = String(lic[0]?.key_prefix ?? '?');
        }

        await sbWrite('DELETE', `/devices?device_code_hash=eq.${id}`);
        await audit('admin', 'device.unbind', `${prefix} ${id.slice(0, 12)}`);
        json(res, 200, { ok: true });
    } catch (e) {
        console.error('admin device unbind error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
