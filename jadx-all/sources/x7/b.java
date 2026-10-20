package x7;

import com.google.protobuf.b2;
import com.google.protobuf.h0;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.u1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l0 implements u1 {
    private static final b DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile b2 PARSER;
    private double latitude_;
    private double longitude_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        l0.registerDefaultInstance(b.class, bVar);
    }

    public static void f(b bVar, double d10) {
        bVar.latitude_ = d10;
    }

    public static void g(b bVar, double d10) {
        bVar.longitude_ = d10;
    }

    public static b h() {
        return DEFAULT_INSTANCE;
    }

    public static a k() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 3:
                return new b();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (b.class) {
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

    public final double i() {
        return this.latitude_;
    }

    public final double j() {
        return this.longitude_;
    }
}
