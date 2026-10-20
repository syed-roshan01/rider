package i7;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final u1 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER;
    private String configName_ = "";
    private com.google.crypto.tink.shaded.protobuf.e0 entry_ = com.google.crypto.tink.shaded.protobuf.h1.f3543d;

    static {
        u1 u1Var = new u1();
        DEFAULT_INSTANCE = u1Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(u1.class, u1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object j(int i10) {
        m0 m0Var = null;
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", e1.class});
            case 3:
                return new u1();
            case 4:
                return new n0(m0Var);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (u1.class) {
                        try {
                            a0Var = PARSER;
                            if (a0Var == null) {
                                a0Var = new com.google.crypto.tink.shaded.protobuf.a0();
                                PARSER = a0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return a0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
