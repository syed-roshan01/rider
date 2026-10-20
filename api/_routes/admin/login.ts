/**
 * POST /api/admin/login  { password } -> { ok:true, token } (sets cookie ra_admin)
 * 401 -> { ok:false }. Rate limited per client IP (this is the rate-limit bug
 * left open in license/src/server.ts -- fixed here).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import {
    audit,
    bodyOf,
    checkPassword,
    clientIp,
    issueSessionToken,
    json,
    loginRateLimit,
    setSessionCookie,
} from '../../_lib/server.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }

    const gate = loginRateLimit(req);
    if (!gate.ok) {
        res.setHeader('retry-after', String(gate.retryAfterSec));
        json(res, 429, { error: 'too many attempts' });
        return;
    }

    try {
        const b = bodyOf(req);
        if (!checkPassword(String(b.password ?? ''))) {
            await audit('anonymous', 'admin.login.fail', clientIp(req));
            json(res, 401, { ok: false });
            return;
        }
        const token = issueSessionToken();
        await audit('admin', 'admin.login', 'ok');
        setSessionCookie(res, token);
        json(res, 200, { ok: true, token });
    } catch (e) {
        // never leak key material or internals
        console.error('admin login error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
