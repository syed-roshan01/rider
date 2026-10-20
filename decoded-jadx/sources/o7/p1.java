package o7;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final p1 DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 2;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.b2 PARSER;
    private int direction_;
    private k1 field_;

    static {
        p1 p1Var = new p1();
        DEFAULT_INSTANCE = p1Var;
        com.google.protobuf.l0.registerDefaultInstance(p1.class, p1Var);
    }

    public static void f(p1 p1Var, k1 k1Var) {
        p1Var.getClass();
        k1Var.getClass();
        p1Var.field_ = k1Var;
    }

    public static void g(p1 p1Var, f1 f1Var) {
        p1Var.getClass();
        p1Var.direction_ = f1Var.getNumber();
    }

    public static o1 j() {
        return (o1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"field_", "direction_"});
            case 3:
                return new p1();
            case 4:
                return new o1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (p1.class) {
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

    public final f1 h() {
        f1 f1Var;
        int i10 = this.direction_;
        if (i10 == 0) {
            f1Var = f1.DIRECTION_UNSPECIFIED;
        } else if (i10 != 1) {
            f1Var = i10 != 2 ? null : f1.DESCENDING;
        } else {
            f1Var = f1.ASCENDING;
        }
        return f1Var == null ? f1.UNRECOGNIZED : f1Var;
    }

    public final k1 i() {
        k1 k1Var = this.field_;
        return k1Var == null ? k1.g() : k1Var;
    }
}
