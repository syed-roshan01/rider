package o7;

/* JADX INFO: loaded from: classes.dex */
public final class j extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int BITMAP_FIELD_NUMBER = 1;
    private static final j DEFAULT_INSTANCE;
    public static final int PADDING_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.b2 PARSER;
    private com.google.protobuf.n bitmap_ = com.google.protobuf.n.f4181b;
    private int padding_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        com.google.protobuf.l0.registerDefaultInstance(j.class, jVar);
    }

    public static j h() {
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
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"bitmap_", "padding_"});
            case 3:
                return new j();
            case 4:
                return new b(2);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (j.class) {
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

    public final com.google.protobuf.n g() {
        return this.bitmap_;
    }

    public final int i() {
        return this.padding_;
    }
}
