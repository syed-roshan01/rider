package o7;

/* JADX INFO: loaded from: classes.dex */
public final class h extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private Object consistencySelector_;
    private w mask_;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";
    private com.google.protobuf.x0 documents_ = com.google.protobuf.l0.emptyProtobufList();

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        com.google.protobuf.l0.registerDefaultInstance(h.class, hVar);
    }

    public static void f(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.database_ = str;
    }

    public static void g(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        com.google.protobuf.x0 x0Var = hVar.documents_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            hVar.documents_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        hVar.documents_.add(str);
    }

    public static h h() {
        return DEFAULT_INSTANCE;
    }

    public static g i() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001\u0208\u0002\u021a\u0003\t\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "database_", "documents_", "mask_", f2.class, com.google.protobuf.q2.class});
            case 3:
                return new h();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (h.class) {
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
