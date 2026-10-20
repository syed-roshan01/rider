/**
 * license/server.ts — license API + admin dashboard host.
 *
 *   node license/src/server.ts
 *
 * Two audiences:
 *   /api/admin/*   the admin dashboard (session cookie, admin password)
 *   /api/v1/*      the Android app (license key + device HWID + signed token)
 *
 * The Android side never holds anything that can mint an entitlement: it sends
 * a key + HWID and receives a short-lived Ed25519-signed token it can only
 * verify, not create.
 */
import { createServer, type IncomingMessage, type ServerResponse } from 'node:http';
import { readFileSync, existsSync, mkdirSync, writeFileSync, readdirSync, statSync } from 'node:fs';
import { join, extname, resolve, sep } from 'node:path';
import { fileURLToPath } from 'node:url';
import { randomUUID, scryptSync, timingSafeEqual, randomBytes, createHash } from 'node:crypto';
import {
    generateSigningKeyPair,
    issueToken,
    verifyToken,
    evaluateEntitlement,
    deriveHwid,
    deriveDeviceCode,
    hashDeviceCode,
    hashHwid,
    hashKey,
    keyPrefixOf,
    LicenseError,
    DEFAULT_POLICY,
    PLAN_DAYS,
    type KeyPair,
    type PlanType,
    type LicenseStatus,
    type LicenseRecord,
} from './core.ts';
import { Store, DEFAULT_CONFIG, ORDER_TTL_SEC, PENDING_TTL_SEC, type AppConfig } from './store.ts';
import type {
    AdminUserRecord,
    WhitelabelRecord,
    AffiliateRecord,
    PaymentRecord,
    ExpenseRecord,
    WithdrawalRecord,
    LicenseMetaRecord,
    PanelLogRecord,
} from './store.ts';
import {
    signToken,
    getSession,
    requireAuth,
    requireSuper,
    hashPassword,
    verifyPassword,
    type PanelSession,
} from './panel-auth.ts';
import { priceFields, attributedRevenue, commissionAmount, affiliateStatsFormulas, globalMoney } from './panel-money.ts';
import {
    PLANS,
    publicPlans,
    LICENSE_MODES,
    resolveWlPlans,
    resolveWlMaxDevices,
    enginePlan,
    metaExpiryTs,
    isDeviceIdInput,
    normalizeDeviceId,
    displayDeviceCode,
} from './panel-plans.ts';
import {
    newOrderId,
    isSellableMode,
    getCheckoutOrder,
    fulfilOrder,
    issueAutoLicense,
    createCashfreeOrder,
    verifyWebhookSignature,
    cashfreeMode,
    cashfreeConfigured,
    gatewayMocked,
    allow,
    clientIp,
    pendingSideKey,
    claimSideKey,
} from './panel-checkout.ts';

const HERE = fileURLToPath(new URL('.', import.meta.url));
const ROOT = resolve(HERE, '..'); // license/
const WORKSPACE = resolve(ROOT, '..');

// Defaults keep the historical layout (license/data, license/keys); the env
// overrides exist so the test suite can run against a temp-dir store.
const DATA_DIR = process.env.LICENSE_DATA_DIR ?? join(ROOT, 'data');
const KEY_DIR = process.env.LICENSE_KEY_DIR ?? join(ROOT, 'keys');
const ADMIN_DIR = join(ROOT, 'admin');
const DB_PATH = join(DATA_DIR, 'db.json');

const PORT = Number(process.env.PORT ?? 8787);
const ADMIN_PASSWORD = process.env.ADMIN_PASSWORD ?? 'admin@123';
const MASTER_SECRET = (() => {
    const p = join(KEY_DIR, 'master.key');
    mkdirSync(KEY_DIR, { recursive: true });
    if (existsSync(p)) return Buffer.from(readFileSync(p, 'utf8').trim(), 'hex');
    const b = randomBytes(32);
    writeFileSync(p, b.toString('hex'), { mode: 0o600 });
    return b;
})();

/** Ed25519 signing keypair; the public half is what the APK embeds. */
const SIGNING: KeyPair = (() => {
    const priv = join(KEY_DIR, 'signing.private.b64');
    const pub = join(KEY_DIR, 'signing.public.b64');
    mkdirSync(KEY_DIR, { recursive: true });
    if (existsSync(priv) && existsSync(pub)) {
        return { privateKeyB64: readFileSync(priv, 'utf8').trim(), publicKeyB64: readFileSync(pub, 'utf8').trim() };
    }
    const kp = generateSigningKeyPair();
    writeFileSync(priv, kp.privateKeyB64, { mode: 0o600 });
    writeFileSync(pub, kp.publicKeyB64, { mode: 0o644 });
    return kp;
})();

const store = new Store(DB_PATH, MASTER_SECRET);

// ---------------------------------------------------------------------------
// admin sessions
// ---------------------------------------------------------------------------

const ADMIN_HASH = scryptSync(ADMIN_PASSWORD, 'ride-accepter-admin-salt', 32);
const sessions = new Map<string, { at: number }>();
const SESSION_TTL = 12 * 60 * 60 * 1000;

function checkPassword(pw: string): boolean {
    const h = scryptSync(pw, 'ride-accepter-admin-salt', 32);
    return h.length === ADMIN_HASH.length && timingSafeEqual(h, ADMIN_HASH);
}

function adminFrom(req: IncomingMessage, url: URL): string | null {
    const cookie = req.headers.cookie ?? '';
    const m = /(?:^|;\s*)ra_admin=([A-Za-z0-9-]+)/.exec(cookie);
    const tok = m?.[1] ?? url.searchParams.get('tok') ?? req.headers['x-admin-token'] as string | undefined;
    if (!tok) return null;
    const s = sessions.get(tok);
    if (!s) return null;
    if (Date.now() - s.at > SESSION_TTL) {
        sessions.delete(tok);
        return null;
    }
    s.at = Date.now();
    return 'admin';
}

// ---------------------------------------------------------------------------
// http plumbing
// ---------------------------------------------------------------------------

/**
 * Content-type map for the Next static export in license/admin/ (measured
 * inventory: .js/.html/.txt/.png/.css/.ico/.webmanifest + fonts/source maps).
 * `.txt` files are Next RSC flight payloads fetched by the router during
 * client-side navigation — wrong content-type (or 404) breaks soft navigation.
 */
const MIME: Record<string, string> = {
    '.html': 'text/html; charset=utf-8',
    '.js': 'text/javascript; charset=utf-8',
    '.mjs': 'text/javascript; charset=utf-8',
    '.css': 'text/css; charset=utf-8',
    '.txt': 'text/plain; charset=utf-8',
    '.json': 'application/json; charset=utf-8',
    '.map': 'application/json',
    '.webmanifest': 'application/manifest+json',
    '.png': 'image/png',
    '.jpg': 'image/jpeg',
    '.gif': 'image/gif',
    '.svg': 'image/svg+xml',
    '.ico': 'image/x-icon',
    '.webp': 'image/webp',
    '.woff': 'font/woff',
    '.woff2': 'font/woff2',
    '.ttf': 'font/ttf',
};

function json(res: ServerResponse, code: number, body: unknown): void {
    const buf = Buffer.from(JSON.stringify(body, null, 2), 'utf8');
    res.writeHead(code, {
        'content-type': 'application/json; charset=utf-8',
        'content-length': buf.length,
        'cache-control': 'no-store',
    });
    res.end(buf);
}

const MAX_BODY = 256 * 1024;

function readBody(req: IncomingMessage, res: ServerResponse): Promise<Record<string, unknown>> {
    return new Promise((res2, rej) => {
        const chunks: Buffer[] = [];
        let size = 0;
        let settled = false;
        req.on('data', (c: Buffer) => {
            if (settled) return;
            size += c.length;
            if (size > MAX_BODY) {
                settled = true;
                // answer with a real status instead of resetting the socket
                if (!res.headersSent) json(res, 413, { error: 'body too large' });
                req.resume();
                rej(new Error('body too large'));
                return;
            }
            chunks.push(c);
        });
        req.on('end', () => {
            if (settled) return;
            settled = true;
            if (!chunks.length) return res2({});
            try {
                res2(JSON.parse(Buffer.concat(chunks).toString('utf8')));
            } catch {
                rej(new Error('invalid JSON body'));
            }
        });
        req.on('error', (e) => {
            if (!settled) {
                settled = true;
                rej(e);
            }
        });
    });
}

/**
 * Raw-body reader for the panel API: same 256 KiB cap / 413 semantics as
 * readBody, but returns the exact bytes (the Cashfree webhook needs them for
 * the HMAC check) and leaves JSON parsing to each route's zyqora semantics.
 */
function readRawBody(req: IncomingMessage, res: ServerResponse): Promise<string> {
    return new Promise((res2, rej) => {
        const chunks: Buffer[] = [];
        let size = 0;
        let settled = false;
        req.on('data', (c: Buffer) => {
            if (settled) return;
            size += c.length;
            if (size > MAX_BODY) {
                settled = true;
                if (!res.headersSent) json(res, 413, { error: 'body too large' });
                req.resume();
                rej(new Error('body too large'));
                return;
            }
            chunks.push(c);
        });
        req.on('end', () => {
            if (settled) return;
            settled = true;
            res2(Buffer.concat(chunks).toString('utf8'));
        });
        req.on('error', (e) => {
            if (!settled) {
                settled = true;
                rej(e);
            }
        });
    });
}

/** Strict JSON parse — throws on malformed input (routes that mirror a bare `await req.json()`). */
function parseJsonStrict(raw: string): Record<string, unknown> {
    if (!raw.trim()) throw new Error('invalid JSON body');
    return JSON.parse(raw);
}

/** Lenient JSON parse — zyqora's `req.json().catch(() => ({}))` routes. */
function parseJsonLenient(raw: string): Record<string, unknown> {
    if (!raw.trim()) return {};
    try {
        return JSON.parse(raw);
    } catch {
        return {};
    }
}

function serveStatic(res: ServerResponse, rel: string): void {
    // path traversal guard: resolve and require the result to stay in ADMIN_DIR
    const target0 = resolve(ADMIN_DIR, '.' + (rel === '/' ? '/index.html' : rel));
    if (target0 !== ADMIN_DIR && !target0.startsWith(ADMIN_DIR + sep)) {
        json(res, 403, { error: 'forbidden' });
        return;
    }
    // directory-index resolution for the trailingSlash static export:
    // '/login/' or '/login' -> login/index.html (RSC .txt files are exact paths)
    let target = target0;
    if (existsSync(target) && statSync(target).isDirectory()) {
        target = resolve(target, 'index.html');
    }
    if (target !== ADMIN_DIR && !target.startsWith(ADMIN_DIR + sep)) {
        json(res, 403, { error: 'forbidden' });
        return;
    }
    // unknown paths fall through to 404 (no SPA fallback: trailingSlash export)
    if (!existsSync(target) || !statSync(target).isFile()) {
        json(res, 404, { error: 'not found' });
        return;
    }
    const body = readFileSync(target);
    res.writeHead(200, {
        'content-type': MIME[extname(target)] ?? 'application/octet-stream',
        'content-length': body.length,
        // revalidate every time: a cached stale UI masks exactly the kind of
        // CSS bug this dashboard has already had once
        'cache-control': 'no-cache',
        'x-content-type-options': 'nosniff',
    });
    res.end(body);
}

const asPlan = (v: unknown): PlanType =>
    v === 'DAY' || v === 'WEEK' || v === 'HALF_MONTH' || v === 'MONTH' || v === 'YEAR' ? v : 'MONTH';

// ===========================================================================
// AcceptPro admin-panel API (ADMIN-PORT.md §5)
//
// Every route below mirrors its zyqora-admin `app/api/**/route.js` exactly —
// same path, method, auth level, status codes, response shapes and verbatim
// error strings (byte-exact including –, —, ₹). The engine underneath is the
// AcceptPro RA- key core (ADMIN-PORT.md §2): generate/convert/checkout mint
// REAL keys via Store.createLicenses, commercial fields live in license_meta,
// and every mutation path syncs the engine record AND its meta row.
// ===========================================================================

const PANEL_PREFIXES = [
    '/api/auth/',
    '/api/admins/',
    '/api/affiliates/',
    '/api/licenses/',
    '/api/expenses',
    '/api/withdrawals',
    '/api/sales',
    '/api/stats',
    '/api/logs',
    '/api/settings/',
    '/api/checkout/',
    '/api/whitelabel/',
];

function isPanelApiPath(path: string): boolean {
    return PANEL_PREFIXES.some((p) => (p.endsWith('/') ? path.startsWith(p) : path === p || path.startsWith(`${p}/`)));
}

function denyError(res: ServerResponse, r: { error: string; status: number }): void {
    json(res, r.status, { error: r.error });
}

