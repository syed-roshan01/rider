/**
 * POST /api/affiliates/{id}/pay  { amount, note? }
 *   200 -> { success: true, payment }
 *   400 -> { error: 'Amount must be greater than 0' }
 *   403 -> { error: 'Forbidden' }
 *   404 -> { error: 'Affiliate not found' }
 *
 * super|admin only. Records a payout (`pay_<ms>_<rand>` id, note <= 200).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { bodyOf, json } from '../../../_lib/server.js';
import { requireAuth } from '../../../_lib/panel.js';
import { getAffiliate, savePayment } from '../../../_lib/panelStore.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
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

        const affiliate = await getAffiliate(String(req.query.id ?? ''));
        if (!affiliate) {
            json(res, 404, { error: 'Affiliate not found' });
            return;
        }

        const body = bodyOf(req);
        const amount = parseFloat(String(body.amount));
        if (!amount || amount <= 0) {
            json(res, 400, { error: 'Amount must be greater than 0' });
            return;
        }

        const payment = {
            id: `pay_${Date.now()}_${Math.random().toString(36).slice(2, 8)}`,
            affiliateId: affiliate.id,
            affiliateName: affiliate.name,
            amount,
            note: String(body.note || '').trim().slice(0, 200),
            paidBy: session.sub,
            paidByName: session.name || session.username || session.sub,
            paidAt: Math.floor(Date.now() / 1000),
        };

        await savePayment(payment);
        json(res, 200, { success: true, payment });
    } catch (e) {
        // never leak key material or internals
        console.error('affiliate pay error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
