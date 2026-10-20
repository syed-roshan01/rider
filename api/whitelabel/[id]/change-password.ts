/**
 * POST /api/whitelabel/{id}/change-password  { password }
 *   200 -> { success: true }
 *   400 -> { error: 'Password must be at least 6 characters' }
 *   404 -> { error: 'Whitelabel client not found' }
 *   500 -> { error: 'This client record is corrupted. Delete and re-create the client to fix it.' }
 *
 * SUPER only. Password stored as scrypt$<salthex>$<hashhex>.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { bodyOf, json } from '../../_lib/server.js';
import { hashPassword, requireSuper } from '../../_lib/panel.js';
import { getWhitelabel, saveWhitelabel } from '../../_lib/panelStore.js';

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

        const body = bodyOf(req);
        const password = String(body.password || '').trim();
        if (!password || password.length < 6) {
            json(res, 400, { error: 'Password must be at least 6 characters' });
            return;
        }

        const id = String(req.query.id ?? '');
        const whitelabel = await getWhitelabel(id);
        if (!whitelabel) {
            json(res, 404, { error: 'Whitelabel client not found' });
            return;
        }
        if (whitelabel.id !== id || !whitelabel.username) {
            json(res, 500, { error: 'This client record is corrupted. Delete and re-create the client to fix it.' });
            return;
        }

        await saveWhitelabel({ ...whitelabel, passwordHash: hashPassword(password) });
        json(res, 200, { success: true });
    } catch (e) {
        // never leak key material or internals
        console.error('whitelabel change-password error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
