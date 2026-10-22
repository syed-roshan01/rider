#!/usr/bin/env node
/**
 * smoke-suite.mjs - integration smoke for the AcceptPro admin suite.
 *
 * Boots the local JSON-store server (license/src/server.ts) on its own port with
 * a throwaway DB (any existing license/data/db.json is backed up and restored),
 * then exercises EVERY endpoint family of the admin API contract
 * (ADMIN-PORT.md section 5) against it. Assertions are strict where the
 * contract pins an exact string or shape and deliberately loose only around the
 * checkout fake-gateway mode (CHECKOUT_FAKE_GATEWAY=1), whose internals are
 * implementation-defined.
 *
 * Usage:
 *   node smoke-suite.mjs                 # self-boot on port 8791
 *   node smoke-suite.mjs --base URL      # run against an already-running server
 *
 * ASCII only in this file.
 */
import { spawn } from 'node:child_process';
import { existsSync, copyFileSync, renameSync, rmSync, openSync, closeSync, mkdirSync } from 'node:fs';
import { dirname, join } from 'node:path';
import { fileURLToPath } from 'node:url';

const ROOT = dirname(fileURLToPath(import.meta.url));
const args = process.argv.slice(2);
const baseArg = args.includes('--base') ? args[args.indexOf('--base') + 1] : null;
const PORT = 8791;
const BASE = baseArg ?? `http://127.0.0.1:${PORT}`;
const SEED_USER = 'admin';
const SEED_PASS = 'smoke-pass-123';
const CODE = 'BK4JC-74W07-YMWT5'; // the app's Device ID display form

let pass = 0;
let fail = 0;
const failures = [];

function ok(name, cond, detail = '') {
    if (cond) {
        pass++;
        console.log(`  PASS  ${name}`);
    } else {
        fail++;
        failures.push(`${name}${detail ? ` :: ${detail}` : ''}`);
        console.log(`  FAIL  ${name}${detail ? ` :: ${detail}` : ''}`);
    }
}

function family(name) {
    console.log(`\n=== ${name} ===`);
}

async function call(method, path, { token, body, raw } = {}) {
    const res = await fetch(BASE + path, {
        method,
        headers: {
            ...(body !== undefined ? { 'content-type': 'application/json' } : {}),
            ...(token ? { authorization: `Bearer ${token}` } : {}),
        },
        body: body !== undefined ? JSON.stringify(body) : undefined,
    });
    let data = null;
    const text = await res.text();
    try { data = text ? JSON.parse(text) : null; } catch { data = text; }
    return { status: res.status, data, raw: text };
}
const get = (p, o) => call('GET', p, o);
const post = (p, b, o = {}) => call('POST', p, { ...o, body: b });
const put = (p, b, o = {}) => call('PUT', p, { ...o, body: b });
const patch = (p, b, o = {}) => call('PATCH', p, { ...o, body: b });
const del = (p, o) => call('DELETE', p, o);

const near = (a, b, eps = 0.01) => Math.abs(Number(a) - Number(b)) <= eps;

// ---------------------------------------------------------------------------
// boot (unless --base)
// ---------------------------------------------------------------------------
let child = null;
const dbPath = join(ROOT, 'license', 'data', 'db.json');
const dbBackup = `${dbPath}.smoke-backup`;
let booted = false;

async function boot() {
    if (existsSync(dbPath)) renameSync(dbPath, dbBackup);
    const logPath = join(ROOT, 'license', 'data', 'smoke-server.log');
    mkdirSync(dirname(logPath), { recursive: true });
    const fd = openSync(logPath, 'w');
    child = spawn('node', ['license/src/server.ts'], {
        cwd: ROOT,
        // file fds, NOT pipes: piped stdio spawns fail under the file sandbox
        stdio: ['ignore', fd, fd],
        env: {
            ...process.env,
            PORT: String(PORT),
            ADMIN_USERNAME: SEED_USER,
            ADMIN_PASSWORD: SEED_PASS,
            JWT_SECRET: 'smoke-jwt-secret',
            CHECKOUT_FAKE_GATEWAY: '1',
            // dummy creds so the presence check passes; fake mode never uses them
            CASHFREE_CLIENT_ID: 'smoke',
            CASHFREE_CLIENT_SECRET: 'smoke',
        },
    });
    closeSync(fd);
    for (let i = 0; i < 50; i++) {
        if (child.exitCode !== null) {
            throw new Error(`server exited with code ${child.exitCode}; see ${logPath}`);
        }
        try {
            const r = await fetch(`${BASE}/api/settings/demo`);
            if (r.status < 500) return;
        } catch { /* not up yet */ }
        await new Promise((r) => setTimeout(r, 200));
    }
    throw new Error(`server did not become ready; see ${logPath}`);
}

