/**
 * api/_lib/server.ts -- shared plumbing for the Vercel admin API.
 *
 * SECURITY (non-negotiable):
 *   - SUPABASE_SERVICE_ROLE_KEY and MASTER_SEAL_KEY live only in Vercel env
 *     vars and are read ONLY inside api/. They are never sent to a browser,
 *     never logged, and never echoed in an error response.
 *   - LICENSE_SIGNING_PRIVATE is deliberately NOT an env var here and is never
 *     read here. Signing is the Supabase Edge Function's job; the admin surface
 *     only seals/unseals licence keys with MASTER_SEAL_KEY.
 *
 * Every licence primitive (key format, hashing, sealing) comes from the single
 * source of truth, supabase/functions/_shared/license.ts, imported by relative
 * path. Never copy it and never reimplement its crypto: duplicated crypto is
 * how device codes drift and every licence breaks.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { createHmac, scryptSync, timingSafeEqual } from 'node:crypto';
import type {
    DeviceRecord,
    LicenseRecord,
    LicenseStatus,
    PlanType,
} from '../../supabase/functions/_shared/license.js';

// ---------------------------------------------------------------------------
// shapes mirrored from license/src/store.ts (ported to SQL)
// ---------------------------------------------------------------------------

export interface AppConfig {
    maintenanceMode: boolean;
    maintenanceMessage: string;
    forceUpdateVersion: number;
    updateDownloadUrl: string;
    updatePageUrl: string;
    minAllowedFare: number;
    maxAllowedFare: number;
    versionBlocked: string[];
    dialogMessage: string;
    dialogButtonText: string;
}

export const DEFAULT_CONFIG: AppConfig = {
    maintenanceMode: false,
    maintenanceMessage: 'App is under maintenance. Please try again later.',
    forceUpdateVersion: 0,
    updateDownloadUrl: '',
    updatePageUrl: '',
    minAllowedFare: 10,
    maxAllowedFare: 5000,
    versionBlocked: [],
    dialogMessage: '',
    dialogButtonText: 'OK',
};

export interface AuditEntry {
    id: string;
    at: number;
    actor: string;
    action: string;
    detail: string;
}

export type DbRow = Record<string, unknown>;

// ---------------------------------------------------------------------------
// env + response helpers
// ---------------------------------------------------------------------------

/** Read a required env var. The error names the var but never a value. */
export function env(name: string): string {
    const v = process.env[name];
    if (!v) throw new Error('missing configuration');
    return v;
}

export function json(res: VercelResponse, status: number, body: unknown): void {
    res.setHeader('cache-control', 'no-store');
    res.setHeader('content-type', 'application/json; charset=utf-8');
    res.status(status);
    res.end(JSON.stringify(body, null, 2));
}

/** Parsed JSON request body (Vercel pre-parses application/json). */
export function bodyOf(req: VercelRequest): DbRow {
    const b: unknown = req.body;
    if (b && typeof b === 'object' && !Array.isArray(b)) return b as DbRow;
    if (typeof b === 'string' && b) {
        try {
            const p: unknown = JSON.parse(b);
            if (p && typeof p === 'object' && !Array.isArray(p)) return p as DbRow;
        } catch {
            /* fall through */
        }
    }
    return {};
}

/** Client IP for the login rate limiter: x-forwarded-for first hop, else x-real-ip. */
export function clientIp(req: VercelRequest): string {
    const xff = req.headers['x-forwarded-for'];
    const first = Array.isArray(xff) ? xff[0] : xff;
    if (first) return String(first).split(',')[0].trim();
    const real = req.headers['x-real-ip'];
    return String(Array.isArray(real) ? real[0] : (real ?? '')).trim();
}

/** Tolerant integer query/body param (NaN never reaches SQL or JSON). */
export function intParam(v: unknown, fallback: number): number {
    const n = Number(v ?? fallback);
    return Number.isFinite(n) ? Math.trunc(n) : fallback;
}

export function toMs(v: unknown): number {
    if (v == null) return 0;
    const n = Number(v);
    if (Number.isFinite(n)) return n;
    const parsed = Date.parse(String(v));
    return Number.isFinite(parsed) ? parsed : 0;
}

// ---------------------------------------------------------------------------
// tiny Supabase REST client (PostgREST + rpc) -- no npm dependencies
// ---------------------------------------------------------------------------

