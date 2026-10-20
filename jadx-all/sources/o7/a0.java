package o7;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
    private static final a0 DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int INCREMENT_FIELD_NUMBER = 3;
    public static final int MAXIMUM_FIELD_NUMBER = 4;
    public static final int MINIMUM_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
    public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
    private Object transformType_;
    private int transformTypeCase_ = 0;
    private String fieldPath_ = "";

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        com.google.protobuf.l0.registerDefaultInstance(a0.class, a0Var);
    }

    public static void f(a0 a0Var, e eVar) {
        a0Var.getClass();
        eVar.getClass();
        a0Var.transformType_ = eVar;
        a0Var.transformTypeCase_ = 6;
    }

    public static void g(a0 a0Var, String str) {
        a0Var.getClass();
        str.getClass();
        a0Var.fieldPath_ = str;
    }

    public static void h(a0 a0Var, e eVar) {
        a0Var.getClass();
        eVar.getClass();
        a0Var.transformType_ = eVar;
        a0Var.transformTypeCase_ = 7;
    }

    public static void i(a0 a0Var) {
        z zVar = z.REQUEST_TIME;
        a0Var.getClass();
        a0Var.transformType_ = Integer.valueOf(zVar.getNumber());
        a0Var.transformTypeCase_ = 2;
    }

    public static void j(a0 a0Var, i2 i2Var) {
        a0Var.getClass();
        i2Var.getClass();
        a0Var.transformType_ = i2Var;
        a0Var.transformTypeCase_ = 3;
    }

    public static y q() {
        return (y) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", i2.class, i2.class, i2.class, e.class, e.class});
            case 3:
                return new a0();
            case 4:
                return new y(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (a0.class) {
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

    public final e k() {
        return this.transformTypeCase_ == 6 ? (e) this.transformType_ : e.i();
    }

    public final String l() {
        return this.fieldPath_;
    }

    public final i2 m() {
        return this.transformTypeCase_ == 3 ? (i2) this.transformType_ : i2.t();
    }

    public final e n() {
        return this.transformTypeCase_ == 7 ? (e) this.transformType_ : e.i();
    }

    public final z o() {
        int i10 = this.transformTypeCase_;
        z zVar = z.SERVER_VALUE_UNSPECIFIED;
        if (i10 != 2) {
            return zVar;
        }
        int iIntValue = ((Integer) this.transformType_).intValue();
        if (iIntValue != 0) {
            zVar = iIntValue != 1 ? null : z.REQUEST_TIME;
        }
        return zVar == null ? z.UNRECOGNIZED : zVar;
    }

    public final int p() {
        int i10 = this.transformTypeCase_;
        if (i10 == 0) {
            return 7;
        }
        switch (i10) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                return 0;
        }
    }
}
