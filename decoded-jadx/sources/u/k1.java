package u;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k1 {
    public static /* synthetic */ long a(int i10) {
        if (i10 == 1) {
            return 0L;
        }
        if (i10 == 2) {
            return 1L;
        }
        if (i10 == 3) {
            return 2L;
        }
        if (i10 == 4) {
            return 3L;
        }
        if (i10 == 5) {
            return 4L;
        }
        throw null;
    }

    public static c5.m b(int i10, m0.g1 g1Var, m0.q qVar) {
        c5.m mVar = new c5.m(i10, g1Var);
        qVar.l0(mVar);
        return mVar;
    }

    public static StringBuilder c(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void d(long j10, StringBuilder sb, String str) {
        sb.append((Object) e1.r.i(j10));
        sb.append(str);
    }

    public static /* synthetic */ String e(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String f(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "null" : "Vertical";
        }
        return "Horizontal";
    }

    public static /* synthetic */ String g(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "null" : "Expand";
        }
        return "Wrap";
    }
}
