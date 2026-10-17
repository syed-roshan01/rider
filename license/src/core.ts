/**
 * license/core.ts — the anti-bypass heart of the Ride Accepter licensing system.
 *
 * Design goals, in priority order:
 *   1. Nothing can be minted client-side. Only this module, on the server, holds
 *      the Ed25519 private key. The Android app embeds ONLY the public key and
 *      verifies tokens offline — so a valid token cannot be forged, only obtained.
 *   2. Tokens are short-lived and device-bound. A leaked token is useless on
 *      another device and dies within `tokenTtlMs`.
 *   3. Server is always authoritative. Status/revocation/expiry are re-checked on
 *      every refresh, so a key can be killed instantly.
 *   4. Secrets at rest are hashed or sealed. A raw database dump yields no usable
 *      license keys.
 *
 * Pure logic only — no I/O, no globals, fully unit-testable.
 */
import {
    generateKeyPairSync,
    sign as edSign,
    verify as edVerify,
    createPrivateKey,
    createPublicKey,
    createCipheriv,
    createDecipheriv,
    createHash,
    randomBytes,
    timingSafeEqual,
} from 'node:crypto';

// ---------------------------------------------------------------------------
// Domain types
// ---------------------------------------------------------------------------

export type PlanType = 'DAY' | 'WEEK' | 'HALF_MONTH' | 'MONTH' | 'YEAR';

export type LicenseStatus = 'unused' | 'active' | 'expired' | 'revoked';

export interface LicenseRecord {
    /** Lookup id: sha256 of the normalized key. Never store the plaintext key. */
    keyHash: string;
    /** AES-256-GCM sealed copy so an admin can re-reveal it. */
    keySealed: string;
    /** Human-friendly key prefix for display, e.g. "RA-7QK2M-…" (first 2 groups). */
    keyPrefix: string;
    planType: PlanType;
    durationDays: number;
    status: LicenseStatus;
    createdAt: number;
    activatedAt: number | null;
    expiresAt: number | null;
    maxDevices: number;
    /**
     * Device codes this key was minted for, hashed. Set at creation time by the
     * seller from the code shown on the customer's login screen — so the key is
     * useless to anyone else from the moment it exists, rather than only after
     * first activation. Empty means "not pre-bound" (legacy behaviour).
     */
    boundDeviceCodeHashes?: string[];
    note: string;
    createdBy: string;
}

export interface DeviceRecord {
    hwidHash: string;
    keyHash: string;
    activatedAt: number;
    lastSeenAt: number;
    appVersion: string;
    model: string;
    brand: string;
    integrity: string;
}

/** The claims carried inside a signed token. */
export interface TokenPayload {
    /** token id — for audit + server-side revocation of a single token */
    jti: string;
    /** key prefix so the token self-identifies without leaking the secret */
    kid: string;
    /** sha256 of the device HWID — binds the token to one device */
    hw: string;
    /** issued-at / expiry, epoch milliseconds */
    iat: number;
    exp: number;
    /** payload schema version */
    v: 1;
}

export interface Policy {
    /** How long an issued token stays valid offline. Bounded grace period. */
    tokenTtlMs: number;
    /** Allowed clock skew when checking iat/exp. */
    clockSkewMs: number;
}

export const DEFAULT_POLICY: Policy = {
    tokenTtlMs: 72 * 60 * 60 * 1000, // 72 h
    clockSkewMs: 5 * 60 * 1000, // 5 min
};

export const PLAN_DAYS: Record<PlanType, number> = {
    DAY: 1,
    WEEK: 7,
    HALF_MONTH: 15,
    MONTH: 30,
    YEAR: 365,
};

export type LicenseErrorCode =
    | 'BAD_FORMAT'
    | 'UNKNOWN_KEY'
    | 'REVOKED'
    | 'EXPIRED'
    | 'NOT_ACTIVATED'
    | 'DEVICE_LIMIT'
    | 'DEVICE_MISMATCH'
    | 'BAD_TOKEN'
    | 'TOKEN_EXPIRED'
    | 'REPLAYED'
    | 'INTEGRITY_FAIL';

export class LicenseError extends Error {
    readonly code: LicenseErrorCode;

    constructor(code: LicenseErrorCode, message: string) {
        super(message);
        this.name = 'LicenseError';
        this.code = code;
    }
}

// ---------------------------------------------------------------------------
// License key generation
// ---------------------------------------------------------------------------

/** Crockford base32 — no I, L, O, U, so keys are unambiguous when read aloud. */
const ALPHABET = '0123456789ABCDEFGHJKMNPQRSTVWXYZ';
const GROUPS = 5;
const CHECK_CHARS = 2;
const BODY_CHARS = 23; // 23 * 5 = 115 bits of entropy (the last 2 chars are the checksum)
const KEY_PREFIX = 'RA';
const CHECK_MOD = 1024; // 2^10 -> exactly two base-32 check characters

