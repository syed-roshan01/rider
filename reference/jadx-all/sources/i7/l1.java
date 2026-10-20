package i7;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final l1 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        l1 l1Var = new l1();
        DEFAULT_INSTANCE = l1Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(l1.class, l1Var);
    }

    public static void A(l1 l1Var, int i10) {
        l1Var.keyId_ = i10;
    }

    public static k1 C() {
        return (k1) DEFAULT_INSTANCE.i();
    }

    public static void x(l1 l1Var, String str) {
        l1Var.getClass();
        str.getClass();
        l1Var.typeUrl_ = str;
    }

    public static void y(l1 l1Var, t1 t1Var) {
        l1Var.getClass();
        l1Var.outputPrefixType_ = t1Var.b();
    }

    public static void z(l1 l1Var, b1 b1Var) {
        l1Var.getClass();
        l1Var.status_ = b1Var.a();
    }

    public final int B() {
        return this.keyId_;
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new l1();
            case 4:
                return new k1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (l1.class) {
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
