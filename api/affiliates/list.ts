/**
 * GET /api/affiliates/list
 *   200 -> [ { id, username, name, commission, active, createdBy,
 *              createdByName, createdAt } ]  sorted by display name
 *   403 -> { error: 'Forbidden' }   (affiliates/whitelabel may not call this)
 *
 * super|admin only.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../_lib/server.js';
import { requireAuth } from '../_lib/panel.js';
import { listAffiliates } from '../_lib/panelStore.js';

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

        // Affiliates themselves and whitelabel resellers cannot call this;
        // only admin/super
        if (session.role !== 'super' && session.role !== 'admin') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        const list = await listAffiliates();
        const result = list
            .map((a) => ({
                id: a.id,
                username: a.username,
                name: a.name,
                commission: a.commission,
                active: a.active,
                createdBy: a.createdBy,
                createdByName: a.createdByName,
                createdAt: a.createdAt,
            }))
            .sort((a, b) => a.name.localeCompare(b.name));

        json(res, 200, result);
    } catch (e) {
        // never leak key material or internals
        console.error('affiliates list error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
