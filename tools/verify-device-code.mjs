// Prints device-code test vectors as "androidId|brand|model|CODE" so they can be
// diffed against the Java implementation (app/java/.../CodeVector.java).
//
// The two MUST agree exactly: licence keys are bound to this code, so any
// divergence means every activation fails with DEVICE_MISMATCH.
//
//   node tools/verify-device-code.mjs
import { deriveDeviceCode, normalizeDeviceCode } from '../license/src/core.ts';

const vectors = [
    ['abc123', 'Google', 'Pixel 8'],
    ['abcdef0123456789', 'samsung', 'SM-N770F'],
    ['aaa', 'Google', 'Pixel 8'],
    ['aaa', 'Samsung', 'Galaxy S24'],
    ['', '', ''],
    ['xyz', 'Xiaomi', 'Redmi Note 12'],
];

for (const [androidId, brand, model] of vectors) {
    console.log(`${androidId}|${brand}|${model}|${deriveDeviceCode({ androidId, brand, model })}`);
}

// normalisation must match too (how a human types the code into the panel)
const probes = ['O1l-i', '  7qk2m3xw8h  ', 'RA-AAAAA-BBBBB-CCCCC-DDDDD-EEEEE'];
for (const p of probes) {
    console.log(`norm|${p}|${normalizeDeviceCode(p)}`);
}
