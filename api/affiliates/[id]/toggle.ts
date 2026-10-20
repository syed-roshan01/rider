/**
 * POST /api/affiliates/{id}/toggle
 *   200 -> { success: true, active }
 *   400 -> { error: 'Cannot deactivate yourself' }
 *   404 -> { error: 'Affiliate not found' }
 *
 * SUPER only.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../../_lib/server.js';
import { requireSuper } from '../../_lib/panel.js';
import { getAffiliate, saveAffiliate } from '../../_lib/panelStore.js';

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
        const session = gate.session;

        const affiliate = await getAffiliate(String(req.query.id ?? ''));
        if (!affiliate) {
            json(res, 404, { error: 'Affiliate not found' });
            return;
        }

        if (affiliate.id === session.sub) {
            json(res, 400, { error: 'Cannot deactivate yourself' });
            return;
        }

        const updated = { ...affiliate, active: !affiliate.active };
        await saveAffiliate(updated);
        json(res, 200, { success: true, active: updated.active });
    } catch (e) {
        // never leak key material or internals
        console.error('affiliate toggle error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
