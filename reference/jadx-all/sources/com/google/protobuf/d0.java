package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f4088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f4089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0[] f4090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d0[] f4091e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4092a;

    /* JADX INFO: Fake field, exist only in values array */
    d0 EF0;

    static {
        c1 c1Var = c1.DOUBLE;
        d0 d0Var = new d0("DOUBLE", 0, 0, 1, c1Var);
        c1 c1Var2 = c1.FLOAT;
        d0 d0Var2 = new d0("FLOAT", 1, 1, 1, c1Var2);
        c1 c1Var3 = c1.LONG;
        d0 d0Var3 = new d0("INT64", 2, 2, 1, c1Var3);
        d0 d0Var4 = new d0("UINT64", 3, 3, 1, c1Var3);
        c1 c1Var4 = c1.INT;
        d0 d0Var5 = new d0("INT32", 4, 4, 1, c1Var4);
        d0 d0Var6 = new d0("FIXED64", 5, 5, 1, c1Var3);
        d0 d0Var7 = new d0("FIXED32", 6, 6, 1, c1Var4);
        c1 c1Var5 = c1.BOOLEAN;
        d0 d0Var8 = new d0("BOOL", 7, 7, 1, c1Var5);
        c1 c1Var6 = c1.STRING;
        d0 d0Var9 = new d0("STRING", 8, 8, 1, c1Var6);
        c1 c1Var7 = c1.MESSAGE;
        d0 d0Var10 = new d0("MESSAGE", 9, 9, 1, c1Var7);
        c1 c1Var8 = c1.BYTE_STRING;
        d0 d0Var11 = new d0("BYTES", 10, 10, 1, c1Var8);
        d0 d0Var12 = new d0("UINT32", 11, 11, 1, c1Var4);
        c1 c1Var9 = c1.ENUM;
        d0 d0Var13 = new d0("ENUM", 12, 12, 1, c1Var9);
        d0 d0Var14 = new d0("SFIXED32", 13, 13, 1, c1Var4);
        d0 d0Var15 = new d0("SFIXED64", 14, 14, 1, c1Var3);
        d0 d0Var16 = new d0("SINT32", 15, 15, 1, c1Var4);
        d0 d0Var17 = new d0("SINT64", 16, 16, 1, c1Var3);
        d0 d0Var18 = new d0("GROUP", 17, 17, 1, c1Var7);
        d0 d0Var19 = new d0("DOUBLE_LIST", 18, 18, 2, c1Var);
        d0 d0Var20 = new d0("FLOAT_LIST", 19, 19, 2, c1Var2);
        d0 d0Var21 = new d0("INT64_LIST", 20, 20, 2, c1Var3);
        d0 d0Var22 = new d0("UINT64_LIST", 21, 21, 2, c1Var3);
        d0 d0Var23 = new d0("INT32_LIST", 22, 22, 2, c1Var4);
        d0 d0Var24 = new d0("FIXED64_LIST", 23, 23, 2, c1Var3);
        d0 d0Var25 = new d0("FIXED32_LIST", 24, 24, 2, c1Var4);
        d0 d0Var26 = new d0("BOOL_LIST", 25, 25, 2, c1Var5);
        d0 d0Var27 = new d0("STRING_LIST", 26, 26, 2, c1Var6);
        d0 d0Var28 = new d0("MESSAGE_LIST", 27, 27, 2, c1Var7);
        d0 d0Var29 = new d0("BYTES_LIST", 28, 28, 2, c1Var8);
        d0 d0Var30 = new d0("UINT32_LIST", 29, 29, 2, c1Var4);
        d0 d0Var31 = new d0("ENUM_LIST", 30, 30, 2, c1Var9);
        d0 d0Var32 = new d0("SFIXED32_LIST", 31, 31, 2, c1Var4);
        d0 d0Var33 = new d0("SFIXED64_LIST", 32, 32, 2, c1Var3);
        d0 d0Var34 = new d0("SINT32_LIST", 33, 33, 2, c1Var4);
        d0 d0Var35 = new d0("SINT64_LIST", 34, 34, 2, c1Var3);
        d0 d0Var36 = new d0("DOUBLE_LIST_PACKED", 35, 35, 3, c1Var);
        f4088b = d0Var36;
        d0 d0Var37 = new d0("FLOAT_LIST_PACKED", 36, 36, 3, c1Var2);
        d0 d0Var38 = new d0("INT64_LIST_PACKED", 37, 37, 3, c1Var3);
        d0 d0Var39 = new d0("UINT64_LIST_PACKED", 38, 38, 3, c1Var3);
        d0 d0Var40 = new d0("INT32_LIST_PACKED", 39, 39, 3, c1Var4);
        d0 d0Var41 = new d0("FIXED64_LIST_PACKED", 40, 40, 3, c1Var3);
        d0 d0Var42 = new d0("FIXED32_LIST_PACKED", 41, 41, 3, c1Var4);
        d0 d0Var43 = new d0("BOOL_LIST_PACKED", 42, 42, 3, c1Var5);
        d0 d0Var44 = new d0("UINT32_LIST_PACKED", 43, 43, 3, c1Var4);
        d0 d0Var45 = new d0("ENUM_LIST_PACKED", 44, 44, 3, c1Var9);
        d0 d0Var46 = new d0("SFIXED32_LIST_PACKED", 45, 45, 3, c1Var4);
        d0 d0Var47 = new d0("SFIXED64_LIST_PACKED", 46, 46, 3, c1Var3);
        d0 d0Var48 = new d0("SINT32_LIST_PACKED", 47, 47, 3, c1Var4);
        d0 d0Var49 = new d0("SINT64_LIST_PACKED", 48, 48, 3, c1Var3);
        f4089c = d0Var49;
        f4091e = new d0[]{d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9, d0Var10, d0Var11, d0Var12, d0Var13, d0Var14, d0Var15, d0Var16, d0Var17, d0Var18, d0Var19, d0Var20, d0Var21, d0Var22, d0Var23, d0Var24, d0Var25, d0Var26, d0Var27, d0Var28, d0Var29, d0Var30, d0Var31, d0Var32, d0Var33, d0Var34, d0Var35, d0Var36, d0Var37, d0Var38, d0Var39, d0Var40, d0Var41, d0Var42, d0Var43, d0Var44, d0Var45, d0Var46, d0Var47, d0Var48, d0Var49, new d0("GROUP_LIST", 49, 49, 2, c1Var7), new d0("MAP", 50, 50, 4, c1.VOID)};
        d0[] d0VarArrValues = values();
        f4090d = new d0[d0VarArrValues.length];
        for (d0 d0Var50 : d0VarArrValues) {
            f4090d[d0Var50.f4092a] = d0Var50;
        }
    }

    public d0(String str, int i10, int i11, int i12, c1 c1Var) {
        super(str, i10);
        this.f4092a = i11;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i12 - 1;
        if (i13 == 1 || i13 == 3) {
            c1Var.getClass();
        }
        if (i12 == 1) {
            c1Var.ordinal();
        }
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f4091e.clone();
    }

    public final int a() {
        return this.f4092a;
    }
}
