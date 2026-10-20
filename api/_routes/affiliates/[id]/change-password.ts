/**
 * POST /api/affiliates/{id}/change-password  { password }
 *   200 -> { success: true }
 *   400 -> { error: 'Password must be at least 6 characters' }
 *   404 -> { error: 'Affiliate not found' }
 *
 * SUPER only. Password stored as scrypt$<salthex>$<hashhex>.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { bodyOf, json } from '../../../_lib/server.js';
import { hashPassword, requireSuper } from '../../../_lib/panel.js';
import { getAffiliate, saveAffiliate } from '../../../_lib/panelStore.js';

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

        const affiliate = await getAffiliate(String(req.query.id ?? ''));
        if (!affiliate) {
            json(res, 404, { error: 'Affiliate not found' });
            return;
        }

        await saveAffiliate({ ...affiliate, passwordHash: hashPassword(password) });
        json(res, 200, { success: true });
    } catch (e) {
        // never leak key material or internals
        console.error('affiliate change-password error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
