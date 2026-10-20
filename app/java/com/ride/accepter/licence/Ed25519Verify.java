package com.ride.accepter.licence;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Pure-Java Ed25519 (RFC 8032) signature VERIFICATION - no signing, no keys
 * generated, no dependencies beyond the JDK. Deliberately verify-only: the app
 * must be able to check a token but never mint one.
 *
 * Why hand-rolled: java.security "Ed25519" only exists from Android API 33,
 * and this app supports down to API 26. BigInteger arithmetic is slow (~tens of
 * milliseconds per verify) but the caller caches verdicts, so it never runs in
 * a hot path.
 *
 * Cross-checked against Node's crypto (see tools/licence-vectors.mjs and
 * LicenceVector.java) before it ever shipped.
 */
public final class Ed25519Verify {

    // p = 2^255 - 19
    private static final BigInteger P =
            BigInteger.valueOf(2).pow(255).subtract(BigInteger.valueOf(19));
    // group order
    private static final BigInteger L = new BigInteger(
            "7237005577332262213973186563042994240857116359379907606001950938285454250989");
    // d = -121665/121666 mod p
    private static final BigInteger D = new BigInteger("37095705934669439343138083508754565189542113879843219016388785533085940283555");
    // sqrt(-1) mod p
    private static final BigInteger SQRT_M1 = new BigInteger(
            "19681161376707505956807079304988542015446066515923890162744021073123829784752");
    // base point x, y
    private static final BigInteger BX = new BigInteger(
            "15112221349535400772501151409588531511454012693041857206046113283949847762202");
    private static final BigInteger BY = new BigInteger(
            "46316835694926478169428394003475163141307993866256225615783033603165251855960");

    private Ed25519Verify() {
    }

    /** One curve point in extended twisted-Edwards coordinates (x,y,z,t). */
    private static final class Pt {
        final BigInteger x, y, z, t;

