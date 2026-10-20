package i1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7832a = 0;

    static {
        int i10 = e1.r.f5066h;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x029b  */
    /* JADX WARN: Code duplicated, block: B:209:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:211:0x0405  */
    /* JADX WARN: Code duplicated, block: B:212:0x0410  */
    /* JADX WARN: Code duplicated, block: B:214:0x0413  */
    /* JADX WARN: Code duplicated, block: B:216:0x041b  */
    /* JADX WARN: Code duplicated, block: B:220:0x0428  */
    /* JADX WARN: Code duplicated, block: B:503:0x043b A[ADDED_TO_REGION, EDGE_INSN: B:503:0x043b->B:224:0x043b BREAK  A[LOOP:4: B:27:0x005e->B:505:0x005e], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x016a, code lost:
    
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List a(String str) {
        int i10;
        int i11;
        char cCharAt;
        ArrayList arrayList;
        boolean z10;
        int i12;
        char c10;
        char c11;
        ArrayList arrayList2;
        char c12;
        char cCharAt2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float[] fArr;
        int i19;
        int i20;
        long j10;
        boolean z11;
        int i21;
        long j11;
        int iFloatToRawIntBits;
        long j12;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long j13;
        int iFloatToRawIntBits2;
        long j14;
        char c13;
        char cCharAt3;
        int i22;
        long j15;
        int iFloatToRawIntBits3;
        float fIntBitsToFloat;
        str = str;
        if (str == null) {
            return r8.r.f13661a;
        }
        ArrayList arrayList3 = new ArrayList();
        float[] fArr2 = new float[64];
        arrayList3.clear();
        int length = str.length();
        int i23 = 0;
        while (true) {
            i10 = 32;
            if (i23 >= length || d7.a.o(str.charAt(i23), 32) > 0) {
                break;
            }
            i23++;
        }
        while (length > i23 && d7.a.o(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i24 = 0;
        while (i23 < length) {
            while (true) {
                i11 = i23 + 1;
                cCharAt = str.charAt(i23);
                int i25 = cCharAt | ' ';
                if ((i25 - 122) * (i25 - 97) <= 0 && i25 != 101) {
                    break;
                }
                if (i11 >= length) {
                    cCharAt = 0;
                    break;
                }
                str = str;
                i23 = i11;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i24 = 0;
                    while (true) {
                        if (i11 >= length || d7.a.o(str.charAt(i11), i10) > 0) {
                            if (i11 != length) {
                                c12 = cCharAt;
                                char cCharAt4 = str.charAt(i11);
                                boolean z12 = cCharAt4 == '-';
                                if (z12) {
                                    i13 = i11 + 1;
                                    if (i13 == length) {
                                        j15 = ((long) i13) << i10;
                                        iFloatToRawIntBits3 = Float.floatToRawIntBits(Float.NaN);
                                    } else {
                                        cCharAt2 = str.charAt(i13);
                                        if (((char) (cCharAt2 - '0')) >= '\n' && cCharAt2 != '.') {
                                            j15 = ((long) i13) << i10;
                                            iFloatToRawIntBits3 = Float.floatToRawIntBits(Float.NaN);
                                        }
                                        i11 = (int) (jFloatToRawIntBits2 >>> i21);
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j12));
                                        if (Float.isNaN(fIntBitsToFloat)) {
                                            fArr2 = fArr;
                                            i12 = 0;
                                            i24 = i14;
                                        } else {
                                            i24 = i14 + 1;
                                            fArr[i14] = fIntBitsToFloat;
                                            fArr2 = fArr;
                                            if (i24 >= fArr2.length) {
                                                float[] fArr3 = new float[i24 * 2];
                                                i12 = 0;
                                                System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
                                                fArr2 = fArr3;
                                            } else {
                                                i12 = 0;
                                            }
                                        }
                                        while (i11 < length && str.charAt(i11) == ',') {
                                            i11++;
                                        }
                                        if (i11 < length || Float.isNaN(fIntBitsToFloat)) {
                                            break;
                                        }
                                        i10 = i21;
                                        length = length;
                                        cCharAt = c12;
                                        arrayList3 = arrayList;
                                    }
                                } else {
                                    cCharAt2 = cCharAt4;
                                    i13 = i11;
                                }
                                int length2 = str.length();
                                int i26 = i13;
                                long j16 = 0;
                                while (i26 != length) {
                                    int i27 = cCharAt2 - '0';
                                    if (((char) i27) >= '\n') {
                                        break;
                                    }
                                    j16 = (j16 * 10) + ((long) i27);
                                    i26++;
                                    cCharAt2 = i26 < length2 ? str.charAt(i26) : (char) 0;
                                }
                                int i28 = i26 - i13;
                                if (i26 == length || cCharAt2 != '.') {
                                    i14 = i24;
                                    i15 = i26;
                                    i16 = i15;
                                    i17 = i28;
                                    i18 = 0;
                                } else {
                                    int i29 = i26 + 1;
                                    i16 = i29;
                                    while (true) {
                                        if (length - i16 < 4) {
                                            i14 = i24;
                                            i22 = i28;
                                            break;
                                        }
                                        i14 = i24;
                                        i22 = i28;
                                        long jCharAt = ((long) str.charAt(i16)) | (((long) str.charAt(i16 + 1)) << 16) | (((long) str.charAt(i16 + 2)) << 32) | (((long) str.charAt(i16 + 3)) << 48);
                                        long j17 = jCharAt - 13511005043687472L;
                                        int i30 = (((jCharAt + 19703549022044230L) | j17) & (-35747867511423104L)) != 0 ? -1 : (int) ((j17 * 281475406208040961L) >>> 48);
                                        if (i30 < 0) {
                                            break;
                                        }
                                        j16 = (j16 * 10000) + ((long) i30);
                                        i16 += 4;
                                        i24 = i14;
                                        i28 = i22;
                                    }
                                    if (i16 < length2) {
                                        char cCharAt5 = str.charAt(i16);
                                        while (i16 != length) {
                                            int i31 = cCharAt5 - '0';
                                            if (((char) i31) >= '\n') {
                                                break;
                                            }
                                            j16 = (j16 * 10) + ((long) i31);
                                            i16++;
                                            cCharAt5 = i16 < length2 ? str.charAt(i16) : (char) 0;
                                        }
                                        i18 = i29 - i16;
                                        i17 = i22 - i18;
                                        cCharAt2 = cCharAt5;
                                        i15 = i29;
                                    }
                                }
                                if (i17 == 0) {
                                    arrayList = arrayList3;
                                    fArr = fArr2;
                                    jFloatToRawIntBits2 = (((long) i16) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
                                    z10 = true;
                                    j12 = 4294967295L;
                                    length = length;
                                    i21 = 32;
                                } else {
                                    if ((cCharAt2 | ' ') == 101) {
                                        i19 = i16 + 1;
                                        if (i19 < length2) {
                                            cCharAt3 = str.charAt(i19);
                                            c13 = '-';
                                        } else {
                                            c13 = '-';
                                            cCharAt3 = 0;
                                        }
                                        boolean z13 = cCharAt3 == c13;
                                        if (z13 || cCharAt3 == '+') {
                                            i19 = i16 + 2;
                                        }
                                        char cCharAt6 = str.charAt(i19);
                                        i20 = 0;
                                        while (true) {
                                            if (i19 == length) {
                                                arrayList = arrayList3;
                                                fArr = fArr2;
                                                break;
                                            }
                                            int i32 = cCharAt6 - '0';
                                            arrayList = arrayList3;
                                            fArr = fArr2;
                                            if (((char) i32) >= '\n') {
                                                break;
                                            }
                                            if (i20 < 1024) {
                                                i20 = (i20 * 10) + i32;
                                            }
                                            i19++;
                                            cCharAt6 = i19 < length2 ? str.charAt(i19) : (char) 0;
                                            arrayList3 = arrayList;
                                            fArr2 = fArr;
                                        }
                                        if (z13) {
                                            i20 = -i20;
                                        }
                                        i18 += i20;
                                    } else {
                                        arrayList = arrayList3;
                                        fArr = fArr2;
                                        i19 = i16;
                                        i20 = 0;
                                    }
                                    int i33 = 19;
                                    if (i17 > 19) {
                                        char cCharAt7 = str.charAt(i13);
                                        int i34 = i13;
                                        while (i19 != length) {
                                            if (cCharAt7 != '0' && cCharAt7 != '.') {
                                                i33 = 19;
                                                break;
                                            }
                                            if (cCharAt7 == '0') {
                                                i17--;
                                            }
                                            i34++;
                                            cCharAt7 = i34 < length2 ? str.charAt(i34) : (char) 0;
                                            i33 = 19;
                                        }
                                        if (i17 > i33) {
                                            char cCharAt8 = str.charAt(i13);
                                            j10 = 0;
                                            while (true) {
                                                if (i13 == i26 || Long.compareUnsigned(j10, 1000000000000000000L) >= 0) {
                                                    break;
                                                }
                                                j10 = (j10 * 10) + ((long) (cCharAt8 - '0'));
                                                i13++;
                                                cCharAt8 = i13 < length2 ? str.charAt(i13) : (char) 0;
                                            }
                                            if (Long.compareUnsigned(j10, 1000000000000000000L) >= 0) {
                                                i18 = (i26 - i13) + i20;
                                            } else {
                                                char cCharAt9 = str.charAt(i15);
                                                int i35 = i15;
                                                for (j14 = 1000000000000000000L; i35 != i16 && Long.compareUnsigned(j10, j14) < 0; j14 = 1000000000000000000L) {
                                                    j10 = (j10 * 10) + ((long) (cCharAt9 - '0'));
                                                    i35++;
                                                    cCharAt9 = i35 < length2 ? str.charAt(i35) : (char) 0;
                                                }
                                                i18 = (i15 - i35) + i20;
                                            }
                                            z11 = true;
                                        } else {
                                            j10 = j16;
                                            z11 = false;
                                        }
                                    } else {
                                        j10 = j16;
                                        z11 = false;
                                    }
                                    if (-10 <= i18 && i18 < 11 && !z11 && Long.compareUnsigned(j10, 16777216L) <= 0) {
                                        float f10 = j10;
                                        float[] fArr4 = b.f7729a;
                                        float f11 = i18 < 0 ? f10 / fArr4[-i18] : f10 * fArr4[i18];
                                        if (z12) {
                                            f11 = -f11;
                                        }
                                        j13 = ((long) i19) << 32;
                                        iFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
                                    } else if (j10 == 0) {
                                        j13 = ((long) i19) << 32;
                                        iFloatToRawIntBits2 = Float.floatToRawIntBits(z12 ? -0.0f : 0.0f);
                                    } else {
                                        if (-126 > i18 || i18 >= 128) {
                                            z10 = true;
                                            String strSubstring = str.substring(i11, i19);
                                            d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                            i21 = 32;
                                            j11 = ((long) i19) << 32;
                                            iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring));
                                        } else {
                                            long j18 = b.f7730b[i18 + 325];
                                            int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10);
                                            long j19 = j10 << iNumberOfLeadingZeros;
                                            long j20 = j19 & 4294967295L;
                                            long j21 = j19 >>> 32;
                                            long j22 = j18 & 4294967295L;
                                            long j23 = j18 >>> 32;
                                            long j24 = j21 * j23;
                                            long j25 = j23 * j20;
                                            long j26 = j24 + ((((j21 * j22) + ((j20 * j22) >>> 32)) + (j25 & 4294967295L)) >>> 32) + (j25 >>> 32);
                                            int i36 = (int) (j26 >>> 63);
                                            long j27 = j26 >>> (i36 + 9);
                                            int i37 = iNumberOfLeadingZeros + (i36 ^ 1);
                                            long j28 = j26 & 511;
                                            if (j28 == 511 || (j28 == 0 && (3 & j27) == 1)) {
                                                z10 = true;
                                                String strSubstring2 = str.substring(i11, i19);
                                                d7.a.l(strSubstring2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                                jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.parseFloat(strSubstring2))) & 4294967295L) | (((long) i19) << 32);
                                                i21 = 32;
                                                j12 = 4294967295L;
                                            } else {
                                                z10 = true;
                                                long j29 = (j27 + 1) >>> 1;
                                                if (j29 >= 9007199254740992L) {
                                                    i37--;
                                                    j29 = 4503599627370496L;
                                                }
                                                long j30 = j29 & (-4503599627370497L);
                                                long j31 = ((((((long) i18) * 217706) >> 16) + ((long) 1024)) + ((long) 63)) - ((long) i37);
                                                if (j31 < 1 || j31 > 2046) {
                                                    i21 = 32;
                                                    j12 = 4294967295L;
                                                    String strSubstring3 = str.substring(i11, i19);
                                                    d7.a.l(strSubstring3, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                                    j11 = ((long) i19) << 32;
                                                    jFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring3));
                                                } else {
                                                    long j32 = (j31 << 52) | j30;
                                                    i21 = 32;
                                                    j11 = ((long) i19) << 32;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits((float) Double.longBitsToDouble(j32 | (z12 ? Long.MIN_VALUE : 0L)));
                                                }
                                                jFloatToRawIntBits2 = (jFloatToRawIntBits & j12) | j11;
                                            }
                                        }
                                        jFloatToRawIntBits = iFloatToRawIntBits;
                                        j12 = 4294967295L;
                                        jFloatToRawIntBits2 = (jFloatToRawIntBits & j12) | j11;
                                    }
                                    jFloatToRawIntBits2 = j13 | (((long) iFloatToRawIntBits2) & 4294967295L);
                                    i21 = 32;
                                    z10 = true;
                                    j12 = 4294967295L;
                                }
                                i11 = (int) (jFloatToRawIntBits2 >>> i21);
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j12));
                                if (Float.isNaN(fIntBitsToFloat)) {
                                    i24 = i14 + 1;
                                    fArr[i14] = fIntBitsToFloat;
                                    fArr2 = fArr;
                                    if (i24 >= fArr2.length) {
                                        float[] fArr5 = new float[i24 * 2];
                                        i12 = 0;
                                        System.arraycopy(fArr2, 0, fArr5, 0, fArr2.length);
                                        fArr2 = fArr5;
                                    } else {
                                        i12 = 0;
                                    }
                                } else {
                                    fArr2 = fArr;
                                    i12 = 0;
                                    i24 = i14;
                                }
                                while (i11 < length) {
                                    i11++;
                                }
                                if (i11 < length) {
                                    break;
                                }
                                break;
                                break;
                            }
                            c12 = cCharAt;
                            j15 = ((long) i11) << i10;
                            iFloatToRawIntBits3 = Float.floatToRawIntBits(Float.NaN);
                            arrayList = arrayList3;
                            fArr = fArr2;
                            length = length;
                            jFloatToRawIntBits2 = j15 | (((long) iFloatToRawIntBits3) & 4294967295L);
                            i21 = i10;
                            i14 = i24;
                            j12 = 4294967295L;
                            z10 = true;
                            i11 = (int) (jFloatToRawIntBits2 >>> i21);
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j12));
                            if (Float.isNaN(fIntBitsToFloat)) {
                                i24 = i14 + 1;
                                fArr[i14] = fIntBitsToFloat;
                                fArr2 = fArr;
                                if (i24 >= fArr2.length) {
                                    float[] fArr6 = new float[i24 * 2];
                                    i12 = 0;
                                    System.arraycopy(fArr2, 0, fArr6, 0, fArr2.length);
                                    fArr2 = fArr6;
                                } else {
                                    i12 = 0;
                                }
                            } else {
                                fArr2 = fArr;
                                i12 = 0;
                                i24 = i14;
                            }
                            while (i11 < length) {
                                i11++;
                            }
                            if (i11 < length) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        i11++;
                    }
                    c11 = c12;
                    c10 = 'z';
                } else {
                    arrayList = arrayList3;
                    length = length;
                    char c14 = cCharAt;
                    z10 = true;
                    i12 = 0;
                    c10 = 'z';
                    c11 = c14;
                }
                if (c11 == c10 || c11 == 'Z') {
                    arrayList2 = arrayList;
                    arrayList2.add(j.f7840c);
                } else {
                    arrayList2 = arrayList;
                    if (c11 == 'm') {
                        int i38 = i24 - 2;
                        for (int i39 = i12; i39 <= i38; i39 += 2) {
                            float f12 = fArr2[i39];
                            float f13 = fArr2[i39 + 1];
                            b0 vVar = new v(f12, f13);
                            if ((vVar instanceof n) && i39 > 0) {
                                vVar = new m(f12, f13);
                            } else if (i39 > 0) {
                                vVar = new u(f12, f13);
                            }
                            arrayList2.add(vVar);
                        }
                    } else if (c11 == 'M') {
                        int i40 = i24 - 2;
                        for (int i41 = i12; i41 <= i40; i41 += 2) {
                            float f14 = fArr2[i41];
                            float f15 = fArr2[i41 + 1];
                            b0 nVar = new n(f14, f15);
                            if (i41 > 0) {
                                nVar = new m(f14, f15);
                            } else if ((nVar instanceof v) && i41 > 0) {
                                nVar = new u(f14, f15);
                            }
                            arrayList2.add(nVar);
                        }
                    } else if (c11 == 'l') {
                        int i42 = i24 - 2;
                        for (int i43 = i12; i43 <= i42; i43 += 2) {
                            float f16 = fArr2[i43];
                            float f17 = fArr2[i43 + 1];
                            b0 uVar = new u(f16, f17);
                            if ((uVar instanceof n) && i43 > 0) {
                                uVar = new m(f16, f17);
                            } else if ((uVar instanceof v) && i43 > 0) {
                                uVar = new u(f16, f17);
                            }
                            arrayList2.add(uVar);
                        }
                    } else if (c11 == 'L') {
                        int i44 = i24 - 2;
                        for (int i45 = i12; i45 <= i44; i45 += 2) {
                            float f18 = fArr2[i45];
                            float f19 = fArr2[i45 + 1];
                            b0 mVar = new m(f18, f19);
                            if ((mVar instanceof n) && i45 > 0) {
                                mVar = new m(f18, f19);
                            } else if ((mVar instanceof v) && i45 > 0) {
                                mVar = new u(f18, f19);
                            }
                            arrayList2.add(mVar);
                        }
                    } else if (c11 == 'h') {
                        int i46 = i24 - 1;
                        for (int i47 = i12; i47 <= i46; i47++) {
                            float f20 = fArr2[i47];
                            b0 tVar = new t(f20);
                            if ((tVar instanceof n) && i47 > 0) {
                                tVar = new m(f20, fArr2[i47 + 1]);
                            } else if ((tVar instanceof v) && i47 > 0) {
                                tVar = new u(f20, fArr2[i47 + 1]);
                            }
                            arrayList2.add(tVar);
                        }
                    } else if (c11 == 'H') {
                        int i48 = i24 - 1;
                        for (int i49 = i12; i49 <= i48; i49++) {
                            float f21 = fArr2[i49];
                            b0 lVar = new l(f21);
                            if ((lVar instanceof n) && i49 > 0) {
                                lVar = new m(f21, fArr2[i49 + 1]);
                            } else if ((lVar instanceof v) && i49 > 0) {
                                lVar = new u(f21, fArr2[i49 + 1]);
                            }
                            arrayList2.add(lVar);
                        }
                    } else if (c11 == 'v') {
                        int i50 = i24 - 1;
                        for (int i51 = i12; i51 <= i50; i51++) {
                            float f22 = fArr2[i51];
                            b0 zVar = new z(f22);
                            if ((zVar instanceof n) && i51 > 0) {
                                zVar = new m(f22, fArr2[i51 + 1]);
                            } else if ((zVar instanceof v) && i51 > 0) {
                                zVar = new u(f22, fArr2[i51 + 1]);
                            }
                            arrayList2.add(zVar);
                        }
                    } else if (c11 == 'V') {
                        int i52 = i24 - 1;
                        for (int i53 = i12; i53 <= i52; i53++) {
                            float f23 = fArr2[i53];
                            b0 a0Var = new a0(f23);
                            if ((a0Var instanceof n) && i53 > 0) {
                                a0Var = new m(f23, fArr2[i53 + 1]);
                            } else if ((a0Var instanceof v) && i53 > 0) {
                                a0Var = new u(f23, fArr2[i53 + 1]);
                            }
                            arrayList2.add(a0Var);
                        }
                    } else if (c11 == 'c') {
                        int i54 = i24 - 6;
                        for (int i55 = i12; i55 <= i54; i55 += 6) {
                            float f24 = fArr2[i55];
                            float f25 = fArr2[i55 + 1];
                            b0 sVar = new s(f24, f25, fArr2[i55 + 2], fArr2[i55 + 3], fArr2[i55 + 4], fArr2[i55 + 5]);
                            if ((sVar instanceof n) && i55 > 0) {
                                sVar = new m(f24, f25);
                            } else if ((sVar instanceof v) && i55 > 0) {
                                sVar = new u(f24, f25);
                            }
                            arrayList2.add(sVar);
                        }
                    } else if (c11 == 'C') {
                        int i56 = i24 - 6;
                        for (int i57 = 0; i57 <= i56; i57 += 6) {
                            float f26 = fArr2[i57];
                            float f27 = fArr2[i57 + 1];
                            b0 kVar = new k(f26, f27, fArr2[i57 + 2], fArr2[i57 + 3], fArr2[i57 + 4], fArr2[i57 + 5]);
                            if ((kVar instanceof n) && i57 > 0) {
                                kVar = new m(f26, f27);
                            } else if ((kVar instanceof v) && i57 > 0) {
                                kVar = new u(f26, f27);
                            }
                            arrayList2.add(kVar);
                        }
                    } else if (c11 == 's') {
                        int i58 = i24 - 4;
                        for (int i59 = 0; i59 <= i58; i59 += 4) {
                            float f28 = fArr2[i59];
                            float f29 = fArr2[i59 + 1];
                            b0 xVar = new x(f28, f29, fArr2[i59 + 2], fArr2[i59 + 3]);
                            if ((xVar instanceof n) && i59 > 0) {
                                xVar = new m(f28, f29);
                            } else if ((xVar instanceof v) && i59 > 0) {
                                xVar = new u(f28, f29);
                            }
                            arrayList2.add(xVar);
                        }
                    } else if (c11 == 'S') {
                        int i60 = i24 - 4;
                        for (int i61 = 0; i61 <= i60; i61 += 4) {
                            float f30 = fArr2[i61];
                            float f31 = fArr2[i61 + 1];
                            b0 pVar = new p(f30, f31, fArr2[i61 + 2], fArr2[i61 + 3]);
                            if ((pVar instanceof n) && i61 > 0) {
                                pVar = new m(f30, f31);
                            } else if ((pVar instanceof v) && i61 > 0) {
                                pVar = new u(f30, f31);
                            }
                            arrayList2.add(pVar);
                        }
                    } else if (c11 == 'q') {
                        int i62 = i24 - 4;
                        for (int i63 = 0; i63 <= i62; i63 += 4) {
                            float f32 = fArr2[i63];
                            float f33 = fArr2[i63 + 1];
                            b0 wVar = new w(f32, f33, fArr2[i63 + 2], fArr2[i63 + 3]);
                            if ((wVar instanceof n) && i63 > 0) {
                                wVar = new m(f32, f33);
                            } else if ((wVar instanceof v) && i63 > 0) {
                                wVar = new u(f32, f33);
                            }
                            arrayList2.add(wVar);
                        }
                    } else if (c11 == 'Q') {
                        int i64 = i24 - 4;
                        for (int i65 = 0; i65 <= i64; i65 += 4) {
                            float f34 = fArr2[i65];
                            float f35 = fArr2[i65 + 1];
                            b0 oVar = new o(f34, f35, fArr2[i65 + 2], fArr2[i65 + 3]);
                            if ((oVar instanceof n) && i65 > 0) {
                                oVar = new m(f34, f35);
                            } else if ((oVar instanceof v) && i65 > 0) {
                                oVar = new u(f34, f35);
                            }
                            arrayList2.add(oVar);
                        }
                    } else if (c11 == 't') {
                        int i66 = i24 - 2;
                        for (int i67 = 0; i67 <= i66; i67 += 2) {
                            float f36 = fArr2[i67];
                            float f37 = fArr2[i67 + 1];
                            b0 yVar = new y(f36, f37);
                            if ((yVar instanceof n) && i67 > 0) {
                                yVar = new m(f36, f37);
                            } else if ((yVar instanceof v) && i67 > 0) {
                                yVar = new u(f36, f37);
                            }
                            arrayList2.add(yVar);
                        }
                    } else if (c11 == 'T') {
                        int i68 = i24 - 2;
                        for (int i69 = 0; i69 <= i68; i69 += 2) {
                            float f38 = fArr2[i69];
                            float f39 = fArr2[i69 + 1];
                            b0 qVar = new q(f38, f39);
                            if ((qVar instanceof n) && i69 > 0) {
                                qVar = new m(f38, f39);
                            } else if ((qVar instanceof v) && i69 > 0) {
                                qVar = new u(f38, f39);
                            }
                            arrayList2.add(qVar);
                        }
                    } else if (c11 == 'a') {
                        int i70 = i24 - 7;
                        for (int i71 = 0; i71 <= i70; i71 += 7) {
                            int i72 = i71 + 1;
                            b0 rVar = new r(fArr2[i71], fArr2[i72], fArr2[i71 + 2], Float.compare(fArr2[i71 + 3], 0.0f) != 0 ? z10 : false, Float.compare(fArr2[i71 + 4], 0.0f) != 0 ? z10 : false, fArr2[i71 + 5], fArr2[i71 + 6]);
                            if ((rVar instanceof n) && i71 > 0) {
                                rVar = new m(fArr2[i71], fArr2[i72]);
                            } else if ((rVar instanceof v) && i71 > 0) {
                                rVar = new u(fArr2[i71], fArr2[i72]);
                            }
                            arrayList2.add(rVar);
                        }
                    } else {
                        if (c11 != 'A') {
                            throw new IllegalArgumentException("Unknown command for: " + c11);
                        }
                        int i73 = i24 - 7;
                        for (int i74 = 0; i74 <= i73; i74 += 7) {
                            int i75 = i74 + 1;
                            b0 iVar = new i(fArr2[i74], fArr2[i75], fArr2[i74 + 2], Float.compare(fArr2[i74 + 3], 0.0f) != 0 ? z10 : false, Float.compare(fArr2[i74 + 4], 0.0f) != 0 ? z10 : false, fArr2[i74 + 5], fArr2[i74 + 6]);
                            if ((iVar instanceof n) && i74 > 0) {
                                iVar = new m(fArr2[i74], fArr2[i75]);
                            } else if ((iVar instanceof v) && i74 > 0) {
                                iVar = new u(fArr2[i74], fArr2[i75]);
                            }
                            arrayList2.add(iVar);
                        }
                    }
                }
                arrayList3 = arrayList2;
                i23 = i11;
                length = length;
                i10 = 32;
            } else {
                i23 = i11;
            }
        }
        return arrayList3;
    }

    public static final boolean b(e1.l lVar) {
        if (lVar instanceof e1.l) {
            if (e1.g0.b(lVar.f5044c, 5) || e1.g0.b(lVar.f5044c, 3)) {
                return true;
            }
        } else if (lVar == null) {
            return true;
        }
        return false;
    }
}
