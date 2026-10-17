#!/usr/bin/env node
/*
 * tools/verify-supabase-core.mjs
 *
 * Drift check between the licensing source of truth and its Supabase port:
 *
 *   reference : license/src/core.ts
 *   port      : supabase/functions/_shared/license.ts
 *
 * Both modules are loaded with await import(pathToFileURL(<absolute path>).href)
 * because the workspace path contains a space and must be URL-encoded. The
 * compared functions are pure, so a deterministic vector set (every golden
 * vector from license/test/core.test.ts plus generated edge cases) must produce
 * identical values OR identical LicenseError code+message on both sides.
 *
 * Also self-tests the port round-trips (issueToken/verifyToken, sealKey/
 * unsealKey) and the allowJoin default of evaluateEntitlement.
 *
 * Run with:  node tools/verify-supabase-core.mjs
 * Exits 0 on PASS, non-zero on FAIL. Pure ASCII source.
 */

import { pathToFileURL, fileURLToPath } from 'node:url';
import path from 'node:path';

// ---------------------------------------------------------------------------
// Load both modules through absolute file URLs (the workspace path has a space)
// ---------------------------------------------------------------------------

const ROOT = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const REF_PATH = path.join(ROOT, 'license', 'src', 'core.ts');
const PORT_PATH = path.join(ROOT, 'supabase', 'functions', '_shared', 'license.ts');

let ref;
let port;
try {
    ref = await import(pathToFileURL(REF_PATH).href);
} catch (err) {
    console.error('FAIL: could not load reference module ' + REF_PATH);
    console.error(String(err && err.stack ? err.stack : err));
    process.exit(1);
}
try {
    port = await import(pathToFileURL(PORT_PATH).href);
} catch (err) {
    console.error('FAIL: could not load port module ' + PORT_PATH);
    console.error(String(err && err.stack ? err.stack : err));
    process.exit(1);
}

console.log('=== verify-supabase-core: license core drift check ===');
console.log('reference: ' + REF_PATH);
console.log('port:      ' + PORT_PATH);
console.log('');

// ---------------------------------------------------------------------------
// Counters and comparison plumbing
// ---------------------------------------------------------------------------

let goldenVectors = 0;
let generatedVectors = 0;
let comparisons = 0;
let mismatches = 0;
let behaviourChecks = 0;
let behaviourFailures = 0;
const perFunction = new Map();

function invoke(mod, fnName, args) {
    try {
        return { ok: true, value: mod[fnName](...args) };
    } catch (err) {
        return {
            ok: false,
            code: err && err.code !== undefined ? String(err.code) : '<no code>',
            message: err && err.message !== undefined ? String(err.message) : String(err),
        };
    }
}

function describeOutcome(r) {
    return r.ok ? JSON.stringify(r.value) : 'throw code=' + r.code + ' message=' + JSON.stringify(r.message);
}

function sameOutcome(a, b) {
    if (a.ok && b.ok) return a.value === b.value;
    if (!a.ok && !b.ok) return a.code === b.code && a.message === b.message;
    return false;
}

function deepEq(a, b) {
    if (a === b) return true;
    if (typeof a !== typeof b) return false;
    if (a === null || b === null) return false;
    if (Array.isArray(a) && Array.isArray(b)) {
        return a.length === b.length && a.every((x, i) => deepEq(x, b[i]));
    }
    if (typeof a === 'object') {
        const ka = Object.keys(a).sort();
        const kb = Object.keys(b).sort();
        return deepEq(ka, kb) && ka.every((k) => deepEq(a[k], b[k]));
    }
    return false;
}

/*
 * Compare one function over one input between the two modules. On mismatch a
 * compact diff (input, expected, actual) is printed and the run continues so
 * that ALL mismatches are reported. When `golden` is given (a raw expected
 * value from license/test/core.test.ts) both modules are also checked against
 * that literal.
 */
function compare(fnName, args, label, golden) {
    const inputText = JSON.stringify(args);
    const a = invoke(ref, fnName, args);
    const b = invoke(port, fnName, args);
    comparisons++;
    perFunction.set(fnName, (perFunction.get(fnName) || 0) + 1);
    if (!sameOutcome(a, b)) {
        mismatches++;
        console.log('MISMATCH ' + fnName + ' [' + label + ']');
        console.log('  input:    ' + inputText);
        console.log('  expected: ' + describeOutcome(a) + '   (reference)');
        console.log('  actual:   ' + describeOutcome(b) + '   (port)');
        return;
    }
    if (golden !== undefined) {
        const want = { ok: true, value: golden };
        if (!sameOutcome(a, want)) {
            mismatches++;
            console.log('GOLDEN MISMATCH ' + fnName + ' [' + label + ']');
            console.log('  input:    ' + inputText);
            console.log('  expected: ' + describeOutcome(want) + '   (license/test/core.test.ts)');
            console.log('  actual:   ' + describeOutcome(a) + '   (both modules agree with each other)');
        }
    }
}

function check(cond, label) {
    behaviourChecks++;
    if (!cond) {
        behaviourFailures++;
        console.log('FAIL ' + label);
    }
    return cond;
}

