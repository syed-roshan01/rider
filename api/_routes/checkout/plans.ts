/**
 * GET /api/checkout/plans
 *   200 -> { plans, mode, enabled }     PUBLIC (the /buy page reads it)
 *
 * Plan cards from the verbatim catalog (_lib/plans.js).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../../_lib/server.js';
import { cashfreeConfigured, cashfreeMode } from '../../_lib/cashfree.js';
import { publicPlans } from '../../_lib/plans.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'GET') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        json(res, 200, { plans: publicPlans(), mode: cashfreeMode(), enabled: cashfreeConfigured() });
    } catch (e) {
        // never leak key material or internals
        console.error('checkout plans error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
