package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a3 extends n2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4060c;

    public /* synthetic */ a3(int i10) {
        this.f4060c = i10;
    }

    public static int X(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            a3 a3Var = c3.f4086a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return c3.d(i10, z2.g(bArr, j10));
        }
        if (i11 == 2) {
            return c3.e(i10, z2.g(bArr, j10), z2.g(bArr, j10 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[LOOP:2: B:25:0x005e->B:29:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0072 A[SYNTHETIC] */
    public final String T(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte b10;
        int i14;
        byte b11;
        switch (this.f4060c) {
            case 0:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i15 = i10 + i11;
                char[] cArr = new char[i11];
                int i16 = 0;
                while (i10 < i15) {
                    byte b12 = bArr[i10];
                    if (!n2.b(b12)) {
                        i12 = i16;
                        while (i10 < i15) {
                            i13 = i10 + 1;
                            b10 = bArr[i10];
                            if (n2.b(b10)) {
                                i14 = i12 + 1;
                                cArr[i12] = (char) b10;
                                while (i13 < i15) {
                                    b11 = bArr[i13];
                                    if (n2.b(b11)) {
                                        i13++;
                                        cArr[i14] = (char) b11;
                                        i14++;
                                    } else {
                                        i12 = i14;
                                        i10 = i13;
                                    }
                                }
                                i12 = i14;
                                i10 = i13;
                            } else if (b10 < -32) {
                                if (i13 < i15) {
                                    throw a1.c();
                                }
                                i10 += 2;
                                n2.c(b10, bArr[i13], cArr, i12);
                                i12++;
                            } else if (b10 < -16) {
                                if (i13 < i15 - 1) {
                                    throw a1.c();
                                }
                                int i17 = i10 + 2;
                                i10 += 3;
                                n2.d(b10, bArr[i13], bArr[i17], cArr, i12);
                                i12++;
                            } else {
                                if (i13 < i15 - 2) {
                                    throw a1.c();
                                }
                                byte b13 = bArr[i13];
                                int i18 = i10 + 3;
                                byte b14 = bArr[i10 + 2];
                                i10 += 4;
                                n2.a(b10, b13, b14, bArr[i18], cArr, i12);
                                i12 += 2;
                            }
                        }
                        return new String(cArr, 0, i12);
                    }
                    i10++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
                i12 = i16;
                while (i10 < i15) {
                    i13 = i10 + 1;
                    b10 = bArr[i10];
                    if (n2.b(b10)) {
                        i14 = i12 + 1;
                        cArr[i12] = (char) b10;
                        while (i13 < i15) {
                            b11 = bArr[i13];
                            if (n2.b(b11)) {
                                i12 = i14;
                                i10 = i13;
                            } else {
                                i13++;
                                cArr[i14] = (char) b11;
                                i14++;
                            }
                        }
                        i12 = i14;
                        i10 = i13;
                    } else if (b10 < -32) {
                        if (i13 < i15) {
                            throw a1.c();
                        }
                        i10 += 2;
                        n2.c(b10, bArr[i13], cArr, i12);
                        i12++;
                    } else if (b10 < -16) {
                        if (i13 < i15 - 1) {
                            throw a1.c();
                        }
                        int i19 = i10 + 2;
                        i10 += 3;
                        n2.d(b10, bArr[i13], bArr[i19], cArr, i12);
                        i12++;
                    } else {
                        if (i13 < i15 - 2) {
                            throw a1.c();
                        }
                        byte b15 = bArr[i13];
                        int i110 = i10 + 3;
                        byte b16 = bArr[i10 + 2];
                        i10 += 4;
                        n2.a(b10, b15, b16, bArr[i110], cArr, i12);
                        i12 += 2;
                    }
                }
                return new String(cArr, 0, i12);
            default:
                Charset charset = y0.f4276a;
                String str = new String(bArr, i10, i11, charset);
                if (str.contains("\ufffd") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                    throw a1.c();
                }
                return str;
        }
    }

    public final String U(ByteBuffer byteBuffer, int i10, int i11) throws a1 {
        long j10;
        switch (this.f4060c) {
            case 0:
                return n2.H(byteBuffer, i10, i11);
            default:
                if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                long j11 = z2.f4286c.j(byteBuffer, z2.f4290g) + ((long) i10);
                long j12 = ((long) i11) + j11;
                char[] cArr = new char[i11];
                int i12 = 0;
                while (true) {
                    j10 = 1;
                    if (j11 < j12) {
                        byte bE = z2.f4286c.e(j11);
                        if (n2.b(bE)) {
                            j11++;
                            cArr[i12] = (char) bE;
                            i12++;
                        }
                    }
                }
                int i13 = i12;
                while (j11 < j12) {
                    long j13 = j11 + j10;
                    y2 y2Var = z2.f4286c;
                    byte bE2 = y2Var.e(j11);
                    if (n2.b(bE2)) {
                        int i14 = i13 + 1;
                        cArr[i13] = (char) bE2;
                        while (j13 < j12) {
                            byte bE3 = z2.f4286c.e(j13);
                            if (n2.b(bE3)) {
                                j13 += j10;
                                cArr[i14] = (char) bE3;
                                i14++;
                            } else {
                                i13 = i14;
                                j11 = j13;
                            }
                        }
                        i13 = i14;
                        j11 = j13;
                    } else {
                        if (!(bE2 < -32)) {
                            if (bE2 < -16) {
                                if (j13 >= j12 - j10) {
                                    throw a1.c();
                                }
                                long j14 = j11 + 2;
                                j11 += 3;
                                n2.d(bE2, y2Var.e(j13), y2Var.e(j14), cArr, i13);
                                i13++;
                            } else {
                                if (j13 >= j12 - 2) {
                                    throw a1.c();
                                }
                                byte bE4 = y2Var.e(j13);
                                long j15 = j11 + 3;
                                byte bE5 = y2Var.e(j11 + 2);
                                j11 += 4;
                                n2.a(bE2, bE4, bE5, y2Var.e(j15), cArr, i13);
                                i13 += 2;
                            }
                        } else {
                            if (j13 >= j12) {
                                throw a1.c();
                            }
                            j11 += 2;
                            n2.c(bE2, y2Var.e(j13), cArr, i13);
                            i13++;
                        }
                    }
                    j10 = 1;
                }
                return new String(cArr, 0, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0245  */
    /* JADX WARN: Code duplicated, block: B:129:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:71:0x018e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0191  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0207  */
    public final int V(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        char cCharAt;
        int i13;
        int i14;
        char cCharAt2;
        char cCharAt3;
        long j10;
        int i15;
        char cCharAt4;
        char c10 = '\u0800';
        char c11 = '\u0080';
        switch (this.f4060c) {
            case 0:
                int length = charSequence.length();
                int i16 = i11 + i10;
                int i17 = 0;
                while (i17 < length) {
                    int i18 = i17 + i10;
                    if (i18 >= i16 || (cCharAt3 = charSequence.charAt(i17)) >= '\u0080') {
                        if (i17 == length) {
                            return i10 + length;
                        }
                        i12 = i10 + i17;
                        while (i17 < length) {
                            cCharAt = charSequence.charAt(i17);
                            if (cCharAt >= '\u0080' && i12 < i16) {
                                bArr[i12] = (byte) cCharAt;
                                i12++;
                            } else if (cCharAt >= '\u0800' && i12 <= i16 - 2) {
                                int i19 = i12 + 1;
                                bArr[i12] = (byte) ((cCharAt >>> 6) | 960);
                                i12 += 2;
                                bArr[i19] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < '\ud800' && '\udfff' >= cCharAt) || i12 > i16 - 3) {
                                    if (i12 > i16 - 4) {
                                        if ('\ud800' > cCharAt && cCharAt <= '\udfff' && ((i13 = i17 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt, charSequence.charAt(i13)))) {
                                            throw new b3(i17, length);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i12);
                                    }
                                    i14 = i17 + 1;
                                    if (i14 != charSequence.length()) {
                                        cCharAt2 = charSequence.charAt(i14);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                                            bArr[i12] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i12 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i20 = i12 + 3;
                                            bArr[i12 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i12 += 4;
                                            bArr[i20] = (byte) ((codePoint & 63) | 128);
                                            i17 = i14;
                                        } else {
                                            i17 = i14;
                                        }
                                    }
                                    throw new b3(i17 - 1, length);
                                }
                                bArr[i12] = (byte) ((cCharAt >>> '\f') | 480);
                                int i21 = i12 + 2;
                                bArr[i12 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i12 += 3;
                                bArr[i21] = (byte) ((cCharAt & '?') | 128);
                            }
                            i17++;
                        }
                        return i12;
                    }
                    bArr[i18] = (byte) cCharAt3;
                    i17++;
                }
                if (i17 == length) {
                    return i10 + length;
                }
                i12 = i10 + i17;
                while (i17 < length) {
                    cCharAt = charSequence.charAt(i17);
                    if (cCharAt >= '\u0080') {
                        if (cCharAt >= '\u0800') {
                            if (cCharAt < '\ud800') {
                                bArr[i12] = (byte) ((cCharAt >>> '\f') | 480);
                                int i22 = i12 + 2;
                                bArr[i12 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i12 += 3;
                                bArr[i22] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i12] = (byte) ((cCharAt >>> '\f') | 480);
                                int i23 = i12 + 2;
                                bArr[i12 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i12 += 3;
                                bArr[i23] = (byte) ((cCharAt & '?') | 128);
                            }
                            if (i12 > i16 - 4) {
                                if ('\ud800' > cCharAt) {
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i12);
                            }
                            i14 = i17 + 1;
                            if (i14 != charSequence.length()) {
                                cCharAt2 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                    bArr[i12] = (byte) ((codePoint2 >>> 18) | 240);
                                    bArr[i12 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i24 = i12 + 3;
                                    bArr[i12 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i12 += 4;
                                    bArr[i24] = (byte) ((codePoint2 & 63) | 128);
                                    i17 = i14;
                                } else {
                                    i17 = i14;
                                }
                            }
                            throw new b3(i17 - 1, length);
                        }
                        if (cCharAt < '\ud800') {
                            bArr[i12] = (byte) ((cCharAt >>> '\f') | 480);
                            int i25 = i12 + 2;
                            bArr[i12 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i12 += 3;
                            bArr[i25] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i12] = (byte) ((cCharAt >>> '\f') | 480);
                            int i26 = i12 + 2;
                            bArr[i12 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i12 += 3;
                            bArr[i26] = (byte) ((cCharAt & '?') | 128);
                        }
                        if (i12 > i16 - 4) {
                            if ('\ud800' > cCharAt) {
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i12);
                        }
                        i14 = i17 + 1;
                        if (i14 != charSequence.length()) {
                            cCharAt2 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                                int codePoint3 = Character.toCodePoint(cCharAt, cCharAt2);
                                bArr[i12] = (byte) ((codePoint3 >>> 18) | 240);
                                bArr[i12 + 1] = (byte) (((codePoint3 >>> 12) & 63) | 128);
                                int i27 = i12 + 3;
                                bArr[i12 + 2] = (byte) (((codePoint3 >>> 6) & 63) | 128);
                                i12 += 4;
                                bArr[i27] = (byte) ((codePoint3 & 63) | 128);
                                i17 = i14;
                            } else {
                                i17 = i14;
                            }
                        }
                        throw new b3(i17 - 1, length);
                    }
                    if (cCharAt >= '\u0800') {
                        if (cCharAt < '\ud800') {
                            bArr[i12] = (byte) ((cCharAt >>> '\f') | 480);
                            int i28 = i12 + 2;
                            bArr[i12 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i12 += 3;
                            bArr[i28] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i12] = (byte) ((cCharAt >>> '\f') | 480);
                            int i29 = i12 + 2;
                            bArr[i12 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i12 += 3;
                            bArr[i29] = (byte) ((cCharAt & '?') | 128);
                        }
                        if (i12 > i16 - 4) {
                            if ('\ud800' > cCharAt) {
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i12);
                        }
                        i14 = i17 + 1;
                        if (i14 != charSequence.length()) {
                            cCharAt2 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                                int codePoint4 = Character.toCodePoint(cCharAt, cCharAt2);
                                bArr[i12] = (byte) ((codePoint4 >>> 18) | 240);
                                bArr[i12 + 1] = (byte) (((codePoint4 >>> 12) & 63) | 128);
                                int i210 = i12 + 3;
                                bArr[i12 + 2] = (byte) (((codePoint4 >>> 6) & 63) | 128);
                                i12 += 4;
                                bArr[i210] = (byte) ((codePoint4 & 63) | 128);
                                i17 = i14;
                            } else {
                                i17 = i14;
                            }
                        }
                        throw new b3(i17 - 1, length);
                    }
                    if (cCharAt < '\ud800') {
                        bArr[i12] = (byte) ((cCharAt >>> '\f') | 480);
                        int i211 = i12 + 2;
                        bArr[i12 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i12 += 3;
                        bArr[i211] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i12] = (byte) ((cCharAt >>> '\f') | 480);
                        int i212 = i12 + 2;
                        bArr[i12 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i12 += 3;
                        bArr[i212] = (byte) ((cCharAt & '?') | 128);
                    }
                    if (i12 > i16 - 4) {
                        if ('\ud800' > cCharAt) {
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i12);
                    }
                    i14 = i17 + 1;
                    if (i14 != charSequence.length()) {
                        cCharAt2 = charSequence.charAt(i14);
                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                            int codePoint5 = Character.toCodePoint(cCharAt, cCharAt2);
                            bArr[i12] = (byte) ((codePoint5 >>> 18) | 240);
                            bArr[i12 + 1] = (byte) (((codePoint5 >>> 12) & 63) | 128);
                            int i213 = i12 + 3;
                            bArr[i12 + 2] = (byte) (((codePoint5 >>> 6) & 63) | 128);
                            i12 += 4;
                            bArr[i213] = (byte) ((codePoint5 & 63) | 128);
                            i17 = i14;
                        } else {
                            i17 = i14;
                        }
                    }
                    throw new b3(i17 - 1, length);
                    i17++;
                }
                return i12;
            default:
                long j11 = i10;
                long j12 = ((long) i11) + j11;
                int length2 = charSequence.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i30 = 0;
                while (i30 < length2 && (cCharAt4 = charSequence.charAt(i30)) < '\u0080') {
                    z2.o(bArr, j11, (byte) cCharAt4);
                    i30++;
                    j11++;
                }
                if (i30 != length2) {
                    while (i30 < length2) {
                        char cCharAt5 = charSequence.charAt(i30);
                        if (cCharAt5 < c11 && j11 < j12) {
                            z2.o(bArr, j11, (byte) cCharAt5);
                            j10 = j12;
                            j11++;
                        } else if (cCharAt5 < c10 && j11 <= j12 - 2) {
                            long j13 = j11 + 1;
                            z2.o(bArr, j11, (byte) ((cCharAt5 >>> 6) | 960));
                            j11 += 2;
                            z2.o(bArr, j13, (byte) ((cCharAt5 & '?') | c11));
                            j10 = j12;
                        } else {
                            if ((cCharAt5 >= '\ud800' && '\udfff' >= cCharAt5) || j11 > j12 - 3) {
                                j10 = j12;
                                if (j11 > j10 - 4) {
                                    if ('\ud800' <= cCharAt5 && cCharAt5 <= '\udfff' && ((i15 = i30 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, charSequence.charAt(i15)))) {
                                        throw new b3(i30, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j11);
                                }
                                int i31 = i30 + 1;
                                if (i31 != length2) {
                                    char cCharAt6 = charSequence.charAt(i31);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint6 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        z2.o(bArr, j11, (byte) ((codePoint6 >>> 18) | 240));
                                        z2.o(bArr, j11 + 1, (byte) (((codePoint6 >>> 12) & 63) | 128));
                                        long j14 = 3 + j11;
                                        z2.o(bArr, j11 + 2, (byte) (((codePoint6 >>> 6) & 63) | 128));
                                        j11 += 4;
                                        z2.o(bArr, j14, (byte) ((codePoint6 & 63) | 128));
                                        i30 = i31;
                                    } else {
                                        i30 = i31;
                                    }
                                }
                                throw new b3(i30 - 1, length2);
                            }
                            z2.o(bArr, j11, (byte) ((cCharAt5 >>> '\f') | 480));
                            j10 = j12;
                            long j15 = j11 + 2;
                            z2.o(bArr, j11 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j11 += 3;
                            z2.o(bArr, j15, (byte) ((cCharAt5 & '?') | 128));
                        }
                        i30++;
                        j12 = j10;
                        c10 = '\u0800';
                        c11 = '\u0080';
                    }
                }
                return (int) j11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0150  */
    /* JADX WARN: Code duplicated, block: B:111:0x0171  */
    /* JADX WARN: Code duplicated, block: B:114:0x0179  */
    /* JADX WARN: Code duplicated, block: B:116:0x0185  */
    /* JADX WARN: Code duplicated, block: B:118:0x018e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0195  */
    /* JADX WARN: Code duplicated, block: B:229:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0124  */
    /* JADX WARN: Code duplicated, block: B:86:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0132  */
    /* JADX WARN: Code duplicated, block: B:93:0x013d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0213, code lost:
    
        if (r26[r0] > (-65)) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (com.google.protobuf.z2.g(r26, r14) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x025b, code lost:
    
        if (r26[r0] > r10) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r14 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (com.google.protobuf.z2.g(r26, r14) > (-65)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int W(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        byte b10;
        int i13;
        byte b11;
        byte b12;
        byte b13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iX;
        long j10;
        byte bG;
        long j11;
        byte bG2;
        long j12;
        byte bG3;
        long j13;
        int i18 = i11;
        byte b14 = -62;
        byte b15 = -16;
        switch (this.f4060c) {
            case 0:
                if (i10 != 0) {
                    if (i18 >= i12) {
                        return i10;
                    }
                    byte b16 = (byte) i10;
                    if (b16 < -32) {
                        if (b16 >= -62) {
                            int i19 = i18 + 1;
                            if (bArr[i18] <= -65) {
                                i18 = i19;
                            }
                        }
                        return -1;
                    }
                    if (b16 < -16) {
                        byte b17 = (byte) (~(i10 >> 8));
                        if (b17 == 0) {
                            i14 = i18 + 1;
                            b13 = bArr[i18];
                            if (i14 >= i12) {
                                return c3.d(b16, b13);
                            }
                            b12 = -65;
                        } else {
                            b12 = -65;
                            b13 = b17;
                            i14 = i18;
                        }
                        if (b13 <= b12 && ((b16 != -32 || b13 >= -96) && (b16 != -19 || b13 < -96))) {
                            i18 = i14 + 1;
                            break;
                        }
                        return -1;
                    }
                    byte b18 = (byte) (~(i10 >> 8));
                    if (b18 == 0) {
                        i13 = i18 + 1;
                        b18 = bArr[i18];
                        if (i13 >= i12) {
                            return c3.d(b16, b18);
                        }
                        b10 = 0;
                    } else {
                        b10 = (byte) (i10 >> 16);
                        i13 = i18;
                    }
                    if (b10 == 0) {
                        int i20 = i13 + 1;
                        byte b19 = bArr[i13];
                        if (i20 >= i12) {
                            return c3.e(b16, b18, b19);
                        }
                        b11 = -65;
                        b10 = b19;
                        i13 = i20;
                    } else {
                        b11 = -65;
                    }
                    if (b18 <= b11) {
                        if ((((b18 + 112) + (b16 << 28)) >> 30) == 0 && b10 <= b11) {
                            i18 = i13 + 1;
                        }
                        break;
                    }
                    return -1;
                }
                while (i18 < i12 && bArr[i18] >= 0) {
                    i18++;
                }
                if (i18 >= i12) {
                    iA = 0;
                } else {
                    while (true) {
                        if (i18 >= i12) {
                            iA = 0;
                        } else {
                            int i21 = i18 + 1;
                            byte b20 = bArr[i18];
                            if (b20 >= 0) {
                                i18 = i21;
                            } else if (b20 < -32) {
                                if (i21 >= i12) {
                                    iA = b20;
                                } else {
                                    if (b20 >= -62) {
                                        i18 += 2;
                                        if (bArr[i21] > -65) {
                                        }
                                    }
                                    iA = -1;
                                }
                            } else if (b20 < -16) {
                                if (i21 >= i12 - 1) {
                                    iA = c3.a(bArr, i21, i12);
                                } else {
                                    int i22 = i18 + 2;
                                    byte b21 = bArr[i21];
                                    if (b21 <= -65 && ((b20 != -32 || b21 >= -96) && (b20 != -19 || b21 < -96))) {
                                        i18 += 3;
                                        if (bArr[i22] > -65) {
                                        }
                                    }
                                    iA = -1;
                                }
                            } else if (i21 >= i12 - 2) {
                                iA = c3.a(bArr, i21, i12);
                            } else {
                                int i23 = i18 + 2;
                                byte b22 = bArr[i21];
                                if (b22 <= -65) {
                                    if ((((b22 + 112) + (b20 << 28)) >> 30) == 0) {
                                        int i24 = i18 + 3;
                                        if (bArr[i23] <= -65) {
                                            i18 += 4;
                                            if (bArr[i24] > -65) {
                                            }
                                        }
                                    }
                                }
                                iA = -1;
                            }
                        }
                    }
                }
                return iA;
            default:
                if ((i18 | i12 | (bArr.length - i12)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
                }
                long j14 = i18;
                long j15 = i12;
                if (i10 != 0) {
                    if (j14 >= j15) {
                        return i10;
                    }
                    byte b23 = (byte) i10;
                    if (b23 < -32) {
                        if (b23 >= -62) {
                            j13 = j14 + 1;
                            break;
                        }
                        return -1;
                    }
                    if (b23 < -16) {
                        byte bG4 = (byte) (~(i10 >> 8));
                        if (bG4 == 0) {
                            long j16 = j14 + 1;
                            bG4 = z2.g(bArr, j14);
                            if (j16 >= j15) {
                                return c3.d(b23, bG4);
                            }
                            j14 = j16;
                        }
                        if (bG4 <= -65 && ((b23 != -32 || bG4 >= -96) && (b23 != -19 || bG4 < -96))) {
                            j13 = j14 + 1;
                        }
                        break;
                    } else {
                        byte bG5 = (byte) (~(i10 >> 8));
                        if (bG5 == 0) {
                            long j17 = j14 + 1;
                            bG5 = z2.g(bArr, j14);
                            if (j17 >= j15) {
                                return c3.d(b23, bG5);
                            }
                            j14 = j17;
                            bG3 = 0;
                        } else {
                            bG3 = (byte) (i10 >> 16);
                        }
                        if (bG3 == 0) {
                            long j18 = j14 + 1;
                            bG3 = z2.g(bArr, j14);
                            if (j18 >= j15) {
                                return c3.e(b23, bG5, bG3);
                            }
                            j14 = j18;
                        }
                        if (bG5 <= -65) {
                            if ((((bG5 + 112) + (b23 << 28)) >> 30) == 0 && bG3 <= -65) {
                                long j19 = j14 + 1;
                                if (z2.g(bArr, j14) <= -65) {
                                    j14 = j19;
                                }
                            }
                        }
                    }
                    return -1;
                }
                int i25 = (int) (j15 - j14);
                if (i25 < 16) {
                    i15 = 0;
                } else {
                    int i26 = 8 - (((int) j14) & 7);
                    long j20 = j14;
                    i15 = 0;
                    while (true) {
                        if (i15 < i26) {
                            long j21 = j20 + 1;
                            if (z2.g(bArr, j20) >= 0) {
                                i15++;
                                j20 = j21;
                            }
                        } else {
                            while (true) {
                                int i27 = i15 + 8;
                                if (i27 <= i25) {
                                    if ((z2.f4286c.j(bArr, z2.f4289f + j20) & (-9187201950435737472L)) == 0) {
                                        j20 += 8;
                                        i15 = i27;
                                    }
                                }
                            }
                            while (true) {
                                if (i15 < i25) {
                                    long j22 = j20 + 1;
                                    if (z2.g(bArr, j20) >= 0) {
                                        i15++;
                                        j20 = j22;
                                    }
                                } else {
                                    i15 = i25;
                                }
                            }
                        }
                    }
                }
                int i28 = i25 - i15;
                long j23 = j14 + ((long) i15);
                while (true) {
                    byte bG6 = 0;
                    while (i28 > 0) {
                        long j24 = j23 + 1;
                        bG6 = z2.g(bArr, j23);
                        if (bG6 >= 0) {
                            i28--;
                            j23 = j24;
                        } else {
                            j23 = j24;
                            if (i28 == 0) {
                                i16 = 0;
                            } else {
                                i17 = i28 - 1;
                                if (bG6 < -32) {
                                    if (i17 == 0) {
                                        i16 = bG6;
                                    } else {
                                        i28 -= 2;
                                        if (bG6 >= b14) {
                                            j12 = j23 + 1;
                                            if (z2.g(bArr, j23) > -65) {
                                                j23 = j12;
                                                b14 = -62;
                                                b15 = -16;
                                            }
                                        }
                                        i16 = -1;
                                    }
                                } else if (bG6 < b15) {
                                    if (i17 < 2) {
                                        iX = X(j23, bArr, bG6, i17);
                                        i16 = iX;
                                    } else {
                                        i28 -= 3;
                                        long j25 = j23 + 1;
                                        bG2 = z2.g(bArr, j23);
                                        if (bG2 > -65 && ((bG6 != -32 || bG2 >= -96) && (bG6 != -19 || bG2 < -96))) {
                                            j23 += 2;
                                            if (z2.g(bArr, j25) <= -65) {
                                                b14 = -62;
                                                b15 = -16;
                                            }
                                        }
                                        i16 = -1;
                                    }
                                } else if (i17 < 3) {
                                    iX = X(j23, bArr, bG6, i17);
                                    i16 = iX;
                                } else {
                                    i28 -= 4;
                                    j10 = j23 + 1;
                                    bG = z2.g(bArr, j23);
                                    if (bG <= -65) {
                                        if ((((bG + 112) + (bG6 << 28)) >> 30) == 0) {
                                            j11 = 2 + j23;
                                            if (z2.g(bArr, j10) <= -65) {
                                                j23 += 3;
                                                if (z2.g(bArr, j11) > -65) {
                                                    b14 = -62;
                                                    b15 = -16;
                                                }
                                            }
                                        }
                                    }
                                    i16 = -1;
                                }
                            }
                        }
                    }
                    if (i28 == 0) {
                        i16 = 0;
                    } else {
                        i17 = i28 - 1;
                        if (bG6 < -32) {
                            if (i17 == 0) {
                                i16 = bG6;
                            } else {
                                i28 -= 2;
                                if (bG6 >= b14) {
                                    j12 = j23 + 1;
                                    if (z2.g(bArr, j23) > -65) {
                                        j23 = j12;
                                        b14 = -62;
                                        b15 = -16;
                                    }
                                }
                                i16 = -1;
                            }
                        } else if (bG6 < b15) {
                            if (i17 < 2) {
                                iX = X(j23, bArr, bG6, i17);
                                i16 = iX;
                            } else {
                                i28 -= 3;
                                long j26 = j23 + 1;
                                bG2 = z2.g(bArr, j23);
                                if (bG2 > -65) {
                                }
                                i16 = -1;
                            }
                        } else if (i17 < 3) {
                            iX = X(j23, bArr, bG6, i17);
                            i16 = iX;
                        } else {
                            i28 -= 4;
                            j10 = j23 + 1;
                            bG = z2.g(bArr, j23);
                            if (bG <= -65) {
                                if ((((bG + 112) + (bG6 << 28)) >> 30) == 0) {
                                    j11 = 2 + j23;
                                    if (z2.g(bArr, j10) <= -65) {
                                        j23 += 3;
                                        if (z2.g(bArr, j11) > -65) {
                                            b14 = -62;
                                            b15 = -16;
                                        }
                                    }
                                }
                            }
                            i16 = -1;
                        }
                    }
                }
                return i16;
        }
    }
}
