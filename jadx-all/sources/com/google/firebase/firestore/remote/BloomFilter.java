package com.google.firebase.firestore.remote;

import android.util.Base64;
import com.google.protobuf.n;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class BloomFilter {
    private final int bitCount;
    private final n bitmap;
    private final int hashCount;
    private final MessageDigest md5HashMessageDigest;

    public static final class BloomFilterCreateException extends Exception {
        public BloomFilterCreateException(String str) {
            super(str);
        }
    }

    public BloomFilter(n nVar, int i10, int i11) {
        if (i10 < 0 || i10 >= 8) {
            throw new IllegalArgumentException(q.g("Invalid padding: ", i10));
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(q.g("Invalid hash count: ", i11));
        }
        if (nVar.size() > 0 && i11 == 0) {
            throw new IllegalArgumentException(q.g("Invalid hash count: ", i11));
        }
        if (nVar.size() == 0 && i10 != 0) {
            throw new IllegalArgumentException(q.g("Expected padding of 0 when bitmap length is 0, but got ", i10));
        }
        this.bitmap = nVar;
        this.hashCount = i11;
        this.bitCount = (nVar.size() * 8) - i10;
        this.md5HashMessageDigest = createMd5HashMessageDigest();
    }

    public static BloomFilter create(n nVar, int i10, int i11) throws BloomFilterCreateException {
        if (i10 < 0 || i10 >= 8) {
            throw new BloomFilterCreateException(q.g("Invalid padding: ", i10));
        }
        if (i11 < 0) {
            throw new BloomFilterCreateException(q.g("Invalid hash count: ", i11));
        }
        if (nVar.size() > 0 && i11 == 0) {
            throw new BloomFilterCreateException(q.g("Invalid hash count: ", i11));
        }
        if (nVar.size() != 0 || i10 == 0) {
            return new BloomFilter(nVar, i10, i11);
        }
        throw new BloomFilterCreateException(q.g("Expected padding of 0 when bitmap length is 0, but got ", i10));
    }

    private static MessageDigest createMd5HashMessageDigest() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e4);
        }
    }

    private int getBitIndex(long j10, long j11, int i10) {
        return (int) unsignedRemainder((j11 * ((long) i10)) + j10, this.bitCount);
    }

    private static long getLongLittleEndian(byte[] bArr, int i10) {
        long j10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            j10 |= (((long) bArr[i10 + i11]) & 255) << (i11 * 8);
        }
        return j10;
    }

    private boolean isBitSet(int i10) {
        return ((1 << (i10 % 8)) & this.bitmap.i(i10 / 8)) != 0;
    }

    private byte[] md5HashDigest(String str) {
        return this.md5HashMessageDigest.digest(str.getBytes(StandardCharsets.UTF_8));
    }

    private static long unsignedRemainder(long j10, long j11) {
        long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
        if (j12 < j11) {
            j11 = 0;
        }
        return j12 - j11;
    }

    public int getBitCount() {
        return this.bitCount;
    }

    public boolean mightContain(String str) {
        if (this.bitCount == 0) {
            return false;
        }
        byte[] bArrMd5HashDigest = md5HashDigest(str);
        if (bArrMd5HashDigest.length != 16) {
            throw new RuntimeException("Invalid md5 hash array length: " + bArrMd5HashDigest.length + " (expected 16)");
        }
        long longLittleEndian = getLongLittleEndian(bArrMd5HashDigest, 0);
        long longLittleEndian2 = getLongLittleEndian(bArrMd5HashDigest, 8);
        for (int i10 = 0; i10 < this.hashCount; i10++) {
            if (!isBitSet(getBitIndex(longLittleEndian, longLittleEndian2, i10))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "BloomFilter{hashCount=" + this.hashCount + ", size=" + this.bitCount + ", bitmap=\"" + Base64.encodeToString(this.bitmap.z(), 2) + "\"}";
    }
}