export async function sb(
    method: string,
    path: string,
    body?: unknown,
    headers: Record<string, string> = {},
): Promise<Response> {
    const base = env('SUPABASE_URL').replace(/\/+$/, '');
    const key = env('SUPABASE_SERVICE_ROLE_KEY');
    return fetch(`${base}/rest/v1${path}`, {
        method,
        headers: {
            apikey: key,
            authorization: `Bearer ${key}`,
            'content-type': 'application/json',
            ...headers,
        },
        body: body === undefined ? undefined : JSON.stringify(body),
    });
}

/** SELECT helper. Throws on transport/schema failure (caught by the route). */
export async function sbRows(path: string): Promise<DbRow[]> {
    const res = await sb('GET', path);
    if (!res.ok) throw new Error('query failed');
    const data: unknown = await res.json();
    return Array.isArray(data) ? (data as DbRow[]) : [];
}

/** INSERT/PATCH/DELETE helper; returns the affected rows. */
export async function sbWrite(
    method: 'POST' | 'PATCH' | 'DELETE',
    path: string,
    body?: unknown,
): Promise<DbRow[]> {
    const res = await sb(method, path, body, { prefer: 'return=representation' });
    if (!res.ok) throw new Error('write failed');
    const data: unknown = await res.json().catch(() => []);
    return Array.isArray(data) ? (data as DbRow[]) : [];
}

/** RPC helper; surfaces the Postgres error code (e.g. 23505) for callers. */
export async function sbRpc(
    name: string,
    args: DbRow,
): Promise<{ ok: boolean; status: number; code: string; data: unknown }> {
    const res = await sb('POST', `/rpc/${name}`, args);
    let data: unknown = null;
    try {
        data = await res.json();
    } catch {
        data = null;
    }
    const code =
        data && typeof data === 'object' && 'code' in data
            ? String((data as DbRow).code)
            : '';
    return { ok: res.ok, status: res.status, code, data };
}

// ---------------------------------------------------------------------------
// row -> store.ts record mappers (snake_case SQL to camelCase contracts)
// ---------------------------------------------------------------------------

export function toLicenseRecord(r: DbRow): LicenseRecord {
    const bound = r.bound_device_code_hashes;
    return {
        keyHash: String(r.key_hash ?? ''),
        keySealed: String(r.key_sealed ?? ''),
        keyPrefix: String(r.key_prefix ?? ''),
        planType: r.plan_type as PlanType,
        durationDays: Number(r.duration_days ?? 0),
        status: r.status as LicenseStatus,
        createdAt: toMs(r.created_at),
        activatedAt: r.activated_at == null ? null : toMs(r.activated_at),
        expiresAt: r.expires_at == null ? null : toMs(r.expires_at),
        maxDevices: Number(r.max_devices ?? 1),
        // An empty array is NOT nullish, so `?? fallback` would never fall back.
        boundDeviceCodeHashes: Array.isArray(bound) ? bound.map(String) : [],
        note: String(r.note ?? ''),
        createdBy: String(r.created_by ?? ''),
    };
}

/** Device rows use device_code_hash as identity; the UI calls it hwidHash. */
export function toDeviceRecord(r: DbRow): DeviceRecord {
    return {
        hwidHash: String(r.device_code_hash ?? ''),
        keyHash: String(r.key_hash ?? ''),
        activatedAt: toMs(r.activated_at),
        lastSeenAt: toMs(r.last_seen_at),
        appVersion: String(r.app_version ?? ''),
        model: String(r.model ?? ''),
        brand: String(r.brand ?? ''),
        integrity: String(r.integrity ?? ''),
    };
}

// ---------------------------------------------------------------------------
// admin sessions: HMAC over the expiry, keyed by ADMIN_SESSION_SECRET
// ---------------------------------------------------------------------------

const SESSION_TTL_MS = 12 * 60 * 60 * 1000; // matches license/src/server.ts
const SESSION_COOKIE = 'ra_admin';

function sessionMac(exp: number): string {
    return createHmac('sha256', env('ADMIN_SESSION_SECRET'))
        .update(`${SESSION_COOKIE}.${exp}`)
        .digest('hex');
}

