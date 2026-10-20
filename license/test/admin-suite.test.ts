/**
 * license/test/admin-suite.test.ts -- unit pins for the AcceptPro admin suite
 * (ADMIN-PORT.md sections 2-5): panel auth, money math, plan mapping, the
 * Device ID value space, checkout ids, and the store invariants the admin API
 * relies on (quota counting, log cap, TTL side keys, secrets doctrine).
 *
 * Style: node:test + assert/strict, run DIRECTLY (node license/test/
 * admin-suite.test.ts) -- `node --test` child spawning is blocked in the
 * authoring sandbox. Every store is a throwaway JSON file under the OS temp
 * dir. This file is PURE ASCII; the copy strings that contain en/em dashes are
 * asserted through \u escapes so no hidden characters live in the source.
 */
import { test, describe, after } from 'node:test';
import assert from 'node:assert/strict';
import { createHmac, randomBytes } from 'node:crypto';
import { mkdtempSync, readFileSync, rmSync } from 'node:fs';
import { tmpdir } from 'node:os';
import { join } from 'node:path';
import { generateKey, hashDeviceCode, keyPrefixOf, normalizeDeviceCode } from '../src/core.ts';
import {
    DEV_JWT_FALLBACK,
    JWT_TTL_SEC,
    getTokenFromRequest,
    hashPassword,
    requireAuth,
    requireSuper,
    signToken,
    verifyPassword,
    verifyToken,
} from '../src/panel-auth.ts';
import {
    attributedRevenue,
    commissionAmount,
    affiliateStatsFormulas,
    globalMoney,
    priceFields,
} from '../src/panel-money.ts';
import {
    LIFETIME_EXPIRY_TS,
    displayDeviceCode,
    enginePlan,
    isDeviceIdInput,
    metaExpiryTs,
    normalizeDeviceId,
} from '../src/panel-plans.ts';
import { ORDER_ID_RE, newOrderId } from '../src/panel-checkout.ts';
import { MAX_PANEL_LOGS, ORDER_LOCK_TTL_SEC, ORDER_TTL_SEC, PENDING_TTL_SEC, Store } from '../src/store.ts';

// Byte-exact copy strings with hidden dashes, asserted via escapes.
const EN_DASH = '\u2013'; // EN DASH U+2013
const EM_DASH = '\u2014'; // EM DASH U+2014

// Deterministic JWT secret for the whole run (jwtSecret() reads env at call
// time, so pinning it here keeps sign/forge/verify consistent).
const SECRET = process.env.JWT_SECRET ?? 'admin-suite-test-secret';
process.env.JWT_SECRET = SECRET;

const TMP_DIRS: string[] = [];

after(() => {
    for (const dir of TMP_DIRS) {
        try {
            rmSync(dir, { recursive: true, force: true });
        } catch {
            // best-effort cleanup
        }
    }
});

/** One throwaway JSON store per test group. */
function tempStore(): { store: Store; dbPath: string } {
    const dir = mkdtempSync(join(tmpdir(), 'acceptpro-admin-suite-'));
    TMP_DIRS.push(dir);
    const dbPath = join(dir, 'db.json');
    return { store: new Store(dbPath, randomBytes(32)), dbPath };
}

