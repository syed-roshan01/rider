package o7;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final p DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private com.google.protobuf.x0 values_ = com.google.protobuf.l0.emptyProtobufList();

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        com.google.protobuf.l0.registerDefaultInstance(p.class, pVar);
    }

    public static void f(p pVar, List list) {
        com.google.protobuf.x0 x0Var = pVar.values_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            pVar.values_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        com.google.protobuf.c.addAll((Iterable) list, (List) pVar.values_);
    }

    public static void g(p pVar, boolean z10) {
        pVar.before_ = z10;
    }

    public static p i() {
        return DEFAULT_INSTANCE;
    }

    public static o j() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public final List a() {
        return this.values_;
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", i2.class, "before_"});
            case 3:
                return new p();
            case 4:
                return new o(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (p.class) {
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
        return this.before_;
    }
}
