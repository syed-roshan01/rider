package g8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r1 f7067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r1[] f7068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r1[] f7069e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.c2 f7071b;

    /* JADX INFO: Fake field, exist only in values array */
    r1 EF0;

    static {
        e8.c2 c2Var = e8.c2.f5224m;
        r1 r1Var = new r1("NO_ERROR", 0, 0, c2Var);
        e8.c2 c2Var2 = e8.c2.f5223l;
        r1 r1Var2 = new r1("PROTOCOL_ERROR", 1, 1, c2Var2);
        r1 r1Var3 = new r1("INTERNAL_ERROR", 2, 2, c2Var2);
        f7067c = r1Var3;
        f7069e = new r1[]{r1Var, r1Var2, r1Var3, new r1("FLOW_CONTROL_ERROR", 3, 3, c2Var2), new r1("SETTINGS_TIMEOUT", 4, 4, c2Var2), new r1("STREAM_CLOSED", 5, 5, c2Var2), new r1("FRAME_SIZE_ERROR", 6, 6, c2Var2), new r1("REFUSED_STREAM", 7, 7, c2Var), new r1("CANCEL", 8, 8, e8.c2.f5217f), new r1("COMPRESSION_ERROR", 9, 9, c2Var2), new r1("CONNECT_ERROR", 10, 10, c2Var2), new r1("ENHANCE_YOUR_CALM", 11, 11, e8.c2.f5222k.g("Bandwidth exhausted")), new r1("INADEQUATE_SECURITY", 12, 12, e8.c2.f5220i.g("Permission denied as protocol is not secure enough to call")), new r1("HTTP_1_1_REQUIRED", 13, 13, e8.c2.f5218g)};
        r1[] r1VarArrValues = values();
        r1[] r1VarArr = new r1[r1VarArrValues[r1VarArrValues.length - 1].f7070a + 1];
        for (r1 r1Var4 : r1VarArrValues) {
            r1VarArr[r1Var4.f7070a] = r1Var4;
        }
        f7068d = r1VarArr;
    }

    public r1(String str, int i10, int i11, e8.c2 c2Var) {
        super(str, i10);
        this.f7070a = i11;
        String strP = "HTTP/2 error code: " + name();
        if (c2Var.f5228b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(strP);
            sb.append(" (");
            strP = a7.a.p(sb, c2Var.f5228b, ")");
        }
        this.f7071b = c2Var.g(strP);
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) f7069e.clone();
    }
}
