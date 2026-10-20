package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends l0 implements u1 {
    private static final n0 DEFAULT_INSTANCE;
    private static volatile b2 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        l0.registerDefaultInstance(n0.class, n0Var);
    }

    public static void f(n0 n0Var, int i10) {
        n0Var.value_ = i10;
    }

    public static n0 g() {
        return DEFAULT_INSTANCE;
    }

    public static m0 i() {
        return (m0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 3:
                return new n0();
            case 4:
                return new m0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (n0.class) {
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

    public final int h() {
        return this.value_;
    }
}
