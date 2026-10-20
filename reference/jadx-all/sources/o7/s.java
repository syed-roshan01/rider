package o7;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s extends com.google.protobuf.l0 implements com.google.protobuf.u1 {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final s DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.b2 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private com.google.protobuf.q2 createTime_;
    private com.google.protobuf.n1 fields_ = com.google.protobuf.n1.f4184b;
    private String name_ = "";
    private com.google.protobuf.q2 updateTime_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        com.google.protobuf.l0.registerDefaultInstance(s.class, sVar);
    }

    public static void f(s sVar, String str) {
        sVar.getClass();
        str.getClass();
        sVar.name_ = str;
    }

    public static com.google.protobuf.n1 g(s sVar) {
        com.google.protobuf.n1 n1Var = sVar.fields_;
        if (!n1Var.f4185a) {
            sVar.fields_ = n1Var.c();
        }
        return sVar.fields_;
    }

    public static void h(s sVar, com.google.protobuf.q2 q2Var) {
        sVar.getClass();
        q2Var.getClass();
        sVar.updateTime_ = q2Var;
    }

    public static s i() {
        return DEFAULT_INSTANCE;
    }

    public static q l() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static q m(s sVar) {
        return (q) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(com.google.protobuf.k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return com.google.protobuf.l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003\t\u0004\t", new Object[]{"name_", "fields_", r.f12648a, "createTime_", "updateTime_"});
            case 3:
                return new s();
            case 4:
                return new q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.protobuf.b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (s.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final Map j() {
        return Collections.unmodifiableMap(this.fields_);
    }

    public final com.google.protobuf.q2 k() {
        com.google.protobuf.q2 q2Var = this.updateTime_;
        return q2Var == null ? com.google.protobuf.q2.h() : q2Var;
    }
}
