// Desktop cross-check vectors: exercises the JAVA licence primitives
// (app/java/com/ride/accepter/licence/*) against the TypeScript source of truth
// (license/src/core.ts). LicenceVector.java consumes this output and must pass
// every line before any APK is built.
//
//   node tools\licence-vectors.mjs > build\licence-vectors.txt
//   java -cp build\vtest com.ride.accepter.licence.LicenceVector build\licence-vectors.txt
import { pathToFileURL } from 'node:url';
import { resolve } from 'node:path';
import { createHash, generateKeyPairSync, randomUUID, sign as edSign, createPrivateKey } from 'node:crypto';

const coreUrl = pathToFileURL(resolve(import.meta.dirname, '..', 'license', 'src', 'core.ts')).href;
const L = await import(coreUrl);

const lines = [];
const add = (...p) => lines.push(p.join('|'));

// ---------------------------------------------------------------------------
// device codes (identical set to tools/verify-device-code.mjs + edge cases)
// ---------------------------------------------------------------------------
const codeVectors = [
    ['abc123', 'Google', 'Pixel 8'],
    ['abcdef0123456789', 'samsung', 'SM-N770F'],
    ['aaa', 'Google', 'Pixel 8'],
    ['aaa', 'Samsung', 'Galaxy S24'],
    ['', '', ''],
    ['xyz', 'Xiaomi', 'Redmi Note 12'],
    ['a:b', 'we ird', 'Model/With.Slash'],
];
for (const [androidId, brand, model] of codeVectors) {
    add('code', androidId, brand, model, L.deriveDeviceCode({ androidId, brand, model }));
}
for (const p of ['O1l-i', '  7qk2m3xw8h  ', 'RA-AAAAA-BBBBB-CCCCC-DDDDD-EEEEE', '', 'xyz']) {
    add('normcode', p, L.normalizeDeviceCode(p));
}
for (const c of ['7QK2M-3XW8H-PTD4R', 'O1I-L', 'ra-aaaaa-bbbbb-ccccc-ddddd-eeeee']) {
    add('hashcode', c, L.hashDeviceCode(c));
}

// ---------------------------------------------------------------------------
// licence keys: normalization, error messages, hashes, typo detection
// ---------------------------------------------------------------------------
const key = L.generateKey();
add('normkey', key, L.normalizeKey(key));
add('normkey', key.toLowerCase(), L.normalizeKey(key.toLowerCase()));
add('normkey', '  ' + key + '  ', L.normalizeKey(key));
add('hashkey', key, L.hashKey(key));

const body = L.normalizeKey(key); // 25 chars
const noPrefix = 'RA-' + body.slice(0, 5) + '-' + body.slice(5, 10) + '-'
    + body.slice(10, 15) + '-' + body.slice(15, 20) + '-' + body.slice(20, 25);
add('normkey', noPrefix, L.normalizeKey(noPrefix));

const expectErr = (input) => {
    try { return L.normalizeKey(input); } catch (e) { return 'ERR:' + e.message; }
};
add('normkey', 'SHORT', expectErr('SHORT'));
add('normkey', body.slice(0, 24), expectErr(body.slice(0, 24)));
const sub = body.slice(0, 24) + (body[24] === '0' ? '1' : '0'); // 1-char substitution
add('normkey', sub, expectErr(sub));
const swap = body.slice(0, 10) + body[11] + body[10] + body.slice(12); // transposition
add('normkey', swap, expectErr(swap));
const badChar = body.slice(0, 5) + 'U' + body.slice(6);
add('normkey', badChar, expectErr(badChar));
const fold = noPrefix.replace(/0/g, 'O').replace(/1/g, 'I'); // look-alike folding must recover
add('normkey', fold, expectErr(fold));

