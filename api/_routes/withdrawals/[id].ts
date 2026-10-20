/**
 * PUT /api/withdrawals/{id}  { amount, note?, withdrawnAt? }
 *   200 -> { success: true, withdrawal }
 *   400 -> { error: 'Amount must be greater than 0' }
 *   403 -> { error: 'Forbidden' }    (super only, role-checked after auth)
 *   404 -> { error: 'Withdrawal not found' }
 *
 * note <= 300 chars.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { bodyOf, json } from '../../_lib/server.js';
import { requireAuth } from '../../_lib/panel.js';
import { getWithdrawal, saveWithdrawal, type WithdrawalRecord } from '../../_lib/panelStore.js';

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

        if (session.role !== 'super') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        const existing = await getWithdrawal(String(req.query.id ?? ''));
        if (!existing) {
            json(res, 404, { error: 'Withdrawal not found' });
            return;
        }

        const body = bodyOf(req);

        const amount = parseFloat(String(body.amount));
        if (!amount || amount <= 0) {
            json(res, 400, { error: 'Amount must be greater than 0' });
            return;
        }

        const updated: WithdrawalRecord = {
            ...existing,
            amount,
            note: String(body.note ?? existing.note ?? '').toString().trim().slice(0, 300),
            withdrawnAt: body.withdrawnAt ? Number(body.withdrawnAt) : existing.withdrawnAt,
            updatedAt: Math.floor(Date.now() / 1000),
            updatedBy: session.sub,
            updatedByName: session.name || session.username || session.sub,
        };

        await saveWithdrawal(updated);
        json(res, 200, { success: true, withdrawal: updated });
    } catch (e) {
        // never leak key material or internals
        console.error('withdrawal update error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
