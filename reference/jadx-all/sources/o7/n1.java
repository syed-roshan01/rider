package o7;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
    private static final n1 DEFAULT_INSTANCE;
    public static final int FIELD_FILTER_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int UNARY_FILTER_FIELD_NUMBER = 3;
    private int filterTypeCase_ = 0;
    private Object filterType_;

    static {
        n1 n1Var = new n1();
        DEFAULT_INSTANCE = n1Var;
        com.google.protobuf.l0.registerDefaultInstance(n1.class, n1Var);
    }

    public static void f(n1 n1Var, i1 i1Var) {
        n1Var.getClass();
        i1Var.getClass();
        n1Var.filterType_ = i1Var;
        n1Var.filterTypeCase_ = 2;
    }

    public static void g(n1 n1Var, t1 t1Var) {
        n1Var.getClass();
        t1Var.getClass();
        n1Var.filterType_ = t1Var;
        n1Var.filterTypeCase_ = 3;
    }

    public static void h(n1 n1Var, e1 e1Var) {
        n1Var.getClass();
        e1Var.getClass();
        n1Var.filterType_ = e1Var;
        n1Var.filterTypeCase_ = 1;
    }

    public static n1 j() {
        return DEFAULT_INSTANCE;
    }

    public static l1 n() {
        return (l1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", e1.class, i1.class, t1.class});
            case 3:
                return new n1();
            case 4:
                return new l1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (n1.class) {
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

    public final e1 i() {
        return this.filterTypeCase_ == 1 ? (e1) this.filterType_ : e1.h();
    }

    public final i1 k() {
        return this.filterTypeCase_ == 2 ? (i1) this.filterType_ : i1.i();
    }

    public final m1 l() {
        int i10 = this.filterTypeCase_;
        if (i10 == 0) {
            return m1.f12645d;
        }
        if (i10 == 1) {
            return m1.f12642a;
        }
        if (i10 == 2) {
            return m1.f12643b;
        }
        if (i10 != 3) {
            return null;
        }
        return m1.f12644c;
    }

    public final t1 m() {
        return this.filterTypeCase_ == 3 ? (t1) this.filterType_ : t1.h();
    }
}
