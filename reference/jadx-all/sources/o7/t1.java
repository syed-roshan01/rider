package o7;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final t1 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.b2 PARSER;
    private int op_;
    private int operandTypeCase_ = 0;
    private Object operandType_;

    static {
        t1 t1Var = new t1();
        DEFAULT_INSTANCE = t1Var;
        com.google.protobuf.l0.registerDefaultInstance(t1.class, t1Var);
    }

    public static void f(t1 t1Var, s1 s1Var) {
        t1Var.getClass();
        t1Var.op_ = s1Var.getNumber();
    }

    public static void g(t1 t1Var, k1 k1Var) {
        t1Var.getClass();
        k1Var.getClass();
        t1Var.operandType_ = k1Var;
        t1Var.operandTypeCase_ = 2;
    }

    public static t1 h() {
        return DEFAULT_INSTANCE;
    }

    public static r1 k() {
        return (r1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", k1.class});
            case 3:
                return new t1();
            case 4:
                return new r1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (t1.class) {
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

    public final k1 i() {
        return this.operandTypeCase_ == 2 ? (k1) this.operandType_ : k1.g();
    }

    public final s1 j() {
        s1 s1VarA = s1.a(this.op_);
        return s1VarA == null ? s1.UNRECOGNIZED : s1VarA;
    }
}
