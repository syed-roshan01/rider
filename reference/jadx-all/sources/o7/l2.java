package o7;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends com.google.protobuf.l0 implements m2 {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final l2 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private m0 currentDocument_;
    private Object operation_;
    private w updateMask_;
    private int operationCase_ = 0;
    private com.google.protobuf.x0 updateTransforms_ = com.google.protobuf.l0.emptyProtobufList();

    static {
        l2 l2Var = new l2();
        DEFAULT_INSTANCE = l2Var;
        com.google.protobuf.l0.registerDefaultInstance(l2.class, l2Var);
    }

    public static void f(l2 l2Var, w wVar) {
        l2Var.getClass();
        wVar.getClass();
        l2Var.updateMask_ = wVar;
    }

    public static void g(l2 l2Var, a0 a0Var) {
        l2Var.getClass();
        a0Var.getClass();
        com.google.protobuf.x0 x0Var = l2Var.updateTransforms_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            l2Var.updateTransforms_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        l2Var.updateTransforms_.add(a0Var);
    }

    public static void h(l2 l2Var, s sVar) {
        l2Var.getClass();
        sVar.getClass();
        l2Var.operation_ = sVar;
        l2Var.operationCase_ = 1;
    }

    public static void i(l2 l2Var, m0 m0Var) {
        l2Var.getClass();
        m0Var.getClass();
        l2Var.currentDocument_ = m0Var;
    }

    public static void j(l2 l2Var, String str) {
        l2Var.getClass();
        str.getClass();
        l2Var.operationCase_ = 2;
        l2Var.operation_ = str;
    }

    public static void k(l2 l2Var, String str) {
        l2Var.getClass();
        str.getClass();
        l2Var.operationCase_ = 5;
        l2Var.operation_ = str;
    }

    public static j2 x() {
        return (j2) DEFAULT_INSTANCE.createBuilder();
    }

    public static j2 y(l2 l2Var) {
        return (j2) DEFAULT_INSTANCE.createBuilder(l2Var);
    }

    public static l2 z(byte[] bArr) {
        return (l2) com.google.protobuf.l0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\t\u0004\t\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", s.class, "updateMask_", "currentDocument_", b0.class, "updateTransforms_", a0.class});
            case 3:
                return new l2();
            case 4:
                return new j2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (l2.class) {
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

    public final m0 l() {
        m0 m0Var = this.currentDocument_;
        return m0Var == null ? m0.i() : m0Var;
    }

    public final String m() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    public final k2 n() {
        int i10 = this.operationCase_;
        if (i10 == 0) {
            return k2.f12640e;
        }
        if (i10 == 1) {
            return k2.f12636a;
        }
        if (i10 == 2) {
            return k2.f12637b;
        }
        if (i10 == 5) {
            return k2.f12638c;
        }
        if (i10 != 6) {
            return null;
        }
        return k2.f12639d;
    }

    public final b0 o() {
        return this.operationCase_ == 6 ? (b0) this.operation_ : b0.g();
    }

    public final s p() {
        return this.operationCase_ == 1 ? (s) this.operation_ : s.i();
    }

    public final w q() {
        w wVar = this.updateMask_;
        return wVar == null ? w.g() : wVar;
    }

    public final com.google.protobuf.x0 r() {
        return this.updateTransforms_;
    }

    public final String s() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    public final boolean t() {
        return this.currentDocument_ != null;
    }

    public final boolean u() {
        return this.operationCase_ == 6;
    }

    public final boolean v() {
        return this.operationCase_ == 1;
    }

    public final boolean w() {
        return this.updateMask_ != null;
    }
}
