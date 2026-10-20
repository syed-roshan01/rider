package i7;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final w1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.l keyValue_ = com.google.crypto.tink.shaded.protobuf.l.f3571b;
    private int version_;

    static {
        w1 w1Var = new w1();
        DEFAULT_INSTANCE = w1Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(w1.class, w1Var);
    }

    public static v1 B() {
        return (v1) DEFAULT_INSTANCE.i();
    }

    public static w1 C(com.google.crypto.tink.shaded.protobuf.l lVar, com.google.crypto.tink.shaded.protobuf.t tVar) {
        return (w1) com.google.crypto.tink.shaded.protobuf.b0.s(DEFAULT_INSTANCE, lVar, tVar);
    }

    public static void x(w1 w1Var) {
        w1Var.version_ = 0;
    }

    public static void y(w1 w1Var, com.google.crypto.tink.shaded.protobuf.k kVar) {
        w1Var.getClass();
        w1Var.keyValue_ = kVar;
    }

    public final int A() {
        return this.version_;
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new w1();
            case 4:
                return new v1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (w1.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.l z() {
        return this.keyValue_;
    }
}
