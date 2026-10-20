package i7;

/* JADX INFO: loaded from: classes.dex */
public final class f extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final f DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        com.google.crypto.tink.shaded.protobuf.b0.u(f.class, fVar);
    }

    public static e A() {
        return (e) DEFAULT_INSTANCE.i();
    }

    public static void x(f fVar) {
        fVar.tagSize_ = 16;
    }

    public static f y() {
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new f();
            case 4:
                return new e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (f.class) {
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
        return this.tagSize_;
    }
}
