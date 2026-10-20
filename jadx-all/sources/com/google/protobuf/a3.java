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
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
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
        char c10 = 2048;
        char c11 = 128;
        switch (this.f4060c) {
            case 0:
                int length = charSequence.length();
                int i16 = i11 + i10;
                int i17 = 0;
                while (i17 < length) {
                    int i18 = i17 + i10;
                    if (i18 >= i16 || (cCharAt3 = charSequence.charAt(i17)) >= 128) {
                        if (i17 == length) {
                            return i10 + length;
                        }
                        i12 = i10 + i17;
                        while (i17 < length) {
                            cCharAt = charSequence.charAt(i17);
                            if (cCharAt >= 128 && i12 < i16) {
                                bArr[i12] = (byte) cCharAt;
                                i12++;
                            } else if (cCharAt >= 2048 && i12 <= i16 - 2) {
                                int i19 = i12 + 1;
                                bArr[i12] = (byte) ((cCharAt >>> 6) | 960);
                                i12 += 2;
                                bArr[i19] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i12 > i16 - 3) {
                                    if (i12 > i16 - 4) {
                                        if (55296 > cCharAt && cCharAt <= 57343 && ((i13 = i17 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt, charSequence.charAt(i13)))) {
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
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
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
                                if (55296 > cCharAt) {
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
                        if (cCharAt < 55296) {
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
                            if (55296 > cCharAt) {
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
                    if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
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
                            if (55296 > cCharAt) {
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
                    if (cCharAt < 55296) {
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
                        if (55296 > cCharAt) {
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
                while (i30 < length2 && (cCharAt4 = charSequence.charAt(i30)) < 128) {
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
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j11 > j12 - 3) {
                                j10 = j12;
                                if (j11 > j10 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i15 = i30 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, charSequence.charAt(i15)))) {
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
                        c10 = 2048;
                        c11 = 128;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final int W(int r25, byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a3.W(int, byte[], int, int):int");
    }
}