function shutdown() {
    if (child && child.exitCode === null) {
        try { child.kill(); } catch { /* already gone */ }
    }
    rmSync(dbPath, { force: true });
    if (existsSync(dbBackup)) renameSync(dbBackup, dbPath);
}

// ---------------------------------------------------------------------------
// the run
// ---------------------------------------------------------------------------
try {
    if (!baseArg) await boot();

    family('auth');
    let r = await post('/api/auth/login', { username: SEED_USER, password: 'wrong' });
    ok('login wrong password 401', r.status === 401 && r.data?.error === 'Invalid credentials', r.raw);
    r = await post('/api/auth/login', { username: SEED_USER, password: SEED_PASS });
    ok('seeded super login', r.status === 200 && typeof r.data?.token === 'string' && r.data?.role === 'super', r.raw);
    const T = r.data?.token;
    r = await get('/api/auth/me', { token: T });
    ok('auth/me for super', r.status === 200 && r.data?.role === 'super', r.raw);
    r = await get('/api/auth/me', { token: 'garbage' });
    ok('auth/me rejects garbage token', r.status === 401, r.raw);

    family('admins');
    r = await post('/api/admins/create', { username: 'Smoke-Admin', password: 'password1', role: 'admin' }, { token: T });
    ok('admin create 201', r.status === 201 && r.data?.success === true && r.data?.admin?.username === 'smoke-admin', r.raw);
    const adminId = r.data?.admin?.id;
    r = await post('/api/admins/create', { username: 'smoke-admin', password: 'password1' }, { token: T });
    ok('duplicate username 409', r.status === 409 && r.data?.error === 'Username already exists', r.raw);
    r = await get('/api/admins/list', { token: T });
    ok('admins list has licenseCount', r.status === 200 && Array.isArray(r.data) && r.data.some((a) => a.licenseCount !== undefined), r.raw);
    r = await post(`/api/admins/${adminId}/update-share`, { sharePercent: 25 }, { token: T });
    ok('update-share 25', r.status === 200 && r.data?.admin?.sharePercent === 25, r.raw);
    r = await post(`/api/admins/${adminId}/update-share`, { sharePercent: 101 }, { token: T });
    // NB: the zyqora string uses an EN DASH (U+2013) - keep it byte-exact
    ok('update-share 101 rejected 400', r.status === 400 && r.data?.error === 'sharePercent must be 0\u2013100', r.raw);
    r = await post(`/api/admins/${adminId}/change-password`, { password: 'short' }, { token: T });
    ok('change-password short 400', r.status === 400 && r.data?.error === 'Password must be at least 6 characters', r.raw);
    r = await post(`/api/admins/${adminId}/change-password`, { password: 'password2' }, { token: T });
    ok('change-password ok', r.status === 200 && r.data?.success === true, r.raw);
    r = await post('/api/auth/login', { username: 'smoke-admin', password: 'password2' });
    ok('admin login with new password', r.status === 200 && r.data?.role === 'admin', r.raw);
    const adminT = r.data?.token;
    r = await post(`/api/admins/${adminId}/toggle`, {}, { token: T });
    ok('admin toggle off', r.status === 200 && r.data?.active === false, r.raw);
    r = await post('/api/auth/login', { username: 'smoke-admin', password: 'password2' });
    ok('inactive admin cannot login', r.status === 401 && r.data?.error === 'Invalid credentials', r.raw);
    r = await post(`/api/admins/${adminId}/toggle`, {}, { token: T });
    ok('admin toggle back on', r.status === 200 && r.data?.active === true, r.raw);
    r = await get(`/api/admins/${adminId}/licenses`, { token: T });
    ok('admin licenses view', r.status === 200 && r.data?.admin?.username === 'smoke-admin' && Array.isArray(r.data?.licenses), r.raw);

    family('affiliates');
    r = await post('/api/affiliates/create', { username: 'smoke-aff', name: 'Smoke Aff', password: 'password1', commission: 10 }, { token: T });
    ok('affiliate create 201', r.status === 201 && r.data?.affiliate?.commission === 10, r.raw);
    const affId = r.data?.affiliate?.id;
    r = await post('/api/affiliates/create', { username: 'smoke-aff', name: 'X', password: 'password1' }, { token: T });
    ok('affiliate duplicate 409', r.status === 409 && r.data?.error === 'Username already taken', r.raw);
    r = await get('/api/affiliates/list', { token: T });
    ok('affiliates list', r.status === 200 && Array.isArray(r.data) && r.data.length > 0, r.raw);
    r = await post(`/api/affiliates/${affId}/update-commission`, { commission: 15 }, { token: T });
    ok('commission update', r.status === 200 && r.data?.commission === 15, r.raw);
    r = await post(`/api/affiliates/${affId}/update-commission`, { commission: 10 }, { token: T });
    ok('commission restored', r.status === 200 && r.data?.commission === 10, r.raw);
    r = await post(`/api/affiliates/${affId}/update-commission`, { commission: 101 }, { token: T });
    ok('commission out of range 400', r.status === 400 && r.data?.error === 'Commission must be 0\u2013100', r.raw);

    family('licenses + money');
    r = await post('/api/licenses/generate', {
        clientName: 'Smoke Paid', clientPhone: '9999999999', licenseMode: 'desktop', plan: 'monthly',
        machineId: CODE, deviceLimit: 1, price: 1000, discountedPrice: 800, affiliateId: affId, affiliateName: 'Smoke Aff',
    }, { token: T });
    ok('generate paid RA- key', r.status === 200 && /^RA-/.test(r.data?.key ?? ''), r.raw);
    const paidKey = r.data?.key;
    ok('discount math stored', r.data?.license?.discountAmount === 200 && r.data?.license?.discountedPrice === 800, r.raw);
    ok('affiliate commission stored', near(r.data?.license?.affiliateCommissionAmount, 80), r.raw);
    r = await post('/api/licenses/generate', {
        clientName: 'Smoke Clamp', licenseMode: 'cloud', plan: 'custom', customDays: 10, machineId: CODE,
        deviceLimit: 9, features: { mobile: false }, price: 1000, discountedPrice: 1200,
    }, { token: T });
    ok('discount clamped to price', r.status === 200 && r.data?.license?.discountedPrice === 1000 && r.data?.license?.discountAmount === 0, r.raw);
    ok('generate is always app/1 device/no features', r.status === 200 && r.data?.license?.licenseMode === 'app'
        && r.data?.license?.deviceLimit === 1 && Object.keys(r.data?.license?.features ?? {}).length === 0, r.raw);
    r = await post('/api/licenses/generate', { plan: 'monthly' }, { token: T });
    ok('generate missing clientName+machineId 400', r.status === 400 && r.data?.error === 'clientName, machineId and plan are required', r.raw);
    r = await post('/api/licenses/generate', {
        clientName: 'Smoke Trial', plan: 'trial', machineId: CODE, price: 0,
    }, { token: T });
    ok('generate trial RA- key', r.status === 200 && /^RA-/.test(r.data?.key ?? ''), r.raw);
    const trialKey = r.data?.key;
    r = await get('/api/licenses/list', { token: T });
    ok('licenses list array', r.status === 200 && Array.isArray(r.data) && r.data.length >= 2, r.raw);
    r = await post('/api/licenses/validate', { key: 'RA-AAAAA-AAAAA-AAAAA-AAAAA-AAAAA', machineId: CODE });
    ok('validate unknown key', r.status === 200 && r.data?.valid === false && r.data?.error === 'Key not registered', r.raw);
    r = await post('/api/licenses/validate', { key: paidKey, machineId: CODE, mode: 'app' });
    ok('validate is a 200-shaped parity answer', r.status === 200 && typeof r.data?.valid === 'boolean', r.raw);
    r = await post('/api/licenses/update', { key: paidKey, notes: 'smoke edit', price: 900 }, { token: T });
    ok('license update', r.status === 200 && r.data?.license?.notes === 'smoke edit', r.raw);

    family('convert (trial -> paid, quota neutrality)');
    r = await post('/api/licenses/convert', { oldKey: trialKey, plan: 'monthly', price: 500 }, { token: T });
    ok('convert trial ok', r.status === 200 && /^RA-/.test(r.data?.key ?? ''), r.raw);
    const convKey = r.data?.key;
    // revoked non-trial paid keys are convertible too - use a dedicated key so
    // the affiliate/global money figures below stay stable.
    r = await post('/api/licenses/generate', {
        clientName: 'Smoke Revoked', licenseMode: 'desktop', plan: 'monthly', machineId: CODE, price: 300,
    }, { token: T });
    ok('generate revKey', r.status === 200 && /^RA-/.test(r.data?.key ?? ''), r.raw);
    const revKey = r.data?.key;
    r = await post('/api/licenses/revoke', { key: revKey, reason: 'smoke revoke' }, { token: T });
    ok('revoke paid', r.status === 200 && r.data?.success === true, r.raw);
    r = await post('/api/licenses/validate', { key: revKey, machineId: CODE, mode: 'app' });
    ok('validate revoked key', r.status === 200 && r.data?.valid === false && /revoked/i.test(r.data?.error ?? ''), r.raw);
    r = await post('/api/licenses/convert', { oldKey: revKey, plan: 'yearly', price: 700 }, { token: T });
    ok('revoked key convertible', r.status === 200 && /^RA-/.test(r.data?.key ?? ''), r.raw);

    family('expenses');
    r = await post('/api/expenses', { title: 'Smoke expense', amount: 200, category: 'ops', location: 'x', notes: 'n' }, { token: T });
    ok('expense create', r.status === 200 && r.data?.expense?.title === 'Smoke expense', r.raw);
    const expId = r.data?.expense?.id;
    r = await patch('/api/expenses', { id: expId, title: 'Smoke expense v2', amount: 250 }, { token: T });
    ok('expense edit keeps original snapshot', r.status === 200 && r.data?.expense?.originalValues?.amount === 200, r.raw);
    ok('expense edit overwrites fields', r.data?.expense?.title === 'Smoke expense v2' && r.data?.expense?.amount === 250, r.raw);
    r = await get('/api/expenses', { token: T });
    ok('expenses list', r.status === 200 && Array.isArray(r.data) && r.data.length > 0, r.raw);
    // ownership rule: a non-super admin may not edit another admin's expense
    r = await patch('/api/expenses', { id: expId, title: 'hijack', amount: 1 }, { token: adminT });
    ok('expense edit ownership 403', r.status === 403 && r.data?.error === 'Forbidden', r.raw);

    family('withdrawals');
    const superId = (await get('/api/auth/me', { token: T })).data?.id;
    r = await post('/api/withdrawals', { adminId: superId, amount: 300, note: 'smoke wd' }, { token: T });
    ok('withdrawal create 201', r.status === 201 && r.data?.success === true, r.raw);
    const wdId = r.data?.withdrawal?.id;
    r = await put(`/api/withdrawals/${wdId}`, { amount: 350 }, { token: T });
    ok('withdrawal edit', r.status === 200 && r.data?.withdrawal?.amount === 350, r.raw);
    r = await get('/api/withdrawals', { token: T });
    ok('withdrawals list', r.status === 200 && Array.isArray(r.data) && r.data.length > 0, r.raw);

    family('affiliate money');
    // super must name the target affiliate via ?affiliateId= (default is self)
    r = await get(`/api/affiliates/stats?affiliateId=${affId}`, { token: T });
    ok('affiliate stats shape', r.status === 200 && r.data?.stats && ['totalClients', 'demoClients', 'convertedClients', 'totalRevenue', 'commissionAmount', 'totalPaid', 'balance'].every((k) => k in r.data.stats), r.raw);
    ok('affiliate stats math', near(r.data?.stats?.totalRevenue, 800) && near(r.data?.stats?.commissionAmount, 80), r.raw);
    r = await post(`/api/affiliates/${affId}/pay`, { amount: 50, note: 'smoke payout' }, { token: T });
    ok('affiliate pay', r.status === 200 && r.data?.payment?.amount === 50, r.raw);
    const payId = r.data?.payment?.id;
    r = await get(`/api/affiliates/${affId}/payments`, { token: T });
    ok('affiliate payments', r.status === 200 && Array.isArray(r.data?.payments) && r.data.payments.length > 0, r.raw);
    r = await get('/api/affiliates/payments/list', { token: T });
    ok('payments list all', r.status === 200 && Array.isArray(r.data?.payments), r.raw);
    r = await put(`/api/affiliates/payments/${payId}`, { amount: 60 }, { token: T });
    ok('payment edit', r.status === 200 && r.data?.payment?.amount === 60, r.raw);
    r = await get(`/api/affiliates/stats?affiliateId=${affId}`, { token: T });
    ok('stats reflect payment edit', near(r.data?.stats?.totalPaid, 60) && near(r.data?.stats?.balance, 20), r.raw);
    // the affiliate's own portal view (no query param = session.sub)
    r = await post('/api/auth/login', { username: 'smoke-aff', password: 'password1' });
    ok('affiliate login', r.status === 200 && r.data?.role === 'affiliate', r.raw);
    const affT = r.data?.token;
    r = await get('/api/affiliates/stats', { token: affT });
    ok('affiliate sees own stats', r.status === 200 && r.data?.affiliate?.username === 'smoke-aff', r.raw);

    family('whitelabel + quota');
    r = await post('/api/whitelabel/create', {
        username: 'smoke-wl', name: 'Smoke WL', password: 'password1', allowedModes: ['desktop'],
        allowedPlans: ['monthly'], licenseLimit: 1, maxDevices: 1, partnershipMonths: 1,
    }, { token: T });
    ok('whitelabel create 201', r.status === 201 && r.data?.whitelabel?.licenseLimit === 1, r.raw);
    const wlId = r.data?.whitelabel?.id;
    r = await post('/api/whitelabel/create', {
        username: 'x', name: 'X', password: 'password1', allowedModes: [], licenseLimit: 5,
    }, { token: T });
    ok('allowedModes empty 400', r.status === 400 && r.data?.error === 'Select at least one license type', r.raw);
    r = await post('/api/auth/login', { username: 'smoke-wl', password: 'password1' });
    ok('whitelabel login', r.status === 200 && r.data?.role === 'whitelabel', r.raw);
    const wlT = r.data?.token;
    r = await get('/api/auth/me', { token: wlT });
    ok('whitelabel me has usage+partnership', r.status === 200 && r.data?.usage && r.data?.partnership, r.raw);
    r = await post('/api/licenses/generate', { clientName: 'WL', plan: 'monthly', machineId: CODE }, { token: wlT });
    ok('whitelabel disallowed mode 403', r.status === 403 && r.data?.error === 'License type "app" is not allowed for this account', r.raw);
    r = await post(`/api/whitelabel/${wlId}/update`, { allowedModes: ['app'] }, { token: T });
    ok('whitelabel mode allow-list update', r.status === 200 && r.data?.success === true, r.raw);
    r = await post('/api/licenses/generate', { clientName: 'WL', plan: 'yearly', machineId: CODE }, { token: wlT });
    ok('whitelabel disallowed plan 403', r.status === 403 && r.data?.error === 'Key duration "yearly" is not allowed for this account', r.raw);
    r = await post('/api/licenses/generate', { clientName: 'WL', plan: 'monthly', machineId: CODE }, { token: wlT });
    ok('whitelabel generate within quota', r.status === 200 && /^RA-/.test(r.data?.key ?? ''), r.raw);
    r = await post('/api/licenses/generate', { clientName: 'WL', plan: 'monthly', machineId: CODE }, { token: wlT });
    ok('whitelabel quota 403', r.status === 403 && r.data?.error === 'License limit reached (1/1). Contact the administrator to raise your limit.', r.raw);
    r = await get('/api/whitelabel/list', { token: T });
    ok('whitelabel list usage', r.status === 200 && r.data?.[0] && r.data[0].usedLicenses === 1 && r.data[0].remainingLicenses === 0, r.raw);
    r = await post(`/api/whitelabel/${wlId}/update`, { licenseLimit: 2 }, { token: T });
    ok('whitelabel update', r.status === 200 && r.data?.success === true, r.raw);
    r = await get(`/api/whitelabel/${wlId}/licenses`, { token: T });
    ok('whitelabel licenses view', r.status === 200 && r.data?.usage && Array.isArray(r.data?.licenses), r.raw);
    r = await post(`/api/whitelabel/${wlId}/change-password`, { password: 'password2' }, { token: T });
    ok('whitelabel change-password', r.status === 200 && r.data?.success === true, r.raw);
    r = await post('/api/auth/login', { username: 'smoke-wl', password: 'password2' });
    ok('whitelabel relogin with new password', r.status === 200 && r.data?.role === 'whitelabel', r.raw);
    // whitelabel must be walled out of the affiliate payout surface
    r = await post(`/api/affiliates/${affId}/pay`, { amount: 10 }, { token: wlT });
    ok('whitelabel blocked from affiliate pay 403', r.status === 403 && r.data?.error === 'Forbidden', r.raw);

    family('sales + stats (global money math)');
    r = await get('/api/sales', { token: T });
    ok('sales rows are paid non-whitelabel', r.status === 200 && Array.isArray(r.data) && r.data.every((s) => s.price > 0), r.raw);
    r = await get('/api/stats', { token: T });
    const s = r.data ?? {};
    ok('stats has all fields', ['totalRevenueBasis', 'allWithdrawn', 'moneyLeft', 'totalRevenue', 'totalExpenses', 'affilCommission'].every((k) => k in s), r.raw);
    ok('stats basis identity', near(s.totalRevenueBasis, s.totalRevenue - s.totalExpenses - s.affilCommission), JSON.stringify(s));
    ok('stats moneyLeft identity', near(s.moneyLeft, s.totalRevenueBasis - s.allWithdrawn), JSON.stringify(s));
    ok('stats commission figure', near(s.affilCommission, 80), JSON.stringify(s));

    family('logs + settings');
    r = await get('/api/logs', { token: T });
    ok('logs array', r.status === 200 && Array.isArray(r.data), r.raw);
    ok('logs carry LICENSE_GENERATED meta', r.data?.some((l) => l.action === 'LICENSE_GENERATED' && l.meta?.key), r.raw);
    r = await get('/api/settings/demo', );
    ok('demo settings public GET', r.status === 200 && r.data?.enabled === true, r.raw);
    r = await post('/api/settings/demo', { enabled: false }, { token: T });
    ok('demo settings set', r.status === 200 && r.data?.enabled === false, r.raw);
    r = await post('/api/settings/demo', { enabled: true }, { token: adminT });
    ok('demo settings super-only 403', r.status === 403 && r.data?.error === 'Forbidden - super admin only', r.raw);
    r = await post('/api/settings/demo', { enabled: true }, { token: T });
    ok('demo settings restored', r.status === 200 && r.data?.enabled === true, r.raw);
    r = await del('/api/logs', { token: T });
    ok('logs clear', r.status === 200 && r.data?.success === true, r.raw);

    family('checkout');
    r = await get('/api/checkout/plans');
    ok('plans catalog', r.status === 200 && Array.isArray(r.data?.plans) && ['starter', 'pro', 'business'].every((id) => r.data.plans.some((p) => p.id === id)), r.raw);
    const bad = [
        [{}, 'Choose a plan'],
        [{ planId: 'nope' }, 'Choose a plan'],
        [{ planId: 'pro', mode: 'tv' }, 'Invalid license type'],
        // machineId here is the app's Device ID (3x5 Crockford), not a 16-hex id
        [{ planId: 'pro', mode: 'desktop', machineId: 'abc' }, 'Enter your 15-character Device ID exactly as shown in the app'],
        [{ planId: 'pro', mode: 'desktop', machineId: CODE, name: '' }, 'Enter your name'],
        [{ planId: 'pro', mode: 'desktop', machineId: CODE, name: 'Smoke Buyer', phone: '12' }, 'Enter a valid phone number with country code'],
        [{ planId: 'pro', mode: 'desktop', machineId: CODE, name: 'Smoke Buyer', phone: '919999999999', email: 'nope' }, 'Enter a valid email'],
    ];
    for (const [body, msg] of bad) {
        const rr = await post('/api/checkout/create-order', body);
        ok(`create-order rejects: ${msg}`, rr.status === 400 && rr.data?.error === msg, rr.raw);
    }
    r = await post('/api/checkout/create-order', {
        planId: 'pro', mode: 'desktop', machineId: CODE,
        name: 'Smoke Buyer', phone: '919999999999', email: 'buyer@example.com',
    });
    ok('create-order fake-gateway happy path', r.status === 200 && /^AP[A-F0-9]{24}$/.test(r.data?.orderId ?? ''), r.raw);
    const orderId = r.data?.orderId;
    if (orderId) {
        r = await get(`/api/checkout/status?order_id=${orderId}`);
        ok('checkout status answers', r.status === 200 && typeof r.data?.status === 'string', r.raw);
        r = await post('/api/checkout/claim', { machineId: CODE, mode: 'desktop' });
        ok('checkout claim answers', r.status === 200 && typeof r.data?.found === 'boolean', r.raw);
    }

    family('legacy admin contract (must be unchanged)');
    r = await get('/api/admin/licenses', { token: 'bogus' });
    ok('old admin API still 401s unauthenticated', r.status === 401, r.raw);
    r = await post('/api/admin/login', { password: SEED_PASS });
    ok('old admin login still works', r.status === 200 && typeof r.data?.token === 'string', r.raw);
    // ADMIN-PORT section 3 additive seam: the console's detail modal + row-menu
    // extras drive the legacy routes with the Bearer JWT. Both gates must pass
    // and the legacy { total, rows } shape must stay.
    r = await get('/api/admin/licenses', { token: T });
    ok('legacy list accepts Bearer JWT (console seam)', r.status === 200 && Array.isArray(r.data?.rows) && typeof r.data?.total === 'number', r.raw);
    r = await get(`/api/admin/licenses?q=${encodeURIComponent(convKey)}`, { token: T });
    ok('legacy list q= search works', r.status === 200 && Array.isArray(r.data?.rows), r.raw);
    r = await get('/api/admin/devices', { token: T });
    ok('legacy devices accepts Bearer JWT', r.status === 200 && Array.isArray(r.data), r.raw);
    r = await get('/api/admin/config', { token: T });
    ok('legacy config accepts Bearer JWT', r.status === 200 && r.data && typeof r.data === 'object', r.raw);

    family('role walls');
    r = await get('/api/admins/list', { token: adminT });
    ok('non-super blocked from admins list', r.status === 403, r.raw);
    r = await post('/api/licenses/delete', { key: convKey }, { token: adminT });
    ok('non-super blocked from delete', r.status === 403, r.raw);
    r = await post('/api/licenses/delete', { key: convKey }, { token: T });
    ok('super delete works', r.status === 200 && r.data?.success === true, r.raw);
} catch (err) {
    fail++;
    failures.push(`harness crash :: ${err?.stack ?? err}`);
    console.error('\nHARNESS CRASH:', err);
} finally {
    shutdown();
}

console.log(`\n===============================`);
console.log(`smoke: ${pass} passed, ${fail} failed`);
if (failures.length) {
    console.log('failures:');
    for (const f of failures) console.log(`  - ${f}`);
}
console.log(`===============================`);
process.exit(fail === 0 ? 0 : 1);
