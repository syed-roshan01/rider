/**
 * license/panel-auth.ts — AcceptPro admin-panel auth primitives (ADMIN-PORT.md §3).
 *
 * Copied-verbatim-style mirror of the zyqora-admin api/ helper contract
 * (lib/auth.js + the bcrypt password handling in the routes), implemented with
 * node: builtins only (no `jose`, no `bcryptjs`):
 *
 *   - JWT HS256 via node:crypto HMAC. Payload {sub, username, role, name?, iat, exp}
 *     with exp = iat + 8h. Secret `JWT_SECRET`; if absent and NODE_ENV==='production'
 *     signToken throws (login surfaces 500 'Server error'); dev fallback literal
 *     'fallback-dev-secret-change-in-production-123'. Verification fails closed.
 *   - Password hashes `scrypt$<salthex>$<hashhex>` (scryptSync N=16384, 32-byte key,
 *     16-byte salt, timing-safe compare). The format is shared verbatim between
 *     api/_lib and license/src so both stores interoperate.
 */
import { createHmac, randomBytes, scryptSync, timingSafeEqual } from 'node:crypto';

export type PanelRole = 'super' | 'admin' | 'whitelabel' | 'affiliate';

export interface PanelTokenClaims {
    sub: string;
    username: string;
    role: PanelRole;
    name?: string | null;
}

export interface PanelSession extends PanelTokenClaims {
    iat: number;
    exp: number;
}

/** exp = iat + 8h, verbatim from spec §1. */
export const JWT_TTL_SEC = 8 * 60 * 60;
export const DEV_JWT_FALLBACK = 'fallback-dev-secret-change-in-production-123';

