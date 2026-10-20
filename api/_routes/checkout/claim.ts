/**
 * POST /api/checkout/claim  { machineId, mode }
 *   200 -> { found: true, key } | { found: false }
 *   400 -> { found: false }                (unparseable body)
 *   429 -> { found: false, error: 'Too many requests' }
 *
 * PUBLIC: the app asks "did this machine just buy a license?" after the
 * customer taps Buy. Safe by design: keys are cryptographically bound to the
 * device code at mint, so a key handed to the wrong party is useless on any
 * other device. Rate limit spec §7: `claim:{ip}` 120/3600, fail-open. Device
 * ID input per ADMIN-PORT §2.1 (invalid input -> { found: false }); the
 * `pending:` / `claim:` side keys use the BARE normalized 15-char form.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { strictBodyOf, json } from '../../_lib/server.js';
import { allow, clientIp } from '../../_lib/rateLimit.js';
import { deviceIdKey, isDeviceId } from '../../_lib/panelLicense.js';
import { getClaim, getPending } from '../../_lib/panelStore.js';
import { fulfilOrder, getOrder } from '../../_lib/checkout.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        if (!(await allow(`claim:${clientIp(req)}`, 120, 3600))) {
            json(res, 429, { found: false, error: 'Too many requests' });
            return;
        }

        let body;
        try {
            body = strictBodyOf(req);
        } catch {
            body = null;
        }
        if (!body) {
            json(res, 400, { found: false });
            return;
        }
        const machineIdInput = String(body.machineId || '');
        const mode = String(body.mode || 'desktop');
        if (!isDeviceId(machineIdInput) || !['desktop', 'app'].includes(mode)) {
            json(res, 200, { found: false });
            return;
        }
        const deviceId = deviceIdKey(machineIdInput);

        // 1) An order started from this device recently? Confirm it with Cashfree directly.
        const pendingId = await getPending(mode, deviceId);
        if (pendingId) {
            try {
                const r = await fulfilOrder(pendingId);
                if (r.ok) {
                    json(res, 200, { found: true, key: r.key });
                    return;
                }
            } catch {
                /* not paid yet -- fall through */
            }
        }

        // 2) Otherwise the most recent paid order for this device.
        const orderId = await getClaim(mode, deviceId);
        if (!orderId) {
            json(res, 200, { found: false });
            return;
        }
        const order = await getOrder(orderId);
        if (order?.licenseKey) {
            json(res, 200, { found: true, key: order.licenseKey });
            return;
        }
        json(res, 200, { found: false });
    } catch (e) {
        // never leak key material or internals
        console.error('checkout claim error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
