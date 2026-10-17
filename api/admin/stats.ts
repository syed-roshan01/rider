/**
 * GET /api/admin/stats -> store.stats() shape:
 *   { total, unused, active, expired, revoked, devices, expiringSoon }
 *
 * Semantics copied from store.stats(): an "active" licence whose window has
 * already passed counts as expired here (without rewriting the row), and
 * expiringSoon counts active licences dying within 7 days.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json, requireAdmin, sbRows, toMs } from '../_lib/server.ts';

const DAY_MS = 86_400_000;

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'GET') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        if (!requireAdmin(req, res)) return;

        const licenses = await sbRows('/licenses?select=status,expires_at');
        const devices = await sbRows('/devices?select=device_code_hash');
        const now = Date.now();

        const byStatus: Record<string, number> = { unused: 0, active: 0, expired: 0, revoked: 0 };
        for (const r of licenses) {
            const st = String(r.status ?? '');
            byStatus[st] = (byStatus[st] ?? 0) + 1;
            const expiresAt = r.expires_at == null ? null : toMs(r.expires_at);
            if (st === 'active' && expiresAt != null && expiresAt <= now) {
                byStatus.active -= 1;
                byStatus.expired += 1;
            }
        }

        const expiringSoon = licenses.filter((r) => {
            if (String(r.status ?? '') !== 'active' || r.expires_at == null) return false;
            const expiresAt = toMs(r.expires_at);
            return expiresAt > now && expiresAt < now + 7 * DAY_MS;
        }).length;

        json(res, 200, {
            total: licenses.length,
            ...byStatus,
            devices: devices.length,
            expiringSoon,
        });
    } catch (e) {
        console.error('admin stats error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
