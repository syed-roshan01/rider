package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a3 f4086a;

    static {
        f4086a = (z2.f4288e && z2.f4287d && !e.a()) ? new a3(1) : new a3(0);
    }

    public static int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                b10 = -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return d(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return e(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static String b(ByteBuffer byteBuffer, int i10, int i11) {
        a3 a3Var = f4086a;
        a3Var.getClass();
        if (byteBuffer.hasArray()) {
            return a3Var.T(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
        }
        return byteBuffer.isDirect() ? a3Var.U(byteBuffer, i10, i11) : n2.H(byteBuffer, i10, i11);
    }

    public static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new b3(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }

    public static int d(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int e(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    public static boolean f(byte[] bArr, int i10, int i11) {
        return f4086a.W(0, bArr, i10, i11) == 0;
    }
}