function expectThrow(fn, code, label) {
    behaviourChecks++;
    try {
        fn();
        behaviourFailures++;
        console.log('FAIL ' + label + ' (did not throw)');
    } catch (err) {
        const got = err && err.code !== undefined ? String(err.code) : undefined;
        if (code !== undefined && got !== code) {
            behaviourFailures++;
            console.log('FAIL ' + label + ' (threw code ' + got + ', expected ' + code + ')');
        }
    }
}

// ---------------------------------------------------------------------------
// Deterministic vector generation (seeded PRNG, fixed character pools)
// ---------------------------------------------------------------------------

function mulberry32(seed) {
    let a = seed >>> 0;
    return function () {
        a = (a + 0x6d2b79f5) >>> 0;
        let t = a;
        t = Math.imul(t ^ (t >>> 15), t | 1);
        t ^= t + Math.imul(t ^ (t >>> 7), t | 61);
        return ((t ^ (t >>> 14)) >>> 0) / 4294967296;
    };
}

const ALPHABET = '0123456789ABCDEFGHJKMNPQRSTVWXYZ';
const POOL_ASCII = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789';
const POOL_SPACE = ' \t\n\r\u00a0\u3000';
const POOL_PUNCT = '-._|:/\\!?@#$%^&*()[]{}<>\'"+`~;,';
// unicode letters (Latin-1 supplement, CJK, Greek, Cyrillic), emoji, sharp s
const POOL_UNICODE = '\u00e1\u00e9\u00ed\u00f3\u00fa\u65e5\u672c\u8a9e\u03a9\u03c9\u0416\u0436\ud83d\ude00\ud83c\udf89\ud83d\udd10\u00df\u2014';
// Crockford-ambiguous characters that normalizeKey folds (O->0, I/L->1)
const POOL_CROCK = 'ILOUilou';
const POOL_ALL = POOL_ASCII + POOL_SPACE + POOL_PUNCT + POOL_UNICODE + POOL_CROCK;
const KEY_POOL = ['androidId', 'brand', 'model', 'buildFingerprint', 'osVersion', 'securityPatch', 'device', 'product', 'hardware', 'androidid', 'Model', ''];

function pick(rng, arr) {
    return arr[Math.floor(rng() * arr.length) % arr.length];
}

function repeat(rng, pool, n) {
    let s = '';
    for (let i = 0; i < n; i++) s += pool.charAt(Math.floor(rng() * pool.length) % pool.length);
    return s;
}

/*
 * Independent implementation of the documented checksum
 * (sum = SUM a[i]*3^(n-1-i) mod 1024, check = (-sum) mod 1024, 2 chars) so the
 * vector generator can mint valid keys without leaning on either module.
 */
function checksumChars(body) {
    let sum = 0;
    let pow = 1;
    for (let i = body.length - 1; i >= 0; i--) {
        sum = (sum + ALPHABET.indexOf(body[i]) * pow) % 1024;
        pow = (pow * 3) % 1024;
    }
    const check = (1024 - sum) % 1024;
    return ALPHABET[(check >> 5) & 31] + ALPHABET[check & 31];
}

function makeKey(body23) {
    const full = body23 + checksumChars(body23);
    return 'RA-' + (full.match(/.{1,5}/g) || []).join('-');
}

// Valid keys produced by license/src/core.ts generateKey() during authoring of
// this script. They pin the wire format and give deterministic success-path
// inputs for normalizeKey/hashKey.
const GOLDEN_KEYS = [
    'RA-HQ7D5-9GEKQ-R39C4-VGQ8X-1WHTN',
    'RA-1XSB5-9243Z-33VFP-40KEX-YMD6X',
    'RA-FS4PA-S4E1Y-CPF3F-6JM45-VW7WC',
];

function genKeyish(rng) {
    const mode = Math.floor(rng() * 4);
    const k = makeKey(repeat(rng, ALPHABET, 23));
    if (mode === 0) return k;
    if (mode === 1) return k.toLowerCase();
    if (mode === 2) return k.replace(/-/g, rng() < 0.5 ? '' : ' ');
    // single substitution - must be rejected by the checksum on both sides
    const pos = Math.floor(rng() * 25);
    const body = k.replace(/^RA-/, '').replace(/-/g, '');
    const repl = ALPHABET.charAt(Math.floor(rng() * 32) % 32);
    const mutated = body.slice(0, pos) + (repl === body[pos] ? '0' : repl) + body.slice(pos + 1);
    return 'RA-' + (mutated.match(/.{1,5}/g) || []).join('-');
}

function genString(rng, i) {
    const mode = i % 10;
    if (mode === 0) return '';
    if (mode === 1) return repeat(rng, POOL_SPACE, 1 + Math.floor(rng() * 5));
    if (mode === 2) return repeat(rng, POOL_UNICODE, 1 + Math.floor(rng() * 8));
    if (mode === 3) return repeat(rng, POOL_CROCK + POOL_ASCII, 20 + Math.floor(rng() * 30));
    if (mode === 4) return 'RA-' + repeat(rng, POOL_CROCK, 25);
    if (mode === 5) return repeat(rng, POOL_ALL, 300 + Math.floor(rng() * 700)); // very long
    if (mode === 6) return repeat(rng, POOL_PUNCT, 5 + Math.floor(rng() * 20));
    if (mode === 7) return genKeyish(rng);
    if (mode === 8) return repeat(rng, POOL_SPACE + POOL_CROCK + POOL_UNICODE, 3 + Math.floor(rng() * 40));
    return repeat(rng, POOL_ALL, Math.floor(rng() * 64));
}

