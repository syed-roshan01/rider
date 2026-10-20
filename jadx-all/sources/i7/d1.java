package i7;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final d1 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.l value_ = com.google.crypto.tink.shaded.protobuf.l.f3571b;

    static {
        d1 d1Var = new d1();
        DEFAULT_INSTANCE = d1Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(d1.class, d1Var);
    }

    public static d1 A() {
        return DEFAULT_INSTANCE;
    }

    public static c1 E() {
        return (c1) DEFAULT_INSTANCE.i();
    }

    public static void x(d1 d1Var, String str) {
        d1Var.getClass();
        str.getClass();
        d1Var.typeUrl_ = str;
    }

    public static void y(d1 d1Var, com.google.crypto.tink.shaded.protobuf.k kVar) {
        d1Var.getClass();
        d1Var.value_ = kVar;
    }

    public static void z(d1 d1Var, t1 t1Var) {
        d1Var.getClass();
        d1Var.outputPrefixType_ = t1Var.b();
    }

    public final t1 B() {
        t1 t1VarA = t1.a(this.outputPrefixType_);
        return t1VarA == null ? t1.UNRECOGNIZED : t1VarA;
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new d1();
            case 4:
                return new c1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (d1.class) {
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
