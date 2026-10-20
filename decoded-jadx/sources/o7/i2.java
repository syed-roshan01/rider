package o7;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final i2 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static {
        i2 i2Var = new i2();
        DEFAULT_INSTANCE = i2Var;
        com.google.protobuf.l0.registerDefaultInstance(i2.class, i2Var);
    }

    public static g2 C() {
        return (g2) DEFAULT_INSTANCE.createBuilder();
    }

    public static void f(i2 i2Var, com.google.protobuf.q2 q2Var) {
        i2Var.getClass();
        q2Var.getClass();
        i2Var.valueType_ = q2Var;
        i2Var.valueTypeCase_ = 10;
    }

    public static void g(i2 i2Var, String str) {
        i2Var.getClass();
        str.getClass();
        i2Var.valueTypeCase_ = 17;
        i2Var.valueType_ = str;
    }

    public static void h(i2 i2Var, com.google.protobuf.n nVar) {
        i2Var.getClass();
        nVar.getClass();
        i2Var.valueTypeCase_ = 18;
        i2Var.valueType_ = nVar;
    }

    public static void i(i2 i2Var, String str) {
        i2Var.getClass();
        str.getClass();
        i2Var.valueTypeCase_ = 5;
        i2Var.valueType_ = str;
    }

    public static void j(i2 i2Var, x7.b bVar) {
        i2Var.getClass();
        bVar.getClass();
        i2Var.valueType_ = bVar;
        i2Var.valueTypeCase_ = 8;
    }

    public static void k(e eVar, i2 i2Var) {
        i2Var.getClass();
        eVar.getClass();
        i2Var.valueType_ = eVar;
        i2Var.valueTypeCase_ = 9;
    }

    public static void l(i2 i2Var, k0 k0Var) {
        i2Var.getClass();
        k0Var.getClass();
        i2Var.valueType_ = k0Var;
        i2Var.valueTypeCase_ = 6;
    }

    public static void m(i2 i2Var) {
        com.google.protobuf.a2 a2Var = com.google.protobuf.a2.NULL_VALUE;
        i2Var.getClass();
        i2Var.valueType_ = Integer.valueOf(a2Var.getNumber());
        i2Var.valueTypeCase_ = 11;
    }

    public static void n(i2 i2Var, boolean z10) {
        i2Var.valueTypeCase_ = 1;
        i2Var.valueType_ = Boolean.valueOf(z10);
    }

    public static void o(i2 i2Var, long j10) {
        i2Var.valueTypeCase_ = 2;
        i2Var.valueType_ = Long.valueOf(j10);
    }

    public static void p(i2 i2Var, double d10) {
        i2Var.valueTypeCase_ = 3;
        i2Var.valueType_ = Double.valueOf(d10);
    }

    public static i2 t() {
        return DEFAULT_INSTANCE;
    }

    public final com.google.protobuf.q2 A() {
        return this.valueTypeCase_ == 10 ? (com.google.protobuf.q2) this.valueType_ : com.google.protobuf.q2.h();
    }

    public final h2 B() {
        int i10 = this.valueTypeCase_;
        if (i10 == 0) {
            return h2.f12633s;
        }
        if (i10 == 1) {
            return h2.f12623b;
        }
        if (i10 == 2) {
            return h2.f12624c;
        }
        if (i10 == 3) {
            return h2.f12625d;
        }
        if (i10 == 5) {
            return h2.f12629o;
        }
        if (i10 == 6) {
            return h2.f12632r;
        }
        if (i10 == 17) {
            return h2.f12627f;
        }
        if (i10 == 18) {
            return h2.f12628n;
        }
        switch (i10) {
            case 8:
                return h2.f12630p;
            case 9:
                return h2.f12631q;
            case 10:
                return h2.f12626e;
            case 11:
                return h2.f12622a;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005\u023b\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011\u023b\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", k0.class, x7.b.class, e.class, com.google.protobuf.q2.class});
            case 3:
                return new i2();
            case 4:
                return new g2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (i2.class) {
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

    public final e q() {
        return this.valueTypeCase_ == 9 ? (e) this.valueType_ : e.i();
    }

    public final boolean r() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public final com.google.protobuf.n s() {
        return this.valueTypeCase_ == 18 ? (com.google.protobuf.n) this.valueType_ : com.google.protobuf.n.f4181b;
    }

    public final double u() {
        return this.valueTypeCase_ == 3 ? ((Double) this.valueType_).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public final x7.b v() {
        return this.valueTypeCase_ == 8 ? (x7.b) this.valueType_ : x7.b.h();
    }

    public final long w() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public final k0 x() {
        return this.valueTypeCase_ == 6 ? (k0) this.valueType_ : k0.g();
    }

    public final String y() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    public final String z() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }
}
