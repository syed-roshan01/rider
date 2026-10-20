package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends f6.a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f3638z;

    public static int u0(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            x1 x1Var = z1.f3643a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return z1.c(i10, w1.g(bArr, j10));
        }
        if (i11 == 2) {
            return z1.d(i10, w1.g(bArr, j10), w1.g(bArr, j10 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:2: B:23:0x0054->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012c A[SYNTHETIC] */
    public final String r0(byte[] bArr, int i10, int i11) {
        int i12;
        byte b10;
        int i13;
        byte b11;
        byte b12;
        byte b13;
        switch (this.f3638z) {
            case 0:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i14 = i10 + i11;
                char[] cArr = new char[i11];
                int i15 = 0;
                while (i10 < i14) {
                    byte b14 = bArr[i10];
                    if (b14 < 0) {
                        while (i10 < i14) {
                            i12 = i10 + 1;
                            b10 = bArr[i10];
                            if (b10 < 0) {
                                i13 = i15 + 1;
                                cArr[i15] = (char) b10;
                                while (i12 < i14) {
                                    b11 = bArr[i12];
                                    if (b11 >= 0) {
                                        i12++;
                                        cArr[i13] = (char) b11;
                                        i13++;
                                    } else {
                                        i15 = i13;
                                        i10 = i12;
                                    }
                                }
                                i15 = i13;
                                i10 = i12;
                            } else if (b10 < -32) {
                                if (i12 < i14) {
                                    throw h0.b();
                                }
                                i10 += 2;
                                byte b15 = bArr[i12];
                                int i16 = i15 + 1;
                                if (b10 >= -62 || h6.g.p0(b15)) {
                                    throw h0.b();
                                }
                                cArr[i15] = (char) ((b15 & 63) | ((b10 & 31) << 6));
                                i15 = i16;
                            } else {
                                if (b10 >= -16) {
                                    if (i12 < i14 - 2) {
                                        throw h0.b();
                                    }
                                    b13 = bArr[i12];
                                    int i17 = i10 + 3;
                                    byte b16 = bArr[i10 + 2];
                                    i10 += 4;
                                    byte b17 = bArr[i17];
                                    int i18 = i15 + 1;
                                    if (!h6.g.p0(b13)) {
                                        if ((((b13 + 112) + (b10 << 28)) >> 30) != 0 && !h6.g.p0(b16) && !h6.g.p0(b17)) {
                                            int i19 = ((b13 & 63) << 12) | ((b10 & 7) << 18) | ((b16 & 63) << 6) | (b17 & 63);
                                            cArr[i15] = (char) ((i19 >>> 10) + 55232);
                                            cArr[i18] = (char) ((i19 & 1023) + 56320);
                                            i15 += 2;
                                        }
                                    }
                                    throw h0.b();
                                }
                                if (i12 < i14 - 1) {
                                    throw h0.b();
                                }
                                int i20 = i10 + 2;
                                b12 = bArr[i12];
                                i10 += 3;
                                byte b18 = bArr[i20];
                                int i21 = i15 + 1;
                                if (!h6.g.p0(b12) || ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || h6.g.p0(b18)))) {
                                    throw h0.b();
                                }
                                cArr[i15] = (char) (((b12 & 63) << 6) | ((b10 & 15) << 12) | (b18 & 63));
                                i15 = i21;
                            }
                        }
                        return new String(cArr, 0, i15);
                    }
                    i10++;
                    cArr[i15] = (char) b14;
                    i15++;
                }
                while (i10 < i14) {
                    i12 = i10 + 1;
                    b10 = bArr[i10];
                    if (b10 < 0) {
                        if (b10 < -32) {
                            if (i12 < i14) {
                                throw h0.b();
                            }
                            i10 += 2;
                            byte b19 = bArr[i12];
                            int i110 = i15 + 1;
                            if (b10 >= -62) {
                            }
                            throw h0.b();
                        }
                        if (b10 >= -16) {
                            if (i12 < i14 - 1) {
                                throw h0.b();
                            }
                            int i22 = i10 + 2;
                            b12 = bArr[i12];
                            i10 += 3;
                            byte b110 = bArr[i22];
                            int i23 = i15 + 1;
                            if (h6.g.p0(b12)) {
                            }
                            throw h0.b();
                        }
                        if (i12 < i14 - 2) {
                            throw h0.b();
                        }
                        b13 = bArr[i12];
                        int i111 = i10 + 3;
                        byte b111 = bArr[i10 + 2];
                        i10 += 4;
                        byte b112 = bArr[i111];
                        int i112 = i15 + 1;
                        if (!h6.g.p0(b13)) {
                            if ((((b13 + 112) + (b10 << 28)) >> 30) != 0) {
                            }
                        }
                        throw h0.b();
                    }
                    i13 = i15 + 1;
                    cArr[i15] = (char) b10;
                    while (i12 < i14) {
                        b11 = bArr[i12];
                        if (b11 >= 0) {
                            i12++;
                            cArr[i13] = (char) b11;
                            i13++;
                        } else {
                            i15 = i13;
                            i10 = i12;
                        }
                    }
                    i15 = i13;
                    i10 = i12;
                }
                return new String(cArr, 0, i15);
            default:
                Charset charset = f0.f3534a;
                String str = new String(bArr, i10, i11, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                    throw h0.b();
                }
                return str;
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
    public final int s0(CharSequence charSequence, byte[] bArr, int i10, int i11) {
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
        switch (this.f3638z) {
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
                                            throw new y1(i17, length);
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
                                    throw new y1(i17 - 1, length);
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
                            throw new y1(i17 - 1, length);
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
                        throw new y1(i17 - 1, length);
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
                        throw new y1(i17 - 1, length);
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
                    throw new y1(i17 - 1, length);
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
                    w1.o(bArr, j11, (byte) cCharAt4);
                    i30++;
                    j11++;
                }
                if (i30 != length2) {
                    while (i30 < length2) {
                        char cCharAt5 = charSequence.charAt(i30);
                        if (cCharAt5 < c11 && j11 < j12) {
                            w1.o(bArr, j11, (byte) cCharAt5);
                            j10 = j12;
                            j11++;
                        } else if (cCharAt5 < c10 && j11 <= j12 - 2) {
                            long j13 = j11 + 1;
                            w1.o(bArr, j11, (byte) ((cCharAt5 >>> 6) | 960));
                            j11 += 2;
                            w1.o(bArr, j13, (byte) ((cCharAt5 & '?') | c11));
                            j10 = j12;
                        } else {
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j11 > j12 - 3) {
                                j10 = j12;
                                if (j11 > j10 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i15 = i30 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, charSequence.charAt(i15)))) {
                                        throw new y1(i30, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j11);
                                }
                                int i31 = i30 + 1;
                                if (i31 != length2) {
                                    char cCharAt6 = charSequence.charAt(i31);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint6 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        w1.o(bArr, j11, (byte) ((codePoint6 >>> 18) | 240));
                                        w1.o(bArr, j11 + 1, (byte) (((codePoint6 >>> 12) & 63) | 128));
                                        long j14 = 3 + j11;
                                        w1.o(bArr, j11 + 2, (byte) (((codePoint6 >>> 6) & 63) | 128));
                                        j11 += 4;
                                        w1.o(bArr, j14, (byte) ((codePoint6 & 63) | 128));
                                        i30 = i31;
                                    } else {
                                        i30 = i31;
                                    }
                                }
                                throw new y1(i30 - 1, length2);
                            }
                            w1.o(bArr, j11, (byte) ((cCharAt5 >>> '\f') | 480));
                            j10 = j12;
                            long j15 = j11 + 2;
                            w1.o(bArr, j11 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j11 += 3;
                            w1.o(bArr, j15, (byte) ((cCharAt5 & '?') | 128));
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

    /* JADX WARN: Code duplicated, block: B:129:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    public final int t0(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        long j10;
        byte bG;
        long j11;
        byte bG2;
        long j12;
        int i14 = i10;
        byte b10 = -62;
        switch (this.f3638z) {
            case 0:
                break;
            default:
                if ((i14 | i11 | (bArr.length - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                long j13 = i14;
                int i15 = (int) (((long) i11) - j13);
                if (i15 < 16) {
                    i12 = 0;
                } else {
                    int i16 = 8 - (((int) j13) & 7);
                    long j14 = j13;
                    i12 = 0;
                    while (true) {
                        if (i12 < i16) {
                            long j15 = j14 + 1;
                            if (w1.g(bArr, j14) >= 0) {
                                i12++;
                                j14 = j15;
                            }
                        } else {
                            while (true) {
                                int i17 = i12 + 8;
                                if (i17 <= i15) {
                                    if ((w1.f3633c.h(bArr, w1.f3636f + j14) & (-9187201950435737472L)) == 0) {
                                        j14 += 8;
                                        i12 = i17;
                                    }
                                }
                            }
                            while (true) {
                                if (i12 < i15) {
                                    long j16 = j14 + 1;
                                    if (w1.g(bArr, j14) >= 0) {
                                        i12++;
                                        j14 = j16;
                                    }
                                } else {
                                    i12 = i15;
                                }
                            }
                        }
                    }
                }
                int i18 = i15 - i12;
                long j17 = j13 + ((long) i12);
                while (true) {
                    byte b11 = 0;
                    while (i18 > 0) {
                        long j18 = j17 + 1;
                        byte bG3 = w1.g(bArr, j17);
                        if (bG3 < 0) {
                            j17 = j18;
                            b11 = bG3;
                            if (i18 == 0) {
                                return 0;
                            }
                            i13 = i18 - 1;
                            if (b11 < -32) {
                                if (i13 == 0) {
                                    return b11;
                                }
                                i18 -= 2;
                                if (b11 >= b10) {
                                    j12 = j17 + 1;
                                    if (w1.g(bArr, j17) > -65) {
                                        j17 = j12;
                                        b10 = -62;
                                    }
                                }
                                return -1;
                            }
                            if (b11 < -16) {
                                if (i13 < 2) {
                                    return u0(j17, bArr, b11, i13);
                                }
                                i18 -= 3;
                                long j19 = j17 + 1;
                                bG2 = w1.g(bArr, j17);
                                if (bG2 > -65 && ((b11 != -32 || bG2 >= -96) && (b11 != -19 || bG2 < -96))) {
                                    j17 += 2;
                                    if (w1.g(bArr, j19) <= -65) {
                                        b10 = -62;
                                    }
                                }
                                return -1;
                            }
                            if (i13 < 3) {
                                return u0(j17, bArr, b11, i13);
                            }
                            i18 -= 4;
                            j10 = j17 + 1;
                            bG = w1.g(bArr, j17);
                            if (bG <= -65) {
                                if ((((bG + 112) + (b11 << 28)) >> 30) == 0) {
                                    j11 = 2 + j17;
                                    if (w1.g(bArr, j10) <= -65) {
                                        j17 += 3;
                                        if (w1.g(bArr, j11) > -65) {
                                            b10 = -62;
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i18--;
                        j17 = j18;
                        b11 = bG3;
                    }
                    if (i18 == 0) {
                        return 0;
                    }
                    i13 = i18 - 1;
                    if (b11 < -32) {
                        if (i13 == 0) {
                            return b11;
                        }
                        i18 -= 2;
                        if (b11 >= b10) {
                            j12 = j17 + 1;
                            if (w1.g(bArr, j17) > -65) {
                                j17 = j12;
                                b10 = -62;
                            }
                        }
                        return -1;
                    }
                    if (b11 < -16) {
                        if (i13 < 2) {
                            return u0(j17, bArr, b11, i13);
                        }
                        i18 -= 3;
                        long j110 = j17 + 1;
                        bG2 = w1.g(bArr, j17);
                        if (bG2 > -65) {
                        }
                        return -1;
                    }
                    if (i13 < 3) {
                        return u0(j17, bArr, b11, i13);
                    }
                    i18 -= 4;
                    j10 = j17 + 1;
                    bG = w1.g(bArr, j17);
                    if (bG <= -65) {
                        if ((((bG + 112) + (b11 << 28)) >> 30) == 0) {
                            j11 = 2 + j17;
                            if (w1.g(bArr, j10) <= -65) {
                                j17 += 3;
                                if (w1.g(bArr, j11) > -65) {
                                    b10 = -62;
                                }
                            }
                        }
                    }
                    return -1;
                }
        }
        while (i14 < i11 && bArr[i14] >= 0) {
            i14++;
        }
        if (i14 < i11) {
            while (i14 < i11) {
                int i19 = i14 + 1;
                byte b12 = bArr[i14];
                if (b12 < 0) {
                    if (b12 < -32) {
                        if (i19 >= i11) {
                            return b12;
                        }
                        if (b12 >= -62) {
                            i14 += 2;
                            if (bArr[i19] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b12 < -16) {
                        if (i19 >= i11 - 1) {
                            return z1.a(bArr, i19, i11);
                        }
                        int i20 = i14 + 2;
                        byte b13 = bArr[i19];
                        if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                            i14 += 3;
                            if (bArr[i20] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i19 >= i11 - 2) {
                        return z1.a(bArr, i19, i11);
                    }
                    int i21 = i14 + 2;
                    byte b14 = bArr[i19];
                    if (b14 <= -65) {
                        if ((((b14 + 112) + (b12 << 28)) >> 30) == 0) {
                            int i22 = i14 + 3;
                            if (bArr[i21] <= -65) {
                                i14 += 4;
                                if (bArr[i22] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i14 = i19;
            }
        }
        return 0;
    }
}
