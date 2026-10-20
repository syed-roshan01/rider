package o7;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final b1 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.b2 PARSER;
    private boolean allDescendants_;
    private String collectionId_ = "";

    static {
        b1 b1Var = new b1();
        DEFAULT_INSTANCE = b1Var;
        com.google.protobuf.l0.registerDefaultInstance(b1.class, b1Var);
    }

    public static void f(b1 b1Var, String str) {
        b1Var.getClass();
        str.getClass();
        b1Var.collectionId_ = str;
    }

    public static void g(b1 b1Var) {
        b1Var.allDescendants_ = true;
    }

    public static a1 j() {
        return (a1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0208\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
            case 3:
                return new b1();
            case 4:
                return new a1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (b1.class) {
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

    public final boolean h() {
        return this.allDescendants_;
    }

    public final String i() {
        return this.collectionId_;
    }
}