        Pt(BigInteger x, BigInteger y, BigInteger z, BigInteger t) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.t = t;
        }
    }

    private static final Pt BASE = new Pt(BX, BY, BigInteger.ONE, BX.multiply(BY).mod(P));
    private static final Pt NEUTRAL =
            new Pt(BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO);

    private static BigInteger mod(BigInteger a) {
        BigInteger r = a.mod(P);
        return r;
    }

    private static Pt add(Pt a, Pt b) {
        // Hisil-et-al addition for a = -1, extended coordinates
        BigInteger aa = mod(a.y.subtract(a.x).multiply(b.y.subtract(b.x)));
        BigInteger bb = mod(a.y.add(a.x).multiply(b.y.add(b.x)));
        BigInteger cc = mod(a.t.multiply(b.t).multiply(D).multiply(BigInteger.valueOf(2)));
        BigInteger dd = mod(a.z.multiply(b.z).multiply(BigInteger.valueOf(2)));
        BigInteger e = mod(bb.subtract(aa));
        BigInteger f = mod(dd.subtract(cc));
        BigInteger g = mod(dd.add(cc));
        BigInteger h = mod(bb.add(aa));
        return new Pt(mod(e.multiply(f)), mod(g.multiply(h)), mod(f.multiply(g)), mod(e.multiply(h)));
    }

    private static Pt dbl(Pt a) {
        BigInteger aa = mod(a.x.multiply(a.x));
        BigInteger bb = mod(a.y.multiply(a.y));
        BigInteger cc = mod(a.z.multiply(a.z).multiply(BigInteger.valueOf(2)));
        BigInteger dd = mod(aa.negate());
        BigInteger ee = mod(a.x.add(a.y).multiply(a.x.add(a.y)).subtract(aa).subtract(bb));
        BigInteger gg = mod(dd.add(bb));
        BigInteger ff = mod(gg.subtract(cc));
        BigInteger hh = mod(dd.subtract(bb));
        return new Pt(mod(ee.multiply(ff)), mod(gg.multiply(hh)), mod(ff.multiply(gg)), mod(ee.multiply(hh)));
    }

    private static Pt mul(Pt a, BigInteger k) {
        Pt r = NEUTRAL;
        Pt base = a;
        byte[] bits = k.toByteArray(); // big-endian two's complement
        for (byte b : bits) {
            for (int i = 7; i >= 0; i--) {
                r = dbl(r);
                if (((b >> i) & 1) != 0) {
                    r = add(r, base);
                }
            }
        }
        return r;
    }

    private static boolean eq(Pt a, Pt b) {
        // compare in projective form: x1*z2 == x2*z1 and y1*z2 == y2*z1
        return mod(a.x.multiply(b.z)).equals(mod(b.x.multiply(a.z)))
                && mod(a.y.multiply(b.z)).equals(mod(b.y.multiply(a.z)));
    }

    /**
     * Decode a 32-byte compressed point. Returns null when the encoding is not
     * a valid curve point (RFC 8032 decoding checks included).
     */
    private static Pt decodePoint(byte[] p32) {
        if (p32.length != 32) {
            return null;
        }
        byte[] yb = p32.clone();
        int sign = (yb[31] >> 7) & 1;
        yb[31] &= 0x7f;
        BigInteger y = leInt(yb);
        if (y.compareTo(P) >= 0) {
            return null;
        }
        BigInteger y2 = mod(y.multiply(y));
        BigInteger u = mod(y2.subtract(BigInteger.ONE));
        BigInteger v = mod(y2.multiply(D).add(BigInteger.ONE));
        BigInteger x2 = mod(u.multiply(v.modInverse(P)));
        BigInteger x = mod(x2.modPow(P.add(BigInteger.valueOf(3)).divide(BigInteger.valueOf(8)), P));
        if (!mod(x.multiply(x)).equals(x2)) {
            x = mod(x.multiply(SQRT_M1));
        }
        if (!mod(x.multiply(x)).equals(x2)) {
            return null;
        }
        if (x.signum() == 0 && sign == 1) {
            return null;
        }
        if (x.testBit(0) != (sign == 1)) {
            x = mod(x.negate());
        }
        return new Pt(x, y, BigInteger.ONE, mod(x.multiply(y)));
    }

    private static BigInteger leInt(byte[] b) {
        byte[] r = new byte[b.length + 1];
        for (int i = 0; i < b.length; i++) {
            r[b.length - i] = b[i]; // LE -> BE with a sign byte on top
        }
        return new BigInteger(r);
    }

    private static byte[] sha512(byte[]... parts) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            for (byte[] p : parts) {
                md.update(p);
            }
            return md.digest();
        } catch (Exception e) {
            throw new IllegalStateException("SHA-512 unavailable", e);
        }
    }

    private static BigInteger modL(byte[] h) {
        // RFC 8032: byte strings -> scalars are little-endian
        byte[] r = new byte[h.length + 1];
        for (int i = 0; i < h.length; i++) {
            r[h.length - i] = h[i];
        }
        return new BigInteger(r).mod(L);
    }

    /**
     * Verify an Ed25519 signature (RFC 8032) over {@code msg}.
     *
     * @param pub32 32-byte compressed public key (the raw key, not SPKI)
     * @param msg   the exact signed bytes
     * @param sig64 64-byte signature R||S
     */
    public static boolean verify(byte[] pub32, byte[] msg, byte[] sig64) {
        try {
            if (pub32 == null || pub32.length != 32 || sig64 == null || sig64.length != 64) {
                return false;
            }
            byte[] rB = new byte[32];
            byte[] sB = new byte[32];
            System.arraycopy(sig64, 0, rB, 0, 32);
            System.arraycopy(sig64, 32, sB, 0, 32);

            BigInteger s = leInt(sB);
            if (s.compareTo(L) >= 0) { // malleability guard
                return false;
            }
            Pt a = decodePoint(pub32);
            Pt r = decodePoint(rB);
            if (a == null || r == null) {
                return false;
            }
            // h = SHA-512(R || A || M) mod L   (over the compressed encodings)
            BigInteger h = modL(sha512(rB, pub32, msg));
            // strong check with cofactor: [8s]B == [8]R + [8h]A
            BigInteger eight = BigInteger.valueOf(8);
            Pt left = mul(BASE, s.multiply(eight).mod(L));
            Pt right = add(mul(r, eight), mul(a, h.multiply(eight).mod(L)));
            return eq(left, right);
        } catch (Throwable t) {
            return false;
        }
    }
}
