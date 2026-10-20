package o7;

/* JADX INFO: loaded from: classes.dex */
public final class w extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    private static final w DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.b2 PARSER;
    private com.google.protobuf.x0 fieldPaths_ = com.google.protobuf.l0.emptyProtobufList();

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        com.google.protobuf.l0.registerDefaultInstance(w.class, wVar);
    }

    public static void f(w wVar, String str) {
        wVar.getClass();
        str.getClass();
        com.google.protobuf.x0 x0Var = wVar.fieldPaths_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            wVar.fieldPaths_ = com.google.protobuf.l0.mutableCopy(x0Var);
        }
        wVar.fieldPaths_.add(str);
    }

    public static w g() {
        return DEFAULT_INSTANCE;
    }

    public static v j() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 3:
                return new w();
            case 4:
                return new v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (w.class) {
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

    public final String h(int i10) {
        return (String) this.fieldPaths_.get(i10);
    }

    public final int i() {
        return this.fieldPaths_.size();
    }
}
