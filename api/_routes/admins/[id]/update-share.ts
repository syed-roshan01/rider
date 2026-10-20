/**
 * POST /api/admins/{id}/update-share  { sharePercent }
 *   200 -> { success: true, admin }
 *   400 -> { error: 'sharePercent must be 0–100' }   (EN DASH U+2013 -- byte-exact)
 *   404 -> { error: 'Admin not found' }
 *
 * SUPER only.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { bodyOf, json } from '../../../_lib/server.js';
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

        const admin = await getAdmin(String(req.query.id ?? ''));
        if (!admin) {
            json(res, 404, { error: 'Admin not found' });
            return;
        }

        const body = bodyOf(req);
        const sharePercent = parseFloat(String(body.sharePercent));

        if (!Number.isFinite(sharePercent) || sharePercent < 0 || sharePercent > 100) {
            json(res, 400, { error: 'sharePercent must be 0–100' });
            return;
        }

        const updated = { ...admin, sharePercent };
        await saveAdmin(updated);

        const { passwordHash: _ignored, ...safe } = updated;
        json(res, 200, { success: true, admin: safe });
    } catch (e) {
        // never leak key material or internals
        console.error('admin update-share error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
