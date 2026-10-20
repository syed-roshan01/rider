package r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f13403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f13404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ o0[] f13405c;

    static {
        o0 o0Var = new o0("Min", 0);
        f13403a = o0Var;
        o0 o0Var2 = new o0("Max", 1);
        f13404b = o0Var2;
        f13405c = new o0[]{o0Var, o0Var2};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f13405c.clone();
    }
}
