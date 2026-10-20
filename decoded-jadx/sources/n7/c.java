package n7;

import com.google.protobuf.b2;
import com.google.protobuf.h0;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.u1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends l0 implements u1 {
    private static final c DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile b2 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        l0.registerDefaultInstance(c.class, cVar);
    }

    public static void f(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.parent_ = str;
    }

    public static void g(c cVar, o7.u1 u1Var) {
        cVar.getClass();
        u1Var.getClass();
        cVar.queryType_ = u1Var;
        cVar.queryTypeCase_ = 2;
    }

    public static void h(c cVar, b bVar) {
        cVar.getClass();
        cVar.limitType_ = bVar.getNumber();
    }

    public static a l() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static c m(byte[] bArr) {
        return (c) l0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", o7.u1.class, "limitType_"});
            case 3:
                return new c();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (c.class) {
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

    public final b i() {
        b bVar;
        int i10 = this.limitType_;
        if (i10 != 0) {
            bVar = i10 != 1 ? null : b.LAST;
        } else {
            bVar = b.FIRST;
        }
        return bVar == null ? b.UNRECOGNIZED : bVar;
    }

    public final String j() {
        return this.parent_;
    }

    public final o7.u1 k() {
        return this.queryTypeCase_ == 2 ? (o7.u1) this.queryType_ : o7.u1.l();
    }
}
