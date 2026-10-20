/**
 * GET /api/sales
 *   200 -> [ { key, clientName, clientPhone, plan, price, discountedPrice,
 *              affiliateId, affiliateCommissionAmount, issuedBy, issuedByName,
 *              issuedAt, revoked } ]  newest first
 *
 * ANY authenticated role (scoped like /api/licenses/list: super sees all).
 * Only licenses with a recorded price count. Whitelabel-issued licenses are
 * the reseller's own business, so they stay out of this panel's direct-sales
 * view (whitelabelIssued !== true).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../_lib/server.js';
import { requireAuth } from '../_lib/panel.js';
import { listAdminLicenses, listAllLicenses } from '../_lib/panelLicense.js';

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

        const list = session.role === 'super'
            ? await listAllLicenses()
            : await listAdminLicenses(session.sub);

        const sales = list
            .filter((l) => l.price > 0 && l.whitelabelIssued !== true)
            .map((l) => ({
                key: l.key,
                clientName: l.clientName,
                clientPhone: l.clientPhone || '',
                plan: l.plan,
                price: l.price,
                discountedPrice: l.discountedPrice ?? null,
                affiliateId: l.affiliateId || null,
                affiliateCommissionAmount: l.affiliateCommissionAmount ?? null,
                issuedBy: l.issuedBy,
                issuedByName: l.issuedByName,
                issuedAt: l.issuedAt,
                revoked: l.revoked || false,
            }))
            .sort((a, b) => (b.issuedAt || 0) - (a.issuedAt || 0));

        json(res, 200, sales);
    } catch (e) {
        // never leak key material or internals
        console.error('sales error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
