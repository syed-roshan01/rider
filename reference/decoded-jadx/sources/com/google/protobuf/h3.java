package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class h3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d3 f4128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e3 f4129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f3 f4130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h3[] f4131f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f4132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4133b;

    /* JADX INFO: Fake field, exist only in values array */
    h3 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    h3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    h3 EF2;

    static {
        h3 h3Var = new h3("DOUBLE", 0, i3.DOUBLE, 1);
        h3 h3Var2 = new h3("FLOAT", 1, i3.FLOAT, 5);
        i3 i3Var = i3.LONG;
        h3 h3Var3 = new h3("INT64", 2, i3Var, 0);
        h3 h3Var4 = new h3("UINT64", 3, i3Var, 0);
        i3 i3Var2 = i3.INT;
        h3 h3Var5 = new h3("INT32", 4, i3Var2, 0);
        h3 h3Var6 = new h3("FIXED64", 5, i3Var, 1);
        h3 h3Var7 = new h3("FIXED32", 6, i3Var2, 5);
        h3 h3Var8 = new h3("BOOL", 7, i3.BOOLEAN, 0);
        d3 d3Var = new d3("STRING", 8, i3.STRING, 2);
        f4128c = d3Var;
        i3 i3Var3 = i3.MESSAGE;
        e3 e3Var = new e3("GROUP", 9, i3Var3, 3);
        f4129d = e3Var;
        f3 f3Var = new f3("MESSAGE", 10, i3Var3, 2);
        f4130e = f3Var;
        f4131f = new h3[]{h3Var, h3Var2, h3Var3, h3Var4, h3Var5, h3Var6, h3Var7, h3Var8, d3Var, e3Var, f3Var, new g3("BYTES", 11, i3.BYTE_STRING, 2), new h3("UINT32", 12, i3Var2, 0), new h3("ENUM", 13, i3.ENUM, 0), new h3("SFIXED32", 14, i3Var2, 5), new h3("SFIXED64", 15, i3Var, 1), new h3("SINT32", 16, i3Var2, 0), new h3("SINT64", 17, i3Var, 0)};
    }

    public h3(String str, int i10, i3 i3Var, int i11) {
        super(str, i10);
        this.f4132a = i3Var;
        this.f4133b = i11;
    }

    public static h3 valueOf(String str) {
        return (h3) Enum.valueOf(h3.class, str);
    }

    public static h3[] values() {
        return (h3[]) f4131f.clone();
    }
}