function genObject(rng, i) {
    const n = 1 + Math.floor(rng() * 5);
    const obj = {};
    for (let j = 0; j < n; j++) {
        const key = KEY_POOL[(Math.floor(rng() * KEY_POOL.length) + i + j) % KEY_POOL.length];
        const mode = Math.floor(rng() * 6);
        if (mode === 0) obj[key] = undefined;
        else if (mode === 1) obj[key] = '';
        else if (mode === 2) obj[key] = repeat(rng, POOL_SPACE, 1 + Math.floor(rng() * 3));
        else if (mode === 3) obj[key] = repeat(rng, POOL_UNICODE, 1 + Math.floor(rng() * 5));
        else if (mode === 4) obj[key] = repeat(rng, POOL_ALL, 1 + Math.floor(rng() * 50));
        else obj[key] = repeat(rng, POOL_ASCII, 1 + Math.floor(rng() * 12));
    }
    return obj;
}

// ---------------------------------------------------------------------------
// [1] Golden vectors with literal expectations from license/test/core.test.ts
// ---------------------------------------------------------------------------

console.log('[1] golden vectors (license/test/core.test.ts)');

const GOLDEN_DEVICE_CODES = [
    [{ androidId: 'abc123', brand: 'Google', model: 'Pixel 8' }, 'KGQGD-0PRTJ-96VG0'],
    [{ androidId: 'abcdef0123456789', brand: 'samsung', model: 'SM-N770F' }, '4VKE0-ET673-0P24Q'],
    [{ androidId: 'aaa', brand: 'Google', model: 'Pixel 8' }, '37QVK-WBCSW-NHRGQ'],
    [{ androidId: 'aaa', brand: 'Samsung', model: 'Galaxy S24' }, 'K19KG-F48CD-MZA0X'],
    [{ androidId: '', brand: '', model: '' }, 'GCQGG-EMA3D-SKRVR'],
    [{ androidId: 'xyz', brand: 'Xiaomi', model: 'Redmi Note 12' }, 'BQN15-YTVC6-TK2RB'],
];
for (const [markers, expected] of GOLDEN_DEVICE_CODES) {
    goldenVectors++;
    compare('deriveDeviceCode', [markers], 'golden device code', expected);
}
goldenVectors++;
compare('normalizeDeviceCode', ['O1l-i'], 'golden normalizeDeviceCode', '0111');

// PLAN_DAYS must match the UI plan names (assert.deepEqual in the test)
const PLAN_DAYS_WANT = { DAY: 1, WEEK: 7, HALF_MONTH: 15, MONTH: 30, YEAR: 365 };
check(deepEq(ref.PLAN_DAYS, PLAN_DAYS_WANT), 'PLAN_DAYS matches the UI plan names (reference)');
check(deepEq(port.PLAN_DAYS, PLAN_DAYS_WANT), 'PLAN_DAYS matches the UI plan names (port)');
const POLICY_WANT = { tokenTtlMs: 72 * 60 * 60 * 1000, clockSkewMs: 5 * 60 * 1000 };
check(deepEq(ref.DEFAULT_POLICY, POLICY_WANT), 'DEFAULT_POLICY is 72h TTL / 5min skew (reference)');
check(deepEq(port.DEFAULT_POLICY, POLICY_WANT), 'DEFAULT_POLICY is 72h TTL / 5min skew (port)');

// the checksum helper used to mint deterministic keys must match the format
for (const k of GOLDEN_KEYS) {
    const body = k.replace(/^RA-/, '').replace(/-/g, '');
    check(checksumChars(body.slice(0, 23)) === body.slice(23), 'vector-generator checksum matches key ' + k);
}

console.log('    ' + goldenVectors + ' golden vectors compared');

// ---------------------------------------------------------------------------
// [2] Cross-module drift vectors: fixed edge cases + 260 generated cases
// ---------------------------------------------------------------------------

console.log('[2] cross-module vector comparison');

