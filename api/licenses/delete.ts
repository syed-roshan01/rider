/**
 * POST /api/licenses/delete  { key }
 *   200 -> { success: true }
 *   400 -> { error: 'key required' }
 *   404 -> { error: 'License not found' }
 *
 * SUPER only. store.deleteLicense(): the licence record AND its bound devices
 * AND the engine row disappear (INTEGRATION SEAM -- both sides always move
 * together). Logs LICENSE_DELETED with the exact meta shape and the warning
 * note (RUPEE SIGN U+20B9 + EM DASH U+2014 -- byte-exact).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { randomUUID } from 'node:crypto';
import { bodyOf, json } from '../_lib/server.js';
import { keyPrefixOf } from '../../supabase/functions/_shared/license.js';
import { requireSuper } from '../_lib/panel.js';
import { deletePanelLicense, getPanelLicense } from '../_lib/panelLicense.js';
import { saveLog, type PanelLog } from '../_lib/panelStore.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        const gate = requireSuper(req);
        if (gate.error) {
            json(res, gate.status, { error: gate.error });
            return;
        }
        const session = gate.session;

        const b = bodyOf(req);
        const key = b.key;
        if (!key) {
            json(res, 400, { error: 'key required' });
            return;
        }

        const license = await getPanelLicense(String(key));
        if (!license) {
            json(res, 404, { error: 'License not found' });
            return;
        }

        const price = Math.max(0, parseFloat(String(license.price)) || 0);
        const discounted =
            license.discountedPrice !== undefined && license.discountedPrice !== null
                ? Math.min(price, Math.max(0, parseFloat(String(license.discountedPrice)) || 0))
                : price;

        await deletePanelLicense(license);

        const log: PanelLog = {
            id: randomUUID(),
            action: 'LICENSE_DELETED',
            actorId: session.sub,
            actorName: session.username,
            actorRole: session.role,
            ts: Math.floor(Date.now() / 1000),
            flag: price > 0 ? 'warning' : null,
            meta: {
                key: keyPrefixOf(license.key),
                clientName: license.clientName || '',
                clientPhone: license.clientPhone || '',
                plan: license.plan || '',
                price,
                discountedPrice: discounted,
                issuedByName: license.issuedByName || '',
                issuedAt: license.issuedAt || null,
                revoked: license.revoked || false,
                revokedReason: license.revokedReason || '',
                note: price > 0
                    ? `License had amount ₹${discounted} — this figure is now removed from sales totals.`
                    : null,
            },
        };
        await saveLog(log);

        json(res, 200, { success: true });
    } catch (e) {
        // never leak key material or internals
        console.error('licenses delete error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
