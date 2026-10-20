package i7;

/* JADX INFO: loaded from: classes.dex */
public final class t extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final t DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER;
    private int keySize_;
    private v params_;

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        com.google.crypto.tink.shaded.protobuf.b0.u(t.class, tVar);
    }

    public static s B() {
        return (s) DEFAULT_INSTANCE.i();
    }

    public static t C(com.google.crypto.tink.shaded.protobuf.l lVar, com.google.crypto.tink.shaded.protobuf.t tVar) {
        return (t) com.google.crypto.tink.shaded.protobuf.b0.s(DEFAULT_INSTANCE, lVar, tVar);
    }

    public static void x(t tVar, v vVar) {
        tVar.getClass();
        tVar.params_ = vVar;
    }

    public static void y(t tVar, int i10) {
        tVar.keySize_ = i10;
    }

    public final v A() {
        v vVar = this.params_;
        return vVar == null ? v.y() : vVar;
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new t();
            case 4:
                return new s(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (t.class) {
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