/**
 * Two-character checksum over the key body.
 *
 * sum = SUM( a[i] * 3^(n-1-i) ) mod 1024,  check = (-sum) mod 1024.
 *
 * Why this shape: 1024 is a power of two and every 3^k is ODD, hence invertible
 * modulo 1024. That gives two provable properties we test for:
 *
 *   - single substitution at position i changes the sum by d*3^k with d != 0
 *     and 3^k invertible  =>  always non-zero  =>  100% detected.
 *   - swapping neighbours i,i+1 changes it by 2*3^k*(b-a), which is 0 mod 1024
 *     only when (b-a) is a multiple of 512 - impossible for alphabet indices
 *     0..31 unless a == b  =>  100% detected.
 *
 * (A plain mod-32 checksum with a x2 weight cannot do this: 2^k = 0 mod 32 for
 * k >= 5, so early characters would not influence the check at all.)
 */
function checksumChars(body: string): string {
    let sum = 0;
    let pow = 1;
    for (let i = body.length - 1; i >= 0; i--) {
        sum = (sum + ALPHABET.indexOf(body[i]) * pow) % CHECK_MOD;
        pow = (pow * 3) % CHECK_MOD;
    }
    const check = (CHECK_MOD - sum) % CHECK_MOD;
    return ALPHABET[(check >> 5) & 31] + ALPHABET[check & 31];
}

/**
 * Generate a fresh license key, e.g. "RA-7QK2M-3XW8H-9PTD4-RN6ZV-K2M5C".
 * 115 bits of entropy plus a two-character checksum in the final group.
 */
export function generateKey(): string {
    const body: string[] = [];
    while (body.length < BODY_CHARS) {
        for (const byte of randomBytes(BODY_CHARS)) {
            if (body.length >= BODY_CHARS) break;
            body.push(ALPHABET[byte % ALPHABET.length]);
        }
    }
    const bodyStr = body.join('');
    return formatKey(bodyStr + checksumChars(bodyStr));
}

/**
 * Normalize user-typed input: strip separators/prefix, upper-case, and fold the
 * characters Crockford deliberately excludes (O->0, I/L->1, U->V is not needed).
 * Throws LicenseError('BAD_FORMAT') when the checksum does not verify.
 */
export function normalizeKey(input: string): string {
    let s = input.toUpperCase().replace(/[^0-9A-Z]/g, '');
    s = s.replace(/O/g, '0').replace(/[IL]/g, '1');
    if (s.startsWith(KEY_PREFIX) && s.length > BODY_CHARS + CHECK_CHARS) {
        s = s.slice(KEY_PREFIX.length);
    }
    if (s.length !== BODY_CHARS + CHECK_CHARS) {
        throw new LicenseError('BAD_FORMAT', 'key has the wrong length');
    }
    const body = s.slice(0, BODY_CHARS);
    const check = s.slice(BODY_CHARS);
    for (const ch of s) {
        if (!ALPHABET.includes(ch)) {
            throw new LicenseError('BAD_FORMAT', `key contains an invalid character: ${ch}`);
        }
    }
    if (checksumChars(body) !== check) {
        throw new LicenseError('BAD_FORMAT', 'key checksum does not verify (typo?)');
    }
    return s;
}

/** Pretty-print a normalized key body as RA-XXXXX-XXXXX-XXXXX-XXXXX-XXXXX. */
export function formatKey(normalizedBody: string): string {
    const groups = normalizedBody.match(new RegExp(`.{1,${GROUPS}}`, 'g')) ?? [];
    return [KEY_PREFIX, ...groups].join('-');
}

/** Displayable prefix (first two groups) — safe to log/show, not usable. */
export function keyPrefixOf(formatted: string): string {
    return formatted.split('-').slice(0, 2).join('-');
}

/** Stable lookup id for a key. */
export function hashKey(input: string): string {
    return createHash('sha256').update(normalizeKey(input)).digest('hex');
}

// ---------------------------------------------------------------------------
// Device identity
// ---------------------------------------------------------------------------

/**
 * Derive the device HWID from stable hardware/software markers supplied by the
 * Android side. We hash so the raw identifiers never leave the device in the
 * clear and cannot be correlated across systems.
 */
export function deriveHwid(components: Record<string, string>): string {
    const canonical = Object.keys(components)
        .sort()
        .map((k) => `${k}=${components[k]}`)
        .join('|');
    return createHash('sha256').update(canonical).digest('hex');
}

export function hashHwid(hwid: string): string {
    return createHash('sha256').update(hwid).digest('hex');
}

// ---------------------------------------------------------------------------
// Device codes — the short ID shown on the app's login screen
// ---------------------------------------------------------------------------

