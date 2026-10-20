package o7;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final q2 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private com.google.protobuf.q2 commitTime_;
    private String streamId_ = "";
    private com.google.protobuf.n streamToken_ = com.google.protobuf.n.f4181b;
    private com.google.protobuf.x0 writeResults_ = com.google.protobuf.l0.emptyProtobufList();

    static {
        q2 q2Var = new q2();
        DEFAULT_INSTANCE = q2Var;
        com.google.protobuf.l0.registerDefaultInstance(q2.class, q2Var);
    }

    public static q2 h() {
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
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004\t", new Object[]{"streamId_", "streamToken_", "writeResults_", r2.class, "commitTime_"});
            case 3:
                return new q2();
            case 4:
                return new b(18);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (q2.class) {
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

    public final com.google.protobuf.q2 g() {
        com.google.protobuf.q2 q2Var = this.commitTime_;
        return q2Var == null ? com.google.protobuf.q2.h() : q2Var;
    }

    public final com.google.protobuf.n i() {
        return this.streamToken_;
    }

    public final r2 j(int i10) {
        return (r2) this.writeResults_.get(i10);
    }

    public final int k() {
        return this.writeResults_.size();
    }
}
