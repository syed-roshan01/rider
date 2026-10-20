package i7;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final m1 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.e1 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.e0 keyInfo_ = com.google.crypto.tink.shaded.protobuf.h1.f3543d;
    private int primaryKeyId_;

    static {
        m1 m1Var = new m1();
        DEFAULT_INSTANCE = m1Var;
        com.google.crypto.tink.shaded.protobuf.b0.u(m1.class, m1Var);
    }

    public static j1 A() {
        return (j1) DEFAULT_INSTANCE.i();
    }

    public static void x(m1 m1Var, int i10) {
        m1Var.primaryKeyId_ = i10;
    }

    public static void y(m1 m1Var, l1 l1Var) {
        m1Var.getClass();
        com.google.crypto.tink.shaded.protobuf.e0 e0Var = m1Var.keyInfo_;
        if (!((com.google.crypto.tink.shaded.protobuf.c) e0Var).f3525a) {
            int size = e0Var.size();
            m1Var.keyInfo_ = e0Var.a(size == 0 ? 10 : size * 2);
        }
        m1Var.keyInfo_.add(l1Var);
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
                return new com.google.crypto.tink.shaded.protobuf.i1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", l1.class});
            case 3:
                return new m1();
            case 4:
                return new j1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.e1 a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (m1.class) {
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

    public final l1 z() {
        return (l1) this.keyInfo_.get(0);
    }
}