const fixedStrings = [
    // every form of the golden keys (format independence from the tests)
    ...GOLDEN_KEYS.flatMap((k) => {
        const body = k.slice(3).replace(/-/g, '');
        return [k, k.toLowerCase(), body, body.toLowerCase(), k.replace(/-/g, ' '), '  ' + k + '\t\n', k.slice(3), k + k];
    }),
    'O1l-i', '0111', 'KGQGD-0PRTJ-96VG0', 'KGQGD0PRTJ96VG0', 'kgqgd-0prtj-96vg0', '  KGQGD-0PRTJ-96VG0  ',
    '', ' ', '\t\n\r', '-', '--', 'RA-', 'RA', 'RA-AAAAA-BBBBB-CCCCC-DDDDD-EEEEE',
    'ILOU ilou 0O1l', 'O1l-i-0O1l', '0' + 'O'.repeat(25),
    '\u00e1\u00e9\u65e5\u672c\u8a9e\ud83d\ude00', '\ud83d\udd10\ud83c\udf89', '\u00df\u2014\u03a9\u0436',
    '-._|:/\\!?@#$%^&*()[]{}<>\'"+`~;,', ' \u00a0\u3000\t\n\r ',
    'A'.repeat(1000), 'RA-00000'.repeat(50), ('\u65e5' + POOL_CROCK).repeat(200),
];
const fixedObjects = [
    // golden marker objects are compared with literal expectations above; here
    // come the behavioural inputs from the tests plus structural edge cases
    { brand: 'Google', model: 'Pixel 8', androidId: 'abc123' },
    { model: 'Pixel 8', androidId: 'x' },
    { androidId: 'x', model: 'Pixel 8' },
    { androidId: 'y', model: 'Pixel 8' },
    { androidId: 'x', model: 'Pixel 9' },
    { androidId: 'x', model: 'Pixel 8', brand: 'Google' },
    { androidId: 'aaa', model: 'Pixel 8', brand: 'Google' },
    { androidId: 'bbb', model: 'Pixel 8', brand: 'Google' },
    { androidId: 'aaa', model: 'Galaxy S24', brand: 'Samsung' },
    {},
    { androidId: undefined, brand: undefined, model: undefined },
    { androidId: 'x' },
    { androidId: 'abc123', brand: 'Google', model: 'Pixel 8', buildFingerprint: 'google/husky/husky:15/AP4A.250105.002/12821496:user/release-keys', osVersion: '15', securityPatch: '2025-01-05' },
    { androidId: '', brand: '', model: '', extra: '' },
    { androidId: '\u65e5\ud83d\ude00', brand: '\t X ', model: 'a|b=c' },
];

const rng = mulberry32(0x5eed1234);
for (let i = 0; i < 200; i++) fixedStrings.push(genString(rng, i));
for (let i = 0; i < 60; i++) fixedObjects.push(genObject(rng, i));
generatedVectors = 260;

const STRING_FNS = ['normalizeKey', 'hashKey', 'keyPrefixOf', 'hashDeviceCode', 'hashHwid', 'normalizeDeviceCode', 'formatKey'];
const OBJECT_FNS = ['deriveDeviceCode', 'deriveHwid'];

for (let i = 0; i < fixedObjects.length; i++) {
    for (const fnName of OBJECT_FNS) compare(fnName, [fixedObjects[i]], 'vector#' + i);
}
for (let i = 0; i < fixedStrings.length; i++) {
    for (const fnName of STRING_FNS) compare(fnName, [fixedStrings[i]], 'vector#' + i);
}

// deterministic valid keys: success path for normalizeKey / hashKey / keyPrefixOf
const extraKeys = [];
for (let i = 0; i < 8; i++) {
    extraKeys.push(makeKey(repeat(rng, ALPHABET, 23)));
}
for (let i = 0; i < extraKeys.length; i++) {
    generatedVectors++;
    for (const fnName of STRING_FNS) compare(fnName, [extraKeys[i]], 'gen-key#' + i);
}

console.log('    ' + fixedObjects.length + ' object vectors + ' + fixedStrings.length + ' string vectors (' + generatedVectors + ' generated)');
console.log('    ' + comparisons + ' comparisons so far');

// ---------------------------------------------------------------------------
// [3] Behavioural goldens and anti-regression checks on the port
// ---------------------------------------------------------------------------

console.log('[3] behavioural goldens and anti-regression (port)');

// REGRESSION: exactly three canonical fields, so an OS update must not change
// the device code (the "4th field" bug changed every code)
const phone = { androidId: 'abc123', model: 'Pixel 8', brand: 'Google' };
const codeBefore = port.deriveDeviceCode(phone);
const codeAfter = port.deriveDeviceCode({
    ...phone,
    buildFingerprint: 'google/husky/husky:15/AP4A.250105.002/12821496:user/release-keys',
    osVersion: '15',
    securityPatch: '2025-01-05',
});
check(codeBefore === 'KGQGD-0PRTJ-96VG0', 'deriveDeviceCode golden value for the test phone');
check(codeBefore === codeAfter, 'a system update must not look like a different device');
check(codeBefore === port.deriveDeviceCode({ brand: 'Google', model: 'Pixel 8', androidId: 'abc123' }), 'component order must not matter');
check(
    codeBefore === port.deriveDeviceCode({ androidId: 'abc123', brand: 'Google', model: 'Pixel 8', extra: 'ignored', osVersion: '' }),
    'extra component keys are ignored (canonical list is exactly 3 fields)',
);
check(
    port.deriveDeviceCode({ androidId: 'aaa', model: 'Pixel 8', brand: 'Google' }) !== port.deriveDeviceCode({ androidId: 'bbb', model: 'Pixel 8', brand: 'Google' }),
    'different phones get different device codes',
);

