/**
 * POST /api/affiliates/{id}/update-commission  { commission }
 *   200 -> { success: true, commission }
 *   400 -> { error: 'Commission must be 0–100' }   (EN DASH U+2013 -- byte-exact)
 *   404 -> { error: 'Affiliate not found' }
 *
 * SUPER only. Note the zyqora check order: the value is validated BEFORE the
 * affiliate is looked up.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { bodyOf, json } from '../../../_lib/server.js';
import { requireSuper } from '../../../_lib/panel.js';
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
        const commission = parseFloat(String(body.commission));
        if (!Number.isFinite(commission) || commission < 0 || commission > 100) {
            json(res, 400, { error: 'Commission must be 0–100' });
            return;
        }

        const affiliate = await getAffiliate(String(req.query.id ?? ''));
        if (!affiliate) {
            json(res, 404, { error: 'Affiliate not found' });
            return;
        }

        await saveAffiliate({ ...affiliate, commission });
        json(res, 200, { success: true, commission });
    } catch (e) {
        // never leak key material or internals
        console.error('affiliate update-commission error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
