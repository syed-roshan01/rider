package i7;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final h1 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private a1 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        h1 h1Var = new h1();
        DEFAULT_INSTANCE = h1Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(h1.class, h1Var);
    }

    public static void A(h1 h1Var, int i10) {
        h1Var.keyId_ = i10;
    }

    public static g1 G() {
        return (g1) DEFAULT_INSTANCE.i();
    }

    public static void x(h1 h1Var, a1 a1Var) {
        h1Var.getClass();
        h1Var.keyData_ = a1Var;
    }

    public static void y(h1 h1Var, t1 t1Var) {
        h1Var.getClass();
        h1Var.outputPrefixType_ = t1Var.b();
    }

    public static void z(h1 h1Var) {
        b1 b1Var = b1.ENABLED;
        h1Var.getClass();
        h1Var.status_ = b1Var.a();
    }

    public final a1 B() {
        a1 a1Var = this.keyData_;
        return a1Var == null ? a1.A() : a1Var;
    }

    public final int C() {
        return this.keyId_;
    }

    public final t1 D() {
        t1 t1VarA = t1.a(this.outputPrefixType_);
        return t1VarA == null ? t1.UNRECOGNIZED : t1VarA;
    }

    public final b1 E() {
        b1 b1Var;
        int i10 = this.status_;
        if (i10 == 0) {
            b1Var = b1.UNKNOWN_STATUS;
        } else if (i10 == 1) {
            b1Var = b1.ENABLED;
        } else if (i10 != 2) {
            b1Var = i10 != 3 ? null : b1.DESTROYED;
        } else {
            b1Var = b1.DISABLED;
        }
        return b1Var == null ? b1.UNRECOGNIZED : b1Var;
    }

    public final boolean F() {
        return this.keyData_ != null;
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new h1();
            case 4:
                return new g1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (h1.class) {
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
