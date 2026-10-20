package i7;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final s1 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER;
    private d1 dekTemplate_;
    private String kekUri_ = "";

    static {
        s1 s1Var = new s1();
        DEFAULT_INSTANCE = s1Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(s1.class, s1Var);
    }

    public static s1 C(com.google.crypto.tink.shaded.protobuf.l lVar, com.google.crypto.tink.shaded.protobuf.t tVar) {
        return (s1) com.google.crypto.tink.shaded.protobuf.b0.s(DEFAULT_INSTANCE, lVar, tVar);
    }

    public static s1 y() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.kekUri_;
    }

    public final boolean B() {
        return this.dekTemplate_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object j(int i10) {
        k0 k0Var = null;
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new s1();
            case 4:
                return new n0(k0Var);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (s1.class) {
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

    public final d1 z() {
        d1 d1Var = this.dekTemplate_;
        return d1Var == null ? d1.A() : d1Var;
    }
}
