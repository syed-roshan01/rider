/**
 * POST /api/checkout/webhook      (Cashfree -> us)
 *   200 -> { ok: true }
 *   400 -> { error: 'Bad signature' }
 *   500 -> { error: 'retry' }
 *
 * The signature is checked over the EXACT raw body
 * (base64(HMAC-SHA256(timestamp + rawBody, clientSecret)), constant-time
 * compare), and even then the order is re-fetched from Cashfree before any
 * license is issued (fulfilOrder).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../_lib/server.js';
import { verifyWebhookSignature } from '../_lib/cashfree.js';
import { fulfilOrder } from '../_lib/checkout.js';

/**
 * The exact request bytes for HMAC verification. @vercel/node may hand the
 * handler a pre-parsed body: a string/Buffer is used verbatim; a parsed object
 * is re-serialized (byte-identical for the compact JSON payment gateways send);
 * an absent body falls back to reading the raw stream ourselves.
 */
async function rawBodyOf(req: VercelRequest): Promise<string> {
    const b: unknown = req.body;
    if (typeof b === 'string') return b;
    if (Buffer.isBuffer(b)) return b.toString('utf8');
    if (b && typeof b === 'object') return JSON.stringify(b);
    return await new Promise<string>((resolve) => {
        let data = '';
        req.setEncoding('utf8');
        req.on('data', (c: string) => {
            data += c;
        });
        req.on('end', () => resolve(data));
        req.on('error', () => resolve(''));
    });
}

function headerValue(req: VercelRequest, name: string): string | undefined {
    const v = req.headers[name];
    return Array.isArray(v) ? v[0] : v;
}

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        const raw = await rawBodyOf(req);
        const ok = verifyWebhookSignature(raw, headerValue(req, 'x-webhook-timestamp'), headerValue(req, 'x-webhook-signature'));
        if (!ok) {
            json(res, 400, { error: 'Bad signature' });
            return;
        }

        let event: unknown;
        try {
            event = JSON.parse(raw);
        } catch {
            json(res, 200, { ok: true });
            return;
        }

        const data = (event as { data?: { order?: { order_id?: string } } } | null)?.data;
        const orderId = data?.order?.order_id;
        const type = String((event as { type?: string } | null)?.type || '');
        if (orderId && type.includes('PAYMENT') && type.includes('SUCCESS')) {
            try {
                await fulfilOrder(orderId);
            } catch (e) {
                console.error('webhook fulfil failed:', (e as Error).message);
                json(res, 500, { error: 'retry' });
                return;
            }
        }
        json(res, 200, { ok: true });
    } catch (e) {
        // never leak key material or internals
        console.error('checkout webhook error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