/** Old /api/admin/* auth extension: Bearer JWT for roles super|admin. */
function bearerPanelActor(req: IncomingMessage): string | null {
    const session = getSession(req);
    if (!session) return null;
    if (session.role !== 'super' && session.role !== 'admin') return null;
    return session.username || 'admin';
}

/** zyqora lib/logs.js saveLog mirror (panel_logs ring, max 1000). */
function panelLog(entry: {
    action: string;
    actorId: string;
    actorName: string;
    actorRole: string;
    ts?: number;
    flag?: string | null;
    meta: Record<string, unknown>;
}): void {
    store.savePanelLog({
        id: randomUUID(),
        action: entry.action,
        actorId: entry.actorId,
        actorName: entry.actorName,
        actorRole: entry.actorRole,
        ts: entry.ts ?? Math.floor(Date.now() / 1000),
        flag: entry.flag ?? null,
        meta: entry.meta,
    });
}

/** Lazy-seed: creates the super admin from env vars if no admins exist yet (ADMIN-PORT.md §3). */
function ensureSuperAdmin(): void {
    if (store.listAdminUsers().length !== 0) return;
    const username = (process.env.ADMIN_USERNAME || 'admin').toLowerCase();
    const pass = process.env.ADMIN_PASSWORD || 'changeme123';
    store.saveAdminUser({
        id: randomUUID(),
        username,
        passwordHash: hashPassword(pass),
        role: 'super',
        createdBy: null,
        createdByName: null,
        createdAt: Math.floor(Date.now() / 1000),
        active: true,
    });
}

const DEFAULT_FEATURES = {
    mobile: true,
    trustBuilder: true,
    autoReply: true,
    chatbot: true,
    liveChat: true,
    groupGrabber: true,
    aiAutomation: true,
    forms: true,
};

const toNum = (v: unknown): number => {
    const n = Number(v);
    return Number.isFinite(n) ? n : NaN;
};

/**
 * Mint one REAL RA- key through the engine (ADMIN-PORT.md §2 mapping) with
 * zyqora's bounded same-second collision retry: RA- keys carry 115 random bits
 * so a keyHash collision is astronomically unlikely, but a collision would
 * overwrite an existing licence — so regenerate rather than trust luck.
 */
function mintEngineKey(
    actor: string,
    opts: {
        planType: PlanType;
        durationDays: number;
        maxDevices: number;
        deviceCodes: string[];
        note: string;
    },
): { key: string; record: LicenseRecord } {
    let created = store.createLicenses(actor, { count: 1, ...opts })[0];
    for (let tries = 0; tries < 5 && store.getLicenseMeta(created.record.keyHash); tries++) {
        created = store.createLicenses(actor, { count: 1, ...opts })[0];
    }
    return created;
}

