package o7;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final k1 DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.b2 PARSER;
    private String fieldPath_ = "";

    static {
        k1 k1Var = new k1();
        DEFAULT_INSTANCE = k1Var;
        com.google.protobuf.l0.registerDefaultInstance(k1.class, k1Var);
    }

    public static void f(k1 k1Var, String str) {
        k1Var.getClass();
        str.getClass();
        k1Var.fieldPath_ = str;
    }

    public static k1 g() {
        return DEFAULT_INSTANCE;
    }

    public static j1 i() {
        return (j1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0208", new Object[]{"fieldPath_"});
            case 3:
                return new k1();
            case 4:
                return new j1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (k1.class) {
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
        return this.fieldPath_;
    }
}
