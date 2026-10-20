package o7;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final q1 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.b2 PARSER;
    private com.google.protobuf.x0 fields_ = com.google.protobuf.l0.emptyProtobufList();

    static {
        q1 q1Var = new q1();
        DEFAULT_INSTANCE = q1Var;
        com.google.protobuf.l0.registerDefaultInstance(q1.class, q1Var);
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", k1.class});
            case 3:
                return new q1();
            case 4:
                return new b(13);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (q1.class) {
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
