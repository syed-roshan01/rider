/**
 * api/_lib/cashfree.ts -- Cashfree Payment Gateway client (server-side only --
 * uses the secret key). Port of zyqora-admin lib/cashfree.js to node:crypto.
 * Env: CASHFREE_CLIENT_ID, CASHFREE_CLIENT_SECRET, CASHFREE_ENV (sandbox|
 * production), CASHFREE_API_VERSION (optional), CASHFREE_BASE_URL (test
 * override).
 */
import { createHmac, timingSafeEqual } from 'node:crypto';

const API_VERSION = process.env.CASHFREE_API_VERSION || '2026-01-01';

export function cashfreeMode(): 'production' | 'sandbox' {
    return process.env.CASHFREE_ENV === 'production' ? 'production' : 'sandbox';
}

function baseUrl(): string {
    if (process.env.CASHFREE_BASE_URL) return process.env.CASHFREE_BASE_URL; // test override
    return cashfreeMode() === 'production'
        ? 'https://api.cashfree.com/pg'
        : 'https://sandbox.cashfree.com/pg';
}

export function cashfreeConfigured(): boolean {
    return !!(process.env.CASHFREE_CLIENT_ID && process.env.CASHFREE_CLIENT_SECRET);
}

function headers(): Record<string, string> {
    return {
        'Content-Type': 'application/json',
        'x-client-id': process.env.CASHFREE_CLIENT_ID ?? '',
        'x-client-secret': process.env.CASHFREE_CLIENT_SECRET ?? '',
        'x-api-version': API_VERSION,
    };
}

export interface CashfreeOrder {
    order_status?: string;
    order_amount?: number | string;
    order_currency?: string;
    cf_order_id?: number | string;
    payment_session_id?: string;
    message?: string;
}

export async function createCashfreeOrder(opts: {
    orderId: string;
    amount: number;
    customer: { id: string; name: string; phone: string; email: string };
    returnUrl: string;
    notifyUrl: string;
    note: string;
}): Promise<CashfreeOrder> {
    const res = await fetch(`${baseUrl()}/orders`, {
        method: 'POST',
        headers: headers(),
        body: JSON.stringify({
            order_id: opts.orderId,
            order_amount: opts.amount,
            order_currency: 'INR',
            customer_details: {
                customer_id: opts.customer.id,
                customer_name: opts.customer.name,
                customer_phone: opts.customer.phone,
                customer_email: opts.customer.email,
            },
            order_meta: { return_url: opts.returnUrl, notify_url: opts.notifyUrl },
            order_note: opts.note,
        }),
    });
    const data = (await res.json().catch(() => ({}))) as CashfreeOrder;
    if (!res.ok || !data.payment_session_id) {
        throw new Error(data.message || `Cashfree order failed (${res.status})`);
    }
    return data;
}

// Authoritative order state straight from Cashfree (never trust the webhook body alone).
export async function getCashfreeOrder(orderId: string): Promise<CashfreeOrder> {
    const res = await fetch(`${baseUrl()}/orders/${encodeURIComponent(orderId)}`, { headers: headers() });
    const data = (await res.json().catch(() => ({}))) as CashfreeOrder;
    if (!res.ok) throw new Error(data.message || `Cashfree get-order failed (${res.status})`);
    return data;
}

// Signature = base64(HMAC-SHA256(timestamp + rawBody, clientSecret)).
export function verifyWebhookSignature(rawBody: string, timestamp: string | undefined, signature: string | undefined): boolean {
    const secret = process.env.CASHFREE_CLIENT_SECRET;
    if (!secret || !timestamp || !signature) return false;
    const expected = createHmac('sha256', secret).update(timestamp + rawBody).digest('base64');
    const a = Buffer.from(expected);
    const b = Buffer.from(signature);
    return a.length === b.length && timingSafeEqual(a, b);
}
