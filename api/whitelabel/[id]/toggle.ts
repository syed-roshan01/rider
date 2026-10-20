/**
 * POST /api/whitelabel/{id}/toggle
 *   200 -> { success: true, active }
 *   404 -> { error: 'Whitelabel client not found' }
 *   500 -> { error: 'This client record is corrupted. Delete and re-create the client to fix it.' }
 *
 * SUPER only. Blocks the client from logging in and from generating new
 * licenses. Existing tokens are also rejected at generation time via the
 * active check.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../../_lib/server.js';
import { requireSuper } from '../../_lib/panel.js';
import { getWhitelabel, saveWhitelabel } from '../../_lib/panelStore.js';

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

        const id = String(req.query.id ?? '');
        const whitelabel = await getWhitelabel(id);
        if (!whitelabel) {
            json(res, 404, { error: 'Whitelabel client not found' });
            return;
        }
        if (whitelabel.id !== id || !whitelabel.username) {
            json(res, 500, { error: 'This client record is corrupted. Delete and re-create the client to fix it.' });
            return;
        }

        const updated = { ...whitelabel, active: !whitelabel.active };
        await saveWhitelabel(updated);
        json(res, 200, { success: true, active: updated.active });
    } catch (e) {
        // never leak key material or internals
        console.error('whitelabel toggle error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
