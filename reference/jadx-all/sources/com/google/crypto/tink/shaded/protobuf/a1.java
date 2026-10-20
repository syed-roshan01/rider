package com.google.crypto.tink.shaded.protobuf;

import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import k6.w4;
import o7.i2;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements j1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f3506o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f3507p = w1.m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f3508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f3509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f3512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f3515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c1 f3518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n0 f3519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p1 f3520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t0 f3521n;

    public a1(int[] iArr, Object[] objArr, int i10, int i11, b bVar, boolean z10, int[] iArr2, int i12, int i13, c1 c1Var, n0 n0Var, p1 p1Var, u uVar, t0 t0Var) {
        this.f3508a = iArr;
        this.f3509b = objArr;
        this.f3510c = i10;
        this.f3511d = i11;
        this.f3513f = bVar instanceof b0;
        this.f3514g = z10;
        this.f3515h = iArr2;
        this.f3516i = i12;
        this.f3517j = i13;
        this.f3518k = c1Var;
        this.f3519l = n0Var;
        this.f3520m = p1Var;
        this.f3512e = bVar;
        this.f3521n = t0Var;
    }

    public static a1 C(v0 v0Var, c1 c1Var, n0 n0Var, p1 p1Var, u uVar, t0 t0Var) {
        if (v0Var instanceof i1) {
            return D((i1) v0Var, c1Var, n0Var, p1Var, uVar, t0Var);
        }
        a7.a.w(v0Var);
        throw null;
    }

    public static a1 D(i1 i1Var, c1 c1Var, n0 n0Var, p1 p1Var, u uVar, t0 t0Var) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        char cCharAt;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        char cCharAt5;
        int i19;
        char cCharAt6;
        int i20;
        char cCharAt7;
        int i21;
        char cCharAt8;
        int i22;
        int i23;
        int i24;
        int i25;
        int iObjectFieldOffset;
        int i26;
        int i27;
        int iObjectFieldOffset2;
        Field fieldQ;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        Field fieldQ2;
        Field fieldQ3;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        char cCharAt12;
        int i34;
        char cCharAt13;
        int i35 = 0;
        boolean z10 = i1Var.d() == 2;
        String strC = i1Var.c();
        int length = strC.length();
        char c10 = 55296;
        if (strC.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i10 = i36 + 1;
                if (strC.charAt(i36) < 55296) {
                    break;
                }
                i36 = i10;
            }
        } else {
            i10 = 1;
        }
        int i37 = i10 + 1;
        int iCharAt4 = strC.charAt(i10);
        if (iCharAt4 >= 55296) {
            int i38 = iCharAt4 & 8191;
            int i39 = 13;
            while (true) {
                i34 = i37 + 1;
                cCharAt13 = strC.charAt(i37);
                if (cCharAt13 < 55296) {
                    break;
                }
                i38 |= (cCharAt13 & 8191) << i39;
                i39 += 13;
                i37 = i34;
            }
            iCharAt4 = i38 | (cCharAt13 << i39);
            i37 = i34;
        }
        if (iCharAt4 == 0) {
            i13 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            iCharAt3 = 0;
            iArr = f3506o;
            i12 = 0;
        } else {
            int i40 = i37 + 1;
            int iCharAt5 = strC.charAt(i37);
            if (iCharAt5 >= 55296) {
                int i41 = iCharAt5 & 8191;
                int i42 = 13;
                while (true) {
                    i21 = i40 + 1;
                    cCharAt8 = strC.charAt(i40);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i21;
                }
                iCharAt5 = i41 | (cCharAt8 << i42);
                i40 = i21;
            }
            int i43 = i40 + 1;
            int iCharAt6 = strC.charAt(i40);
            if (iCharAt6 >= 55296) {
                int i44 = iCharAt6 & 8191;
                int i45 = 13;
                while (true) {
                    i20 = i43 + 1;
                    cCharAt7 = strC.charAt(i43);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i20;
                }
                iCharAt6 = i44 | (cCharAt7 << i45);
                i43 = i20;
            }
            int i46 = i43 + 1;
            int iCharAt7 = strC.charAt(i43);
            if (iCharAt7 >= 55296) {
                int i47 = iCharAt7 & 8191;
                int i48 = 13;
                while (true) {
                    i19 = i46 + 1;
                    cCharAt6 = strC.charAt(i46);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i19;
                }
                iCharAt7 = i47 | (cCharAt6 << i48);
                i46 = i19;
            }
            int i49 = i46 + 1;
            iCharAt = strC.charAt(i46);
            if (iCharAt >= 55296) {
                int i50 = iCharAt & 8191;
                int i51 = 13;
                while (true) {
                    i18 = i49 + 1;
                    cCharAt5 = strC.charAt(i49);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i18;
                }
                iCharAt = i50 | (cCharAt5 << i51);
                i49 = i18;
            }
            int i52 = i49 + 1;
            int iCharAt8 = strC.charAt(i49);
            if (iCharAt8 >= 55296) {
                int i53 = iCharAt8 & 8191;
                int i54 = 13;
                while (true) {
                    i17 = i52 + 1;
                    cCharAt4 = strC.charAt(i52);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i17;
                }
                iCharAt8 = i53 | (cCharAt4 << i54);
                i52 = i17;
            }
            int i55 = i52 + 1;
            iCharAt2 = strC.charAt(i52);
            if (iCharAt2 >= 55296) {
                int i56 = iCharAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i16 = i55 + 1;
                    cCharAt3 = strC.charAt(i55);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i16;
                }
                iCharAt2 = i56 | (cCharAt3 << i57);
                i55 = i16;
            }
            int i58 = i55 + 1;
            int iCharAt9 = strC.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = 13;
                while (true) {
                    i15 = i58 + 1;
                    cCharAt2 = strC.charAt(i58);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i15;
                }
                iCharAt9 = i59 | (cCharAt2 << i60);
                i58 = i15;
            }
            int i61 = i58 + 1;
            iCharAt3 = strC.charAt(i58);
            if (iCharAt3 >= 55296) {
                int i62 = iCharAt3 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i14 = i63 + 1;
                    cCharAt = strC.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i62 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i63 = i14;
                }
                iCharAt3 = i62 | (cCharAt << i64);
                i61 = i14;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt9];
            i11 = (iCharAt5 * 2) + iCharAt6;
            i12 = iCharAt7;
            i13 = iCharAt8;
            iArr = iArr2;
            i35 = iCharAt5;
            i37 = i61;
        }
        Object[] objArrB = i1Var.b();
        Class<?> cls = i1Var.a().getClass();
        int[] iArr3 = new int[i13 * 3];
        Object[] objArr = new Object[i13 * 2];
        int i65 = iCharAt2 + iCharAt3;
        int i66 = i65;
        int i67 = iCharAt3;
        int i68 = 0;
        int i69 = 0;
        while (i37 < length) {
            int i70 = i37 + 1;
            int iCharAt10 = strC.charAt(i37);
            if (iCharAt10 >= c10) {
                int i71 = iCharAt10 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i33 = i72 + 1;
                    cCharAt12 = strC.charAt(i72);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i71 |= (cCharAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i33;
                }
                iCharAt10 = i71 | (cCharAt12 << i73);
                i22 = i33;
            } else {
                i22 = i70;
            }
            int i74 = i22 + 1;
            int iCharAt11 = strC.charAt(i22);
            if (iCharAt11 >= c10) {
                int i75 = iCharAt11 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i32 = i76 + 1;
                    cCharAt11 = strC.charAt(i76);
                    i23 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i77;
                    i77 += 13;
                    i76 = i32;
                    length = i23;
                }
                iCharAt11 = i75 | (cCharAt11 << i77);
                i24 = i32;
            } else {
                i23 = length;
                i24 = i74;
            }
            int i78 = iCharAt11 & 255;
            int i79 = i65;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            Unsafe unsafe = f3507p;
            int i80 = iCharAt3;
            if (i78 >= 51) {
                int i81 = i24 + 1;
                int iCharAt12 = strC.charAt(i24);
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i31 = i83 + 1;
                        cCharAt10 = strC.charAt(i83);
                        i25 = iCharAt;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i82 |= (cCharAt10 & 8191) << i84;
                        i84 += 13;
                        i83 = i31;
                        iCharAt = i25;
                    }
                    iCharAt12 = i82 | (cCharAt10 << i84);
                    i29 = i31;
                } else {
                    i25 = iCharAt;
                    i29 = i81;
                }
                int i85 = i78 - 51;
                int i86 = i29;
                if (i85 == 9 || i85 == 17) {
                    i30 = 2;
                    objArr[((i69 / 3) * 2) + 1] = objArrB[i11];
                    i11++;
                } else {
                    if (i85 == 12 && !z10) {
                        objArr[((i69 / 3) * 2) + 1] = objArrB[i11];
                        i11++;
                    }
                    i30 = 2;
                }
                int i87 = iCharAt12 * i30;
                Object obj = objArrB[i87];
                if (obj instanceof Field) {
                    fieldQ2 = (Field) obj;
                } else {
                    fieldQ2 = Q(cls, (String) obj);
                    objArrB[i87] = fieldQ2;
                }
                int i88 = i11;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldQ2);
                int i89 = i87 + 1;
                Object obj2 = objArrB[i89];
                if (obj2 instanceof Field) {
                    fieldQ3 = (Field) obj2;
                } else {
                    fieldQ3 = Q(cls, (String) obj2);
                    objArrB[i89] = fieldQ3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldQ3);
                i11 = i88;
                i27 = 0;
                i26 = i86;
            } else {
                i25 = iCharAt;
                int i90 = i11 + 1;
                Field fieldQ4 = Q(cls, (String) objArrB[i11]);
                if (i78 == 9 || i78 == 17) {
                    objArr[((i69 / 3) * 2) + 1] = fieldQ4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i28 = i11 + 2;
                        objArr[((i69 / 3) * 2) + 1] = objArrB[i90];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        if (!z10) {
                            i28 = i11 + 2;
                            objArr[((i69 / 3) * 2) + 1] = objArrB[i90];
                        }
                    } else if (i78 == 50) {
                        int i91 = i67 + 1;
                        iArr[i67] = i69;
                        int i92 = (i69 / 3) * 2;
                        int i93 = i11 + 2;
                        objArr[i92] = objArrB[i90];
                        if ((iCharAt11 & 2048) != 0) {
                            i90 = i11 + 3;
                            objArr[i92 + 1] = objArrB[i93];
                            i67 = i91;
                        } else {
                            i67 = i91;
                            i90 = i93;
                        }
                    }
                    i90 = i28;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldQ4);
                if ((iCharAt11 & 4096) != 4096 || i78 > 17) {
                    iObjectFieldOffset = 1048575;
                    i26 = i24;
                    i27 = 0;
                } else {
                    int i94 = i24 + 1;
                    int iCharAt13 = strC.charAt(i24);
                    if (iCharAt13 >= 55296) {
                        int i95 = iCharAt13 & 8191;
                        int i96 = 13;
                        while (true) {
                            i26 = i94 + 1;
                            cCharAt9 = strC.charAt(i94);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i95 |= (cCharAt9 & 8191) << i96;
                            i96 += 13;
                            i94 = i26;
                        }
                        iCharAt13 = i95 | (cCharAt9 << i96);
                    } else {
                        i26 = i94;
                    }
                    int i97 = (iCharAt13 / 32) + (i35 * 2);
                    Object obj3 = objArrB[i97];
                    if (obj3 instanceof Field) {
                        fieldQ = (Field) obj3;
                    } else {
                        fieldQ = Q(cls, (String) obj3);
                        objArrB[i97] = fieldQ;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldQ);
                    i27 = iCharAt13 % 32;
                }
                if (i78 >= 18 && i78 <= 49) {
                    iArr[i66] = iObjectFieldOffset3;
                    i66++;
                }
                i11 = i90;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i98 = i69 + 1;
            iArr3[i69] = iCharAt10;
            int i99 = i69 + 2;
            iArr3[i98] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i78 << 20) | iObjectFieldOffset2;
            i69 += 3;
            iArr3[i99] = (i27 << 20) | iObjectFieldOffset;
            i65 = i79;
            i12 = i12;
            length = i23;
            i37 = i26;
            iCharAt3 = i80;
            iCharAt = i25;
            c10 = 55296;
        }
        return new a1(iArr3, objArr, i12, iCharAt, i1Var.a(), z10, iArr, iCharAt3, i65, c1Var, n0Var, p1Var, uVar, t0Var);
    }

    public static long E(int i10) {
        return i10 & 1048575;
    }

    public static int F(Object obj, long j10) {
        return ((Integer) w1.f3633c.i(obj, j10)).intValue();
    }

    public static long G(Object obj, long j10) {
        return ((Long) w1.f3633c.i(obj, j10)).longValue();
    }

    public static Field Q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbR = a7.a.r("Field ", str, " for ");
            sbR.append(cls.getName());
            sbR.append(" not found. Known fields are ");
            sbR.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbR.toString());
        }
    }

    public static int W(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void Z(int i10, Object obj, w4 w4Var) {
        if (obj instanceof String) {
            w4Var.Q(i10, (String) obj);
        } else {
            w4Var.l(i10, (l) obj);
        }
    }

    public static void l(Object obj) {
        if (t(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof b0) {
            return ((b0) obj).o();
        }
        return true;
    }

    public static List v(Object obj, long j10) {
        return (List) w1.f3633c.i(obj, j10);
    }

    public final Object A(int i10, Object obj) {
        j1 j1VarP = p(i10);
        long jX = X(i10) & 1048575;
        if (!s(i10, obj)) {
            return j1VarP.f();
        }
        Object object = f3507p.getObject(obj, jX);
        if (t(object)) {
            return object;
        }
        Object objF = j1VarP.f();
        if (object != null) {
            j1VarP.a(objF, object);
        }
        return objF;
    }

    public final Object B(Object obj, int i10, int i11) {
        j1 j1VarP = p(i11);
        if (!u(obj, i10, i11)) {
            return j1VarP.f();
        }
        Object object = f3507p.getObject(obj, X(i11) & 1048575);
        if (t(object)) {
            return object;
        }
        Object objF = j1VarP.f();
        if (object != null) {
            j1VarP.a(objF, object);
        }
        return objF;
    }

    public final void H(Object obj, int i10, long j10) {
        Object objO = o(i10);
        Unsafe unsafe = f3507p;
        Object object = unsafe.getObject(obj, j10);
        this.f3521n.getClass();
        if (t0.c(object)) {
            s0 s0VarE = t0.e();
            t0.d(s0VarE, object);
            unsafe.putObject(obj, j10, s0VarE);
        }
        t0.a(objO);
        throw null;
    }

    public final int I(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, e eVar) throws h0 {
        long j11 = this.f3508a[i17 + 2] & 1048575;
        Unsafe unsafe = f3507p;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(h6.g.j(i10, bArr)));
                int i18 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(h6.g.p(i10, bArr)));
                int i19 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iN = h6.g.N(bArr, i10, eVar);
                unsafe.putObject(obj, j10, Long.valueOf(eVar.f3531b));
                unsafe.putInt(obj, j11, i13);
                return iN;
            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iL = h6.g.L(bArr, i10, eVar);
                unsafe.putObject(obj, j10, Integer.valueOf(eVar.f3530a));
                unsafe.putInt(obj, j11, i13);
                return iL;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(h6.g.n(i10, bArr)));
                int i20 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(h6.g.l(i10, bArr)));
                int i21 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iN2 = h6.g.N(bArr, i10, eVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(eVar.f3531b != 0));
                unsafe.putInt(obj, j11, i13);
                return iN2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iL2 = h6.g.L(bArr, i10, eVar);
                int i22 = eVar.f3530a;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !z1.e(bArr, iL2, iL2 + i22)) {
                        throw h0.b();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iL2, i22, f0.f3534a));
                    iL2 += i22;
                }
                unsafe.putInt(obj, j11, i13);
                return iL2;
            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                if (i14 != 2) {
                    return i10;
                }
                Object objB = B(obj, i13, i17);
                int iS0 = h6.g.s0(objB, p(i17), bArr, i10, i11, eVar);
                V(obj, i13, i17, objB);
                return iS0;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iH = h6.g.h(bArr, i10, eVar);
                unsafe.putObject(obj, j10, eVar.f3532c);
                unsafe.putInt(obj, j11, i13);
                return iH;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iL3 = h6.g.L(bArr, i10, eVar);
                int i23 = eVar.f3530a;
                n(i17);
                unsafe.putObject(obj, j10, Integer.valueOf(i23));
                unsafe.putInt(obj, j11, i13);
                return iL3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iL4 = h6.g.L(bArr, i10, eVar);
                unsafe.putObject(obj, j10, Integer.valueOf(o.b(eVar.f3530a)));
                unsafe.putInt(obj, j11, i13);
                return iL4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iN3 = h6.g.N(bArr, i10, eVar);
                unsafe.putObject(obj, j10, Long.valueOf(o.c(eVar.f3531b)));
                unsafe.putInt(obj, j11, i13);
                return iN3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                Object objB2 = B(obj, i13, i17);
                int iR0 = h6.g.r0(objB2, p(i17), bArr, i10, i11, (i12 & (-8)) | 4, eVar);
                V(obj, i13, i17, objB2);
                return iR0;
            default:
                return i10;
        }
    }

    public final int J(Object obj, byte[] bArr, int i10, int i11, int i12, e eVar) {
        Unsafe unsafe;
        int i13;
        int iK;
        int i14;
        int iT;
        int iT2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int iN;
        int i28;
        int i29;
        this = this;
        bArr = bArr;
        i11 = i11;
        int i30 = i12;
        eVar = eVar;
        l(obj);
        Unsafe unsafe2 = f3507p;
        int iJ = i10;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 1048575;
        while (true) {
            if (iJ < i11) {
                int i36 = iJ + 1;
                byte b10 = bArr[iJ];
                if (b10 < 0) {
                    iK = h6.g.K(b10, bArr, i36, eVar);
                    i13 = eVar.f3530a;
                } else {
                    i13 = b10;
                    iK = i36;
                }
                int i37 = i13 >>> 3;
                int i38 = i13 & 7;
                int i39 = this.f3511d;
                int i40 = iK;
                int i41 = this.f3510c;
                int i42 = i13;
                if (i37 > i31) {
                    iT2 = (i37 < i41 || i37 > i39) ? -1 : this.T(i37, i32 / 3);
                    i15 = -1;
                    i14 = 0;
                } else {
                    if (i37 < i41 || i37 > i39) {
                        i14 = 0;
                        iT = -1;
                    } else {
                        i14 = 0;
                        iT = this.T(i37, 0);
                    }
                    iT2 = iT;
                    i15 = -1;
                }
                if (iT2 == i15) {
                    i16 = i35;
                    i17 = i37;
                    i18 = i14;
                    unsafe = unsafe2;
                    i12 = i30;
                    i19 = i40;
                    i20 = i42;
                    i21 = i34;
                } else {
                    int[] iArr = this.f3508a;
                    int i43 = iArr[iT2 + 1];
                    int iW = W(i43);
                    long j10 = i43 & 1048575;
                    if (iW <= 17) {
                        int i44 = iArr[iT2 + 2];
                        int i45 = 1 << (i44 >>> 20);
                        int i46 = i44 & 1048575;
                        if (i46 != i35) {
                            if (i35 != 1048575) {
                                unsafe2.putInt(obj, i35, i34);
                            }
                            i23 = i46;
                            i22 = unsafe2.getInt(obj, i46);
                        } else {
                            i22 = i34;
                            i23 = i35;
                        }
                        switch (iW) {
                            case 0:
                                i17 = i37;
                                i24 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 1) {
                                    w1.r(obj, j10, h6.g.j(i24, bArr));
                                    iJ = i24 + 8;
                                    i34 = i22 | i45;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case 1:
                                i17 = i37;
                                i24 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 5) {
                                    w1.s(obj, j10, h6.g.p(i24, bArr));
                                    iJ = i24 + 4;
                                    i34 = i22 | i45;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case 2:
                            case 3:
                                i17 = i37;
                                i24 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 0) {
                                    iN = h6.g.N(bArr, i24, eVar);
                                    unsafe2.putLong(obj, j10, eVar.f3531b);
                                    i34 = i22 | i45;
                                    iJ = iN;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case 4:
                            case 11:
                                i17 = i37;
                                i24 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 0) {
                                    iJ = h6.g.L(bArr, i24, eVar);
                                    unsafe2.putInt(obj, j10, eVar.f3530a);
                                    i34 = i22 | i45;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case 5:
                            case Code.UNAVAILABLE /* 14 */:
                                i17 = i37;
                                i28 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 1) {
                                    unsafe2.putLong(obj, j10, h6.g.n(i28, bArr));
                                    iJ = i28 + 8;
                                    i34 = i22 | i45;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i24 = i28;
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case 6:
                            case 13:
                                i17 = i37;
                                i28 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 5) {
                                    unsafe2.putInt(obj, j10, h6.g.l(i28, bArr));
                                    iJ = i28 + 4;
                                    i34 = i22 | i45;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i24 = i28;
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case 7:
                                i17 = i37;
                                i28 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 0) {
                                    int iN2 = h6.g.N(bArr, i28, eVar);
                                    w1.n(obj, j10, eVar.f3531b != 0);
                                    i34 = i22 | i45;
                                    iJ = iN2;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i24 = i28;
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case 8:
                                i17 = i37;
                                i28 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 2) {
                                    iJ = (i43 & 536870912) == 0 ? h6.g.F(bArr, i28, eVar) : h6.g.I(bArr, i28, eVar);
                                    unsafe2.putObject(obj, j10, eVar.f3532c);
                                    i34 = i22 | i45;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i24 = i28;
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case 9:
                                i17 = i37;
                                i28 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 2) {
                                    Object objA = this.A(i27, obj);
                                    iJ = h6.g.s0(objA, this.p(i27), bArr, i28, i11, eVar);
                                    this.U(i27, obj, objA);
                                    i34 = i22 | i45;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i24 = i28;
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case 10:
                                i17 = i37;
                                i28 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 2) {
                                    iJ = h6.g.h(bArr, i28, eVar);
                                    unsafe2.putObject(obj, j10, eVar.f3532c);
                                    i34 = i22 | i45;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i24 = i28;
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case 12:
                                i17 = i37;
                                i28 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 0) {
                                    iJ = h6.g.L(bArr, i28, eVar);
                                    int i47 = eVar.f3530a;
                                    this.n(i27);
                                    unsafe2.putInt(obj, j10, i47);
                                    i34 = i22 | i45;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i24 = i28;
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case 15:
                                i17 = i37;
                                i28 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 0) {
                                    iJ = h6.g.L(bArr, i28, eVar);
                                    unsafe2.putInt(obj, j10, o.b(eVar.f3530a));
                                    i34 = i22 | i45;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i24 = i28;
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case Code.UNAUTHENTICATED /* 16 */:
                                i17 = i37;
                                i28 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                if (i38 == 0) {
                                    iN = h6.g.N(bArr, i28, eVar);
                                    unsafe2.putLong(obj, j10, o.c(eVar.f3531b));
                                    i34 = i22 | i45;
                                    iJ = iN;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i24 = i28;
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (i38 == 3) {
                                    Object objA2 = this.A(iT2, obj);
                                    i26 = i23;
                                    i25 = i42;
                                    i27 = iT2;
                                    i17 = i37;
                                    iJ = h6.g.r0(objA2, this.p(iT2), bArr, i40, i11, (i37 << 3) | 4, eVar);
                                    this.U(i27, obj, objA2);
                                    i34 = i22 | i45;
                                    i32 = i27;
                                    i31 = i17;
                                    i33 = i25;
                                    i35 = i26;
                                    i30 = i12;
                                } else {
                                    i17 = i37;
                                    i28 = i40;
                                    i25 = i42;
                                    i26 = i23;
                                    i27 = iT2;
                                    i24 = i28;
                                    i19 = i24;
                                    unsafe = unsafe2;
                                    i18 = i27;
                                    i20 = i25;
                                    i16 = i26;
                                    i12 = i12;
                                    i21 = i22;
                                }
                                break;
                            default:
                                i17 = i37;
                                i24 = i40;
                                i25 = i42;
                                i26 = i23;
                                i27 = iT2;
                                i19 = i24;
                                unsafe = unsafe2;
                                i18 = i27;
                                i20 = i25;
                                i16 = i26;
                                i12 = i12;
                                i21 = i22;
                                break;
                        }
                    } else {
                        i17 = i37;
                        int i48 = iT2;
                        if (iW != 27) {
                            i21 = i34;
                            i16 = i35;
                            if (iW <= 49) {
                                unsafe = unsafe2;
                                i18 = i48;
                                iJ = L(obj, bArr, i40, i11, i42, i38, i48, i43, iW, j10, eVar);
                                if (iJ != i40) {
                                    i30 = i12;
                                    i31 = i17;
                                    i33 = i42;
                                } else {
                                    i19 = iJ;
                                }
                                i34 = i21;
                                i35 = i16;
                                unsafe2 = unsafe;
                                i32 = i18;
                            } else {
                                i29 = i40;
                                unsafe = unsafe2;
                                i18 = i48;
                                if (iW != 50) {
                                    iJ = I(obj, bArr, i29, i11, i42, i17, i38, i43, iW, j10, i18, eVar);
                                    if (iJ != i29) {
                                        this = this;
                                        bArr = bArr;
                                        i11 = i11;
                                        i30 = i12;
                                        eVar = eVar;
                                        i32 = i18;
                                        i31 = i17;
                                        i33 = i42;
                                        i34 = i21;
                                        i35 = i16;
                                        unsafe2 = unsafe;
                                    } else {
                                        i19 = iJ;
                                        i18 = i18;
                                    }
                                } else if (i38 == 2) {
                                    H(obj, i18, j10);
                                    throw null;
                                }
                            }
                            i20 = i42;
                        } else if (i38 == 2) {
                            c cVar = (c) ((e0) unsafe2.getObject(obj, j10));
                            boolean zG = cVar.g();
                            c cVar2 = cVar;
                            if (!zG) {
                                int size = cVar.size();
                                e0 e0VarA = cVar.a(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj, j10, e0VarA);
                                cVar2 = e0VarA;
                            }
                            iJ = h6.g.t(this.p(i48), i42, bArr, i40, i11, cVar2, eVar);
                            i11 = i11;
                            i32 = i48;
                            i31 = i17;
                            i33 = i42;
                            i34 = i34;
                            i35 = i35;
                            i30 = i12;
                        } else {
                            i21 = i34;
                            i16 = i35;
                            i29 = i40;
                            unsafe = unsafe2;
                            i18 = i48;
                        }
                        i19 = i29;
                        i20 = i42;
                    }
                }
                if (i20 != i12 || i12 == 0) {
                    b0 b0Var = (b0) obj;
                    o1 o1VarC = b0Var.unknownFields;
                    if (o1VarC == o1.f3602f) {
                        o1VarC = o1.c();
                        b0Var.unknownFields = o1VarC;
                    }
                    iJ = h6.g.J(i20, bArr, i19, i11, o1VarC, eVar);
                    i30 = i12;
                    i33 = i20;
                    i31 = i17;
                    i34 = i21;
                    i35 = i16;
                    unsafe2 = unsafe;
                    i32 = i18;
                } else {
                    iJ = i19;
                    i33 = i20;
                    i34 = i21;
                    i35 = i16;
                }
            } else {
                unsafe = unsafe2;
                i12 = i30;
            }
        }
        if (i35 != 1048575) {
            unsafe.putInt(obj, i35, i34);
        }
        for (int i49 = this.f3516i; i49 < this.f3517j; i49++) {
            m(obj, this.f3515h[i49], null);
        }
        if (i12 == 0) {
            if (iJ != i11) {
                throw h0.f();
            }
        } else if (iJ > i11 || i33 != i12) {
            throw h0.f();
        }
        return iJ;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x009c. Please report as an issue. */
    public final void K(Object obj, byte[] bArr, int i10, int i11, e eVar) throws h0 {
        int i12;
        int iK;
        int iT;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe;
        int i18;
        int i19;
        int i20;
        int i21;
        int iN;
        int i22;
        this = this;
        bArr = bArr;
        i11 = i11;
        eVar = eVar;
        l(obj);
        Unsafe unsafe2 = f3507p;
        int i23 = 0;
        int iJ = i10;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        int i27 = 1048575;
        while (iJ < i11) {
            int i28 = iJ + 1;
            byte b10 = bArr[iJ];
            if (b10 < 0) {
                iK = h6.g.K(b10, bArr, i28, eVar);
                i12 = eVar.f3530a;
            } else {
                i12 = b10;
                iK = i28;
            }
            int i29 = i12 >>> 3;
            int i30 = i12 & 7;
            int i31 = this.f3511d;
            int i32 = this.f3510c;
            if (i29 > i26) {
                int i33 = i24 / 3;
                if (i29 < i32 || i29 > i31) {
                    iT = -1;
                } else {
                    iT = this.T(i29, i33);
                }
            } else if (i29 < i32 || i29 > i31) {
                iT = -1;
            } else {
                iT = this.T(i29, i23);
            }
            i24 = iT;
            if (i24 == -1) {
                i13 = i29;
                i14 = iK;
                i15 = i25;
                i16 = i23;
                i17 = i16;
                unsafe = unsafe2;
            } else {
                int[] iArr = this.f3508a;
                int i34 = iArr[i24 + 1];
                int iW = W(i34);
                i13 = i29;
                int i35 = iK;
                long j10 = i34 & 1048575;
                if (iW <= 17) {
                    int i36 = iArr[i24 + 2];
                    int i37 = 1 << (i36 >>> 20);
                    int i38 = i36 & 1048575;
                    if (i38 != i27) {
                        if (i27 != 1048575) {
                            unsafe2.putInt(obj, i27, i25);
                        }
                        if (i38 != 1048575) {
                            i25 = unsafe2.getInt(obj, i38);
                        }
                        i20 = i38;
                    } else {
                        i20 = i27;
                    }
                    int i39 = i25;
                    switch (iW) {
                        case 0:
                            i21 = i35;
                            if (i30 != 1) {
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                w1.r(obj, j10, h6.g.j(i21, bArr));
                                iJ = i21 + 8;
                                i25 = i39 | i37;
                                i11 = i11;
                                i27 = i20;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 1:
                            i21 = i35;
                            if (i30 != 5) {
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                w1.s(obj, j10, h6.g.p(i21, bArr));
                                iJ = i21 + 4;
                                i25 = i39 | i37;
                                i11 = i11;
                                i27 = i20;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 2:
                        case 3:
                            i21 = i35;
                            if (i30 != 0) {
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                iN = h6.g.N(bArr, i21, eVar);
                                unsafe2.putLong(obj, j10, eVar.f3531b);
                                i25 = i39 | i37;
                                i27 = i20;
                                iJ = iN;
                                i26 = i13;
                                i23 = 0;
                                i11 = i11;
                            }
                            break;
                        case 4:
                        case 11:
                            i21 = i35;
                            if (i30 != 0) {
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                iJ = h6.g.L(bArr, i21, eVar);
                                unsafe2.putInt(obj, j10, eVar.f3530a);
                                i25 = i39 | i37;
                                i11 = i11;
                                i27 = i20;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 5:
                        case Code.UNAVAILABLE /* 14 */:
                            i22 = i35;
                            if (i30 != 1) {
                                i21 = i22;
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                i21 = i22;
                                unsafe2.putLong(obj, j10, h6.g.n(i22, bArr));
                                iJ = i21 + 8;
                                i25 = i39 | i37;
                                i11 = i11;
                                i27 = i20;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 6:
                        case 13:
                            i22 = i35;
                            if (i30 != 5) {
                                i21 = i22;
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                unsafe2.putInt(obj, j10, h6.g.l(i22, bArr));
                                iJ = i22 + 4;
                                i25 = i39 | i37;
                                i11 = i11;
                                i27 = i20;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 7:
                            i22 = i35;
                            if (i30 != 0) {
                                i21 = i22;
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                iJ = h6.g.N(bArr, i22, eVar);
                                w1.n(obj, j10, eVar.f3531b != 0);
                                i25 = i39 | i37;
                                i11 = i11;
                                i27 = i20;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 8:
                            i22 = i35;
                            if (i30 != 2) {
                                i21 = i22;
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                iJ = (536870912 & i34) == 0 ? h6.g.F(bArr, i22, eVar) : h6.g.I(bArr, i22, eVar);
                                unsafe2.putObject(obj, j10, eVar.f3532c);
                                i25 = i39 | i37;
                                i11 = i11;
                                i27 = i20;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 9:
                            i22 = i35;
                            if (i30 != 2) {
                                i21 = i22;
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                Object objA = this.A(i24, obj);
                                iJ = h6.g.s0(objA, this.p(i24), bArr, i22, i11, eVar);
                                this.U(i24, obj, objA);
                                i25 = i39 | i37;
                                i11 = i11;
                                i27 = i20;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 10:
                            i22 = i35;
                            if (i30 != 2) {
                                i21 = i22;
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                iJ = h6.g.h(bArr, i22, eVar);
                                unsafe2.putObject(obj, j10, eVar.f3532c);
                                i25 = i39 | i37;
                                i11 = i11;
                                i27 = i20;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 12:
                            i22 = i35;
                            if (i30 != 0) {
                                i21 = i22;
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                iJ = h6.g.L(bArr, i22, eVar);
                                unsafe2.putInt(obj, j10, eVar.f3530a);
                                i25 = i39 | i37;
                                i11 = i11;
                                i27 = i20;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 15:
                            i22 = i35;
                            if (i30 != 0) {
                                i21 = i22;
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                iJ = h6.g.L(bArr, i22, eVar);
                                unsafe2.putInt(obj, j10, o.b(eVar.f3530a));
                                i25 = i39 | i37;
                                i11 = i11;
                                i27 = i20;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case Code.UNAUTHENTICATED /* 16 */:
                            if (i30 != 0) {
                                i21 = i35;
                                i15 = i39;
                                i27 = i20;
                                i17 = i24;
                                unsafe = unsafe2;
                                i14 = i21;
                                i16 = 0;
                            } else {
                                iN = h6.g.N(bArr, i35, eVar);
                                unsafe2.putLong(obj, j10, o.c(eVar.f3531b));
                                i25 = i39 | i37;
                                i27 = i20;
                                iJ = iN;
                                i26 = i13;
                                i23 = 0;
                                i11 = i11;
                            }
                            break;
                        default:
                            i21 = i35;
                            i15 = i39;
                            i27 = i20;
                            i17 = i24;
                            unsafe = unsafe2;
                            i14 = i21;
                            i16 = 0;
                            break;
                    }
                } else {
                    if (iW != 27) {
                        int i40 = i27;
                        int i41 = i25;
                        if (iW <= 49) {
                            i18 = i40;
                            i15 = i41;
                            i17 = i24;
                            i16 = 0;
                            unsafe = unsafe2;
                            iJ = L(obj, bArr, i35, i11, i12, i30, i24, i34, iW, j10, eVar);
                            if (iJ != i35) {
                                i23 = 0;
                                i26 = i13;
                                i27 = i18;
                            } else {
                                i14 = iJ;
                            }
                            i25 = i15;
                            i24 = i17;
                            unsafe2 = unsafe;
                        } else {
                            i18 = i40;
                            i15 = i41;
                            i19 = i35;
                            i17 = i24;
                            unsafe = unsafe2;
                            i16 = 0;
                            if (iW != 50) {
                                iJ = I(obj, bArr, i19, i11, i12, i13, i30, i34, iW, j10, i17, eVar);
                                if (iJ != i19) {
                                    this = this;
                                    bArr = bArr;
                                    i11 = i11;
                                    eVar = eVar;
                                    i23 = 0;
                                    i26 = i13;
                                    i24 = i17;
                                    i27 = i18;
                                    i25 = i15;
                                } else {
                                    i14 = iJ;
                                    i17 = i17;
                                }
                            } else if (i30 == 2) {
                                H(obj, i17, j10);
                                throw null;
                            }
                            unsafe2 = unsafe;
                        }
                        i27 = i18;
                    } else if (i30 == 2) {
                        c cVar = (c) ((e0) unsafe2.getObject(obj, j10));
                        boolean zG = cVar.g();
                        c cVar2 = cVar;
                        if (!zG) {
                            int size = cVar.size();
                            e0 e0VarA = cVar.a(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(obj, j10, e0VarA);
                            cVar2 = e0VarA;
                        }
                        iJ = h6.g.t(this.p(i24), i12, bArr, i35, i11, cVar2, eVar);
                        i25 = i25;
                        i27 = i27;
                        i26 = i13;
                        i23 = 0;
                        i11 = i11;
                    } else {
                        i15 = i25;
                        i19 = i35;
                        i17 = i24;
                        unsafe = unsafe2;
                        i18 = i27;
                        i16 = 0;
                    }
                    i14 = i19;
                    i27 = i18;
                }
            }
            b0 b0Var = (b0) obj;
            o1 o1VarC = b0Var.unknownFields;
            if (o1VarC == o1.f3602f) {
                o1VarC = o1.c();
                b0Var.unknownFields = o1VarC;
            }
            iJ = h6.g.J(i12, bArr, i14, i11, o1VarC, eVar);
            i23 = i16;
            i26 = i13;
            i25 = i15;
            i24 = i17;
            unsafe2 = unsafe;
        }
        int i42 = i25;
        int i43 = i27;
        Unsafe unsafe3 = unsafe2;
        if (i43 != 1048575) {
            unsafe3.putInt(obj, i43, i42);
        }
        if (iJ != i11) {
            throw h0.f();
        }
    }

    public final int L(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11, e eVar) throws h0 {
        int iM;
        Unsafe unsafe = f3507p;
        c cVar = (c) ((e0) unsafe.getObject(obj, j11));
        boolean zG = cVar.g();
        c cVar2 = cVar;
        if (!zG) {
            int size = cVar.size();
            e0 e0VarA = cVar.a(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, e0VarA);
            cVar2 = e0VarA;
        }
        switch (i15) {
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 35:
                if (i13 == 2) {
                    return h6.g.v(bArr, i10, cVar2, eVar);
                }
                return i13 == 1 ? h6.g.k(i12, bArr, i10, i11, cVar2, eVar) : i10;
            case 19:
            case 36:
                if (i13 == 2) {
                    return h6.g.y(bArr, i10, cVar2, eVar);
                }
                return i13 == 5 ? h6.g.q(i12, bArr, i10, i11, cVar2, eVar) : i10;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
            case 21:
            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
            case 38:
                if (i13 == 2) {
                    return h6.g.C(bArr, i10, cVar2, eVar);
                }
                return i13 == 0 ? h6.g.O(i12, bArr, i10, i11, cVar2, eVar) : i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return h6.g.B(bArr, i10, cVar2, eVar);
                }
                return i13 == 0 ? h6.g.M(i12, bArr, i10, i11, cVar2, eVar) : i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    return h6.g.x(bArr, i10, cVar2, eVar);
                }
                return i13 == 1 ? h6.g.o(i12, bArr, i10, i11, cVar2, eVar) : i10;
            case 24:
            case 31:
            case 41:
            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                if (i13 == 2) {
                    return h6.g.w(bArr, i10, cVar2, eVar);
                }
                return i13 == 5 ? h6.g.m(i12, bArr, i10, i11, cVar2, eVar) : i10;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
            case 42:
                if (i13 == 2) {
                    return h6.g.u(bArr, i10, cVar2, eVar);
                }
                return i13 == 0 ? h6.g.g(i12, bArr, i10, i11, cVar2, eVar) : i10;
            case 26:
                if (i13 == 2) {
                    return (j10 & 536870912) == 0 ? h6.g.G(i12, bArr, i10, i11, cVar2, eVar) : h6.g.H(i12, bArr, i10, i11, cVar2, eVar);
                }
                return i10;
            case 27:
                return i13 == 2 ? h6.g.t(p(i14), i12, bArr, i10, i11, cVar2, eVar) : i10;
            case 28:
                return i13 == 2 ? h6.g.i(i12, bArr, i10, i11, cVar2, eVar) : i10;
            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
            case 44:
                if (i13 == 2) {
                    iM = h6.g.B(bArr, i10, cVar2, eVar);
                } else {
                    if (i13 != 0) {
                        return i10;
                    }
                    iM = h6.g.M(i12, bArr, i10, i11, cVar2, eVar);
                }
                n(i14);
                Class cls = k1.f3567a;
                return iM;
            case 33:
            case 47:
                if (i13 == 2) {
                    return h6.g.z(bArr, i10, cVar2, eVar);
                }
                return i13 == 0 ? h6.g.D(i12, bArr, i10, i11, cVar2, eVar) : i10;
            case 34:
            case 48:
                if (i13 == 2) {
                    return h6.g.A(bArr, i10, cVar2, eVar);
                }
                return i13 == 0 ? h6.g.E(i12, bArr, i10, i11, cVar2, eVar) : i10;
            case 49:
                return i13 == 3 ? h6.g.r(p(i14), i12, bArr, i10, i11, cVar2, eVar) : i10;
            default:
                return i10;
        }
    }

    public final void M(Object obj, long j10, g2.m mVar, j1 j1Var, t tVar) throws g0 {
        int iX;
        List listC = this.f3519l.c(obj, j10);
        int i10 = mVar.f6578b;
        if ((i10 & 7) != 3) {
            throw h0.c();
        }
        do {
            Object objF = j1Var.f();
            mVar.f(objF, j1Var, tVar);
            j1Var.b(objF);
            listC.add(objF);
            if (((o) mVar.f6581e).e() || mVar.f6580d != 0) {
                return;
            } else {
                iX = ((o) mVar.f6581e).x();
            }
        } while (iX == i10);
        mVar.f6580d = iX;
    }

    public final void N(Object obj, int i10, g2.m mVar, j1 j1Var, t tVar) throws h0 {
        int iX;
        List listC = this.f3519l.c(obj, i10 & 1048575);
        int i11 = mVar.f6578b;
        if ((i11 & 7) != 2) {
            throw h0.c();
        }
        do {
            Object objF = j1Var.f();
            mVar.h(objF, j1Var, tVar);
            j1Var.b(objF);
            listC.add(objF);
            if (((o) mVar.f6581e).e() || mVar.f6580d != 0) {
                return;
            } else {
                iX = ((o) mVar.f6581e).x();
            }
        } while (iX == i11);
        mVar.f6580d = iX;
    }

    public final void O(Object obj, int i10, g2.m mVar) {
        if ((536870912 & i10) != 0) {
            w1.v(obj, i10 & 1048575, mVar.O());
        } else if (this.f3513f) {
            w1.v(obj, i10 & 1048575, mVar.M());
        } else {
            w1.v(obj, i10 & 1048575, mVar.l());
        }
    }

    public final void P(Object obj, int i10, g2.m mVar) throws com.google.protobuf.z0, g0 {
        boolean z10 = (536870912 & i10) != 0;
        n0 n0Var = this.f3519l;
        if (z10) {
            List listC = n0Var.c(obj, i10 & 1048575);
            switch (mVar.f6577a) {
                case 1:
                    mVar.N(listC, true);
                    break;
                default:
                    mVar.N(listC, true);
                    break;
            }
        }
        List listC2 = n0Var.c(obj, i10 & 1048575);
        switch (mVar.f6577a) {
            case 1:
                mVar.N(listC2, false);
                break;
            default:
                mVar.N(listC2, false);
                break;
        }
    }

    public final void R(int i10, Object obj) {
        int i11 = this.f3508a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        w1.t(j10, obj, (1 << (i11 >>> 20)) | w1.f3633c.g(obj, j10));
    }

    public final void S(Object obj, int i10, int i11) {
        w1.t(this.f3508a[i11 + 2] & 1048575, obj, i10);
    }

    public final int T(int i10, int i11) {
        int[] iArr = this.f3508a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final void U(int i10, Object obj, Object obj2) {
        f3507p.putObject(obj, X(i10) & 1048575, obj2);
        R(i10, obj);
    }

    public final void V(Object obj, int i10, int i11, Object obj2) {
        f3507p.putObject(obj, X(i11) & 1048575, obj2);
        S(obj, i10, i11);
    }

    public final int X(int i10) {
        return this.f3508a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Y(Object obj, w4 w4Var) throws q {
        int i10;
        boolean z10;
        int[] iArr = this.f3508a;
        int length = iArr.length;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iX = X(i13);
            int i15 = iArr[i13];
            int iW = W(iX);
            Unsafe unsafe = f3507p;
            if (iW <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = i10;
            long j10 = iX & i11;
            switch (iW) {
                case 0:
                    if ((i14 & i18) != 0) {
                        w4Var.o(i15, w1.f3633c.e(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 1:
                    if ((i14 & i18) != 0) {
                        w4Var.w(i15, w1.f3633c.f(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 2:
                    if ((i14 & i18) != 0) {
                        w4Var.D(i15, unsafe.getLong(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 3:
                    if ((i14 & i18) != 0) {
                        w4Var.U(i15, unsafe.getLong(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 4:
                    if ((i14 & i18) != 0) {
                        w4Var.B(i15, unsafe.getInt(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 5:
                    if ((i14 & i18) != 0) {
                        w4Var.u(i15, unsafe.getLong(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 6:
                    if ((i14 & i18) != 0) {
                        w4Var.s(i15, unsafe.getInt(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 7:
                    if ((i14 & i18) != 0) {
                        w4Var.j(i15, w1.f3633c.c(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 8:
                    if ((i14 & i18) != 0) {
                        Z(i15, unsafe.getObject(obj, j10), w4Var);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 9:
                    if ((i14 & i18) != 0) {
                        w4Var.G(i15, p(i13), unsafe.getObject(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 10:
                    if ((i14 & i18) != 0) {
                        w4Var.l(i15, (l) unsafe.getObject(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 11:
                    if ((i14 & i18) != 0) {
                        w4Var.S(i15, unsafe.getInt(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 12:
                    if ((i14 & i18) != 0) {
                        w4Var.q(i15, unsafe.getInt(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 13:
                    if ((i14 & i18) != 0) {
                        w4Var.I(i15, unsafe.getInt(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    if ((i14 & i18) != 0) {
                        w4Var.K(i15, unsafe.getLong(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 15:
                    if ((i14 & i18) != 0) {
                        w4Var.M(i15, unsafe.getInt(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    if ((i14 & i18) != 0) {
                        w4Var.O(i15, unsafe.getLong(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if ((i14 & i18) != 0) {
                        w4Var.y(i15, p(i13), unsafe.getObject(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    k1.F(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 19:
                    k1.J(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                    k1.M(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 21:
                    k1.U(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 22:
                    k1.L(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 23:
                    k1.I(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 24:
                    k1.H(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                    k1.D(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 26:
                    k1.S(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 27:
                    k1.N(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, p(i13));
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 28:
                    k1.E(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 29:
                    z10 = false;
                    k1.T(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                    z10 = false;
                    k1.G(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 31:
                    z10 = false;
                    k1.O(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 32:
                    z10 = false;
                    k1.P(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 33:
                    z10 = false;
                    k1.Q(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 34:
                    z10 = false;
                    k1.R(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 35:
                    k1.F(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 36:
                    k1.J(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    k1.M(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 38:
                    k1.U(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 39:
                    k1.L(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 40:
                    k1.I(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 41:
                    k1.H(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 42:
                    k1.D(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 43:
                    k1.T(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 44:
                    k1.G(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    k1.O(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 46:
                    k1.P(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 47:
                    k1.Q(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 48:
                    k1.R(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 49:
                    k1.K(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, p(i13));
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    if (unsafe.getObject(obj, j10) != null) {
                        Object objO = o(i13);
                        this.f3521n.getClass();
                        a7.a.w(objO);
                        throw null;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 51:
                    if (u(obj, i15, i13)) {
                        w4Var.o(i15, ((Double) w1.f3633c.i(obj, j10)).doubleValue());
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 52:
                    if (u(obj, i15, i13)) {
                        w4Var.w(i15, ((Float) w1.f3633c.i(obj, j10)).floatValue());
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 53:
                    if (u(obj, i15, i13)) {
                        w4Var.D(i15, G(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 54:
                    if (u(obj, i15, i13)) {
                        w4Var.U(i15, G(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (u(obj, i15, i13)) {
                        w4Var.B(i15, F(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 56:
                    if (u(obj, i15, i13)) {
                        w4Var.u(i15, G(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 57:
                    if (u(obj, i15, i13)) {
                        w4Var.s(i15, F(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 58:
                    if (u(obj, i15, i13)) {
                        w4Var.j(i15, ((Boolean) w1.f3633c.i(obj, j10)).booleanValue());
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 59:
                    if (u(obj, i15, i13)) {
                        Z(i15, unsafe.getObject(obj, j10), w4Var);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    if (u(obj, i15, i13)) {
                        w4Var.G(i15, p(i13), unsafe.getObject(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 61:
                    if (u(obj, i15, i13)) {
                        w4Var.l(i15, (l) unsafe.getObject(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 62:
                    if (u(obj, i15, i13)) {
                        w4Var.S(i15, F(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 63:
                    if (u(obj, i15, i13)) {
                        w4Var.q(i15, F(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 64:
                    if (u(obj, i15, i13)) {
                        w4Var.I(i15, F(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 65:
                    if (u(obj, i15, i13)) {
                        w4Var.K(i15, G(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 66:
                    if (u(obj, i15, i13)) {
                        w4Var.M(i15, F(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 67:
                    if (u(obj, i15, i13)) {
                        w4Var.O(i15, G(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 68:
                    if (u(obj, i15, i13)) {
                        w4Var.y(i15, p(i13), unsafe.getObject(obj, j10));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                default:
                    i13 += 3;
                    i11 = 1048575;
                    break;
            }
        }
        this.f3520m.getClass();
        ((b0) obj).unknownFields.e(w4Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f3508a;
            if (i10 >= iArr.length) {
                k1.B(this.f3520m, obj, obj2);
                return;
            }
            int iX = X(i10);
            long j10 = 1048575 & iX;
            int i11 = iArr[i10];
            switch (W(iX)) {
                case 0:
                    if (s(i10, obj2)) {
                        w1.r(obj, j10, w1.f3633c.e(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 1:
                    if (s(i10, obj2)) {
                        w1.s(obj, j10, w1.f3633c.f(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 2:
                    if (s(i10, obj2)) {
                        w1.u(obj, j10, w1.f3633c.h(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 3:
                    if (s(i10, obj2)) {
                        w1.u(obj, j10, w1.f3633c.h(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 4:
                    if (s(i10, obj2)) {
                        w1.t(j10, obj, w1.f3633c.g(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 5:
                    if (s(i10, obj2)) {
                        w1.u(obj, j10, w1.f3633c.h(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 6:
                    if (s(i10, obj2)) {
                        w1.t(j10, obj, w1.f3633c.g(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 7:
                    if (s(i10, obj2)) {
                        w1.n(obj, j10, w1.f3633c.c(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 8:
                    if (s(i10, obj2)) {
                        w1.v(obj, j10, w1.f3633c.i(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 9:
                    y(i10, obj, obj2);
                    break;
                case 10:
                    if (s(i10, obj2)) {
                        w1.v(obj, j10, w1.f3633c.i(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 11:
                    if (s(i10, obj2)) {
                        w1.t(j10, obj, w1.f3633c.g(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 12:
                    if (s(i10, obj2)) {
                        w1.t(j10, obj, w1.f3633c.g(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 13:
                    if (s(i10, obj2)) {
                        w1.t(j10, obj, w1.f3633c.g(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    if (s(i10, obj2)) {
                        w1.u(obj, j10, w1.f3633c.h(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case 15:
                    if (s(i10, obj2)) {
                        w1.t(j10, obj, w1.f3633c.g(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    if (s(i10, obj2)) {
                        w1.u(obj, j10, w1.f3633c.h(obj2, j10));
                        R(i10, obj);
                    }
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    y(i10, obj, obj2);
                    break;
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f3519l.b(obj, j10, obj2);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    Class cls = k1.f3567a;
                    v1 v1Var = w1.f3633c;
                    Object objI = v1Var.i(obj, j10);
                    Object objI2 = v1Var.i(obj2, j10);
                    this.f3521n.getClass();
                    w1.v(obj, j10, t0.d(objI, objI2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (u(obj2, i11, i10)) {
                        w1.v(obj, j10, w1.f3633c.i(obj2, j10));
                        S(obj, i11, i10);
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    z(i10, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (u(obj2, i11, i10)) {
                        w1.v(obj, j10, w1.f3633c.i(obj2, j10));
                        S(obj, i11, i10);
                    }
                    break;
                case 68:
                    z(i10, obj, obj2);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final void b(Object obj) {
        if (t(obj)) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                b0Var.h();
                b0Var.g();
                b0Var.p();
            }
            int length = this.f3508a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iX = X(i10);
                long j10 = 1048575 & iX;
                int iW = W(iX);
                Unsafe unsafe = f3507p;
                if (iW != 9) {
                    switch (iW) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (s(i10, obj)) {
                                p(i10).b(unsafe.getObject(obj, j10));
                            }
                            break;
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        case 19:
                        case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f3519l.a(obj, j10);
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                this.f3521n.getClass();
                                t0.f(object);
                                unsafe.putObject(obj, j10, object);
                            }
                            break;
                    }
                } else if (s(i10, obj)) {
                    p(i10).b(unsafe.getObject(obj, j10));
                }
            }
            this.f3520m.getClass();
            p1.b(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6 A[LOOP:1: B:49:0x00b5->B:54:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final boolean c(Object obj) {
        List list;
        j1 j1VarP;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f3516i; i13++) {
            int i14 = this.f3515h[i13];
            int[] iArr = this.f3508a;
            int i15 = iArr[i14];
            int iX = X(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = f3507p.getInt(obj, i17);
                }
                i11 = i17;
            }
            if ((268435456 & iX) != 0) {
                if (i11 == 1048575) {
                    if (!s(i14, obj)) {
                        return false;
                    }
                } else if ((i12 & i18) == 0) {
                    return false;
                }
            }
            int iW = W(iX);
            if (iW == 9 || iW == 17) {
                if (i11 == 1048575) {
                    if (s(i14, obj)) {
                        if (!p(i14).c(w1.f3633c.i(obj, iX & 1048575))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                } else if ((i18 & i12) != 0) {
                    if (!p(i14).c(w1.f3633c.i(obj, iX & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iW == 27) {
                list = (List) w1.f3633c.i(obj, iX & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    j1VarP = p(i14);
                    for (i10 = 0; i10 < list.size(); i10++) {
                        if (!j1VarP.c(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (iW == 60 || iW == 68) {
                if (u(obj, i15, i14)) {
                    if (!p(i14).c(w1.f3633c.i(obj, iX & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iW == 49) {
                list = (List) w1.f3633c.i(obj, iX & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    j1VarP = p(i14);
                    while (i10 < list.size()) {
                        if (!j1VarP.c(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (iW != 50) {
                continue;
            } else {
                Object objI = w1.f3633c.i(obj, iX & 1048575);
                this.f3521n.getClass();
                if (!((s0) objI).isEmpty()) {
                    a7.a.w(o(i14));
                    throw null;
                }
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final boolean d(Object obj, Object obj2) {
        boolean zC;
        int[] iArr = this.f3508a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iX = X(i10);
            long j10 = iX & 1048575;
            switch (W(iX)) {
                case 0:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var = w1.f3633c;
                        if (Double.doubleToLongBits(v1Var.e(obj, j10)) == Double.doubleToLongBits(v1Var.e(obj2, j10))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 1:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var2 = w1.f3633c;
                        if (Float.floatToIntBits(v1Var2.f(obj, j10)) == Float.floatToIntBits(v1Var2.f(obj2, j10))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 2:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var3 = w1.f3633c;
                        if (v1Var3.h(obj, j10) == v1Var3.h(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 3:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var4 = w1.f3633c;
                        if (v1Var4.h(obj, j10) == v1Var4.h(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 4:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var5 = w1.f3633c;
                        if (v1Var5.g(obj, j10) == v1Var5.g(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 5:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var6 = w1.f3633c;
                        if (v1Var6.h(obj, j10) == v1Var6.h(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 6:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var7 = w1.f3633c;
                        if (v1Var7.g(obj, j10) == v1Var7.g(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 7:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var8 = w1.f3633c;
                        if (v1Var8.c(obj, j10) == v1Var8.c(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 8:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var9 = w1.f3633c;
                        if (k1.C(v1Var9.i(obj, j10), v1Var9.i(obj2, j10))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 9:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var10 = w1.f3633c;
                        if (k1.C(v1Var10.i(obj, j10), v1Var10.i(obj2, j10))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 10:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var11 = w1.f3633c;
                        if (k1.C(v1Var11.i(obj, j10), v1Var11.i(obj2, j10))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 11:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var12 = w1.f3633c;
                        if (v1Var12.g(obj, j10) == v1Var12.g(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 12:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var13 = w1.f3633c;
                        if (v1Var13.g(obj, j10) == v1Var13.g(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 13:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var14 = w1.f3633c;
                        if (v1Var14.g(obj, j10) == v1Var14.g(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case Code.UNAVAILABLE /* 14 */:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var15 = w1.f3633c;
                        if (v1Var15.h(obj, j10) == v1Var15.h(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 15:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var16 = w1.f3633c;
                        if (v1Var16.g(obj, j10) == v1Var16.g(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case Code.UNAUTHENTICATED /* 16 */:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var17 = w1.f3633c;
                        if (v1Var17.h(obj, j10) == v1Var17.h(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (k(i10, obj, obj2)) {
                        v1 v1Var18 = w1.f3633c;
                        if (k1.C(v1Var18.i(obj, j10), v1Var18.i(obj2, j10))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    v1 v1Var19 = w1.f3633c;
                    zC = k1.C(v1Var19.i(obj, j10), v1Var19.i(obj2, j10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    v1 v1Var20 = w1.f3633c;
                    zC = k1.C(v1Var20.i(obj, j10), v1Var20.i(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j11 = iArr[i10 + 2] & 1048575;
                    v1 v1Var21 = w1.f3633c;
                    if (v1Var21.g(obj, j11) != v1Var21.g(obj2, j11) || !k1.C(v1Var21.i(obj, j10), v1Var21.i(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zC) {
                return false;
            }
        }
        this.f3520m.getClass();
        return ((b0) obj).unknownFields.equals(((b0) obj2).unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final int e(Object obj) {
        return this.f3514g ? r(obj) : q(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final Object f() {
        this.f3518k.getClass();
        return ((b0) this.f3512e).r();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final int g(Object obj) {
        int i10;
        int iA;
        int i11;
        int[] iArr = this.f3508a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iX = X(i13);
            int i14 = iArr[i13];
            long j10 = 1048575 & iX;
            int i15 = 1237;
            int iHashCode = 37;
            switch (W(iX)) {
                case 0:
                    i10 = i12 * 53;
                    iA = f0.a(Double.doubleToLongBits(w1.f3633c.e(obj, j10)));
                    i12 = iA + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iA = Float.floatToIntBits(w1.f3633c.f(obj, j10));
                    i12 = iA + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iA = f0.a(w1.f3633c.h(obj, j10));
                    i12 = iA + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iA = f0.a(w1.f3633c.h(obj, j10));
                    i12 = iA + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iA = w1.f3633c.g(obj, j10);
                    i12 = iA + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iA = f0.a(w1.f3633c.h(obj, j10));
                    i12 = iA + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iA = w1.f3633c.g(obj, j10);
                    i12 = iA + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zC = w1.f3633c.c(obj, j10);
                    Charset charset = f0.f3534a;
                    if (zC) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iA = ((String) w1.f3633c.i(obj, j10)).hashCode();
                    i12 = iA + i10;
                    break;
                case 9:
                    Object objI = w1.f3633c.i(obj, j10);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iA = w1.f3633c.i(obj, j10).hashCode();
                    i12 = iA + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iA = w1.f3633c.g(obj, j10);
                    i12 = iA + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iA = w1.f3633c.g(obj, j10);
                    i12 = iA + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iA = w1.f3633c.g(obj, j10);
                    i12 = iA + i10;
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    i10 = i12 * 53;
                    iA = f0.a(w1.f3633c.h(obj, j10));
                    i12 = iA + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iA = w1.f3633c.g(obj, j10);
                    i12 = iA + i10;
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    i10 = i12 * 53;
                    iA = f0.a(w1.f3633c.h(obj, j10));
                    i12 = iA + i10;
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    Object objI2 = w1.f3633c.i(obj, j10);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    iA = w1.f3633c.i(obj, j10).hashCode();
                    i12 = iA + i10;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    i10 = i12 * 53;
                    iA = w1.f3633c.i(obj, j10).hashCode();
                    i12 = iA + i10;
                    break;
                case 51:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = f0.a(Double.doubleToLongBits(((Double) w1.f3633c.i(obj, j10)).doubleValue()));
                        i12 = iA + i10;
                    }
                    break;
                case 52:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = Float.floatToIntBits(((Float) w1.f3633c.i(obj, j10)).floatValue());
                        i12 = iA + i10;
                    }
                    break;
                case 53:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = f0.a(G(obj, j10));
                        i12 = iA + i10;
                    }
                    break;
                case 54:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = f0.a(G(obj, j10));
                        i12 = iA + i10;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = F(obj, j10);
                        i12 = iA + i10;
                    }
                    break;
                case 56:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = f0.a(G(obj, j10));
                        i12 = iA + i10;
                    }
                    break;
                case 57:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = F(obj, j10);
                        i12 = iA + i10;
                    }
                    break;
                case 58:
                    if (u(obj, i14, i13)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) w1.f3633c.i(obj, j10)).booleanValue();
                        Charset charset2 = f0.f3534a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case 59:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = ((String) w1.f3633c.i(obj, j10)).hashCode();
                        i12 = iA + i10;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = w1.f3633c.i(obj, j10).hashCode();
                        i12 = iA + i10;
                    }
                    break;
                case 61:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = w1.f3633c.i(obj, j10).hashCode();
                        i12 = iA + i10;
                    }
                    break;
                case 62:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = F(obj, j10);
                        i12 = iA + i10;
                    }
                    break;
                case 63:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = F(obj, j10);
                        i12 = iA + i10;
                    }
                    break;
                case 64:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = F(obj, j10);
                        i12 = iA + i10;
                    }
                    break;
                case 65:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = f0.a(G(obj, j10));
                        i12 = iA + i10;
                    }
                    break;
                case 66:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = F(obj, j10);
                        i12 = iA + i10;
                    }
                    break;
                case 67:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = f0.a(G(obj, j10));
                        i12 = iA + i10;
                    }
                    break;
                case 68:
                    if (u(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = w1.f3633c.i(obj, j10).hashCode();
                        i12 = iA + i10;
                    }
                    break;
            }
        }
        this.f3520m.getClass();
        return ((b0) obj).unknownFields.hashCode() + (i12 * 53);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final void h(Object obj, byte[] bArr, int i10, int i11, e eVar) throws h0 {
        if (this.f3514g) {
            K(obj, bArr, i10, i11, eVar);
        } else {
            J(obj, bArr, i10, i11, 0, eVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final void i(Object obj, w4 w4Var) throws q {
        w4Var.getClass();
        if (!this.f3514g) {
            Y(obj, w4Var);
            return;
        }
        int[] iArr = this.f3508a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iX = X(i10);
            int i11 = iArr[i10];
            switch (W(iX)) {
                case 0:
                    if (s(i10, obj)) {
                        w4Var.o(i11, w1.f3633c.e(obj, iX & 1048575));
                    }
                    break;
                case 1:
                    if (s(i10, obj)) {
                        w4Var.w(i11, w1.f3633c.f(obj, iX & 1048575));
                    }
                    break;
                case 2:
                    if (s(i10, obj)) {
                        w4Var.D(i11, w1.f3633c.h(obj, iX & 1048575));
                    }
                    break;
                case 3:
                    if (s(i10, obj)) {
                        w4Var.U(i11, w1.f3633c.h(obj, iX & 1048575));
                    }
                    break;
                case 4:
                    if (s(i10, obj)) {
                        w4Var.B(i11, w1.f3633c.g(obj, iX & 1048575));
                    }
                    break;
                case 5:
                    if (s(i10, obj)) {
                        w4Var.u(i11, w1.f3633c.h(obj, iX & 1048575));
                    }
                    break;
                case 6:
                    if (s(i10, obj)) {
                        w4Var.s(i11, w1.f3633c.g(obj, iX & 1048575));
                    }
                    break;
                case 7:
                    if (s(i10, obj)) {
                        w4Var.j(i11, w1.f3633c.c(obj, iX & 1048575));
                    }
                    break;
                case 8:
                    if (s(i10, obj)) {
                        Z(i11, w1.f3633c.i(obj, iX & 1048575), w4Var);
                    }
                    break;
                case 9:
                    if (s(i10, obj)) {
                        w4Var.G(i11, p(i10), w1.f3633c.i(obj, iX & 1048575));
                    }
                    break;
                case 10:
                    if (s(i10, obj)) {
                        w4Var.l(i11, (l) w1.f3633c.i(obj, iX & 1048575));
                    }
                    break;
                case 11:
                    if (s(i10, obj)) {
                        w4Var.S(i11, w1.f3633c.g(obj, iX & 1048575));
                    }
                    break;
                case 12:
                    if (s(i10, obj)) {
                        w4Var.q(i11, w1.f3633c.g(obj, iX & 1048575));
                    }
                    break;
                case 13:
                    if (s(i10, obj)) {
                        w4Var.I(i11, w1.f3633c.g(obj, iX & 1048575));
                    }
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    if (s(i10, obj)) {
                        w4Var.K(i11, w1.f3633c.h(obj, iX & 1048575));
                    }
                    break;
                case 15:
                    if (s(i10, obj)) {
                        w4Var.M(i11, w1.f3633c.g(obj, iX & 1048575));
                    }
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    if (s(i10, obj)) {
                        w4Var.O(i11, w1.f3633c.h(obj, iX & 1048575));
                    }
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (s(i10, obj)) {
                        w4Var.y(i11, p(i10), w1.f3633c.i(obj, iX & 1048575));
                    }
                    break;
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    k1.F(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case 19:
                    k1.J(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                    k1.M(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case 21:
                    k1.U(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case 22:
                    k1.L(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case 23:
                    k1.I(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case 24:
                    k1.H(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                    k1.D(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case 26:
                    k1.S(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var);
                    break;
                case 27:
                    k1.N(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, p(i10));
                    break;
                case 28:
                    k1.E(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var);
                    break;
                case 29:
                    k1.T(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                    k1.G(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case 31:
                    k1.O(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case 32:
                    k1.P(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case 33:
                    k1.Q(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case 34:
                    k1.R(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, false);
                    break;
                case 35:
                    k1.F(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case 36:
                    k1.J(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    k1.M(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case 38:
                    k1.U(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case 39:
                    k1.L(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case 40:
                    k1.I(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case 41:
                    k1.H(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case 42:
                    k1.D(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case 43:
                    k1.T(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case 44:
                    k1.G(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    k1.O(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case 46:
                    k1.P(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case 47:
                    k1.Q(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case 48:
                    k1.R(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, true);
                    break;
                case 49:
                    k1.K(iArr[i10], (List) w1.f3633c.i(obj, iX & 1048575), w4Var, p(i10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    if (w1.f3633c.i(obj, iX & 1048575) != null) {
                        Object objO = o(i10);
                        this.f3521n.getClass();
                        a7.a.w(objO);
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (u(obj, i11, i10)) {
                        w4Var.o(i11, ((Double) w1.f3633c.i(obj, iX & 1048575)).doubleValue());
                    }
                    break;
                case 52:
                    if (u(obj, i11, i10)) {
                        w4Var.w(i11, ((Float) w1.f3633c.i(obj, iX & 1048575)).floatValue());
                    }
                    break;
                case 53:
                    if (u(obj, i11, i10)) {
                        w4Var.D(i11, G(obj, iX & 1048575));
                    }
                    break;
                case 54:
                    if (u(obj, i11, i10)) {
                        w4Var.U(i11, G(obj, iX & 1048575));
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (u(obj, i11, i10)) {
                        w4Var.B(i11, F(obj, iX & 1048575));
                    }
                    break;
                case 56:
                    if (u(obj, i11, i10)) {
                        w4Var.u(i11, G(obj, iX & 1048575));
                    }
                    break;
                case 57:
                    if (u(obj, i11, i10)) {
                        w4Var.s(i11, F(obj, iX & 1048575));
                    }
                    break;
                case 58:
                    if (u(obj, i11, i10)) {
                        w4Var.j(i11, ((Boolean) w1.f3633c.i(obj, iX & 1048575)).booleanValue());
                    }
                    break;
                case 59:
                    if (u(obj, i11, i10)) {
                        Z(i11, w1.f3633c.i(obj, iX & 1048575), w4Var);
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    if (u(obj, i11, i10)) {
                        w4Var.G(i11, p(i10), w1.f3633c.i(obj, iX & 1048575));
                    }
                    break;
                case 61:
                    if (u(obj, i11, i10)) {
                        w4Var.l(i11, (l) w1.f3633c.i(obj, iX & 1048575));
                    }
                    break;
                case 62:
                    if (u(obj, i11, i10)) {
                        w4Var.S(i11, F(obj, iX & 1048575));
                    }
                    break;
                case 63:
                    if (u(obj, i11, i10)) {
                        w4Var.q(i11, F(obj, iX & 1048575));
                    }
                    break;
                case 64:
                    if (u(obj, i11, i10)) {
                        w4Var.I(i11, F(obj, iX & 1048575));
                    }
                    break;
                case 65:
                    if (u(obj, i11, i10)) {
                        w4Var.K(i11, G(obj, iX & 1048575));
                    }
                    break;
                case 66:
                    if (u(obj, i11, i10)) {
                        w4Var.M(i11, F(obj, iX & 1048575));
                    }
                    break;
                case 67:
                    if (u(obj, i11, i10)) {
                        w4Var.O(i11, G(obj, iX & 1048575));
                    }
                    break;
                case 68:
                    if (u(obj, i11, i10)) {
                        w4Var.y(i11, p(i10), w1.f3633c.i(obj, iX & 1048575));
                    }
                    break;
            }
        }
        this.f3520m.getClass();
        ((b0) obj).unknownFields.e(w4Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final void j(Object obj, g2.m mVar, t tVar) throws Throwable {
        tVar.getClass();
        l(obj);
        w(this.f3520m, obj, mVar, tVar);
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        return s(i10, obj) == s(i10, obj2);
    }

    public final void m(Object obj, int i10, Object obj2) {
        int i11 = this.f3508a[i10];
        if (w1.f3633c.i(obj, X(i10) & 1048575) == null) {
            return;
        }
        n(i10);
    }

    public final void n(int i10) {
        a7.a.w(this.f3509b[((i10 / 3) * 2) + 1]);
    }

    public final Object o(int i10) {
        return this.f3509b[(i10 / 3) * 2];
    }

    public final j1 p(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f3509b;
        j1 j1Var = (j1) objArr[i11];
        if (j1Var != null) {
            return j1Var;
        }
        j1 j1VarA = g1.f3539c.a((Class) objArr[i11 + 1]);
        objArr[i11] = j1VarA;
        return j1VarA;
    }

    public final int q(Object obj) {
        int i10;
        int iT0;
        int iS0;
        int i11 = 0;
        int iV = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = this.f3508a;
            if (i11 >= iArr.length) {
                this.f3520m.getClass();
                return ((b0) obj).unknownFields.b() + iV;
            }
            int iX = X(i11);
            int i14 = iArr[i11];
            int iW = W(iX);
            Unsafe unsafe = f3507p;
            if (iW <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & 1048575;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i13) {
                    i12 = unsafe.getInt(obj, i16);
                    i13 = i16;
                }
            } else {
                i10 = 0;
            }
            long j10 = iX & 1048575;
            switch (iW) {
                case 0:
                    if ((i10 & i12) != 0) {
                        iT0 = p.t0(i14);
                        iV += iT0;
                    }
                    break;
                case 1:
                    if ((i10 & i12) != 0) {
                        iT0 = p.x0(i14);
                        iV += iT0;
                    }
                    break;
                case 2:
                    if ((i10 & i12) != 0) {
                        iT0 = p.B0(i14, unsafe.getLong(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 3:
                    if ((i10 & i12) != 0) {
                        iT0 = p.L0(i14, unsafe.getLong(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 4:
                    if ((i10 & i12) != 0) {
                        iT0 = p.z0(i14, unsafe.getInt(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 5:
                    if ((i10 & i12) != 0) {
                        iT0 = p.w0(i14);
                        iV += iT0;
                    }
                    break;
                case 6:
                    if ((i10 & i12) != 0) {
                        iT0 = p.v0(i14);
                        iV += iT0;
                    }
                    break;
                case 7:
                    if ((i10 & i12) != 0) {
                        iT0 = p.r0(i14);
                        iV += iT0;
                    }
                    break;
                case 8:
                    if ((i10 & i12) != 0) {
                        Object object = unsafe.getObject(obj, j10);
                        iS0 = object instanceof l ? p.s0(i14, (l) object) : p.G0(i14, (String) object);
                        iV = iS0 + iV;
                    }
                    break;
                case 9:
                    if ((i10 & i12) != 0) {
                        iT0 = k1.o(i14, p(i11), unsafe.getObject(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 10:
                    if ((i10 & i12) != 0) {
                        iT0 = p.s0(i14, (l) unsafe.getObject(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 11:
                    if ((i10 & i12) != 0) {
                        iT0 = p.J0(i14, unsafe.getInt(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 12:
                    if ((i10 & i12) != 0) {
                        iT0 = p.u0(i14, unsafe.getInt(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 13:
                    if ((i10 & i12) != 0) {
                        iT0 = p.C0(i14);
                        iV += iT0;
                    }
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    if ((i10 & i12) != 0) {
                        iT0 = p.D0(i14);
                        iV += iT0;
                    }
                    break;
                case 15:
                    if ((i10 & i12) != 0) {
                        iT0 = p.E0(i14, unsafe.getInt(obj, j10));
                        iV += iT0;
                    }
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    if ((i10 & i12) != 0) {
                        iT0 = p.F0(i14, unsafe.getLong(obj, j10));
                        iV += iT0;
                    }
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if ((i10 & i12) != 0) {
                        iT0 = p.y0(i14, (b) unsafe.getObject(obj, j10), p(i11));
                        iV += iT0;
                    }
                    break;
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    iT0 = k1.h(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 19:
                    iT0 = k1.f(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                    iT0 = k1.m(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 21:
                    iT0 = k1.x(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 22:
                    iT0 = k1.k(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 23:
                    iT0 = k1.h(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 24:
                    iT0 = k1.f(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                    iT0 = k1.a(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 26:
                    iT0 = k1.u(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 27:
                    iT0 = k1.p(i14, (List) unsafe.getObject(obj, j10), p(i11));
                    iV += iT0;
                    break;
                case 28:
                    iT0 = k1.c(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 29:
                    iT0 = k1.v(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                    iT0 = k1.d(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 31:
                    iT0 = k1.f(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 32:
                    iT0 = k1.h(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 33:
                    iT0 = k1.q(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 34:
                    iT0 = k1.s(i14, (List) unsafe.getObject(obj, j10));
                    iV += iT0;
                    break;
                case 35:
                    int i17 = k1.i((List) unsafe.getObject(obj, j10));
                    if (i17 > 0) {
                        iV = a7.a.v(i17, p.I0(i14), i17, iV);
                    }
                    break;
                case 36:
                    int iG = k1.g((List) unsafe.getObject(obj, j10));
                    if (iG > 0) {
                        iV = a7.a.v(iG, p.I0(i14), iG, iV);
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    int iN = k1.n((List) unsafe.getObject(obj, j10));
                    if (iN > 0) {
                        iV = a7.a.v(iN, p.I0(i14), iN, iV);
                    }
                    break;
                case 38:
                    int iY = k1.y((List) unsafe.getObject(obj, j10));
                    if (iY > 0) {
                        iV = a7.a.v(iY, p.I0(i14), iY, iV);
                    }
                    break;
                case 39:
                    int iL = k1.l((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                        iV = a7.a.v(iL, p.I0(i14), iL, iV);
                    }
                    break;
                case 40:
                    int i18 = k1.i((List) unsafe.getObject(obj, j10));
                    if (i18 > 0) {
                        iV = a7.a.v(i18, p.I0(i14), i18, iV);
                    }
                    break;
                case 41:
                    int iG2 = k1.g((List) unsafe.getObject(obj, j10));
                    if (iG2 > 0) {
                        iV = a7.a.v(iG2, p.I0(i14), iG2, iV);
                    }
                    break;
                case 42:
                    int iB = k1.b((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iV = a7.a.v(iB, p.I0(i14), iB, iV);
                    }
                    break;
                case 43:
                    int iW2 = k1.w((List) unsafe.getObject(obj, j10));
                    if (iW2 > 0) {
                        iV = a7.a.v(iW2, p.I0(i14), iW2, iV);
                    }
                    break;
                case 44:
                    int iE = k1.e((List) unsafe.getObject(obj, j10));
                    if (iE > 0) {
                        iV = a7.a.v(iE, p.I0(i14), iE, iV);
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    int iG3 = k1.g((List) unsafe.getObject(obj, j10));
                    if (iG3 > 0) {
                        iV = a7.a.v(iG3, p.I0(i14), iG3, iV);
                    }
                    break;
                case 46:
                    int i19 = k1.i((List) unsafe.getObject(obj, j10));
                    if (i19 > 0) {
                        iV = a7.a.v(i19, p.I0(i14), i19, iV);
                    }
                    break;
                case 47:
                    int iR = k1.r((List) unsafe.getObject(obj, j10));
                    if (iR > 0) {
                        iV = a7.a.v(iR, p.I0(i14), iR, iV);
                    }
                    break;
                case 48:
                    int iT = k1.t((List) unsafe.getObject(obj, j10));
                    if (iT > 0) {
                        iV = a7.a.v(iT, p.I0(i14), iT, iV);
                    }
                    break;
                case 49:
                    iT0 = k1.j(i14, (List) unsafe.getObject(obj, j10), p(i11));
                    iV += iT0;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    Object object2 = unsafe.getObject(obj, j10);
                    Object objO = o(i11);
                    this.f3521n.getClass();
                    t0.b(object2, objO);
                    break;
                case 51:
                    if (u(obj, i14, i11)) {
                        iT0 = p.t0(i14);
                        iV += iT0;
                    }
                    break;
                case 52:
                    if (u(obj, i14, i11)) {
                        iT0 = p.x0(i14);
                        iV += iT0;
                    }
                    break;
                case 53:
                    if (u(obj, i14, i11)) {
                        iT0 = p.B0(i14, G(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 54:
                    if (u(obj, i14, i11)) {
                        iT0 = p.L0(i14, G(obj, j10));
                        iV += iT0;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (u(obj, i14, i11)) {
                        iT0 = p.z0(i14, F(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 56:
                    if (u(obj, i14, i11)) {
                        iT0 = p.w0(i14);
                        iV += iT0;
                    }
                    break;
                case 57:
                    if (u(obj, i14, i11)) {
                        iT0 = p.v0(i14);
                        iV += iT0;
                    }
                    break;
                case 58:
                    if (u(obj, i14, i11)) {
                        iT0 = p.r0(i14);
                        iV += iT0;
                    }
                    break;
                case 59:
                    if (u(obj, i14, i11)) {
                        Object object3 = unsafe.getObject(obj, j10);
                        iS0 = object3 instanceof l ? p.s0(i14, (l) object3) : p.G0(i14, (String) object3);
                        iV = iS0 + iV;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    if (u(obj, i14, i11)) {
                        iT0 = k1.o(i14, p(i11), unsafe.getObject(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 61:
                    if (u(obj, i14, i11)) {
                        iT0 = p.s0(i14, (l) unsafe.getObject(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 62:
                    if (u(obj, i14, i11)) {
                        iT0 = p.J0(i14, F(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 63:
                    if (u(obj, i14, i11)) {
                        iT0 = p.u0(i14, F(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 64:
                    if (u(obj, i14, i11)) {
                        iT0 = p.C0(i14);
                        iV += iT0;
                    }
                    break;
                case 65:
                    if (u(obj, i14, i11)) {
                        iT0 = p.D0(i14);
                        iV += iT0;
                    }
                    break;
                case 66:
                    if (u(obj, i14, i11)) {
                        iT0 = p.E0(i14, F(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 67:
                    if (u(obj, i14, i11)) {
                        iT0 = p.F0(i14, G(obj, j10));
                        iV += iT0;
                    }
                    break;
                case 68:
                    if (u(obj, i14, i11)) {
                        iT0 = p.y0(i14, (b) unsafe.getObject(obj, j10), p(i11));
                        iV += iT0;
                    }
                    break;
            }
            i11 += 3;
        }
    }

    public final int r(Object obj) {
        int iT0;
        int i10 = 0;
        int iV = 0;
        while (true) {
            int[] iArr = this.f3508a;
            if (i10 >= iArr.length) {
                this.f3520m.getClass();
                return ((b0) obj).unknownFields.b() + iV;
            }
            int iX = X(i10);
            int iW = W(iX);
            int i11 = iArr[i10];
            long j10 = iX & 1048575;
            if (iW >= w.f3626b.a() && iW <= w.f3627c.a()) {
                int i12 = iArr[i10 + 2];
            }
            Unsafe unsafe = f3507p;
            switch (iW) {
                case 0:
                    if (s(i10, obj)) {
                        iT0 = p.t0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 1:
                    if (s(i10, obj)) {
                        iT0 = p.x0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 2:
                    if (s(i10, obj)) {
                        iT0 = p.B0(i11, w1.k(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 3:
                    if (s(i10, obj)) {
                        iT0 = p.L0(i11, w1.k(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 4:
                    if (s(i10, obj)) {
                        iT0 = p.z0(i11, w1.j(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 5:
                    if (s(i10, obj)) {
                        iT0 = p.w0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 6:
                    if (s(i10, obj)) {
                        iT0 = p.v0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 7:
                    if (s(i10, obj)) {
                        iT0 = p.r0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 8:
                    if (s(i10, obj)) {
                        Object objL = w1.l(obj, j10);
                        iT0 = !(objL instanceof l) ? p.G0(i11, (String) objL) : p.s0(i11, (l) objL);
                        break;
                    }
                    i10 += 3;
                    break;
                case 9:
                    if (s(i10, obj)) {
                        iT0 = k1.o(i11, p(i10), w1.l(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 10:
                    if (s(i10, obj)) {
                        iT0 = p.s0(i11, (l) w1.l(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 11:
                    if (s(i10, obj)) {
                        iT0 = p.J0(i11, w1.j(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 12:
                    if (s(i10, obj)) {
                        iT0 = p.u0(i11, w1.j(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 13:
                    if (s(i10, obj)) {
                        iT0 = p.C0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    if (s(i10, obj)) {
                        iT0 = p.D0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 15:
                    if (s(i10, obj)) {
                        iT0 = p.E0(i11, w1.j(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    if (s(i10, obj)) {
                        iT0 = p.F0(i11, w1.k(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (s(i10, obj)) {
                        iT0 = p.y0(i11, (b) w1.l(obj, j10), p(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    iT0 = k1.h(i11, v(obj, j10));
                    break;
                case 19:
                    iT0 = k1.f(i11, v(obj, j10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                    iT0 = k1.m(i11, v(obj, j10));
                    break;
                case 21:
                    iT0 = k1.x(i11, v(obj, j10));
                    break;
                case 22:
                    iT0 = k1.k(i11, v(obj, j10));
                    break;
                case 23:
                    iT0 = k1.h(i11, v(obj, j10));
                    break;
                case 24:
                    iT0 = k1.f(i11, v(obj, j10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                    iT0 = k1.a(i11, v(obj, j10));
                    break;
                case 26:
                    iT0 = k1.u(i11, v(obj, j10));
                    break;
                case 27:
                    iT0 = k1.p(i11, v(obj, j10), p(i10));
                    break;
                case 28:
                    iT0 = k1.c(i11, v(obj, j10));
                    break;
                case 29:
                    iT0 = k1.v(i11, v(obj, j10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                    iT0 = k1.d(i11, v(obj, j10));
                    break;
                case 31:
                    iT0 = k1.f(i11, v(obj, j10));
                    break;
                case 32:
                    iT0 = k1.h(i11, v(obj, j10));
                    break;
                case 33:
                    iT0 = k1.q(i11, v(obj, j10));
                    break;
                case 34:
                    iT0 = k1.s(i11, v(obj, j10));
                    break;
                case 35:
                    int i13 = k1.i((List) unsafe.getObject(obj, j10));
                    if (i13 > 0) {
                        iV = a7.a.v(i13, p.I0(i11), i13, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 36:
                    int iG = k1.g((List) unsafe.getObject(obj, j10));
                    if (iG > 0) {
                        iV = a7.a.v(iG, p.I0(i11), iG, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    int iN = k1.n((List) unsafe.getObject(obj, j10));
                    if (iN > 0) {
                        iV = a7.a.v(iN, p.I0(i11), iN, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 38:
                    int iY = k1.y((List) unsafe.getObject(obj, j10));
                    if (iY > 0) {
                        iV = a7.a.v(iY, p.I0(i11), iY, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 39:
                    int iL = k1.l((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                        iV = a7.a.v(iL, p.I0(i11), iL, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 40:
                    int i14 = k1.i((List) unsafe.getObject(obj, j10));
                    if (i14 > 0) {
                        iV = a7.a.v(i14, p.I0(i11), i14, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 41:
                    int iG2 = k1.g((List) unsafe.getObject(obj, j10));
                    if (iG2 > 0) {
                        iV = a7.a.v(iG2, p.I0(i11), iG2, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 42:
                    int iB = k1.b((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iV = a7.a.v(iB, p.I0(i11), iB, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 43:
                    int iW2 = k1.w((List) unsafe.getObject(obj, j10));
                    if (iW2 > 0) {
                        iV = a7.a.v(iW2, p.I0(i11), iW2, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 44:
                    int iE = k1.e((List) unsafe.getObject(obj, j10));
                    if (iE > 0) {
                        iV = a7.a.v(iE, p.I0(i11), iE, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    int iG3 = k1.g((List) unsafe.getObject(obj, j10));
                    if (iG3 > 0) {
                        iV = a7.a.v(iG3, p.I0(i11), iG3, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 46:
                    int i15 = k1.i((List) unsafe.getObject(obj, j10));
                    if (i15 > 0) {
                        iV = a7.a.v(i15, p.I0(i11), i15, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 47:
                    int iR = k1.r((List) unsafe.getObject(obj, j10));
                    if (iR > 0) {
                        iV = a7.a.v(iR, p.I0(i11), iR, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 48:
                    int iT = k1.t((List) unsafe.getObject(obj, j10));
                    if (iT > 0) {
                        iV = a7.a.v(iT, p.I0(i11), iT, iV);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 49:
                    iT0 = k1.j(i11, v(obj, j10), p(i10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    Object objL2 = w1.l(obj, j10);
                    Object objO = o(i10);
                    this.f3521n.getClass();
                    t0.b(objL2, objO);
                    continue;
                    i10 += 3;
                    break;
                case 51:
                    if (u(obj, i11, i10)) {
                        iT0 = p.t0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 52:
                    if (u(obj, i11, i10)) {
                        iT0 = p.x0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 53:
                    if (u(obj, i11, i10)) {
                        iT0 = p.B0(i11, G(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 54:
                    if (u(obj, i11, i10)) {
                        iT0 = p.L0(i11, G(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (u(obj, i11, i10)) {
                        iT0 = p.z0(i11, F(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 56:
                    if (u(obj, i11, i10)) {
                        iT0 = p.w0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 57:
                    if (u(obj, i11, i10)) {
                        iT0 = p.v0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 58:
                    if (u(obj, i11, i10)) {
                        iT0 = p.r0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 59:
                    if (u(obj, i11, i10)) {
                        Object objL3 = w1.l(obj, j10);
                        iT0 = !(objL3 instanceof l) ? p.G0(i11, (String) objL3) : p.s0(i11, (l) objL3);
                        break;
                    }
                    i10 += 3;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    if (u(obj, i11, i10)) {
                        iT0 = k1.o(i11, p(i10), w1.l(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 61:
                    if (u(obj, i11, i10)) {
                        iT0 = p.s0(i11, (l) w1.l(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 62:
                    if (u(obj, i11, i10)) {
                        iT0 = p.J0(i11, F(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 63:
                    if (u(obj, i11, i10)) {
                        iT0 = p.u0(i11, F(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 64:
                    if (u(obj, i11, i10)) {
                        iT0 = p.C0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 65:
                    if (u(obj, i11, i10)) {
                        iT0 = p.D0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 66:
                    if (u(obj, i11, i10)) {
                        iT0 = p.E0(i11, F(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 67:
                    if (u(obj, i11, i10)) {
                        iT0 = p.F0(i11, G(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 68:
                    if (u(obj, i11, i10)) {
                        iT0 = p.y0(i11, (b) w1.l(obj, j10), p(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                default:
                    continue;
                    i10 += 3;
                    break;
            }
            iV = iT0 + iV;
            i10 += 3;
        }
    }

    public final boolean s(int i10, Object obj) {
        int i11 = this.f3508a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 != 1048575) {
            return ((1 << (i11 >>> 20)) & w1.f3633c.g(obj, j10)) != 0;
        }
        int iX = X(i10);
        long j11 = iX & 1048575;
        switch (W(iX)) {
            case 0:
                return Double.doubleToRawLongBits(w1.f3633c.e(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(w1.f3633c.f(obj, j11)) != 0;
            case 2:
                return w1.f3633c.h(obj, j11) != 0;
            case 3:
                return w1.f3633c.h(obj, j11) != 0;
            case 4:
                return w1.f3633c.g(obj, j11) != 0;
            case 5:
                return w1.f3633c.h(obj, j11) != 0;
            case 6:
                return w1.f3633c.g(obj, j11) != 0;
            case 7:
                return w1.f3633c.c(obj, j11);
            case 8:
                Object objI = w1.f3633c.i(obj, j11);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof l) {
                    return !l.f3571b.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return w1.f3633c.i(obj, j11) != null;
            case 10:
                return !l.f3571b.equals(w1.f3633c.i(obj, j11));
            case 11:
                return w1.f3633c.g(obj, j11) != 0;
            case 12:
                return w1.f3633c.g(obj, j11) != 0;
            case 13:
                return w1.f3633c.g(obj, j11) != 0;
            case Code.UNAVAILABLE /* 14 */:
                return w1.f3633c.h(obj, j11) != 0;
            case 15:
                return w1.f3633c.g(obj, j11) != 0;
            case Code.UNAUTHENTICATED /* 16 */:
                return w1.f3633c.h(obj, j11) != 0;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return w1.f3633c.i(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean u(Object obj, int i10, int i11) {
        return w1.f3633c.g(obj, (long) (this.f3508a[i11 + 2] & 1048575)) == i10;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0503 A[Catch: all -> 0x004e, TryCatch #5 {all -> 0x004e, blocks: (B:20:0x0044, B:22:0x0049, B:25:0x0051, B:38:0x007a, B:39:0x0081, B:127:0x04fe, B:129:0x0503, B:130:0x0508, B:46:0x009c, B:48:0x00af, B:49:0x00c2, B:50:0x00d5, B:51:0x00e8, B:52:0x00fb, B:53:0x0111, B:54:0x0124, B:55:0x0134, B:56:0x0149, B:57:0x0151, B:58:0x0165, B:59:0x0179, B:60:0x018d, B:61:0x01a1, B:62:0x01b5, B:63:0x01c9, B:64:0x01dd, B:65:0x01f1, B:66:0x01f8), top: B:151:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0510 A[LOOP:2: B:132:0x050e->B:133:0x0510, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x051a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0528 A[LOOP:3: B:140:0x0526->B:141:0x0528, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0532  */
    /* JADX WARN: Code duplicated, block: B:162:0x050e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    public final void w(p1 p1Var, Object obj, g2.m mVar, t tVar) throws Throwable {
        o1 o1Var;
        int[] iArr = this.f3515h;
        int i10 = this.f3517j;
        int i11 = this.f3516i;
        Throwable th = null;
        o1 o1VarA = null;
        while (true) {
            try {
                int iB = mVar.b();
                try {
                    int iT = (iB < this.f3510c || iB > this.f3511d) ? -1 : T(iB, 0);
                    if (iT >= 0) {
                        int iX = X(iT);
                        try {
                            int iW = W(iX);
                            n0 n0Var = this.f3519l;
                            switch (iW) {
                                case 0:
                                    o1Var = o1VarA;
                                    w1.r(obj, E(iX), mVar.o());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 1:
                                    o1Var = o1VarA;
                                    w1.s(obj, E(iX), mVar.x());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 2:
                                    o1Var = o1VarA;
                                    w1.u(obj, E(iX), mVar.B());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 3:
                                    o1Var = o1VarA;
                                    w1.u(obj, E(iX), mVar.R());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 4:
                                    o1Var = o1VarA;
                                    w1.t(E(iX), obj, mVar.z());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 5:
                                    o1Var = o1VarA;
                                    w1.u(obj, E(iX), mVar.v());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 6:
                                    o1Var = o1VarA;
                                    w1.t(E(iX), obj, mVar.t());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 7:
                                    o1Var = o1VarA;
                                    w1.n(obj, E(iX), mVar.j());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 8:
                                    o1Var = o1VarA;
                                    O(obj, iX, mVar);
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 9:
                                    o1Var = o1VarA;
                                    Object obj2 = (b) A(iT, obj);
                                    j1 j1VarP = p(iT);
                                    mVar.U(2);
                                    mVar.h(obj2, j1VarP, tVar);
                                    U(iT, obj, obj2);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 10:
                                    o1Var = o1VarA;
                                    w1.v(obj, E(iX), mVar.l());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 11:
                                    o1Var = o1VarA;
                                    w1.t(E(iX), obj, mVar.P());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 12:
                                    o1Var = o1VarA;
                                    int iQ = mVar.q();
                                    n(iT);
                                    w1.t(E(iX), obj, iQ);
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 13:
                                    o1Var = o1VarA;
                                    w1.t(E(iX), obj, mVar.E());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case Code.UNAVAILABLE /* 14 */:
                                    o1Var = o1VarA;
                                    w1.u(obj, E(iX), mVar.G());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 15:
                                    o1Var = o1VarA;
                                    w1.t(E(iX), obj, mVar.I());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case Code.UNAUTHENTICATED /* 16 */:
                                    o1Var = o1VarA;
                                    w1.u(obj, E(iX), mVar.K());
                                    R(iT, obj);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    o1Var = o1VarA;
                                    b bVar = (b) A(iT, obj);
                                    mVar.d(bVar, p(iT), tVar);
                                    U(iT, obj, bVar);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    o1Var = o1VarA;
                                    mVar.p(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 19:
                                    o1Var = o1VarA;
                                    mVar.y(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                                    o1Var = o1VarA;
                                    mVar.C(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 21:
                                    o1Var = o1VarA;
                                    mVar.S(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 22:
                                    o1Var = o1VarA;
                                    mVar.A(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 23:
                                    o1Var = o1VarA;
                                    mVar.w(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 24:
                                    o1Var = o1VarA;
                                    mVar.u(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                                    o1Var = o1VarA;
                                    mVar.k(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 26:
                                    o1Var = o1VarA;
                                    P(obj, iX, mVar);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 27:
                                    o1Var = o1VarA;
                                    N(obj, iX, mVar, p(iT), tVar);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 28:
                                    o1Var = o1VarA;
                                    mVar.n(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 29:
                                    o1Var = o1VarA;
                                    mVar.Q(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                    o1Var = o1VarA;
                                    List listC = n0Var.c(obj, E(iX));
                                    mVar.r(listC);
                                    n(iT);
                                    k1.z(obj, iB, listC, o1Var, p1Var);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 31:
                                    o1Var = o1VarA;
                                    mVar.F(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 32:
                                    o1Var = o1VarA;
                                    mVar.H(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 33:
                                    o1Var = o1VarA;
                                    mVar.J(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 34:
                                    o1Var = o1VarA;
                                    mVar.L(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 35:
                                    o1Var = o1VarA;
                                    mVar.p(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 36:
                                    o1Var = o1VarA;
                                    mVar.y(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                    o1Var = o1VarA;
                                    mVar.C(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 38:
                                    o1Var = o1VarA;
                                    mVar.S(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 39:
                                    o1Var = o1VarA;
                                    mVar.A(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 40:
                                    o1Var = o1VarA;
                                    mVar.w(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 41:
                                    o1Var = o1VarA;
                                    mVar.u(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 42:
                                    o1Var = o1VarA;
                                    mVar.k(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 43:
                                    o1Var = o1VarA;
                                    mVar.Q(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 44:
                                    o1Var = o1VarA;
                                    List listC2 = n0Var.c(obj, E(iX));
                                    mVar.r(listC2);
                                    n(iT);
                                    k1.z(obj, iB, listC2, o1Var, p1Var);
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    o1Var = o1VarA;
                                    mVar.F(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 46:
                                    o1Var = o1VarA;
                                    mVar.H(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 47:
                                    o1Var = o1VarA;
                                    mVar.J(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 48:
                                    o1Var = o1VarA;
                                    mVar.L(n0Var.c(obj, E(iX)));
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 49:
                                    o1Var = o1VarA;
                                    try {
                                        M(obj, E(iX), mVar, p(iT), tVar);
                                        o1VarA = o1Var;
                                    } catch (g0 unused) {
                                        o1VarA = o1Var;
                                        p1Var.getClass();
                                        if (o1VarA == null) {
                                            o1VarA = p1.a(obj);
                                        }
                                        if (!p1.c(o1VarA, mVar)) {
                                            while (i11 < i10) {
                                                m(obj, iArr[i11], o1VarA);
                                                i11++;
                                            }
                                            if (o1VarA != null) {
                                                ((b0) obj).unknownFields = o1VarA;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        o1VarA = o1Var;
                                        while (i11 < i10) {
                                            m(obj, iArr[i11], o1VarA);
                                            i11++;
                                        }
                                        if (o1VarA != null) {
                                            p1Var.getClass();
                                            ((b0) obj).unknownFields = o1VarA;
                                        }
                                        throw th;
                                    }
                                    th = null;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    x(obj, iT, o(iT));
                                    throw th;
                                case 51:
                                    w1.v(obj, E(iX), Double.valueOf(mVar.o()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 52:
                                    w1.v(obj, E(iX), Float.valueOf(mVar.x()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 53:
                                    w1.v(obj, E(iX), Long.valueOf(mVar.B()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 54:
                                    w1.v(obj, E(iX), Long.valueOf(mVar.R()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                    w1.v(obj, E(iX), Integer.valueOf(mVar.z()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 56:
                                    w1.v(obj, E(iX), Long.valueOf(mVar.v()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 57:
                                    w1.v(obj, E(iX), Integer.valueOf(mVar.t()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 58:
                                    w1.v(obj, E(iX), Boolean.valueOf(mVar.j()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 59:
                                    O(obj, iX, mVar);
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                                    Object obj3 = (b) B(obj, iB, iT);
                                    j1 j1VarP2 = p(iT);
                                    mVar.U(2);
                                    mVar.h(obj3, j1VarP2, tVar);
                                    V(obj, iB, iT, obj3);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 61:
                                    w1.v(obj, E(iX), mVar.l());
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 62:
                                    w1.v(obj, E(iX), Integer.valueOf(mVar.P()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 63:
                                    int iQ2 = mVar.q();
                                    n(iT);
                                    w1.v(obj, E(iX), Integer.valueOf(iQ2));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 64:
                                    w1.v(obj, E(iX), Integer.valueOf(mVar.E()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 65:
                                    w1.v(obj, E(iX), Long.valueOf(mVar.G()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 66:
                                    w1.v(obj, E(iX), Integer.valueOf(mVar.I()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 67:
                                    w1.v(obj, E(iX), Long.valueOf(mVar.K()));
                                    S(obj, iB, iT);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                case 68:
                                    b bVar2 = (b) B(obj, iB, iT);
                                    mVar.d(bVar2, p(iT), tVar);
                                    V(obj, iB, iT, bVar2);
                                    o1Var = o1VarA;
                                    o1VarA = o1Var;
                                    th = null;
                                    break;
                                default:
                                    if (o1VarA == null) {
                                        try {
                                            p1Var.getClass();
                                            o1VarA = p1.a(obj);
                                        } catch (g0 unused2) {
                                            p1Var.getClass();
                                            if (o1VarA == null) {
                                                o1VarA = p1.a(obj);
                                            }
                                            if (!p1.c(o1VarA, mVar)) {
                                                while (i11 < i10) {
                                                    m(obj, iArr[i11], o1VarA);
                                                    i11++;
                                                }
                                                if (o1VarA != null) {
                                                    ((b0) obj).unknownFields = o1VarA;
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                    p1Var.getClass();
                                    if (!p1.c(o1VarA, mVar)) {
                                        while (i11 < i10) {
                                            m(obj, iArr[i11], o1VarA);
                                            i11++;
                                        }
                                        if (o1VarA != null) {
                                            ((b0) obj).unknownFields = o1VarA;
                                            return;
                                        }
                                        return;
                                    }
                                    th = null;
                                    break;
                            }
                        } catch (g0 unused3) {
                        }
                    } else {
                        if (iB == Integer.MAX_VALUE) {
                            while (i11 < i10) {
                                m(obj, iArr[i11], o1VarA);
                                i11++;
                            }
                            if (o1VarA != null) {
                                p1Var.getClass();
                                ((b0) obj).unknownFields = o1VarA;
                                return;
                            }
                            return;
                        }
                        try {
                            p1Var.getClass();
                            if (o1VarA == null) {
                                o1VarA = p1.a(obj);
                            }
                            if (!p1.c(o1VarA, mVar)) {
                                while (i11 < i10) {
                                    m(obj, iArr[i11], o1VarA);
                                    i11++;
                                }
                                if (o1VarA != null) {
                                    ((b0) obj).unknownFields = o1VarA;
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            while (i11 < i10) {
                                m(obj, iArr[i11], o1VarA);
                                i11++;
                            }
                            if (o1VarA != null) {
                                p1Var.getClass();
                                ((b0) obj).unknownFields = o1VarA;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    o1Var = o1VarA;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void x(Object obj, int i10, Object obj2) {
        long jX = X(i10) & 1048575;
        Object objI = w1.f3633c.i(obj, jX);
        t0 t0Var = this.f3521n;
        if (objI != null) {
            t0Var.getClass();
            if (t0.c(objI)) {
                s0 s0VarC = s0.f3616b.c();
                t0.d(s0VarC, objI);
                w1.v(obj, jX, s0VarC);
                objI = s0VarC;
            }
        } else {
            t0Var.getClass();
            objI = s0.f3616b.c();
            w1.v(obj, jX, objI);
        }
        t0Var.getClass();
        a7.a.w(obj2);
        throw null;
    }

    public final void y(int i10, Object obj, Object obj2) {
        if (s(i10, obj2)) {
            long jX = X(i10) & 1048575;
            Unsafe unsafe = f3507p;
            Object object = unsafe.getObject(obj2, jX);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f3508a[i10] + " is present but null: " + obj2);
            }
            j1 j1VarP = p(i10);
            if (!s(i10, obj)) {
                if (t(object)) {
                    Object objF = j1VarP.f();
                    j1VarP.a(objF, object);
                    unsafe.putObject(obj, jX, objF);
                } else {
                    unsafe.putObject(obj, jX, object);
                }
                R(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jX);
            if (!t(object2)) {
                Object objF2 = j1VarP.f();
                j1VarP.a(objF2, object2);
                unsafe.putObject(obj, jX, objF2);
                object2 = objF2;
            }
            j1VarP.a(object2, object);
        }
    }

    public final void z(int i10, Object obj, Object obj2) {
        int[] iArr = this.f3508a;
        int i11 = iArr[i10];
        if (u(obj2, i11, i10)) {
            long jX = X(i10) & 1048575;
            Unsafe unsafe = f3507p;
            Object object = unsafe.getObject(obj2, jX);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            j1 j1VarP = p(i10);
            if (!u(obj, i11, i10)) {
                if (t(object)) {
                    Object objF = j1VarP.f();
                    j1VarP.a(objF, object);
                    unsafe.putObject(obj, jX, objF);
                } else {
                    unsafe.putObject(obj, jX, object);
                }
                S(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jX);
            if (!t(object2)) {
                Object objF2 = j1VarP.f();
                j1VarP.a(objF2, object2);
                unsafe.putObject(obj, jX, objF2);
                object2 = objF2;
            }
            j1VarP.a(object2, object);
        }
    }
}