async function handlePanel(req: IncomingMessage, res: ServerResponse, url: URL, method: string, path: string): Promise<void> {
    let m: RegExpExecArray | null;

    // ---- /api/auth/login (public) ------------------------------------------
    if (path === '/api/auth/login' && method === 'POST') {
        try {
            const b = parseJsonStrict(await readRawBody(req, res));
            const username = String(b.username ?? '');
            const password = String(b.password ?? '');
            if (!username || !password) {
                json(res, 400, { error: 'Username and password required' });
                return;
            }

            ensureSuperAdmin();

            // Try admin first, then affiliate, then whitelabel client
            const account = store.findPanelAccount(username);
            if (!account || !account.record.active) {
                json(res, 401, { error: 'Invalid credentials' });
                return;
            }
            const valid = verifyPassword(password, account.record.passwordHash);
            if (!valid) {
                json(res, 401, { error: 'Invalid credentials' });
                return;
            }

            const role = account.kind === 'affiliate' ? 'affiliate' : account.kind === 'whitelabel' ? 'whitelabel' : account.record.role;
            const token = signToken({ sub: account.record.id, username: account.record.username, role });
            const name = (account.record as { name?: string }).name || null;
            json(res, 200, { token, username: account.record.username, role, name });
        } catch (err) {
            console.error('Login error:', err);
            json(res, 500, { error: 'Server error' });
        }
        return;
    }

    // ---- /api/auth/me (any session) ----------------------------------------
    if (path === '/api/auth/me' && method === 'GET') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const admin = store.getAdminUser(session.sub);
        if (admin) {
            const { passwordHash: _, ...safe } = admin;
            // role comes from the verified JWT — whitelabel/affiliate records
            // don't store one, and clients cache this response as their session
            // user, so it must always be present.
            json(res, 200, { ...safe, role: session.role });
            return;
        }
        // Whitelabel clients use the same panel — return their live record plus
        // current quota usage and partnership countdown so the UI can reflect
        // super-admin changes instantly.
        const whitelabel = store.getWhitelabel(session.sub);
        if (whitelabel?.id && whitelabel.username) {
            const { passwordHash: _, ...safe } = whitelabel;
            const used = store.countIssuedLicenses(whitelabel.id);
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
        return;
    }

    // ---- /api/admins/* (super) ---------------------------------------------
    if (path === '/api/admins/create' && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const b = parseJsonStrict(await readRawBody(req, res));
        const username = String(b.username ?? '');
        const password = String(b.password ?? '');
        const role = b.role;
        if (!username.trim() || !password) {
            json(res, 400, { error: 'username and password are required' });
            return;
        }

        const uname = username.trim().toLowerCase();
        // All three account types log in through the same endpoint (admin is tried
        // first), so a username must be unique across admins, affiliates AND
        // whitelabel clients — otherwise the shadowed account gets locked out.
        if (store.usernameTaken(uname)) {
            json(res, 409, { error: 'Username already exists' });
            return;
        }

        const admin: AdminUserRecord = {
            id: randomUUID(),
            username: uname,
            passwordHash: hashPassword(password),
            role: role === 'super' ? 'super' : 'admin',
            createdBy: session.sub,
            createdByName: session.username,
            createdAt: Math.floor(Date.now() / 1000),
            active: true,
        };
        store.saveAdminUser(admin);
        const { passwordHash: _, ...safe } = admin;
        json(res, 201, { success: true, admin: safe });
        return;
    }

    if (path === '/api/admins/list' && method === 'GET') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const result = store.listAdminUsers().map((a) => {
            const { passwordHash: _, ...safe } = a;
            return { ...safe, licenseCount: store.listIssuerLicenseMeta(a.id).length };
        });
        // Newest first
        result.sort((a, b) => (b.createdAt || 0) - (a.createdAt || 0));
        json(res, 200, result);
        return;
    }

    if ((m = /^\/api\/admins\/([^/]+)\/change-password$/.exec(path)) && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const b = parseJsonStrict(await readRawBody(req, res));
        const password = String(b.password ?? '');
        if (!password || password.length < 6) {
            json(res, 400, { error: 'Password must be at least 6 characters' });
            return;
        }
        const admin = store.getAdminUser(m[1]);
        if (!admin) {
            json(res, 404, { error: 'Admin not found' });
            return;
        }
        store.saveAdminUser({ ...admin, passwordHash: hashPassword(password) });
        json(res, 200, { success: true });
        return;
    }

    if ((m = /^\/api\/admins\/([^/]+)\/licenses$/.exec(path)) && method === 'GET') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const admin = store.getAdminUser(m[1]);
        if (!admin) {
            json(res, 404, { error: 'Admin not found' });
            return;
        }
        json(res, 200, {
            admin: { id: admin.id, username: admin.username, role: admin.role },
            licenses: store.listWireLicenses(m[1]),
        });
        return;
    }

    if ((m = /^\/api\/admins\/([^/]+)\/toggle$/.exec(path)) && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const admin = store.getAdminUser(m[1]);
        if (!admin) {
            json(res, 404, { error: 'Admin not found' });
            return;
        }
        if (admin.id === session.sub) {
            json(res, 400, { error: 'Cannot deactivate your own account' });
            return;
        }
        const updated = { ...admin, active: !admin.active };
        store.saveAdminUser(updated);
        json(res, 200, { success: true, active: updated.active });
        return;
    }

    if ((m = /^\/api\/admins\/([^/]+)\/update-share$/.exec(path)) && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const admin = store.getAdminUser(m[1]);
        if (!admin) {
            json(res, 404, { error: 'Admin not found' });
            return;
        }
        const body = parseJsonLenient(await readRawBody(req, res));
        const sharePercent = parseFloat(body.sharePercent as string);
        // EN DASH in 'sharePercent must be 0–100' is byte-verbatim (spec §3)
        if (!Number.isFinite(sharePercent) || sharePercent < 0 || sharePercent > 100) {
            json(res, 400, { error: 'sharePercent must be 0–100' });
            return;
        }
        const updated = { ...admin, sharePercent };
        store.saveAdminUser(updated);
        const { passwordHash: _, ...safe } = updated;
        json(res, 200, { success: true, admin: safe });
        return;
    }

    // ---- /api/affiliates/* --------------------------------------------------
    if (path === '/api/affiliates/create' && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const b = parseJsonStrict(await readRawBody(req, res));
        const username = String(b.username ?? '').trim().toLowerCase();
        const name = String(b.name ?? '').trim();
        const password = String(b.password ?? '').trim();
        const commission = Math.max(0, Math.min(100, parseFloat(b.commission as string) || 0));

        if (!username) {
            json(res, 400, { error: 'Username is required' });
            return;
        }
        if (!name) {
            json(res, 400, { error: 'Display name is required' });
            return;
        }
        if (!password || password.length < 6) {
            json(res, 400, { error: 'Password must be at least 6 characters' });
            return;
        }
        // All account types share one login endpoint — a username must be unique
        // across admins, affiliates and whitelabel clients.
        if (store.usernameTaken(username)) {
            json(res, 409, { error: 'Username already taken' });
            return;
        }

        const affiliate: AffiliateRecord = {
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
        store.saveAffiliate(affiliate);
        const { passwordHash: _, ...safe } = affiliate;
        json(res, 201, { success: true, affiliate: safe });
        return;
    }

    if (path === '/api/affiliates/list' && method === 'GET') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        // Affiliates themselves and whitelabel resellers cannot call this;
        // only admin/super
        if (session.role !== 'super' && session.role !== 'admin') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }
        const result = store
            .listAffiliates()
            .map((a) => ({
                id: a.id,
                username: a.username,
                name: a.name,
                commission: a.commission,
                active: a.active,
                createdBy: a.createdBy,
                createdByName: a.createdByName,
                createdAt: a.createdAt,
            }))
            .sort((a, b) => a.name.localeCompare(b.name));
        json(res, 200, result);
        return;
    }

    if (path === '/api/affiliates/stats' && method === 'GET') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        // Must be affiliate or super
        if (session.role !== 'affiliate' && session.role !== 'super') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }
        const targetId = session.role === 'super' ? (url.searchParams.get('affiliateId') || session.sub) : session.sub;

        const affiliate = store.getAffiliate(targetId);
        const payments = store.listAffiliatePayments(targetId);
        if (!affiliate) {
            json(res, 404, { error: 'Affiliate not found' });
            return;
        }

        const nowTs = Math.floor(Date.now() / 1000);
        const allLicenses = store.listWireLicenses();
        const mine = allLicenses
            .filter((l) => l.affiliateId === targetId)
            .filter((l) => !(l.revoked && String(l.revokedReason ?? '').startsWith('Converted to')));

        const result = mine
            .map((l) => {
                const isExpired = !l.isLifetime && (Number(l.expiryTs) || 0) <= nowTs;
                const isRevoked = !!l.revoked;
                const isTrial = l.plan === 'trial' || l.plan === 'trial1day';
                const price = Math.max(0, parseFloat(String(l.discountedPrice ?? l.price)) || 0);
                const status = isRevoked ? 'revoked' : isExpired ? 'expired' : 'active';
                const converted = !isTrial && price > 0;

                return {
                    key: l.key,
                    clientName: l.clientName || '',
                    clientPhone: l.clientPhone || '',
                    plan: l.plan || '',
                    price,
                    issuedAt: l.issuedAt,
                    status,
                    isTrial,
                    converted,
                    issuedByName: l.issuedByName || '',
                };
            })
            .sort((a, b) => (Number(b.issuedAt) || 0) - (Number(a.issuedAt) || 0));

        const stats = affiliateStatsFormulas(result, payments, affiliate.commission);
        json(res, 200, {
            affiliate: {
                id: affiliate.id,
                name: affiliate.name,
                username: affiliate.username,
                commission: affiliate.commission,
            },
            stats,
            licenses: result,
            payments,
        });
        return;
    }

    if (path === '/api/affiliates/payments/list' && method === 'GET') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        if (session.role !== 'super' && session.role !== 'admin') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }
        json(res, 200, { payments: store.listAllPayments() });
        return;
    }

    if ((m = /^\/api\/affiliates\/payments\/([^/]+)$/.exec(path)) && method === 'PUT') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        if (session.role !== 'super' && session.role !== 'admin') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }
        const existing = store.getPayment(m[1]);
        if (!existing) {
            json(res, 404, { error: 'Payment not found' });
            return;
        }
        const body = parseJsonLenient(await readRawBody(req, res));
        const amount = parseFloat(body.amount as string);
        if (!amount || amount <= 0) {
            json(res, 400, { error: 'Amount must be greater than 0' });
            return;
        }
        const updated: PaymentRecord = {
            ...existing,
            amount,
            note: (body.note ?? existing.note ?? '').toString().trim().slice(0, 200),
            paidAt: body.paidAt ? Number(body.paidAt) : existing.paidAt,
            updatedAt: Math.floor(Date.now() / 1000),
            updatedBy: session.sub,
            updatedByName: session.name || session.username || session.sub,
        };
        store.savePayment(updated);
        json(res, 200, { success: true, payment: updated });
        return;
    }

    if ((m = /^\/api\/affiliates\/([^/]+)\/change-password$/.exec(path)) && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const b = parseJsonStrict(await readRawBody(req, res));
        const password = String(b.password ?? '').trim();
        if (!password || password.length < 6) {
            json(res, 400, { error: 'Password must be at least 6 characters' });
            return;
        }
        const affiliate = store.getAffiliate(m[1]);
        if (!affiliate) {
            json(res, 404, { error: 'Affiliate not found' });
            return;
        }
        store.saveAffiliate({ ...affiliate, passwordHash: hashPassword(password) });
        json(res, 200, { success: true });
        return;
    }

    if ((m = /^\/api\/affiliates\/([^/]+)\/delete$/.exec(path)) && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const affiliate = store.getAffiliate(m[1]);
        if (!affiliate) {
            json(res, 404, { error: 'Affiliate not found' });
            return;
        }
        store.deleteAffiliate(affiliate);
        json(res, 200, { success: true });
        return;
    }

    if ((m = /^\/api\/affiliates\/([^/]+)\/pay$/.exec(path)) && method === 'POST') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        if (session.role !== 'super' && session.role !== 'admin') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }
        const affiliate = store.getAffiliate(m[1]);
        if (!affiliate) {
            json(res, 404, { error: 'Affiliate not found' });
            return;
        }
        const body = parseJsonLenient(await readRawBody(req, res));
        const amount = parseFloat(body.amount as string);
        if (!amount || amount <= 0) {
            json(res, 400, { error: 'Amount must be greater than 0' });
            return;
        }
        const payment: PaymentRecord = {
            id: `pay_${Date.now()}_${Math.random().toString(36).slice(2, 8)}`,
            affiliateId: affiliate.id,
            affiliateName: affiliate.name,
            amount,
            note: String(body.note || '').trim().slice(0, 200),
            paidBy: session.sub,
            paidByName: session.name || session.username || session.sub,
            paidAt: Math.floor(Date.now() / 1000),
        };
        store.savePayment(payment);
        json(res, 200, { success: true, payment });
        return;
    }

    if ((m = /^\/api\/affiliates\/([^/]+)\/payments$/.exec(path)) && method === 'GET') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        // Super, admin can view any affiliate's payments; affiliate can only view their own
        if (session.role === 'affiliate' && session.sub !== m[1]) {
            json(res, 403, { error: 'Forbidden' });
            return;
        }
        if (session.role !== 'super' && session.role !== 'admin' && session.role !== 'affiliate') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }
        json(res, 200, { payments: store.listAffiliatePayments(m[1]) });
        return;
    }

    if ((m = /^\/api\/affiliates\/([^/]+)\/toggle$/.exec(path)) && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const affiliate = store.getAffiliate(m[1]);
        if (!affiliate) {
            json(res, 404, { error: 'Affiliate not found' });
            return;
        }
        if (affiliate.id === session.sub) {
            json(res, 400, { error: 'Cannot deactivate yourself' });
            return;
        }
        const updated = { ...affiliate, active: !affiliate.active };
        store.saveAffiliate(updated);
        json(res, 200, { success: true, active: updated.active });
        return;
    }

    if ((m = /^\/api\/affiliates\/([^/]+)\/update-commission$/.exec(path)) && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const b = parseJsonStrict(await readRawBody(req, res));
        const commission = parseFloat(b.commission as string);
        // EN DASH in 'Commission must be 0–100' is byte-verbatim (spec §3)
        if (!Number.isFinite(commission) || commission < 0 || commission > 100) {
            json(res, 400, { error: 'Commission must be 0–100' });
            return;
        }
        const affiliate = store.getAffiliate(m[1]);
        if (!affiliate) {
            json(res, 404, { error: 'Affiliate not found' });
            return;
        }
        store.saveAffiliate({ ...affiliate, commission });
        json(res, 200, { success: true, commission });
        return;
    }

    // ---- /api/licenses/* ----------------------------------------------------
    if (path === '/api/licenses/generate' && method === 'POST') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const b = parseJsonStrict(await readRawBody(req, res));
        const {
            clientName,
            clientPhone,
            clientEmail,
            machineId,
            plan,
            deviceLimit,
            customDays,
            notes,
            price,
            discountedPrice,
            features,
            businessCategory,
            website,
            affiliateId,
            affiliateName,
            reviewAccess,
        } = b as Record<string, any>;
        const licenseMode = (b.licenseMode as string) ?? 'desktop';

        // Cloud licenses use no device identity at all instead of a real
        // device — every other mode (desktop, app) is bound to one specific
        // device's code and requires it up front (weaker zyqora rule kept:
        // presence only; binding hashes with hashDeviceCode).
        if (
            !(LICENSE_MODES as string[]).includes(licenseMode) ||
            (licenseMode !== 'cloud' && !String(machineId ?? '').trim()) ||
            !plan ||
            !String(clientName ?? '').trim()
        ) {
            json(res, 400, { error: 'clientName, license mode and plan are required' });
            return;
        }

        // Whitelabel resellers: enforce the live allow-list of license types,
        // the allowed key durations, the per-key device cap and the issue quota
        // against their current record, so super-admin changes apply immediately.
        // No affiliate attribution or reviewer keys either.
        let whitelabel: WhitelabelRecord | null = null;
        if (session.role === 'whitelabel') {
            whitelabel = store.getWhitelabel(session.sub);
            if (!whitelabel || !whitelabel.active) {
                json(res, 403, { error: 'Whitelabel account is inactive' });
                return;
            }
            if (whitelabel.partnershipEndTs && whitelabel.partnershipEndTs <= Math.floor(Date.now() / 1000)) {
                json(res, 403, { error: 'Your whitelabel partnership has expired. Contact the administrator to renew.' });
                return;
            }
            const allowed = Array.isArray(whitelabel.allowedModes) ? whitelabel.allowedModes : [];
            if (!allowed.includes(licenseMode)) {
                json(res, 403, { error: `License type "${licenseMode}" is not allowed for this account` });
                return;
            }
            const allowedPlans = resolveWlPlans(whitelabel);
            if (!allowedPlans.includes(plan)) {
                json(res, 403, { error: `Key duration "${plan}" is not allowed for this account` });
                return;
            }
            if (affiliateId) {
                json(res, 403, { error: 'Affiliate attribution is not available for whitelabel accounts' });
                return;
            }
            const used = store.countIssuedLicenses(session.sub);
            if (used >= (whitelabel.licenseLimit || 0)) {
                json(res, 403, {
                    error: `License limit reached (${used}/${whitelabel.licenseLimit || 0}). Contact the administrator to raise your limit.`,
                });
                return;
            }
        }

        const dl = Math.max(1, Math.min(255, parseInt(deviceLimit) || 1));
        if (whitelabel) {
            const maxDevices = resolveWlMaxDevices(whitelabel);
            if (dl > maxDevices) {
                json(res, 403, { error: `Device limit ${dl} exceeds your maximum of ${maxDevices} per key` });
                return;
            }
        }

        // ADMIN-PORT.md §2 engine mapping (zyqora label -> planType/durationDays)
        const isLifetime = plan === 'lifetime';
        const e = enginePlan(plan, customDays);
        const issuedAt = Math.floor(Date.now() / 1000);
        const expiryTs = metaExpiryTs(plan, customDays, issuedAt);
        const boundCode = licenseMode === 'cloud' ? '' : String(machineId ?? '').trim();
        const created = mintEngineKey(`admin:${session.username}`, {
            planType: e.planType,
            durationDays: e.durationDays,
            // desktop/app: pre-bound to exactly the codes it was minted for
            // (engine maxDevices 1); cloud: no binding, engine cap 10
            maxDevices: licenseMode === 'cloud' ? Math.min(10, Math.max(1, dl)) : 1,
            deviceCodes: licenseMode === 'cloud' ? [] : [boundCode],
            note: String(notes ?? '').trim(),
        });

        const { price: priceNum, discountedPrice: discountedNum, discountAmount } = priceFields(price, discountedPrice);

        const meta: LicenseMetaRecord = {
            // SECRETS POLICY: `key` holds the DISPLAY PREFIX — the plaintext is
            // unsealed on demand for the wire only (ADMIN-PORT.md §4)
            keyHash: created.record.keyHash,
            key: keyPrefixOf(created.key),
            plan,
            deviceLimit: dl,
            expiryTs,
            isLifetime,
            price: priceNum,
            discountedPrice: discountedNum,
            discountAmount,
            licenseMode,
            machineId: licenseMode === 'cloud' ? null : displayDeviceCode(boundCode),
            clientName: String(clientName).trim(),
            clientPhone: String(clientPhone || '').trim(),
            clientEmail: String(clientEmail || '').trim(),
            businessCategory: String(businessCategory || '').trim(),
            website: String(website || '').trim() || 'No website',
            notes: String(notes || '').trim(),
            features: features || DEFAULT_FEATURES,
            affiliateId: affiliateId || null,
            affiliateName: affiliateName || null,
            affiliateCommissionAmount: null, // filled below
            // Store-review / test access only — restricted to super admins
            // server-side too (the UI already hides the checkbox).
            reviewAccess: reviewAccess === true && session.role === 'super',
            // Whitelabel marker — lets sales/stats exclude reseller-issued
            // licenses from direct revenue while the licenses page shows them
            whitelabelName: whitelabel ? whitelabel.name || whitelabel.username : null,
            issuedBy: session.sub,
            issuedByName: whitelabel ? whitelabel.name || session.username : session.username,
            issuedAt,
            activated: false,
            activatedAt: null,
            revoked: false,
            revokedBy: null,
            revokedByName: null,
            revokedAt: null,
            revokedReason: null,
        };
        if (whitelabel) meta.whitelabelIssued = true;

        if (affiliateId) {
            const aff = store.getAffiliate(String(affiliateId));
            if (aff) {
                const revenue = attributedRevenue(priceNum, discountedNum);
                meta.affiliateCommissionAmount = commissionAmount(revenue, aff.commission);
            }
        }

        store.saveLicenseMeta(meta);

        panelLog({
            action: 'LICENSE_GENERATED',
            actorId: session.sub,
            actorName: session.username,
            actorRole: session.role,
            ts: meta.issuedAt,
            flag: null,
            meta: {
                key: meta.key,
                clientName: meta.clientName,
                clientPhone: meta.clientPhone || '',
                plan: meta.plan,
                price: meta.price,
                discountedPrice: meta.discountedPrice,
                deviceLimit: meta.deviceLimit,
                issuedByName: meta.issuedByName,
                affiliateId: meta.affiliateId || null,
                affiliateName: meta.affiliateName || null,
            },
        });

        json(res, 200, { success: true, key: created.key, license: store.licenseWire(meta) });
        return;
    }

    if (path === '/api/licenses/list' && method === 'GET') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const list = session.role === 'super' ? store.listWireLicenses() : store.listWireLicenses(session.sub);
        json(res, 200, list);
        return;
    }

    if (path === '/api/licenses/update' && method === 'POST') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const b = parseJsonStrict(await readRawBody(req, res));
        const {
            key,
            clientName,
            clientPhone,
            clientEmail,
            businessCategory,
            website,
            price,
            notes,
            features,
            validationException,
            affiliateId,
            affiliateName,
        } = b as Record<string, any>;
        if (!key) {
            json(res, 400, { error: 'key is required' });
            return;
        }

        const rec = store.findByKey(String(key).trim());
        const meta = rec ? store.ensureLicenseMeta(rec.keyHash) : null;
        if (!rec || !meta) {
            json(res, 404, { error: 'License not found' });
            return;
        }

        // Admins and whitelabel resellers can only edit licenses they issued —
        // same rule the revoke and convert endpoints already enforce.
        if (session.role !== 'super' && meta.issuedBy !== session.sub) {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        const canSetValidationException = session.role === 'super' && validationException !== undefined;
        const nextValidationException = canSetValidationException ? !!validationException : meta.validationException;

        const updated: LicenseMetaRecord = {
            ...meta,
            ...(clientName !== undefined ? { clientName: String(clientName).trim() } : {}),
            ...(clientPhone !== undefined ? { clientPhone: String(clientPhone).trim() } : {}),
            ...(clientEmail !== undefined ? { clientEmail: String(clientEmail).trim() } : {}),
            ...(businessCategory !== undefined ? { businessCategory: String(businessCategory).trim() } : {}),
            ...(website !== undefined ? { website: String(website).trim() || 'No website' } : {}),
            // Price and notes are also opt-in: a partial update that omits them
            // must not silently zero the price or wipe the notes.
            ...(price !== undefined ? { price: Math.max(0, parseFloat(price) || 0) } : {}),
            ...(notes !== undefined ? { notes: String(notes).trim() } : {}),
            ...(features !== undefined ? { features } : {}),
            ...(session.role === 'super' && affiliateId !== undefined
                ? { affiliateId: affiliateId || null, affiliateName: affiliateName || null }
                : {}),
            ...(canSetValidationException ? { validationException: nextValidationException } : {}),
            // When a super admin touches exception mode, reset bound machine so it can re-bind cleanly.
            ...(canSetValidationException ? { exceptionBoundMachineId: null } : {}),
        };

        // Recompute affiliateCommissionAmount when affiliate is changed by super
        if (session.role === 'super' && affiliateId !== undefined) {
            if (affiliateId) {
                const aff = store.getAffiliate(String(affiliateId));
                if (aff) {
                    const revenue = (updated.discountedPrice > 0 ? updated.discountedPrice : updated.price) || 0;
                    updated.affiliateCommissionAmount = commissionAmount(revenue, aff.commission);
                } else {
                    updated.affiliateCommissionAmount = null;
                }
            } else {
                // affiliate removed
                updated.affiliateCommissionAmount = null;
            }
        }

        store.saveLicenseMeta(updated);
        json(res, 200, { success: true, license: store.licenseWire(updated) });
        return;
    }

    if (path === '/api/licenses/revoke' && method === 'POST') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const b = parseJsonStrict(await readRawBody(req, res));
        const { key, reason } = b as Record<string, any>;
        if (!key) {
            json(res, 400, { error: 'key required' });
            return;
        }

        const rec = store.findByKey(String(key));
        const meta = rec ? store.ensureLicenseMeta(rec.keyHash) : null;
        if (!rec || !meta) {
            json(res, 404, { error: 'License not found' });
            return;
        }

        // Admins can only revoke their own licenses
        if (session.role !== 'super' && meta.issuedBy !== session.sub) {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        const revokedAt = Math.floor(Date.now() / 1000);
        // integration seam: "die on revoke" — the app validates against the
        // ENGINE, so the engine status flips together with the meta row
        store.revoke(`admin:${session.username}`, rec.keyHash);
        store.saveLicenseMeta({
            ...meta,
            revoked: true,
            revokedBy: session.sub,
            revokedByName: session.username,
            revokedAt,
            revokedReason: String(reason || '').trim(),
        });

        panelLog({
            action: 'LICENSE_REVOKED',
            actorId: session.sub,
            actorName: session.username,
            actorRole: session.role,
            ts: revokedAt,
            flag: null,
            meta: {
                key: meta.key,
                clientName: meta.clientName || '',
                clientPhone: meta.clientPhone || '',
                plan: meta.plan || '',
                price: Math.max(0, parseFloat(String(meta.price)) || 0),
                issuedByName: meta.issuedByName || '',
                reason: String(reason || '').trim(),
            },
        });

        json(res, 200, { success: true });
        return;
    }

    if (path === '/api/licenses/delete' && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const b = parseJsonStrict(await readRawBody(req, res));
        const { key } = b as Record<string, any>;
        if (!key) {
            json(res, 400, { error: 'key required' });
            return;
        }

        const rec = store.findByKey(String(key));
        const meta = rec ? store.getLicenseMeta(rec.keyHash) : null;
        if (!rec || !meta) {
            json(res, 404, { error: 'License not found' });
            return;
        }

        const price = Math.max(0, parseFloat(String(meta.price)) || 0);
        const discounted =
            meta.discountedPrice !== undefined && meta.discountedPrice !== null
                ? Math.min(price, Math.max(0, parseFloat(String(meta.discountedPrice)) || 0))
                : price;

        // integration seam: engine record + devices + meta row all go
        store.deleteLicense(`admin:${session.username}`, rec.keyHash);
        store.deleteLicenseMeta(rec.keyHash);

        panelLog({
            action: 'LICENSE_DELETED',
            actorId: session.sub,
            actorName: session.username,
            actorRole: session.role,
            ts: Math.floor(Date.now() / 1000),
            flag: price > 0 ? 'warning' : null,
            meta: {
                key: meta.key,
                clientName: meta.clientName || '',
                clientPhone: meta.clientPhone || '',
                plan: meta.plan || '',
                price,
                discountedPrice: discounted,
                issuedByName: meta.issuedByName || '',
                issuedAt: meta.issuedAt || null,
                revoked: meta.revoked || false,
                revokedReason: meta.revokedReason || '',
                // RUPEE SIGN + EM DASH are byte-verbatim (spec §7)
                note: price > 0 ? `License had amount ₹${discounted} — this figure is now removed from sales totals.` : null,
            },
        });

        json(res, 200, { success: true });
        return;
    }

    if (path === '/api/licenses/convert' && method === 'POST') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const b = parseJsonStrict(await readRawBody(req, res));
        const { oldKey, plan, deviceLimit, customDays, price, discountedPrice, notes, features, machineId: machineIdOverride } = b as Record<string, any>;

        if (!oldKey) {
            json(res, 400, { error: 'oldKey required' });
            return;
        }
        if (!plan) {
            json(res, 400, { error: 'plan required' });
            return;
        }

        const oldRec = store.findByKey(String(oldKey));
        const oldMeta = oldRec ? store.ensureLicenseMeta(oldRec.keyHash) : null;
        if (!oldRec || !oldMeta) {
            json(res, 404, { error: 'Original license not found' });
            return;
        }

        // Admins can only convert their own licenses
        if (session.role !== 'super' && oldMeta.issuedBy !== session.sub) {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        // Whitelabel resellers: the converted license keeps its original type, so
        // that type must still be allowed, and the target plan + device limit must
        // be within what the super admin granted. Quota-wise a conversion is
        // net-neutral when the old key was counting (it stops counting once
        // revoked as "Converted to …"), otherwise it consumes one extra slot.
        let whitelabel: WhitelabelRecord | null = null;
        const convertedMode = oldMeta.licenseMode || 'desktop';
        const oldRevoked = oldRec.status === 'revoked';
        if (session.role === 'whitelabel') {
            whitelabel = store.getWhitelabel(session.sub);
            if (!whitelabel || !whitelabel.active) {
                json(res, 403, { error: 'Whitelabel account is inactive' });
                return;
            }
            if (whitelabel.partnershipEndTs && whitelabel.partnershipEndTs <= Math.floor(Date.now() / 1000)) {
                json(res, 403, { error: 'Your whitelabel partnership has expired. Contact the administrator to renew.' });
                return;
            }
            const allowed = Array.isArray(whitelabel.allowedModes) ? whitelabel.allowedModes : [];
            if (!allowed.includes(convertedMode)) {
                json(res, 403, { error: `License type "${convertedMode}" is no longer allowed for this account` });
                return;
            }
            const allowedPlans = resolveWlPlans(whitelabel);
            if (!allowedPlans.includes(plan)) {
                json(res, 403, { error: `Key duration "${plan}" is not allowed for this account` });
                return;
            }
            const oldWasCounted = !(
                oldRevoked &&
                typeof oldMeta.revokedReason === 'string' &&
                oldMeta.revokedReason.startsWith('Converted to')
            );
            if (!oldWasCounted) {
                const used = store.countIssuedLicenses(session.sub);
                if (used >= (whitelabel.licenseLimit || 0)) {
                    json(res, 403, {
                        error: `License limit reached (${used}/${whitelabel.licenseLimit || 0}). Contact the administrator to raise your limit.`,
                    });
                    return;
                }
            }
        }

        // Must not already be a converted (non-trial paid) license
        const isTrial = oldMeta.plan === 'trial' || oldMeta.plan === 'trial1day';
        const wasFreePlan = !isTrial && (parseFloat(String(oldMeta.price)) || 0) === 0;
        if (!isTrial && !wasFreePlan && !oldRevoked) {
            json(res, 400, { error: 'Only trial or free licenses can be converted' });
            return;
        }

        const dl = Math.max(1, Math.min(255, parseInt(deviceLimit) || 1));
        if (whitelabel) {
            const maxDevices = resolveWlMaxDevices(whitelabel);
            if (dl > maxDevices) {
                json(res, 403, { error: `Device limit ${dl} exceeds your maximum of ${maxDevices} per key` });
                return;
            }
        }

        const isLifetime = plan === 'lifetime';
        const e = enginePlan(plan, customDays);
        const nowTs = Math.floor(Date.now() / 1000);
        const expiryTs = metaExpiryTs(plan, customDays, nowTs);
        // Carry the original license's type through — a converted cloud/app
        // trial must not silently become a desktop-style key.
        const licenseMode = convertedMode;
        const resolvedMachineId =
            licenseMode === 'cloud'
                ? null
                : machineIdOverride && String(machineIdOverride).trim()
                  ? displayDeviceCode(machineIdOverride)
                  : oldMeta.machineId;
        const created = mintEngineKey(`admin:${session.username}`, {
            planType: e.planType,
            durationDays: e.durationDays,
            maxDevices: licenseMode === 'cloud' ? Math.min(10, Math.max(1, dl)) : 1,
            deviceCodes: licenseMode === 'cloud' || !resolvedMachineId ? [] : [resolvedMachineId],
            note: String(notes ?? oldMeta.notes ?? '').trim(),
        });
        const newKey = created.key;
        const newKeyDisplay = keyPrefixOf(newKey);

        const { price: priceNum, discountedPrice: discountedNum, discountAmount } = priceFields(price, discountedPrice);

        // 1. Revoke old trial license (BOTH sides: engine status + meta row).
        //    SECRETS POLICY: the reason embeds the new key's DISPLAY PREFIX.
        store.revoke(`admin:${session.username}`, oldRec.keyHash);
        store.saveLicenseMeta({
            ...oldMeta,
            revoked: true,
            revokedBy: session.sub,
            revokedByName: session.username,
            revokedAt: nowTs,
            revokedReason: `Converted to ${plan} plan (key: ${newKeyDisplay})`,
        });

        panelLog({
            action: 'LICENSE_REVOKED',
            actorId: session.sub,
            actorName: session.username,
            actorRole: session.role,
            ts: nowTs,
            flag: null,
            meta: {
                key: oldMeta.key,
                clientName: oldMeta.clientName || '',
                clientPhone: oldMeta.clientPhone || '',
                plan: oldMeta.plan || '',
                price: 0,
                issuedByName: oldMeta.issuedByName || '',
                reason: `Converted to ${plan} plan`,
            },
        });

        // 2. Create new paid license, inheriting all client data from old
        const newMeta: LicenseMetaRecord = {
            keyHash: created.record.keyHash,
            key: newKeyDisplay,
            plan,
            deviceLimit: dl,
            expiryTs,
            isLifetime,
            price: priceNum,
            discountedPrice: discountedNum,
            discountAmount,
            licenseMode,
            machineId: resolvedMachineId,
            clientName: oldMeta.clientName,
            clientPhone: oldMeta.clientPhone,
            clientEmail: oldMeta.clientEmail,
            businessCategory: oldMeta.businessCategory,
            website: oldMeta.website,
            notes: String(notes || oldMeta.notes || '').trim(),
            features: features || oldMeta.features || DEFAULT_FEATURES,
            affiliateId: oldMeta.affiliateId || null,
            affiliateName: oldMeta.affiliateName || null,
            issuedBy: session.sub,
            issuedByName: whitelabel ? whitelabel.name || session.username : session.username,
            issuedAt: nowTs,
            activated: false,
            activatedAt: null,
            revoked: false,
            revokedBy: null,
            revokedByName: null,
            revokedAt: null,
            revokedReason: null,
            convertedFromKey: oldMeta.key,
            whitelabelName: whitelabel ? whitelabel.name || whitelabel.username : null,
            affiliateCommissionAmount: null, // filled below
        };
        if (whitelabel) newMeta.whitelabelIssued = true;

        if (newMeta.affiliateId) {
            const aff = store.getAffiliate(String(newMeta.affiliateId));
            if (aff) {
                const revenue = attributedRevenue(priceNum, discountedNum);
                newMeta.affiliateCommissionAmount = commissionAmount(revenue, aff.commission);
            }
        }

        store.saveLicenseMeta(newMeta);

        panelLog({
            action: 'LICENSE_CONVERTED',
            actorId: session.sub,
            actorName: session.username,
            actorRole: session.role,
            ts: nowTs,
            flag: null,
            meta: {
                key: newKeyDisplay,
                oldKey: oldMeta.key,
                clientName: newMeta.clientName || '',
                clientPhone: newMeta.clientPhone || '',
                plan,
                price: priceNum,
                discountedPrice: discountedNum,
                issuedByName: session.username,
            },
        });

        json(res, 200, { success: true, key: newKey, license: store.licenseWire(newMeta) });
        return;
    }

    if (path === '/api/licenses/validate' && method === 'POST') {
        // PUBLIC — panel debugging/parity endpoint (ADMIN-PORT.md §2: findByKey
        // + evaluateEntitlement semantics; the Android app is NOT routed here)
        try {
            const b = parseJsonStrict(await readRawBody(req, res));
            const key = String(b.key ?? '');
            const mode = b.mode;

            if (!key) {
                json(res, 200, { valid: false, error: 'key required' });
                return;
            }

            const cleanKey = key.trim().toUpperCase();
            const cleanMid = String(b.machineId ?? '').trim().toUpperCase();

            // 1. engine existence + revocation check first
            const rec = store.findByKey(cleanKey);
            if (!rec) {
                json(res, 200, { valid: false, error: 'Key not registered' });
                return;
            }
            const meta = store.ensureLicenseMeta(rec.keyHash);
            if (!meta || rec.status === 'revoked' || meta.revoked) {
                json(res, 200, { valid: false, error: 'Key has been revoked' });
                return;
            }

            const now = Math.floor(Date.now() / 1000);

            // 1b. Reviewer/test access — an explicitly flagged license record
            //     (super admins only) that skips platform-mode and device-code
            //     binding entirely, so it works on any device. Scoped to this
            //     one flagged record only.
            if (meta.reviewAccess === true) {
                if (!meta.isLifetime && meta.expiryTs && meta.expiryTs < now) {
                    json(res, 200, { valid: false, error: 'Key expired' });
                    return;
                }
                if (!meta.activated) {
                    store.saveLicenseMeta({ ...meta, activated: true, activatedAt: now });
                }
                const secondsLeft = meta.isLifetime ? null : Math.max(0, meta.expiryTs - now);
                const daysLeft = meta.isLifetime ? 9999 : Math.floor((secondsLeft ?? 0) / 86400);
                json(res, 200, {
                    valid: true,
                    plan: meta.plan,
                    deviceLimit: meta.deviceLimit ?? 1,
                    isLifetime: meta.isLifetime,
                    daysLeft,
                    secondsLeft,
                    expiry: meta.isLifetime ? null : new Date(meta.expiryTs * 1000).toISOString(),
                    features: meta.features || null,
                });
                return;
            }

            // 2. Each license type is bound to the platform it was actually
            //    issued for — requiring an exact match stops one purchased key
            //    from being reused across platforms.
            if (meta.licenseMode === 'cloud' && mode !== 'cloud') {
                json(res, 200, { valid: false, error: 'Cloud license requires cloud mode' });
                return;
            }
            if (meta.licenseMode === 'app' && mode !== 'app') {
                json(res, 200, { valid: false, error: 'App license can only be used in the AcceptPro mobile app' });
                return;
            }
            if (meta.licenseMode === 'desktop' && mode) {
                json(res, 200, { valid: false, error: 'Desktop license cannot be used on this platform' });
                return;
            }
            if (meta.licenseMode !== 'cloud' && !cleanMid) {
                json(res, 200, { valid: false, error: `${meta.licenseMode === 'app' ? 'App' : 'Desktop'} license requires machineId` });
                return;
            }

            // 3. Engine binding + expiry decision (evaluateEntitlement
            //    semantics). The wire expiryTs is the commercial display window
            //    (zyqora's key-embedded expiry analog).
            const isCloud = meta.licenseMode === 'cloud';
            const boundCodes = rec.boundDeviceCodeHashes ?? [];
            const requesting = hashDeviceCode(cleanMid);
            let usedExceptionFallback = false;
            let boundOk = isCloud || boundCodes.length === 0 || boundCodes.includes(requesting);
            if (!boundOk && meta.validationException === true) {
                // Exception mode: validate against the stored machine code and
                // allow re-bind to the current machine.
                const storedMid = String(meta.machineId || '').trim().toUpperCase();
                if (storedMid && boundCodes.includes(hashDeviceCode(storedMid))) {
                    boundOk = true;
                    usedExceptionFallback = true;
                }
            }
            if (!boundOk) {
                json(res, 200, { valid: false, error: 'Invalid key signature' });
                return;
            }

            const decision = evaluateEntitlement({
                license: {
                    status: rec.status === 'unused' ? 'active' : rec.status,
                    expiresAt: meta.isLifetime ? null : meta.expiryTs * 1000,
                    activatedAt: rec.activatedAt ?? now,
                    maxDevices: rec.maxDevices,
                },
                boundDeviceCount: store.boundHwids(rec.keyHash).length,
                requestingHwidHash: requesting,
                boundHwidHashes: boundCodes.length ? boundCodes : [requesting],
                tokenPayload: null,
                now: Date.now(),
                policy: DEFAULT_POLICY,
                allowJoin: false,
            });
            if (!decision.ok) {
                if (decision.reason === 'REVOKED') {
                    json(res, 200, { valid: false, error: 'Key has been revoked' });
                    return;
                }
                if (decision.reason === 'EXPIRED') {
                    json(res, 200, { valid: false, error: 'Key expired' });
                    return;
                }
                json(res, 200, { valid: false, error: 'Invalid key signature' });
                return;
            }

            // 4. Record first activation + exception re-bind (meta only — the
            //    engine lifecycle is unchanged: keys activate in the app)
            let updatedMeta = meta;
            if (!meta.activated) {
                updatedMeta = { ...updatedMeta, activated: true, activatedAt: now };
            }
            if (usedExceptionFallback && meta.exceptionBoundMachineId !== cleanMid) {
                updatedMeta = { ...updatedMeta, exceptionBoundMachineId: cleanMid };
            }
            if (updatedMeta !== meta) {
                store.saveLicenseMeta(updatedMeta);
            }

            // 5. Compute time fields
            const secondsLeft = meta.isLifetime ? null : Math.max(0, meta.expiryTs - now);
            const daysLeft = meta.isLifetime ? 9999 : Math.floor((secondsLeft ?? 0) / 86400);

            json(res, 200, {
                valid: true,
                plan: meta.plan,
                deviceLimit: meta.deviceLimit,
                isLifetime: meta.isLifetime,
                daysLeft,
                secondsLeft,
                expiry: meta.isLifetime ? null : new Date(meta.expiryTs * 1000).toISOString(),
                features: meta.features || null,
            });
        } catch (err) {
            console.error('Validate error:', err);
            json(res, 200, { valid: false, error: 'Server error' });
        }
        return;
    }

    // ---- /api/expenses (super + admin) -------------------------------------
    if (path === '/api/expenses') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        // Expenses are internal staff bookkeeping — super and admin only
        if (session.role !== 'super' && session.role !== 'admin') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        if (method === 'GET') {
            const list = session.role === 'super' ? store.listAllExpenses() : store.listAdminExpenses(session.sub);
            const result = list
                .map((e) => ({
                    id: e.id,
                    title: e.title,
                    amount: e.amount,
                    category: e.category || '',
                    location: e.location || '',
                    notes: e.notes || '',
                    spentBy: e.spentBy,
                    spentByName: e.spentByName,
                    spentAt: e.spentAt,
                    createdAt: e.createdAt,
                    editedAt: e.editedAt || null,
                    editedBy: e.editedBy || null,
                    editedByName: e.editedByName || null,
                    originalValues: e.originalValues || null,
                }))
                .sort((a, b) => (b.spentAt || 0) - (a.spentAt || 0));
            json(res, 200, result);
            return;
        }

        if (method === 'POST') {
            const b = parseJsonStrict(await readRawBody(req, res));
            const title = String(b.title ?? '').trim();
            const category = String(b.category ?? '').trim();
            const location = String(b.location ?? '').trim();
            const notes = String(b.notes ?? '').trim();
            const amount = toNum(b.amount);
            const spentAt = toNum(b.spentAt) || Math.floor(Date.now() / 1000);

            if (!title) {
                json(res, 400, { error: 'Expense title is required' });
                return;
            }
            if (!Number.isFinite(amount) || amount <= 0) {
                json(res, 400, { error: 'Amount must be greater than 0' });
                return;
            }

            const expense: ExpenseRecord = {
                id: randomUUID(),
                title,
                amount,
                category,
                location,
                notes,
                spentBy: session.sub,
                spentByName: session.username,
                spentAt,
                createdAt: Math.floor(Date.now() / 1000),
            };
            store.saveExpense(expense);
            json(res, 200, { success: true, expense });
            return;
        }

        if (method === 'PATCH') {
            const b = parseJsonStrict(await readRawBody(req, res));
            const id = String(b.id ?? '').trim();
            if (!id) {
                json(res, 400, { error: 'Expense ID required' });
                return;
            }

            const existing = store.getExpense(id);
            if (!existing) {
                json(res, 404, { error: 'Expense not found' });
                return;
            }
            if (session.role !== 'super' && existing.spentBy !== session.sub) {
                json(res, 403, { error: 'Forbidden' });
                return;
            }

            const title = String(b.title ?? '').trim();
            const category = String(b.category ?? '').trim();
            const location = String(b.location ?? '').trim();
            const notes = String(b.notes ?? '').trim();
            const amount = toNum(b.amount);
            const spentAt = toNum(b.spentAt) || existing.spentAt;

            if (!title) {
                json(res, 400, { error: 'Expense title is required' });
                return;
            }
            if (!Number.isFinite(amount) || amount <= 0) {
                json(res, 400, { error: 'Amount must be greater than 0' });
                return;
            }

            // snapshot of the PRE-edit values (audit trail)
            const originalValues = {
                title: existing.title,
                amount: existing.amount,
                category: existing.category || '',
                location: existing.location || '',
                notes: existing.notes || '',
                spentAt: existing.spentAt,
            };

            const updated: ExpenseRecord = {
                ...existing,
                title,
                amount,
                category,
                location,
                notes,
                spentAt,
                editedAt: Math.floor(Date.now() / 1000),
                editedBy: session.sub,
                editedByName: session.username,
                originalValues,
            };
            store.saveExpense(updated);
            json(res, 200, { success: true, expense: updated });
            return;
        }

        json(res, 405, { error: 'method not allowed' });
        return;
    }

    // ---- /api/withdrawals ---------------------------------------------------
    if (path === '/api/withdrawals') {
        if (method === 'GET') {
            const gate = requireAuth(req);
            if (gate.error) {
                denyError(res, gate);
                return;
            }
            const session = gate.session as PanelSession;
            // Owner/staff bookkeeping — super and admin only
            if (session.role !== 'super' && session.role !== 'admin') {
                json(res, 403, { error: 'Forbidden' });
                return;
            }
            const list = session.role === 'super' ? store.listAllWithdrawals() : store.listAdminWithdrawals(session.sub);
            json(res, 200, list);
            return;
        }

        if (method === 'POST') {
            const gate = requireSuper(req);
            if (gate.error) {
                denyError(res, gate);
                return;
            }
            const session = gate.session as PanelSession;
            const body = parseJsonLenient(await readRawBody(req, res));
            const adminId = String(body.adminId || '').trim();
            const amount = parseFloat(body.amount as string);
            const note = String(body.note || '').trim().slice(0, 300);
            const withdrawnAt = Number.isFinite(Number(body.withdrawnAt))
                ? Math.floor(Number(body.withdrawnAt))
                : Math.floor(Date.now() / 1000);

            if (!adminId) {
                json(res, 400, { error: 'adminId is required' });
                return;
            }
            if (!amount || amount <= 0) {
                json(res, 400, { error: 'Amount must be greater than 0' });
                return;
            }

            // Resolve the admin's username server-side — a client-supplied name
            // can be spoofed and would corrupt the ledger's audit trail.
            const admin = store.getAdminUser(adminId);
            if (!admin) {
                json(res, 404, { error: 'Admin not found' });
                return;
            }

            const withdrawal: WithdrawalRecord = {
                id: `wd_${Date.now()}_${Math.random().toString(36).slice(2, 8)}`,
                adminId,
                adminUsername: admin.username,
                amount,
                note,
                withdrawnAt,
                recordedBy: session.sub,
                recordedByName: session.name || session.username || session.sub,
                createdAt: Math.floor(Date.now() / 1000),
            };
            store.saveWithdrawal(withdrawal);
            json(res, 201, { success: true, withdrawal });
            return;
        }

        json(res, 405, { error: 'method not allowed' });
        return;
    }

    if ((m = /^\/api\/withdrawals\/([^/]+)$/.exec(path)) && method === 'PUT') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        if (session.role !== 'super') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }
        const existing = store.getWithdrawal(m[1]);
        if (!existing) {
            json(res, 404, { error: 'Withdrawal not found' });
            return;
        }
        const body = parseJsonLenient(await readRawBody(req, res));
        const amount = parseFloat(body.amount as string);
        if (!amount || amount <= 0) {
            json(res, 400, { error: 'Amount must be greater than 0' });
            return;
        }
        const updated: WithdrawalRecord = {
            ...existing,
            amount,
            note: (body.note ?? existing.note ?? '').toString().trim().slice(0, 300),
            withdrawnAt: body.withdrawnAt ? Number(body.withdrawnAt) : existing.withdrawnAt,
            updatedAt: Math.floor(Date.now() / 1000),
            updatedBy: session.sub,
            updatedByName: session.name || session.username || session.sub,
        };
        store.saveWithdrawal(updated);
        json(res, 200, { success: true, withdrawal: updated });
        return;
    }

    // ---- /api/sales ---------------------------------------------------------
    if (path === '/api/sales' && method === 'GET') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const list = session.role === 'super' ? store.listWireLicenses() : store.listWireLicenses(session.sub);

        // Only include licenses that have a price recorded. Whitelabel-issued
        // licenses are the reseller's own business, so they stay out of this
        // panel's direct-sales view.
        const sales = list
            .filter((l) => Number(l.price) > 0 && l.whitelabelIssued !== true)
            .map((l) => ({
                key: l.key,
                clientName: l.clientName,
                clientPhone: l.clientPhone || '',
                plan: l.plan,
                price: l.price,
                discountedPrice: l.discountedPrice ?? null,
                affiliateId: l.affiliateId || null,
                affiliateCommissionAmount: l.affiliateCommissionAmount ?? null,
                issuedBy: l.issuedBy,
                issuedByName: l.issuedByName,
                issuedAt: l.issuedAt,
                revoked: l.revoked || false,
            }));
        json(res, 200, sales);
        return;
    }

    // ---- /api/stats ---------------------------------------------------------
    if (path === '/api/stats' && method === 'GET') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        if (session.role !== 'super' && session.role !== 'admin') {
            json(res, 403, { error: 'Forbidden' });
            return;
        }
        json(
            res,
            200,
            globalMoney({
                licenses: store.listWireLicenses() as never,
                expenses: store.listAllExpenses(),
                affiliates: store.listAffiliates(),
                withdrawals: store.listAllWithdrawals(),
            }),
        );
        return;
    }

    // ---- /api/logs (super) --------------------------------------------------
    if (path === '/api/logs' && method === 'GET') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        json(res, 200, store.listPanelLogs(300));
        return;
    }
    if (path === '/api/logs' && method === 'DELETE') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        store.clearPanelLogs();
        json(res, 200, { success: true });
        return;
    }

    // ---- /api/settings/demo -------------------------------------------------
    if (path === '/api/settings/demo' && method === 'GET') {
        const settings = store.getDemoSettings();
        json(res, 200, { enabled: settings.enabled !== false });
        return;
    }
    if (path === '/api/settings/demo' && method === 'POST') {
        const gate = requireAuth(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        // ASCII hyphen here is byte-verbatim (spec §3 — NOT the em dash of requireSuper)
        if (session.role !== 'super') {
            json(res, 403, { error: 'Forbidden - super admin only' });
            return;
        }
        const b = parseJsonStrict(await readRawBody(req, res));
        const settings = store.saveDemoSettings({
            enabled: b.enabled === true,
            updatedAt: Math.floor(Date.now() / 1000),
            updatedBy: session.username,
        });
        json(res, 200, { success: true, enabled: settings.enabled });
        return;
    }

    // ---- /api/checkout/* (public) -------------------------------------------
    if (path === '/api/checkout/plans' && method === 'GET') {
        json(res, 200, {
            plans: publicPlans(),
            mode: cashfreeMode(),
            // mock gateway (dev/test) counts as an enabled payment path
            enabled: cashfreeConfigured() || gatewayMocked(),
        });
        return;
    }

    if (path === '/api/checkout/create-order' && method === 'POST') {
        // Cashfree calls go through fetch only when the credentials are set —
        // unless the DEV/TEST mock gateway is on (see panel-checkout.ts).
        if (!gatewayMocked() && !cashfreeConfigured()) {
            json(res, 503, { error: 'Online payment is not available right now. Please contact support.' });
            return;
        }

        if (!allow(`order:${clientIp(req)}`, 15, 3600)) {
            json(res, 429, { error: 'Too many attempts. Please try again later.' });
            return;
        }

        const raw = await readRawBody(req, res);
        let body: Record<string, unknown>;
        try {
            body = JSON.parse(raw);
        } catch {
            json(res, 400, { error: 'Invalid request' });
            return;
        }

        const planId = String(body.planId || '');
        const mode = String(body.mode || 'desktop');
        const machineIdRaw = String(body.machineId || '').trim();
        const name = String(body.name || '').trim().slice(0, 80);
        const phone = String(body.phone || '').replace(/\D/g, '');
        const email = String(body.email || '').trim().slice(0, 120);

        const plan = PLANS[planId];
        if (!plan) {
            json(res, 400, { error: 'Choose a plan' });
            return;
        }
        if (!isSellableMode(mode)) {
            json(res, 400, { error: 'Invalid license type' });
            return;
        }
        // §2.1: the "Machine ID" field takes the app's Device ID (15 Crockford
        // chars after normalizeDeviceCode); zyqora's MACHINE_ID_RE is NOT ported
        if (!isDeviceIdInput(machineIdRaw)) {
            json(res, 400, { error: 'Enter your 15-character Device ID exactly as shown in the app' });
            return;
        }
        if (name.length < 2) {
            json(res, 400, { error: 'Enter your name' });
            return;
        }
        if (phone.length < 10 || phone.length > 15) {
            json(res, 400, { error: 'Enter a valid phone number with country code' });
            return;
        }
        if (!/^[^@\s]+@[^@\s]+\.[^@\s]+$/.test(email)) {
            json(res, 400, { error: 'Enter a valid email' });
            return;
        }

        // side keys use the BARE normalized 15-char form (§2.1)
        const machineId = normalizeDeviceId(machineIdRaw);
        const base = process.env.PUBLIC_BASE_URL || url.origin;
        const orderId = newOrderId();
        try {
            let paymentSessionId: string;
            if (process.env.CHECKOUT_FAKE_GATEWAY === '1') {
                // DEV/TEST ONLY: the fake gateway approves every payment
                // offline — no network call, and the local `fakePaid` mark is
                // what fulfilOrder trusts (documented in panel-checkout.ts).
                paymentSessionId = `fake-session-${orderId}`;
            } else {
                const cf = await createCashfreeOrder({
                    orderId,
                    amount: plan.price,
                    customer: { id: `C${phone}`.slice(0, 50), name, phone: phone.slice(-10), email },
                    returnUrl: `${base}/buy/success?order_id={order_id}`,
                    notifyUrl: `${base}/api/checkout/webhook`,
                    // Cashfree order note, AcceptPro branding (ADMIN-PORT.md §1)
                    note: `AcceptPro ${plan.name} (1 year)`,
                });
                paymentSessionId = String(cf.payment_session_id);
            }
            store.saveOrder({
                orderId,
                planId,
                mode,
                machineId,
                amount: plan.price,
                status: 'created',
                customer: { name, phone, email },
                createdAt: Math.floor(Date.now() / 1000),
                ...(process.env.CHECKOUT_FAKE_GATEWAY === '1' ? { fakePaid: true, fakePaidAmount: plan.price } : {}),
            });
            // Latest order started from this device: lets the app's claim check
            // confirm the payment itself even if the browser is closed and the
            // webhook is slow.
            store.setSideKey(pendingSideKey(mode, machineId), orderId, PENDING_TTL_SEC);
            json(res, 200, { orderId, paymentSessionId, mode: cashfreeMode() });
        } catch (e) {
            console.error('create-order failed:', (e as Error).message);
            json(res, 502, { error: 'Could not start the payment. Please try again.' });
        }
        return;
    }

    if (path === '/api/checkout/status' && method === 'GET') {
        if (!allow(`status:${clientIp(req)}`, 120, 600)) {
            json(res, 429, { error: 'Too many requests' });
            return;
        }
        const orderId = url.searchParams.get('order_id') || '';
        const order = getCheckoutOrder(store, orderId);
        if (!order) {
            json(res, 404, { status: 'unknown' });
            return;
        }

        let result: { ok: boolean; key?: string | null; status?: string } = { ok: !!order.licenseKey, key: order.licenseKey };
        if (!order.licenseKey) {
            try {
                result = await fulfilOrder(store, orderId);
            } catch {
                result = { ok: false };
            }
        }
        if (result.ok) {
            const plan = PLANS[order.planId];
            json(res, 200, { status: 'paid', key: result.key, planName: plan?.name, mode: order.mode });
            return;
        }
        const failed = result.status === 'EXPIRED' || result.status === 'TERMINATED';
        json(res, 200, { status: failed ? 'failed' : 'pending' });
        return;
    }

    if (path === '/api/checkout/claim' && method === 'POST') {
        if (!allow(`claim:${clientIp(req)}`, 120, 3600)) {
            json(res, 429, { found: false, error: 'Too many requests' });
            return;
        }
        const raw = await readRawBody(req, res);
        let body: Record<string, unknown>;
        try {
            body = JSON.parse(raw);
        } catch {
            json(res, 400, { found: false });
            return;
        }
        const machineIdRaw = String(body.machineId || '').trim();
        const mode = String(body.mode || 'desktop');
        if (!isDeviceIdInput(machineIdRaw) || !['desktop', 'app'].includes(mode)) {
            json(res, 200, { found: false });
            return;
        }
        const machineId = normalizeDeviceId(machineIdRaw);

        // 1) An order started from this device recently? Confirm it first.
        const pendingId = store.getSideKey(pendingSideKey(mode, machineId));
        if (pendingId) {
            try {
                const r = await fulfilOrder(store, pendingId);
                if (r.ok) {
                    json(res, 200, { found: true, key: r.key });
                    return;
                }
            } catch {
                /* not paid yet — fall through */
            }
        }

        // 2) Otherwise the most recent paid order for this device.
        const orderId = store.getSideKey(claimSideKey(mode, machineId));
        if (!orderId) {
            json(res, 200, { found: false });
            return;
        }
        const order = getCheckoutOrder(store, orderId);
        if (order?.licenseKey) {
            json(res, 200, { found: true, key: order.licenseKey });
            return;
        }
        json(res, 200, { found: false });
        return;
    }

    if (path === '/api/checkout/webhook' && method === 'POST') {
        // Cashfree -> us. The signature is checked over the exact raw body, and
        // even then the order is re-confirmed before any license is issued.
        const raw = await readRawBody(req, res);
        const tsRaw = req.headers['x-webhook-timestamp'];
        const sigRaw = req.headers['x-webhook-signature'];
        const okSig = verifyWebhookSignature(
            raw,
            Array.isArray(tsRaw) ? tsRaw[0] : tsRaw,
            Array.isArray(sigRaw) ? sigRaw[0] : sigRaw,
        );
        if (!okSig) {
            json(res, 400, { error: 'Bad signature' });
            return;
        }

        let event: Record<string, any>;
        try {
            event = JSON.parse(raw);
        } catch {
            json(res, 200, { ok: true });
            return;
        }

        const orderId = event?.data?.order?.order_id;
        const type = String(event?.type || '');
        if (orderId && type.includes('PAYMENT') && type.includes('SUCCESS')) {
            try {
                await fulfilOrder(store, orderId);
            } catch (e) {
                console.error('webhook fulfil failed:', (e as Error).message);
                json(res, 500, { error: 'retry' });
                return;
            }
        }
        json(res, 200, { ok: true });
        return;
    }

    // ---- /api/whitelabel/* (super) ------------------------------------------
    if (path === '/api/whitelabel/create' && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const body = parseJsonLenient(await readRawBody(req, res));
        const username = String(body.username || '').trim().toLowerCase();
        const password = String(body.password || '').trim();
        const name = String(body.name || '').trim();
        const phone = String(body.phone || '').trim();
        const email = String(body.email || '').trim();
        const businessName = String(body.businessName || '').trim();
        const businessCategory = String(body.businessCategory || '').trim();
        const website = String(body.website || '').trim();
        const notes = String(body.notes || '').trim();

        const MAX_LIMIT = 999999;
        const MAX_DEVICES = 255;

        if (!username) {
            json(res, 400, { error: 'Username is required' });
            return;
        }
        if (!name) {
            json(res, 400, { error: 'Display name is required' });
            return;
        }
        if (!password || password.length < 6) {
            json(res, 400, { error: 'Password must be at least 6 characters' });
            return;
        }

        // Whitelabel users log into the same panel — their username must not
        // collide with any existing admin or affiliate account.
        if (store.usernameTaken(username)) {
            json(res, 409, { error: 'Username already taken' });
            return;
        }

        // Which license types (desktop / cloud / app) this client may generate
        const allowedModes = Array.isArray(body.allowedModes)
            ? [...new Set((body.allowedModes as string[]).filter((md) => (LICENSE_MODES as string[]).includes(md)))]
            : [];
        if (!allowedModes.length) {
            json(res, 400, { error: 'Select at least one license type' });
            return;
        }

        // Which key durations (1/3/6 months, 1 year, custom) this client may issue
        const WL_PLANS = resolveWlPlans({ allowedPlans: [] });
        const allowedPlans = Array.isArray(body.allowedPlans)
            ? [...new Set((body.allowedPlans as string[]).filter((p) => WL_PLANS.includes(p)))]
            : [...WL_PLANS];
        if (!allowedPlans.length) {
            json(res, 400, { error: 'Select at least one key duration' });
            return;
        }

        const licenseLimit = Math.floor(Number(body.licenseLimit));
        if (!Number.isFinite(licenseLimit) || licenseLimit < 1 || licenseLimit > MAX_LIMIT) {
            json(res, 400, { error: `License limit must be between 1 and ${MAX_LIMIT}` });
            return;
        }

        // Maximum devices per key this client may issue
        let maxDevices = MAX_DEVICES;
        if (body.maxDevices !== undefined && body.maxDevices !== null && body.maxDevices !== '') {
            maxDevices = Math.floor(Number(body.maxDevices));
            if (!Number.isFinite(maxDevices) || maxDevices < 1 || maxDevices > MAX_DEVICES) {
                json(res, 400, { error: `Max devices must be between 1 and ${MAX_DEVICES}` });
                return;
            }
        }

        // Partnership term — how long this reseller relationship lasts
        // (months; null/absent = no expiry)
        let partnershipMonths: number | null = null;
        if (body.partnershipMonths !== undefined && body.partnershipMonths !== null && body.partnershipMonths !== '') {
            partnershipMonths = Math.floor(Number(body.partnershipMonths));
            if (!Number.isFinite(partnershipMonths) || partnershipMonths < 1 || partnershipMonths > 120) {
                json(res, 400, { error: 'Partnership duration must be between 1 and 120 months' });
                return;
            }
        }
        const nowTs = Math.floor(Date.now() / 1000);

        const whitelabel: WhitelabelRecord = {
            id: randomUUID(),
            username,
            name,
            passwordHash: hashPassword(password),
            phone,
            email,
            businessName,
            businessCategory,
            website,
            notes,
            allowedModes: allowedModes as string[],
            allowedPlans,
            maxDevices,
            licenseLimit,
            partnershipStartTs: partnershipMonths ? nowTs : null,
            partnershipMonths,
            partnershipEndTs: partnershipMonths ? nowTs + Math.round(partnershipMonths * 30.4375) * 86400 : null,
            active: true,
            createdBy: session.sub,
            createdByName: session.username,
            createdAt: nowTs,
        };
        store.saveWhitelabel(whitelabel);
        const { passwordHash: _, ...safe } = whitelabel;
        json(res, 201, { success: true, whitelabel: safe });
        return;
    }

    if (path === '/api/whitelabel/list' && method === 'GET') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const result = store.listWhitelabels().map((c) => {
            const used = store.countIssuedLicenses(c.id);
            const { passwordHash: _, ...safe } = c;
            return { ...safe, usedLicenses: used, remainingLicenses: Math.max(0, (c.licenseLimit || 0) - used) };
        });
        // Newest first
        result.sort((a, b) => (b.createdAt || 0) - (a.createdAt || 0));
        json(res, 200, result);
        return;
    }

    if ((m = /^\/api\/whitelabel\/([^/]+)\/change-password$/.exec(path)) && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const body = parseJsonLenient(await readRawBody(req, res));
        const password = String(body.password || '').trim();
        if (!password || password.length < 6) {
            json(res, 400, { error: 'Password must be at least 6 characters' });
            return;
        }
        const whitelabel = store.getWhitelabel(m[1]);
        if (!whitelabel) {
            json(res, 404, { error: 'Whitelabel client not found' });
            return;
        }
        if (whitelabel.id !== m[1] || !whitelabel.username) {
            json(res, 500, { error: 'This client record is corrupted. Delete and re-create the client to fix it.' });
            return;
        }
        store.saveWhitelabel({ ...whitelabel, passwordHash: hashPassword(password) });
        json(res, 200, { success: true });
        return;
    }

    if ((m = /^\/api\/whitelabel\/([^/]+)\/delete$/.exec(path)) && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const whitelabel = store.getWhitelabel(m[1]);
        if (!whitelabel) {
            json(res, 404, { error: 'Whitelabel client not found' });
            return;
        }

        // Super admin permanently removes a whitelabel client account. Licenses
        // the client issued stay in the records (sales history is never
        // erased); only the account, its login and its quota disappear.
        const target = { ...whitelabel, id: whitelabel.id || m[1] };
        const issuedLicenses = store.countIssuedLicenses(target.id);
        store.deleteWhitelabel(target);

        panelLog({
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
        return;
    }

    if ((m = /^\/api\/whitelabel\/([^/]+)\/licenses$/.exec(path)) && method === 'GET') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const whitelabel = store.getWhitelabel(m[1]);
        if (!whitelabel) {
            json(res, 404, { error: 'Whitelabel client not found' });
            return;
        }
        const used = store.countIssuedLicenses(m[1]);
        json(res, 200, {
            whitelabel: {
                id: whitelabel.id,
                username: whitelabel.username,
                name: whitelabel.name,
                allowedModes: whitelabel.allowedModes,
                licenseLimit: whitelabel.licenseLimit,
            },
            usage: { used, limit: whitelabel.licenseLimit, remaining: Math.max(0, (whitelabel.licenseLimit || 0) - used) },
            licenses: store.listWireLicenses(m[1]),
        });
        return;
    }

    if ((m = /^\/api\/whitelabel\/([^/]+)\/toggle$/.exec(path)) && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const whitelabel = store.getWhitelabel(m[1]);
        if (!whitelabel) {
            json(res, 404, { error: 'Whitelabel client not found' });
            return;
        }
        // Blocks the client from logging in and from generating new licenses.
        if (whitelabel.id !== m[1] || !whitelabel.username) {
            json(res, 500, { error: 'This client record is corrupted. Delete and re-create the client to fix it.' });
            return;
        }
        const updated = { ...whitelabel, active: !whitelabel.active };
        store.saveWhitelabel(updated);
        json(res, 200, { success: true, active: updated.active });
        return;
    }

    if ((m = /^\/api\/whitelabel\/([^/]+)\/update$/.exec(path)) && method === 'POST') {
        const gate = requireSuper(req);
        if (gate.error) {
            denyError(res, gate);
            return;
        }
        const session = gate.session as PanelSession;
        const whitelabel = store.getWhitelabel(m[1]);
        if (!whitelabel) {
            json(res, 404, { error: 'Whitelabel client not found' });
            return;
        }
        // Refuse to operate on a corrupted record — writing it back would
        // propagate the corruption instead of fixing it.
        if (whitelabel.id !== m[1] || !whitelabel.username) {
            json(res, 500, { error: 'This client record is corrupted. Delete and re-create the client to fix it.' });
            return;
        }

        const body = parseJsonLenient(await readRawBody(req, res));
        const MAX_LIMIT = 999999;
        const MAX_DEVICES = 255;

        let allowedModes = whitelabel.allowedModes;
        if (body.allowedModes !== undefined) {
            if (!Array.isArray(body.allowedModes)) {
                json(res, 400, { error: 'allowedModes must be an array' });
                return;
            }
            allowedModes = [...new Set((body.allowedModes as string[]).filter((md) => (LICENSE_MODES as string[]).includes(md)))];
            if (!allowedModes.length) {
                json(res, 400, { error: 'Select at least one license type' });
                return;
            }
        }

        const WL_PLANS = resolveWlPlans({ allowedPlans: [] });
        let allowedPlans = whitelabel.allowedPlans;
        if (body.allowedPlans !== undefined) {
            if (!Array.isArray(body.allowedPlans)) {
                json(res, 400, { error: 'allowedPlans must be an array' });
                return;
            }
            allowedPlans = [...new Set((body.allowedPlans as string[]).filter((p) => WL_PLANS.includes(p)))];
            if (!allowedPlans.length) {
                json(res, 400, { error: 'Select at least one key duration' });
                return;
            }
        }

        let licenseLimit = whitelabel.licenseLimit;
        if (body.licenseLimit !== undefined) {
            licenseLimit = Math.floor(Number(body.licenseLimit));
            if (!Number.isFinite(licenseLimit) || licenseLimit < 1 || licenseLimit > MAX_LIMIT) {
                json(res, 400, { error: `License limit must be between 1 and ${MAX_LIMIT}` });
                return;
            }
        }

        let maxDevices = whitelabel.maxDevices;
        if (body.maxDevices !== undefined) {
            if (body.maxDevices === null || body.maxDevices === '') {
                maxDevices = MAX_DEVICES;
            } else {
                maxDevices = Math.floor(Number(body.maxDevices));
                if (!Number.isFinite(maxDevices) || maxDevices < 1 || maxDevices > MAX_DEVICES) {
                    json(res, 400, { error: `Max devices must be between 1 and ${MAX_DEVICES}` });
                    return;
                }
            }
        }

        // Partnership term — setting it (re)starts the clock from save time;
        // sending null clears it back to no expiry.
        let partnershipStartTs = whitelabel.partnershipStartTs ?? null;
        let partnershipMonths = whitelabel.partnershipMonths ?? null;
        let partnershipEndTs = whitelabel.partnershipEndTs ?? null;
        if (body.partnershipMonths !== undefined) {
            if (body.partnershipMonths === null || body.partnershipMonths === '') {
                partnershipStartTs = null;
                partnershipMonths = null;
                partnershipEndTs = null;
            } else {
                partnershipMonths = Math.floor(Number(body.partnershipMonths));
                if (!Number.isFinite(partnershipMonths) || partnershipMonths < 1 || partnershipMonths > 120) {
                    json(res, 400, { error: 'Partnership duration must be between 1 and 120 months' });
                    return;
                }
                const nowTs = Math.floor(Date.now() / 1000);
                partnershipStartTs = nowTs;
                partnershipEndTs = nowTs + Math.round(partnershipMonths * 30.4375) * 86400;
            }
        }

        const updated: WhitelabelRecord = {
            ...whitelabel,
            ...(body.name !== undefined ? { name: String(body.name).trim() } : {}),
            ...(body.phone !== undefined ? { phone: String(body.phone).trim() } : {}),
            ...(body.email !== undefined ? { email: String(body.email).trim() } : {}),
            ...(body.businessName !== undefined ? { businessName: String(body.businessName).trim() } : {}),
            ...(body.businessCategory !== undefined ? { businessCategory: String(body.businessCategory).trim() } : {}),
            ...(body.website !== undefined ? { website: String(body.website).trim() } : {}),
            ...(body.notes !== undefined ? { notes: String(body.notes).trim() } : {}),
            allowedModes,
            allowedPlans,
            maxDevices,
            licenseLimit,
            partnershipStartTs,
            partnershipMonths,
            partnershipEndTs,
            updatedAt: Math.floor(Date.now() / 1000),
            updatedBy: session.sub,
            updatedByName: session.username,
        };
        store.saveWhitelabel(updated);
        const { passwordHash: _, ...safe } = updated;
        json(res, 200, { success: true, whitelabel: safe });
        return;
    }

    // panel-prefixed path that matched no route: 404 (Next semantics)
    json(res, 404, { error: 'Not found' });
}

