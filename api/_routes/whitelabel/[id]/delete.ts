/**
 * POST /api/whitelabel/{id}/delete
 *   200 -> { success: true, issuedLicenses }
 *   404 -> { error: 'Whitelabel client not found' }
 *
 * SUPER only. Super admin permanently removes a whitelabel client account.
 * Licenses the client issued stay in the records (sales history is never
 * erased); only the account, its login and its quota disappear. Logs
 * WHITELABEL_DELETED (flag 'warning' when issuedLicenses > 0).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { randomUUID } from 'node:crypto';
import { json } from '../../../_lib/server.js';
import { requireSuper } from '../../../_lib/panel.js';
import { countIssuedLicenses } from '../../../_lib/panelLicense.js';
import { deleteWhitelabel, getWhitelabel, saveLog } from '../../../_lib/panelStore.js';

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

        const id = String(req.query.id ?? '');
        const whitelabel = await getWhitelabel(id);
        if (!whitelabel) {
            json(res, 404, { error: 'Whitelabel client not found' });
            return;
        }

        // Corrupted records (missing their own id) can still be deleted -- fall
        // back to the route id so super admins can clean them up.
        const target = { ...whitelabel, id: whitelabel.id || id };
        const issuedLicenses = await countIssuedLicenses(target.id);
        await deleteWhitelabel(target);

        await saveLog({
            id: randomUUID(),
            action: 'WHITELABEL_DELETED',
            actorId: session.sub,
            actorName: session.username,
            actorRole: session.role,
            ts: Math.floor(Date.now() / 1000),
            flag: issuedLicenses > 0 ? 'warning' : null,
            meta: {
                whitelabelId: whitelabel.id,
                clientName: whitelabel.name || '',
                username: whitelabel.username || '',
                issuedLicenses,
            },
        });

        json(res, 200, { success: true, issuedLicenses });
    } catch (e) {
        // never leak key material or internals
        console.error('whitelabel delete error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
