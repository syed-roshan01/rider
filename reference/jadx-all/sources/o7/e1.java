package o7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final e1 DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.b2 PARSER;
    private com.google.protobuf.x0 filters_ = com.google.protobuf.l0.emptyProtobufList();
    private int op_;

    static {
        e1 e1Var = new e1();
        DEFAULT_INSTANCE = e1Var;
        com.google.protobuf.l0.registerDefaultInstance(e1.class, e1Var);
    }

    public static void f(e1 e1Var, d1 d1Var) {
        e1Var.getClass();
        e1Var.op_ = d1Var.getNumber();
    }

    public static void g(e1 e1Var, ArrayList arrayList) {
        com.google.protobuf.x0 x0Var = e1Var.filters_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            e1Var.filters_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        com.google.protobuf.c.addAll((Iterable) arrayList, (List) e1Var.filters_);
    }

    public static e1 h() {
        return DEFAULT_INSTANCE;
    }

    public static c1 k() {
        return (c1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", n1.class});
            case 3:
                return new e1();
            case 4:
                return new c1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (e1.class) {
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

    public final com.google.protobuf.x0 i() {
        return this.filters_;
    }

    public final d1 j() {
        d1 d1Var;
        int i10 = this.op_;
        if (i10 == 0) {
            d1Var = d1.OPERATOR_UNSPECIFIED;
        } else if (i10 != 1) {
            d1Var = i10 != 2 ? null : d1.OR;
        } else {
            d1Var = d1.AND;
        }
        return d1Var == null ? d1.UNRECOGNIZED : d1Var;
    }
}