// exactly three groups of five Crockford characters
const CODE_SHAPE = /^[0-9A-HJKMNP-TV-Z]{5}-[0-9A-HJKMNP-TV-Z]{5}-[0-9A-HJKMNP-TV-Z]{5}$/;
for (const [markers] of GOLDEN_DEVICE_CODES) {
    const code = port.deriveDeviceCode(markers);
    check(CODE_SHAPE.test(code) && code.split('-').length === 3, 'device code shape is 3x5 for ' + JSON.stringify(markers));
}

// device code hashing tolerates how a human would type it
const clean = codeBefore.replace(/-/g, '');
check(port.hashDeviceCode(codeBefore) === port.hashDeviceCode(clean), 'hashDeviceCode ignores dashes');
check(port.hashDeviceCode(codeBefore) === port.hashDeviceCode(codeBefore.toLowerCase()), 'hashDeviceCode ignores case');
check(port.hashDeviceCode(codeBefore) === port.hashDeviceCode('  ' + codeBefore + '  '), 'hashDeviceCode ignores whitespace');

// deriveHwid / hashHwid behaviour from the tests
check(port.deriveHwid({ androidId: 'x', model: 'Pixel 8' }) === port.deriveHwid({ model: 'Pixel 8', androidId: 'x' }), 'deriveHwid is order-independent');
check(port.deriveHwid({ androidId: 'x', model: 'Pixel 8' }) !== port.deriveHwid({ androidId: 'y', model: 'Pixel 8' }), 'deriveHwid changes with androidId');
check(port.hashHwid('abc') === port.hashHwid('abc') && port.hashHwid('abc') !== port.hashHwid('abd') && port.hashHwid('abc') !== 'abc', 'hashHwid is one-way and stable');

// key shape: RA- + 25 Crockford chars in 5 groups of 5, checksummed
const KEY_SHAPE = /^RA(-[0-9A-HJKMNP-TV-Z]{5}){5}$/;
for (let i = 0; i < 50; i++) {
    const k = port.generateKey();
    check(KEY_SHAPE.test(k), 'generateKey shape ' + k);
    check(port.normalizeKey(k) === k.slice(3).replace(/-/g, ''), 'generateKey round-trips through normalizeKey');
}
check(port.formatKey(port.normalizeKey(GOLDEN_KEYS[0])) === GOLDEN_KEYS[0], 'formatKey(normalizeKey(k)) round-trips');
check(port.keyPrefixOf(GOLDEN_KEYS[0]) === GOLDEN_KEYS[0].split('-').slice(0, 2).join('-'), 'keyPrefixOf leaks only the display prefix');
for (const k of GOLDEN_KEYS) {
    check(/^[0-9a-f]{64}$/.test(port.hashKey(k)), 'hashKey digest shape for ' + k);
}

// CHECKSUM completeness (the mod-1024 checksum, not the blind mod-32 one):
// every single-character substitution and every adjacent transposition of a
// valid key must be rejected.
{
    const bodies = [GOLDEN_KEYS[0].replace(/^RA-/, '').replace(/-/g, ''), makeKey(repeat(rng, ALPHABET, 23)).replace(/^RA-/, '').replace(/-/g, ''), makeKey(repeat(rng, ALPHABET, 23)).replace(/^RA-/, '').replace(/-/g, '')];
    let mutants = 0;
    const survivors = [];
    for (const body of bodies) {
        for (let pos = 0; pos < body.length; pos++) {
            for (const repl of ALPHABET) {
                if (repl === body[pos]) continue;
                const mutated = body.slice(0, pos) + repl + body.slice(pos + 1);
                mutants++;
                try {
                    port.normalizeKey(mutated);
                    survivors.push('substitution pos ' + pos + ' -> ' + repl);
                } catch (err) {
                    if (String(err && err.code) !== 'BAD_FORMAT') survivors.push('substitution pos ' + pos + ' threw ' + err);
                }
            }
        }
        for (let i = 0; i + 1 < body.length; i++) {
            const a = body[i];
            const b = body[i + 1];
            if (a === b) continue;
            const swapped = body.slice(0, i) + b + a + body.slice(i + 2);
            mutants++;
            try {
                port.normalizeKey(swapped);
                survivors.push('transposition at ' + i + ' (' + a + b + ')');
            } catch (err) {
                if (String(err && err.code) !== 'BAD_FORMAT') survivors.push('transposition at ' + i + ' threw ' + err);
            }
        }
    }
    check(survivors.length === 0, 'checksum catches ALL ' + mutants + ' single-char substitutions and adjacent transpositions');
    if (survivors.length > 0) {
        for (const s of survivors.slice(0, 5)) console.log('    survived: ' + s);
        console.log('    (' + survivors.length + ' total survivors)');
    }
}

// LicenseError shape
{
    const e = new port.LicenseError('BAD_FORMAT', 'x');
    check(e instanceof Error && e.name === 'LicenseError' && e.code === 'BAD_FORMAT', 'LicenseError shape');
}

// ---------------------------------------------------------------------------
// [4] issueToken / verifyToken round-trip inside the port (+ cross interop)
// ---------------------------------------------------------------------------

