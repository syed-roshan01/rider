package o7;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final x1 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.b2 PARSER;
    private com.google.protobuf.x0 documents_ = com.google.protobuf.l0.emptyProtobufList();

    static {
        x1 x1Var = new x1();
        DEFAULT_INSTANCE = x1Var;
        com.google.protobuf.l0.registerDefaultInstance(x1.class, x1Var);
    }

    public static void f(x1 x1Var, String str) {
        x1Var.getClass();
        str.getClass();
        com.google.protobuf.x0 x0Var = x1Var.documents_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            x1Var.documents_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        x1Var.documents_.add(str);
    }

    public static x1 g() {
        return DEFAULT_INSTANCE;
    }

    public static w1 j() {
        return (w1) DEFAULT_INSTANCE.createBuilder();
    }

    public static w1 k(x1 x1Var) {
        return (w1) DEFAULT_INSTANCE.createBuilder(x1Var);
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u021a", new Object[]{"documents_"});
            case 3:
                return new x1();
            case 4:
                return new w1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (x1.class) {
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

    public final String h() {
        return (String) this.documents_.get(0);
    }

    public final int i() {
        return this.documents_.size();
    }
}