/**
 * The short device code the customer reads off the login screen, e.g.
 * "7QK2M-3XW8H-PTD4R" — three groups of five, 75 bits of identity. Short enough
 * to dictate over WhatsApp, unique enough that nobody stumbles onto it.
 *
 * Derived from STABLE markers ONLY. `buildFingerprint` and the OS version are
 * deliberately excluded: they change on every Android system update, which would
 * make a paying customer hash to a new code and lock themselves out. ANDROID_ID
 * is stable across app reinstalls and OS updates — it only changes on factory
 * reset, a different signing key, or a different user profile.
 */
export function deriveDeviceCode(components: Record<string, string>): string {
    const stableDigest = deriveHwid({
        androidId: components.androidId ?? '',
        model: components.model ?? '',
        brand: components.brand ?? '',
    });
    const digest = createHash('sha256').update(`ride-accepter/device-code/v1|${stableDigest}`).digest();
    let s = '';
    for (let i = 0; i < 15; i++) {
        // 256 % 32 === 0, so byte%32 is unbiased over the Crockford alphabet
        s += ALPHABET[digest[i] % ALPHABET.length];
    }
    return s.match(/.{1,5}/g)!.join('-');
}

/** Read-out-loud tolerance: same scrubbing rules as license keys. */
export function normalizeDeviceCode(input: string): string {
    return input
        .toUpperCase()
        .replace(/[^0-9A-Z]/g, '')
        .replace(/O/g, '0')
        .replace(/[IL]/g, '1');
}

/** What we store — the code itself never persists in the clear. */
export function hashDeviceCode(code: string): string {
    return createHash('sha256')
        .update(`ride-accepter/device-code/v1|${normalizeDeviceCode(code)}`)
        .digest('hex');
}

// ---------------------------------------------------------------------------
// Ed25519 key management
// ---------------------------------------------------------------------------

export interface KeyPair {
    /** base64 PKCS#8 private key — SERVER SECRET, never ship it */
    privateKeyB64: string;
    /** base64 SPKI public key — this is what gets embedded in the APK */
    publicKeyB64: string;
}

export function generateSigningKeyPair(): KeyPair {
    const { publicKey, privateKey } = generateKeyPairSync('ed25519');
    return {
        privateKeyB64: privateKey.export({ type: 'pkcs8', format: 'der' }).toString('base64'),
        publicKeyB64: publicKey.export({ type: 'spki', format: 'der' }).toString('base64'),
    };
}

// ---------------------------------------------------------------------------
// Token issue / verify
// ---------------------------------------------------------------------------

