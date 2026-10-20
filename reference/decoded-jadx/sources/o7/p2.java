package o7;

/* JADX INFO: loaded from: classes.dex */
public final class p2 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final p2 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private com.google.protobuf.n1 labels_ = com.google.protobuf.n1.f4184b;
    private String database_ = "";
    private String streamId_ = "";
    private com.google.protobuf.x0 writes_ = com.google.protobuf.l0.emptyProtobufList();
    private com.google.protobuf.n streamToken_ = com.google.protobuf.n.f4181b;

    static {
        p2 p2Var = new p2();
        DEFAULT_INSTANCE = p2Var;
        com.google.protobuf.l0.registerDefaultInstance(p2.class, p2Var);
    }

    public static void f(p2 p2Var, String str) {
        p2Var.getClass();
        str.getClass();
        p2Var.database_ = str;
    }

    public static void g(p2 p2Var, com.google.protobuf.n nVar) {
        p2Var.getClass();
        nVar.getClass();
        p2Var.streamToken_ = nVar;
    }

    public static void h(p2 p2Var, l2 l2Var) {
        p2Var.getClass();
        l2Var.getClass();
        com.google.protobuf.x0 x0Var = p2Var.writes_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            p2Var.writes_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        p2Var.writes_.add(l2Var);
    }

    public static p2 i() {
        return DEFAULT_INSTANCE;
    }

    public static n2 j() {
        return (n2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", l2.class, "streamToken_", "labels_", o2.f12647a});
            case 3:
                return new p2();
            case 4:
                return new n2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (p2.class) {
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
