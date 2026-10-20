package o7;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final e2 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
    private com.google.protobuf.n retryTransaction_ = com.google.protobuf.n.f4181b;

    static {
        e2 e2Var = new e2();
        DEFAULT_INSTANCE = e2Var;
        com.google.protobuf.l0.registerDefaultInstance(e2.class, e2Var);
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"retryTransaction_"});
            case 3:
                return new e2();
            case 4:
                return new b(17, 0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (e2.class) {
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