console.log('[4] issueToken/verifyToken round-trip (port)');

const NOW = 1800000000000;
const TTL = port.DEFAULT_POLICY.tokenTtlMs;
const SKEW = port.DEFAULT_POLICY.clockSkewMs;
const kp = port.generateSigningKeyPair();
check(typeof kp.privateKeyB64 === 'string' && kp.privateKeyB64.length > 40, 'generateSigningKeyPair private key');
check(typeof kp.publicKeyB64 === 'string' && kp.publicKeyB64.length > 20, 'generateSigningKeyPair public key');

const hw = port.hashHwid('device-A');
const claims = { jti: 'jti-1', kid: 'RA-AAAAA', hw };
const issued = port.issueToken(kp, claims, port.DEFAULT_POLICY, NOW);
check(/^[A-Za-z0-9_-]+\.[A-Za-z0-9_-]+$/.test(issued.token), 'token has body.signature shape');
check(deepEq(issued.payload, { jti: 'jti-1', kid: 'RA-AAAAA', hw: hw, iat: NOW, exp: NOW + TTL, v: 1 }), 'issueToken payload claims');
const got = port.verifyToken(issued.token, kp.publicKeyB64, port.DEFAULT_POLICY, NOW + 1000);
check(got.jti === 'jti-1' && got.hw === hw && got.exp === NOW + TTL && got.v === 1, 'verifyToken round-trip returns the claims');

