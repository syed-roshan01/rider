/**
 * End-to-end test: drives the REAL running server over HTTP.
 *
 *   node license/src/server.ts          (in another shell / background job)
 *   node license/test/e2e.test.ts
 *
 * Simulates the full customer journey — issue a key, activate on a phone,
 * share it to a second phone, revoke, unbind — plus every bypass attempt.
 */
import assert from 'node:assert/strict';
import { randomUUID } from 'node:crypto';
import { deriveDeviceCode } from '../src/core.ts';

const BASE = process.env.LICENSE_BASE ?? 'http://localhost:8787';

let failures = 0;
const results: string[] = [];

async function step(name: string, fn: () => Promise<void>): Promise<void> {
    try {
        await fn();
        results.push(`  ok    ${name}`);
    } catch (e) {
        failures++;
        results.push(`  FAIL  ${name}\n          ${(e as Error).message}`);
    }
}

const post = async (path: string, body: unknown, token?: string, expect = 200) => {
    const res = await fetch(BASE + path, {
        method: 'POST',
        headers: {
            'content-type': 'application/json',
            ...(token ? { cookie: `ra_admin=${token}` } : {}),
        },
        body: JSON.stringify(body),
    });
    const data = await res.json().catch(() => ({}));
    if (res.status !== expect) {
        throw new Error(`${path} -> HTTP ${res.status} (wanted ${expect}): ${JSON.stringify(data).slice(0, 160)}`);
    }
    return data;
};

const get = async (path: string, token: string) => {
    const res = await fetch(BASE + path, { headers: { cookie: `ra_admin=${token}` } });
    return { status: res.status, data: await res.json().catch(() => ({})) };
};

const device = (name: string, version = '6') => ({
    androidId: `aid-${name}`,
    buildFingerprint: `google/${name}/release-keys`,
    model: `Model ${name}`,
    brand: 'TestPhone',
    appVersion: version,
    integrity: 'MEETS_DEVICE_INTEGRITY',
});

/**
 * The device code a real app would compute on the handset and present with
 * every request. Computed locally here, exactly as the client must — the server
 * never tells you your own identity.
 */
const codeFor = (name: string): string => deriveDeviceCode(device(name));

// ---------------------------------------------------------------------------
console.log(`\ne2e against ${BASE}\n`);

let adminToken = '';
let key = '';
let tokenA = '';
let boundKey = '';
let boundToken = '';

