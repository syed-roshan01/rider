package e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f5328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f5329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1 f5330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o1[] f5331d;

    static {
        o1 o1Var = new o1("UNARY", 0);
        f5328a = o1Var;
        o1 o1Var2 = new o1("CLIENT_STREAMING", 1);
        o1 o1Var3 = new o1("SERVER_STREAMING", 2);
        f5329b = o1Var3;
        o1 o1Var4 = new o1("BIDI_STREAMING", 3);
        f5330c = o1Var4;
        f5331d = new o1[]{o1Var, o1Var2, o1Var3, o1Var4, new o1("UNKNOWN", 4)};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) f5331d.clone();
    }
}
