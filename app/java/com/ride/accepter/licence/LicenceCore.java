package com.ride.accepter.licence;

import com.ride.accepter.activation.DeviceIdentity;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The client half of the licence core - byte-for-byte mirrors of
 * license/src/core.ts (the single source of truth on the server).
 *
 * Any divergence here means activations fail with DEVICE_MISMATCH or tokens
 * stop verifying, so the mirrors are kept deliberately literal and are covered
 * by desktop test vectors (tools/licence-vectors.mjs <-> LicenceVector.java)
 * before the app is built.
 *
 * Pure Java only - no android.* - so everything runs under plain `java` on the
 * desktop for diffing against the TypeScript implementation.
 */
public final class LicenceCore {

    /** Fixed policy mirrors of core.ts DEFAULT_POLICY. */
    public static final long CLOCK_SKEW_MS = 5 * 60 * 1000;      // 5 min
    public static final long TOKEN_TTL_MS = 72 * 60 * 60 * 1000; // 72 h

    // mirrors of core.ts key format constants
    private static final String ALPHABET = "0123456789ABCDEFGHJKMNPQRSTVWXYZ";
    private static final String KEY_PREFIX = "RA";
    private static final int CHECK_CHARS = 2;
    private static final int BODY_CHARS = 23;
    private static final int CHECK_MOD = 1024;

    private LicenceCore() {
    }

    // ------------------------------------------------------------------
    // key format (mirror of core.ts normalizeKey / checksumChars / hashKey)
    // ------------------------------------------------------------------

    /** Two-character checksum over the key body (core.ts checksumChars). */
    public static String checksumChars(String body) {
        int sum = 0;
        int pow = 1;
        for (int i = body.length() - 1; i >= 0; i--) {
            sum = (sum + ALPHABET.indexOf(body.charAt(i)) * pow) % CHECK_MOD;
            pow = (pow * 3) % CHECK_MOD;
        }
        int check = (CHECK_MOD - sum) % CHECK_MOD;
        return "" + ALPHABET.charAt((check >> 5) & 31) + ALPHABET.charAt(check & 31);
    }

