package m7;

import com.google.protobuf.b2;
import com.google.protobuf.h0;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.u1;
import com.google.protobuf.x0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l0 implements u1 {
    private static final g DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile b2 PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private x0 fields_ = l0.emptyProtobufList();

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        l0.registerDefaultInstance(g.class, gVar);
    }

    public static void f(g gVar) {
        f fVar = f.COLLECTION_GROUP;
        gVar.getClass();
        gVar.queryScope_ = fVar.getNumber();
    }

    public static void g(g gVar, e eVar) {
        gVar.getClass();
        eVar.getClass();
        x0 x0Var = gVar.fields_;
        if (!((com.google.protobuf.d) x0Var).f4087a) {
            gVar.fields_ = l0.mutableCopy(x0Var);
        }
        gVar.fields_.add(eVar);
    }

    public static a i() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static g j(byte[] bArr) {
        return (g) l0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", e.class, "state_"});
            case 3:
                return new g();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (g.class) {
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

    public final x0 h() {
        return this.fields_;
    }
}
