package o7;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.protobuf.l0 implements f {
    private static final e DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private com.google.protobuf.x0 values_ = com.google.protobuf.l0.emptyProtobufList();

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        com.google.protobuf.l0.registerDefaultInstance(e.class, eVar);
    }

    public static void f(e eVar, i2 i2Var) {
        eVar.getClass();
        i2Var.getClass();
        com.google.protobuf.x0 x0Var = eVar.values_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            eVar.values_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        eVar.values_.add(i2Var);
    }

    public static void g(e eVar, List list) {
        com.google.protobuf.x0 x0Var = eVar.values_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            eVar.values_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        com.google.protobuf.c.addAll((Iterable) list, (List) eVar.values_);
    }

    public static void h(e eVar, int i10) {
        com.google.protobuf.x0 x0Var = eVar.values_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            eVar.values_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        eVar.values_.remove(i10);
    }

    public static e i() {
        return DEFAULT_INSTANCE;
    }

    public static d l() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // o7.f
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
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", i2.class});
            case 3:
                return new e();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (e.class) {
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

    public final i2 j(int i10) {
        return (i2) this.values_.get(i10);
    }

    public final int k() {
        return this.values_.size();
    }
}