    /**
     * Mirror of core.ts normalizeKey: strip separators/prefix, fold look-alike
     * characters, verify the checksum. Throws IllegalArgumentException with the
     * same messages as the server's LicenseError('BAD_FORMAT').
     */
    public static String normalizeKey(String input) {
        String s = (input == null ? "" : input).toUpperCase().replaceAll("[^0-9A-Z]", "");
        s = s.replace('O', '0').replace('I', '1').replace('L', '1');
        if (s.startsWith(KEY_PREFIX) && s.length() > BODY_CHARS + CHECK_CHARS) {
            s = s.substring(KEY_PREFIX.length());
        }
        if (s.length() != BODY_CHARS + CHECK_CHARS) {
            throw new IllegalArgumentException("key has the wrong length");
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ALPHABET.indexOf(ch) < 0) {
                throw new IllegalArgumentException("key contains an invalid character: " + ch);
            }
        }
        String body = s.substring(0, BODY_CHARS);
        String check = s.substring(BODY_CHARS);
        if (!checksumChars(body).equals(check)) {
            throw new IllegalArgumentException("key checksum does not verify (typo?)");
        }
        return s;
    }

    /** Mirror of core.ts hashKey: sha256 hex of the normalized key body. */
    public static String hashKey(String input) {
        return sha256Hex(normalizeKey(input).getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Mirror of core.ts hashDeviceCode: sha256 hex of the domain-separated,
     * normalized device code. This is the "machine id" every licence and token
     * is bound to.
     */
    public static String hashDeviceCode(String code) {
        String normalized = DeviceIdentity.normalize(code);
        return sha256Hex(("ride-accepter/device-code/v1|" + normalized)
                .getBytes(StandardCharsets.UTF_8));
    }

    // ------------------------------------------------------------------
    // tokens (mirror of core.ts verifyToken)
    // ------------------------------------------------------------------

    /** The claims carried inside a signed token (core.ts TokenPayload). */
    public static final class Token {
        public final String jti;
        public final String kid;
        public final String hw; // sha256 of the device code - the machine binding
        public final long iat;
        public final long exp;

        Token(String jti, String kid, String hw, long iat, long exp) {
            this.jti = jti;
            this.kid = kid;
            this.hw = hw;
            this.iat = iat;
            this.exp = exp;
        }
    }

    private static final Pattern P_JTI = Pattern.compile("\"jti\"\\s*:\\s*\"([^\"]+)\"");
    private static final Pattern P_KID = Pattern.compile("\"kid\"\\s*:\\s*\"([^\"]+)\"");
    private static final Pattern P_HW = Pattern.compile("\"hw\"\\s*:\\s*\"([^\"]+)\"");
    private static final Pattern P_IAT = Pattern.compile("\"iat\"\\s*:\\s*(-?\\d+)");
    private static final Pattern P_EXP = Pattern.compile("\"exp\"\\s*:\\s*(-?\\d+)");
    private static final Pattern P_V = Pattern.compile("\"v\"\\s*:\\s*(\\d+)");

    /**
     * Verify a token offline - the ONLY check the app needs to reject
     * forgeries, foreign devices and expired grants (mirror of core.ts
     * verifyToken). Stronger state (revocation, plan changes) needs a refresh.
     *
     * @param publicKeyB64 base64 SPKI Ed25519 public key (pinned at build time)
     * @param now          epoch ms to evaluate expiry against
     * @throws IllegalArgumentException with the server's LicenseError messages
     */
    public static Token verifyToken(String token, String publicKeyB64, long now) {
        int dot = token == null ? -1 : token.lastIndexOf('.');
        if (dot <= 0) {
            throw new IllegalArgumentException("malformed token");
        }
        String body = token.substring(0, dot);
        String sigB64 = token.substring(dot + 1);

        // payload parse first (structure only; nothing is trusted until verify)
        String payloadJson;
        try {
            payloadJson = new String(b64uDecode(body), StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new IllegalArgumentException("token payload is not valid JSON");
        }
        String jti = find(P_JTI, payloadJson);
        String kid = find(P_KID, payloadJson);
        String hw = find(P_HW, payloadJson);
        String v = find(P_V, payloadJson);
        if (jti == null || jti.isEmpty() || hw == null || hw.isEmpty() || !"1".equals(v)) {
            throw new IllegalArgumentException("token payload is missing claims");
        }
        long iat = findLong(P_IAT, payloadJson, Long.MIN_VALUE);
        long exp = findLong(P_EXP, payloadJson, Long.MIN_VALUE);
        if (iat == Long.MIN_VALUE || exp == Long.MIN_VALUE) {
            throw new IllegalArgumentException("token payload is missing claims");
        }

        // signature check - reject BEFORE trusting any claim
        byte[] pub = spkiToRaw32(b64Decode(publicKeyB64));
        byte[] sig;
        byte[] msg;
        try {
            sig = b64uDecode(sigB64);
            msg = body.getBytes(StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new IllegalArgumentException("malformed token");
        }
        if (!Ed25519Verify.verify(pub, msg, sig)) {
            throw new IllegalArgumentException("token signature is not valid");
        }

        if (exp + CLOCK_SKEW_MS < now) {
            throw new IllegalArgumentException("token has expired");
        }
        if (iat - CLOCK_SKEW_MS > now) {
            throw new IllegalArgumentException("token is not valid yet");
        }
        return new Token(jti, kid, hw, iat, exp);
    }

    // ------------------------------------------------------------------
    // the entitlement rule - the client subset of core.ts evaluateEntitlement
    // ------------------------------------------------------------------

    /** Decision codes mirror core.ts LicenseErrorCode. */
    public static final String OK = "OK";
    public static final String REVOKED = "REVOKED";
    public static final String NOT_ACTIVATED = "NOT_ACTIVATED";
    public static final String EXPIRED = "EXPIRED";
    public static final String DEVICE_MISMATCH = "DEVICE_MISMATCH";
    public static final String TOKEN_EXPIRED = "TOKEN_EXPIRED";
    public static final String BAD_TOKEN = "BAD_TOKEN";

    /**
     * Client-side decision for an already-signature-verified token: licence
     * status/expiry plus the machine binding. Returns one of the codes above.
     */
    public static String evaluateLocal(String status, long licenceExpiresAt, Token token,
                                       String requestingHwidHash, long now) {
        if ("revoked".equals(status)) {
            return REVOKED;
        }
        if ("unused".equals(status)) {
            return NOT_ACTIVATED;
        }
        if (licenceExpiresAt <= 0) {
            return NOT_ACTIVATED;
        }
        if (licenceExpiresAt - now + CLOCK_SKEW_MS <= 0) {
            return EXPIRED;
        }
        // the machine binding: a token minted for another phone can never pass
        if (token != null && !token.hw.equals(requestingHwidHash)) {
            return DEVICE_MISMATCH;
        }
        if (token != null && token.exp + CLOCK_SKEW_MS < now) {
            return TOKEN_EXPIRED;
        }
        return OK;
    }

    // ------------------------------------------------------------------
    // small helpers
    // ------------------------------------------------------------------

    /** base64url with omitted padding (core.ts fromB64u). */
    public static byte[] b64uDecode(String s) {
        String t = s.replace('-', '+').replace('_', '/');
        int pad = (4 - (t.length() % 4)) % 4;
        StringBuilder sb = new StringBuilder(t);
        for (int i = 0; i < pad; i++) {
            sb.append('=');
        }
        return Base64.getDecoder().decode(sb.toString());
    }

    /** Extract the raw 32-byte key from a base64 SPKI Ed25519 public key. */
    public static byte[] spkiToRaw32(byte[] spki) {
        if (spki == null) {
            throw new IllegalArgumentException("missing public key");
        }
        if (spki.length == 32) {
            return spki; // already raw
        }
        if (spki.length != 44) {
            throw new IllegalArgumentException("bad public key encoding");
        }
        byte[] out = new byte[32];
        System.arraycopy(spki, 12, out, 0, 32);
        return out;
    }

    public static String sha256Hex(byte[] in) {
        try {
            byte[] d = MessageDigest.getInstance("SHA-256").digest(in);
            StringBuilder sb = new StringBuilder(d.length * 2);
            for (byte b : d) {
                sb.append(Character.forDigit((b >> 4) & 0xf, 16));
                sb.append(Character.forDigit(b & 0xf, 16));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new IllegalStateException("SHA-256 unavailable", e);
        }
    }

    private static byte[] b64Decode(String s) {
        return Base64.getDecoder().decode(s);
    }

    private static String find(Pattern p, String json) {
        Matcher m = p.matcher(json);
        return m.find() ? m.group(1) : null;
    }

    private static long findLong(Pattern p, String json, long dflt) {
        Matcher m = p.matcher(json);
        return m.find() ? Long.parseLong(m.group(1)) : dflt;
    }
}
