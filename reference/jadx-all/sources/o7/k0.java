package o7;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final k0 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.b2 PARSER;
    private com.google.protobuf.n1 fields_ = com.google.protobuf.n1.f4184b;

    static {
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        com.google.protobuf.l0.registerDefaultInstance(k0.class, k0Var);
    }

    public static com.google.protobuf.n1 f(k0 k0Var) {
        com.google.protobuf.n1 n1Var = k0Var.fields_;
        if (!n1Var.f4185a) {
            k0Var.fields_ = n1Var.c();
        }
        return k0Var.fields_;
    }

    public static k0 g() {
        return DEFAULT_INSTANCE;
    }

    public static i0 l() {
        return (i0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", j0.f12635a});
            case 3:
                return new k0();
            case 4:
                return new i0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (k0.class) {
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

    public final int h() {
        return this.fields_.size();
    }

    public final Map i() {
        return Collections.unmodifiableMap(this.fields_);
    }

    public final i2 j(String str) {
        str.getClass();
        com.google.protobuf.n1 n1Var = this.fields_;
        if (n1Var.containsKey(str)) {
            return (i2) n1Var.get(str);
        }
        return null;
    }

    public final i2 k(String str) {
        str.getClass();
        com.google.protobuf.n1 n1Var = this.fields_;
        if (n1Var.containsKey(str)) {
            return (i2) n1Var.get(str);
        }
        throw new IllegalArgumentException();
    }
}
