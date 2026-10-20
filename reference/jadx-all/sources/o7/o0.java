package o7;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final o0 DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int STRUCTURED_AGGREGATION_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private Object consistencySelector_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String parent_ = "";

    static {
        o0 o0Var = new o0();
        DEFAULT_INSTANCE = o0Var;
        com.google.protobuf.l0.registerDefaultInstance(o0.class, o0Var);
    }

    public static void f(o0 o0Var, String str) {
        o0Var.getClass();
        str.getClass();
        o0Var.parent_ = str;
    }

    public static void g(o0 o0Var, y0 y0Var) {
        o0Var.getClass();
        y0Var.getClass();
        o0Var.queryType_ = y0Var;
        o0Var.queryTypeCase_ = 2;
    }

    public static o0 h() {
        return DEFAULT_INSTANCE;
    }

    public static n0 i() {
        return (n0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0004=\u0001\u0005<\u0001\u0006<\u0001", new Object[]{"queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", y0.class, f2.class, com.google.protobuf.q2.class});
            case 3:
                return new o0();
            case 4:
                return new n0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (o0.class) {
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
