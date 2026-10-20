/**
 * GET /api/admins/{id}/licenses
 *   200 -> { admin: { id, username, role }, licenses }   newest first
 *   404 -> { error: 'Admin not found' }
 *
 * SUPER only. Every licence the admin issued (wire records, `key` unsealed on
 * demand exactly like /api/licenses/list).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../../../_lib/server.js';
import { requireSuper } from '../../../_lib/panel.js';
import { listAdminLicenses } from '../../../_lib/panelLicense.js';
import { getAdmin } from '../../../_lib/panelStore.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'GET') {
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

        const licenses = await listAdminLicenses(String(req.query.id ?? ''));
        licenses.sort((a, b) => (b.issuedAt || 0) - (a.issuedAt || 0));

        json(res, 200, {
            admin: { id: admin.id, username: admin.username, role: admin.role },
            licenses,
        });
    } catch (e) {
        // never leak key material or internals
        console.error('admin licenses error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
