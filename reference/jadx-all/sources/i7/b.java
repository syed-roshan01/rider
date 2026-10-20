package i7;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.l keyValue_ = com.google.crypto.tink.shaded.protobuf.l.f3571b;
    private f params_;
    private int version_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        com.google.crypto.tink.shaded.protobuf.b0.u(b.class, bVar);
    }

    public static a D() {
        return (a) DEFAULT_INSTANCE.i();
    }

    public static b E(com.google.crypto.tink.shaded.protobuf.l lVar, com.google.crypto.tink.shaded.protobuf.t tVar) {
        return (b) com.google.crypto.tink.shaded.protobuf.b0.s(DEFAULT_INSTANCE, lVar, tVar);
    }

    public static void x(b bVar) {
        bVar.version_ = 0;
    }

    public static void y(b bVar, com.google.crypto.tink.shaded.protobuf.k kVar) {
        bVar.getClass();
        bVar.keyValue_ = kVar;
    }

    public static void z(b bVar, f fVar) {
        bVar.getClass();
        fVar.getClass();
        bVar.params_ = fVar;
    }

    public final com.google.crypto.tink.shaded.protobuf.l A() {
        return this.keyValue_;
    }

    public final f B() {
        f fVar = this.params_;
        return fVar == null ? f.y() : fVar;
    }

    public final int C() {
        return this.version_;
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new b();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (b.class) {
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
