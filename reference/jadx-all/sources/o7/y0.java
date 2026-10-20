package o7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final y0 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private com.google.protobuf.x0 aggregations_ = com.google.protobuf.l0.emptyProtobufList();

    static {
        y0 y0Var = new y0();
        DEFAULT_INSTANCE = y0Var;
        com.google.protobuf.l0.registerDefaultInstance(y0.class, y0Var);
    }

    public static void f(y0 y0Var, u1 u1Var) {
        y0Var.getClass();
        u1Var.getClass();
        y0Var.queryType_ = u1Var;
        y0Var.queryTypeCase_ = 1;
    }

    public static void g(y0 y0Var, ArrayList arrayList) {
        com.google.protobuf.x0 x0Var = y0Var.aggregations_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            y0Var.aggregations_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        com.google.protobuf.c.addAll((Iterable) arrayList, (List) y0Var.aggregations_);
    }

    public static x0 h() {
        return (x0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", u1.class, "aggregations_", w0.class});
            case 3:
                return new y0();
            case 4:
                return new x0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (y0.class) {
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
}
