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
    LicenseError,
    DEFAULT_POLICY,
    PLAN_DAYS,
    type KeyPair,
    type PlanType,
    type LicenseStatus,
} from './core.ts';
import { Store, DEFAULT_CONFIG, type AppConfig } from './store.ts';

const HERE = fileURLToPath(new URL('.', import.meta.url));
const ROOT = resolve(HERE, '..'); // license/
const WORKSPACE = resolve(ROOT, '..');

const DATA_DIR = join(ROOT, 'data');
const KEY_DIR = join(ROOT, 'keys');
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

const MIME: Record<string, string> = {
    '.html': 'text/html; charset=utf-8',
    '.js': 'text/javascript; charset=utf-8',
    '.css': 'text/css; charset=utf-8',
    '.json': 'application/json; charset=utf-8',
    '.svg': 'image/svg+xml',
    '.png': 'image/png',
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

function serveStatic(res: ServerResponse, rel: string): void {
    // path traversal guard: resolve and require the result to stay in ADMIN_DIR
    const target = resolve(ADMIN_DIR, '.' + (rel === '/' ? '/index.html' : rel));
    if (target !== ADMIN_DIR && !target.startsWith(ADMIN_DIR + sep)) {
        json(res, 403, { error: 'forbidden' });
        return;
    }
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

        const actor = adminFrom(req, url);
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

        const m = /^\/api\/admin\/licenses\/([a-f0-9]{64})\/(\w+)$/.exec(path);
        if (m && method === 'POST') {
            const [, keyHash, action] = m;
            const b = await readBody(req, res);
            try {
                switch (action) {
                    case 'extend':
                        json(res, 200, store.extend(actor, keyHash, Number(b.days ?? 30)));
                        return;
                    case 'revoke':
                        json(res, 200, store.revoke(actor, keyHash));
                        return;
                    case 'unrevoke':
                        json(res, 200, store.unrevoke(actor, keyHash));
                        return;
                    case 'maxDevices':
                        json(res, 200, store.setMaxDevices(actor, keyHash, Number(b.maxDevices ?? 1)));
                        return;
                    case 'reveal':
                        json(res, 200, { key: store.revealKey(keyHash) });
                        return;
                    case 'delete':
                        store.deleteLicense(actor, keyHash);
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
