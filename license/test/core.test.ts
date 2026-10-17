/**
 * Tests for the licensing core — the "nobody can bypass this" guarantee.
 * Run with:  node --test license/test/
 */
import { test, describe } from 'node:test';
import assert from 'node:assert/strict';
import {
    generateKey,
    normalizeKey,
    formatKey,
    hashKey,
    keyPrefixOf,
    deriveHwid,
    hashHwid,
    deriveDeviceCode,
    normalizeDeviceCode,
    hashDeviceCode,
    generateSigningKeyPair,
    issueToken,
    verifyToken,
    sealKey,
    unsealKey,
    evaluateEntitlement,
    safeEqual,
    DEFAULT_POLICY,
    LicenseError,
    PLAN_DAYS,
    type LicenseRecord,
    type TokenPayload,
} from '../src/core.ts';

const now = 1_800_000_000_000;

describe('license keys', () => {
    test('generate -> RA- prefix, 5 groups of 5, checksummed', () => {
        for (let i = 0; i < 200; i++) {
            const k = generateKey();
            assert.match(k, /^RA(-[0-9A-HJKMNP-TV-Z]{5}){5}$/);
            // round-trips through normalization
            assert.equal(normalizeKey(k), k.slice(3).replace(/-/g, ''));
        }
    });

    test('keys are unique across a large sample', () => {
        const set = new Set(Array.from({ length: 5000 }, generateKey));
        assert.equal(set.size, 5000);
    });

    test('normalization forgives formatting and lookalike characters', () => {
        const k = generateKey();
        const body = k.slice(3).replace(/-/g, '');
        // lowercase, spaces, missing prefix, O/I/L substitution
        assert.equal(normalizeKey(body.toLowerCase()), body);
        assert.equal(normalizeKey(k.replace(/-/g, ' ')), body);
        assert.equal(normalizeKey(k.replace(/O/g, 'o')), body);
    });

    test('EVERY single-character typo is caught by the checksum', () => {
        const alphabet = '0123456789ABCDEFGHJKMNPQRSTVWXYZ';
        for (let round = 0; round < 8; round++) {
            const body = generateKey().slice(3).replace(/-/g, '');
            assert.equal(body.length, 25);
            for (let pos = 0; pos < body.length; pos++) {
                for (const replacement of alphabet) {
                    if (replacement === body[pos]) continue;
                    const mutated = body.slice(0, pos) + replacement + body.slice(pos + 1);
                    assert.throws(
                        () => normalizeKey(mutated),
                        (e: unknown) => e instanceof LicenseError && e.code === 'BAD_FORMAT',
                        `substituting position ${pos} (${body[pos]} -> ${replacement}) must be rejected`,
                    );
                }
            }
        }
    });

    test('EVERY adjacent transposition is caught by the checksum', () => {
        for (let round = 0; round < 40; round++) {
            const body = generateKey().slice(3).replace(/-/g, '');
            for (let i = 0; i + 1 < body.length; i++) {
                const a = body[i];
                const b = body[i + 1];
                if (a === b) continue;
                const swapped = body.slice(0, i) + b + a + body.slice(i + 2);
                assert.throws(
                    () => normalizeKey(swapped),
                    (e: unknown) => e instanceof LicenseError && e.code === 'BAD_FORMAT',
                    `transposition at ${i} (${a}${b} -> ${b}${a}) must be rejected`,
                );
            }
        }
    });

    test('hashKey is stable and format-independent', () => {
        const k = generateKey();
        const body = k.slice(3).replace(/-/g, '');
        assert.equal(hashKey(k), hashKey(body));
        assert.equal(hashKey(k.toLowerCase()), hashKey(k));
    });

    test('keyPrefixOf leaks only the display prefix', () => {
        const k = generateKey();
        assert.equal(keyPrefixOf(k), k.split('-').slice(0, 2).join('-'));
    });

    test('PLAN_DAYS matches the UI plan names', () => {
        assert.deepEqual(PLAN_DAYS, { DAY: 1, WEEK: 7, HALF_MONTH: 15, MONTH: 30, YEAR: 365 });
    });
});

