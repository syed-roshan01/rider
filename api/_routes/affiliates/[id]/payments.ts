/**
 * GET /api/affiliates/{id}/payments
 *   200 -> { payments }   newest payout first
 *   403 -> { error: 'Forbidden' }
 *
 * Super/admin can view any affiliate's payments; an affiliate only their own.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../../../_lib/server.js';
import { requireAuth } from '../../../_lib/panel.js';
import { listAffiliatePayments } from '../../../_lib/panelStore.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'GET') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        const gate = requireAuth(req);
        if (gate.error) {
            json(res, gate.status, { error: gate.error });
            return;
        }
        const session = gate.session;

        const id = String(req.query.id ?? '');
        // Super, admin can view any affiliate's payments; affiliate can only view their own
        if (session.role === 'affiliate' && session.sub !== id) {
            json(res, 403, { error: 'Forbidden' });
            return;
        }
        if (session.role !== 'super' && session.role !== 'admin' && session.role !== 'affiliate') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        const payments = await listAffiliatePayments(id);
        json(res, 200, { payments });
    } catch (e) {
        // never leak key material or internals
        console.error('affiliate payments error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
