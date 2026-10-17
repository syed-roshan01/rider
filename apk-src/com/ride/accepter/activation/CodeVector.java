package com.ride.accepter.activation;

/**
 * Prints device-code test vectors as "androidId|brand|model|CODE" lines so they
 * can be diffed against license/src/core.ts. Not shipped to the device — this
 * is a build-time correctness harness for the identity derivation.
 */
public final class CodeVector {
    public static void main(String[] args) {
        String[][] vectors = {
                {"abc123", "Google", "Pixel 8"},
                {"abcdef0123456789", "samsung", "SM-N770F"},
                {"aaa", "Google", "Pixel 8"},
                {"aaa", "Samsung", "Galaxy S24"},
                {"", "", ""},
                {"xyz", "Xiaomi", "Redmi Note 12"},
        };
        for (String[] v : vectors) {
            System.out.println(v[0] + "|" + v[1] + "|" + v[2] + "|" +
                    DeviceIdentity.deviceCode(v[0], v[1], v[2]));
        }
        // normalisation must match normalizeDeviceCode() in core.ts
        String[] probes = {"O1l-i", "  7qk2m3xw8h  ", "RA-AAAAA-BBBBB-CCCCC-DDDDD-EEEEE"};
        for (String p : probes) {
            System.out.println("norm|" + p + "|" + DeviceIdentity.normalize(p));
        }
    }
}
