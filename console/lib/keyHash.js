// Client-side mirror of the key-addressing helpers in
// supabase/functions/_shared/license.ts (normalizeKey + hashKey).
//
// Used ONLY to address the admin API — /api/admin/licenses/{keyHash}/{action}
// routes by the key hash, and the console's list rows carry the plaintext key.
// No key material is ever minted or verified in the browser; the normalization
// and the hash preimage below must stay byte-identical to the shared engine
// module so the computed hash matches licenses.key_hash.

// Crockford base32 — no I, L, O, U, so keys are unambiguous when read aloud.
const ALPHABET = '0123456789ABCDEFGHJKMNPQRSTVWXYZ';
const CHECK_CHARS = 2;
const BODY_CHARS = 23; // 23 * 5 = 115 bits of entropy (the last 2 chars are the checksum)
const KEY_PREFIX = 'RA';
const CHECK_MOD = 1024; // 2^10 -> exactly two base-32 check characters

// Two-character checksum over the key body (see the shared engine module).
function checksumChars(body) {
    let sum = 0;
    let pow = 1;
    for (let i = body.length - 1; i >= 0; i--) {
        sum = (sum + ALPHABET.indexOf(body[i]) * pow) % CHECK_MOD;
        pow = (pow * 3) % CHECK_MOD;
    }
    const check = (CHECK_MOD - sum) % CHECK_MOD;
    return ALPHABET[(check >> 5) & 31] + ALPHABET[check & 31];
}

// Normalize user-typed/displayed input: strip separators/prefix, upper-case,
// fold the characters Crockford deliberately excludes (O->0, I/L->1).
// Throws when the checksum does not verify.
export function normalizeKey(input) {
    let s = input.toUpperCase().replace(/[^0-9A-Z]/g, '');
    s = s.replace(/O/g, '0').replace(/[IL]/g, '1');
    if (s.startsWith(KEY_PREFIX) && s.length > BODY_CHARS + CHECK_CHARS) {
        s = s.slice(KEY_PREFIX.length);
    }
    if (s.length !== BODY_CHARS + CHECK_CHARS) {
        throw new Error('BAD_FORMAT');
    }
    const body = s.slice(0, BODY_CHARS);
    const check = s.slice(BODY_CHARS);
    for (const ch of s) {
        if (!ALPHABET.includes(ch)) {
            throw new Error('BAD_FORMAT');
        }
    }
    if (checksumChars(body) !== check) {
        throw new Error('BAD_FORMAT');
    }
    return s;
}

// sha256(normalizeKey(input)) as lowercase hex — the API's {key} path param.
export async function hashKey(input) {
    const preimage = new TextEncoder().encode(normalizeKey(input));
    const digest = await crypto.subtle.digest('SHA-256', preimage);
    return [...new Uint8Array(digest)].map(b => b.toString(16).padStart(2, '0')).join('');
}
