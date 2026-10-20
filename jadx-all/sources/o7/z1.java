package o7;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final z1 DEFAULT_INSTANCE;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    static {
        z1 z1Var = new z1();
        DEFAULT_INSTANCE = z1Var;
        com.google.protobuf.l0.registerDefaultInstance(z1.class, z1Var);
    }

    public static void f(z1 z1Var, u1 u1Var) {
        z1Var.getClass();
        u1Var.getClass();
        z1Var.queryType_ = u1Var;
        z1Var.queryTypeCase_ = 2;
    }

    public static void g(z1 z1Var, String str) {
        z1Var.getClass();
        str.getClass();
        z1Var.parent_ = str;
    }

    public static z1 h() {
        return DEFAULT_INSTANCE;
    }

    public static y1 k() {
        return (y1) DEFAULT_INSTANCE.createBuilder();
    }

    public static y1 l(z1 z1Var) {
        return (y1) DEFAULT_INSTANCE.createBuilder(z1Var);
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", u1.class});
            case 3:
                return new z1();
            case 4:
                return new y1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (z1.class) {
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

    public final String i() {
        return this.parent_;
    }

    public final u1 j() {
        return this.queryTypeCase_ == 2 ? (u1) this.queryType_ : u1.l();
    }
}
