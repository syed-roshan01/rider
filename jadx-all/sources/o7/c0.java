package o7;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final c0 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    public static final int UNCHANGED_NAMES_FIELD_NUMBER = 3;
    private int count_;
    private int targetId_;
    private k unchangedNames_;

    static {
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        com.google.protobuf.l0.registerDefaultInstance(c0.class, c0Var);
    }

    public static c0 h() {
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
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\t", new Object[]{"targetId_", "count_", "unchangedNames_"});
            case 3:
                return new c0();
            case 4:
                return new b(9);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (c0.class) {
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

    public final int g() {
        return this.count_;
    }

    public final int getTargetId() {
        return this.targetId_;
    }

    public final k i() {
        k kVar = this.unchangedNames_;
        return kVar == null ? k.h() : kVar;
    }
}
