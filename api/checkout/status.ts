/**
 * GET /api/checkout/status?order_id=
 *   200 -> { status: 'paid', key, planName, mode } | { status: 'failed' } |
 *          { status: 'pending' }
 *   404 -> { status: 'unknown' }
 *   429 -> { error: 'Too many requests' }
 *
 * PUBLIC: the /buy/success page polls this. Order ids are 96-bit random and
 * the key is only returned once the payment is confirmed. Also reconciles with
 * Cashfree (fulfilOrder), so delivery still works if a webhook is delayed or
 * missed. Rate limit spec §7: `status:{ip}` 120/600, fail-open.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../_lib/server.js';
import { allow, clientIp } from '../_lib/rateLimit.js';
import { fulfilOrder, getOrder } from '../_lib/checkout.js';
import { PLANS } from '../_lib/plans.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'GET') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        if (!(await allow(`status:${clientIp(req)}`, 120, 600))) {
            json(res, 429, { error: 'Too many requests' });
            return;
        }

        const orderId = String(req.query.order_id ?? '');
        const order = await getOrder(orderId);
        if (!order) {
            json(res, 404, { status: 'unknown' });
            return;
        }

        let result: { ok: boolean; key?: string; status?: string } = {
            ok: !!order.licenseKey,
            key: order.licenseKey ?? '',
        };
        if (!order.licenseKey) {
            try {
                result = await fulfilOrder(orderId);
            } catch {
                result = { ok: false };
            }
        }
        if (result.ok) {
            const plan = PLANS[order.planId];
            json(res, 200, { status: 'paid', key: result.key, planName: plan?.name, mode: order.mode });
            return;
        }
        const failed = result.status === 'EXPIRED' || result.status === 'TERMINATED';
        json(res, 200, { status: failed ? 'failed' : 'pending' });
    } catch (e) {
        // never leak key material or internals
        console.error('checkout status error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
