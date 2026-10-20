package o7;

/* JADX INFO: loaded from: classes.dex */
public final class k extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.b2 PARSER;
    private j bits_;
    private int hashCount_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        com.google.protobuf.l0.registerDefaultInstance(k.class, kVar);
    }

    public static k h() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0004", new Object[]{"bits_", "hashCount_"});
            case 3:
                return new k();
            case 4:
                return new b(3);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (k.class) {
                        try {
                            h0Var = PARSER;
                            if (h0Var == null) {
                                h0Var = new com.google.protobuf.h0(DEFAULT_INSTANCE);
                                PARSER = h0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return h0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final j g() {
        j jVar = this.bits_;
        return jVar == null ? j.h() : jVar;
    }

    public final int i() {
        return this.hashCount_;
    }

    public final boolean j() {
        return this.bits_ != null;
    }
}
