/**
 * GET /api/auth/me
 *   200 -> the admin record (minus passwordHash) + role, or for whitelabel
 *          clients the live record + `usage` + `partnership` countdown
 *   401 -> { error: 'Unauthorized' }
 *   404 -> { error: 'Not found' }   (affiliates have no /me record)
 *
 * Spec §1 verbatim: role comes from the verified JWT (whitelabel/affiliate
 * records don't store one, and clients cache this response as their session
 * user). Affiliate sessions deliberately fall through to 404 exactly like
 * zyqora -- the affiliate dashboard reads /api/affiliates/stats instead.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../../_lib/server.js';
import { requireAuth } from '../../_lib/panel.js';
import { countIssuedLicenses } from '../../_lib/panelLicense.js';
import { getAdmin, getWhitelabel } from '../../_lib/panelStore.js';

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

        const admin = await getAdmin(session.sub);
        if (admin) {
            const { passwordHash: _ignored, ...safe } = admin;
            json(res, 200, { ...safe, role: session.role });
            return;
        }
        // Whitelabel clients use the same panel -- return their live record plus
        // current quota usage and partnership countdown so the UI can reflect
        // super-admin changes instantly.
        const whitelabel = await getWhitelabel(session.sub);
        if (whitelabel?.id && whitelabel.username) {
            const { passwordHash: _ignored, ...safe } = whitelabel;
            const used = await countIssuedLicenses(whitelabel.id);
            const limit = whitelabel.licenseLimit || 0;
            const now = Math.floor(Date.now() / 1000);
            const endTs = whitelabel.partnershipEndTs || null;
            json(res, 200, {
                ...safe,
                role: session.role,
                usage: { used, limit, remaining: Math.max(0, limit - used) },
                partnership: {
                    startTs: whitelabel.partnershipStartTs || null,
                    endTs,
                    months: whitelabel.partnershipMonths || null,
                    daysLeft: endTs ? Math.max(0, Math.ceil((endTs - now) / 86400)) : null,
                    expired: endTs ? endTs <= now : false,
                },
            });
            return;
        }
        json(res, 404, { error: 'Not found' });
    } catch (e) {
        // never leak key material or internals
        console.error('auth me error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
