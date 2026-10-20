package i7;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final o1 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private p1 params_;
    private int version_;

    static {
        o1 o1Var = new o1();
        DEFAULT_INSTANCE = o1Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(o1.class, o1Var);
    }

    public static n1 B() {
        return (n1) DEFAULT_INSTANCE.i();
    }

    public static o1 C(com.google.crypto.tink.shaded.protobuf.l lVar, com.google.crypto.tink.shaded.protobuf.t tVar) {
        return (o1) com.google.crypto.tink.shaded.protobuf.b0.s(DEFAULT_INSTANCE, lVar, tVar);
    }

    public static void x(o1 o1Var) {
        o1Var.version_ = 0;
    }

    public static void y(o1 o1Var, p1 p1Var) {
        o1Var.getClass();
        p1Var.getClass();
        o1Var.params_ = p1Var;
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new o1();
            case 4:
                return new n1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (o1.class) {
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

    public final p1 z() {
        p1 p1Var = this.params_;
        return p1Var == null ? p1.y() : p1Var;
    }
}
