/**
 * POST /api/affiliates/{id}/delete
 *   200 -> { success: true }
 *   404 -> { error: 'Affiliate not found' }
 *
 * SUPER only. The affiliate's attribution on issued licenses deliberately
 * stays -- deleting the partner must not erase sales history.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../../../_lib/server.js';
import { requireSuper } from '../../../_lib/panel.js';
import { deleteAffiliate, getAffiliate } from '../../../_lib/panelStore.js';

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

        const affiliate = await getAffiliate(String(req.query.id ?? ''));
        if (!affiliate) {
            json(res, 404, { error: 'Affiliate not found' });
            return;
        }

        await deleteAffiliate(affiliate);
        json(res, 200, { success: true });
    } catch (e) {
        // never leak key material or internals
        console.error('affiliate delete error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
