/**
 * GET /api/licenses/list
 *   200 -> [ wire licence records ]  newest first
 *     super sees every licence; every other role only the ones they issued.
 *   401 -> { error: 'Unauthorized' }
 *
 * The `key` field is the plaintext RA- key unsealed on demand (same privilege
 * as /api/admin/licenses/{key}/reveal); the UI masks it as
 * key.slice(0,18) + '…'. `engine` is the additive AcceptPro binding section
 * (ADMIN-PORT §2).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../../_lib/server.js';
import { requireAuth } from '../../_lib/panel.js';
import { listAdminLicenses, listAllLicenses } from '../../_lib/panelLicense.js';

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

        const list = session.role === 'super'
            ? await listAllLicenses()
            : await listAdminLicenses(session.sub);

        // Newest first
        list.sort((a, b) => (b.issuedAt || 0) - (a.issuedAt || 0));
        json(res, 200, list);
    } catch (e) {
        // never leak key material or internals
        console.error('licenses list error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
