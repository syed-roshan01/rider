package o7;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final u1 DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private p endAt_;
    private com.google.protobuf.n0 limit_;
    private int offset_;
    private q1 select_;
    private p startAt_;
    private n1 where_;
    private com.google.protobuf.x0 from_ = com.google.protobuf.l0.emptyProtobufList();
    private com.google.protobuf.x0 orderBy_ = com.google.protobuf.l0.emptyProtobufList();

    static {
        u1 u1Var = new u1();
        DEFAULT_INSTANCE = u1Var;
        com.google.protobuf.l0.registerDefaultInstance(u1.class, u1Var);
    }

    public static void f(u1 u1Var, b1 b1Var) {
        u1Var.getClass();
        b1Var.getClass();
        com.google.protobuf.x0 x0Var = u1Var.from_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            u1Var.from_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        u1Var.from_.add(b1Var);
    }

    public static void g(u1 u1Var, n1 n1Var) {
        u1Var.getClass();
        n1Var.getClass();
        u1Var.where_ = n1Var;
    }

    public static void h(u1 u1Var, p1 p1Var) {
        u1Var.getClass();
        p1Var.getClass();
        com.google.protobuf.x0 x0Var = u1Var.orderBy_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            u1Var.orderBy_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        u1Var.orderBy_.add(p1Var);
    }

    public static void i(u1 u1Var, p pVar) {
        u1Var.getClass();
        pVar.getClass();
        u1Var.startAt_ = pVar;
    }

    public static void j(u1 u1Var, p pVar) {
        u1Var.getClass();
        pVar.getClass();
        u1Var.endAt_ = pVar;
    }

    public static void k(u1 u1Var, com.google.protobuf.n0 n0Var) {
        u1Var.getClass();
        n0Var.getClass();
        u1Var.limit_ = n0Var;
    }

    public static u1 l() {
        return DEFAULT_INSTANCE;
    }

    public static z0 y() {
        return (z0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\b\t", new Object[]{"select_", "from_", b1.class, "where_", "orderBy_", p1.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 3:
                return new u1();
            case 4:
                return new z0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (u1.class) {
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

    public final p m() {
        p pVar = this.endAt_;
        return pVar == null ? p.i() : pVar;
    }

    public final b1 n() {
        return (b1) this.from_.get(0);
    }

    public final int o() {
        return this.from_.size();
    }

    public final com.google.protobuf.n0 p() {
        com.google.protobuf.n0 n0Var = this.limit_;
        return n0Var == null ? com.google.protobuf.n0.g() : n0Var;
    }

    public final p1 q(int i10) {
        return (p1) this.orderBy_.get(i10);
    }

    public final int r() {
        return this.orderBy_.size();
    }

    public final p s() {
        p pVar = this.startAt_;
        return pVar == null ? p.i() : pVar;
    }

    public final n1 t() {
        n1 n1Var = this.where_;
        return n1Var == null ? n1.j() : n1Var;
    }

    public final boolean u() {
        return this.endAt_ != null;
    }

    public final boolean v() {
        return this.limit_ != null;
    }

    public final boolean w() {
        return this.startAt_ != null;
    }

    public final boolean x() {
        return this.where_ != null;
    }
}
