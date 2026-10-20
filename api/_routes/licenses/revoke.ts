/**
 * POST /api/licenses/revoke  { key, reason? }
 *   200 -> { success: true }
 *   400 -> { error: 'key required' }
 *   403 -> { error: 'Forbidden' }    (admin/whitelabel may only revoke own rows)
 *   404 -> { error: 'License not found' }
 *
 * "die on revoke" is a hard requirement: the app validates against the ENGINE,
 * so this flips BOTH sides (INTEGRATION SEAM) -- license_meta.revoked* AND the
 * engine status -> 'revoked'. Logs LICENSE_REVOKED with the revoke meta shape.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { randomUUID } from 'node:crypto';
import { bodyOf, json } from '../../_lib/server.js';
import { keyPrefixOf } from '../../../supabase/functions/_shared/license.js';
import { requireAuth } from '../../_lib/panel.js';
import { getPanelLicense, patchEngineLicense, saveLicenseMeta, type PanelLicense } from '../../_lib/panelLicense.js';
import { saveLog, type PanelLog } from '../../_lib/panelStore.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
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

        const b = bodyOf(req);
        const key = b.key;
        const reason = b.reason;
        if (!key) {
            json(res, 400, { error: 'key required' });
            return;
        }

        const license = await getPanelLicense(String(key));
        if (!license) {
            json(res, 404, { error: 'License not found' });
            return;
        }

        // Admins can only revoke their own licenses
        if (session.role !== 'super' && license.issuedBy !== session.sub) {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        const revokedAt = Math.floor(Date.now() / 1000);
        const updated: PanelLicense = {
            ...license,
            revoked: true,
            revokedBy: session.sub,
            revokedByName: session.username,
            revokedAt,
            revokedReason: String(reason || '').trim(),
        };
        await saveLicenseMeta(updated);
        // INTEGRATION SEAM: the engine must die with the record
        await patchEngineLicense(license.engine.keyHash, { status: 'revoked' });

        const log: PanelLog = {
            id: randomUUID(),
            action: 'LICENSE_REVOKED',
            actorId: session.sub,
            actorName: session.username,
            actorRole: session.role,
            ts: revokedAt,
            flag: null,
            meta: {
                key: keyPrefixOf(license.key),
                clientName: license.clientName || '',
                clientPhone: license.clientPhone || '',
                plan: license.plan || '',
                price: Math.max(0, parseFloat(String(license.price)) || 0),
                issuedByName: license.issuedByName || '',
                reason: String(reason || '').trim(),
            },
        };
        await saveLog(log);

        json(res, 200, { success: true });
    } catch (e) {
        // never leak key material or internals
        console.error('licenses revoke error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
