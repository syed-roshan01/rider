package i7;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final o0 DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER;

    static {
        o0 o0Var = new o0();
        DEFAULT_INSTANCE = o0Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(o0.class, o0Var);
    }

    public static o0 y() {
        return DEFAULT_INSTANCE;
    }

    public static o0 z(com.google.crypto.tink.shaded.protobuf.l lVar, com.google.crypto.tink.shaded.protobuf.t tVar) {
        return (o0) com.google.crypto.tink.shaded.protobuf.b0.s(DEFAULT_INSTANCE, lVar, tVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object j(int i10) {
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new o0();
            case 4:
                return new n0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (o0.class) {
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
