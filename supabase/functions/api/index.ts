// ---------------------------------------------------------------------------
// The `api` Edge Function: the device-facing licence API.
//
// The Android app calls `SERVER + "/api/v1/activate"` where
//   SERVER = "https://ckyfcwbnakbaitzurnze.supabase.co/functions/v1"
// so the request path is `/functions/v1/api/v1/activate`. Supabase routes to
// this function and passes `/v1/activate` through in the pathname — hence the
// suffix matching below. No APK change is needed for the URL shape.
//
// SECURITY INVARIANTS
//   * The Ed25519 PRIVATE key lives only in Deno.env. It never appears in a
//     response, a log line, or an error message.
//   * The Android app holds only the PUBLIC key. Signing happens exclusively
//     here. The app must never reach these tables directly (RLS denies it).
//   * validate/refresh take the PRESENTING deviceCode from the request body.
//     Never trust the token's own `hw` claim as the requester — that makes a
//     stolen token replay as itself.
//   * evaluateEntitlement's allowJoin stays default-false: an unbound device is
//     never admitted just because a device slot happens to be free.
// ---------------------------------------------------------------------------
import { randomUUID } from 'node:crypto';
import {
    DEFAULT_POLICY,
    LicenseError,
    evaluateEntitlement,
    hashDeviceCode,
    hashKey,
    issueToken,
    verifyToken,
    type KeyPair,
    type TokenPayload,
} from '../_shared/license.ts';
import {
    activateLicense,
    audit,
    boundHwids,
    findLicenseByKeyHash,
    getConfigFor,
    touchDevice,
} from '../_shared/db.ts';

const CORS = {
    'access-control-allow-origin': '*',
    'access-control-allow-headers': 'content-type',
    'access-control-allow-methods': 'GET,POST,OPTIONS',
    'content-type': 'application/json; charset=utf-8',
};

function json(status: number, body: unknown): Response {
    return new Response(JSON.stringify(body), { status, headers: CORS });
}

function signing(): KeyPair {
    const privateKeyB64 = Deno.env.get('LICENSE_SIGNING_PRIVATE') ?? '';
    const publicKeyB64 = Deno.env.get('LICENSE_SIGNING_PUBLIC') ?? '';
    if (!privateKeyB64 || !publicKeyB64) throw new Error('signing keys are not configured');
    return { privateKeyB64, publicKeyB64 };
}

async function readJson(req: Request): Promise<Record<string, unknown>> {
    try {
        const t = await req.text();
        return t ? (JSON.parse(t) as Record<string, unknown>) : {};
    } catch {
        return {};
    }
}

function route(pathname: string): string {
    const p = pathname.replace(/\/+$/, '');
    for (const r of ['/v1/activate', '/v1/validate', '/v1/refresh', '/v1/config', '/v1/public-key']) {
        if (p === r || p.endsWith(r)) return r;
    }
    return '';
}

Deno.serve(async (req: Request): Promise<Response> => {
    if (req.method === 'OPTIONS') return new Response(null, { status: 204, headers: CORS });

    try {
        const url = new URL(req.url);
        const r = route(url.pathname);

        // ---- public key -------------------------------------------------
        if (r === '/v1/public-key' && req.method === 'GET') {
            return json(200, { algorithm: 'ed25519', publicKey: signing().publicKeyB64 });
        }

        // ---- config (POST, matching server.ts) --------------------------
        if (r === '/v1/config') {
            const b = await readJson(req);
            const appVersion = Number(b.appVersion ?? 0);
            return json(200, await getConfigFor(appVersion));
        }

        // ---- activate ---------------------------------------------------
        if (r === '/v1/activate' && req.method === 'POST') {
            const b = await readJson(req);
            const key = String(b.key ?? '');
            const markers = (b.device ?? {}) as Record<string, string>;
            const deviceCode = String(b.deviceCode ?? '');
            if (!key || !deviceCode) return json(400, { ok: false, reason: 'DEVICE_CODE_REQUIRED' });

            const result = await activateLicense({
                keyHash: hashKey(key),
                deviceCodeHash: hashDeviceCode(deviceCode),
                appVersion: String(b.appVersion ?? ''),
                model: String(b.model ?? ''),
                brand: String(b.brand ?? ''),
                integrity: String(b.integrity ?? 'UNKNOWN'),
            });
            void markers; // device markers are informational only

            if (!result.ok) {
                await audit('device:' + hashDeviceCode(deviceCode).slice(0, 12), 'activate.denied', String(result.reason ?? ''));
                return json(403, { ok: false, reason: result.reason });
            }

            const rec = await findLicenseByKeyHash(hashKey(key));
            if (!rec) return json(403, { ok: false, reason: 'UNKNOWN_KEY' });

            const { token, payload } = issueToken(signing(), {
                jti: randomUUID(),
                kid: rec.keyPrefix,
                hw: hashDeviceCode(deviceCode),
            });
            await audit('device:' + payload.hw.slice(0, 12), 'activate.ok', rec.keyPrefix);
            return json(200, {
                ok: true,
                token,
                expiresAt: payload.exp,
                license: {
                    planType: rec.planType,
                    expiresAt: rec.expiresAt,
                    maxDevices: rec.maxDevices,
                },
                // the app caches this to verify tokens offline
                publicKey: signing().publicKeyB64,
            });
        }

        // ---- validate / refresh ------------------------------------------
        if ((r === '/v1/validate' || r === '/v1/refresh') && req.method === 'POST') {
            const b = await readJson(req);
            const key = String(b.key ?? '');

            let payload: TokenPayload;
            try {
                payload = verifyToken(String(b.token ?? ''), signing().publicKeyB64);
            } catch (e) {
                return json(401, { ok: false, reason: e instanceof LicenseError ? e.code : 'BAD_TOKEN' });
            }

            const rec = await findLicenseByKeyHash(hashKey(key));
            if (!rec) return json(403, { ok: false, reason: 'UNKNOWN_KEY' });

            // The identity of the device PRESENTING the request. Derived from
            // the caller's own device code, never read back out of the token.
            const presented = String(b.deviceCode ?? '');
            if (!presented) return json(400, { ok: false, reason: 'DEVICE_CODE_REQUIRED' });
            const requesting = hashDeviceCode(presented);

            // An empty array is not nullish, so `??` would never fall back.
            const boundCodes = rec.boundDeviceCodeHashes ?? [];
            const allowed = boundCodes.length ? boundCodes : await boundHwids(rec.keyHash);

            const decision = evaluateEntitlement({
                license: rec,
                boundDeviceCount: (await boundHwids(rec.keyHash)).length,
                requestingHwidHash: requesting,
                boundHwidHashes: allowed,
                tokenPayload: payload,
                now: Date.now(),
                policy: DEFAULT_POLICY,
                allowJoin: false,
            });
            if (!decision.ok) {
                await audit('device:' + payload.hw.slice(0, 12), 'validate.denied', rec.keyPrefix + ' ' + decision.reason);
                return json(403, { ok: false, reason: decision.reason });
            }

            await touchDevice(payload.hw);
            // fresh token -> rolling, bounded offline window
            const reissue = issueToken(signing(), {
                jti: randomUUID(),
                kid: rec.keyPrefix,
                hw: payload.hw,
            });
            return json(200, {
                ok: true,
                token: reissue.token,
                expiresAt: reissue.payload.exp,
                remainingMs: decision.remainingMs,
            });
        }

        return json(404, { error: 'unknown device endpoint' });
    } catch (e) {
        // never leak key material or internals
        console.error('api error:', (e as Error).name);
        return json(500, { error: 'internal error' });
    }
});
