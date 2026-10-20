package w7;

import com.google.protobuf.b2;
import com.google.protobuf.f;
import com.google.protobuf.h0;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.u1;
import com.google.protobuf.x0;
import o7.b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l0 implements u1 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final a DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile b2 PARSER;
    private int code_;
    private String message_ = "";
    private x0 details_ = l0.emptyProtobufList();

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        l0.registerDefaultInstance(a.class, aVar);
    }

    public static a h() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", f.class});
            case 3:
                return new a();
            case 4:
                return new b(22);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (a.class) {
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

    public final int g() {
        return this.code_;
    }

    public final String i() {
        return this.message_;
    }
}
