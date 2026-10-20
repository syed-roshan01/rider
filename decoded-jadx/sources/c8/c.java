package c8;

import java.util.Arrays;
import l.q;
import y5.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f3043a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f3044b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f3045c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f3046d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARN: Code duplicated, block: B:102:0x0238  */
    public static void a(z7.a aVar, b8.a aVar2, b8.c cVar, int i10, k3.b bVar) {
        boolean zD;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        for (byte[] bArr : (byte[][]) bVar.f9722d) {
            Arrays.fill(bArr, (byte) -1);
        }
        int length = f3043a[0].length;
        d(0, 0, bVar);
        d(bVar.f9720b - length, 0, bVar);
        d(0, bVar.f9720b - length, bVar);
        c(0, 7, bVar);
        c(bVar.f9720b - 8, 7, bVar);
        c(0, bVar.f9720b - 8, bVar);
        e(7, 0, bVar);
        e(bVar.f9721c - 8, 0, bVar);
        e(7, bVar.f9721c - 7, bVar);
        if (bVar.a(8, bVar.f9721c - 8) == 0) {
            throw new n();
        }
        bVar.c(8, bVar.f9721c - 8, 1);
        int i17 = cVar.f2753a;
        int i18 = 5;
        if (i17 >= 2) {
            int[] iArr = f3045c[i17 - 1];
            int length2 = iArr.length;
            int i19 = 0;
            while (i19 < length2) {
                int i20 = iArr[i19];
                if (i20 >= 0) {
                    int length3 = iArr.length;
                    int i21 = i16;
                    while (i21 < length3) {
                        int i22 = iArr[i21];
                        if (i22 >= 0 && f(bVar.a(i22, i20))) {
                            int i23 = i22 - 2;
                            int i24 = i20 - 2;
                            int i25 = i16;
                            while (i25 < i18) {
                                int[] iArr2 = f3044b[i25];
                                int i26 = i16;
                                while (i26 < i18) {
                                    bVar.c(i23 + i26, i24 + i25, iArr2[i26]);
                                    i26++;
                                    i18 = 5;
                                }
                                i25++;
                                i16 = 0;
                                i18 = 5;
                            }
                        }
                        i21++;
                        i16 = 0;
                        i18 = 5;
                    }
                }
                i19++;
                i16 = 0;
                i18 = 5;
            }
        }
        int i27 = 8;
        while (i27 < bVar.f9720b - 8) {
            int i28 = i27 + 1;
            int i29 = i28 % 2;
            if (f(bVar.a(i27, 6))) {
                bVar.c(i27, 6, i29);
            }
            if (f(bVar.a(6, i27))) {
                bVar.c(6, i27, i29);
            }
            i27 = i28;
        }
        z7.a aVar3 = new z7.a();
        if (i10 < 0 || i10 >= 8) {
            throw new n("Invalid mask pattern");
        }
        int i30 = (aVar2.f2742a << 3) | i10;
        aVar3.b(i30, 5);
        aVar3.b(b(i30, 1335), 10);
        z7.a aVar4 = new z7.a();
        aVar4.b(21522, 15);
        if (aVar3.f17320b != aVar4.f17320b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i31 = 0;
        while (true) {
            int[] iArr3 = aVar3.f17319a;
            if (i31 >= iArr3.length) {
                break;
            }
            iArr3[i31] = iArr3[i31] ^ aVar4.f17319a[i31];
            i31++;
        }
        if (aVar3.f17320b != 15) {
            throw new n("should not happen but we got: " + aVar3.f17320b);
        }
        int i32 = 0;
        while (true) {
            int i33 = aVar3.f17320b;
            if (i32 >= i33) {
                break;
            }
            boolean zD2 = aVar3.d((i33 - 1) - i32);
            int[] iArr4 = f3046d[i32];
            bVar.d(iArr4[0], zD2, iArr4[1]);
            if (i32 < 8) {
                i15 = (bVar.f9720b - i32) - 1;
                i14 = 8;
            } else {
                i14 = (bVar.f9721c - 7) + (i32 - 8);
                i15 = 8;
            }
            bVar.d(i15, zD2, i14);
            i32++;
        }
        if (i17 >= 7) {
            z7.a aVar5 = new z7.a();
            aVar5.b(i17, 6);
            aVar5.b(b(i17, 7973), 12);
            if (aVar5.f17320b != 18) {
                throw new n("should not happen but we got: " + aVar5.f17320b);
            }
            int i34 = 17;
            for (int i35 = 0; i35 < 6; i35++) {
                for (int i36 = 0; i36 < 3; i36++) {
                    boolean zD3 = aVar5.d(i34);
                    i34--;
                    bVar.d(i35, zD3, (bVar.f9721c - 11) + i36);
                    bVar.d((bVar.f9721c - 11) + i36, zD3, i35);
                }
            }
        }
        int i37 = bVar.f9720b - 1;
        int i38 = bVar.f9721c - 1;
        int i39 = 0;
        int i40 = -1;
        while (i37 > 0) {
            if (i37 == 6) {
                i37--;
            }
            while (i38 >= 0 && i38 < bVar.f9721c) {
                for (int i41 = 0; i41 < 2; i41++) {
                    int i42 = i37 - i41;
                    if (f(bVar.a(i42, i38))) {
                        if (i39 < aVar.f17320b) {
                            zD = aVar.d(i39);
                            i39++;
                        } else {
                            zD = false;
                        }
                        if (i10 != -1) {
                            switch (i10) {
                                case 0:
                                    i11 = (i38 + i42) & 1;
                                    if (i11 == 0) {
                                        zD = !zD;
                                    }
                                    break;
                                case 1:
                                    i11 = i38 & 1;
                                    if (i11 == 0) {
                                        zD = !zD;
                                    }
                                    break;
                                case 2:
                                    i11 = i42 % 3;
                                    if (i11 == 0) {
                                        zD = !zD;
                                    }
                                    break;
                                case 3:
                                    i11 = (i38 + i42) % 3;
                                    if (i11 == 0) {
                                        zD = !zD;
                                    }
                                    break;
                                case 4:
                                    i11 = ((i42 / 3) + (i38 / 2)) & 1;
                                    if (i11 == 0) {
                                        zD = !zD;
                                    }
                                    break;
                                case 5:
                                    int i43 = i38 * i42;
                                    i11 = (i43 % 3) + (i43 & 1);
                                    if (i11 == 0) {
                                        zD = !zD;
                                    }
                                    break;
                                case 6:
                                    z10 = true;
                                    int i44 = i38 * i42;
                                    i12 = i44 & 1;
                                    i13 = i44 % 3;
                                    i11 = (i13 + i12) & 1;
                                    if (i11 == 0) {
                                        zD = !zD;
                                    }
                                    break;
                                case 7:
                                    i13 = (i38 * i42) % 3;
                                    z10 = true;
                                    i12 = (i38 + i42) & 1;
                                    i11 = (i13 + i12) & 1;
                                    if (i11 == 0) {
                                        zD = !zD;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException(q.g("Invalid mask pattern: ", i10));
                            }
                        }
                        bVar.d(i42, zD, i38);
                    }
                }
                i38 += i40;
            }
            i40 = -i40;
            i38 += i40;
            i37 -= 2;
        }
        if (i39 == aVar.f17320b) {
            return;
        }
        throw new n("Not all bits consumed: " + i39 + '/' + aVar.f17320b);
    }

    public static int b(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11);
        int i12 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i10 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i12) {
            iNumberOfLeadingZeros2 ^= i11 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i12);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void c(int i10, int i11, k3.b bVar) throws n {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!f(bVar.a(i13, i11))) {
                throw new n();
            }
            bVar.c(i13, i11, 0);
        }
    }

    public static void d(int i10, int i11, k3.b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f3043a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.c(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void e(int i10, int i11, k3.b bVar) throws n {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!f(bVar.a(i10, i13))) {
                throw new n();
            }
            bVar.c(i10, i13, 0);
        }
    }

    public static boolean f(int i10) {
        return i10 == -1;
    }
}
