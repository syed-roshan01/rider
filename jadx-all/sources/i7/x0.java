package i7;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final x0 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        x0 x0Var = new x0();
        DEFAULT_INSTANCE = x0Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(x0.class, x0Var);
    }

    public static w0 C() {
        return (w0) DEFAULT_INSTANCE.i();
    }

    public static void x(x0 x0Var, r0 r0Var) {
        x0Var.getClass();
        x0Var.hash_ = r0Var.b();
    }

    public static void y(x0 x0Var, int i10) {
        x0Var.tagSize_ = i10;
    }

    public static x0 z() {
        return DEFAULT_INSTANCE;
    }

    public final r0 A() {
        r0 r0VarA = r0.a(this.hash_);
        return r0VarA == null ? r0.UNRECOGNIZED : r0VarA;
    }

    public final int B() {
        return this.tagSize_;
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new x0();
            case 4:
                return new w0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (x0.class) {
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
