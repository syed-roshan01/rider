package o7;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final r2 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private com.google.protobuf.x0 transformResults_ = com.google.protobuf.l0.emptyProtobufList();
    private com.google.protobuf.q2 updateTime_;

    static {
        r2 r2Var = new r2();
        DEFAULT_INSTANCE = r2Var;
        com.google.protobuf.l0.registerDefaultInstance(r2.class, r2Var);
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"updateTime_", "transformResults_", i2.class});
            case 3:
                return new r2();
            case 4:
                return new b(19);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (r2.class) {
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

    public final i2 g(int i10) {
        return (i2) this.transformResults_.get(i10);
    }

    public final int h() {
        return this.transformResults_.size();
    }

    public final com.google.protobuf.q2 i() {
        com.google.protobuf.q2 q2Var = this.updateTime_;
        return q2Var == null ? com.google.protobuf.q2.h() : q2Var;
    }
}
