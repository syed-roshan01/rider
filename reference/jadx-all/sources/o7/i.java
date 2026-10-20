package o7;

/* JADX INFO: loaded from: classes.dex */
public final class i extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final i DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private com.google.protobuf.q2 readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private com.google.protobuf.n transaction_ = com.google.protobuf.n.f4181b;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        com.google.protobuf.l0.registerDefaultInstance(i.class, iVar);
    }

    public static i g() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004\t", new Object[]{"result_", "resultCase_", s.class, "transaction_", "readTime_"});
            case 3:
                return new i();
            case 4:
                return new b(1);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (i.class) {
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

    public final com.google.protobuf.q2 getReadTime() {
        com.google.protobuf.q2 q2Var = this.readTime_;
        return q2Var == null ? com.google.protobuf.q2.h() : q2Var;
    }

    public final s h() {
        return this.resultCase_ == 1 ? (s) this.result_ : s.i();
    }

    public final String i() {
        return this.resultCase_ == 2 ? (String) this.result_ : "";
    }

    public final int j() {
        int i10 = this.resultCase_;
        if (i10 == 0) {
            return 3;
        }
        if (i10 != 1) {
            return i10 != 2 ? 0 : 2;
        }
        return 1;
    }
}
