/**
 * api/_lib/panel.ts -- AcceptPro admin-suite authentication.
 *
 * Port of zyqora-admin lib/auth.js to node:crypto only (NO jose dependency --
 * this repo is zero-runtime-dep):
 *
 *   - JWT HS256 signed with HMAC-SHA256 over `base64url(header).base64url(payload)`.
 *     Payload: { sub, username, role, name?, iat, exp } with exp = iat + 8h
 *     (unix SECONDS, exactly like jose's setIssuedAt/setExpirationTime('8h')).
 *   - Secret JWT_SECRET. If it is missing and NODE_ENV === 'production' the
 *     secret loader THROWS (login breaks visibly with 500 'Server error');
 *     development falls back to the literal
 *     'fallback-dev-secret-change-in-production-123'. Verification FAILS CLOSED:
 *     any malformed / wrongly-signed / expired / header-tampered token is null.
 *   - Password hashes: `scrypt$<salthex>$<hashhex>` (scryptSync N=16384, r=8,
 *     p=1, 32-byte key, 16-byte salt), timing-safe compare. The format is
 *     shared verbatim with license/src so both stores interoperate. bcryptjs
 *     is NOT used anywhere. (The legacy ADMIN_PASSWORD flow keeps its own
 *     checkPassword() in server.ts, untouched.)
 *
 * Roles: 'super' | 'admin' | 'whitelabel' | 'affiliate'. Error strings are the
 * spec's verbatim wire contract.
 */
import type { VercelRequest } from '@vercel/node';
import { createHmac, randomBytes, scryptSync, timingSafeEqual } from 'node:crypto';

export type PanelRole = 'super' | 'admin' | 'whitelabel' | 'affiliate';

export interface PanelSession {
    sub: string;
    username: string;
    role: PanelRole;
    name?: string;
    iat: number;
    exp: number;
}

export type AuthGate =
    | { session: PanelSession; error?: undefined; status?: undefined }
    | { error: string; status: number; session?: undefined };

const TOKEN_TTL_SEC = 8 * 60 * 60; // 8h, matching jose's setExpirationTime('8h')

// ---------------------------------------------------------------------------
// JWT HS256 (node:crypto HMAC)
// ---------------------------------------------------------------------------

/** Same contract as zyqora-admin lib/auth.js's secret(). */
function secret(): string {
    const s = process.env.JWT_SECRET;
    if (!s && process.env.NODE_ENV === 'production') {
        throw new Error('JWT_SECRET is not set — refusing to sign tokens with the development fallback');
    }
    return s || 'fallback-dev-secret-change-in-production-123';
}

const b64u = (buf: Buffer): string =>
    buf.toString('base64').replace(/\+/g, '-').replace(/\//g, '_').replace(/=+$/, '');

const fromB64u = (s: string): Buffer =>
    Buffer.from(s.replace(/-/g, '+').replace(/_/g, '/') + '='.repeat((4 - (s.length % 4)) % 4), 'base64');

function hmacSign(data: string): string {
    return b64u(createHmac('sha256', secret()).update(data, 'utf8').digest());
}

/** Sign a panel token. Throws when JWT_SECRET is missing in production. */
export function signToken(payload: {
    sub: string;
    username: string;
    role: PanelRole;
    name?: string;
}): string {
    const iat = Math.floor(Date.now() / 1000);
    const body: Record<string, unknown> = {
        sub: payload.sub,
        username: payload.username,
        role: payload.role,
        ...(payload.name ? { name: payload.name } : {}),
        iat,
        exp: iat + TOKEN_TTL_SEC,
    };
    const head = b64u(Buffer.from(JSON.stringify({ alg: 'HS256', typ: 'JWT' }), 'utf8'));
    const claims = b64u(Buffer.from(JSON.stringify(body), 'utf8'));
    return `${head}.${claims}.${hmacSign(`${head}.${claims}`)}`;
}

/**
 * Verify a panel token. Fails closed: anything at all wrong -> null
 * (mirrors jose jwtVerify() being wrapped in try/catch).
 */
export function verifyToken(token: string): PanelSession | null {
    try {
        const parts = String(token).split('.');
        if (parts.length !== 3) return null;
        const [h, p, s] = parts;
        if (!h || !p || !s) return null;

        // header must be exactly HS256 -- reject 'none' and any other alg
        const header = JSON.parse(fromB64u(h).toString('utf8'));
        if (header?.alg !== 'HS256') return null;

        // signature check BEFORE trusting any claim, timing-safe compare
        const expect = Buffer.from(hmacSign(`${h}.${p}`), 'utf8');
        const got = Buffer.from(s, 'utf8');
        if (expect.length !== got.length || !timingSafeEqual(expect, got)) return null;

        const payload = JSON.parse(fromB64u(p).toString('utf8'));
        if (!payload || typeof payload !== 'object') return null;
        const exp = Number(payload.exp);
        if (!Number.isFinite(exp) || exp <= Math.floor(Date.now() / 1000)) return null;
        const sub = String(payload.sub ?? '');
        const username = String(payload.username ?? '');
        const role = String(payload.role ?? '');
        if (!sub || !username) return null;
        if (role !== 'super' && role !== 'admin' && role !== 'whitelabel' && role !== 'affiliate') return null;

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

export function getTokenFromRequest(req: VercelRequest): string | null {
    const auth = req.headers.authorization;
    const header = Array.isArray(auth) ? auth[0] : auth;
    if (header?.startsWith('Bearer ')) return header.slice(7);
    return null;
}

export function getSession(req: VercelRequest): PanelSession | null {
    const token = getTokenFromRequest(req);
    if (!token) return null;
    return verifyToken(token);
}

/** Any authenticated panel session. 401 'Unauthorized' on failure. */
export function requireAuth(req: VercelRequest): AuthGate {
    const session = getSession(req);
    if (!session) return { error: 'Unauthorized', status: 401 };
    return { session };
}

/** Super admins only. 401 / 403 with the spec's exact error strings. */
export function requireSuper(req: VercelRequest): AuthGate {
    const session = getSession(req);
    if (!session) return { error: 'Unauthorized', status: 401 };
    if (session.role !== 'super') return { error: 'Forbidden — super admin only', status: 403 };
    return { session };
}

// ---------------------------------------------------------------------------
// passwords: scrypt$<salthex>$<hashhex> (timing-safe)
// ---------------------------------------------------------------------------

const SCRYPT_OPTS = { N: 16384, r: 8, p: 1 };
const SCRYPT_RE = /^scrypt\$([0-9a-f]+)\$([0-9a-f]+)$/i;

/** Hash a password for admin_users / whitelabels / affiliates. */
export function hashPassword(pw: string): string {
    const salt = randomBytes(16);
    const hash = scryptSync(String(pw ?? ''), salt, 32, SCRYPT_OPTS);
    return `scrypt$${salt.toString('hex')}$${hash.toString('hex')}`;
}

/** Timing-safe verify against a `scrypt$...` hash. Fails closed. */
export function verifyPassword(pw: string, stored: string): boolean {
    try {
        const m = SCRYPT_RE.exec(String(stored ?? ''));
        if (!m) return false;
        const salt = Buffer.from(m[1], 'hex');
        const expect = Buffer.from(m[2], 'hex');
        if (salt.length !== 16 || expect.length !== 32) return false;
        const got = scryptSync(String(pw ?? ''), salt, 32, SCRYPT_OPTS);
        return timingSafeEqual(expect, got);
    } catch {
        return false;
    }
}
