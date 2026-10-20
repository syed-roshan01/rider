package i7;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final d DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER;
    private int keySize_;
    private f params_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        com.google.crypto.tink.shaded.protobuf.b0.u(d.class, dVar);
    }

    public static c B() {
        return (c) DEFAULT_INSTANCE.i();
    }

    public static d C(com.google.crypto.tink.shaded.protobuf.l lVar, com.google.crypto.tink.shaded.protobuf.t tVar) {
        return (d) com.google.crypto.tink.shaded.protobuf.b0.s(DEFAULT_INSTANCE, lVar, tVar);
    }

    public static void x(d dVar) {
        dVar.keySize_ = 32;
    }

    public static void y(d dVar, f fVar) {
        dVar.getClass();
        dVar.params_ = fVar;
    }

    public final f A() {
        f fVar = this.params_;
        return fVar == null ? f.y() : fVar;
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new d();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (d.class) {
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
        return this.keySize_;
    }
}
