/**
 * GET /api/affiliates/stats?affiliateId=   (super may target any affiliate)
 *   200 -> { affiliate: { id, name, username, commission }, stats, licenses,
 *            payments }
 *   403 -> { error: 'Forbidden' }
 *   404 -> { error: 'Affiliate not found' }
 *
 * affiliate|super only (an affiliate always sees itself). Money math is the
 * spec §4 aggregation in _lib/panelMath.affiliateStatsFor, verbatim.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../_lib/server.js';
import { requireAuth } from '../_lib/panel.js';
import { affiliateStatsFor } from '../_lib/panelMath.js';
import { listAllLicenses } from '../_lib/panelLicense.js';
import { getAffiliate, listAffiliatePayments } from '../_lib/panelStore.js';

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

        // Must be affiliate or super
        if (session.role !== 'affiliate' && session.role !== 'super') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        const targetId =
            session.role === 'super'
                ? (String(req.query.affiliateId ?? '') || session.sub)
                : session.sub;

        const [affiliate, allLicenses, payments] = await Promise.all([
            getAffiliate(targetId),
            listAllLicenses(),
            listAffiliatePayments(targetId),
        ]);

        if (!affiliate) {
            json(res, 404, { error: 'Affiliate not found' });
            return;
        }

        const nowTs = Math.floor(Date.now() / 1000);
        const { rows, stats } = affiliateStatsFor(allLicenses, payments, affiliate, targetId, nowTs);

        json(res, 200, {
            affiliate: {
                id: affiliate.id,
                name: affiliate.name,
                username: affiliate.username,
                commission: affiliate.commission,
            },
            stats,
            licenses: rows,
            payments,
        });
    } catch (e) {
        // never leak key material or internals
        console.error('affiliates stats error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
