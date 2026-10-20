/**
 * GET /api/admins/list
 *   200 -> [ admin records (no passwordHash) + licenseCount ]  newest first
 *
 * SUPER only. licenseCount = licences issued by that admin (the kv
 * `licenses:admin:{id}` set semantics -- raw count, no conversion exclusion).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../../_lib/server.js';
import { requireSuper } from '../../_lib/panel.js';
import { countIssuedLicenseRows } from '../../_lib/panelLicense.js';
import { listAdmins } from '../../_lib/panelStore.js';

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

        const admins = await listAdmins();

        const result = await Promise.all(
            admins.map(async (a) => {
                const licenseCount = await countIssuedLicenseRows(a.id);
                const { passwordHash: _ignored, ...safe } = a;
                return { ...safe, licenseCount };
            }),
        );

        // Newest first
        result.sort((a, b) => (b.createdAt || 0) - (a.createdAt || 0));
        json(res, 200, result);
    } catch (e) {
        // never leak key material or internals
        console.error('admins list error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