function b64u(buf: Buffer): string {
    return buf.toString('base64').replace(/\+/g, '-').replace(/\//g, '_').replace(/=+$/, '');
}

/** Hand-build an HS256 JWT so expiry/alg cases can be forged deliberately. */
function forgeToken(payload: Record<string, unknown>, secret: string = SECRET): string {
    const h = b64u(Buffer.from(JSON.stringify({ alg: 'HS256', typ: 'JWT' }), 'utf8'));
    const p = b64u(Buffer.from(JSON.stringify(payload), 'utf8'));
    const s = b64u(createHmac('sha256', Buffer.from(secret, 'utf8')).update(`${h}.${p}`, 'utf8').digest());
    return `${h}.${p}.${s}`;
}

function bearer(token: string): { headers: Record<string, string> } {
    return { headers: { authorization: `Bearer ${token}` } };
}

// ---------------------------------------------------------------------------
describe('panel auth (ADMIN-PORT section 3)', () => {
    test('JWT round trip preserves claims and exp = iat + 8h', () => {
        const token = signToken({ sub: 'u1', username: 'admin1', role: 'super', name: 'Syed' });
        const s = verifyToken(token);
        assert.ok(s, 'a legitimately signed token verifies');
        assert.equal(s.sub, 'u1');
        assert.equal(s.username, 'admin1');
        assert.equal(s.role, 'super');
        assert.equal(s.name, 'Syed');
        assert.equal(s.exp - s.iat, JWT_TTL_SEC);
        assert.equal(JWT_TTL_SEC, 8 * 60 * 60);
    });

    test('the name claim rides along only when present', () => {
        const s = verifyToken(signToken({ sub: 'u2', username: 'admin2', role: 'admin' }));
        assert.ok(s);
        assert.equal('name' in s, false, 'no name claim is emitted when absent');
    });

    test('TAMPER: a rewritten payload breaks the signature', () => {
        const token = signToken({ sub: 'u3', username: 'admin3', role: 'super' });
        const [h, p, sig] = token.split('.');
        const raw = JSON.parse(Buffer.from(p.replace(/-/g, '+').replace(/_/g, '/'), 'base64').toString('utf8'));
        raw.role = 'super';
        raw.sub = 'attacker';
        const forgedP = b64u(Buffer.from(JSON.stringify(raw), 'utf8'));
        assert.equal(verifyToken(`${h}.${forgedP}.${sig}`), null);
    });

    test('TAMPER: a token signed with the wrong secret is rejected', () => {
        const token = forgeToken({ sub: 'u4', username: 'admin4', role: 'super', iat: 1, exp: 9999999999 }, 'other-secret');
        assert.equal(verifyToken(token), null);
    });

    test('EXPIRY: an expired token is rejected even with a valid signature', () => {
        const now = Math.floor(Date.now() / 1000);
        const expired = forgeToken({ sub: 'u5', username: 'admin5', role: 'super', iat: now - 120, exp: now - 60 });
        assert.equal(verifyToken(expired), null);
        const live = forgeToken({ sub: 'u5', username: 'admin5', role: 'super', iat: now - 60, exp: now + 60 });
        assert.ok(verifyToken(live));
    });

    test('ALG: the none algorithm and garbage tokens are rejected', () => {
        const now = Math.floor(Date.now() / 1000);
        const p = b64u(Buffer.from(JSON.stringify({ sub: 'u6', username: 'admin6', role: 'super', iat: now, exp: now + 60 }), 'utf8'));
        const h = b64u(Buffer.from(JSON.stringify({ alg: 'none', typ: 'JWT' }), 'utf8'));
        assert.equal(verifyToken(`${h}.${p}.`), null);
        assert.equal(verifyToken('not-a-token'), null);
        assert.equal(verifyToken(''), null);
    });

    test('SCRYPT: password hashes round-trip and fail closed', () => {
        const stored = hashPassword('smoke-pass-123');
        assert.match(stored, /^scrypt\$[0-9a-f]{32}\$[0-9a-f]{64}$/);
        assert.equal(verifyPassword('smoke-pass-123', stored), true);
        assert.equal(verifyPassword('wrong', stored), false);
        assert.equal(verifyPassword('smoke-pass-123', 'garbage'), false);
    });

    test('request gates: 401 Unauthorized, 403 with the EM DASH copy', () => {
        assert.equal(getTokenFromRequest(bearer('tok')), 'tok');
        assert.equal(getTokenFromRequest({}), null);
        assert.equal(requireAuth({}).error, 'Unauthorized');
        assert.equal(requireAuth({}).status, 401);

        const adminReq = bearer(signToken({ sub: 'u7', username: 'admin7', role: 'admin' }));
        const gate = requireSuper(adminReq);
        assert.equal(gate.status, 403);
        assert.equal(gate.error, `Forbidden ${EM_DASH} super admin only`);

        const superReq = bearer(signToken({ sub: 'u8', username: 'admin8', role: 'super' }));
        assert.ok(requireSuper(superReq).session);
    });
});

// ---------------------------------------------------------------------------
describe('money math (ADMIN-PORT section 4)', () => {
    test('price/discount clamp: discounted never exceeds price', () => {
        assert.deepEqual(priceFields(100, 150), { price: 100, discountedPrice: 100, discountAmount: 0 });
        assert.deepEqual(priceFields(100, 40), { price: 100, discountedPrice: 40, discountAmount: 60 });
        assert.deepEqual(priceFields(100, ''), { price: 100, discountedPrice: 100, discountAmount: 0 });
        assert.deepEqual(priceFields(100, null), { price: 100, discountedPrice: 100, discountAmount: 0 });
        assert.deepEqual(priceFields(100, undefined), { price: 100, discountedPrice: 100, discountAmount: 0 });
        assert.deepEqual(priceFields(-5, 50), { price: 0, discountedPrice: 0, discountAmount: 0 });
        assert.deepEqual(priceFields('99.5', '12.25'), { price: 99.5, discountedPrice: 12.25, discountAmount: 87.25 });
    });

    test('attributed revenue prefers the discounted figure when present', () => {
        assert.equal(attributedRevenue(100, 40), 40);
        assert.equal(attributedRevenue(100, 0), 100);
    });

    test('commission is parseFloat((revenue * commission / 100).toFixed(2))', () => {
        assert.equal(commissionAmount(200, 10), 20);
        assert.equal(commissionAmount(33.33, 15), 5); // 4.9995 -> '5.00'
        assert.equal(commissionAmount(0, 25), 0);
    });

    test('affiliate stats: totals, demo split, balance = max(0, owed - paid)', () => {
        const rows = [
            { price: 1000, isTrial: false, converted: true },
            { price: 500, isTrial: true, converted: false },
            { price: 0, isTrial: false, converted: false },
            { price: 250, isTrial: false, converted: true },
        ];
        const r = affiliateStatsFormulas(rows, [{ amount: 300 }, { amount: '50' }], 15);
        assert.equal(r.totalClients, 4);
        assert.equal(r.demoClients, 2, 'trial rows and zero-price rows count as demo');
        assert.equal(r.convertedClients, 2);
        assert.equal(r.totalRevenue, 1250);
        assert.equal(r.commissionAmount, 187.5);
        assert.equal(r.commissionPercent, 15);
        assert.equal(r.totalPaid, 350);
        assert.equal(r.balance, 0, 'overpayment floors at zero');

        const owed = affiliateStatsFormulas(rows, [{ amount: 50 }], 15);
        assert.equal(owed.balance, 137.5, 'balance = commissionAmount - totalPaid');
    });

    test('global money: verbatim formulas AND the two identities', () => {
        const gm = globalMoney({
            licenses: [
                { price: 1000, affiliateId: 'a1' }, // rate 10% -> 100
                { price: 500, affiliateId: 'a1', affiliateCommissionAmount: 50 }, // stored -> 50
                { price: 300, revoked: true, affiliateId: 'a1' }, // excluded
                { price: 200, whitelabelIssued: true, affiliateId: 'a1' }, // excluded
                { price: 0 }, // excluded
                { price: 250, discountedPrice: 200, affiliateId: 'a2' }, // rate 20% of 200 -> 40
            ],
            expenses: [{ amount: 100 }, { amount: '50' }],
            affiliates: [{ id: 'a1', commission: 10 }, { id: 'a2', commission: 20 }],
            withdrawals: [{ amount: 300 }, { amount: 50 }],
        });
        assert.equal(gm.totalRevenue, 1750);
        assert.equal(gm.totalExpenses, 150);
        assert.equal(gm.affilCommission, 190, 'stored amounts win, else rate over discountedPrice ?? price');
        assert.equal(gm.totalRevenueBasis, 1410);
        assert.equal(gm.allWithdrawn, 350);
        assert.equal(gm.moneyLeft, 1060);
        // the two identities, checked structurally
        assert.equal(gm.totalRevenueBasis, gm.totalRevenue - gm.totalExpenses - gm.affilCommission);
        assert.equal(gm.moneyLeft, gm.totalRevenueBasis - gm.allWithdrawn);
    });
});

// ---------------------------------------------------------------------------
describe('plan mapping and device id (ADMIN-PORT section 2)', () => {
    test('the full plan table maps to engine planType/durationDays', () => {
        const cases: [string, string, number][] = [
            ['trial1day', 'DAY', 1],
            ['trial', 'DAY', 3],
            ['weekly', 'WEEK', 7],
            ['monthly', 'MONTH', 30],
            ['3months', 'MONTH', 90],
            ['6months', 'MONTH', 180],
            ['yearly', 'YEAR', 365],
            ['lifetime', 'YEAR', 36500],
            ['unknown-label', 'MONTH', 30],
        ];
        for (const [label, planType, durationDays] of cases) {
            const e = enginePlan(label);
            assert.equal(e.planType, planType, label);
            assert.equal(e.durationDays, durationDays, label);
            assert.equal(e.isLifetime, label === 'lifetime', label);
        }
        assert.deepEqual(enginePlan('custom', 45), { planType: 'MONTH', durationDays: 45, isLifetime: false });
        assert.equal(enginePlan('custom', 0).durationDays, 1);
        assert.equal(enginePlan('custom', 'junk').durationDays, 1);
    });

    test('planExpiryTs: issuedAt + days*86400, lifetime pinned to 253402300799', () => {
        assert.equal(metaExpiryTs('monthly', undefined, 1700000000), 1700000000 + 30 * 86400);
        assert.equal(metaExpiryTs('custom', 45, 1700000000), 1700000000 + 45 * 86400);
        assert.equal(metaExpiryTs('lifetime', undefined, 1700000000), LIFETIME_EXPIRY_TS);
        assert.equal(LIFETIME_EXPIRY_TS, 253402300799);
    });

    test('Device ID: typing variants normalize to one value space', () => {
        const CODE = 'BK4JC-74W07-YMWT5';
        assert.equal(normalizeDeviceId(CODE), 'BK4JC74W07YMWT5');
        assert.equal(normalizeDeviceId('bk4jc74w07ymwt5'), 'BK4JC74W07YMWT5');
        assert.equal(normalizeDeviceId('bk4jc-74w07-ymwt5'), 'BK4JC74W07YMWT5');
        assert.equal(normalizeDeviceId('  bk4jc 74w07 ymwt5  '), 'BK4JC74W07YMWT5');
        assert.ok(isDeviceIdInput(CODE));
        assert.ok(isDeviceIdInput('bk4jc 74w07 ymwt5'));
        assert.equal(displayDeviceCode('bk4jc74w07ymwt5'), CODE);
        assert.equal(hashDeviceCode(CODE), hashDeviceCode('bk4jc 74w07 ymwt5'));
    });

    test('Device ID lookalikes fold (O->0, I/L->1) but U is rejected', () => {
        // read-out-loud tolerance, same scrubbing as license keys
        assert.equal(normalizeDeviceCode('O1l-i'), '0111');
        assert.equal(normalizeDeviceId('ooojc-74w07-ymwt5'), '000JC74W07YMWT5');
        // the canonical 15-char value space excludes I/L/O/U outright
        assert.equal(isDeviceIdInput('BK4JC-74W07-YMWTU'), false, 'U is not in the alphabet');
        assert.equal(isDeviceIdInput('BK4JC-74W07-YMWT'), false, '14 chars');
        assert.equal(isDeviceIdInput('BK4JC-74W07-YMWT55'), false, '16 chars');
        assert.equal(isDeviceIdInput(''), false);
    });
});

// ---------------------------------------------------------------------------
describe('checkout ids and TTL constants (ADMIN-PORT sections 1-2)', () => {
    test('order ids are AP + 24 hex UPPER and unique', () => {
        const seen = new Set<string>();
        for (let i = 0; i < 50; i++) {
            const id = newOrderId();
            assert.match(id, /^AP[A-F0-9]{24}$/);
            assert.ok(ORDER_ID_RE.test(id));
            seen.add(id);
        }
        assert.equal(seen.size, 50);
    });

    test('TTL constants match spec section 2', () => {
        assert.equal(ORDER_TTL_SEC, 60 * 60 * 24 * 90);
        assert.equal(PENDING_TTL_SEC, 60 * 60 * 24);
        assert.equal(ORDER_LOCK_TTL_SEC, 30);
    });
});

// ---------------------------------------------------------------------------
describe('store invariants (quota, logs, TTL keys, secrets doctrine)', () => {
    test('setMaxDevices clamps to 1..10', () => {
        const { store } = tempStore();
        const [k] = store.createLicenses('tester', { count: 1, planType: 'MONTH', maxDevices: 1 });
        const kh = k.record.keyHash;
        assert.equal(store.setMaxDevices('tester', kh, 0).maxDevices, 1);
        assert.equal(store.setMaxDevices('tester', kh, -3).maxDevices, 1);
        assert.equal(store.setMaxDevices('tester', kh, 5).maxDevices, 5);
        assert.equal(store.setMaxDevices('tester', kh, 10).maxDevices, 10);
        assert.equal(store.setMaxDevices('tester', kh, 100).maxDevices, 10);
        assert.equal(store.setMaxDevices('tester', kh, 2.9).maxDevices, 2);
    });

    test('quota counting excludes conversion-revoked keys only', () => {
        const { store } = tempStore();
        const ks = store.createLicenses('wl-test', { count: 3, planType: 'DAY', durationDays: 3, maxDevices: 1 });
        for (const k of ks) store.saveLicenseMeta(store.synthLicenseMeta(k.record));
        assert.equal(store.countIssuedLicenses('wl-test'), 3);

        // trial -> paid conversion auto-revokes the old key; it must stop counting
        const m1 = store.getLicenseMeta(ks[1].record.keyHash);
        assert.ok(m1);
        if (m1) {
            store.saveLicenseMeta({
                ...m1,
                revoked: true,
                revokedReason: `Converted to monthly plan (key: ${keyPrefixOf(ks[2].key)})`,
            });
        }
        assert.equal(store.countIssuedLicenses('wl-test'), 2, 'conversion is quota-neutral');

        // a plain revocation still counts against the quota
        const m2 = store.getLicenseMeta(ks[2].record.keyHash);
        assert.ok(m2);
        if (m2) store.saveLicenseMeta({ ...m2, revoked: true, revokedReason: 'Client refunded' });
        assert.equal(store.countIssuedLicenses('wl-test'), 2);

        // deletion removes the row entirely
        store.deleteLicenseMeta(ks[0].record.keyHash);
        assert.equal(store.countIssuedLicenses('wl-test'), 1);
    });

    test('convert revokedReason template: prefix only, never the full key', () => {
        const newKey = generateKey();
        const reason = `Converted to monthly plan (key: ${keyPrefixOf(newKey)})`;
        assert.match(reason, /^Converted to monthly plan \(key: RA-[0-9A-HJKMNP-TV-Z]{5}\)$/);
        assert.ok(reason.startsWith('Converted to'), 'quota + console isConverted key off this prefix');
        assert.equal(reason.includes(newKey), false, 'the full key must never appear in a log string');
    });

    test('panel logs: newest-first with a hard 1000-entry cap', () => {
        const { store } = tempStore();
        for (let i = 1; i <= 1005; i++) {
            store.savePanelLog({
                id: `log-${i}`,
                action: 'TEST',
                actorId: 'a1',
                actorName: 'tester',
                actorRole: 'super',
                ts: i,
                flag: null,
                meta: { seq: i },
            });
        }
        const all = store.listPanelLogs(5000);
        assert.equal(all.length, MAX_PANEL_LOGS);
        assert.equal(MAX_PANEL_LOGS, 1000);
        assert.equal(all[0].meta.seq, 1005, 'newest first');
        assert.equal(all[all.length - 1].meta.seq, 6, 'the oldest 5 entries were dropped');
        assert.equal(store.listPanelLogs().length, 300, 'GET default slice');
    });

    test('TTL side keys: expiry sweeps and NX lock semantics', () => {
        const { store } = tempStore();
        store.setSideKey('k1', 'v1', 3600);
        assert.equal(store.getSideKey('k1'), 'v1');
        store.setSideKey('k2', 'v2', 0);
        assert.equal(store.getSideKey('k2'), null, 'a zero-TTL key expires immediately');
        assert.equal(store.setSideKeyNx('lock', '1', 60), true);
        assert.equal(store.setSideKeyNx('lock', '2', 60), false, 'NX holds while live');
        assert.equal(store.getSideKey('lock'), '1');
        store.delSideKey('lock');
        assert.equal(store.getSideKey('lock'), null);
    });

    test('SECRETS DOCTRINE: plaintext keys never persist; orders rehydrate', () => {
        const { store, dbPath } = tempStore();
        const [k] = store.createLicenses('tester', { count: 1, planType: 'MONTH', maxDevices: 1 });
        const prefix = keyPrefixOf(k.key);
        assert.match(prefix, /^RA-[0-9A-HJKMNP-TV-Z]{5}$/);
        assert.equal(prefix, k.record.keyPrefix);
        assert.equal(prefix, store.synthLicenseMeta(k.record).key, 'meta.key is the display prefix');
        store.saveLicenseMeta(store.synthLicenseMeta(k.record));

        // order rows persist the key HASH; the wire key is unsealed on read
        const now = Math.floor(Date.now() / 1000);
        store.saveOrder({
            orderId: newOrderId(),
            planId: 'pro',
            mode: 'desktop',
            machineId: 'BK4JC-74W07-YMWT5',
            amount: 1499,
            status: 'paid',
            customer: { name: 'C', phone: '1', email: 'c@example.com' },
            createdAt: now,
            paidAt: now,
            licenseKey: k.key,
            licenseKeyHash: k.record.keyHash,
        });

        const raw = readFileSync(dbPath, 'utf8');
        assert.equal(raw.includes(k.key), false, 'the plaintext RA- key must never persist');
        assert.ok(raw.includes(prefix), 'the display prefix is the log/meta identity');
        assert.ok(raw.includes(k.record.keyHash), 'keyHash is the persisted lookup');
    });

    test('orders rehydrate the wire key and degrade to null when gone', () => {
        const { store } = tempStore();
        const now = Math.floor(Date.now() / 1000);
        const [a] = store.createLicenses('tester', { count: 1, planType: 'MONTH', maxDevices: 1 });
        const [b] = store.createLicenses('tester', { count: 1, planType: 'MONTH', maxDevices: 1 });

        const idA = newOrderId();
        store.saveOrder({
            orderId: idA,
            planId: 'pro',
            mode: 'desktop',
            machineId: 'BK4JC-74W07-YMWT5',
            amount: 1499,
            status: 'paid',
            customer: { name: 'C', phone: '1', email: 'c@example.com' },
            createdAt: now,
            licenseKey: a.key,
            licenseKeyHash: a.record.keyHash,
        });
        const backA = store.getOrder(idA);
        assert.ok(backA);
        assert.equal(backA.licenseKey, a.key, 'the wire key unseals on read');
        assert.equal(backA.licenseKeyHash, a.record.keyHash);

        // a hash-less save derives the hash and still strips the plaintext
        const idB = newOrderId();
        store.saveOrder({
            orderId: idB,
            planId: 'pro',
            mode: 'cloud',
            machineId: '',
            amount: 1499,
            status: 'paid',
            customer: { name: 'D', phone: '2', email: 'd@example.com' },
            createdAt: now,
            licenseKey: b.key,
        });
        const backB = store.getOrder(idB);
        assert.ok(backB);
        assert.equal(backB.licenseKey, b.key);
        assert.equal(backB.licenseKeyHash, b.record.keyHash);

        // deleted engine record -> the key no longer resolves (idempotency fails closed)
        store.deleteLicense('tester', a.record.keyHash);
        assert.equal(store.getOrder(idA)?.licenseKey ?? null, null);

        // order TTL: a zero-TTL order expires immediately
        const idC = newOrderId();
        store.saveOrder(
            {
                orderId: idC,
                planId: 'pro',
                mode: 'desktop',
                machineId: '',
                amount: 1,
                status: 'created',
                customer: { name: 'E', phone: '3', email: 'e@example.com' },
                createdAt: now,
            },
            0,
        );
        assert.equal(store.getOrder(idC), null);
    });
});

// ---------------------------------------------------------------------------
describe('byte-exact copy strings in BOTH mirrors', () => {
    test('the en/em dash strings survive verbatim (asserted via escapes)', () => {
        const serverSrc = readFileSync(new URL('../src/server.ts', import.meta.url), 'utf8');
        assert.ok(serverSrc.includes(`sharePercent must be 0${EN_DASH}100`));
        assert.ok(serverSrc.includes(`Commission must be 0${EN_DASH}100`));
        assert.ok(serverSrc.includes('Converted to ${plan} plan (key: '));

        const panelAuthSrc = readFileSync(new URL('../src/panel-auth.ts', import.meta.url), 'utf8');
        assert.ok(panelAuthSrc.includes(`Forbidden ${EM_DASH} super admin only`));

        const apiPanelSrc = readFileSync(new URL('../../api/_lib/panel.ts', import.meta.url), 'utf8');
        assert.ok(apiPanelSrc.includes(`Forbidden ${EM_DASH} super admin only`));

        const apiConvertSrc = readFileSync(new URL('../../api/licenses/convert.ts', import.meta.url), 'utf8');
        assert.ok(apiConvertSrc.includes('Converted to ${plan} plan (key: '));
        assert.ok(apiConvertSrc.includes('keyPrefixOf(newKey)'), 'the reason carries the display prefix');
    });

    test('every api/ audit log meta carries the display prefix, never the key', () => {
        for (const f of ['generate.ts', 'revoke.ts', 'delete.ts']) {
            const src = readFileSync(new URL(`../../api/licenses/${f}`, import.meta.url), 'utf8');
            assert.ok(src.includes('key: keyPrefixOf('), `${f} log meta must carry the display prefix`);
        }
        const apiCheckoutSrc = readFileSync(new URL('../../api/_lib/checkout.ts', import.meta.url), 'utf8');
        assert.ok(apiCheckoutSrc.includes('key: keyPrefixOf('));
        assert.ok(apiCheckoutSrc.includes('license_key_hash'), 'orders persist the hash only');
    });
});
