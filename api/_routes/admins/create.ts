/**
 * POST /api/admins/create  { username, password, role }
 *   201 -> { success: true, admin }   (admin without passwordHash)
 *   400 -> { error: 'username and password are required' }
 *   409 -> { error: 'Username already exists' }
 *
 * SUPER only. Usernames must be unique across admins, affiliates AND
 * whitelabel clients -- all three log in through the same endpoint (admin is
 * tried first), so a shadowed account would get locked out.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { randomUUID } from 'node:crypto';
import { bodyOf, json } from '../../_lib/server.js';
import { hashPassword, requireSuper } from '../../_lib/panel.js';
import {
    getAdminByUsername,
    getAffiliateByUsername,
    getWhitelabelByUsername,
    saveAdmin,
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

        const b = bodyOf(req);
        const username = b.username;
        const password = b.password;
        const role = b.role;
        if (!String(username ?? '').trim() || !password) {
            json(res, 400, { error: 'username and password are required' });
            return;
        }

        const uname = String(username).trim().toLowerCase();
        const [adminDup, affDup, wlDup] = await Promise.all([
            getAdminByUsername(uname),
            getAffiliateByUsername(uname),
            getWhitelabelByUsername(uname),
        ]);
        if (adminDup || affDup || wlDup) {
            json(res, 409, { error: 'Username already exists' });
            return;
        }

        const admin = {
            id: randomUUID(),
            username: String(username).trim().toLowerCase(),
            passwordHash: hashPassword(String(password)),
            role: (role === 'super' ? 'super' : 'admin') as 'super' | 'admin',
            createdBy: session.sub,
            createdByName: session.username,
            createdAt: Math.floor(Date.now() / 1000),
            active: true,
        };

        await saveAdmin(admin);
        const { passwordHash: _ignored, ...safe } = admin;
        json(res, 201, { success: true, admin: safe });
    } catch (e) {
        // never leak key material or internals
        console.error('admins create error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
