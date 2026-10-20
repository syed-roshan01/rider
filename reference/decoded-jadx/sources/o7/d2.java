package o7;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final d2 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int consistencySelectorCase_ = 0;
    private Object consistencySelector_;

    static {
        d2 d2Var = new d2();
        DEFAULT_INSTANCE = d2Var;
        com.google.protobuf.l0.registerDefaultInstance(d2.class, d2Var);
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", com.google.protobuf.q2.class});
            case 3:
                return new d2();
            case 4:
                return new b(16, 0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (d2.class) {
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