// FORGERY: flipping any claim breaks the signature
{
    const [body, sig] = issued.token.split('.');
    const decoded = JSON.parse(Buffer.from(body.replace(/-/g, '+').replace(/_/g, '/'), 'base64').toString('utf8'));
    const b64u = (buf) => buf.toString('base64').replace(/\+/g, '-').replace(/\//g, '_').replace(/=+$/, '');
    const mutations = [
        (p) => Object.assign({}, p, { hw: port.hashHwid('device-B') }),
        (p) => Object.assign({}, p, { exp: p.exp + 1e12 }),
        (p) => Object.assign({}, p, { kid: 'RA-ZZZZZ' }),
        (p) => Object.assign({}, p, { jti: 'jti-2' }),
    ];
    for (const mutate of mutations) {
        const tampered = b64u(Buffer.from(JSON.stringify(mutate(decoded)), 'utf8')) + '.' + sig;
        expectThrow(() => port.verifyToken(tampered, kp.publicKeyB64, port.DEFAULT_POLICY, NOW), 'BAD_TOKEN', 'tampered token rejected');
    }
    const sigStart = issued.token.lastIndexOf('.') + 1;
    const sigPart = issued.token.slice(sigStart);
    const flippedSig = (sigPart[0] === 'A' ? 'B' : 'A') + sigPart.slice(1);
    expectThrow(() => port.verifyToken(issued.token.slice(0, sigStart) + flippedSig, kp.publicKeyB64, port.DEFAULT_POLICY, NOW), 'BAD_TOKEN', 'tampered signature rejected');
}

// garbage / truncated tokens
for (const t of ['', '.', 'a.b', 'x.y.z', 'not-a-token', 'AAAA.BBBB', 'a.b.c.d']) {
    expectThrow(() => port.verifyToken(t, kp.publicKeyB64, port.DEFAULT_POLICY, NOW), 'BAD_TOKEN', 'garbage token rejected: ' + JSON.stringify(t));
}

// token signed with a different key
{
    const attacker = port.generateSigningKeyPair();
    const forged = port.issueToken(attacker, claims, port.DEFAULT_POLICY, NOW);
    expectThrow(() => port.verifyToken(forged.token, kp.publicKeyB64, port.DEFAULT_POLICY, NOW), 'BAD_TOKEN', 'foreign-key token rejected');
}

// EXPIRY: bounded by exactly the clock-skew grace
{
    expectThrow(() => port.verifyToken(issued.token, kp.publicKeyB64, port.DEFAULT_POLICY, NOW + TTL + SKEW + 1), 'TOKEN_EXPIRED', 'expired token rejected');
    check(typeof port.verifyToken(issued.token, kp.publicKeyB64, port.DEFAULT_POLICY, NOW + TTL + SKEW - 1).jti === 'string', 'token valid right up to exp + clock-skew');
    const backdated = port.issueToken(kp, claims, port.DEFAULT_POLICY, NOW + 1e9);
    expectThrow(() => port.verifyToken(backdated.token, kp.publicKeyB64, port.DEFAULT_POLICY, NOW), 'BAD_TOKEN', 'back-dated (future iat) token rejected');
}

// cross-module wire compatibility: both sides must mint/verify each other's
// tokens byte-for-byte (Ed25519 is deterministic for a given key and message)
{
    const kpRef = ref.generateSigningKeyPair();
    const refToken = ref.issueToken(kpRef, claims, ref.DEFAULT_POLICY, NOW).token;
    const portToken = port.issueToken(kpRef, claims, port.DEFAULT_POLICY, NOW).token;
    check(refToken === portToken, 'issueToken is byte-identical across modules (deterministic Ed25519)');
    check(port.verifyToken(refToken, kpRef.publicKeyB64, port.DEFAULT_POLICY, NOW + 1).jti === 'jti-1', 'port verifies a reference-issued token');
    check(ref.verifyToken(portToken, kpRef.publicKeyB64, ref.DEFAULT_POLICY, NOW + 1).jti === 'jti-1', 'reference verifies a port-issued token');
}

// ---------------------------------------------------------------------------
// [5] sealKey / unsealKey round-trip inside the port
// ---------------------------------------------------------------------------

console.log('[5] sealKey/unsealKey round-trip (port)');

{
    const master = Buffer.alloc(32, 7);
    const k = port.generateKey();
    const sealed = port.sealKey(master, k);
    check(sealed !== k, 'sealed blob is not the plaintext');
    check(!sealed.includes(k.slice(3, 13)), 'sealed blob must not contain key material');
    check(/^v1\.[A-Za-z0-9_-]+\.[A-Za-z0-9_-]+\.[A-Za-z0-9_-]+$/.test(sealed), 'seal format v1.<iv>.<ct>.<tag>');
    check(port.unsealKey(master, sealed) === k, 'unseal round-trip');
    const second = port.sealKey(master, k);
    check(second !== sealed && port.unsealKey(master, second) === k, 'sealing is non-deterministic (fresh IV) yet both open');
    for (const gk of GOLDEN_KEYS) {
        check(port.unsealKey(master, port.sealKey(master, gk)) === gk, 'seal round-trip for golden key ' + gk);
    }
    expectThrow(() => port.unsealKey(Buffer.alloc(32, 8), sealed), undefined, 'the wrong master secret cannot unseal');
    const [v, iv, ct, tag] = sealed.split('.');
    const flipped = Buffer.from(ct, 'base64');
    flipped[0] ^= 0xff;
    expectThrow(() => port.unsealKey(master, [v, iv, flipped.toString('base64'), tag].join('.')), undefined, 'a tampered ciphertext cannot unseal (GCM auth)');
    expectThrow(() => port.unsealKey(master, 'v2.' + iv + '.' + ct + '.' + tag), 'BAD_FORMAT', 'unknown seal version rejected');
}

// ---------------------------------------------------------------------------
// [6] evaluateEntitlement: allowJoin must default to false
// ---------------------------------------------------------------------------

console.log('[6] evaluateEntitlement (allowJoin default + decisions)');

{
    const hwA = port.hashHwid('A');
    const hwB = port.hashHwid('B');
    const activeLicense = (over) => Object.assign({
        status: 'active',
        activatedAt: NOW,
        expiresAt: NOW + 30 * 86400000,
        maxDevices: 1,
    }, over || {});
    const tokenFor = (h) => ({ jti: 'j1', kid: 'RA-AAAAA', hw: h, iat: NOW, exp: NOW + 72 * 3600000, v: 1 });

    // THE bypass that must not come back: an unbound device riding a FREE slot.
    // maxDevices=2, only one device bound -> a slot is open, but validate/refresh
    // (allowJoin omitted / undefined / false) must still refuse the device.
    const base = {
        license: activeLicense({ maxDevices: 2 }),
        boundDeviceCount: 1,
        requestingHwidHash: hwB,
        boundHwidHashes: [hwA],
        tokenPayload: tokenFor(hwB),
        now: NOW,
    };
    for (const [label, extra] of [
        ['allowJoin key omitted', {}],
        ['allowJoin explicitly undefined', { allowJoin: undefined }],
        ['allowJoin false', { allowJoin: false }],
    ]) {
        const d = port.evaluateEntitlement(Object.assign({}, base, extra));
        check(d.ok === false && d.reason === 'DEVICE_MISMATCH',
            'unbound device refused with a free slot available (' + label + ')');
    }
    const joined = port.evaluateEntitlement(Object.assign({}, base, { allowJoin: true, tokenPayload: null }));
    check(joined.ok === true, 'activation (allowJoin true) adopts a new device while a slot is free');
    const full = port.evaluateEntitlement({
        license: activeLicense({ maxDevices: 1 }),
        boundDeviceCount: 1,
        requestingHwidHash: hwB,
        boundHwidHashes: [hwA],
        tokenPayload: null,
        now: NOW,
        allowJoin: true,
    });
    check(full.ok === false && full.reason === 'DEVICE_LIMIT', 'joining past maxDevices is refused');

    const ok = port.evaluateEntitlement({
        license: activeLicense(), boundDeviceCount: 1,
        requestingHwidHash: hwA, boundHwidHashes: [hwA],
        tokenPayload: tokenFor(hwA), now: NOW,
    });
    check(ok.ok === true && ok.remainingMs > 0, 'legitimate owner on their bound device is entitled');

    const cases = [
        ['revoked', { license: activeLicense({ status: 'revoked' }), boundDeviceCount: 1, requestingHwidHash: hwA, boundHwidHashes: [hwA], tokenPayload: tokenFor(hwA), now: NOW }, 'REVOKED'],
        ['unused', { license: activeLicense({ status: 'unused', activatedAt: null, expiresAt: null }), boundDeviceCount: 0, requestingHwidHash: hwA, boundHwidHashes: [], tokenPayload: null, now: NOW }, 'NOT_ACTIVATED'],
        ['null expiry', { license: activeLicense({ expiresAt: null }), boundDeviceCount: 1, requestingHwidHash: hwA, boundHwidHashes: [hwA], tokenPayload: null, now: NOW }, 'NOT_ACTIVATED'],
        ['expired', { license: activeLicense({ expiresAt: NOW - SKEW - 1 }), boundDeviceCount: 1, requestingHwidHash: hwA, boundHwidHashes: [hwA], tokenPayload: tokenFor(hwA), now: NOW }, 'EXPIRED'],
        ['device limit', { license: activeLicense({ maxDevices: 1 }), boundDeviceCount: 1, requestingHwidHash: hwB, boundHwidHashes: [hwA], tokenPayload: null, now: NOW, allowJoin: true }, 'DEVICE_LIMIT'],
        ['free slot, no join', { license: activeLicense({ maxDevices: 2 }), boundDeviceCount: 1, requestingHwidHash: hwB, boundHwidHashes: [hwA], tokenPayload: tokenFor(hwB), now: NOW }, 'DEVICE_MISMATCH'],
        ['foreign token', { license: activeLicense({ maxDevices: 2 }), boundDeviceCount: 1, requestingHwidHash: hwB, boundHwidHashes: [hwA], tokenPayload: tokenFor(hwA), now: NOW }, 'DEVICE_MISMATCH'],
        ['stale token', { license: activeLicense(), boundDeviceCount: 1, requestingHwidHash: hwA, boundHwidHashes: [hwA], tokenPayload: Object.assign({}, tokenFor(hwA), { exp: NOW - SKEW - 1 }), now: NOW }, 'TOKEN_EXPIRED'],
    ];
    for (const [label, input, wantReason] of cases) {
        const d = port.evaluateEntitlement(input);
        check(d.ok === false && d.reason === wantReason, 'entitlement case "' + label + '" -> ' + wantReason);
    }

    // clock-skew grace is exactly bounded
    check(port.evaluateEntitlement({ license: activeLicense({ expiresAt: NOW - SKEW + 1 }), boundDeviceCount: 1, requestingHwidHash: hwA, boundHwidHashes: [hwA], tokenPayload: null, now: NOW }).ok === true, 'just inside the skew grace is accepted');
    check(port.evaluateEntitlement({ license: activeLicense({ expiresAt: NOW - SKEW - 1 }), boundDeviceCount: 1, requestingHwidHash: hwA, boundHwidHashes: [hwA], tokenPayload: null, now: NOW }).ok === false, 'one ms past the skew grace is refused');

    // decision drift grid: reference and port must agree on every decision
    const grid = [];
    for (const status of ['unused', 'active', 'expired', 'revoked']) {
        for (const maxDevices of [1, 2]) {
            for (const allowJoin of [undefined, false, true]) {
                grid.push({
                    license: activeLicense({ status: status, maxDevices: maxDevices }),
                    boundDeviceCount: 1,
                    requestingHwidHash: hwB,
                    boundHwidHashes: [hwA],
                    tokenPayload: tokenFor(hwB),
                    now: NOW,
                    allowJoin: allowJoin,
                });
            }
        }
    }
    for (let i = 0; i < grid.length; i++) {
        const want = ref.evaluateEntitlement(grid[i]);
        const gotD = port.evaluateEntitlement(grid[i]);
        if (!deepEq(want, gotD)) {
            behaviourFailures++;
            console.log('MISMATCH evaluateEntitlement [grid#' + i + ']');
            console.log('  input:    ' + JSON.stringify(grid[i]));
            console.log('  expected: ' + JSON.stringify(want) + '   (reference)');
            console.log('  actual:   ' + JSON.stringify(gotD) + '   (port)');
        }
        behaviourChecks++;
    }
}

// safeEqual
check(port.safeEqual('abc', 'abc') === true && port.safeEqual('abc', 'abd') === false && port.safeEqual('abc', 'abcd') === false && port.safeEqual('', '') === true, 'safeEqual compares without throwing on length mismatch');

// ---------------------------------------------------------------------------
// Summary
// ---------------------------------------------------------------------------

const perFnText = Array.from(perFunction.entries()).sort((a, b) => (a[0] < b[0] ? -1 : 1)).map((e) => e[0] + '=' + e[1]).join(', ');
console.log('');
console.log('--- summary ---');
console.log('golden vectors:       ' + goldenVectors + ' (literal values from license/test/core.test.ts)');
console.log('generated vectors:    ' + generatedVectors + ' (seeded, reproducible)');
console.log('comparisons:          ' + comparisons + ' [' + perFnText + ']');
console.log('mismatches:           ' + mismatches);
console.log('behavioural checks:   ' + behaviourChecks);
console.log('behavioural failures: ' + behaviourFailures);
const pass = mismatches === 0 && behaviourFailures === 0;
console.log('RESULT: ' + (pass ? 'PASS' : 'FAIL'));
process.exitCode = pass ? 0 : 1;
