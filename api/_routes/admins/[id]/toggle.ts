/**
 * POST /api/admins/{id}/toggle
 *   200 -> { success: true, active }
 *   400 -> { error: 'Cannot deactivate your own account' }
 *   404 -> { error: 'Admin not found' }
 *
 * SUPER only.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../../../_lib/server.js';
import { requireSuper } from '../../../_lib/panel.js';
import { getAdmin, saveAdmin } from '../../../_lib/panelStore.js';

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

        const admin = await getAdmin(String(req.query.id ?? ''));
        if (!admin) {
            json(res, 404, { error: 'Admin not found' });
            return;
        }

        if (admin.id === session.sub) {
            json(res, 400, { error: 'Cannot deactivate your own account' });
            return;
        }

        const updated = { ...admin, active: !admin.active };
        await saveAdmin(updated);
        json(res, 200, { success: true, active: updated.active });
    } catch (e) {
        // never leak key material or internals
        console.error('admin toggle error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
