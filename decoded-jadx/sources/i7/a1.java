package i7;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final a1 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.l value_ = com.google.crypto.tink.shaded.protobuf.l.f3571b;

    static {
        a1 a1Var = new a1();
        DEFAULT_INSTANCE = a1Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(a1.class, a1Var);
    }

    public static a1 A() {
        return DEFAULT_INSTANCE;
    }

    public static y0 E() {
        return (y0) DEFAULT_INSTANCE.i();
    }

    public static void x(a1 a1Var, String str) {
        a1Var.getClass();
        str.getClass();
        a1Var.typeUrl_ = str;
    }

    public static void y(a1 a1Var, com.google.crypto.tink.shaded.protobuf.k kVar) {
        a1Var.getClass();
        a1Var.value_ = kVar;
    }

    public static void z(a1 a1Var, z0 z0Var) {
        a1Var.getClass();
        a1Var.keyMaterialType_ = z0Var.b();
    }

    public final z0 B() {
        z0 z0VarA = z0.a(this.keyMaterialType_);
        return z0VarA == null ? z0.UNRECOGNIZED : z0VarA;
    }

    public final String C() {
        return this.typeUrl_;
    }

    public final com.google.crypto.tink.shaded.protobuf.l D() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object j(int i10) {
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new a1();
            case 4:
                return new y0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (a1.class) {
                        try {
                            a0Var = PARSER;
                            if (a0Var == null) {
                                a0Var = new com.google.crypto.tink.shaded.protobuf.a0();
                                PARSER = a0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return a0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
