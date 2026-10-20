/**
 * POST /api/affiliates/create  { username, name, password, commission }
 *   201 -> { success: true, affiliate }
 *   400 -> { error: 'Username is required' | 'Display name is required' |
 *              'Password must be at least 6 characters' }
 *   409 -> { error: 'Username already taken' }
 *
 * SUPER only. Usernames unique across affiliates, admins AND whitelabel
 * clients (one shared login endpoint). commission clamped 0..100.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { randomUUID } from 'node:crypto';
import { bodyOf, json } from '../../_lib/server.js';
import { hashPassword, requireSuper } from '../../_lib/panel.js';
import {
    getAdminByUsername,
    getAffiliateByUsername,
    getWhitelabelByUsername,
    saveAffiliate,
} from '../../_lib/panelStore.js';

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

        const body = bodyOf(req);
        const username = String(body.username || '').trim().toLowerCase();
        const name = String(body.name || '').trim();
        const password = String(body.password || '').trim();
        const commission = Math.max(0, Math.min(100, parseFloat(String(body.commission)) || 0));

        if (!username) { json(res, 400, { error: 'Username is required' }); return; }
        if (!name) { json(res, 400, { error: 'Display name is required' }); return; }
        if (!password || password.length < 6) {
            json(res, 400, { error: 'Password must be at least 6 characters' });
            return;
        }

        // All account types share one login endpoint -- a username must be unique
        // across admins, affiliates and whitelabel clients.
        const [affDup, adminDup, wlDup] = await Promise.all([
            getAffiliateByUsername(username),
            getAdminByUsername(username),
            getWhitelabelByUsername(username),
        ]);
        if (affDup || adminDup || wlDup) {
            json(res, 409, { error: 'Username already taken' });
            return;
        }

        const affiliate = {
            id: randomUUID(),
            username,
            name,
            passwordHash: hashPassword(password),
            commission,
            active: true,
            createdBy: session.sub,
            createdByName: session.username,
            createdAt: Math.floor(Date.now() / 1000),
        };

        await saveAffiliate(affiliate);

        const { passwordHash: _ignored, ...safe } = affiliate;
        json(res, 201, { success: true, affiliate: safe });
    } catch (e) {
        // never leak key material or internals
        console.error('affiliates create error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
