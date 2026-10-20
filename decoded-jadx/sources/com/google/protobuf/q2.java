package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends l0 implements u1 {
    private static final q2 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile b2 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        q2 q2Var = new q2();
        DEFAULT_INSTANCE = q2Var;
        l0.registerDefaultInstance(q2.class, q2Var);
    }

    public static void f(q2 q2Var, long j10) {
        q2Var.seconds_ = j10;
    }

    public static void g(q2 q2Var, int i10) {
        q2Var.nanos_ = i10;
    }

    public static q2 h() {
        return DEFAULT_INSTANCE;
    }

    public static p2 k() {
        return (p2) DEFAULT_INSTANCE.createBuilder();
    }

    public static p2 l(q2 q2Var) {
        return (p2) DEFAULT_INSTANCE.createBuilder(q2Var);
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 3:
                return new q2();
            case 4:
                return new p2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (q2.class) {
                        try {
                            h0Var = PARSER;
                            if (h0Var == null) {
                                h0Var = new h0(DEFAULT_INSTANCE);
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

    public final int i() {
        return this.nanos_;
    }

    public final long j() {
        return this.seconds_;
    }
}
