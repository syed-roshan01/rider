package o7;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final h0 DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    static {
        h0 h0Var = new h0();
        DEFAULT_INSTANCE = h0Var;
        com.google.protobuf.l0.registerDefaultInstance(h0.class, h0Var);
    }

    public static h0 g() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", c2.class, t.class, u.class, c0.class, x.class});
            case 3:
                return new h0();
            case 4:
                return new b(10);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (h0.class) {
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

    public final t h() {
        return this.responseTypeCase_ == 3 ? (t) this.responseType_ : t.g();
    }

    public final u i() {
        return this.responseTypeCase_ == 4 ? (u) this.responseType_ : u.g();
    }

    public final x j() {
        return this.responseTypeCase_ == 6 ? (x) this.responseType_ : x.g();
    }

    public final c0 k() {
        return this.responseTypeCase_ == 5 ? (c0) this.responseType_ : c0.h();
    }

    public final int l() {
        int i10 = this.responseTypeCase_;
        if (i10 == 0) {
            return 6;
        }
        int i11 = 2;
        if (i10 == 2) {
            return 1;
        }
        int i12 = 3;
        if (i10 != 3) {
            i11 = 4;
            if (i10 != 4) {
                i12 = 5;
                if (i10 != 5) {
                    if (i10 != 6) {
                        return 0;
                    }
                }
            }
            return i12;
        }
        return i11;
    }

    public final c2 m() {
        return this.responseTypeCase_ == 2 ? (c2) this.responseType_ : c2.h();
    }
}
