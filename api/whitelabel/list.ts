/**
 * GET /api/whitelabel/list
 *   200 -> [ whitelabel records (no passwordHash) + usedLicenses +
 *            remainingLicenses ]  newest first
 *
 * SUPER only.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../_lib/server.js';
import { requireSuper } from '../_lib/panel.js';
import { countIssuedLicenses } from '../_lib/panelLicense.js';
import { listWhitelabels } from '../_lib/panelStore.js';

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

        const clients = await listWhitelabels();

        const result = await Promise.all(
            clients.map(async (c) => {
                const used = await countIssuedLicenses(c.id);
                const { passwordHash: _ignored, ...safe } = c;
                return { ...safe, usedLicenses: used, remainingLicenses: Math.max(0, (c.licenseLimit || 0) - used) };
            }),
        );

        // Newest first
        result.sort((a, b) => (b.createdAt || 0) - (a.createdAt || 0));
        json(res, 200, result);
    } catch (e) {
        // never leak key material or internals
        console.error('whitelabel list error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
