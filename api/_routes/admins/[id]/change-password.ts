/**
 * POST /api/admins/{id}/change-password  { password }
 *   200 -> { success: true }
 *   400 -> { error: 'Password must be at least 6 characters' }
 *   404 -> { error: 'Admin not found' }
 *
 * SUPER only. Password stored as scrypt$<salthex>$<hashhex>.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { bodyOf, json } from '../../../_lib/server.js';
import { hashPassword, requireSuper } from '../../../_lib/panel.js';
import { getAdmin, saveAdmin } from '../../../_lib/panelStore.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        const gate = requireSuper(req);
        if (gate.error) {
            json(res, gate.status, { error: gate.error });
            return;
        }

        const b = bodyOf(req);
        const password = b.password;
        if (!password || String(password).length < 6) {
            json(res, 400, { error: 'Password must be at least 6 characters' });
            return;
        }

        const admin = await getAdmin(String(req.query.id ?? ''));
        if (!admin) {
            json(res, 404, { error: 'Admin not found' });
            return;
        }

        await saveAdmin({ ...admin, passwordHash: hashPassword(String(password)) });
        json(res, 200, { success: true });
    } catch (e) {
        // never leak key material or internals
        console.error('admin change-password error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