const b64u = (buf: Buffer): string =>
    buf.toString('base64').replace(/\+/g, '-').replace(/\//g, '_').replace(/=+$/, '');

const fromB64u = (s: string): Buffer =>
    Buffer.from(s.replace(/-/g, '+').replace(/_/g, '/') + '='.repeat((4 - (s.length % 4)) % 4), 'base64');

/**
 * Read at call time (mirrors zyqora lib/auth.js `secret()`): a missing
 * JWT_SECRET must NEVER silently fall back in production — anyone could then
 * forge admin tokens. Fail loudly instead: signToken throws (login breaks
 * visibly) and verifyToken fails closed (401s).
 */
function jwtSecret(): Buffer {
    const s = process.env.JWT_SECRET;
    if (!s && process.env.NODE_ENV === 'production') {
        throw new Error('JWT_SECRET is not set — refusing to sign tokens with the development fallback');
    }
    return Buffer.from(s || DEV_JWT_FALLBACK, 'utf8');
}

function hmacSign(input: string): string {
    return b64u(createHmac('sha256', jwtSecret()).update(input, 'utf8').digest());
}

/** HS256 JWT. `iat`/`exp` are unix SECONDS (JWT NumericDate), exp = iat + 8h. */
export function signToken(claims: PanelTokenClaims): string {
    const iat = Math.floor(Date.now() / 1000);
    const payload: Record<string, unknown> = {
        sub: claims.sub,
        username: claims.username,
        role: claims.role,
        // `name` rides along only when present (matches api/_lib/panel.ts)
        ...(claims.name ? { name: claims.name } : {}),
        iat,
        exp: iat + JWT_TTL_SEC,
    };
    const header = b64u(Buffer.from(JSON.stringify({ alg: 'HS256', typ: 'JWT' }), 'utf8'));
    const body = b64u(Buffer.from(JSON.stringify(payload), 'utf8'));
    return `${header}.${body}.${hmacSign(`${header}.${body}`)}`;
}

const ROLES: PanelRole[] = ['super', 'admin', 'whitelabel', 'affiliate'];

/**
 * Verify a Bearer token. Fails closed: ANY structural, algorithmic, signature
 * or expiry problem yields null (callers turn that into 401 'Unauthorized').
 */
export function verifyToken(token: string): PanelSession | null {
    try {
        const parts = String(token).split('.');
        if (parts.length !== 3) return null;
        const [hB, pB, sB] = parts;
        if (!hB || !pB || !sB) return null;

        // header must be exactly HS256 — reject 'none' and any other alg
        const header = JSON.parse(fromB64u(hB).toString('utf8'));
        if (!header || header.alg !== 'HS256') return null;

        // signature check BEFORE trusting any claim, timing-safe compare
        const expected = Buffer.from(hmacSign(`${hB}.${pB}`), 'utf8');
        const given = Buffer.from(sB, 'utf8');
        if (expected.length !== given.length || !timingSafeEqual(expected, given)) return null;

        const payload = JSON.parse(fromB64u(pB).toString('utf8'));
        if (!payload || typeof payload !== 'object') return null;
        const exp = Number(payload.exp);
        if (!Number.isFinite(exp) || exp <= Math.floor(Date.now() / 1000)) return null;
        const sub = String(payload.sub ?? '');
        const username = String(payload.username ?? '');
        const role = String(payload.role ?? '');
        if (!sub || !username) return null;
        if (!ROLES.includes(role as PanelRole)) return null;

        return {
            sub,
            username,
            role: role as PanelRole,
            ...(payload.name ? { name: String(payload.name) } : {}),
            iat: Number(payload.iat ?? 0),
            exp,
        };
    } catch {
        return null;
    }
}

export function getTokenFromRequest(req: { headers?: Record<string, string | string[] | undefined> }): string | null {
    const auth = req.headers?.authorization;
    const v = Array.isArray(auth) ? auth[0] : auth;
    if (typeof v === 'string' && v.startsWith('Bearer ')) return v.slice(7);
    return null;
}

export function getSession(req: { headers?: Record<string, string | string[] | undefined> }): PanelSession | null {
    const token = getTokenFromRequest(req);
    if (!token) return null;
    return verifyToken(token);
}

/** Mirrors zyqora lib/auth.js requireAuth — {error:'Unauthorized', status:401} | {session}. */
export function requireAuth(req: {
    headers?: Record<string, string | string[] | undefined>;
}): { error: string; status: number; session?: undefined } | { session: PanelSession; error?: undefined; status?: undefined } {
    const session = getSession(req);
    if (!session) return { error: 'Unauthorized', status: 401 };
    return { session };
}

/** Mirrors zyqora lib/auth.js requireSuper — em dash in 'Forbidden — super admin only' is verbatim. */
export function requireSuper(req: {
    headers?: Record<string, string | string[] | undefined>;
}): { error: string; status: number; session?: undefined } | { session: PanelSession; error?: undefined; status?: undefined } {
    const session = getSession(req);
    if (!session) return { error: 'Unauthorized', status: 401 };
    if (session.role !== 'super') return { error: 'Forbidden — super admin only', status: 403 };
    return { session };
}

// ---------------------------------------------------------------------------
// Passwords — `scrypt$<salthex>$<hashhex>`, shared verbatim with api/_lib.
// ---------------------------------------------------------------------------

export const SCRYPT_PARAMS = { N: 16384, keyLength: 32, saltBytes: 16 };

export function hashPassword(password: string): string {
    const salt = randomBytes(SCRYPT_PARAMS.saltBytes);
    const key = scryptSync(String(password), salt, SCRYPT_PARAMS.keyLength, { N: SCRYPT_PARAMS.N });
    return `scrypt$${salt.toString('hex')}$${key.toString('hex')}`;
}

export function verifyPassword(password: string, stored: string): boolean {
    try {
        const parts = String(stored).split('$');
        if (parts.length !== 3 || parts[0] !== 'scrypt') return false;
        const salt = Buffer.from(parts[1], 'hex');
        const expected = Buffer.from(parts[2], 'hex');
        if (salt.length !== SCRYPT_PARAMS.saltBytes || expected.length !== SCRYPT_PARAMS.keyLength) return false;
        const actual = scryptSync(String(password), salt, SCRYPT_PARAMS.keyLength, { N: SCRYPT_PARAMS.N });
        return actual.length === expected.length && timingSafeEqual(actual, expected);
    } catch {
        return false;
    }
}
