package o7;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final m0 DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    static {
        m0 m0Var = new m0();
        DEFAULT_INSTANCE = m0Var;
        com.google.protobuf.l0.registerDefaultInstance(m0.class, m0Var);
    }

    public static void f(m0 m0Var, boolean z10) {
        m0Var.conditionTypeCase_ = 1;
        m0Var.conditionType_ = Boolean.valueOf(z10);
    }

    public static void g(m0 m0Var, com.google.protobuf.q2 q2Var) {
        m0Var.getClass();
        q2Var.getClass();
        m0Var.conditionType_ = q2Var;
        m0Var.conditionTypeCase_ = 2;
    }

    public static m0 i() {
        return DEFAULT_INSTANCE;
    }

    public static l0 l() {
        return (l0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", com.google.protobuf.q2.class});
            case 3:
                return new m0();
            case 4:
                return new l0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (m0.class) {
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

    public final int h() {
        int i10 = this.conditionTypeCase_;
        if (i10 == 0) {
            return 3;
        }
        if (i10 != 1) {
            return i10 != 2 ? 0 : 2;
        }
        return 1;
    }

    public final boolean j() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    public final com.google.protobuf.q2 k() {
        return this.conditionTypeCase_ == 2 ? (com.google.protobuf.q2) this.conditionType_ : com.google.protobuf.q2.h();
    }
}