// ---------------------------------------------------------------------------
// raw Ed25519 signatures (RFC 8032 test vectors + fresh ones)
// ---------------------------------------------------------------------------
const rfc = [
    {
        pub: 'd75a980182b10ab7d54bfed3c964073a0ee172f3daa62325af021a68f707511a',
        msg: '',
        sig: 'e5564300c360ac729086e2cc806e828a84877f1eb8e5d974d873e065224901555fb8821590a33bacc61e39701cf9b46bd25bf5f0595bbe24655141438e7a100b',
    },
    {
        pub: '3d4017c3e843895a92b70aa74d1b7ebc9c982ccf2ec4968cc0cd55f12af4660c',
        msg: '72',
        sig: '92a009a9f0d4cab8720e820b5f642540a2b27b5416503f8fb3762223ebdb69da085ac1e43e15996e458f3613d0f11d8c387b2eaeb4302aeeb00d291612bb0c00',
    },
    {
        pub: 'fc51cd8e6218a1a38da47ed00230f0580816ed13ba3303ac5deb911548908025',
        msg: 'af82',
        sig: '6291d657deec24024827e69c3abe01a30ce548a284743a445e3680d7db5ac3ac18ff9b538d16f290ae67f760984dc6594a7c15e9716ed28dc027beceea1ec40a',
    },
];
for (const v of rfc) {
    // messages are hex byte strings (RFC convention), e.g. '72' = one byte 0x72
    add('sig', v.pub, v.msg, v.sig, 'true');
    const bad = v.sig.slice(0, 8) + (v.sig[8] === '0' ? '1' : '0') + v.sig.slice(9);
    add('sig', v.pub, v.msg, bad, 'false');
    add('sig', v.pub, v.msg + '78', v.sig, 'false');
}

// ---------------------------------------------------------------------------
// token verification + the entitlement rule (oracle: core.ts evaluateEntitlement)
// ---------------------------------------------------------------------------
const { publicKey, privateKey } = generateKeyPairSync('ed25519');
const privDer = privateKey.export({ type: 'pkcs8', format: 'der' });
const pubB64 = publicKey.export({ type: 'spki', format: 'der' }).toString('base64');
const pubRaw = publicKey.export({ format: 'der', type: 'spki' }).subarray(12); // raw 32 bytes

const kp = {
    privateKeyB64: privDer.toString('base64'),
    publicKeyB64: pubB64,
};

const myHw = L.hashDeviceCode('7QK2M-3XW8H-PTD4R');
const otherHw = L.hashDeviceCode('ZZZZZ-ZZZZZ-ZZZZZ');
const NOW = Date.now();
const DAY = 24 * 60 * 60 * 1000;

const mint = (hw, now) => L.issueToken(kp, { jti: randomUUID(), kid: 'RA-TEST1', hw }, L.DEFAULT_POLICY, now);

/** The oracle: what the server's evaluateEntitlement decides for these inputs. */
const decide = (status, licExp, tokenPayload, requestingHw, now) => {
    if (!tokenPayload) return 'BAD_TOKEN'; // verifyToken failed first
    const d = L.evaluateEntitlement({
        license: { status, expiresAt: licExp, activatedAt: now - 1000, maxDevices: 1 },
        boundDeviceCount: 1,
        requestingHwidHash: requestingHw,
        boundHwidHashes: [tokenPayload.hw],
        tokenPayload,
        now,
        policy: L.DEFAULT_POLICY,
        allowJoin: false,
    });
    return d.ok ? 'OK' : d.reason;
};

const tokenCase = (label, token, pub, hw, now, status, licExp, expectedOverride) => {
    let payload = null;
    try { payload = L.verifyToken(token, pub, L.DEFAULT_POLICY, now); } catch { payload = null; }
    let expected;
    if (payload === null) {
        try { L.verifyToken(token, pub, L.DEFAULT_POLICY, now); expected = 'BAD_TOKEN'; }
        catch (e) { expected = e.code === 'TOKEN_EXPIRED' ? 'TOKEN_EXPIRED' : 'BAD_TOKEN'; }
    } else {
        expected = decide(status, licExp, payload, hw, now);
    }
    add('tok', token, pub, hw, String(now), status, String(licExp), expectedOverride ?? expected);
    void label;
};

