// Mints one licence key and prints the SQL to insert it.
//   node tools\make-license.mjs [planType] [deviceCode]
// planType: DAY | WEEK | HALF_MONTH | MONTH | YEAR   (default MONTH)
// deviceCode: optional, pre-binds the key to one device (recommended).
import { pathToFileURL } from 'node:url';
import { resolve } from 'node:path';

const here = pathToFileURL(resolve(import.meta.dirname, '..', 'supabase', 'functions', '_shared', 'license.ts')).href;
const L = await import(here);

const planType = (process.argv[2] ?? 'MONTH').toUpperCase();
const deviceCode = process.argv[3] ?? '';

if (!(planType in L.PLAN_DAYS)) {
    console.error('unknown planType: ' + planType + '  (use DAY|WEEK|HALF_MONTH|MONTH|YEAR)');
    process.exit(1);
}

const key = L.generateKey();
const keyHash = L.hashKey(key);
const keyPrefix = L.keyPrefixOf(key);
const durationDays = L.PLAN_DAYS[planType];
const bound = deviceCode ? [L.hashDeviceCode(L.normalizeDeviceCode(deviceCode))] : [];

console.log('key        : ' + key);
console.log('keyHash    : ' + keyHash);
console.log('keyPrefix  : ' + keyPrefix);
console.log('planType   : ' + planType + '  (' + durationDays + ' days)');
console.log('bound      : ' + (bound.length ? bound[0] : '(none - first device to activate claims it)'));
console.log('');
console.log('-- paste into the Supabase SQL editor --');
console.log("insert into licenses");
console.log("  (key_hash, key_sealed, key_prefix, plan_type, duration_days, status,");
console.log("   max_devices, bound_device_code_hashes, note, created_by)");
console.log("values");
console.log("  ('" + keyHash + "', '', '" + keyPrefix + "', '" + planType + "', " + durationDays + ",");
console.log("   'unused', 1, " + (bound.length ? "array['" + bound[0] + "']" : "array[]::text[]") + ", 'test key', 'cli');");
console.log('');
console.log('Keep the key itself somewhere safe if you need to hand it to a customer.');
console.log('key_sealed is left empty here; the admin dashboard seals it on create.');