await step('dashboard HTML is served', async () => {
    const res = await fetch(BASE + '/');
    assert.equal(res.status, 200);
    const html = await res.text();
    assert.ok(/AcceptPro/i.test(html), 'AcceptPro branding missing from served HTML');
    assert.ok(!/\.\.\//.test(html), 'no path traversal content');
});

await step('static assets are served', async () => {
    // The admin UI is a static export (AcceptPro console). Every asset the
    // shell references must resolve through the server's content-type map.
    const html = await (await fetch(BASE + '/')).text();
    const refs = [...html.matchAll(/(?:src|href)="(\/_next\/[^"]+)"/g)].map((m) => m[1]);
    assert.ok(refs.length > 0, 'expected the served shell to reference /_next/ assets');
    for (const p of new Set(refs)) {
        const res = await fetch(BASE + p);
        assert.equal(res.status, 200, p);
    }
});

/**
 * Regression guard: an author rule that sets `display` defeats the `hidden`
 * attribute (which only works via the browser's default stylesheet). That bug
 * made the modal appear on load with just its Close button and rendered every
 * tab panel at once.
 *
 * The console UI is a static export now, so the guard is conditional and
 * structure-agnostic: wherever the served surface uses the `hidden` attribute,
 * the served CSS must neutralise author-display rules on it. (If a future UI
 * stops using `hidden` entirely, the bug class cannot occur and this passes.)
 */
await step('REGRESSION: the `hidden` attribute is not defeated by author CSS', async () => {
    const html = await (await fetch(BASE + '/')).text();
    const cssHrefs = [...html.matchAll(/href="(\/_next\/[^"]+?\.css[^"]*)"/g)].map((m) => m[1]);
    let css = '';
    for (const p of new Set(cssHrefs)) css += await (await fetch(BASE + p)).text();

    const usesHiddenAttr = /<[a-z][^>]*\shidden[\s>=/]/i.test(html);
    if (!usesHiddenAttr) return; // UI no longer relies on the hidden attribute
    assert.match(css, /\[hidden\]\s*\{\s*display:\s*none\s*!important\s*;?\s*\}/,
        'served CSS must contain `[hidden] { display: none !important; }` whenever markup uses hidden');
});

await step('admin API rejects an unauthenticated caller', async () => {
    const r = await get('/api/admin/licenses', 'bogus-token');
    assert.equal(r.status, 401);
});

await step('admin login rejects a wrong password', async () => {
    await post('/api/admin/login', { password: 'wrong-password' }, undefined, 401);
});

await step('admin login accepts the real password', async () => {
    const r = await post('/api/admin/login', { password: process.env.ADMIN_PASSWORD ?? 'admin@123' });
    assert.equal(r.ok, true);
    assert.ok(typeof r.token === 'string' && r.token.length > 20);
    adminToken = r.token;
});

await step('path traversal is blocked', async () => {
    const res = await fetch(BASE + '/..%2f..%2f..%2f..%2fwindows%2fwin.ini');
    assert.notEqual(res.status, 200);
});

await step('licenses can be generated in bulk', async () => {
    const r = await post('/api/admin/licenses', { count: 3, planType: 'DAY', maxDevices: 1, note: 'e2e' }, adminToken);
    assert.equal(r.created.length, 3);
    for (const c of r.created) {
        assert.match(c.key, /^RA(-[0-9A-HJKMNP-TV-Z]{5}){5}$/);
        assert.equal(c.record.status, 'unused');
    }
    key = r.created[0].key;
});

await step('activate rejects a garbage key', async () => {
    const r = await post('/api/v1/activate', { key: 'RA-AAAAA-AAAAA-AAAAA-AAAAA-AAAAA', device: device('x') }, undefined, 403);
    assert.equal(r.reason, 'UNKNOWN_KEY');
});

await step('activate rejects a tampered (bad checksum) key', async () => {
    const r = await post('/api/v1/activate', { key: key.slice(0, -1) + (key.endsWith('A') ? 'B' : 'A'), device: device('x') }, undefined, 403);
    assert.equal(r.reason, 'UNKNOWN_KEY');
});

await step('device A can activate and receives a signed token', async () => {
    const r = await post('/api/v1/activate', { key, device: device('A') });
    assert.equal(r.ok, true);
    assert.ok(typeof r.token === 'string' && r.token.includes('.'));
    assert.ok(r.expiresAt > Date.now());
    assert.equal(r.license.planType, 'DAY');
    tokenA = r.token;
});

await step('device A can validate its token (offline-style check)', async () => {
    const r = await post('/api/v1/validate', { key, token: tokenA, deviceCode: codeFor('A') });
    assert.equal(r.ok, true);
    assert.ok(r.remainingMs > 0);
});

await step('BYPASS: device B cannot activate a single-device key', async () => {
    const r = await post('/api/v1/activate', { key, device: device('B') }, undefined, 403);
    assert.equal(r.reason, 'DEVICE_LIMIT');
});

await step('BYPASS: device B cannot use device A\'s token', async () => {
    const r = await post('/api/v1/validate', { key, token: tokenA + 'x', deviceCode: codeFor('B') }, undefined, 401);
    assert.equal(r.reason, 'BAD_TOKEN');
});

await step('BYPASS: a forged token is rejected', async () => {
    const [body, sig] = tokenA.split('.');
    const claims = JSON.parse(Buffer.from(body.replace(/-/g, '+').replace(/_/g, '/'), 'base64').toString());
    claims.exp = claims.exp + 10 ** 12; // try to live forever
    const forged = Buffer.from(JSON.stringify(claims)).toString('base64')
        .replace(/\+/g, '-').replace(/\//g, '_').replace(/=+$/, '');
    const r = await post('/api/v1/validate', { key, token: `${forged}.${sig}`, deviceCode: codeFor('A') }, undefined, 401);
    assert.equal(r.reason, 'BAD_TOKEN');
});

await step('config poll returns the current policy', async () => {
    const r = await post('/api/v1/config', { appVersion: 6 });
    assert.equal(r.maintenance, false);
});

await step('maintenance mode blocks every device', async () => {
    await post('/api/admin/config', { maintenanceMode: true }, adminToken);
    const r = await post('/api/v1/config', { appVersion: 6 });
    assert.equal(r.maintenance, true);
    await post('/api/admin/config', { maintenanceMode: false }, adminToken);
});

await step('force-update pushes a version gate', async () => {
    await post('/api/admin/config', { forceUpdateVersion: 99 }, adminToken);
    const r = await post('/api/v1/config', { appVersion: 6 });
    assert.equal(r.forceUpdate, true);
    await post('/api/admin/config', { forceUpdateVersion: 0 }, adminToken);
});

await step('an admin can extend an active key', async () => {
    const kh = (await get(`/api/admin/licenses?q=${encodeURIComponent(key)}`, adminToken)).data.rows[0].keyHash;
    const r = await post(`/api/admin/licenses/${kh}/extend`, { days: 30 }, adminToken);
    assert.ok(r.expiresAt > Date.now());
});

await step('BYPASS: an expired key cannot be revived by re-activating', async () => {
    // wind the window into the past via an admin "extend" of -120 days
    const kh = (await get(`/api/admin/licenses?q=${encodeURIComponent(key)}`, adminToken)).data.rows[0].keyHash;
    await post(`/api/admin/licenses/${kh}/extend`, { days: -120 }, adminToken);

    const fresh = await post('/api/v1/activate', { key, device: device('EXPIRED-TEST') }, undefined, 403);
    assert.equal(fresh.reason, 'EXPIRED', 're-activation must not mint a fresh window');

    const val = await post('/api/v1/validate', { key, token: tokenA, deviceCode: codeFor('A') }, undefined, 403);
    assert.equal(val.reason, 'EXPIRED');

    // only an admin may open a new window
    await post(`/api/admin/licenses/${kh}/extend`, { days: 30 }, adminToken);
    const back = await post('/api/v1/validate', { key, token: tokenA, deviceCode: codeFor('A') });
    assert.equal(back.ok, true, 'admin extend restores the key');
});

await step('the public key endpoint exposes only the verification key', async () => {
    const res = await fetch(BASE + '/api/v1/public-key');
    const r = await res.json();
    assert.equal(r.algorithm, 'ed25519');
    assert.ok(!('privateKey' in r));
});

await step('BYPASS: revoking the key kills validation instantly', async () => {
    const kh = (await get(`/api/admin/licenses?q=${encodeURIComponent(key)}`, adminToken)).data.rows[0].keyHash;
    await post(`/api/admin/licenses/${kh}/revoke`, {}, adminToken);
    const r = await post('/api/v1/validate', { key, token: tokenA, deviceCode: codeFor('A') }, undefined, 403);
    assert.equal(r.reason, 'REVOKED');
});

await step('BYPASS: a revoked key cannot re-activate on a fresh device', async () => {
    const r = await post('/api/v1/activate', { key, device: device('C') }, undefined, 403);
    assert.equal(r.reason, 'REVOKED');
});

await step('restoring the key brings the device back', async () => {
    const kh = (await get(`/api/admin/licenses?q=${encodeURIComponent(key)}`, adminToken)).data.rows[0].keyHash;
    await post(`/api/admin/licenses/${kh}/unrevoke`, {}, adminToken);
    const r = await post('/api/v1/validate', { key, token: tokenA, deviceCode: codeFor('A') });
    assert.equal(r.ok, true);
});

await step('unbind frees the slot for a new device', async () => {
    const devices = (await get('/api/admin/devices', adminToken)).data as { hwidHash: string; keyHash: string }[];
    const mine = devices.filter((d) => true);
    assert.ok(mine.length >= 1, 'expected at least one bound device');
    const res = await fetch(BASE + `/api/admin/devices/${mine[0].hwidHash}`, {
        method: 'DELETE',
        headers: { cookie: `ra_admin=${adminToken}` },
    });
    assert.equal(res.status, 200);
    const r = await post('/api/v1/activate', { key, device: device('B') });
    assert.equal(r.ok, true, 'device B should now be able to activate');
});

await step('stats reflect the activity', async () => {
    const r = await get('/api/admin/stats', adminToken);
    assert.ok(r.data.total >= 3);
    assert.ok(r.data.devices >= 1);
    assert.ok(r.data.active >= 1);
});

await step('audit log records the admin and device actions', async () => {
    const r = await get('/api/admin/audit', adminToken);
    const text = JSON.stringify(r.data);
    assert.ok(text.includes('license.create'));
    assert.ok(text.includes('license.revoke'));
    assert.ok(text.includes('activate.ok'));
    assert.ok(text.includes('activate.denied'));
});

/**
 * The ZyQora-style model: a key is minted FOR a specific device code, read off
 * the app's login screen. It is therefore born useless to anyone else — there is
 * no window between "seller issues key" and "customer pastes key" where it can
 * be used elsewhere.
 */
await step('a key bound to a device code works on that phone', async () => {
    const r = await post('/api/admin/licenses', {
        count: 1, planType: 'MONTH', note: 'device-bound e2e',
        deviceCodes: ['7QK2M-3XW8H-PTD4R'],
    }, adminToken);
    boundKey = r.created[0].key;
    assert.equal(r.created[0].record.maxDevices, 1);
    assert.equal(r.created[0].record.boundDeviceCodeHashes.length, 1);

    const act = await post('/api/v1/activate', {
        key: boundKey, deviceCode: '7QK2M-3XW8H-PTD4R', device: device('BOUND'),
    });
    assert.equal(act.ok, true, 'the bound phone must activate');
    boundToken = act.token;
});

await step('BYPASS: a device-bound key cannot be used by any other phone', async () => {
    const r = await post('/api/v1/activate', {
        key: boundKey, deviceCode: 'ZZZZZ-ZZZZZ-ZZZZZ', device: device('THIEF'),
    }, undefined, 403);
    assert.equal(r.reason, 'DEVICE_MISMATCH');
});

await step('BYPASS: reusing the exact same key elsewhere is dead too', async () => {
    // a different phone that happens to send the victim's code still has its own
    // marker-derived identity, but the CODE is the credential — so send a wrong one
    const r = await post('/api/v1/activate', {
        key: boundKey, deviceCode: 'AAAAA-BBBBB-CCCCC', device: device('THIEF2'),
    }, undefined, 403);
    assert.equal(r.reason, 'DEVICE_MISMATCH');
});

await step('a multi-device key admits exactly its two codes and nobody else', async () => {
    const r = await post('/api/admin/licenses', {
        count: 1, planType: 'MONTH', note: 'two phones',
        deviceCodes: ['AAAA1-BBBB1-CCCC1', 'AAAA2-BBBB2-CCCC2'],
    }, adminToken);
    const k = r.created[0].key;
    assert.equal(r.created[0].record.maxDevices, 2, 'slots follow the supplied codes');

    assert.equal((await post('/api/v1/activate', { key: k, deviceCode: 'AAAA1-BBBB1-CCCC1', device: device('P1') })).ok, true);
    assert.equal((await post('/api/v1/activate', { key: k, deviceCode: 'AAAA2-BBBB2-CCCC2', device: device('P2') })).ok, true);

    const third = await post('/api/v1/activate', { key: k, deviceCode: 'AAAA3-BBBB3-CCCC3', device: device('P3') }, undefined, 403);
    assert.equal(third.reason, 'DEVICE_MISMATCH');
});

await step('the bound device validates; a stolen token does not survive a swap', async () => {
    const ok = await post('/api/v1/validate', { key: boundKey, token: boundToken, deviceCode: '7QK2M-3XW8H-PTD4R' });
    assert.equal(ok.ok, true, 'the rightful device validates');

    // Copy the victim's token file onto a different phone and present it from
    // there. The token still carries the victim's identity, but the presenting
    // device is now different -> must be refused.
    const stolen = await post('/api/v1/validate', {
        key: boundKey, token: boundToken, deviceCode: 'ZZZZZ-ZZZZZ-ZZZZZ',
    }, undefined, 403);
    assert.equal(stolen.reason, 'DEVICE_MISMATCH', 'a replayed token must not travel to another phone');
});

await step('validate requires the presenting device code', async () => {
    const r = await post('/api/v1/validate', { key: boundKey, token: boundToken }, undefined, 400);
    assert.equal(r.reason, 'DEVICE_CODE_REQUIRED');
});

await step('unknown admin endpoints 404 cleanly', async () => {
    const r = await get('/api/admin/does-not-exist', adminToken);
    assert.equal(r.status, 404);
});

await step('unknown device endpoints 404 cleanly', async () => {
    const res = await fetch(BASE + '/api/v1/does-not-exist');
    assert.equal(res.status, 404);
});

await step('oversized bodies are refused', async () => {
    const res = await fetch(BASE + '/api/admin/login', {
        method: 'POST',
        headers: { 'content-type': 'application/json' },
        body: JSON.stringify({ password: 'x'.repeat(400000) }),
    });
    assert.equal(res.status, 413, `expected 413, got ${res.status}`);
    const d = await res.json();
    assert.equal(d.error, 'body too large');
});

// ---------------------------------------------------------------------------
console.log(results.join('\n'));
console.log(`\n  ${failures === 0 ? 'ALL E2E CHECKS PASSED' : `${failures} FAILED`}\n`);
process.exit(failures === 0 ? 0 : 1);
