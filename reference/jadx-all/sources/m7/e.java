package m7;

import com.google.protobuf.b2;
import com.google.protobuf.h0;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.u1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l0 implements u1 {
    public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
    private static final e DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int ORDER_FIELD_NUMBER = 2;
    private static volatile b2 PARSER;
    private Object valueMode_;
    private int valueModeCase_ = 0;
    private String fieldPath_ = "";

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        l0.registerDefaultInstance(e.class, eVar);
    }

    public static void f(e eVar, String str) {
        eVar.getClass();
        str.getClass();
        eVar.fieldPath_ = str;
    }

    public static void g(e eVar, d dVar) {
        eVar.getClass();
        eVar.valueMode_ = Integer.valueOf(dVar.getNumber());
        eVar.valueModeCase_ = 2;
    }

    public static void h(e eVar) {
        b bVar = b.CONTAINS;
        eVar.getClass();
        eVar.valueMode_ = Integer.valueOf(bVar.getNumber());
        eVar.valueModeCase_ = 3;
    }

    public static c l() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(k0 k0Var, Object obj, Object obj2) {
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (e.class) {
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

    public final String i() {
        return this.fieldPath_;
    }

    public final d j() {
        int i10 = this.valueModeCase_;
        d dVar = d.ORDER_UNSPECIFIED;
        if (i10 != 2) {
            return dVar;
        }
        int iIntValue = ((Integer) this.valueMode_).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                dVar = iIntValue != 2 ? null : d.DESCENDING;
            } else {
                dVar = d.ASCENDING;
            }
        }
        return dVar == null ? d.UNRECOGNIZED : dVar;
    }

    public final int k() {
        int i10 = this.valueModeCase_;
        if (i10 == 0) {
            return 3;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }
}
