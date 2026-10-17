package com.ride.accepter.activation;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;
import java.util.TreeMap;

/**
 * Derives the short device code shown on the activation screen.
 *
 * MUST stay byte-for-byte compatible with `deriveDeviceCode()` in
 * license/src/core.ts — the server binds licence keys to this value, so any
 * divergence means every activation fails with DEVICE_MISMATCH. Keep the
 * domain separator ("ride-accepter/device-code/v1|") and the marker set in
 * lockstep with that function.
 *
 * Deliberately free of any android.* import so it can be run under plain `java`
 * and diffed against the server implementation (see CodeVector.java).
 */
public final class DeviceIdentity {

    /** Crockford base32 — no I, L, O, U. Same alphabet as the licence keys. */
    private static final String ALPHABET = "0123456789ABCDEFGHJKMNPQRSTVWXYZ";

    private DeviceIdentity() {
    }

    /**
     * Mirrors deriveHwid(): sorted "k=v" pairs joined by "|", then sha256 hex.
     *
     * Only STABLE markers. `buildFingerprint` and the OS version are
     * deliberately excluded — they change on every Android system update, which
     * would make a paying customer look like a brand new device and lock them
     * out of a licence they already bought.
     */
    public static String deriveHwid(String androidId, String brand, String model) {
        // Exactly these THREE keys. deriveHwid() in core.ts hashes every key it
        // is given, so adding one here (even as "") changes the canonical string
        // and therefore the code — which silently invalidates every licence
        // already bound to a device. Ask before touching this map.
        TreeMap<String, String> stable = new TreeMap<>();
        stable.put("androidId", n(androidId));
        stable.put("brand", n(brand));
        stable.put("model", n(model));

        StringBuilder canonical = new StringBuilder();
        boolean first = true;
        for (Map.Entry<String, String> e : stable.entrySet()) {
            if (!first) {
                canonical.append('|');
            }
            first = false;
            canonical.append(e.getKey()).append('=').append(e.getValue());
        }
        return sha256Hex(canonical.toString());
    }

    /** The code the customer reads out / screenshots, e.g. "7QK2M-3XW8H-PTD4R". */
    public static String deviceCode(String androidId, String brand, String model) {
        String stableDigest = deriveHwid(androidId, brand, model);
        byte[] digest = sha256(("ride-accepter/device-code/v1|" + stableDigest)
                .getBytes(StandardCharsets.UTF_8));

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            // 256 % 32 == 0, so (byte & 0xff) % 32 is unbiased over the alphabet
            s.append(ALPHABET.charAt((digest[i] & 0xff) % 32));
        }
        String flat = s.toString();
        return flat.substring(0, 5) + "-" + flat.substring(5, 10) + "-" + flat.substring(10, 15);
    }

    /** Read-out-loud tolerance, matching normalizeDeviceCode() in core.ts. */
    public static String normalize(String input) {
        if (input == null) {
            return "";
        }
        String s = input.toUpperCase().replaceAll("[^0-9A-Z]", "");
        return s.replace('O', '0').replace('I', '1').replace('L', '1');
    }

    private static String n(String v) {
        return v == null ? "" : v;
    }

    private static String sha256Hex(String in) {
        byte[] d = sha256(in.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder(d.length * 2);
        for (byte b : d) {
            sb.append(Character.forDigit((b >> 4) & 0xf, 16));
            sb.append(Character.forDigit(b & 0xf, 16));
        }
        return sb.toString();
    }

    private static byte[] sha256(byte[] in) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(in);
        } catch (Exception e) {
            throw new IllegalStateException("SHA-256 unavailable", e);
        }
    }
}
