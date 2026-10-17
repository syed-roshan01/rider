/**
 * GET /api/admin/devices?keyHash=... -> rows (DeviceRecord[], newest first)
 * Bare array, matching store.devicesFor() and what app.js iterates.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json, requireAdmin, sbRows, toDeviceRecord } from '../../_lib/server.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'GET') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        if (!requireAdmin(req, res)) return;

        const keyHash = String(req.query.keyHash ?? '');
        const path = `/devices?select=*${
            keyHash ? `&key_hash=eq.${encodeURIComponent(keyHash)}` : ''
        }`;
        const rows = (await sbRows(path))
            .map(toDeviceRecord)
            .sort((a, b) => b.lastSeenAt - a.lastSeenAt);
        json(res, 200, rows);
    } catch (e) {
        console.error('admin devices error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