/** Token = `<expiryMs>.<hmac over the expiry>` -- unforgeable without the secret. */
export function issueSessionToken(): string {
    const exp = Date.now() + SESSION_TTL_MS;
    return `${exp}.${sessionMac(exp)}`;
}

export function setSessionCookie(res: VercelResponse, token: string): void {
    res.setHeader(
        'set-cookie',
        `${SESSION_COOKIE}=${token}; HttpOnly; Path=/; SameSite=Strict; Max-Age=${SESSION_TTL_MS / 1000}`,
    );
}

export function clearSessionCookie(res: VercelResponse): void {
    res.setHeader(
        'set-cookie',
        `${SESSION_COOKIE}=; HttpOnly; Path=/; SameSite=Strict; Max-Age=0`,
    );
}

function sessionTokenOf(req: VercelRequest): string {
    const m = /(?:^|;\s*)ra_admin=([^;]+)/.exec(req.headers.cookie ?? '');
    return m?.[1] ?? '';
}

export function verifySession(req: VercelRequest): boolean {
    // strict shape check first: trailing junk must invalidate the token
    const parsed = /^([0-9]+)\.([0-9a-f]+)$/.exec(sessionTokenOf(req));
    if (!parsed) return false;
    const exp = Number(parsed[1]);
    const sig = parsed[2];
    if (!Number.isSafeInteger(exp) || exp <= Date.now()) return false;
    const expect = Buffer.from(sessionMac(exp), 'utf8');
    const got = Buffer.from(sig, 'utf8');
    return expect.length === got.length && timingSafeEqual(expect, got);
}

/** Gate every admin route except login. 401 on failure. */
export function requireAdmin(req: VercelRequest, res: VercelResponse): boolean {
    if (verifySession(req)) return true;
    json(res, 401, { error: 'unauthorized' });
    return false;
}

// ---------------------------------------------------------------------------
// admin password (scrypt, timing-safe -- same shape as license/src/server.ts)
// ---------------------------------------------------------------------------

const ADMIN_SALT = 'ride-accepter-admin-salt';
let adminHash: Buffer | null = null;

export function checkPassword(pw: string): boolean {
    if (!adminHash) adminHash = scryptSync(env('ADMIN_PASSWORD'), ADMIN_SALT, 32);
    const got = scryptSync(String(pw ?? ''), ADMIN_SALT, 32);
    return adminHash.length === got.length && timingSafeEqual(adminHash, got);
}

// ---------------------------------------------------------------------------
// login rate limiting -- fixes the open bug in license/src/server.ts
// ---------------------------------------------------------------------------

const RATE_WINDOW_MS = 15 * 60 * 1000;
const RATE_MAX_ATTEMPTS = 5;
const rateAttempts = new Map<string, { count: number; resetAt: number }>();

/** Fixed-window limiter keyed by client IP: 5 attempts / 15 min, then block. */
export function loginRateLimit(
    req: VercelRequest,
): { ok: true } | { ok: false; retryAfterSec: number } {
    const now = Date.now();
    if (rateAttempts.size > 1000) {
        for (const [k, v] of rateAttempts) if (v.resetAt <= now) rateAttempts.delete(k);
    }
    const ip = clientIp(req);
    let e = rateAttempts.get(ip);
    if (!e || e.resetAt <= now) {
        e = { count: 0, resetAt: now + RATE_WINDOW_MS };
        rateAttempts.set(ip, e);
    }
    e.count += 1;
    if (e.count > RATE_MAX_ATTEMPTS) {
        return { ok: false, retryAfterSec: Math.max(1, Math.ceil((e.resetAt - now) / 1000)) };
    }
    return { ok: true };
}

// ---------------------------------------------------------------------------
// keys + audit
// ---------------------------------------------------------------------------

/** AES-256-GCM key for sealKey/unsealKey: Buffer.from(MASTER_SEAL_KEY, 'base64'). */
export function masterSealKey(): Buffer {
    const raw = Buffer.from(env('MASTER_SEAL_KEY'), 'base64');
    if (raw.length !== 32) throw new Error('bad configuration');
    return raw;
}

/** One audit row per admin action (actor/action/detail like store.log). */
export async function audit(actor: string, action: string, detail: string): Promise<void> {
    await sbWrite('POST', '/audit_log', { actor, action, detail });
}
