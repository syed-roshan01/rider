/**
 * GET /api/stats
 *   200 -> { totalRevenueBasis, allWithdrawn, moneyLeft, totalRevenue,
 *            totalExpenses, affilCommission }
 *   403 -> { error: 'Forbidden' }
 *
 * Global financial summary for super + admin users (admins need it to see
 * their Balance Owed relative to the global revenue pool). Money math is
 * spec §4, verbatim in _lib/panelMath.globalStatsFor:
 *   totalRevenueBasis = totalRevenue - totalExpenses - affilCommission
 *   moneyLeft         = totalRevenueBasis - allWithdrawn
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../_lib/server.js';
import { requireAuth } from '../_lib/panel.js';
import { globalStatsFor } from '../_lib/panelMath.js';
import { listAllLicenses } from '../_lib/panelLicense.js';
import { listAffiliates, listAllExpenses, listAllWithdrawals } from '../_lib/panelStore.js';

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
        if (session.role !== 'super' && session.role !== 'admin') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        const [licenses, expenses, affiliates, withdrawals] = await Promise.all([
            listAllLicenses(),
            listAllExpenses(),
            listAffiliates(),
            listAllWithdrawals(),
        ]);

        json(res, 200, globalStatsFor(licenses, expenses, affiliates, withdrawals));
    } catch (e) {
        // never leak key material or internals
        console.error('stats error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
