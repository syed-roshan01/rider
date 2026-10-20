/**
 * POST /api/checkout/create-order
 *   { planId, mode, machineId, name, phone, email }
 *   200 -> { orderId, paymentSessionId, mode }
 *   400 -> { error: 'Invalid request' | 'Choose a plan' | 'Invalid license type' |
 *              'Enter your 15-character Device ID exactly as shown in the app' |
 *              'Enter your name' | 'Enter a valid phone number with country code' |
 *              'Enter a valid email' }
 *   429 -> { error: 'Too many attempts. Please try again later.' }
 *   502 -> { error: 'Could not start the payment. Please try again.' }
 *   503 -> { error: 'Online payment is not available right now. Please contact support.' }
 *
 * PUBLIC (the /buy page). Creates the Cashfree order; the license itself is
 * only issued later, after Cashfree confirms the payment. Rate limit spec §7:
 * `order:{ip}` 15/3600, fail-open. "Machine ID" = the app's Device ID
 * (ADMIN-PORT §2.1): normalizeDeviceCode + 15 Crockford chars; the side key
 * `pending:{mode}:{deviceId}` uses the BARE normalized form so the in-app
 * claim is hyphenation-insensitive. Cashfree note is branded
 * `AcceptPro <planName> (1 year)` (ADMIN-PORT §1).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json, strictBodyOf, type DbRow } from '../_lib/server.js';
import { allow, clientIp } from '../_lib/rateLimit.js';
import { createCashfreeOrder, cashfreeConfigured, cashfreeMode } from '../_lib/cashfree.js';
import {
    deviceIdDisplay,
    deviceIdKey,
    isDeviceId,
} from '../_lib/panelLicense.js';
import { setPending, type CheckoutOrder } from '../_lib/panelStore.js';
import { PLANS } from '../_lib/plans.js';
import { isSellableMode, newOrderId, saveOrder } from '../_lib/checkout.js';

/** PUBLIC_BASE_URL, else reconstructed from the proxy headers / URL. */
function requestOrigin(req: VercelRequest): string {
    try {
        const u = new URL(req.url ?? '');
        if (u.origin && u.origin !== 'null') return u.origin;
    } catch {
        /* path-only url -- fall through to headers */
    }
    const proto = String(req.headers['x-forwarded-proto'] ?? '').split(',')[0].trim() || 'https';
    const host = String(req.headers['x-forwarded-host'] ?? req.headers.host ?? '').split(',')[0].trim();
    return host ? `${proto}://${host}` : '';
}

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        if (!cashfreeConfigured()) {
            json(res, 503, { error: 'Online payment is not available right now. Please contact support.' });
            return;
        }

        if (!(await allow(`order:${clientIp(req)}`, 15, 3600))) {
            json(res, 429, { error: 'Too many attempts. Please try again later.' });
            return;
        }

        let body: DbRow | null;
        try {
            body = strictBodyOf(req);
        } catch {
            body = null;
        }
        if (!body) {
            json(res, 400, { error: 'Invalid request' });
            return;
        }

        const planId = String(body.planId || '');
        const mode = String(body.mode || 'desktop');
        const machineIdInput = String(body.machineId || '');
        const name = String(body.name || '').trim().slice(0, 80);
        const phone = String(body.phone || '').replace(/\D/g, '');
        const email = String(body.email || '').trim().slice(0, 120);

        const plan = PLANS[planId];
        if (!plan) { json(res, 400, { error: 'Choose a plan' }); return; }
        if (!isSellableMode(mode)) { json(res, 400, { error: 'Invalid license type' }); return; }
        // ADMIN-PORT §2.1: Device ID = 15 Crockford chars after normalization.
        // (zyqora's 16-hex MACHINE_ID_RE is NOT ported; this message is the
        // sanctioned §2.1 wording.)
        if (!isDeviceId(machineIdInput)) {
            json(res, 400, { error: 'Enter your 15-character Device ID exactly as shown in the app' });
            return;
        }
        if (name.length < 2) { json(res, 400, { error: 'Enter your name' }); return; }
        if (phone.length < 10 || phone.length > 15) {
            json(res, 400, { error: 'Enter a valid phone number with country code' });
            return;
        }
        if (!/^[^@\s]+@[^@\s]+\.[^@\s]+$/.test(email)) {
            json(res, 400, { error: 'Enter a valid email' });
            return;
        }

        const base = process.env.PUBLIC_BASE_URL || requestOrigin(req);
        const orderId = newOrderId();
        try {
            const cf = await createCashfreeOrder({
                orderId,
                amount: plan.price,
                customer: { id: `C${phone}`.slice(0, 50), name, phone: phone.slice(-10), email },
                returnUrl: `${base}/buy/success?order_id={order_id}`,
                notifyUrl: `${base}/api/checkout/webhook`,
                note: `AcceptPro ${plan.name} (1 year)`,
            });
            const order: CheckoutOrder = {
                orderId,
                planId,
                mode,
                machineId: deviceIdDisplay(machineIdInput),
                amount: plan.price,
                status: 'created',
                customer: { name, phone, email },
                createdAt: Math.floor(Date.now() / 1000),
                paidAt: null,
                licenseKey: null,
                licenseKeyHash: null,
                expiresAt: 0, // set by saveOrder (90d TTL, refreshed per save)
            };
            await saveOrder(order);
            // Latest order started from this device: lets the app's claim check
            // confirm the payment itself even if the browser is closed and the
            // webhook is slow. Side key uses the BARE normalized device id.
            await setPending(mode, deviceIdKey(machineIdInput), orderId);
            json(res, 200, { orderId, paymentSessionId: cf.payment_session_id, mode: cashfreeMode() });
        } catch (e) {
            console.error('create-order failed:', (e as Error).message);
            json(res, 502, { error: 'Could not start the payment. Please try again.' });
        }
    } catch (e) {
        // never leak key material or internals
        console.error('checkout create-order error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
