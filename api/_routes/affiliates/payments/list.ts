/**
 * GET /api/affiliates/payments/list
 *   200 -> { payments }   (ALL affiliates, newest payout first)
 *   403 -> { error: 'Forbidden' }
 *
 * super|admin only.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../../../_lib/server.js';
import { requireAuth } from '../../../_lib/panel.js';
import { listAllPayments } from '../../../_lib/panelStore.js';

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

        if (session.role !== 'super' && session.role !== 'admin') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        const payments = await listAllPayments();
        json(res, 200, { payments });
    } catch (e) {
        // never leak key material or internals
        console.error('payments list error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
