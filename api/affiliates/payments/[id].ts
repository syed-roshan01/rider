/**
 * PUT /api/affiliates/payments/{id}  { amount, note?, paidAt? }
 *   200 -> { success: true, payment }
 *   400 -> { error: 'Amount must be greater than 0' }
 *   403 -> { error: 'Forbidden' }
 *   404 -> { error: 'Payment not found' }
 *
 * super|admin only. note trimmed to 200 chars.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { bodyOf, json } from '../../_lib/server.js';
import { requireAuth } from '../../_lib/panel.js';
import { getPayment, savePayment, type PaymentRecord } from '../../_lib/panelStore.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'PUT') {
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

        const existing = await getPayment(String(req.query.id ?? ''));
        if (!existing) {
            json(res, 404, { error: 'Payment not found' });
            return;
        }

        const body = bodyOf(req);

        const amount = parseFloat(String(body.amount));
        if (!amount || amount <= 0) {
            json(res, 400, { error: 'Amount must be greater than 0' });
            return;
        }

        const updated: PaymentRecord = {
            ...existing,
            amount,
            note: String(body.note ?? existing.note ?? '').toString().trim().slice(0, 200),
            paidAt: body.paidAt ? Number(body.paidAt) : existing.paidAt,
            updatedAt: Math.floor(Date.now() / 1000),
            updatedBy: session.sub,
            updatedByName: session.name || session.username || session.sub,
        };

        await savePayment(updated);
        json(res, 200, { success: true, payment: updated });
    } catch (e) {
        // never leak key material or internals
        console.error('payment update error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
