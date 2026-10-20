package o7;

/* JADX INFO: loaded from: classes.dex */
public final class m extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final m DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = "";
    private com.google.protobuf.x0 writes_ = com.google.protobuf.l0.emptyProtobufList();
    private com.google.protobuf.n transaction_ = com.google.protobuf.n.f4181b;

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        com.google.protobuf.l0.registerDefaultInstance(m.class, mVar);
    }

    public static void f(m mVar, String str) {
        mVar.getClass();
        str.getClass();
        mVar.database_ = str;
    }

    public static void g(m mVar, l2 l2Var) {
        mVar.getClass();
        l2Var.getClass();
        com.google.protobuf.x0 x0Var = mVar.writes_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            mVar.writes_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        mVar.writes_.add(l2Var);
    }

    public static m h() {
        return DEFAULT_INSTANCE;
    }

    public static l i() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", l2.class, "transaction_"});
            case 3:
                return new m();
            case 4:
                return new l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (m.class) {
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
