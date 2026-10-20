package o7;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int ALIAS_FIELD_NUMBER = 7;
    public static final int AVG_FIELD_NUMBER = 3;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final w0 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int SUM_FIELD_NUMBER = 2;
    private Object operator_;
    private int operatorCase_ = 0;
    private String alias_ = "";

    static {
        w0 w0Var = new w0();
        DEFAULT_INSTANCE = w0Var;
        com.google.protobuf.l0.registerDefaultInstance(w0.class, w0Var);
    }

    public static void f(w0 w0Var, t0 t0Var) {
        w0Var.getClass();
        t0Var.getClass();
        w0Var.operator_ = t0Var;
        w0Var.operatorCase_ = 1;
    }

    public static void g(w0 w0Var, v0 v0Var) {
        w0Var.getClass();
        v0Var.getClass();
        w0Var.operator_ = v0Var;
        w0Var.operatorCase_ = 2;
    }

    public static void h(w0 w0Var, r0 r0Var) {
        w0Var.getClass();
        r0Var.getClass();
        w0Var.operator_ = r0Var;
        w0Var.operatorCase_ = 3;
    }

    public static void i(w0 w0Var, String str) {
        w0Var.getClass();
        str.getClass();
        w0Var.alias_ = str;
    }

    public static s0 j() {
        return (s0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007\u0208", new Object[]{"operator_", "operatorCase_", t0.class, v0.class, r0.class, "alias_"});
            case 3:
                return new w0();
            case 4:
                return new s0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (w0.class) {
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