const b64u = (buf: Buffer): string =>
    buf.toString('base64').replace(/\+/g, '-').replace(/\//g, '_').replace(/=+$/, '');

const fromB64u = (s: string): Buffer =>
    Buffer.from(s.replace(/-/g, '+').replace(/_/g, '/') + '='.repeat((4 - (s.length % 4)) % 4), 'base64');

function payloadBytes(p: TokenPayload): Buffer {
    return Buffer.from(JSON.stringify(p), 'utf8');
}

/**
 * Mint a device-bound, short-lived token. Only ever called server-side.
 */
export function issueToken(
    keyPair: KeyPair,
    claims: Omit<TokenPayload, 'v' | 'iat' | 'exp'>,
    policy: Policy = DEFAULT_POLICY,
    now: number = Date.now(),
): { token: string; payload: TokenPayload } {
    const payload: TokenPayload = {
        ...claims,
        iat: now,
        exp: now + policy.tokenTtlMs,
        v: 1,
    };
    const priv = createPrivateKey({ key: Buffer.from(keyPair.privateKeyB64, 'base64'), format: 'der', type: 'pkcs8' });
    const body = b64u(payloadBytes(payload));
    const sig = edSign(null, Buffer.from(body, 'utf8'), priv);
    return { token: `${body}.${b64u(sig)}`, payload };
}

/**
 * Verify a token offline. This is the ONLY check the Android app can do by
 * itself — and it is sufficient to reject forgeries, foreign devices and
 * expired grants. Anything stronger (revocation, plan changes) needs a refresh.
 */
export function verifyToken(
    token: string,
    publicKeyB64: string,
    policy: Policy = DEFAULT_POLICY,
    now: number = Date.now(),
): TokenPayload {
    const fail = (msg: string, code: LicenseError['code'] = 'BAD_TOKEN') => {
        throw new LicenseError(code, msg);
    };

    const dot = token.lastIndexOf('.');
    if (dot <= 0) fail('malformed token');

    const body = token.slice(0, dot);
    const sigB64 = token.slice(dot + 1);
    let payload: TokenPayload;
    try {
        payload = JSON.parse(fromB64u(body).toString('utf8'));
    } catch {
        return fail('token payload is not valid JSON');
    }
    if (payload?.v !== 1 || !payload.jti || !payload.hw) fail('token payload is missing claims');

    // signature check — reject BEFORE trusting any claim
    let sigOk = false;
    try {
        const pub = createPublicKey({ key: Buffer.from(publicKeyB64, 'base64'), format: 'der', type: 'spki' });
        sigOk = edVerify(null, Buffer.from(body, 'utf8'), pub, fromB64u(sigB64));
    } catch {
        sigOk = false;
    }
    if (!sigOk) fail('token signature is not valid');

    if (payload.exp + policy.clockSkewMs < now) fail('token has expired', 'TOKEN_EXPIRED');
    if (payload.iat - policy.clockSkewMs > now) fail('token is not valid yet');

    return payload;
}

// ---------------------------------------------------------------------------
// Key sealing at rest (so a DB dump yields no usable keys)
// ---------------------------------------------------------------------------

export function sealKey(masterSecret: Buffer, plaintextKey: string): string {
    const iv = randomBytes(12);
    const cipher = createCipheriv('aes-256-gcm', masterSecret, iv);
    const ct = Buffer.concat([cipher.update(normalizeKey(plaintextKey), 'utf8'), cipher.final()]);
    const tag = cipher.getAuthTag();
    return `v1.${b64u(iv)}.${b64u(ct)}.${b64u(tag)}`;
}

export function unsealKey(masterSecret: Buffer, sealed: string): string {
    const [v, ivB, ctB, tagB] = sealed.split('.');
    if (v !== 'v1') throw new LicenseError('BAD_FORMAT', 'unknown seal version');
    const decipher = createDecipheriv('aes-256-gcm', masterSecret, fromB64u(ivB));
    decipher.setAuthTag(fromB64u(tagB));
    const pt = Buffer.concat([decipher.update(fromB64u(ctB)), decipher.final()]);
    return formatKey(pt.toString('utf8'));
}

// ---------------------------------------------------------------------------
// The licensing decision — one place, one truth
// ---------------------------------------------------------------------------

export interface Decision {
    ok: boolean;
    reason?: LicenseError['code'];
    /** remaining validity, ms */
    remainingMs?: number;
}

/**
 * Decide whether a request is entitled. This is what the Cloud Function calls
 * on every activate/refresh and what the app re-applies locally against a
 * verified token. Keeping it pure means we can unit-test every bypass attempt.
 */
export function evaluateEntitlement(input: {
    license: Pick<LicenseRecord, 'status' | 'expiresAt' | 'activatedAt' | 'maxDevices'>;
    boundDeviceCount: number;
    requestingHwidHash: string;
    boundHwidHashes: string[];
    tokenPayload: TokenPayload | null;
    now: number;
    policy?: Policy;
    /**
     * true only on the activation path, where adopting a brand-new device is
     * legitimate. Defaults to false: validate/refresh require the device to be
     * one the licence already owns.
     */
    allowJoin?: boolean;
}): Decision {
    const policy = input.policy ?? DEFAULT_POLICY;
    const { license, now } = input;

    if (license.status === 'revoked') return { ok: false, reason: 'REVOKED' };
    if (license.status === 'unused') return { ok: false, reason: 'NOT_ACTIVATED' };

    if (license.expiresAt == null) return { ok: false, reason: 'NOT_ACTIVATED' };
    const remainingMs = license.expiresAt - now;
    if (remainingMs + policy.clockSkewMs <= 0) return { ok: false, reason: 'EXPIRED', remainingMs: 0 };

    const bound: boolean = input.boundHwidHashes.includes(input.requestingHwidHash);
    if (!bound) {
        // Not a device this licence owns. Only an ACTIVATION may adopt a new
        // device, and only while slots remain (allowJoin). A validate/refresh
        // must never admit an unknown device just because a slot is free —
        // otherwise any holder of a stolen token could ride a spare slot.
        if (!input.allowJoin) return { ok: false, reason: 'DEVICE_MISMATCH' };
        if (input.boundDeviceCount >= license.maxDevices) {
            return { ok: false, reason: 'DEVICE_LIMIT' };
        }
    }

    if (input.tokenPayload) {
        if (input.tokenPayload.hw !== input.requestingHwidHash) {
            return { ok: false, reason: 'DEVICE_MISMATCH' };
        }
        if (input.tokenPayload.exp + policy.clockSkewMs < now) {
            return { ok: false, reason: 'TOKEN_EXPIRED', remainingMs };
        }
    }

    return { ok: true, remainingMs };
}

/** Constant-time string compare, for any secret-derived values. */
export function safeEqual(a: string, b: string): boolean {
    const ab = Buffer.from(a, 'utf8');
    const bb = Buffer.from(b, 'utf8');
    return ab.length === bb.length && timingSafeEqual(ab, bb);
}
