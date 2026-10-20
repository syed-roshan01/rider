package o7;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final i1 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    public static final int OP_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 3;
    private k1 field_;
    private int op_;
    private i2 value_;

    static {
        i1 i1Var = new i1();
        DEFAULT_INSTANCE = i1Var;
        com.google.protobuf.l0.registerDefaultInstance(i1.class, i1Var);
    }

    public static void f(i1 i1Var, k1 k1Var) {
        i1Var.getClass();
        k1Var.getClass();
        i1Var.field_ = k1Var;
    }

    public static void g(i1 i1Var, h1 h1Var) {
        i1Var.getClass();
        i1Var.op_ = h1Var.getNumber();
    }

    public static void h(i1 i1Var, i2 i2Var) {
        i1Var.getClass();
        i2Var.getClass();
        i1Var.value_ = i2Var;
    }

    public static i1 i() {
        return DEFAULT_INSTANCE;
    }

    public static g1 m() {
        return (g1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"field_", "op_", "value_"});
            case 3:
                return new i1();
            case 4:
                return new g1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (i1.class) {
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

    public final k1 j() {
        k1 k1Var = this.field_;
        return k1Var == null ? k1.g() : k1Var;
    }

    public final h1 k() {
        h1 h1VarA = h1.a(this.op_);
        return h1VarA == null ? h1.UNRECOGNIZED : h1VarA;
    }

    public final i2 l() {
        i2 i2Var = this.value_;
        return i2Var == null ? i2.t() : i2Var;
    }
}
