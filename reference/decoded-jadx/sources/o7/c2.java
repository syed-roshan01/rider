package o7;

/* JADX INFO: loaded from: classes.dex */
public final class c2 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final c2 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private w7.a cause_;
    private com.google.protobuf.q2 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private com.google.protobuf.v0 targetIds_ = com.google.protobuf.l0.emptyIntList();
    private com.google.protobuf.n resumeToken_ = com.google.protobuf.n.f4181b;

    static {
        c2 c2Var = new c2();
        DEFAULT_INSTANCE = c2Var;
        com.google.protobuf.l0.registerDefaultInstance(c2.class, c2Var);
    }

    public static c2 h() {
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
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003\t\u0004\n\u0006\t", new Object[]{"targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 3:
                return new c2();
            case 4:
                return new b(14);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (c2.class) {
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

    public final w7.a g() {
        w7.a aVar = this.cause_;
        return aVar == null ? w7.a.h() : aVar;
    }

    public final com.google.protobuf.q2 getReadTime() {
        com.google.protobuf.q2 q2Var = this.readTime_;
        return q2Var == null ? com.google.protobuf.q2.h() : q2Var;
    }

    public final com.google.protobuf.n getResumeToken() {
        return this.resumeToken_;
    }

    public final b2 i() {
        b2 b2VarA = b2.a(this.targetChangeType_);
        return b2VarA == null ? b2.UNRECOGNIZED : b2VarA;
    }

    public final int j() {
        return this.targetIds_.size();
    }

    public final com.google.protobuf.v0 k() {
        return this.targetIds_;
    }
}
