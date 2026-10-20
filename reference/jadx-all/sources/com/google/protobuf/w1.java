package com.google.protobuf;

import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import k6.w4;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class w1 implements i2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f4255o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f4256p = z2.m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f4257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f4258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t1 f4261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f4264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y1 f4267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h1 f4268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t2 f4269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o1 f4270n;

    public w1(int[] iArr, Object[] objArr, int i10, int i11, t1 t1Var, boolean z10, int[] iArr2, int i12, int i13, y1 y1Var, h1 h1Var, t2 t2Var, a0 a0Var, o1 o1Var) {
        this.f4257a = iArr;
        this.f4258b = objArr;
        this.f4259c = i10;
        this.f4260d = i11;
        this.f4262f = t1Var instanceof l0;
        this.f4263g = z10;
        this.f4264h = iArr2;
        this.f4265i = i12;
        this.f4266j = i13;
        this.f4267k = y1Var;
        this.f4268l = h1Var;
        this.f4269m = t2Var;
        this.f4261e = t1Var;
        this.f4270n = o1Var;
    }

    public static w1 D(q1 q1Var, y1 y1Var, h1 h1Var, t2 t2Var, a0 a0Var, o1 o1Var) {
        if (q1Var instanceof f2) {
            return E((f2) q1Var, y1Var, h1Var, t2Var, a0Var, o1Var);
        }
        a7.a.w(q1Var);
        throw null;
    }

    public static w1 E(f2 f2Var, y1 y1Var, h1 h1Var, t2 t2Var, a0 a0Var, o1 o1Var) {
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
        Field fieldR;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        Field fieldR2;
        Field fieldR3;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        char cCharAt12;
        int i34;
        char cCharAt13;
        int i35 = 0;
        boolean z10 = f2Var.d() == 2;
        String strC = f2Var.c();
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
            iArr = f4255o;
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
        Object[] objArrB = f2Var.b();
        Class<?> cls = f2Var.a().getClass();
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
            Unsafe unsafe = f4256p;
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
                    fieldR2 = (Field) obj;
                } else {
                    fieldR2 = R(cls, (String) obj);
                    objArrB[i87] = fieldR2;
                }
                int i88 = i11;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldR2);
                int i89 = i87 + 1;
                Object obj2 = objArrB[i89];
                if (obj2 instanceof Field) {
                    fieldR3 = (Field) obj2;
                } else {
                    fieldR3 = R(cls, (String) obj2);
                    objArrB[i89] = fieldR3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldR3);
                i11 = i88;
                i27 = 0;
                i26 = i86;
            } else {
                i25 = iCharAt;
                int i90 = i11 + 1;
                Field fieldR4 = R(cls, (String) objArrB[i11]);
                if (i78 == 9 || i78 == 17) {
                    objArr[((i69 / 3) * 2) + 1] = fieldR4.getType();
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
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldR4);
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
                        fieldR = (Field) obj3;
                    } else {
                        fieldR = R(cls, (String) obj3);
                        objArrB[i97] = fieldR;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldR);
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
        return new w1(iArr3, objArr, i12, iCharAt, f2Var.a(), z10, iArr, iCharAt3, i65, y1Var, h1Var, t2Var, a0Var, o1Var);
    }

    public static long F(int i10) {
        return i10 & 1048575;
    }

    public static int G(Object obj, long j10) {
        return ((Integer) z2.f4286c.k(obj, j10)).intValue();
    }

    public static long H(Object obj, long j10) {
        return ((Long) z2.f4286c.k(obj, j10)).longValue();
    }

    public static Field R(Class cls, String str) {
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

    public static int X(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void b0(int i10, Object obj, w4 w4Var) {
        if (obj instanceof String) {
            w4Var.Q(i10, (String) obj);
        } else {
            w4Var.m(i10, (n) obj);
        }
    }

    public static void l(Object obj) {
        if (v(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static int m(byte[] bArr, int i10, int i11, h3 h3Var, Class cls, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        switch (h3Var.ordinal()) {
            case 0:
                eVar.f3532c = Double.valueOf(Double.longBitsToDouble(n2.l(i10, bArr)));
                return i10 + 8;
            case 1:
                eVar.f3532c = Float.valueOf(Float.intBitsToFloat(n2.j(i10, bArr)));
                return i10 + 4;
            case 2:
            case 3:
                int iL = n2.L(bArr, i10, eVar);
                eVar.f3532c = Long.valueOf(eVar.f3531b);
                return iL;
            case 4:
            case 12:
            case 13:
                int iJ = n2.J(bArr, i10, eVar);
                eVar.f3532c = Integer.valueOf(eVar.f3530a);
                return iJ;
            case 5:
            case 15:
                eVar.f3532c = Long.valueOf(n2.l(i10, bArr));
                return i10 + 8;
            case 6:
            case Code.UNAVAILABLE /* 14 */:
                eVar.f3532c = Integer.valueOf(n2.j(i10, bArr));
                return i10 + 4;
            case 7:
                int iL2 = n2.L(bArr, i10, eVar);
                eVar.f3532c = Boolean.valueOf(eVar.f3531b != 0);
                return iL2;
            case 8:
                return n2.F(bArr, i10, eVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                i2 i2VarA = d2.f4094c.a(cls);
                Object objF = i2VarA.f();
                int iQ = n2.Q(objF, i2VarA, bArr, i10, i11, eVar);
                i2VarA.b(objF);
                eVar.f3532c = objF;
                return iQ;
            case 11:
                return n2.f(bArr, i10, eVar);
            case Code.UNAUTHENTICATED /* 16 */:
                int iJ2 = n2.J(bArr, i10, eVar);
                eVar.f3532c = Integer.valueOf(s.b(eVar.f3530a));
                return iJ2;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                int iL3 = n2.L(bArr, i10, eVar);
                eVar.f3532c = Long.valueOf(s.c(eVar.f3531b));
                return iL3;
        }
    }

    public static s2 r(Object obj) {
        l0 l0Var = (l0) obj;
        s2 s2Var = l0Var.unknownFields;
        if (s2Var != s2.f4234f) {
            return s2Var;
        }
        s2 s2Var2 = new s2();
        l0Var.unknownFields = s2Var2;
        return s2Var2;
    }

    public static boolean v(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof l0) {
            return ((l0) obj).isMutable();
        }
        return true;
    }

    public static List x(Object obj, long j10) {
        return (List) z2.f4286c.k(obj, j10);
    }

    public final void A(int i10, Object obj, Object obj2) {
        int[] iArr = this.f4257a;
        int i11 = iArr[i10];
        if (w(obj2, i11, i10)) {
            long jY = Y(i10) & 1048575;
            Unsafe unsafe = f4256p;
            Object object = unsafe.getObject(obj2, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            i2 i2VarQ = q(i10);
            if (!w(obj, i11, i10)) {
                if (v(object)) {
                    Object objF = i2VarQ.f();
                    i2VarQ.a(objF, object);
                    unsafe.putObject(obj, jY, objF);
                } else {
                    unsafe.putObject(obj, jY, object);
                }
                T(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jY);
            if (!v(object2)) {
                Object objF2 = i2VarQ.f();
                i2VarQ.a(objF2, object2);
                unsafe.putObject(obj, jY, objF2);
                object2 = objF2;
            }
            i2VarQ.a(object2, object);
        }
    }

    public final Object B(int i10, Object obj) {
        i2 i2VarQ = q(i10);
        long jY = Y(i10) & 1048575;
        if (!u(i10, obj)) {
            return i2VarQ.f();
        }
        Object object = f4256p.getObject(obj, jY);
        if (v(object)) {
            return object;
        }
        Object objF = i2VarQ.f();
        if (object != null) {
            i2VarQ.a(objF, object);
        }
        return objF;
    }

    public final Object C(Object obj, int i10, int i11) {
        i2 i2VarQ = q(i11);
        if (!w(obj, i10, i11)) {
            return i2VarQ.f();
        }
        Object object = f4256p.getObject(obj, Y(i11) & 1048575);
        if (v(object)) {
            return object;
        }
        Object objF = i2VarQ.f();
        if (object != null) {
            i2VarQ.a(objF, object);
        }
        return objF;
    }

    public final int I(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        Object objP = p(i12);
        Unsafe unsafe = f4256p;
        Object object = unsafe.getObject(obj, j10);
        this.f4270n.getClass();
        if (o1.d(object)) {
            n1 n1VarF = o1.f();
            o1.e(n1VarF, object);
            unsafe.putObject(obj, j10, n1VarF);
            object = n1VarF;
        }
        i3.a0 a0VarA = o1.a(objP);
        n1 n1VarB = o1.b(object);
        int iJ = n2.J(bArr, i10, eVar);
        int i13 = eVar.f3530a;
        if (i13 < 0 || i13 > i11 - iJ) {
            throw a1.h();
        }
        int i14 = i13 + iJ;
        Object obj2 = a0VarA.f7942b;
        Object obj3 = a0VarA.f7944d;
        while (iJ < i14) {
            int I = iJ + 1;
            int i15 = bArr[iJ];
            if (i15 < 0) {
                I = n2.I(i15, bArr, I, eVar);
                i15 = eVar.f3530a;
            }
            int i16 = I;
            int i17 = i15 >>> 3;
            int i18 = i15 & 7;
            if (i17 != 1) {
                if (i17 == 2) {
                    h3 h3Var = (h3) a0VarA.f7943c;
                    if (i18 == h3Var.f4133b) {
                        iJ = m(bArr, i16, i11, h3Var, a0VarA.f7944d.getClass(), eVar);
                        obj3 = eVar.f3532c;
                    }
                }
                iJ = n2.R(i15, bArr, i16, i11, eVar);
            } else {
                h3 h3Var2 = (h3) a0VarA.f7941a;
                if (i18 == h3Var2.f4133b) {
                    iJ = m(bArr, i16, i11, h3Var2, null, eVar);
                    obj2 = eVar.f3532c;
                } else {
                    iJ = n2.R(i15, bArr, i16, i11, eVar);
                }
            }
        }
        if (iJ != i14) {
            throw a1.g();
        }
        n1VarB.put(obj2, obj3);
        return i14;
    }

    public final int J(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        long j11 = this.f4257a[i17 + 2] & 1048575;
        Unsafe unsafe = f4256p;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(n2.h(i10, bArr)));
                int i18 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(n2.n(i10, bArr)));
                int i19 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iL = n2.L(bArr, i10, eVar);
                unsafe.putObject(obj, j10, Long.valueOf(eVar.f3531b));
                unsafe.putInt(obj, j11, i13);
                return iL;
            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iJ = n2.J(bArr, i10, eVar);
                unsafe.putObject(obj, j10, Integer.valueOf(eVar.f3530a));
                unsafe.putInt(obj, j11, i13);
                return iJ;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(n2.l(i10, bArr)));
                int i20 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(n2.j(i10, bArr)));
                int i21 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iL2 = n2.L(bArr, i10, eVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(eVar.f3531b != 0));
                unsafe.putInt(obj, j11, i13);
                return iL2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iJ2 = n2.J(bArr, i10, eVar);
                int i22 = eVar.f3530a;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !c3.f(bArr, iJ2, iJ2 + i22)) {
                        throw a1.c();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iJ2, i22, y0.f4276a));
                    iJ2 += i22;
                }
                unsafe.putInt(obj, j11, i13);
                return iJ2;
            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                if (i14 != 2) {
                    return i10;
                }
                Object objC = C(obj, i13, i17);
                int iQ = n2.Q(objC, q(i17), bArr, i10, i11, eVar);
                W(obj, i13, i17, objC);
                return iQ;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iF = n2.f(bArr, i10, eVar);
                unsafe.putObject(obj, j10, eVar.f3532c);
                unsafe.putInt(obj, j11, i13);
                return iF;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iJ3 = n2.J(bArr, i10, eVar);
                int i23 = eVar.f3530a;
                o(i17);
                unsafe.putObject(obj, j10, Integer.valueOf(i23));
                unsafe.putInt(obj, j11, i13);
                return iJ3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iJ4 = n2.J(bArr, i10, eVar);
                unsafe.putObject(obj, j10, Integer.valueOf(s.b(eVar.f3530a)));
                unsafe.putInt(obj, j11, i13);
                return iJ4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iL3 = n2.L(bArr, i10, eVar);
                unsafe.putObject(obj, j10, Long.valueOf(s.c(eVar.f3531b)));
                unsafe.putInt(obj, j11, i13);
                return iL3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                Object objC2 = C(obj, i13, i17);
                int iP = n2.P(objC2, q(i17), bArr, i10, i11, (i12 & (-8)) | 4, eVar);
                W(obj, i13, i17, objC2);
                return iP;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x034f A[PHI: r0 r15 r16 r19 r21
  0x034f: PHI (r0v27 int) = (r0v23 int), (r0v25 int), (r0v30 int) binds: [B:121:0x03b8, B:117:0x0397, B:108:0x034d] A[DONT_GENERATE, DONT_INLINE]
  0x034f: PHI (r15v11 int) = (r15v9 int), (r15v9 int), (r15v12 int) binds: [B:121:0x03b8, B:117:0x0397, B:108:0x034d] A[DONT_GENERATE, DONT_INLINE]
  0x034f: PHI (r16v6 int) = (r16v4 int), (r16v4 int), (r16v7 int) binds: [B:121:0x03b8, B:117:0x0397, B:108:0x034d] A[DONT_GENERATE, DONT_INLINE]
  0x034f: PHI (r19v9 sun.misc.Unsafe) = (r19v7 sun.misc.Unsafe), (r19v7 sun.misc.Unsafe), (r19v10 sun.misc.Unsafe) binds: [B:121:0x03b8, B:117:0x0397, B:108:0x034d] A[DONT_GENERATE, DONT_INLINE]
  0x034f: PHI (r21v6 int) = (r21v4 int), (r21v4 int), (r21v8 int) binds: [B:121:0x03b8, B:117:0x0397, B:108:0x034d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x0368 A[PHI: r0 r15 r16 r19 r21
  0x0368: PHI (r0v26 int) = (r0v23 int), (r0v25 int), (r0v30 int) binds: [B:121:0x03b8, B:117:0x0397, B:108:0x034d] A[DONT_GENERATE, DONT_INLINE]
  0x0368: PHI (r15v10 int) = (r15v9 int), (r15v9 int), (r15v12 int) binds: [B:121:0x03b8, B:117:0x0397, B:108:0x034d] A[DONT_GENERATE, DONT_INLINE]
  0x0368: PHI (r16v5 int) = (r16v4 int), (r16v4 int), (r16v7 int) binds: [B:121:0x03b8, B:117:0x0397, B:108:0x034d] A[DONT_GENERATE, DONT_INLINE]
  0x0368: PHI (r19v8 sun.misc.Unsafe) = (r19v7 sun.misc.Unsafe), (r19v7 sun.misc.Unsafe), (r19v10 sun.misc.Unsafe) binds: [B:121:0x03b8, B:117:0x0397, B:108:0x034d] A[DONT_GENERATE, DONT_INLINE]
  0x0368: PHI (r21v5 int) = (r21v4 int), (r21v4 int), (r21v8 int) binds: [B:121:0x03b8, B:117:0x0397, B:108:0x034d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a9. Please report as an issue. */
    public final int K(Object obj, byte[] bArr, int i10, int i11, int i12, com.google.crypto.tink.shaded.protobuf.e eVar) {
        Unsafe unsafe;
        int i13;
        Object obj2;
        int i14;
        int I;
        int i15;
        int iU;
        int iU2;
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
        int i28;
        int i29;
        int i30;
        int iL;
        int i31;
        this = this;
        Object obj3 = obj;
        bArr = bArr;
        i11 = i11;
        int i32 = i12;
        eVar = eVar;
        l(obj);
        Unsafe unsafe2 = f4256p;
        int iG = i10;
        int i33 = -1;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 1048575;
        while (true) {
            if (iG < i11) {
                int i38 = iG + 1;
                byte b10 = bArr[iG];
                if (b10 < 0) {
                    I = n2.I(b10, bArr, i38, eVar);
                    i14 = eVar.f3530a;
                } else {
                    i14 = b10;
                    I = i38;
                }
                int i39 = i14 >>> 3;
                int i40 = i14 & 7;
                int i41 = this.f4260d;
                int i42 = I;
                int i43 = this.f4259c;
                int i44 = i14;
                if (i39 > i33) {
                    iU2 = (i39 < i43 || i39 > i41) ? -1 : this.U(i39, i34 / 3);
                    i16 = -1;
                    i15 = 0;
                } else {
                    if (i39 < i43 || i39 > i41) {
                        i15 = 0;
                        iU = -1;
                    } else {
                        i15 = 0;
                        iU = this.U(i39, 0);
                    }
                    iU2 = iU;
                    i16 = -1;
                }
                if (iU2 == i16) {
                    i17 = i42;
                    i18 = i36;
                    i19 = i37;
                    i20 = i15;
                    i21 = i39;
                    i13 = i32;
                    i22 = i44;
                    unsafe = unsafe2;
                } else {
                    int[] iArr = this.f4257a;
                    int i45 = iArr[iU2 + 1];
                    int iX = X(i45);
                    long j10 = i45 & 1048575;
                    if (iX <= 17) {
                        int i46 = iArr[iU2 + 2];
                        int i47 = 1 << (i46 >>> 20);
                        int i48 = i46 & 1048575;
                        if (i48 != i37) {
                            if (i37 != 1048575) {
                                unsafe2.putInt(obj3, i37, i36);
                            }
                            i25 = i48;
                            i24 = unsafe2.getInt(obj3, i48);
                        } else {
                            i24 = i36;
                            i25 = i37;
                        }
                        switch (iX) {
                            case 0:
                                i26 = i25;
                                i27 = iU2;
                                i28 = i42;
                                i29 = i44;
                                i30 = i39;
                                if (i40 == 1) {
                                    z2.r(obj3, j10, n2.h(i28, bArr));
                                    iG = i28 + 8;
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case 1:
                                i26 = i25;
                                i27 = iU2;
                                i28 = i42;
                                i29 = i44;
                                i30 = i39;
                                if (i40 == 5) {
                                    z2.s(obj3, j10, n2.n(i28, bArr));
                                    iG = i28 + 4;
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case 2:
                            case 3:
                                i26 = i25;
                                i27 = iU2;
                                i28 = i42;
                                i29 = i44;
                                i30 = i39;
                                if (i40 == 0) {
                                    iL = n2.L(bArr, i28, eVar);
                                    unsafe2.putLong(obj, j10, eVar.f3531b);
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    iG = iL;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case 4:
                            case 11:
                                i26 = i25;
                                i27 = iU2;
                                i28 = i42;
                                i29 = i44;
                                i30 = i39;
                                if (i40 == 0) {
                                    iG = n2.J(bArr, i28, eVar);
                                    unsafe2.putInt(obj3, j10, eVar.f3530a);
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case 5:
                            case Code.UNAVAILABLE /* 14 */:
                                i31 = i42;
                                i26 = i25;
                                i29 = i44;
                                i27 = iU2;
                                i30 = i39;
                                if (i40 == 1) {
                                    i28 = i31;
                                    unsafe2.putLong(obj, j10, n2.l(i31, bArr));
                                    iG = i28 + 8;
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i28 = i31;
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case 6:
                            case 13:
                                i31 = i42;
                                i26 = i25;
                                i29 = i44;
                                i27 = iU2;
                                i30 = i39;
                                if (i40 == 5) {
                                    unsafe2.putInt(obj3, j10, n2.j(i31, bArr));
                                    iG = i31 + 4;
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i28 = i31;
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case 7:
                                i31 = i42;
                                i26 = i25;
                                i29 = i44;
                                i27 = iU2;
                                i30 = i39;
                                if (i40 == 0) {
                                    int iL2 = n2.L(bArr, i31, eVar);
                                    z2.n(obj3, j10, eVar.f3531b != 0);
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    iG = iL2;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i28 = i31;
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case 8:
                                i31 = i42;
                                i26 = i25;
                                i29 = i44;
                                i27 = iU2;
                                i30 = i39;
                                if (i40 == 2) {
                                    iG = (i45 & 536870912) == 0 ? n2.C(bArr, i31, eVar) : n2.F(bArr, i31, eVar);
                                    unsafe2.putObject(obj3, j10, eVar.f3532c);
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i28 = i31;
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case 9:
                                i31 = i42;
                                i26 = i25;
                                i29 = i44;
                                i27 = iU2;
                                i30 = i39;
                                if (i40 == 2) {
                                    Object objB = this.B(i27, obj3);
                                    iG = n2.Q(objB, this.q(i27), bArr, i31, i11, eVar);
                                    this.V(i27, obj3, objB);
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i28 = i31;
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case 10:
                                i31 = i42;
                                i26 = i25;
                                i29 = i44;
                                i27 = iU2;
                                i30 = i39;
                                if (i40 == 2) {
                                    iG = n2.f(bArr, i31, eVar);
                                    unsafe2.putObject(obj3, j10, eVar.f3532c);
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i28 = i31;
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case 12:
                                i31 = i42;
                                i26 = i25;
                                i29 = i44;
                                i27 = iU2;
                                i30 = i39;
                                if (i40 == 0) {
                                    iG = n2.J(bArr, i31, eVar);
                                    int i49 = eVar.f3530a;
                                    this.o(i27);
                                    unsafe2.putInt(obj3, j10, i49);
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i28 = i31;
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case 15:
                                i31 = i42;
                                i26 = i25;
                                i29 = i44;
                                i27 = iU2;
                                i30 = i39;
                                if (i40 == 0) {
                                    iG = n2.J(bArr, i31, eVar);
                                    unsafe2.putInt(obj3, j10, s.b(eVar.f3530a));
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i28 = i31;
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case Code.UNAUTHENTICATED /* 16 */:
                                i31 = i42;
                                i26 = i25;
                                i29 = i44;
                                i27 = iU2;
                                i30 = i39;
                                if (i40 == 0) {
                                    iL = n2.L(bArr, i31, eVar);
                                    unsafe2.putLong(obj, j10, s.c(eVar.f3531b));
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    iG = iL;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i28 = i31;
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (i40 == 3) {
                                    Object objB2 = this.B(iU2, obj3);
                                    i26 = i25;
                                    i29 = i44;
                                    i27 = iU2;
                                    i30 = i39;
                                    iG = n2.P(objB2, this.q(iU2), bArr, i42, i11, (i39 << 3) | 4, eVar);
                                    this.V(i27, obj3, objB2);
                                    i36 = i24 | i47;
                                    i35 = i29;
                                    i34 = i27;
                                    i37 = i26;
                                    i33 = i30;
                                    i32 = i12;
                                } else {
                                    i31 = i42;
                                    i26 = i25;
                                    i29 = i44;
                                    i27 = iU2;
                                    i30 = i39;
                                    i28 = i31;
                                    i22 = i29;
                                    i13 = i12;
                                    i17 = i28;
                                    i20 = i27;
                                    i19 = i26;
                                    i21 = i30;
                                    unsafe = unsafe2;
                                    i18 = i24;
                                }
                                break;
                            default:
                                i26 = i25;
                                i27 = iU2;
                                i28 = i42;
                                i29 = i44;
                                i30 = i39;
                                i22 = i29;
                                i13 = i12;
                                i17 = i28;
                                i20 = i27;
                                i19 = i26;
                                i21 = i30;
                                unsafe = unsafe2;
                                i18 = i24;
                                break;
                        }
                    } else {
                        int i50 = iU2;
                        if (iX != 27) {
                            i18 = i36;
                            i19 = i37;
                            if (iX <= 49) {
                                i21 = i39;
                                unsafe = unsafe2;
                                i13 = i12;
                                i20 = i50;
                                iG = M(obj, bArr, i42, i11, i44, i40, i50, i45, iX, j10, eVar);
                                if (iG != i42) {
                                    i35 = i44;
                                } else {
                                    i22 = i44;
                                    i17 = iG;
                                }
                                i32 = i13;
                                i33 = i21;
                                i36 = i18;
                                unsafe2 = unsafe;
                                i34 = i20;
                                i37 = i19;
                                obj3 = obj;
                            } else {
                                i13 = i12;
                                i23 = i42;
                                i21 = i39;
                                unsafe = unsafe2;
                                i20 = i50;
                                if (iX != 50) {
                                    iG = J(obj, bArr, i23, i11, i44, i21, i40, i45, iX, j10, i20, eVar);
                                    if (iG != i23) {
                                        i35 = i44;
                                    } else {
                                        i22 = i44;
                                        i17 = iG;
                                    }
                                    i32 = i13;
                                    i33 = i21;
                                    i36 = i18;
                                    unsafe2 = unsafe;
                                    i34 = i20;
                                    i37 = i19;
                                    obj3 = obj;
                                } else if (i40 == 2) {
                                    iG = I(obj, bArr, i23, i11, i20, j10, eVar);
                                    if (iG != i23) {
                                        i35 = i44;
                                    } else {
                                        i22 = i44;
                                        i17 = iG;
                                    }
                                    i32 = i13;
                                    i33 = i21;
                                    i36 = i18;
                                    unsafe2 = unsafe;
                                    i34 = i20;
                                    i37 = i19;
                                    obj3 = obj;
                                }
                            }
                        } else if (i40 == 2) {
                            d dVar = (d) ((x0) unsafe2.getObject(obj3, j10));
                            boolean zG = dVar.g();
                            d dVar2 = dVar;
                            if (!zG) {
                                int size = dVar.size();
                                x0 x0VarA = dVar.a(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, j10, x0VarA);
                                dVar2 = x0VarA;
                            }
                            iG = n2.q(this.q(i50), i44, bArr, i42, i11, dVar2, eVar);
                            i35 = i44;
                            i11 = i11;
                            i34 = i50;
                            i36 = i36;
                            i33 = i39;
                            i37 = i37;
                            i32 = i12;
                        } else {
                            i18 = i36;
                            i19 = i37;
                            i13 = i12;
                            i23 = i42;
                            i20 = i50;
                            i21 = i39;
                            unsafe = unsafe2;
                        }
                        i22 = i44;
                        i17 = i23;
                    }
                }
                if (i22 != i13 || i13 == 0) {
                    iG = n2.G(i22, bArr, i17, i11, r(obj), eVar);
                    i35 = i22;
                    i32 = i13;
                    i33 = i21;
                    i36 = i18;
                    unsafe2 = unsafe;
                    i34 = i20;
                    i37 = i19;
                    obj3 = obj;
                } else {
                    iG = i17;
                    i35 = i22;
                    i36 = i18;
                    i37 = i19;
                }
            } else {
                unsafe = unsafe2;
                i13 = i32;
            }
        }
        if (i37 != 1048575) {
            long j11 = i37;
            obj2 = obj;
            unsafe.putInt(obj2, j11, i36);
        } else {
            obj2 = obj;
        }
        for (int i51 = this.f4265i; i51 < this.f4266j; i51++) {
            n(obj2, this.f4264h[i51], null);
        }
        if (i13 == 0) {
            if (iG != i11) {
                throw a1.g();
            }
        } else if (iG > i11 || i35 != i13) {
            throw a1.g();
        }
        return iG;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x009c. Please report as an issue. */
    public final void L(Object obj, byte[] bArr, int i10, int i11, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        int i12;
        int I;
        int iU;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe;
        int i18;
        int i19;
        int iL;
        int i20;
        int i21;
        int i22;
        w1 w1Var = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        i11 = i11;
        com.google.crypto.tink.shaded.protobuf.e eVar2 = eVar;
        l(obj);
        Unsafe unsafe2 = f4256p;
        int i23 = 0;
        int iG = i10;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        int i27 = 1048575;
        while (iG < i11) {
            int i28 = iG + 1;
            byte b10 = bArr2[iG];
            if (b10 < 0) {
                I = n2.I(b10, bArr2, i28, eVar2);
                i12 = eVar2.f3530a;
            } else {
                i12 = b10;
                I = i28;
            }
            int i29 = i12 >>> 3;
            int i30 = i12 & 7;
            int i31 = w1Var.f4260d;
            int i32 = w1Var.f4259c;
            if (i29 > i26) {
                int i33 = i24 / 3;
                if (i29 < i32 || i29 > i31) {
                    iU = -1;
                } else {
                    iU = w1Var.U(i29, i33);
                }
            } else if (i29 < i32 || i29 > i31) {
                iU = -1;
            } else {
                iU = w1Var.U(i29, i23);
            }
            i24 = iU;
            if (i24 == -1) {
                i13 = i29;
                i14 = I;
                i15 = i25;
                i16 = i23;
                i17 = i16;
                unsafe = unsafe2;
            } else {
                int[] iArr = w1Var.f4257a;
                int i34 = iArr[i24 + 1];
                int iX = X(i34);
                i13 = i29;
                int i35 = I;
                long j10 = i34 & 1048575;
                if (iX <= 17) {
                    int i36 = iArr[i24 + 2];
                    int i37 = 1 << (i36 >>> 20);
                    int i38 = i36 & 1048575;
                    if (i38 != i27) {
                        if (i27 != 1048575) {
                            unsafe2.putInt(obj2, i27, i25);
                        }
                        if (i38 != 1048575) {
                            i25 = unsafe2.getInt(obj2, i38);
                        }
                        i18 = i38;
                    } else {
                        i18 = i27;
                    }
                    int i39 = i25;
                    switch (iX) {
                        case 0:
                            i19 = i35;
                            if (i30 != 1) {
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                z2.r(obj2, j10, n2.h(i19, bArr2));
                                iG = i19 + 8;
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 1:
                            i19 = i35;
                            if (i30 != 5) {
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                z2.s(obj2, j10, n2.n(i19, bArr2));
                                iG = i19 + 4;
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 2:
                        case 3:
                            i19 = i35;
                            if (i30 != 0) {
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iL = n2.L(bArr2, i19, eVar2);
                                unsafe2.putLong(obj, j10, eVar2.f3531b);
                                i25 = i39 | i37;
                                i27 = i18;
                                iG = iL;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 4:
                        case 11:
                            i19 = i35;
                            if (i30 != 0) {
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iG = n2.J(bArr2, i19, eVar2);
                                unsafe2.putInt(obj2, j10, eVar2.f3530a);
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 5:
                        case Code.UNAVAILABLE /* 14 */:
                            i20 = i35;
                            if (i30 != 1) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                i19 = i20;
                                unsafe2.putLong(obj, j10, n2.l(i20, bArr2));
                                iG = i19 + 8;
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 6:
                        case 13:
                            i20 = i35;
                            if (i30 != 5) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                unsafe2.putInt(obj2, j10, n2.j(i20, bArr2));
                                iG = i20 + 4;
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 7:
                            i20 = i35;
                            if (i30 != 0) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iG = n2.L(bArr2, i20, eVar2);
                                z2.n(obj2, j10, eVar2.f3531b != 0);
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 8:
                            i20 = i35;
                            if (i30 != 2) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iG = (536870912 & i34) == 0 ? n2.C(bArr2, i20, eVar2) : n2.F(bArr2, i20, eVar2);
                                unsafe2.putObject(obj2, j10, eVar2.f3532c);
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 9:
                            i20 = i35;
                            if (i30 != 2) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                Object objB = w1Var.B(i24, obj2);
                                iG = n2.Q(objB, w1Var.q(i24), bArr, i20, i11, eVar);
                                w1Var.V(i24, obj2, objB);
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 10:
                            i20 = i35;
                            if (i30 != 2) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iG = n2.f(bArr2, i20, eVar2);
                                unsafe2.putObject(obj2, j10, eVar2.f3532c);
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 12:
                            i20 = i35;
                            if (i30 != 0) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iG = n2.J(bArr2, i20, eVar2);
                                unsafe2.putInt(obj2, j10, eVar2.f3530a);
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 15:
                            i20 = i35;
                            if (i30 != 0) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iG = n2.J(bArr2, i20, eVar2);
                                unsafe2.putInt(obj2, j10, s.b(eVar2.f3530a));
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case Code.UNAUTHENTICATED /* 16 */:
                            if (i30 != 0) {
                                i19 = i35;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iL = n2.L(bArr2, i35, eVar2);
                                unsafe2.putLong(obj, j10, s.c(eVar2.f3531b));
                                i25 = i39 | i37;
                                i27 = i18;
                                iG = iL;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        default:
                            i19 = i35;
                            i15 = i39;
                            i27 = i18;
                            i16 = i24;
                            unsafe = unsafe2;
                            i14 = i19;
                            i17 = 0;
                            break;
                    }
                } else {
                    if (iX != 27) {
                        int i40 = i27;
                        int i41 = i25;
                        if (iX <= 49) {
                            i22 = i40;
                            i15 = i41;
                            i16 = i24;
                            i17 = 0;
                            unsafe = unsafe2;
                            iG = M(obj, bArr, i35, i11, i12, i30, i24, i34, iX, j10, eVar);
                            if (iG != i35) {
                                obj2 = obj;
                                bArr2 = bArr;
                                eVar2 = eVar;
                                i27 = i22;
                                i24 = i16;
                                i26 = i13;
                                i23 = i17;
                                i25 = i15;
                                unsafe2 = unsafe;
                                w1Var = this;
                            } else {
                                i14 = iG;
                                i27 = i22;
                            }
                        } else {
                            i22 = i40;
                            i15 = i41;
                            i21 = i35;
                            i16 = i24;
                            unsafe = unsafe2;
                            i17 = 0;
                            if (iX != 50) {
                                iG = J(obj, bArr, i21, i11, i12, i13, i30, i34, iX, j10, i16, eVar);
                                if (iG != i21) {
                                    obj2 = obj;
                                    bArr2 = bArr;
                                    eVar2 = eVar;
                                    i27 = i22;
                                    i24 = i16;
                                    i26 = i13;
                                    i23 = i17;
                                    i25 = i15;
                                    unsafe2 = unsafe;
                                    w1Var = this;
                                } else {
                                    i14 = iG;
                                    i27 = i22;
                                }
                            } else if (i30 == 2) {
                                iG = I(obj, bArr, i21, i11, i16, j10, eVar);
                                if (iG != i21) {
                                    obj2 = obj;
                                    bArr2 = bArr;
                                    eVar2 = eVar;
                                    i27 = i22;
                                    i24 = i16;
                                    i26 = i13;
                                    i23 = i17;
                                    i25 = i15;
                                    unsafe2 = unsafe;
                                    w1Var = this;
                                } else {
                                    i14 = iG;
                                    i27 = i22;
                                }
                            }
                        }
                    } else if (i30 == 2) {
                        d dVar = (d) ((x0) unsafe2.getObject(obj2, j10));
                        boolean zG = dVar.g();
                        d dVar2 = dVar;
                        if (!zG) {
                            int size = dVar.size();
                            x0 x0VarA = dVar.a(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(obj2, j10, x0VarA);
                            dVar2 = x0VarA;
                        }
                        iG = n2.q(w1Var.q(i24), i12, bArr, i35, i11, dVar2, eVar);
                        i25 = i25;
                        i27 = i27;
                        i26 = i13;
                        i23 = 0;
                    } else {
                        i15 = i25;
                        i21 = i35;
                        i16 = i24;
                        unsafe = unsafe2;
                        i22 = i27;
                        i17 = 0;
                    }
                    i27 = i22;
                    i14 = i21;
                }
            }
            iG = n2.G(i12, bArr, i14, i11, r(obj), eVar);
            w1Var = this;
            obj2 = obj;
            bArr2 = bArr;
            eVar2 = eVar;
            i24 = i16;
            i26 = i13;
            i23 = i17;
            i25 = i15;
            unsafe2 = unsafe;
        }
        int i42 = i25;
        int i43 = i27;
        Unsafe unsafe3 = unsafe2;
        if (i43 != 1048575) {
            unsafe3.putInt(obj, i43, i42);
        }
        if (iG != i11) {
            throw a1.g();
        }
    }

    public final int M(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        int iK;
        Unsafe unsafe = f4256p;
        d dVar = (d) ((x0) unsafe.getObject(obj, j11));
        boolean zG = dVar.g();
        d dVar2 = dVar;
        if (!zG) {
            int size = dVar.size();
            x0 x0VarA = dVar.a(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, x0VarA);
            dVar2 = x0VarA;
        }
        switch (i15) {
            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 35:
                if (i13 == 2) {
                    return n2.s(bArr, i10, dVar2, eVar);
                }
                return i13 == 1 ? n2.i(i12, bArr, i10, i11, dVar2, eVar) : i10;
            case 19:
            case 36:
                if (i13 == 2) {
                    return n2.v(bArr, i10, dVar2, eVar);
                }
                return i13 == 5 ? n2.o(i12, bArr, i10, i11, dVar2, eVar) : i10;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
            case 21:
            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
            case 38:
                if (i13 == 2) {
                    return n2.z(bArr, i10, dVar2, eVar);
                }
                return i13 == 0 ? n2.M(i12, bArr, i10, i11, dVar2, eVar) : i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return n2.y(bArr, i10, dVar2, eVar);
                }
                return i13 == 0 ? n2.K(i12, bArr, i10, i11, dVar2, eVar) : i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    return n2.u(bArr, i10, dVar2, eVar);
                }
                return i13 == 1 ? n2.m(i12, bArr, i10, i11, dVar2, eVar) : i10;
            case 24:
            case 31:
            case 41:
            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                if (i13 == 2) {
                    return n2.t(bArr, i10, dVar2, eVar);
                }
                return i13 == 5 ? n2.k(i12, bArr, i10, i11, dVar2, eVar) : i10;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
            case 42:
                if (i13 == 2) {
                    return n2.r(bArr, i10, dVar2, eVar);
                }
                return i13 == 0 ? n2.e(i12, bArr, i10, i11, dVar2, eVar) : i10;
            case 26:
                if (i13 == 2) {
                    return (j10 & 536870912) == 0 ? n2.D(i12, bArr, i10, i11, dVar2, eVar) : n2.E(i12, bArr, i10, i11, dVar2, eVar);
                }
                return i10;
            case 27:
                return i13 == 2 ? n2.q(q(i14), i12, bArr, i10, i11, dVar2, eVar) : i10;
            case 28:
                return i13 == 2 ? n2.g(i12, bArr, i10, i11, dVar2, eVar) : i10;
            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
            case 44:
                if (i13 == 2) {
                    iK = n2.y(bArr, i10, dVar2, eVar);
                } else {
                    if (i13 != 0) {
                        return i10;
                    }
                    iK = n2.K(i12, bArr, i10, i11, dVar2, eVar);
                }
                o(i14);
                Class cls = j2.f4153a;
                return iK;
            case 33:
            case 47:
                if (i13 == 2) {
                    return n2.w(bArr, i10, dVar2, eVar);
                }
                return i13 == 0 ? n2.A(i12, bArr, i10, i11, dVar2, eVar) : i10;
            case 34:
            case 48:
                if (i13 == 2) {
                    return n2.x(bArr, i10, dVar2, eVar);
                }
                return i13 == 0 ? n2.B(i12, bArr, i10, i11, dVar2, eVar) : i10;
            case 49:
                return i13 == 3 ? n2.p(q(i14), i12, bArr, i10, i11, dVar2, eVar) : i10;
            default:
                return i10;
        }
    }

    public final void N(Object obj, long j10, g2.m mVar, i2 i2Var, z zVar) throws z0 {
        int iA;
        List listC = this.f4268l.c(obj, j10);
        int i10 = mVar.f6578b;
        if ((i10 & 7) != 3) {
            throw a1.d();
        }
        do {
            Object objF = i2Var.f();
            mVar.g(objF, i2Var, zVar);
            i2Var.b(objF);
            listC.add(objF);
            if (((s) mVar.f6581e).e() || mVar.f6580d != 0) {
                return;
            } else {
                iA = ((s) mVar.f6581e).A();
            }
        } while (iA == i10);
        mVar.f6580d = iA;
    }

    public final void O(Object obj, int i10, g2.m mVar, i2 i2Var, z zVar) throws a1 {
        int iA;
        List listC = this.f4268l.c(obj, i10 & 1048575);
        int i11 = mVar.f6578b;
        if ((i11 & 7) != 2) {
            throw a1.d();
        }
        do {
            Object objF = i2Var.f();
            mVar.i(objF, i2Var, zVar);
            i2Var.b(objF);
            listC.add(objF);
            if (((s) mVar.f6581e).e() || mVar.f6580d != 0) {
                return;
            } else {
                iA = ((s) mVar.f6581e).A();
            }
        } while (iA == i11);
        mVar.f6580d = iA;
    }

    public final void P(Object obj, int i10, g2.m mVar) {
        if ((536870912 & i10) != 0) {
            z2.v(obj, i10 & 1048575, mVar.O());
        } else if (this.f4262f) {
            z2.v(obj, i10 & 1048575, mVar.M());
        } else {
            z2.v(obj, i10 & 1048575, mVar.m());
        }
    }

    public final void Q(Object obj, int i10, g2.m mVar) throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        boolean z10 = (536870912 & i10) != 0;
        h1 h1Var = this.f4268l;
        if (z10) {
            List listC = h1Var.c(obj, i10 & 1048575);
            switch (mVar.f6577a) {
                case 1:
                    mVar.N(listC, true);
                    break;
                default:
                    mVar.N(listC, true);
                    break;
            }
        }
        List listC2 = h1Var.c(obj, i10 & 1048575);
        switch (mVar.f6577a) {
            case 1:
                mVar.N(listC2, false);
                break;
            default:
                mVar.N(listC2, false);
                break;
        }
    }

    public final void S(int i10, Object obj) {
        int i11 = this.f4257a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        z2.t(j10, obj, (1 << (i11 >>> 20)) | z2.f4286c.i(obj, j10));
    }

    public final void T(Object obj, int i10, int i11) {
        z2.t(this.f4257a[i11 + 2] & 1048575, obj, i10);
    }

    public final int U(int i10, int i11) {
        int[] iArr = this.f4257a;
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

    public final void V(int i10, Object obj, Object obj2) {
        f4256p.putObject(obj, Y(i10) & 1048575, obj2);
        S(i10, obj);
    }

    public final void W(Object obj, int i10, int i11, Object obj2) {
        f4256p.putObject(obj, Y(i11) & 1048575, obj2);
        T(obj, i10, i11);
    }

    public final int Y(int i10) {
        return this.f4257a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Z(Object obj, w4 w4Var) throws com.google.crypto.tink.shaded.protobuf.q {
        int i10;
        boolean z10;
        int[] iArr = this.f4257a;
        int length = iArr.length;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iY = Y(i13);
            int i15 = iArr[i13];
            int iX = X(iY);
            Unsafe unsafe = f4256p;
            if (iX <= 17) {
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
            long j10 = iY & i11;
            switch (iX) {
                case 0:
                    if ((i14 & i18) != 0) {
                        w4Var.o(i15, z2.f4286c.g(obj, j10));
                    }
                    break;
                case 1:
                    if ((i14 & i18) != 0) {
                        w4Var.w(i15, z2.f4286c.h(obj, j10));
                    }
                    break;
                case 2:
                    if ((i14 & i18) != 0) {
                        w4Var.D(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    if ((i14 & i18) != 0) {
                        w4Var.U(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    if ((i14 & i18) != 0) {
                        w4Var.B(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    if ((i14 & i18) != 0) {
                        w4Var.u(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    if ((i14 & i18) != 0) {
                        w4Var.s(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    if ((i14 & i18) != 0) {
                        w4Var.j(i15, z2.f4286c.d(obj, j10));
                    }
                    break;
                case 8:
                    if ((i14 & i18) != 0) {
                        b0(i15, unsafe.getObject(obj, j10), w4Var);
                    }
                    break;
                case 9:
                    if ((i14 & i18) != 0) {
                        w4Var.H(i15, q(i13), unsafe.getObject(obj, j10));
                    }
                    break;
                case 10:
                    if ((i14 & i18) != 0) {
                        w4Var.m(i15, (n) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    if ((i14 & i18) != 0) {
                        w4Var.S(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    if ((i14 & i18) != 0) {
                        w4Var.q(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    if ((i14 & i18) != 0) {
                        w4Var.I(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    if ((i14 & i18) != 0) {
                        w4Var.K(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    if ((i14 & i18) != 0) {
                        w4Var.M(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    if ((i14 & i18) != 0) {
                        w4Var.O(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if ((i14 & i18) != 0) {
                        w4Var.z(i15, q(i13), unsafe.getObject(obj, j10));
                    }
                    break;
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    j2.F(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case 19:
                    j2.J(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                    j2.M(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case 21:
                    j2.U(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case 22:
                    j2.L(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case 23:
                    j2.I(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case 24:
                    j2.H(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                    j2.D(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case 26:
                    j2.S(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var);
                    break;
                case 27:
                    j2.N(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, q(i13));
                    break;
                case 28:
                    j2.E(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var);
                    break;
                case 29:
                    z10 = false;
                    j2.T(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                    z10 = false;
                    j2.G(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case 31:
                    z10 = false;
                    j2.O(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case 32:
                    z10 = false;
                    j2.P(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case 33:
                    z10 = false;
                    j2.Q(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case 34:
                    z10 = false;
                    j2.R(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, false);
                    break;
                case 35:
                    j2.F(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case 36:
                    j2.J(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    j2.M(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case 38:
                    j2.U(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case 39:
                    j2.L(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case 40:
                    j2.I(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case 41:
                    j2.H(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case 42:
                    j2.D(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case 43:
                    j2.T(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case 44:
                    j2.G(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    j2.O(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case 46:
                    j2.P(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case 47:
                    j2.Q(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case 48:
                    j2.R(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, true);
                    break;
                case 49:
                    j2.K(iArr[i13], (List) unsafe.getObject(obj, j10), w4Var, q(i13));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    a0(w4Var, i15, unsafe.getObject(obj, j10), i13);
                    break;
                case 51:
                    if (w(obj, i15, i13)) {
                        w4Var.o(i15, ((Double) z2.f4286c.k(obj, j10)).doubleValue());
                    }
                    break;
                case 52:
                    if (w(obj, i15, i13)) {
                        w4Var.w(i15, ((Float) z2.f4286c.k(obj, j10)).floatValue());
                    }
                    break;
                case 53:
                    if (w(obj, i15, i13)) {
                        w4Var.D(i15, H(obj, j10));
                    }
                    break;
                case 54:
                    if (w(obj, i15, i13)) {
                        w4Var.U(i15, H(obj, j10));
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (w(obj, i15, i13)) {
                        w4Var.B(i15, G(obj, j10));
                    }
                    break;
                case 56:
                    if (w(obj, i15, i13)) {
                        w4Var.u(i15, H(obj, j10));
                    }
                    break;
                case 57:
                    if (w(obj, i15, i13)) {
                        w4Var.s(i15, G(obj, j10));
                    }
                    break;
                case 58:
                    if (w(obj, i15, i13)) {
                        w4Var.j(i15, ((Boolean) z2.f4286c.k(obj, j10)).booleanValue());
                    }
                    break;
                case 59:
                    if (w(obj, i15, i13)) {
                        b0(i15, unsafe.getObject(obj, j10), w4Var);
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    if (w(obj, i15, i13)) {
                        w4Var.H(i15, q(i13), unsafe.getObject(obj, j10));
                    }
                    break;
                case 61:
                    if (w(obj, i15, i13)) {
                        w4Var.m(i15, (n) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (w(obj, i15, i13)) {
                        w4Var.S(i15, G(obj, j10));
                    }
                    break;
                case 63:
                    if (w(obj, i15, i13)) {
                        w4Var.q(i15, G(obj, j10));
                    }
                    break;
                case 64:
                    if (w(obj, i15, i13)) {
                        w4Var.I(i15, G(obj, j10));
                    }
                    break;
                case 65:
                    if (w(obj, i15, i13)) {
                        w4Var.K(i15, H(obj, j10));
                    }
                    break;
                case 66:
                    if (w(obj, i15, i13)) {
                        w4Var.M(i15, G(obj, j10));
                    }
                    break;
                case 67:
                    if (w(obj, i15, i13)) {
                        w4Var.O(i15, H(obj, j10));
                    }
                    break;
                case 68:
                    if (w(obj, i15, i13)) {
                        w4Var.z(i15, q(i13), unsafe.getObject(obj, j10));
                    }
                    break;
                default:
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        this.f4269m.getClass();
        ((l0) obj).unknownFields.g(w4Var);
    }

    @Override // com.google.protobuf.i2
    public final void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f4257a;
            if (i10 >= iArr.length) {
                j2.B(this.f4269m, obj, obj2);
                return;
            }
            int iY = Y(i10);
            long j10 = 1048575 & iY;
            int i11 = iArr[i10];
            switch (X(iY)) {
                case 0:
                    if (u(i10, obj2)) {
                        z2.r(obj, j10, z2.f4286c.g(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 1:
                    if (u(i10, obj2)) {
                        z2.s(obj, j10, z2.f4286c.h(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 2:
                    if (u(i10, obj2)) {
                        z2.u(obj, j10, z2.f4286c.j(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 3:
                    if (u(i10, obj2)) {
                        z2.u(obj, j10, z2.f4286c.j(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 4:
                    if (u(i10, obj2)) {
                        z2.t(j10, obj, z2.f4286c.i(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 5:
                    if (u(i10, obj2)) {
                        z2.u(obj, j10, z2.f4286c.j(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 6:
                    if (u(i10, obj2)) {
                        z2.t(j10, obj, z2.f4286c.i(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 7:
                    if (u(i10, obj2)) {
                        z2.n(obj, j10, z2.f4286c.d(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 8:
                    if (u(i10, obj2)) {
                        z2.v(obj, j10, z2.f4286c.k(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 9:
                    z(i10, obj, obj2);
                    break;
                case 10:
                    if (u(i10, obj2)) {
                        z2.v(obj, j10, z2.f4286c.k(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 11:
                    if (u(i10, obj2)) {
                        z2.t(j10, obj, z2.f4286c.i(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 12:
                    if (u(i10, obj2)) {
                        z2.t(j10, obj, z2.f4286c.i(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 13:
                    if (u(i10, obj2)) {
                        z2.t(j10, obj, z2.f4286c.i(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    if (u(i10, obj2)) {
                        z2.u(obj, j10, z2.f4286c.j(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case 15:
                    if (u(i10, obj2)) {
                        z2.t(j10, obj, z2.f4286c.i(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    if (u(i10, obj2)) {
                        z2.u(obj, j10, z2.f4286c.j(obj2, j10));
                        S(i10, obj);
                    }
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    z(i10, obj, obj2);
                    break;
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
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
                    this.f4268l.b(obj, j10, obj2);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    Class cls = j2.f4153a;
                    y2 y2Var = z2.f4286c;
                    Object objK = y2Var.k(obj, j10);
                    Object objK2 = y2Var.k(obj2, j10);
                    this.f4270n.getClass();
                    z2.v(obj, j10, o1.e(objK, objK2));
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
                    if (w(obj2, i11, i10)) {
                        z2.v(obj, j10, z2.f4286c.k(obj2, j10));
                        T(obj, i11, i10);
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    A(i10, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (w(obj2, i11, i10)) {
                        z2.v(obj, j10, z2.f4286c.k(obj2, j10));
                        T(obj, i11, i10);
                    }
                    break;
                case 68:
                    A(i10, obj, obj2);
                    break;
            }
            i10 += 3;
        }
    }

    public final void a0(w4 w4Var, int i10, Object obj, int i11) {
        if (obj != null) {
            Object objP = p(i11);
            this.f4270n.getClass();
            i3.a0 a0Var = ((m1) objP).f4178a;
            ((v) w4Var.f10455b).getClass();
            for (Map.Entry entry : ((n1) obj).entrySet()) {
                ((v) w4Var.f10455b).G0(i10, 2);
                ((v) w4Var.f10455b).I0(m1.a(a0Var, entry.getKey(), entry.getValue()));
                v vVar = (v) w4Var.f10455b;
                Object key = entry.getKey();
                Object value = entry.getValue();
                c0.f(vVar, (h3) a0Var.f7941a, 1, key);
                c0.f(vVar, (h3) a0Var.f7943c, 2, value);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[SYNTHETIC] */
    @Override // com.google.protobuf.i2
    public final void b(Object obj) {
        if (v(obj)) {
            if (obj instanceof l0) {
                l0 l0Var = (l0) obj;
                l0Var.clearMemoizedSerializedSize();
                l0Var.clearMemoizedHashCode();
                l0Var.markImmutable();
            }
            int[] iArr = this.f4257a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iY = Y(i10);
                long j10 = 1048575 & iY;
                int iX = X(iY);
                Unsafe unsafe = f4256p;
                if (iX != 9) {
                    if (iX != 60 && iX != 68) {
                        switch (iX) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (u(i10, obj)) {
                                    q(i10).b(unsafe.getObject(obj, j10));
                                }
                                break;
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
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
                                this.f4268l.a(obj, j10);
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    this.f4270n.getClass();
                                    o1.g(object);
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (w(obj, iArr[i10], i10)) {
                        q(i10).b(unsafe.getObject(obj, j10));
                    }
                } else if (u(i10, obj)) {
                    q(i10).b(unsafe.getObject(obj, j10));
                }
            }
            this.f4269m.getClass();
            t2.b(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7 A[LOOP:2: B:59:0x00e6->B:64:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x011a A[SYNTHETIC] */
    @Override // com.google.protobuf.i2
    public final boolean c(Object obj) {
        List list;
        i2 i2VarQ;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f4265i; i13++) {
            int i14 = this.f4264h[i13];
            int[] iArr = this.f4257a;
            int i15 = iArr[i14];
            int iY = Y(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = f4256p.getInt(obj, i17);
                }
                i11 = i17;
            }
            if ((268435456 & iY) != 0) {
                if (i11 == 1048575) {
                    if (!u(i14, obj)) {
                        return false;
                    }
                } else if ((i12 & i18) == 0) {
                    return false;
                }
            }
            int iX = X(iY);
            if (iX == 9 || iX == 17) {
                if (i11 == 1048575) {
                    if (u(i14, obj)) {
                        if (!q(i14).c(z2.f4286c.k(obj, iY & 1048575))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                } else if ((i18 & i12) != 0) {
                    if (!q(i14).c(z2.f4286c.k(obj, iY & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iX == 27) {
                list = (List) z2.f4286c.k(obj, iY & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    i2VarQ = q(i14);
                    for (i10 = 0; i10 < list.size(); i10++) {
                        if (!i2VarQ.c(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (iX == 60 || iX == 68) {
                if (w(obj, i15, i14)) {
                    if (!q(i14).c(z2.f4286c.k(obj, iY & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iX == 49) {
                list = (List) z2.f4286c.k(obj, iY & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    i2VarQ = q(i14);
                    while (i10 < list.size()) {
                        if (!i2VarQ.c(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (iX != 50) {
                continue;
            } else {
                Object objK = z2.f4286c.k(obj, iY & 1048575);
                this.f4270n.getClass();
                n1 n1Var = (n1) objK;
                if (!n1Var.isEmpty() && ((h3) ((m1) p(i14)).f4178a.f7943c).f4132a == i3.MESSAGE) {
                    i2 i2VarA = null;
                    for (Object obj2 : n1Var.values()) {
                        if (i2VarA == null) {
                            i2VarA = d2.f4094c.a(obj2.getClass());
                        }
                        if (!i2VarA.c(obj2)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // com.google.protobuf.i2
    public final boolean d(Object obj, Object obj2) {
        boolean zC;
        int[] iArr = this.f4257a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iY = Y(i10);
            long j10 = iY & 1048575;
            switch (X(iY)) {
                case 0:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var = z2.f4286c;
                        if (Double.doubleToLongBits(y2Var.g(obj, j10)) == Double.doubleToLongBits(y2Var.g(obj2, j10))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 1:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var2 = z2.f4286c;
                        if (Float.floatToIntBits(y2Var2.h(obj, j10)) == Float.floatToIntBits(y2Var2.h(obj2, j10))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 2:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var3 = z2.f4286c;
                        if (y2Var3.j(obj, j10) == y2Var3.j(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 3:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var4 = z2.f4286c;
                        if (y2Var4.j(obj, j10) == y2Var4.j(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 4:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var5 = z2.f4286c;
                        if (y2Var5.i(obj, j10) == y2Var5.i(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 5:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var6 = z2.f4286c;
                        if (y2Var6.j(obj, j10) == y2Var6.j(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 6:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var7 = z2.f4286c;
                        if (y2Var7.i(obj, j10) == y2Var7.i(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 7:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var8 = z2.f4286c;
                        if (y2Var8.d(obj, j10) == y2Var8.d(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 8:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var9 = z2.f4286c;
                        if (j2.C(y2Var9.k(obj, j10), y2Var9.k(obj2, j10))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 9:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var10 = z2.f4286c;
                        if (j2.C(y2Var10.k(obj, j10), y2Var10.k(obj2, j10))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 10:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var11 = z2.f4286c;
                        if (j2.C(y2Var11.k(obj, j10), y2Var11.k(obj2, j10))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 11:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var12 = z2.f4286c;
                        if (y2Var12.i(obj, j10) == y2Var12.i(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 12:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var13 = z2.f4286c;
                        if (y2Var13.i(obj, j10) == y2Var13.i(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 13:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var14 = z2.f4286c;
                        if (y2Var14.i(obj, j10) == y2Var14.i(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case Code.UNAVAILABLE /* 14 */:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var15 = z2.f4286c;
                        if (y2Var15.j(obj, j10) == y2Var15.j(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 15:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var16 = z2.f4286c;
                        if (y2Var16.i(obj, j10) == y2Var16.i(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case Code.UNAUTHENTICATED /* 16 */:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var17 = z2.f4286c;
                        if (y2Var17.j(obj, j10) == y2Var17.j(obj2, j10)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (k(i10, obj, obj2)) {
                        y2 y2Var18 = z2.f4286c;
                        if (j2.C(y2Var18.k(obj, j10), y2Var18.k(obj2, j10))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
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
                    y2 y2Var19 = z2.f4286c;
                    zC = j2.C(y2Var19.k(obj, j10), y2Var19.k(obj2, j10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    y2 y2Var20 = z2.f4286c;
                    zC = j2.C(y2Var20.k(obj, j10), y2Var20.k(obj2, j10));
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
                    y2 y2Var21 = z2.f4286c;
                    if (y2Var21.i(obj, j11) != y2Var21.i(obj2, j11) || !j2.C(y2Var21.k(obj, j10), y2Var21.k(obj2, j10))) {
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
        this.f4269m.getClass();
        return ((l0) obj).unknownFields.equals(((l0) obj2).unknownFields);
    }

    @Override // com.google.protobuf.i2
    public final int e(Object obj) {
        return this.f4263g ? t(obj) : s(obj);
    }

    @Override // com.google.protobuf.i2
    public final Object f() {
        this.f4267k.getClass();
        return ((l0) this.f4261e).newMutableInstance();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.i2
    public final int g(Object obj) {
        int i10;
        int iA;
        int i11;
        int[] iArr = this.f4257a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iY = Y(i13);
            int i14 = iArr[i13];
            long j10 = 1048575 & iY;
            int i15 = 1237;
            int iHashCode = 37;
            switch (X(iY)) {
                case 0:
                    i10 = i12 * 53;
                    iA = y0.a(Double.doubleToLongBits(z2.f4286c.g(obj, j10)));
                    i12 = iA + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iA = Float.floatToIntBits(z2.f4286c.h(obj, j10));
                    i12 = iA + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iA = y0.a(z2.f4286c.j(obj, j10));
                    i12 = iA + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iA = y0.a(z2.f4286c.j(obj, j10));
                    i12 = iA + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iA = z2.f4286c.i(obj, j10);
                    i12 = iA + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iA = y0.a(z2.f4286c.j(obj, j10));
                    i12 = iA + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iA = z2.f4286c.i(obj, j10);
                    i12 = iA + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zD = z2.f4286c.d(obj, j10);
                    Charset charset = y0.f4276a;
                    if (zD) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iA = ((String) z2.f4286c.k(obj, j10)).hashCode();
                    i12 = iA + i10;
                    break;
                case 9:
                    Object objK = z2.f4286c.k(obj, j10);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iA = z2.f4286c.k(obj, j10).hashCode();
                    i12 = iA + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iA = z2.f4286c.i(obj, j10);
                    i12 = iA + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iA = z2.f4286c.i(obj, j10);
                    i12 = iA + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iA = z2.f4286c.i(obj, j10);
                    i12 = iA + i10;
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    i10 = i12 * 53;
                    iA = y0.a(z2.f4286c.j(obj, j10));
                    i12 = iA + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iA = z2.f4286c.i(obj, j10);
                    i12 = iA + i10;
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    i10 = i12 * 53;
                    iA = y0.a(z2.f4286c.j(obj, j10));
                    i12 = iA + i10;
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    Object objK2 = z2.f4286c.k(obj, j10);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
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
                    iA = z2.f4286c.k(obj, j10).hashCode();
                    i12 = iA + i10;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    i10 = i12 * 53;
                    iA = z2.f4286c.k(obj, j10).hashCode();
                    i12 = iA + i10;
                    break;
                case 51:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = y0.a(Double.doubleToLongBits(((Double) z2.f4286c.k(obj, j10)).doubleValue()));
                        i12 = iA + i10;
                    }
                    break;
                case 52:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = Float.floatToIntBits(((Float) z2.f4286c.k(obj, j10)).floatValue());
                        i12 = iA + i10;
                    }
                    break;
                case 53:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = y0.a(H(obj, j10));
                        i12 = iA + i10;
                    }
                    break;
                case 54:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = y0.a(H(obj, j10));
                        i12 = iA + i10;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = G(obj, j10);
                        i12 = iA + i10;
                    }
                    break;
                case 56:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = y0.a(H(obj, j10));
                        i12 = iA + i10;
                    }
                    break;
                case 57:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = G(obj, j10);
                        i12 = iA + i10;
                    }
                    break;
                case 58:
                    if (w(obj, i14, i13)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) z2.f4286c.k(obj, j10)).booleanValue();
                        Charset charset2 = y0.f4276a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case 59:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = ((String) z2.f4286c.k(obj, j10)).hashCode();
                        i12 = iA + i10;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = z2.f4286c.k(obj, j10).hashCode();
                        i12 = iA + i10;
                    }
                    break;
                case 61:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = z2.f4286c.k(obj, j10).hashCode();
                        i12 = iA + i10;
                    }
                    break;
                case 62:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = G(obj, j10);
                        i12 = iA + i10;
                    }
                    break;
                case 63:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = G(obj, j10);
                        i12 = iA + i10;
                    }
                    break;
                case 64:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = G(obj, j10);
                        i12 = iA + i10;
                    }
                    break;
                case 65:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = y0.a(H(obj, j10));
                        i12 = iA + i10;
                    }
                    break;
                case 66:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = G(obj, j10);
                        i12 = iA + i10;
                    }
                    break;
                case 67:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = y0.a(H(obj, j10));
                        i12 = iA + i10;
                    }
                    break;
                case 68:
                    if (w(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iA = z2.f4286c.k(obj, j10).hashCode();
                        i12 = iA + i10;
                    }
                    break;
            }
        }
        this.f4269m.getClass();
        return ((l0) obj).unknownFields.hashCode() + (i12 * 53);
    }

    @Override // com.google.protobuf.i2
    public final void h(Object obj, g2.m mVar, z zVar) {
        zVar.getClass();
        l(obj);
        t2 t2Var = this.f4269m;
        int[] iArr = this.f4264h;
        int i10 = this.f4266j;
        int i11 = this.f4265i;
        s2 s2VarA = null;
        while (true) {
            try {
                int iB = mVar.b();
                int iU = (iB < this.f4259c || iB > this.f4260d) ? -1 : U(iB, 0);
                if (iU >= 0) {
                    int iY = Y(iU);
                    try {
                        int iX = X(iY);
                        h1 h1Var = this.f4268l;
                        switch (iX) {
                            case 0:
                                z2.r(obj, F(iY), mVar.o());
                                S(iU, obj);
                                continue;
                            case 1:
                                z2.s(obj, F(iY), mVar.x());
                                S(iU, obj);
                                continue;
                            case 2:
                                z2.u(obj, F(iY), mVar.B());
                                S(iU, obj);
                                continue;
                            case 3:
                                z2.u(obj, F(iY), mVar.R());
                                S(iU, obj);
                                continue;
                            case 4:
                                z2.t(F(iY), obj, mVar.z());
                                S(iU, obj);
                                continue;
                            case 5:
                                z2.u(obj, F(iY), mVar.v());
                                S(iU, obj);
                                continue;
                            case 6:
                                z2.t(F(iY), obj, mVar.t());
                                S(iU, obj);
                                continue;
                            case 7:
                                z2.n(obj, F(iY), mVar.j());
                                S(iU, obj);
                                continue;
                            case 8:
                                P(obj, iY, mVar);
                                S(iU, obj);
                                continue;
                            case 9:
                                Object obj2 = (t1) B(iU, obj);
                                i2 i2VarQ = q(iU);
                                mVar.U(2);
                                mVar.i(obj2, i2VarQ, zVar);
                                V(iU, obj, obj2);
                                continue;
                            case 10:
                                z2.v(obj, F(iY), mVar.m());
                                S(iU, obj);
                                continue;
                            case 11:
                                z2.t(F(iY), obj, mVar.P());
                                S(iU, obj);
                                continue;
                            case 12:
                                int iQ = mVar.q();
                                o(iU);
                                z2.t(F(iY), obj, iQ);
                                S(iU, obj);
                                continue;
                            case 13:
                                z2.t(F(iY), obj, mVar.E());
                                S(iU, obj);
                                continue;
                            case Code.UNAVAILABLE /* 14 */:
                                z2.u(obj, F(iY), mVar.G());
                                S(iU, obj);
                                continue;
                            case 15:
                                z2.t(F(iY), obj, mVar.I());
                                S(iU, obj);
                                continue;
                            case Code.UNAUTHENTICATED /* 16 */:
                                z2.u(obj, F(iY), mVar.K());
                                S(iU, obj);
                                continue;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                Object obj3 = (t1) B(iU, obj);
                                mVar.e(obj3, q(iU), zVar);
                                V(iU, obj, obj3);
                                continue;
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                mVar.p(h1Var.c(obj, F(iY)));
                                continue;
                            case 19:
                                mVar.y(h1Var.c(obj, F(iY)));
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                                mVar.C(h1Var.c(obj, F(iY)));
                                continue;
                            case 21:
                                mVar.S(h1Var.c(obj, F(iY)));
                                continue;
                            case 22:
                                mVar.A(h1Var.c(obj, F(iY)));
                                continue;
                            case 23:
                                mVar.w(h1Var.c(obj, F(iY)));
                                continue;
                            case 24:
                                mVar.u(h1Var.c(obj, F(iY)));
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                                mVar.k(h1Var.c(obj, F(iY)));
                                continue;
                            case 26:
                                Q(obj, iY, mVar);
                                continue;
                            case 27:
                                O(obj, iY, mVar, q(iU), zVar);
                                continue;
                            case 28:
                                mVar.n(h1Var.c(obj, F(iY)));
                                continue;
                            case 29:
                                mVar.Q(h1Var.c(obj, F(iY)));
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                List listC = h1Var.c(obj, F(iY));
                                mVar.r(listC);
                                o(iU);
                                j2.z(obj, iB, listC, s2VarA, t2Var);
                                continue;
                            case 31:
                                mVar.F(h1Var.c(obj, F(iY)));
                                continue;
                            case 32:
                                mVar.H(h1Var.c(obj, F(iY)));
                                continue;
                            case 33:
                                mVar.J(h1Var.c(obj, F(iY)));
                                continue;
                            case 34:
                                mVar.L(h1Var.c(obj, F(iY)));
                                continue;
                            case 35:
                                mVar.p(h1Var.c(obj, F(iY)));
                                continue;
                            case 36:
                                mVar.y(h1Var.c(obj, F(iY)));
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                mVar.C(h1Var.c(obj, F(iY)));
                                continue;
                            case 38:
                                mVar.S(h1Var.c(obj, F(iY)));
                                continue;
                            case 39:
                                mVar.A(h1Var.c(obj, F(iY)));
                                continue;
                            case 40:
                                mVar.w(h1Var.c(obj, F(iY)));
                                continue;
                            case 41:
                                mVar.u(h1Var.c(obj, F(iY)));
                                continue;
                            case 42:
                                mVar.k(h1Var.c(obj, F(iY)));
                                continue;
                            case 43:
                                mVar.Q(h1Var.c(obj, F(iY)));
                                continue;
                            case 44:
                                List listC2 = h1Var.c(obj, F(iY));
                                mVar.r(listC2);
                                o(iU);
                                j2.z(obj, iB, listC2, s2VarA, t2Var);
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                mVar.F(h1Var.c(obj, F(iY)));
                                continue;
                            case 46:
                                mVar.H(h1Var.c(obj, F(iY)));
                                continue;
                            case 47:
                                mVar.J(h1Var.c(obj, F(iY)));
                                continue;
                            case 48:
                                mVar.L(h1Var.c(obj, F(iY)));
                                continue;
                            case 49:
                                N(obj, F(iY), mVar, q(iU), zVar);
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                y(obj, iU, p(iU), zVar, mVar);
                                continue;
                            case 51:
                                z2.v(obj, F(iY), Double.valueOf(mVar.o()));
                                T(obj, iB, iU);
                                continue;
                            case 52:
                                z2.v(obj, F(iY), Float.valueOf(mVar.x()));
                                T(obj, iB, iU);
                                continue;
                            case 53:
                                z2.v(obj, F(iY), Long.valueOf(mVar.B()));
                                T(obj, iB, iU);
                                continue;
                            case 54:
                                z2.v(obj, F(iY), Long.valueOf(mVar.R()));
                                T(obj, iB, iU);
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                z2.v(obj, F(iY), Integer.valueOf(mVar.z()));
                                T(obj, iB, iU);
                                continue;
                            case 56:
                                z2.v(obj, F(iY), Long.valueOf(mVar.v()));
                                T(obj, iB, iU);
                                continue;
                            case 57:
                                z2.v(obj, F(iY), Integer.valueOf(mVar.t()));
                                T(obj, iB, iU);
                                continue;
                            case 58:
                                z2.v(obj, F(iY), Boolean.valueOf(mVar.j()));
                                T(obj, iB, iU);
                                continue;
                            case 59:
                                P(obj, iY, mVar);
                                T(obj, iB, iU);
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                                Object obj4 = (t1) C(obj, iB, iU);
                                i2 i2VarQ2 = q(iU);
                                mVar.U(2);
                                mVar.i(obj4, i2VarQ2, zVar);
                                W(obj, iB, iU, obj4);
                                continue;
                            case 61:
                                z2.v(obj, F(iY), mVar.m());
                                T(obj, iB, iU);
                                continue;
                            case 62:
                                z2.v(obj, F(iY), Integer.valueOf(mVar.P()));
                                T(obj, iB, iU);
                                continue;
                            case 63:
                                int iQ2 = mVar.q();
                                o(iU);
                                z2.v(obj, F(iY), Integer.valueOf(iQ2));
                                T(obj, iB, iU);
                                continue;
                            case 64:
                                z2.v(obj, F(iY), Integer.valueOf(mVar.E()));
                                T(obj, iB, iU);
                                continue;
                            case 65:
                                z2.v(obj, F(iY), Long.valueOf(mVar.G()));
                                T(obj, iB, iU);
                                continue;
                            case 66:
                                z2.v(obj, F(iY), Integer.valueOf(mVar.I()));
                                T(obj, iB, iU);
                                continue;
                            case 67:
                                z2.v(obj, F(iY), Long.valueOf(mVar.K()));
                                T(obj, iB, iU);
                                continue;
                            case 68:
                                Object obj5 = (t1) C(obj, iB, iU);
                                mVar.e(obj5, q(iU), zVar);
                                W(obj, iB, iU, obj5);
                                continue;
                            default:
                                if (s2VarA == null) {
                                    t2Var.getClass();
                                    s2VarA = t2.a(obj);
                                }
                                t2Var.getClass();
                                if (!t2.c(s2VarA, mVar)) {
                                    while (i11 < i10) {
                                        n(obj, iArr[i11], s2VarA);
                                        i11++;
                                    }
                                    if (s2VarA == null) {
                                        return;
                                    }
                                }
                                break;
                        }
                    } catch (z0 unused) {
                        t2Var.getClass();
                        if (s2VarA == null) {
                            s2VarA = t2.a(obj);
                        }
                        if (!t2.c(s2VarA, mVar)) {
                            while (i11 < i10) {
                                n(obj, iArr[i11], s2VarA);
                                i11++;
                            }
                            if (s2VarA == null) {
                                return;
                            }
                            ((l0) obj).unknownFields = s2VarA;
                        }
                    }
                } else if (iB == Integer.MAX_VALUE) {
                    while (i11 < i10) {
                        n(obj, iArr[i11], s2VarA);
                        i11++;
                    }
                    if (s2VarA == null) {
                        return;
                    } else {
                        t2Var.getClass();
                    }
                } else {
                    t2Var.getClass();
                    if (s2VarA == null) {
                        s2VarA = t2.a(obj);
                    }
                    if (!t2.c(s2VarA, mVar)) {
                        while (i11 < i10) {
                            n(obj, iArr[i11], s2VarA);
                            i11++;
                        }
                        if (s2VarA == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                while (i11 < i10) {
                    n(obj, iArr[i11], s2VarA);
                    i11++;
                }
                if (s2VarA != null) {
                    t2Var.getClass();
                    ((l0) obj).unknownFields = s2VarA;
                }
                throw th;
            }
        }
        ((l0) obj).unknownFields = s2VarA;
    }

    @Override // com.google.protobuf.i2
    public final void i(Object obj, byte[] bArr, int i10, int i11, com.google.crypto.tink.shaded.protobuf.e eVar) throws a1 {
        if (this.f4263g) {
            L(obj, bArr, i10, i11, eVar);
        } else {
            K(obj, bArr, i10, i11, 0, eVar);
        }
    }

    @Override // com.google.protobuf.i2
    public final void j(Object obj, w4 w4Var) throws com.google.crypto.tink.shaded.protobuf.q {
        w4Var.getClass();
        if (!this.f4263g) {
            Z(obj, w4Var);
            return;
        }
        int[] iArr = this.f4257a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iY = Y(i10);
            int i11 = iArr[i10];
            switch (X(iY)) {
                case 0:
                    if (u(i10, obj)) {
                        w4Var.o(i11, z2.f4286c.g(obj, iY & 1048575));
                    }
                    break;
                case 1:
                    if (u(i10, obj)) {
                        w4Var.w(i11, z2.f4286c.h(obj, iY & 1048575));
                    }
                    break;
                case 2:
                    if (u(i10, obj)) {
                        w4Var.D(i11, z2.f4286c.j(obj, iY & 1048575));
                    }
                    break;
                case 3:
                    if (u(i10, obj)) {
                        w4Var.U(i11, z2.f4286c.j(obj, iY & 1048575));
                    }
                    break;
                case 4:
                    if (u(i10, obj)) {
                        w4Var.B(i11, z2.f4286c.i(obj, iY & 1048575));
                    }
                    break;
                case 5:
                    if (u(i10, obj)) {
                        w4Var.u(i11, z2.f4286c.j(obj, iY & 1048575));
                    }
                    break;
                case 6:
                    if (u(i10, obj)) {
                        w4Var.s(i11, z2.f4286c.i(obj, iY & 1048575));
                    }
                    break;
                case 7:
                    if (u(i10, obj)) {
                        w4Var.j(i11, z2.f4286c.d(obj, iY & 1048575));
                    }
                    break;
                case 8:
                    if (u(i10, obj)) {
                        b0(i11, z2.f4286c.k(obj, iY & 1048575), w4Var);
                    }
                    break;
                case 9:
                    if (u(i10, obj)) {
                        w4Var.H(i11, q(i10), z2.f4286c.k(obj, iY & 1048575));
                    }
                    break;
                case 10:
                    if (u(i10, obj)) {
                        w4Var.m(i11, (n) z2.f4286c.k(obj, iY & 1048575));
                    }
                    break;
                case 11:
                    if (u(i10, obj)) {
                        w4Var.S(i11, z2.f4286c.i(obj, iY & 1048575));
                    }
                    break;
                case 12:
                    if (u(i10, obj)) {
                        w4Var.q(i11, z2.f4286c.i(obj, iY & 1048575));
                    }
                    break;
                case 13:
                    if (u(i10, obj)) {
                        w4Var.I(i11, z2.f4286c.i(obj, iY & 1048575));
                    }
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    if (u(i10, obj)) {
                        w4Var.K(i11, z2.f4286c.j(obj, iY & 1048575));
                    }
                    break;
                case 15:
                    if (u(i10, obj)) {
                        w4Var.M(i11, z2.f4286c.i(obj, iY & 1048575));
                    }
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    if (u(i10, obj)) {
                        w4Var.O(i11, z2.f4286c.j(obj, iY & 1048575));
                    }
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (u(i10, obj)) {
                        w4Var.z(i11, q(i10), z2.f4286c.k(obj, iY & 1048575));
                    }
                    break;
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    j2.F(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case 19:
                    j2.J(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                    j2.M(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case 21:
                    j2.U(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case 22:
                    j2.L(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case 23:
                    j2.I(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case 24:
                    j2.H(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                    j2.D(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case 26:
                    j2.S(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var);
                    break;
                case 27:
                    j2.N(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, q(i10));
                    break;
                case 28:
                    j2.E(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var);
                    break;
                case 29:
                    j2.T(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                    j2.G(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case 31:
                    j2.O(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case 32:
                    j2.P(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case 33:
                    j2.Q(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case 34:
                    j2.R(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, false);
                    break;
                case 35:
                    j2.F(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case 36:
                    j2.J(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    j2.M(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case 38:
                    j2.U(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case 39:
                    j2.L(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case 40:
                    j2.I(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case 41:
                    j2.H(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case 42:
                    j2.D(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case 43:
                    j2.T(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case 44:
                    j2.G(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    j2.O(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case 46:
                    j2.P(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case 47:
                    j2.Q(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case 48:
                    j2.R(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, true);
                    break;
                case 49:
                    j2.K(iArr[i10], (List) z2.f4286c.k(obj, iY & 1048575), w4Var, q(i10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    a0(w4Var, i11, z2.f4286c.k(obj, iY & 1048575), i10);
                    break;
                case 51:
                    if (w(obj, i11, i10)) {
                        w4Var.o(i11, ((Double) z2.f4286c.k(obj, iY & 1048575)).doubleValue());
                    }
                    break;
                case 52:
                    if (w(obj, i11, i10)) {
                        w4Var.w(i11, ((Float) z2.f4286c.k(obj, iY & 1048575)).floatValue());
                    }
                    break;
                case 53:
                    if (w(obj, i11, i10)) {
                        w4Var.D(i11, H(obj, iY & 1048575));
                    }
                    break;
                case 54:
                    if (w(obj, i11, i10)) {
                        w4Var.U(i11, H(obj, iY & 1048575));
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (w(obj, i11, i10)) {
                        w4Var.B(i11, G(obj, iY & 1048575));
                    }
                    break;
                case 56:
                    if (w(obj, i11, i10)) {
                        w4Var.u(i11, H(obj, iY & 1048575));
                    }
                    break;
                case 57:
                    if (w(obj, i11, i10)) {
                        w4Var.s(i11, G(obj, iY & 1048575));
                    }
                    break;
                case 58:
                    if (w(obj, i11, i10)) {
                        w4Var.j(i11, ((Boolean) z2.f4286c.k(obj, iY & 1048575)).booleanValue());
                    }
                    break;
                case 59:
                    if (w(obj, i11, i10)) {
                        b0(i11, z2.f4286c.k(obj, iY & 1048575), w4Var);
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    if (w(obj, i11, i10)) {
                        w4Var.H(i11, q(i10), z2.f4286c.k(obj, iY & 1048575));
                    }
                    break;
                case 61:
                    if (w(obj, i11, i10)) {
                        w4Var.m(i11, (n) z2.f4286c.k(obj, iY & 1048575));
                    }
                    break;
                case 62:
                    if (w(obj, i11, i10)) {
                        w4Var.S(i11, G(obj, iY & 1048575));
                    }
                    break;
                case 63:
                    if (w(obj, i11, i10)) {
                        w4Var.q(i11, G(obj, iY & 1048575));
                    }
                    break;
                case 64:
                    if (w(obj, i11, i10)) {
                        w4Var.I(i11, G(obj, iY & 1048575));
                    }
                    break;
                case 65:
                    if (w(obj, i11, i10)) {
                        w4Var.K(i11, H(obj, iY & 1048575));
                    }
                    break;
                case 66:
                    if (w(obj, i11, i10)) {
                        w4Var.M(i11, G(obj, iY & 1048575));
                    }
                    break;
                case 67:
                    if (w(obj, i11, i10)) {
                        w4Var.O(i11, H(obj, iY & 1048575));
                    }
                    break;
                case 68:
                    if (w(obj, i11, i10)) {
                        w4Var.z(i11, q(i10), z2.f4286c.k(obj, iY & 1048575));
                    }
                    break;
            }
        }
        this.f4269m.getClass();
        ((l0) obj).unknownFields.g(w4Var);
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        return u(i10, obj) == u(i10, obj2);
    }

    public final void n(Object obj, int i10, Object obj2) {
        int i11 = this.f4257a[i10];
        if (z2.f4286c.k(obj, Y(i10) & 1048575) == null) {
            return;
        }
        o(i10);
    }

    public final void o(int i10) {
        a7.a.w(this.f4258b[((i10 / 3) * 2) + 1]);
    }

    public final Object p(int i10) {
        return this.f4258b[(i10 / 3) * 2];
    }

    public final i2 q(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f4258b;
        i2 i2Var = (i2) objArr[i11];
        if (i2Var != null) {
            return i2Var;
        }
        i2 i2VarA = d2.f4094c.a((Class) objArr[i11 + 1]);
        objArr[i11] = i2VarA;
        return i2VarA;
    }

    public final int s(Object obj) {
        int i10;
        int iV;
        int iU;
        int i11 = 0;
        int iX = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = this.f4257a;
            if (i11 >= iArr.length) {
                this.f4269m.getClass();
                return ((l0) obj).unknownFields.c() + iX;
            }
            int iY = Y(i11);
            int i14 = iArr[i11];
            int iX2 = X(iY);
            Unsafe unsafe = f4256p;
            if (iX2 <= 17) {
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
            long j10 = iY & 1048575;
            switch (iX2) {
                case 0:
                    if ((i10 & i12) != 0) {
                        iV = v.V(i14);
                        iX += iV;
                    }
                    break;
                case 1:
                    if ((i10 & i12) != 0) {
                        iV = v.Z(i14);
                        iX += iV;
                    }
                    break;
                case 2:
                    if ((i10 & i12) != 0) {
                        iV = v.d0(i14, unsafe.getLong(obj, j10));
                        iX += iV;
                    }
                    break;
                case 3:
                    if ((i10 & i12) != 0) {
                        iV = v.n0(i14, unsafe.getLong(obj, j10));
                        iX += iV;
                    }
                    break;
                case 4:
                    if ((i10 & i12) != 0) {
                        iV = v.b0(i14, unsafe.getInt(obj, j10));
                        iX += iV;
                    }
                    break;
                case 5:
                    if ((i10 & i12) != 0) {
                        iV = v.Y(i14);
                        iX += iV;
                    }
                    break;
                case 6:
                    if ((i10 & i12) != 0) {
                        iV = v.X(i14);
                        iX += iV;
                    }
                    break;
                case 7:
                    if ((i10 & i12) != 0) {
                        iV = v.T(i14);
                        iX += iV;
                    }
                    break;
                case 8:
                    if ((i10 & i12) != 0) {
                        Object object = unsafe.getObject(obj, j10);
                        iU = object instanceof n ? v.U(i14, (n) object) : v.i0(i14, (String) object);
                        iX = iU + iX;
                    }
                    break;
                case 9:
                    if ((i10 & i12) != 0) {
                        iV = j2.o(i14, q(i11), unsafe.getObject(obj, j10));
                        iX += iV;
                    }
                    break;
                case 10:
                    if ((i10 & i12) != 0) {
                        iV = v.U(i14, (n) unsafe.getObject(obj, j10));
                        iX += iV;
                    }
                    break;
                case 11:
                    if ((i10 & i12) != 0) {
                        iV = v.l0(i14, unsafe.getInt(obj, j10));
                        iX += iV;
                    }
                    break;
                case 12:
                    if ((i10 & i12) != 0) {
                        iV = v.W(i14, unsafe.getInt(obj, j10));
                        iX += iV;
                    }
                    break;
                case 13:
                    if ((i10 & i12) != 0) {
                        iV = v.e0(i14);
                        iX += iV;
                    }
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    if ((i10 & i12) != 0) {
                        iV = v.f0(i14);
                        iX += iV;
                    }
                    break;
                case 15:
                    if ((i10 & i12) != 0) {
                        iV = v.g0(i14, unsafe.getInt(obj, j10));
                        iX += iV;
                    }
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    if ((i10 & i12) != 0) {
                        iV = v.h0(i14, unsafe.getLong(obj, j10));
                        iX += iV;
                    }
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if ((i10 & i12) != 0) {
                        iV = v.a0(i14, (t1) unsafe.getObject(obj, j10), q(i11));
                        iX += iV;
                    }
                    break;
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    iV = j2.h(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 19:
                    iV = j2.f(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                    iV = j2.m(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 21:
                    iV = j2.x(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 22:
                    iV = j2.k(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 23:
                    iV = j2.h(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 24:
                    iV = j2.f(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                    iV = j2.a(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 26:
                    iV = j2.u(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 27:
                    iV = j2.p(i14, (List) unsafe.getObject(obj, j10), q(i11));
                    iX += iV;
                    break;
                case 28:
                    iV = j2.c(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 29:
                    iV = j2.v(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                    iV = j2.d(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 31:
                    iV = j2.f(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 32:
                    iV = j2.h(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 33:
                    iV = j2.q(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 34:
                    iV = j2.s(i14, (List) unsafe.getObject(obj, j10));
                    iX += iV;
                    break;
                case 35:
                    int i17 = j2.i((List) unsafe.getObject(obj, j10));
                    if (i17 > 0) {
                        iX = a7.a.x(i17, v.k0(i14), i17, iX);
                    }
                    break;
                case 36:
                    int iG = j2.g((List) unsafe.getObject(obj, j10));
                    if (iG > 0) {
                        iX = a7.a.x(iG, v.k0(i14), iG, iX);
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    int iN = j2.n((List) unsafe.getObject(obj, j10));
                    if (iN > 0) {
                        iX = a7.a.x(iN, v.k0(i14), iN, iX);
                    }
                    break;
                case 38:
                    int iY2 = j2.y((List) unsafe.getObject(obj, j10));
                    if (iY2 > 0) {
                        iX = a7.a.x(iY2, v.k0(i14), iY2, iX);
                    }
                    break;
                case 39:
                    int iL = j2.l((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                        iX = a7.a.x(iL, v.k0(i14), iL, iX);
                    }
                    break;
                case 40:
                    int i18 = j2.i((List) unsafe.getObject(obj, j10));
                    if (i18 > 0) {
                        iX = a7.a.x(i18, v.k0(i14), i18, iX);
                    }
                    break;
                case 41:
                    int iG2 = j2.g((List) unsafe.getObject(obj, j10));
                    if (iG2 > 0) {
                        iX = a7.a.x(iG2, v.k0(i14), iG2, iX);
                    }
                    break;
                case 42:
                    int iB = j2.b((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iX = a7.a.x(iB, v.k0(i14), iB, iX);
                    }
                    break;
                case 43:
                    int iW = j2.w((List) unsafe.getObject(obj, j10));
                    if (iW > 0) {
                        iX = a7.a.x(iW, v.k0(i14), iW, iX);
                    }
                    break;
                case 44:
                    int iE = j2.e((List) unsafe.getObject(obj, j10));
                    if (iE > 0) {
                        iX = a7.a.x(iE, v.k0(i14), iE, iX);
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    int iG3 = j2.g((List) unsafe.getObject(obj, j10));
                    if (iG3 > 0) {
                        iX = a7.a.x(iG3, v.k0(i14), iG3, iX);
                    }
                    break;
                case 46:
                    int i19 = j2.i((List) unsafe.getObject(obj, j10));
                    if (i19 > 0) {
                        iX = a7.a.x(i19, v.k0(i14), i19, iX);
                    }
                    break;
                case 47:
                    int iR = j2.r((List) unsafe.getObject(obj, j10));
                    if (iR > 0) {
                        iX = a7.a.x(iR, v.k0(i14), iR, iX);
                    }
                    break;
                case 48:
                    int iT = j2.t((List) unsafe.getObject(obj, j10));
                    if (iT > 0) {
                        iX = a7.a.x(iT, v.k0(i14), iT, iX);
                    }
                    break;
                case 49:
                    iV = j2.j(i14, (List) unsafe.getObject(obj, j10), q(i11));
                    iX += iV;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    Object object2 = unsafe.getObject(obj, j10);
                    Object objP = p(i11);
                    this.f4270n.getClass();
                    iV = o1.c(i14, object2, objP);
                    iX += iV;
                    break;
                case 51:
                    if (w(obj, i14, i11)) {
                        iV = v.V(i14);
                        iX += iV;
                    }
                    break;
                case 52:
                    if (w(obj, i14, i11)) {
                        iV = v.Z(i14);
                        iX += iV;
                    }
                    break;
                case 53:
                    if (w(obj, i14, i11)) {
                        iV = v.d0(i14, H(obj, j10));
                        iX += iV;
                    }
                    break;
                case 54:
                    if (w(obj, i14, i11)) {
                        iV = v.n0(i14, H(obj, j10));
                        iX += iV;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (w(obj, i14, i11)) {
                        iV = v.b0(i14, G(obj, j10));
                        iX += iV;
                    }
                    break;
                case 56:
                    if (w(obj, i14, i11)) {
                        iV = v.Y(i14);
                        iX += iV;
                    }
                    break;
                case 57:
                    if (w(obj, i14, i11)) {
                        iV = v.X(i14);
                        iX += iV;
                    }
                    break;
                case 58:
                    if (w(obj, i14, i11)) {
                        iV = v.T(i14);
                        iX += iV;
                    }
                    break;
                case 59:
                    if (w(obj, i14, i11)) {
                        Object object3 = unsafe.getObject(obj, j10);
                        iU = object3 instanceof n ? v.U(i14, (n) object3) : v.i0(i14, (String) object3);
                        iX = iU + iX;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    if (w(obj, i14, i11)) {
                        iV = j2.o(i14, q(i11), unsafe.getObject(obj, j10));
                        iX += iV;
                    }
                    break;
                case 61:
                    if (w(obj, i14, i11)) {
                        iV = v.U(i14, (n) unsafe.getObject(obj, j10));
                        iX += iV;
                    }
                    break;
                case 62:
                    if (w(obj, i14, i11)) {
                        iV = v.l0(i14, G(obj, j10));
                        iX += iV;
                    }
                    break;
                case 63:
                    if (w(obj, i14, i11)) {
                        iV = v.W(i14, G(obj, j10));
                        iX += iV;
                    }
                    break;
                case 64:
                    if (w(obj, i14, i11)) {
                        iV = v.e0(i14);
                        iX += iV;
                    }
                    break;
                case 65:
                    if (w(obj, i14, i11)) {
                        iV = v.f0(i14);
                        iX += iV;
                    }
                    break;
                case 66:
                    if (w(obj, i14, i11)) {
                        iV = v.g0(i14, G(obj, j10));
                        iX += iV;
                    }
                    break;
                case 67:
                    if (w(obj, i14, i11)) {
                        iV = v.h0(i14, H(obj, j10));
                        iX += iV;
                    }
                    break;
                case 68:
                    if (w(obj, i14, i11)) {
                        iV = v.a0(i14, (t1) unsafe.getObject(obj, j10), q(i11));
                        iX += iV;
                    }
                    break;
            }
            i11 += 3;
        }
    }

    public final int t(Object obj) {
        int iV;
        int i10 = 0;
        int iX = 0;
        while (true) {
            int[] iArr = this.f4257a;
            if (i10 >= iArr.length) {
                this.f4269m.getClass();
                return ((l0) obj).unknownFields.c() + iX;
            }
            int iY = Y(i10);
            int iX2 = X(iY);
            int i11 = iArr[i10];
            long j10 = iY & 1048575;
            if (iX2 >= d0.f4088b.a() && iX2 <= d0.f4089c.a()) {
                int i12 = iArr[i10 + 2];
            }
            Unsafe unsafe = f4256p;
            switch (iX2) {
                case 0:
                    if (u(i10, obj)) {
                        iV = v.V(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 1:
                    if (u(i10, obj)) {
                        iV = v.Z(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 2:
                    if (u(i10, obj)) {
                        iV = v.d0(i11, z2.k(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 3:
                    if (u(i10, obj)) {
                        iV = v.n0(i11, z2.k(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 4:
                    if (u(i10, obj)) {
                        iV = v.b0(i11, z2.j(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 5:
                    if (u(i10, obj)) {
                        iV = v.Y(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 6:
                    if (u(i10, obj)) {
                        iV = v.X(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 7:
                    if (u(i10, obj)) {
                        iV = v.T(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 8:
                    if (u(i10, obj)) {
                        Object objL = z2.l(obj, j10);
                        iV = !(objL instanceof n) ? v.i0(i11, (String) objL) : v.U(i11, (n) objL);
                        break;
                    }
                    i10 += 3;
                    break;
                case 9:
                    if (u(i10, obj)) {
                        iV = j2.o(i11, q(i10), z2.l(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 10:
                    if (u(i10, obj)) {
                        iV = v.U(i11, (n) z2.l(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 11:
                    if (u(i10, obj)) {
                        iV = v.l0(i11, z2.j(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 12:
                    if (u(i10, obj)) {
                        iV = v.W(i11, z2.j(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 13:
                    if (u(i10, obj)) {
                        iV = v.e0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    if (u(i10, obj)) {
                        iV = v.f0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 15:
                    if (u(i10, obj)) {
                        iV = v.g0(i11, z2.j(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    if (u(i10, obj)) {
                        iV = v.h0(i11, z2.k(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (u(i10, obj)) {
                        iV = v.a0(i11, (t1) z2.l(obj, j10), q(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    iV = j2.h(i11, x(obj, j10));
                    break;
                case 19:
                    iV = j2.f(i11, x(obj, j10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                    iV = j2.m(i11, x(obj, j10));
                    break;
                case 21:
                    iV = j2.x(i11, x(obj, j10));
                    break;
                case 22:
                    iV = j2.k(i11, x(obj, j10));
                    break;
                case 23:
                    iV = j2.h(i11, x(obj, j10));
                    break;
                case 24:
                    iV = j2.f(i11, x(obj, j10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                    iV = j2.a(i11, x(obj, j10));
                    break;
                case 26:
                    iV = j2.u(i11, x(obj, j10));
                    break;
                case 27:
                    iV = j2.p(i11, x(obj, j10), q(i10));
                    break;
                case 28:
                    iV = j2.c(i11, x(obj, j10));
                    break;
                case 29:
                    iV = j2.v(i11, x(obj, j10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                    iV = j2.d(i11, x(obj, j10));
                    break;
                case 31:
                    iV = j2.f(i11, x(obj, j10));
                    break;
                case 32:
                    iV = j2.h(i11, x(obj, j10));
                    break;
                case 33:
                    iV = j2.q(i11, x(obj, j10));
                    break;
                case 34:
                    iV = j2.s(i11, x(obj, j10));
                    break;
                case 35:
                    int i13 = j2.i((List) unsafe.getObject(obj, j10));
                    if (i13 > 0) {
                        iX = a7.a.x(i13, v.k0(i11), i13, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 36:
                    int iG = j2.g((List) unsafe.getObject(obj, j10));
                    if (iG > 0) {
                        iX = a7.a.x(iG, v.k0(i11), iG, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    int iN = j2.n((List) unsafe.getObject(obj, j10));
                    if (iN > 0) {
                        iX = a7.a.x(iN, v.k0(i11), iN, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 38:
                    int iY2 = j2.y((List) unsafe.getObject(obj, j10));
                    if (iY2 > 0) {
                        iX = a7.a.x(iY2, v.k0(i11), iY2, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 39:
                    int iL = j2.l((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                        iX = a7.a.x(iL, v.k0(i11), iL, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 40:
                    int i14 = j2.i((List) unsafe.getObject(obj, j10));
                    if (i14 > 0) {
                        iX = a7.a.x(i14, v.k0(i11), i14, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 41:
                    int iG2 = j2.g((List) unsafe.getObject(obj, j10));
                    if (iG2 > 0) {
                        iX = a7.a.x(iG2, v.k0(i11), iG2, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 42:
                    int iB = j2.b((List) unsafe.getObject(obj, j10));
                    if (iB > 0) {
                        iX = a7.a.x(iB, v.k0(i11), iB, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 43:
                    int iW = j2.w((List) unsafe.getObject(obj, j10));
                    if (iW > 0) {
                        iX = a7.a.x(iW, v.k0(i11), iW, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 44:
                    int iE = j2.e((List) unsafe.getObject(obj, j10));
                    if (iE > 0) {
                        iX = a7.a.x(iE, v.k0(i11), iE, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    int iG3 = j2.g((List) unsafe.getObject(obj, j10));
                    if (iG3 > 0) {
                        iX = a7.a.x(iG3, v.k0(i11), iG3, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 46:
                    int i15 = j2.i((List) unsafe.getObject(obj, j10));
                    if (i15 > 0) {
                        iX = a7.a.x(i15, v.k0(i11), i15, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 47:
                    int iR = j2.r((List) unsafe.getObject(obj, j10));
                    if (iR > 0) {
                        iX = a7.a.x(iR, v.k0(i11), iR, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 48:
                    int iT = j2.t((List) unsafe.getObject(obj, j10));
                    if (iT > 0) {
                        iX = a7.a.x(iT, v.k0(i11), iT, iX);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 49:
                    iV = j2.j(i11, x(obj, j10), q(i10));
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    Object objL2 = z2.l(obj, j10);
                    Object objP = p(i10);
                    this.f4270n.getClass();
                    iV = o1.c(i11, objL2, objP);
                    break;
                case 51:
                    if (w(obj, i11, i10)) {
                        iV = v.V(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 52:
                    if (w(obj, i11, i10)) {
                        iV = v.Z(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 53:
                    if (w(obj, i11, i10)) {
                        iV = v.d0(i11, H(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 54:
                    if (w(obj, i11, i10)) {
                        iV = v.n0(i11, H(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (w(obj, i11, i10)) {
                        iV = v.b0(i11, G(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 56:
                    if (w(obj, i11, i10)) {
                        iV = v.Y(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 57:
                    if (w(obj, i11, i10)) {
                        iV = v.X(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 58:
                    if (w(obj, i11, i10)) {
                        iV = v.T(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 59:
                    if (w(obj, i11, i10)) {
                        Object objL3 = z2.l(obj, j10);
                        iV = !(objL3 instanceof n) ? v.i0(i11, (String) objL3) : v.U(i11, (n) objL3);
                        break;
                    }
                    i10 += 3;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE_SEGMENT /* 60 */:
                    if (w(obj, i11, i10)) {
                        iV = j2.o(i11, q(i10), z2.l(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 61:
                    if (w(obj, i11, i10)) {
                        iV = v.U(i11, (n) z2.l(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 62:
                    if (w(obj, i11, i10)) {
                        iV = v.l0(i11, G(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 63:
                    if (w(obj, i11, i10)) {
                        iV = v.W(i11, G(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 64:
                    if (w(obj, i11, i10)) {
                        iV = v.e0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 65:
                    if (w(obj, i11, i10)) {
                        iV = v.f0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 66:
                    if (w(obj, i11, i10)) {
                        iV = v.g0(i11, G(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 67:
                    if (w(obj, i11, i10)) {
                        iV = v.h0(i11, H(obj, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 68:
                    if (w(obj, i11, i10)) {
                        iV = v.a0(i11, (t1) z2.l(obj, j10), q(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                default:
                    continue;
                    i10 += 3;
                    break;
            }
            iX = iV + iX;
            i10 += 3;
        }
    }

    public final boolean u(int i10, Object obj) {
        int i11 = this.f4257a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 != 1048575) {
            return ((1 << (i11 >>> 20)) & z2.f4286c.i(obj, j10)) != 0;
        }
        int iY = Y(i10);
        long j11 = iY & 1048575;
        switch (X(iY)) {
            case 0:
                return Double.doubleToRawLongBits(z2.f4286c.g(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(z2.f4286c.h(obj, j11)) != 0;
            case 2:
                return z2.f4286c.j(obj, j11) != 0;
            case 3:
                return z2.f4286c.j(obj, j11) != 0;
            case 4:
                return z2.f4286c.i(obj, j11) != 0;
            case 5:
                return z2.f4286c.j(obj, j11) != 0;
            case 6:
                return z2.f4286c.i(obj, j11) != 0;
            case 7:
                return z2.f4286c.d(obj, j11);
            case 8:
                Object objK = z2.f4286c.k(obj, j11);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof n) {
                    return !n.f4181b.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return z2.f4286c.k(obj, j11) != null;
            case 10:
                return !n.f4181b.equals(z2.f4286c.k(obj, j11));
            case 11:
                return z2.f4286c.i(obj, j11) != 0;
            case 12:
                return z2.f4286c.i(obj, j11) != 0;
            case 13:
                return z2.f4286c.i(obj, j11) != 0;
            case Code.UNAVAILABLE /* 14 */:
                return z2.f4286c.j(obj, j11) != 0;
            case 15:
                return z2.f4286c.i(obj, j11) != 0;
            case Code.UNAUTHENTICATED /* 16 */:
                return z2.f4286c.j(obj, j11) != 0;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return z2.f4286c.k(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean w(Object obj, int i10, int i11) {
        return z2.f4286c.i(obj, (long) (this.f4257a[i11 + 2] & 1048575)) == i10;
    }

    public final void y(Object obj, int i10, Object obj2, z zVar, g2.m mVar) throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        long jY = Y(i10) & 1048575;
        Object objK = z2.f4286c.k(obj, jY);
        o1 o1Var = this.f4270n;
        if (objK == null) {
            o1Var.getClass();
            objK = n1.f4184b.c();
            z2.v(obj, jY, objK);
        } else {
            o1Var.getClass();
            if (o1.d(objK)) {
                n1 n1VarC = n1.f4184b.c();
                o1.e(n1VarC, objK);
                z2.v(obj, jY, n1VarC);
                objK = n1VarC;
            }
        }
        o1Var.getClass();
        n1 n1Var = (n1) objK;
        i3.a0 a0Var = ((m1) obj2).f4178a;
        mVar.U(2);
        int iJ = ((s) mVar.f6581e).j(((s) mVar.f6581e).B());
        Object objS = a0Var.f7942b;
        Object objS2 = a0Var.f7944d;
        while (true) {
            try {
                int iB = mVar.b();
                if (iB == Integer.MAX_VALUE || ((s) mVar.f6581e).e()) {
                    break;
                }
                if (iB == 1) {
                    objS = mVar.s((h3) a0Var.f7941a, null, null);
                } else if (iB != 2) {
                    try {
                        if (!mVar.V()) {
                            throw new a1("Unable to parse map entry.");
                        }
                    } catch (z0 unused) {
                        if (!mVar.V()) {
                            throw new a1("Unable to parse map entry.");
                        }
                    }
                } else {
                    objS2 = mVar.s((h3) a0Var.f7943c, a0Var.f7944d.getClass(), zVar);
                }
            } catch (Throwable th) {
                ((s) mVar.f6581e).i(iJ);
                throw th;
            }
        }
        n1Var.put(objS, objS2);
        ((s) mVar.f6581e).i(iJ);
    }

    public final void z(int i10, Object obj, Object obj2) {
        if (u(i10, obj2)) {
            long jY = Y(i10) & 1048575;
            Unsafe unsafe = f4256p;
            Object object = unsafe.getObject(obj2, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f4257a[i10] + " is present but null: " + obj2);
            }
            i2 i2VarQ = q(i10);
            if (!u(i10, obj)) {
                if (v(object)) {
                    Object objF = i2VarQ.f();
                    i2VarQ.a(objF, object);
                    unsafe.putObject(obj, jY, objF);
                } else {
                    unsafe.putObject(obj, jY, object);
                }
                S(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jY);
            if (!v(object2)) {
                Object objF2 = i2VarQ.f();
                i2VarQ.a(objF2, object2);
                unsafe.putObject(obj, jY, objF2);
                object2 = objF2;
            }
            i2VarQ.a(object2, object);
        }
    }
}
