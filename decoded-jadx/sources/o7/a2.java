package o7;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final a2 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private com.google.protobuf.n0 expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    static {
        a2 a2Var = new a2();
        DEFAULT_INSTANCE = a2Var;
        com.google.protobuf.l0.registerDefaultInstance(a2.class, a2Var);
    }

    public static void f(a2 a2Var, z1 z1Var) {
        a2Var.getClass();
        z1Var.getClass();
        a2Var.targetType_ = z1Var;
        a2Var.targetTypeCase_ = 2;
    }

    public static void g(a2 a2Var, x1 x1Var) {
        a2Var.getClass();
        x1Var.getClass();
        a2Var.targetType_ = x1Var;
        a2Var.targetTypeCase_ = 3;
    }

    public static void h(a2 a2Var, com.google.protobuf.n nVar) {
        a2Var.getClass();
        nVar.getClass();
        a2Var.resumeTypeCase_ = 4;
        a2Var.resumeType_ = nVar;
    }

    public static void i(a2 a2Var, com.google.protobuf.q2 q2Var) {
        a2Var.getClass();
        q2Var.getClass();
        a2Var.resumeType_ = q2Var;
        a2Var.resumeTypeCase_ = 11;
    }

    public static void j(a2 a2Var, int i10) {
        a2Var.targetId_ = i10;
    }

    public static void k(a2 a2Var, com.google.protobuf.n0 n0Var) {
        a2Var.getClass();
        n0Var.getClass();
        a2Var.expectedCount_ = n0Var;
    }

    public static v1 l() {
        return (v1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0000\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\f\t", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", z1.class, x1.class, "targetId_", "once_", com.google.protobuf.q2.class, "expectedCount_"});
            case 3:
                return new a2();
            case 4:
                return new v1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (a2.class) {
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
