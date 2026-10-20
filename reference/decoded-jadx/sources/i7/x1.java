package i7;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final x1 DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        x1 x1Var = new x1();
        DEFAULT_INSTANCE = x1Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(x1.class, x1Var);
    }

    public static x1 y() {
        return DEFAULT_INSTANCE;
    }

    public static x1 z(com.google.crypto.tink.shaded.protobuf.l lVar, com.google.crypto.tink.shaded.protobuf.t tVar) {
        return (x1) com.google.crypto.tink.shaded.protobuf.b0.s(DEFAULT_INSTANCE, lVar, tVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object j(int i10) {
        l0 l0Var = null;
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 3:
                return new x1();
            case 4:
                return new n0(l0Var);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (x1.class) {
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
