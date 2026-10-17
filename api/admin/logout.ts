/**
 * POST /api/admin/logout  {} -> { ok:true }
 *
 * The session token is stateless (HMAC over its expiry), so signing out clears
 * the ra_admin cookie; the token itself simply ages out at its expiry.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { clearSessionCookie, json, requireAdmin } from '../_lib/server.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        if (!requireAdmin(req, res)) return;
        clearSessionCookie(res);
        json(res, 200, { ok: true });
    } catch (e) {
        console.error('admin logout error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
