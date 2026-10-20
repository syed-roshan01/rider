package o7;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final v0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.b2 PARSER;
    private k1 field_;

    static {
        v0 v0Var = new v0();
        DEFAULT_INSTANCE = v0Var;
        com.google.protobuf.l0.registerDefaultInstance(v0.class, v0Var);
    }

    public static void f(v0 v0Var, k1 k1Var) {
        v0Var.getClass();
        k1Var.getClass();
        v0Var.field_ = k1Var;
    }

    public static u0 g() {
        return (u0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"field_"});
            case 3:
                return new v0();
            case 4:
                return new u0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (v0.class) {
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