describe('device binding', () => {
    test('deriveHwid is order-independent over components', () => {
        const a = deriveHwid({ androidId: 'x', model: 'Pixel 8' });
        const b = deriveHwid({ model: 'Pixel 8', androidId: 'x' });
        assert.equal(a, b);
    });

    test('deriveHwid changes when any component changes', () => {
        const base = deriveHwid({ androidId: 'x', model: 'Pixel 8' });
        assert.notEqual(base, deriveHwid({ androidId: 'y', model: 'Pixel 8' }));
        assert.notEqual(base, deriveHwid({ androidId: 'x', model: 'Pixel 9' }));
        assert.notEqual(base, deriveHwid({ androidId: 'x', model: 'Pixel 8', brand: 'Google' }));
    });

    test('hwid hashing is one-way and stable', () => {
        assert.equal(hashHwid('abc'), hashHwid('abc'));
        assert.notEqual(hashHwid('abc'), hashHwid('abd'));
        assert.notEqual(hashHwid('abc'), 'abc');
    });

    // ---- device codes: the short ID shown on the app's login screen --------
    test('device code is stable and readable', () => {
        const code = deriveDeviceCode({ androidId: 'abc123', model: 'Pixel 8', brand: 'Google' });
        assert.match(code, /^[0-9A-HJKMNP-TV-Z]{5}-[0-9A-HJKMNP-TV-Z]{5}-[0-9A-HJKMNP-TV-Z]{5}$/, code);
        assert.equal(deriveDeviceCode({ brand: 'Google', model: 'Pixel 8', androidId: 'abc123' }), code,
            'component order must not matter');
    });

    test('REGRESSION: an OS update must NOT change the device code', () => {
        const phone = { androidId: 'abc123', model: 'Pixel 8', brand: 'Google' };
        const before = deriveDeviceCode(phone);
        // an Android system update changes these — they must be ignored
        const after = deriveDeviceCode({
            ...phone,
            buildFingerprint: 'google/husky/husky:15/AP4A.250105.002/12821496:user/release-keys',
            osVersion: '15',
            securityPatch: '2025-01-05',
        });
        assert.equal(before, after,
            'a system update must not look like a different device (it would lock out paying customers)');
    });

    test('different phones get different device codes', () => {
        const a = deriveDeviceCode({ androidId: 'aaa', model: 'Pixel 8', brand: 'Google' });
        const b = deriveDeviceCode({ androidId: 'bbb', model: 'Pixel 8', brand: 'Google' });
        const c = deriveDeviceCode({ androidId: 'aaa', model: 'Galaxy S24', brand: 'Samsung' });
        assert.notEqual(a, b);
        assert.notEqual(a, c);
    });

    test('GOLDEN: the device-code derivation is frozen', () => {
        // These exact values are pinned on purpose. They are also produced by
        // the Android client (apk-src/.../DeviceIdentity.java), which MUST
        // agree byte for byte — a licence key is bound to this code, so any
        // change here silently invalidates every device code already issued and
        // every key bound to one. If you must change the derivation, bump the
        // domain separator to /v2 and expect to re-issue every licence.
        assert.equal(deriveDeviceCode({ androidId: 'abc123', brand: 'Google', model: 'Pixel 8' }), 'KGQGD-0PRTJ-96VG0');
        assert.equal(deriveDeviceCode({ androidId: 'abcdef0123456789', brand: 'samsung', model: 'SM-N770F' }), '4VKE0-ET673-0P24Q');
        assert.equal(deriveDeviceCode({ androidId: 'aaa', brand: 'Google', model: 'Pixel 8' }), '37QVK-WBCSW-NHRGQ');
        assert.equal(deriveDeviceCode({ androidId: 'aaa', brand: 'Samsung', model: 'Galaxy S24' }), 'K19KG-F48CD-MZA0X');
        assert.equal(deriveDeviceCode({ androidId: '', brand: '', model: '' }), 'GCQGG-EMA3D-SKRVR');
        assert.equal(deriveDeviceCode({ androidId: 'xyz', brand: 'Xiaomi', model: 'Redmi Note 12' }), 'BQN15-YTVC6-TK2RB');
    });

    test('device code hashing tolerates how a human would type it', () => {
        const code = deriveDeviceCode({ androidId: 'abc123', model: 'Pixel 8', brand: 'Google' });
        const clean = code.replace(/-/g, '');
        assert.equal(hashDeviceCode(code), hashDeviceCode(clean), 'dashes are ignored');
        assert.equal(hashDeviceCode(code), hashDeviceCode(code.toLowerCase()), 'case is ignored');
        assert.equal(hashDeviceCode(code), hashDeviceCode(`  ${code}  `), 'whitespace is ignored');
        assert.equal(normalizeDeviceCode('O1l-i'), '0111', 'O/I/L are read as 0/1/1');
    });
});

