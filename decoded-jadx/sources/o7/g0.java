package o7;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final g0 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private com.google.protobuf.n1 labels_ = com.google.protobuf.n1.f4184b;
    private String database_ = "";

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        com.google.protobuf.l0.registerDefaultInstance(g0.class, g0Var);
    }

    public static com.google.protobuf.n1 f(g0 g0Var) {
        com.google.protobuf.n1 n1Var = g0Var.labels_;
        if (!n1Var.f4185a) {
            g0Var.labels_ = n1Var.c();
        }
        return g0Var.labels_;
    }

    public static void g(g0 g0Var, String str) {
        g0Var.getClass();
        str.getClass();
        g0Var.database_ = str;
    }

    public static void h(g0 g0Var, a2 a2Var) {
        g0Var.getClass();
        a2Var.getClass();
        g0Var.targetChange_ = a2Var;
        g0Var.targetChangeCase_ = 2;
    }

    public static void i(g0 g0Var, int i10) {
        g0Var.targetChangeCase_ = 3;
        g0Var.targetChange_ = Integer.valueOf(i10);
    }

    public static g0 j() {
        return DEFAULT_INSTANCE;
    }

    public static e0 k() {
        return (e0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0208\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", a2.class, "labels_", f0.f12601a});
            case 3:
                return new g0();
            case 4:
                return new e0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (g0.class) {
                        try {
                            h0Var = PARSER;
                            if (h0Var == null) {
                                h0Var = new com.google.protobuf.h0(DEFAULT_INSTANCE);
                                PARSER = h0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return h0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
