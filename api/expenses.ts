/**
 * /api/expenses  (GET / POST / PATCH on one file, switching on req.method)
 *   GET   -> [ expense rows ]   (super: all, admin: own)  newest spentAt first
 *   POST  -> 200 { success: true, expense }
 *   PATCH -> 200 { success: true, expense }
 *   400 -> { error: 'Expense title is required' | 'Amount must be greater than 0' |
 *              'Expense ID required' }
 *   403 -> { error: 'Forbidden' }
 *   404 -> { error: 'Expense not found' }
 *
 * Expenses are internal staff bookkeeping -- super and admin only. An admin
 * may only PATCH rows they spent. Edits keep the pre-edit values in
 * originalValues exactly like the JSON store.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { randomUUID } from 'node:crypto';
import { bodyOf, json } from './_lib/server.js';
import { requireAuth, type PanelSession } from './_lib/panel.js';
import {
    getExpense,
    listAdminExpenses,
    listAllExpenses,
    saveExpense,
    type ExpenseRecord,
} from './_lib/panelStore.js';

function toNum(v: unknown): number {
    const n = Number(v);
    return Number.isFinite(n) ? n : NaN;
}

async function gateStaff(req: VercelRequest, res: VercelResponse): Promise<PanelSession | null> {
    const gate = requireAuth(req);
    if (gate.error) {
        json(res, gate.status, { error: gate.error });
        return null;
    }
    // Expenses are internal staff bookkeeping -- super and admin only
    if (gate.session.role !== 'super' && gate.session.role !== 'admin') {
        json(res, 403, { error: 'Forbidden' });
        return null;
    }
    return gate.session;
}

async function get(req: VercelRequest, res: VercelResponse): Promise<void> {
    const session = await gateStaff(req, res);
    if (!session) return;

    const list = session.role === 'super'
        ? await listAllExpenses()
        : await listAdminExpenses(session.sub);

    const result = list
        .map((e) => ({
            id: e.id,
            title: e.title,
            amount: e.amount,
            category: e.category || '',
            location: e.location || '',
            notes: e.notes || '',
            spentBy: e.spentBy,
            spentByName: e.spentByName,
            spentAt: e.spentAt,
            createdAt: e.createdAt,
            editedAt: e.editedAt || null,
            editedBy: e.editedBy || null,
            editedByName: e.editedByName || null,
            originalValues: e.originalValues || null,
        }))
        .sort((a, b) => (b.spentAt || 0) - (a.spentAt || 0));

    json(res, 200, result);
}

async function post(req: VercelRequest, res: VercelResponse): Promise<void> {
    const session = await gateStaff(req, res);
    if (!session) return;

    const body = bodyOf(req);
    const title = String(body.title || '').trim();
    const category = String(body.category || '').trim();
    const location = String(body.location || '').trim();
    const notes = String(body.notes || '').trim();
    const amount = toNum(body.amount);
    const spentAt = toNum(body.spentAt) || Math.floor(Date.now() / 1000);

    if (!title) {
        json(res, 400, { error: 'Expense title is required' });
        return;
    }
    if (!Number.isFinite(amount) || amount <= 0) {
        json(res, 400, { error: 'Amount must be greater than 0' });
        return;
    }

    const expense: ExpenseRecord = {
        id: randomUUID(),
        title,
        amount,
        category,
        location,
        notes,
        spentBy: session.sub,
        spentByName: session.username,
        spentAt,
        createdAt: Math.floor(Date.now() / 1000),
    };

    await saveExpense(expense);
    json(res, 200, { success: true, expense });
}

async function patch(req: VercelRequest, res: VercelResponse): Promise<void> {
    const session = await gateStaff(req, res);
    if (!session) return;

    const body = bodyOf(req);
    const id = String(body.id || '').trim();
    if (!id) {
        json(res, 400, { error: 'Expense ID required' });
        return;
    }

    const existing = await getExpense(id);
    if (!existing) {
        json(res, 404, { error: 'Expense not found' });
        return;
    }

    if (session.role !== 'super' && existing.spentBy !== session.sub) {
        json(res, 403, { error: 'Forbidden' });
        return;
    }

    const title = String(body.title || '').trim();
    const category = String(body.category || '').trim();
    const location = String(body.location || '').trim();
    const notes = String(body.notes || '').trim();
    const amount = toNum(body.amount);
    const spentAt = toNum(body.spentAt) || existing.spentAt;

    if (!title) {
        json(res, 400, { error: 'Expense title is required' });
        return;
    }
    if (!Number.isFinite(amount) || amount <= 0) {
        json(res, 400, { error: 'Amount must be greater than 0' });
        return;
    }

    const originalValues = {
        title: existing.title,
        amount: existing.amount,
        category: existing.category || '',
        location: existing.location || '',
        notes: existing.notes || '',
        spentAt: existing.spentAt,
    };

    const updated: ExpenseRecord = {
        ...existing,
        title,
        amount,
        category,
        location,
        notes,
        spentAt,
        editedAt: Math.floor(Date.now() / 1000),
        editedBy: session.sub,
        editedByName: session.username,
        originalValues,
    };

    await saveExpense(updated);
    json(res, 200, { success: true, expense: updated });
}

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    try {
        if (req.method === 'GET') return await get(req, res);
        if (req.method === 'POST') return await post(req, res);
        if (req.method === 'PATCH') return await patch(req, res);
        json(res, 405, { error: 'method not allowed' });
    } catch (e) {
        // never leak key material or internals
        console.error('expenses error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
