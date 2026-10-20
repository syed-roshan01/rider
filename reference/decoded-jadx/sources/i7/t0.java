package i7;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final t0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.l keyValue_ = com.google.crypto.tink.shaded.protobuf.l.f3571b;
    private x0 params_;
    private int version_;

    static {
        t0 t0Var = new t0();
        DEFAULT_INSTANCE = t0Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(t0.class, t0Var);
    }

    public static t0 A() {
        return DEFAULT_INSTANCE;
    }

    public static s0 E() {
        return (s0) DEFAULT_INSTANCE.i();
    }

    public static t0 F(com.google.crypto.tink.shaded.protobuf.l lVar, com.google.crypto.tink.shaded.protobuf.t tVar) {
        return (t0) com.google.crypto.tink.shaded.protobuf.b0.s(DEFAULT_INSTANCE, lVar, tVar);
    }

    public static void x(t0 t0Var) {
        t0Var.version_ = 0;
    }

    public static void y(t0 t0Var, x0 x0Var) {
        t0Var.getClass();
        x0Var.getClass();
        t0Var.params_ = x0Var;
    }

    public static void z(t0 t0Var, com.google.crypto.tink.shaded.protobuf.k kVar) {
        t0Var.getClass();
        t0Var.keyValue_ = kVar;
    }

    public final com.google.crypto.tink.shaded.protobuf.l B() {
        return this.keyValue_;
    }

    public final x0 C() {
        x0 x0Var = this.params_;
        return x0Var == null ? x0.z() : x0Var;
    }

    public final int D() {
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new t0();
            case 4:
                return new s0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (t0.class) {
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
