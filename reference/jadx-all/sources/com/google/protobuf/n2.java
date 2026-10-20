package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l2 f4186a = new l2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m2 f4187b = new m2();

    public static int A(int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        p0 p0Var = (p0) x0Var;
        int iJ = J(bArr, i11, eVar);
        p0Var.i(s.b(eVar.f3530a));
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iJ = J(bArr, iJ2, eVar);
            p0Var.i(s.b(eVar.f3530a));
        }
        return iJ;
    }

    public static int B(int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        i1 i1Var = (i1) x0Var;
        int iL = L(bArr, i11, eVar);
        i1Var.i(s.c(eVar.f3531b));
        while (iL < i12) {
            int iJ = J(bArr, iL, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iL = L(bArr, iJ, eVar);
            i1Var.i(s.c(eVar.f3531b));
        }
        return iL;
    }

    public static int C(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        int iJ = J(bArr, i10, eVar);
        int i11 = eVar.f3530a;
        if (i11 < 0) {
            throw a1.f();
        }
        if (i11 == 0) {
            eVar.f3532c = "";
            return iJ;
        }
        eVar.f3532c = new String(bArr, iJ, i11, y0.f4276a);
        return iJ + i11;
    }

    public static int D(int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        int iJ = J(bArr, i11, eVar);
        int i13 = eVar.f3530a;
        if (i13 < 0) {
            throw a1.f();
        }
        if (i13 == 0) {
            x0Var.add("");
        } else {
            x0Var.add(new String(bArr, iJ, i13, y0.f4276a));
            iJ += i13;
        }
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iJ = J(bArr, iJ2, eVar);
            int i14 = eVar.f3530a;
            if (i14 < 0) {
                throw a1.f();
            }
            if (i14 == 0) {
                x0Var.add("");
            } else {
                x0Var.add(new String(bArr, iJ, i14, y0.f4276a));
                iJ += i14;
            }
        }
        return iJ;
    }

    public static int E(int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        int iJ = J(bArr, i11, eVar);
        int i13 = eVar.f3530a;
        if (i13 < 0) {
            throw a1.f();
        }
        if (i13 == 0) {
            x0Var.add("");
        } else {
            int i14 = iJ + i13;
            if (c3.f4086a.W(0, bArr, iJ, i14) != 0) {
                throw a1.c();
            }
            x0Var.add(new String(bArr, iJ, i13, y0.f4276a));
            iJ = i14;
        }
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iJ = J(bArr, iJ2, eVar);
            int i15 = eVar.f3530a;
            if (i15 < 0) {
                throw a1.f();
            }
            if (i15 == 0) {
                x0Var.add("");
            } else {
                int i16 = iJ + i15;
                if (c3.f4086a.W(0, bArr, iJ, i16) != 0) {
                    throw a1.c();
                }
                x0Var.add(new String(bArr, iJ, i15, y0.f4276a));
                iJ = i16;
            }
        }
        return iJ;
    }

    public static int F(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        int iJ = J(bArr, i10, eVar);
        int i11 = eVar.f3530a;
        if (i11 < 0) {
            throw a1.f();
        }
        if (i11 == 0) {
            eVar.f3532c = "";
            return iJ;
        }
        eVar.f3532c = c3.f4086a.T(bArr, iJ, i11);
        return iJ + i11;
    }

    public static int G(int i10, byte[] bArr, int i11, int i12, s2 s2Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        if ((i10 >>> 3) == 0) {
            throw a1.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iL = L(bArr, i11, eVar);
            s2Var.f(i10, Long.valueOf(eVar.f3531b));
            return iL;
        }
        if (i13 == 1) {
            s2Var.f(i10, Long.valueOf(l(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iJ = J(bArr, i11, eVar);
            int i14 = eVar.f3530a;
            if (i14 < 0) {
                throw a1.f();
            }
            if (i14 > bArr.length - iJ) {
                throw a1.h();
            }
            if (i14 == 0) {
                s2Var.f(i10, n.f4181b);
            } else {
                s2Var.f(i10, n.o(bArr, iJ, i14));
            }
            return iJ + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw a1.b();
            }
            s2Var.f(i10, Integer.valueOf(j(i11, bArr)));
            return i11 + 4;
        }
        s2 s2Var2 = new s2();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (i11 < i12) {
            int iJ2 = J(bArr, i11, eVar);
            int i17 = eVar.f3530a;
            if (i17 == i15) {
                i16 = i17;
                i11 = iJ2;
                break;
            }
            i16 = i17;
            i11 = G(i17, bArr, iJ2, i12, s2Var2, eVar);
        }
        if (i11 > i12 || i16 != i15) {
            throw a1.g();
        }
        s2Var.f(i10, s2Var2);
        return i11;
    }

    public static String H(ByteBuffer byteBuffer, int i10, int i11) throws a1 {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = byteBuffer.get(i10);
            if (!b(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (b(b11)) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                while (i15 < i12) {
                    byte b12 = byteBuffer.get(i15);
                    if (!b(b12)) {
                        break;
                    }
                    i15++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
                i14 = i16;
                i10 = i15;
            } else if (b11 < -32) {
                if (i15 >= i12) {
                    throw a1.c();
                }
                i10 += 2;
                c(b11, byteBuffer.get(i15), cArr, i14);
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i12 - 1) {
                    throw a1.c();
                }
                int i17 = i10 + 2;
                i10 += 3;
                d(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw a1.c();
                }
                byte b13 = byteBuffer.get(i15);
                int i18 = i10 + 3;
                byte b14 = byteBuffer.get(i10 + 2);
                i10 += 4;
                a(b11, b13, b14, byteBuffer.get(i18), cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    public static int I(int i10, byte[] bArr, int i11, com.google.crypto.tink.shaded.protobuf.e eVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            eVar.f3530a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            eVar.f3530a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            eVar.f3530a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            eVar.f3530a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                eVar.f3530a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int J(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.e eVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return I(b10, bArr, i11, eVar);
        }
        eVar.f3530a = b10;
        return i11;
    }

    public static int K(int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        p0 p0Var = (p0) x0Var;
        int iJ = J(bArr, i11, eVar);
        p0Var.i(eVar.f3530a);
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iJ = J(bArr, iJ2, eVar);
            p0Var.i(eVar.f3530a);
        }
        return iJ;
    }

    public static int L(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.e eVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            eVar.f3531b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        eVar.f3531b = j11;
        return i12;
    }

    public static int M(int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        i1 i1Var = (i1) x0Var;
        int iL = L(bArr, i11, eVar);
        i1Var.i(eVar.f3531b);
        while (iL < i12) {
            int iJ = J(bArr, iL, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iL = L(bArr, iJ, eVar);
            i1Var.i(eVar.f3531b);
        }
        return iL;
    }

    public static String N(n nVar) {
        StringBuilder sb = new StringBuilder(nVar.size());
        for (int i10 = 0; i10 < nVar.size(); i10++) {
            byte bI = nVar.i(i10);
            if (bI == 34) {
                sb.append("\\\"");
            } else if (bI == 39) {
                sb.append("\\'");
            } else if (bI != 92) {
                switch (bI) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bI < 32 || bI > 126) {
                            sb.append('\\');
                            sb.append((char) (((bI >>> 6) & 3) + 48));
                            sb.append((char) (((bI >>> 3) & 7) + 48));
                            sb.append((char) ((bI & 7) + 48));
                        } else {
                            sb.append((char) bI);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean O(byte b10) {
        return b10 > -65;
    }

    public static int P(Object obj, i2 i2Var, byte[] bArr, int i10, int i11, int i12, com.google.crypto.tink.shaded.protobuf.e eVar) {
        int iK = ((w1) i2Var).K(obj, bArr, i10, i11, i12, eVar);
        eVar.f3532c = obj;
        return iK;
    }

    public static int Q(Object obj, i2 i2Var, byte[] bArr, int i10, int i11, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        int I = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            I = I(i12, bArr, I, eVar);
            i12 = eVar.f3530a;
        }
        int i13 = I;
        if (i12 < 0 || i12 > i11 - i13) {
            throw a1.h();
        }
        int i14 = i12 + i13;
        i2Var.i(obj, bArr, i13, i14, eVar);
        eVar.f3532c = obj;
        return i14;
    }

    public static int R(int i10, byte[] bArr, int i11, int i12, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        if ((i10 >>> 3) == 0) {
            throw a1.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return L(bArr, i11, eVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return J(bArr, i11, eVar) + eVar.f3530a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw a1.b();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = J(bArr, i11, eVar);
            i15 = eVar.f3530a;
            if (i15 == i14) {
                break;
            }
            i11 = R(i15, bArr, i11, i12, eVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw a1.g();
        }
        return i11;
    }

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws a1 {
        if (!O(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !O(b12) && !O(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw a1.c();
    }

    public static boolean b(byte b10) {
        return b10 >= 0;
    }

    public static void c(byte b10, byte b11, char[] cArr, int i10) throws a1 {
        if (b10 < -62 || O(b11)) {
            throw a1.c();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static void d(byte b10, byte b11, byte b12, char[] cArr, int i10) throws a1 {
        if (O(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || O(b12)))) {
            throw a1.c();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    public static int e(int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        g gVar = (g) x0Var;
        int iL = L(bArr, i11, eVar);
        gVar.i(eVar.f3531b != 0);
        while (iL < i12) {
            int iJ = J(bArr, iL, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iL = L(bArr, iJ, eVar);
            gVar.i(eVar.f3531b != 0);
        }
        return iL;
    }

    public static int f(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        int iJ = J(bArr, i10, eVar);
        int i11 = eVar.f3530a;
        if (i11 < 0) {
            throw a1.f();
        }
        if (i11 > bArr.length - iJ) {
            throw a1.h();
        }
        if (i11 == 0) {
            eVar.f3532c = n.f4181b;
            return iJ;
        }
        eVar.f3532c = n.o(bArr, iJ, i11);
        return iJ + i11;
    }

    public static int g(int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        int iJ = J(bArr, i11, eVar);
        int i13 = eVar.f3530a;
        if (i13 < 0) {
            throw a1.f();
        }
        if (i13 > bArr.length - iJ) {
            throw a1.h();
        }
        if (i13 == 0) {
            x0Var.add(n.f4181b);
        } else {
            x0Var.add(n.o(bArr, iJ, i13));
            iJ += i13;
        }
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            iJ = J(bArr, iJ2, eVar);
            int i14 = eVar.f3530a;
            if (i14 < 0) {
                throw a1.f();
            }
            if (i14 > bArr.length - iJ) {
                throw a1.h();
            }
            if (i14 == 0) {
                x0Var.add(n.f4181b);
            } else {
                x0Var.add(n.o(bArr, iJ, i14));
                iJ += i14;
            }
        }
        return iJ;
    }

    public static double h(int i10, byte[] bArr) {
        return Double.longBitsToDouble(l(i10, bArr));
    }

    public static int i(int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        w wVar = (w) x0Var;
        wVar.i(Double.longBitsToDouble(l(i11, bArr)));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iJ = J(bArr, i13, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            wVar.i(Double.longBitsToDouble(l(iJ, bArr)));
            i13 = iJ + 8;
        }
        return i13;
    }

    public static int j(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int k(int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        p0 p0Var = (p0) x0Var;
        p0Var.i(j(i11, bArr));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iJ = J(bArr, i13, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            p0Var.i(j(iJ, bArr));
            i13 = iJ + 4;
        }
        return i13;
    }

    public static long l(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int m(int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        i1 i1Var = (i1) x0Var;
        i1Var.i(l(i11, bArr));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iJ = J(bArr, i13, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            i1Var.i(l(iJ, bArr));
            i13 = iJ + 8;
        }
        return i13;
    }

    public static float n(int i10, byte[] bArr) {
        return Float.intBitsToFloat(j(i10, bArr));
    }

    public static int o(int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        e0 e0Var = (e0) x0Var;
        e0Var.i(Float.intBitsToFloat(j(i11, bArr)));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iJ = J(bArr, i13, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            e0Var.i(Float.intBitsToFloat(j(iJ, bArr)));
            i13 = iJ + 4;
        }
        return i13;
    }

    public static int p(i2 i2Var, int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) {
        int i13 = (i10 & (-8)) | 4;
        Object objF = i2Var.f();
        int iP = P(objF, i2Var, bArr, i11, i12, i13, eVar);
        i2Var.b(objF);
        eVar.f3532c = objF;
        x0Var.add(objF);
        while (iP < i12) {
            int iJ = J(bArr, iP, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            Object objF2 = i2Var.f();
            int iP2 = P(objF2, i2Var, bArr, iJ, i12, i13, eVar);
            i2Var.b(objF2);
            eVar.f3532c = objF2;
            x0Var.add(objF2);
            iP = iP2;
        }
        return iP;
    }

    public static int q(i2 i2Var, int i10, byte[] bArr, int i11, int i12, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        Object objF = i2Var.f();
        int iQ = Q(objF, i2Var, bArr, i11, i12, eVar);
        i2Var.b(objF);
        eVar.f3532c = objF;
        x0Var.add(objF);
        while (iQ < i12) {
            int iJ = J(bArr, iQ, eVar);
            if (i10 != eVar.f3530a) {
                break;
            }
            Object objF2 = i2Var.f();
            int iQ2 = Q(objF2, i2Var, bArr, iJ, i12, eVar);
            i2Var.b(objF2);
            eVar.f3532c = objF2;
            x0Var.add(objF2);
            iQ = iQ2;
        }
        return iQ;
    }

    public static int r(byte[] bArr, int i10, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        g gVar = (g) x0Var;
        int iJ = J(bArr, i10, eVar);
        int i11 = eVar.f3530a + iJ;
        while (iJ < i11) {
            iJ = L(bArr, iJ, eVar);
            gVar.i(eVar.f3531b != 0);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw a1.h();
    }

    public static int s(byte[] bArr, int i10, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        w wVar = (w) x0Var;
        int iJ = J(bArr, i10, eVar);
        int i11 = eVar.f3530a + iJ;
        while (iJ < i11) {
            wVar.i(Double.longBitsToDouble(l(iJ, bArr)));
            iJ += 8;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw a1.h();
    }

    public static int t(byte[] bArr, int i10, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        p0 p0Var = (p0) x0Var;
        int iJ = J(bArr, i10, eVar);
        int i11 = eVar.f3530a + iJ;
        while (iJ < i11) {
            p0Var.i(j(iJ, bArr));
            iJ += 4;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw a1.h();
    }

    public static int u(byte[] bArr, int i10, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        i1 i1Var = (i1) x0Var;
        int iJ = J(bArr, i10, eVar);
        int i11 = eVar.f3530a + iJ;
        while (iJ < i11) {
            i1Var.i(l(iJ, bArr));
            iJ += 8;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw a1.h();
    }

    public static int v(byte[] bArr, int i10, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        e0 e0Var = (e0) x0Var;
        int iJ = J(bArr, i10, eVar);
        int i11 = eVar.f3530a + iJ;
        while (iJ < i11) {
            e0Var.i(Float.intBitsToFloat(j(iJ, bArr)));
            iJ += 4;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw a1.h();
    }

    public static int w(byte[] bArr, int i10, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        p0 p0Var = (p0) x0Var;
        int iJ = J(bArr, i10, eVar);
        int i11 = eVar.f3530a + iJ;
        while (iJ < i11) {
            iJ = J(bArr, iJ, eVar);
            p0Var.i(s.b(eVar.f3530a));
        }
        if (iJ == i11) {
            return iJ;
        }
        throw a1.h();
    }

    public static int x(byte[] bArr, int i10, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        i1 i1Var = (i1) x0Var;
        int iJ = J(bArr, i10, eVar);
        int i11 = eVar.f3530a + iJ;
        while (iJ < i11) {
            iJ = L(bArr, iJ, eVar);
            i1Var.i(s.c(eVar.f3531b));
        }
        if (iJ == i11) {
            return iJ;
        }
        throw a1.h();
    }

    public static int y(byte[] bArr, int i10, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        p0 p0Var = (p0) x0Var;
        int iJ = J(bArr, i10, eVar);
        int i11 = eVar.f3530a + iJ;
        while (iJ < i11) {
            iJ = J(bArr, iJ, eVar);
            p0Var.i(eVar.f3530a);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw a1.h();
    }

    public static int z(byte[] bArr, int i10, x0 x0Var, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        i1 i1Var = (i1) x0Var;
        int iJ = J(bArr, i10, eVar);
        int i11 = eVar.f3530a + iJ;
        while (iJ < i11) {
            iJ = L(bArr, iJ, eVar);
            i1Var.i(eVar.f3531b);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw a1.h();
    }

    public abstract void S(byte[] bArr, int i10, int i11);
}
