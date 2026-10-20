package com.ride.accepter.licence;

import com.ride.accepter.activation.DeviceIdentity;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Desktop correctness harness (never shipped to the device): runs the Java
 * licence primitives against a vector file produced by
 * tools/licence-vectors.mjs (which uses the TypeScript source of truth) and
 * reports PASS/FAIL per vector. Exit code 0 only when everything passes.
 *
 *   node tools\licence-vectors.mjs > build\licence-vectors.txt
 *   java -cp build\vtest com.ride.accepter.licence.LicenceVector build\licence-vectors.txt
 */
public final class LicenceVector {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("usage: LicenceVector <vector-file>");
            System.exit(2);
        }
        int pass = 0;
        int fail = 0;
        try (BufferedReader r = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = r.readLine()) != null) {
                if (line.trim().isEmpty() || line.startsWith("#")) {
                    continue;
                }
                String[] p = line.split("\\|", -1);
                String actual;
                try {
                    actual = run(p);
                } catch (Throwable t) {
                    actual = "ERR:" + (t.getMessage() == null ? t.getClass().getSimpleName() : t.getMessage());
                }
                String expected = p[p.length - 1];
                if (expected.equals(actual)) {
                    pass++;
                    System.out.println("PASS " + p[0]);
                } else {
                    fail++;
                    System.out.println("FAIL " + p[0] + "  expected=" + expected + "  actual=" + actual);
                }
            }
        }
        System.out.println("----");
        System.out.println("passed: " + pass + "   failed: " + fail);
        if (fail > 0) {
            System.exit(1);
        }
    }

    private static String run(String[] p) {
        String kind = p[0];
        if ("code".equals(kind)) {
            // code|androidId|brand|model|expected
            return DeviceIdentity.deviceCode(p[1], p[2], p[3]);
        }
        if ("normcode".equals(kind)) {
            // normcode|input|expected
            return DeviceIdentity.normalize(p[1]);
        }
        if ("normkey".equals(kind)) {
            // normkey|input|expected (normalized or ERR:<message>)
            try {
                return LicenceCore.normalizeKey(p[1]);
            } catch (IllegalArgumentException e) {
                return "ERR:" + e.getMessage();
            }
        }
        if ("hashkey".equals(kind)) {
            // hashkey|input|expected
            return LicenceCore.hashKey(p[1]);
        }
        if ("hashcode".equals(kind)) {
            // hashcode|input|expected
            return LicenceCore.hashDeviceCode(p[1]);
        }
        if ("tok".equals(kind)) {
            // tok|token|pubB64|hwHex|nowMs|status|licExpMs|expected
            long now = Long.parseLong(p[4]);
            try {
                LicenceCore.Token t = LicenceCore.verifyToken(p[1], p[2], now);
                return LicenceCore.evaluateLocal(p[5], Long.parseLong(p[6]), t, p[3], now);
            } catch (IllegalArgumentException e) {
                String msg = e.getMessage() == null ? "" : e.getMessage();
                return msg.contains("expired") ? LicenceCore.TOKEN_EXPIRED : LicenceCore.BAD_TOKEN;
            }
        }
        if ("sig".equals(kind)) {
            // sig|pubRawHex|msgHex|sigHex|expected(true/false) - raw Ed25519 vectors
            byte[] pub = hex(p[1]);
            byte[] msg = hex(p[2]);
            byte[] sig = hex(p[3]);
            return String.valueOf(Ed25519Verify.verify(pub, msg, sig));
        }
        throw new IllegalArgumentException("unknown vector kind: " + kind);
    }

    private static byte[] hex(String s) {
        byte[] out = new byte[s.length() / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = (byte) Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16);
        }
        return out;
    }
}