// ---------------------------------------------------------------------------
// routes
// ---------------------------------------------------------------------------

async function handle(req: IncomingMessage, res: ServerResponse): Promise<void> {
    const url = new URL(req.url ?? '/', `http://${req.headers.host ?? 'localhost'}`);
    const path = url.pathname;
    const method = req.method ?? 'GET';

    // ---- device-facing API (what the APK calls) --------------------------
    if (path.startsWith('/api/v1/')) {
        store.sweepExpired();

        if (path === '/api/v1/config' && method === 'POST') {
            const b = await readBody(req, res);
            const cfg = store.getConfig();
            const appVersion = Number(b.appVersion ?? 0);
            // the kill switch / forced update live here
            const blocked = cfg.versionBlocked.map(String).includes(String(appVersion));
            json(res, 200, {
                maintenance: cfg.maintenanceMode,
                maintenanceMessage: cfg.maintenanceMessage,
                forceUpdate: cfg.forceUpdateVersion > appVersion,
                forceUpdateVersion: cfg.forceUpdateVersion,
                updateDownloadUrl: cfg.updateDownloadUrl,
                updatePageUrl: cfg.updatePageUrl,
                versionBlocked: blocked,
                minAllowedFare: cfg.minAllowedFare,
                maxAllowedFare: cfg.maxAllowedFare,
                dialogMessage: cfg.dialogMessage,
                dialogButtonText: cfg.dialogButtonText,
            });
            return;
        }

        if (path === '/api/v1/activate' && method === 'POST') {
            const b = await readBody(req, res);
            const key = String(b.key ?? '');
            const markers = (b.device ?? {}) as Record<string, string>;
            const deviceCode = String(b.deviceCode ?? deriveDeviceCode(markers));
            const hwid = deriveHwid(markers);
            const result = store.activate(
                key,
                {
                    hwidHash: hashDeviceCode(deviceCode),
                    appVersion: String(b.appVersion ?? ''),
                    model: String(b.model ?? ''),
                    brand: String(b.brand ?? ''),
                    integrity: String(b.integrity ?? 'UNKNOWN'),
                },
                deviceCode,
            );
            if (!result.ok) {
                json(res, 403, { ok: false, reason: result.reason });
                return;
            }
            const { token, payload } = issueToken(SIGNING, {
                jti: randomUUID(),
                kid: result.record.keyPrefix,
                hw: hashDeviceCode(deviceCode),
            });
            json(res, 200, {
                ok: true,
                token,
                expiresAt: payload.exp,
                license: {
                    planType: result.record.planType,
                    expiresAt: result.record.expiresAt,
                    maxDevices: result.record.maxDevices,
                },
                // the app caches this to verify tokens offline
                publicKey: SIGNING.publicKeyB64,
            });
            return;
        }

        if ((path === '/api/v1/validate' || path === '/api/v1/refresh') && method === 'POST') {
            const b = await readBody(req, res);
            const key = String(b.key ?? '');
            let payload;
            try {
                payload = verifyToken(String(b.token ?? ''), SIGNING.publicKeyB64);
            } catch (e) {
                json(res, 401, { ok: false, reason: e instanceof LicenseError ? e.code : 'BAD_TOKEN' });
                return;
            }
            const rec = store.findByKey(key);
            if (!rec) {
                json(res, 403, { ok: false, reason: 'UNKNOWN_KEY' });
                return;
            }

            // The identity of the device PRESENTING the request. This must be
            // derived from the caller's own device code, never read back out of
            // the token — otherwise a stolen token replays as itself and the
            // `payload.hw == requesting` check becomes a tautology.
            const presented = String(b.deviceCode ?? '');
            if (!presented) {
                json(res, 400, { ok: false, reason: 'DEVICE_CODE_REQUIRED' });
                return;
            }
            const requesting = hashDeviceCode(presented);

            // the licence's own device set. NOTE: an empty array is not nullish,
            // so `??` would never fall back — hence the explicit .length check.
            const boundCodes = rec.boundDeviceCodeHashes ?? [];
            const allowed = boundCodes.length ? boundCodes : store.boundHwids(rec.keyHash);

            const decision = evaluateEntitlement({
                license: rec,
                boundDeviceCount: store.boundHwids(rec.keyHash).length,
                requestingHwidHash: requesting,
                boundHwidHashes: allowed,
                tokenPayload: payload,
                now: Date.now(),
                policy: DEFAULT_POLICY,
                allowJoin: false,
            });
            if (!decision.ok) {
                store.log(`device:${payload.hw.slice(0, 12)}`, 'validate.denied', `${rec.keyPrefix} ${decision.reason}`);
                json(res, 403, { ok: false, reason: decision.reason });
                return;
            }
            store.touchDevice(payload.hw);
            // refresh hands back a fresh token -> rolling, bounded offline window
            const reissue = issueToken(SIGNING, {
                jti: randomUUID(),
                kid: rec.keyPrefix,
                hw: payload.hw,
            });
            json(res, 200, {
                ok: true,
                token: reissue.token,
                expiresAt: reissue.payload.exp,
                remainingMs: decision.remainingMs,
            });
            return;
        }

        if (path === '/api/v1/public-key' && method === 'GET') {
            json(res, 200, { algorithm: 'ed25519', publicKey: SIGNING.publicKeyB64 });
            return;
        }

        json(res, 404, { error: 'unknown device endpoint' });
        return;
    }

    // ---- admin API -------------------------------------------------------
    if (path.startsWith('/api/admin/')) {
        if (path === '/api/admin/login' && method === 'POST') {
            const b = await readBody(req, res);
            if (!checkPassword(String(b.password ?? ''))) {
                store.log('anonymous', 'admin.login.fail', req.socket.remoteAddress ?? '');
                json(res, 401, { ok: false });
                return;
            }
            const tok = randomUUID();
            sessions.set(tok, { at: Date.now() });
            store.log('admin', 'admin.login', 'ok');
            res.setHeader('set-cookie', `ra_admin=${tok}; HttpOnly; Path=/; SameSite=Strict; Max-Age=${SESSION_TTL / 1000}`);
            json(res, 200, { ok: true, token: tok });
            return;
        }

        // Old /api/admin/* endpoints keep their existing auth AND additionally
        // accept the new Bearer JWT for roles super|admin (ADMIN-PORT.md §3).
        const actor = adminFrom(req, url) ?? bearerPanelActor(req);
        if (!actor) {
            json(res, 401, { error: 'unauthorized' });
            return;
        }

        if (path === '/api/admin/logout' && method === 'POST') {
            const m = /(?:^|;\s*)ra_admin=([A-Za-z0-9-]+)/.exec(req.headers.cookie ?? '');
            if (m?.[1]) sessions.delete(m[1]);
            json(res, 200, { ok: true });
            return;
        }

        if (path === '/api/admin/stats' && method === 'GET') {
            json(res, 200, store.stats());
            return;
        }

        if (path === '/api/admin/licenses' && method === 'GET') {
            const status = url.searchParams.get('status') as LicenseStatus | null;
            const q = url.searchParams.get('q') ?? '';
            const limit = Number(url.searchParams.get('limit') ?? 100);
            const offset = Number(url.searchParams.get('offset') ?? 0);
            const { rows, total } = store.listLicenses({ status: status || undefined, q, limit, offset });
            json(res, 200, { total, rows });
            return;
        }

        if (path === '/api/admin/licenses' && method === 'POST') {
            const b = await readBody(req, res);
            const planType = asPlan(b.planType);
            const created = store.createLicenses(actor, {
                count: Number(b.count ?? 1),
                planType,
                durationDays: b.durationDays ? Number(b.durationDays) : undefined,
                maxDevices: b.maxDevices ? Number(b.maxDevices) : undefined,
                deviceCodes: Array.isArray(b.deviceCodes) ? b.deviceCodes.map(String) : [],
                note: String(b.note ?? ''),
            });
            // plaintext returned exactly once, here
            json(res, 200, { ok: true, created: created.map((c) => ({ key: c.key, record: c.record })) });
            return;
        }

        const m = /^\/api\/admin\/licenses\/([a-f0-9]{64})\/([\w-]+)$/.exec(path);
        if (m && method === 'POST') {
            const [, keyHash, action] = m;
            const b = await readBody(req, res);
            try {
                switch (action) {
                    case 'extend': {
                        // integration seam: keep BOTH sides in step — the meta
                        // row is materialized BEFORE the engine window moves,
                        // then its commercial expiryTs shifts by the same amount
                        const days = Number(b.days ?? 30);
                        const meta = store.ensureLicenseMeta(keyHash);
                        const rec = store.extend(actor, keyHash, days);
                        if (meta) store.shiftMetaExpiry(keyHash, days * 86400);
                        json(res, 200, rec);
                        return;
                    }
                    case 'revoke': {
                        // integration seam: "die on revoke" — engine status is
                        // what the app validates against
                        const rec = store.revoke(actor, keyHash);
                        const meta = store.ensureLicenseMeta(keyHash);
                        if (meta) {
                            store.saveLicenseMeta({
                                ...meta,
                                revoked: true,
                                revokedBy: actor,
                                revokedByName: actor,
                                revokedAt: Math.floor(Date.now() / 1000),
                                revokedReason: '',
                            });
                        }
                        json(res, 200, rec);
                        return;
                    }
                    case 'unrevoke': {
                        const rec = store.unrevoke(actor, keyHash);
                        const meta = store.ensureLicenseMeta(keyHash);
                        if (meta) {
                            store.saveLicenseMeta({
                                ...meta,
                                revoked: false,
                                revokedBy: null,
                                revokedByName: null,
                                revokedAt: null,
                                revokedReason: null,
                            });
                        }
                        json(res, 200, rec);
                        return;
                    }
                    case 'maxDevices':
                    case 'max-devices':
                        // engine maxDevices only — meta.deviceLimit is the SOLD
                        // device count and must not move (integration seam).
                        // Store.setMaxDevices clamps 1..10 and audits
                        // 'license.maxDevices' for BOTH spellings of the action.
                        json(res, 200, store.setMaxDevices(actor, keyHash, Number(b.maxDevices ?? 1)));
                        return;
                    case 'reveal':
                        json(res, 200, { key: store.revealKey(keyHash) });
                        return;
                    case 'delete':
                        store.deleteLicense(actor, keyHash);
                        store.deleteLicenseMeta(keyHash); // integration seam: the meta row goes too
                        json(res, 200, { ok: true });
                        return;
                    default:
                        json(res, 404, { error: 'unknown action' });
                }
            } catch (e) {
                json(res, 400, { error: (e as Error).message });
            }
            return;
        }

        if (path === '/api/admin/devices' && method === 'GET') {
            json(res, 200, store.devicesFor(url.searchParams.get('keyHash') ?? undefined));
            return;
        }

        const u = /^\/api\/admin\/devices\/([a-f0-9]{64})$/.exec(path);
        if (u && method === 'DELETE') {
            json(res, 200, { ok: store.unbindDevice(actor, u[1]) });
            return;
        }

        if (path === '/api/admin/config' && method === 'GET') {
            json(res, 200, store.getConfig());
            return;
        }
        if (path === '/api/admin/config' && method === 'POST') {
            const b = await readBody(req, res) as Partial<AppConfig>;
            const clean: Partial<AppConfig> = {};
            if (typeof b.maintenanceMode === 'boolean') clean.maintenanceMode = b.maintenanceMode;
            if (typeof b.maintenanceMessage === 'string') clean.maintenanceMessage = b.maintenanceMessage.slice(0, 500);
            if (typeof b.forceUpdateVersion === 'number') clean.forceUpdateVersion = Math.max(0, b.forceUpdateVersion | 0);
            if (typeof b.updateDownloadUrl === 'string') clean.updateDownloadUrl = b.updateDownloadUrl.slice(0, 500);
            if (typeof b.updatePageUrl === 'string') clean.updatePageUrl = b.updatePageUrl.slice(0, 500);
            if (typeof b.minAllowedFare === 'number') clean.minAllowedFare = Math.max(0, b.minAllowedFare | 0);
            if (typeof b.maxAllowedFare === 'number') clean.maxAllowedFare = Math.max(0, b.maxAllowedFare | 0);
            if (typeof b.dialogMessage === 'string') clean.dialogMessage = b.dialogMessage.slice(0, 500);
            if (typeof b.dialogButtonText === 'string') clean.dialogButtonText = b.dialogButtonText.slice(0, 50);
            if (Array.isArray(b.versionBlocked)) clean.versionBlocked = b.versionBlocked.slice(0, 100).map(String);
            json(res, 200, store.setConfig(actor, clean));
            return;
        }

        if (path === '/api/admin/audit' && method === 'GET') {
            json(res, 200, store.audit(Number(url.searchParams.get('limit') ?? 200)));
            return;
        }

        json(res, 404, { error: 'unknown admin endpoint' });
        return;
    }

    // ---- AcceptPro admin-panel API (ADMIN-PORT.md §5) ---------------------
    if (isPanelApiPath(path)) {
        await handlePanel(req, res, url, method, path);
        return;
    }

    // ---- dashboard -------------------------------------------------------
    if (method === 'GET') {
        serveStatic(res, path);
        return;
    }
    json(res, 405, { error: 'method not allowed' });
}

store.sweepExpired();

createServer((req, res) => {
    handle(req, res).catch((e) => {
        if (!res.headersSent) json(res, 500, { error: (e as Error).message });
        else res.end();
    });
}).listen(PORT, () => {
    const files = existsSync(ADMIN_DIR) ? readdirSync(ADMIN_DIR) : [];
    console.log(`\n  Ride Accepter — license server`);
    console.log(`  ----------------------------------------`);
    console.log(`  admin dashboard : http://localhost:${PORT}/`);
    console.log(`  device API      : http://localhost:${PORT}/api/v1/`);
    console.log(`  store           : ${DB_PATH}`);
    console.log(`  admin password  : ${ADMIN_PASSWORD === 'admin@123' ? 'admin@123 (DEV DEFAULT — set ADMIN_PASSWORD before deploying)' : '****'}`);
    console.log(`  signing key     : ${SIGNING.publicKeyB64.slice(0, 24)}… (embed this in the APK)`);
    console.log(`  admin assets    : ${files.length} file(s)\n`);
});