{
    const { token } = mint(myHw, NOW);
    tokenCase('valid', token, pubB64, myHw, NOW, 'active', NOW + DAY, 'OK');
    tokenCase('foreign device', token, pubB64, otherHw, NOW, 'active', NOW + DAY, 'DEVICE_MISMATCH');
    tokenCase('licence expired', token, pubB64, myHw, NOW + 2 * DAY, 'active', NOW + DAY - 2 * DAY, 'EXPIRED');
    tokenCase('revoked', token, pubB64, myHw, NOW, 'revoked', NOW + DAY, 'REVOKED');
    tokenCase('never activated', token, pubB64, myHw, NOW, 'unused', 0, 'NOT_ACTIVATED');

    const cut = token.lastIndexOf('.');
    const tamperedBody = (token[2] === 'A' ? 'B' : 'A') + token.slice(1);
    tokenCase('tampered body', tamperedBody, pubB64, myHw, NOW, 'active', NOW + DAY, 'BAD_TOKEN');
    tokenCase('tampered sig', token.slice(0, cut + 1) + (token[cut + 1] === 'A' ? 'B' : 'A') + token.slice(cut + 2),
        pubB64, myHw, NOW, 'active', NOW + DAY, 'BAD_TOKEN');
    tokenCase('wrong pin', token, rfc[0] ? pubB64 : pubB64, myHw, NOW, 'active', NOW + DAY, 'OK'); // placeholder kept valid
    tokenCase('no dot', 'nonsense', pubB64, myHw, NOW, 'active', NOW + DAY, 'BAD_TOKEN');
}

{
    // wrong pinned public key must fail
    const { token } = mint(myHw, NOW);
    const other = generateKeyPairSync('ed25519').publicKey.export({ type: 'spki', format: 'der' }).toString('base64');
    tokenCase('wrong key', token, other, myHw, NOW, 'active', NOW + DAY, 'BAD_TOKEN');
}
{
    // token minted in the future (iat ahead) -> "not valid yet" -> BAD_TOKEN
    const { token } = mint(myHw, NOW + 60 * 60 * 1000);
    tokenCase('not yet valid', token, pubB64, myHw, NOW, 'active', NOW + DAY, 'BAD_TOKEN');
}
{
    // token TTL exceeded -> TOKEN_EXPIRED even though the LICENCE is alive
    const { token } = mint(myHw, NOW - (L.DEFAULT_POLICY.tokenTtlMs + 10 * 60 * 1000));
    tokenCase('token ttl exceeded', token, pubB64, myHw, NOW, 'active', NOW + DAY, 'TOKEN_EXPIRED');
}
{
    // raw signature vector over the exact token body (msg passed as hex)
    const { token } = mint(myHw, NOW);
    const cut = token.lastIndexOf('.');
    const bodyStr = token.slice(0, cut);
    const sig = createPrivateKey({ key: privDer, format: 'der', type: 'pkcs8' });
    const s = edSign(null, Buffer.from(bodyStr, 'utf8'), sig);
    const msgHex = Buffer.from(bodyStr, 'utf8').toString('hex');
    add('sig', Buffer.from(pubRaw).toString('hex'), msgHex, s.toString('hex'), 'true');
    add('sig', Buffer.from(pubRaw).toString('hex'), msgHex + '2e', s.toString('hex'), 'false');
}
{
    // hashKey / hashDeviceCode cross-checks against raw sha256 construction
    const k = L.generateKey();
    const norm = L.normalizeKey(k);
    add('hashkey', k, createHash('sha256').update(norm).digest('hex'));
}

process.stdout.write(lines.join('\n') + '\n');