describe('signed tokens — the core anti-forgery property', () => {
    const kp = generateSigningKeyPair();
    const hw = hashHwid('device-A');

    const claims = { jti: 'jti-1', kid: 'RA-AAAAA', hw };

    test('a legitimately issued token verifies', () => {
        const { token, payload } = issueToken(kp, claims, DEFAULT_POLICY, now);
        const got = verifyToken(token, kp.publicKeyB64, DEFAULT_POLICY, now + 1000);
        assert.equal(got.jti, 'jti-1');
        assert.equal(got.hw, hw);
        assert.equal(got.exp, now + DEFAULT_POLICY.tokenTtlMs);
        assert.deepEqual({ ...payload, iat: got.iat, exp: got.exp }, got);
    });

    test('FORGERY: flipping any claim breaks the signature', () => {
        const { token } = issueToken(kp, claims, DEFAULT_POLICY, now);
        const [body, sig] = token.split('.');
        const decoded = JSON.parse(Buffer.from(body.replace(/-/g, '+').replace(/_/g, '/'), 'base64').toString());

        for (const mutate of [
            (p: TokenPayload) => ({ ...p, hw: hashHwid('device-B') }), // steal for another device
            (p: TokenPayload) => ({ ...p, exp: p.exp + 10 ** 12 }), // extend forever
            (p: TokenPayload) => ({ ...p, kid: 'RA-ZZZZZ' }), // re-point at another key
            (p: TokenPayload) => ({ ...p, jti: 'jti-2' }), // forge a fresh token id
        ]) {
            const tamperedBody = Buffer.from(JSON.stringify(mutate(decoded))).toString('base64')
                .replace(/\+/g, '-').replace(/\//g, '_').replace(/=+$/, '');
            assert.throws(
                () => verifyToken(`${tamperedBody}.${sig}`, kp.publicKeyB64, DEFAULT_POLICY, now),
                (e: unknown) => e instanceof LicenseError && e.code === 'BAD_TOKEN',
            );
        }
    });

    test('FORGERY: a token signed with a different key is rejected', () => {
        const attacker = generateSigningKeyPair();
        const { token } = issueToken(attacker, claims, DEFAULT_POLICY, now);
        assert.throws(
            () => verifyToken(token, kp.publicKeyB64, DEFAULT_POLICY, now),
            (e: unknown) => e instanceof LicenseError && e.code === 'BAD_TOKEN',
        );
    });

    test('FORGERY: garbage / truncated tokens are rejected', () => {
        for (const t of ['', '.', 'a.b', 'x.y.z', 'not-a-token', 'AAAA.BBBB', 'a.b.c.d']) {
            assert.throws(
                () => verifyToken(t, kp.publicKeyB64, DEFAULT_POLICY, now),
                (e: unknown) => e instanceof LicenseError && e.code === 'BAD_TOKEN',
            );
        }
    });

    test('EXPIRY: an expired token is rejected even with a valid signature', () => {
        const { token } = issueToken(kp, claims, DEFAULT_POLICY, now);
        const afterExpiry = now + DEFAULT_POLICY.tokenTtlMs + DEFAULT_POLICY.clockSkewMs + 1;
        assert.throws(
            () => verifyToken(token, kp.publicKeyB64, DEFAULT_POLICY, afterExpiry),
            (e: unknown) => e instanceof LicenseError && e.code === 'TOKEN_EXPIRED',
        );
    });

    test('EXPIRY: token is valid right up to exp + clock-skew', () => {
        const { token } = issueToken(kp, claims, DEFAULT_POLICY, now);
        const edge = now + DEFAULT_POLICY.tokenTtlMs + DEFAULT_POLICY.clockSkewMs - 1;
        assert.doesNotThrow(() => verifyToken(token, kp.publicKeyB64, DEFAULT_POLICY, edge));
    });

    test('REPLAY: a back-dated token (iat in the future) is rejected', () => {
        const { token } = issueToken(kp, claims, DEFAULT_POLICY, now + 10 ** 9);
        assert.throws(() => verifyToken(token, kp.publicKeyB64, DEFAULT_POLICY, now));
    });

    test('offline capability: verify needs only the public key', () => {
        const { token } = issueToken(kp, claims, DEFAULT_POLICY, now);
        // simulate the device: only the public key is available
        const pubOnly = { publicKeyB64: kp.publicKeyB64 };
        const got = verifyToken(token, pubOnly.publicKeyB64, DEFAULT_POLICY, now);
        assert.equal(got.hw, hw);
    });
});

describe('key sealing at rest', () => {
    test('sealed keys are recoverable but not readable', () => {
        const master = Buffer.alloc(32, 7);
        const k = generateKey();
        const sealed = sealKey(master, k);
        assert.notEqual(sealed, k);
        assert.ok(!sealed.includes(k.slice(3, 13)), 'sealed blob must not contain key material');
        assert.equal(unsealKey(master, sealed), k);
    });

    test('sealing is non-deterministic (fresh IV) yet both open', () => {
        const master = Buffer.alloc(32, 7);
        const k = generateKey();
        const a = sealKey(master, k);
        const b = sealKey(master, k);
        assert.notEqual(a, b);
        assert.equal(unsealKey(master, a), k);
        assert.equal(unsealKey(master, b), k);
    });

    test('the wrong master secret cannot unseal', () => {
        const k = generateKey();
        const sealed = sealKey(Buffer.alloc(32, 7), k);
        assert.throws(() => unsealKey(Buffer.alloc(32, 8), sealed));
    });

    test('a tampered ciphertext cannot unseal (GCM auth)', () => {
        const master = Buffer.alloc(32, 7);
        const sealed = sealKey(master, generateKey());
        const [v, iv, ct, tag] = sealed.split('.');
        const flipped = Buffer.from(ct, 'base64');
        flipped[0] ^= 0xff;
        assert.throws(() => unsealKey(master, [v, iv, flipped.toString('base64'), tag].join('.')));
    });
});

describe('entitlement decision — every bypass attempt', () => {
    const hwA = hashHwid('A');
    const hwB = hashHwid('B');

    const activeLicense = (over: Partial<LicenseRecord> = {}) => ({
        status: 'active' as const,
        activatedAt: now,
        expiresAt: now + 30 * 86_400_000,
        maxDevices: 1,
        ...over,
    });

    const tokenFor = (hw: string): TokenPayload => ({
        jti: 'j1', kid: 'RA-AAAAA', hw, iat: now, exp: now + 72 * 3600_000, v: 1,
    });

    test('legitimate owner on their bound device is entitled', () => {
        const d = evaluateEntitlement({
            license: activeLicense(), boundDeviceCount: 1,
            requestingHwidHash: hwA, boundHwidHashes: [hwA],
            tokenPayload: tokenFor(hwA), now,
        });
        assert.equal(d.ok, true);
        assert.ok(d.remainingMs! > 0);
    });

    test('BYPASS: revoked key is refused immediately', () => {
        const d = evaluateEntitlement({
            license: activeLicense({ status: 'revoked' }), boundDeviceCount: 1,
            requestingHwidHash: hwA, boundHwidHashes: [hwA],
            tokenPayload: tokenFor(hwA), now,
        });
        assert.deepEqual({ ok: d.ok, reason: d.reason }, { ok: false, reason: 'REVOKED' });
    });

    test('BYPASS: unused (never activated) key is refused', () => {
        const d = evaluateEntitlement({
            license: activeLicense({ status: 'unused', activatedAt: null, expiresAt: null }),
            boundDeviceCount: 0, requestingHwidHash: hwA, boundHwidHashes: [],
            tokenPayload: null, now,
        });
        assert.equal(d.reason, 'NOT_ACTIVATED');
    });

    test('BYPASS: expired key is refused', () => {
        const d = evaluateEntitlement({
            // stale beyond the configured clock-skew grace
            license: activeLicense({ expiresAt: now - DEFAULT_POLICY.clockSkewMs - 1 }),
            boundDeviceCount: 1,
            requestingHwidHash: hwA, boundHwidHashes: [hwA],
            tokenPayload: tokenFor(hwA), now,
        });
        assert.deepEqual({ ok: d.ok, reason: d.reason }, { ok: false, reason: 'EXPIRED' });
    });

    test('BYPASS: sharing a key past maxDevices is refused', () => {
        const d = evaluateEntitlement({
            license: activeLicense({ maxDevices: 1 }), boundDeviceCount: 1,
            requestingHwidHash: hwB, boundHwidHashes: [hwA], // B is not bound, A fills the slot
            tokenPayload: null, now,
            allowJoin: true, // activation context — the only place joining is legal
        });
        assert.deepEqual({ ok: d.ok, reason: d.reason }, { ok: false, reason: 'DEVICE_LIMIT' });
    });

    test('BYPASS: validate/refresh never admits an unbound device, even with a free slot', () => {
        // maxDevices=2 but only one device bound -> a spare slot is sitting there.
        // A stolen token must NOT be able to ride it. (allowJoin defaults to false
        // on every path except activation.)
        const d = evaluateEntitlement({
            license: activeLicense({ maxDevices: 2 }), boundDeviceCount: 1,
            requestingHwidHash: hwB, boundHwidHashes: [hwA],
            tokenPayload: tokenFor(hwB), now,
        });
        assert.deepEqual({ ok: d.ok, reason: d.reason }, { ok: false, reason: 'DEVICE_MISMATCH' });
    });

    test('BYPASS: a valid token from another device is refused', () => {
        const d = evaluateEntitlement({
            license: activeLicense({ maxDevices: 2 }), boundDeviceCount: 1,
            requestingHwidHash: hwB, boundHwidHashes: [hwA],
            tokenPayload: tokenFor(hwA), // token bound to A, request from B
            now,
        });
        assert.deepEqual({ ok: d.ok, reason: d.reason }, { ok: false, reason: 'DEVICE_MISMATCH' });
    });

    test('BYPASS: a stale token is refused even if the key is fine', () => {
        // must be stale beyond the clock-skew grace to be a genuine bypass attempt
        const stale: TokenPayload = {
            ...tokenFor(hwA),
            exp: now - DEFAULT_POLICY.clockSkewMs - 1,
        };
        const d = evaluateEntitlement({
            license: activeLicense(), boundDeviceCount: 1,
            requestingHwidHash: hwA, boundHwidHashes: [hwA],
            tokenPayload: stale, now,
        });
        assert.deepEqual({ ok: d.ok, reason: d.reason }, { ok: false, reason: 'TOKEN_EXPIRED' });
    });

    test('clock-skew grace on tokens is exactly bounded (no extra free ride)', () => {
        const withinSkew: TokenPayload = { ...tokenFor(hwA), exp: now - DEFAULT_POLICY.clockSkewMs + 1 };
        assert.equal(
            evaluateEntitlement({ license: activeLicense(), boundDeviceCount: 1, requestingHwidHash: hwA,
                boundHwidHashes: [hwA], tokenPayload: withinSkew, now }).ok,
            true,
            'just inside the grace window is still accepted',
        );
        const pastSkew: TokenPayload = { ...tokenFor(hwA), exp: now - DEFAULT_POLICY.clockSkewMs - 1 };
        assert.equal(
            evaluateEntitlement({ license: activeLicense(), boundDeviceCount: 1, requestingHwidHash: hwA,
                boundHwidHashes: [hwA], tokenPayload: pastSkew, now }).ok,
            false,
            'one millisecond past the grace window is refused',
        );
    });

    test('a second device fits when maxDevices allows it (activation joins)', () => {
        const d = evaluateEntitlement({
            license: activeLicense({ maxDevices: 2 }), boundDeviceCount: 1,
            requestingHwidHash: hwB, boundHwidHashes: [hwA],
            tokenPayload: null, now,
            allowJoin: true,
        });
        assert.equal(d.ok, true);
    });

    test('clock skew grants only the configured grace, no more', () => {
        const justExpired = activeLicense({ expiresAt: now - DEFAULT_POLICY.clockSkewMs + 1 });
        assert.equal(
            evaluateEntitlement({ license: justExpired, boundDeviceCount: 1, requestingHwidHash: hwA,
                boundHwidHashes: [hwA], tokenPayload: null, now }).ok,
            true,
        );
        const expiredBeyondSkew = activeLicense({ expiresAt: now - DEFAULT_POLICY.clockSkewMs - 1 });
        assert.equal(
            evaluateEntitlement({ license: expiredBeyondSkew, boundDeviceCount: 1, requestingHwidHash: hwA,
                boundHwidHashes: [hwA], tokenPayload: null, now }).ok,
            false,
        );
    });
});

describe('misc', () => {
    test('safeEqual compares without throwing on length mismatch', () => {
        assert.equal(safeEqual('abc', 'abc'), true);
        assert.equal(safeEqual('abc', 'abd'), false);
        assert.equal(safeEqual('abc', 'abcd'), false);
    });

    test('formatKey round-trips', () => {
        const k = generateKey();
        assert.equal(formatKey(normalizeKey(k)), k);
    });
});
