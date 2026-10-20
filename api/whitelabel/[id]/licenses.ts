/**
 * GET /api/whitelabel/{id}/licenses
 *   200 -> { whitelabel: { id, username, name, allowedModes, licenseLimit },
 *            usage: { used, limit, remaining }, licenses }   newest first
 *   404 -> { error: 'Whitelabel client not found' }
 *
 * SUPER only. Super-admin drill-down: every license a whitelabel client issued.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../../_lib/server.js';
import { requireSuper } from '../../_lib/panel.js';
import { countIssuedLicenses, listAdminLicenses } from '../../_lib/panelLicense.js';
import { getWhitelabel } from '../../_lib/panelStore.js';

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

        const id = String(req.query.id ?? '');
        const whitelabel = await getWhitelabel(id);
        if (!whitelabel) {
            json(res, 404, { error: 'Whitelabel client not found' });
            return;
        }

        const [licenses, used] = await Promise.all([
            listAdminLicenses(id),
            countIssuedLicenses(id),
        ]);
        licenses.sort((a, b) => (b.issuedAt || 0) - (a.issuedAt || 0));

        json(res, 200, {
            whitelabel: {
                id: whitelabel.id,
                username: whitelabel.username,
                name: whitelabel.name,
                allowedModes: whitelabel.allowedModes,
                licenseLimit: whitelabel.licenseLimit,
            },
            usage: { used, limit: whitelabel.licenseLimit, remaining: Math.max(0, (whitelabel.licenseLimit || 0) - used) },
            licenses,
        });
    } catch (e) {
        // never leak key material or internals
        console.error('whitelabel licenses error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
