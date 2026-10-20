/**
 * /api/withdrawals  (GET / POST)
 *   GET  -> [ withdrawal rows ]   (super: all, admin: own)  newest withdrawnAt first
 *   POST -> 201 { success: true, withdrawal }     (SUPER only)
 *   400 -> { error: 'adminId is required' | 'Amount must be greater than 0' }
 *   403 -> { error: 'Forbidden' }
 *   404 -> { error: 'Admin not found' }
 *
 * Owner/staff bookkeeping -- super and admin only (GET); only super records a
 * draw (POST). The admin's username is resolved server-side -- a
 * client-supplied name can be spoofed and would corrupt the ledger's audit
 * trail. note <= 300 chars.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { bodyOf, json } from './_lib/server.js';
import { requireAuth, requireSuper } from './_lib/panel.js';
import {
    getAdmin,
    listAdminWithdrawals,
    listAllWithdrawals,
    saveWithdrawal,
    type WithdrawalRecord,
} from './_lib/panelStore.js';

async function get(req: VercelRequest, res: VercelResponse): Promise<void> {
    const gate = requireAuth(req);
    if (gate.error) {
        json(res, gate.status, { error: gate.error });
        return;
    }
    const session = gate.session;

    // Owner/staff bookkeeping -- super and admin only
    if (session.role !== 'super' && session.role !== 'admin') {
        json(res, 403, { error: 'Forbidden' });
        return;
    }

    const list = session.role === 'super'
        ? await listAllWithdrawals()
        : await listAdminWithdrawals(session.sub);
    json(res, 200, list);
}

async function post(req: VercelRequest, res: VercelResponse): Promise<void> {
    const gate = requireSuper(req);
    if (gate.error) {
        json(res, gate.status, { error: gate.error });
        return;
    }
    const session = gate.session;

    const body = bodyOf(req);
    const adminId = String(body.adminId || '').trim();
    const amount = parseFloat(String(body.amount));
    const note = String(body.note || '').trim().slice(0, 300);
    const withdrawnAt = Number.isFinite(Number(body.withdrawnAt))
        ? Math.floor(Number(body.withdrawnAt))
        : Math.floor(Date.now() / 1000);

    if (!adminId) {
        json(res, 400, { error: 'adminId is required' });
        return;
    }
    if (!amount || amount <= 0) {
        json(res, 400, { error: 'Amount must be greater than 0' });
        return;
    }

    // Resolve the admin's username server-side
    const admin = await getAdmin(adminId);
    if (!admin) {
        json(res, 404, { error: 'Admin not found' });
        return;
    }

    const withdrawal: WithdrawalRecord = {
        id: `wd_${Date.now()}_${Math.random().toString(36).slice(2, 8)}`,
        adminId,
        adminUsername: admin.username,
        amount,
        note,
        withdrawnAt,
        recordedBy: session.sub,
        recordedByName: session.name || session.username || session.sub,
        createdAt: Math.floor(Date.now() / 1000),
    };

    await saveWithdrawal(withdrawal);
    json(res, 201, { success: true, withdrawal });
}

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    try {
        if (req.method === 'GET') return await get(req, res);
        if (req.method === 'POST') return await post(req, res);
        json(res, 405, { error: 'method not allowed' });
    } catch (e) {
        // never leak key material or internals
        console.error('withdrawals error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
