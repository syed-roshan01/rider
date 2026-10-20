package i7;

/* JADX INFO: loaded from: classes.dex */
public final class p extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final p DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER;
    private int ivSize_;

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        com.google.crypto.tink.shaded.protobuf.b0.u(p.class, pVar);
    }

    public static o A() {
        return (o) DEFAULT_INSTANCE.i();
    }

    public static void x(p pVar) {
        pVar.ivSize_ = 16;
    }

    public static p y() {
        return DEFAULT_INSTANCE;
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new p();
            case 4:
                return new o(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (p.class) {
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

    public final int z() {
        return this.ivSize_;
    }
}
