package t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1 f14554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1 f14555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1 f14556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t1[] f14557d;

    static {
        t1 t1Var = new t1("ContinueTraversal", 0);
        f14554a = t1Var;
        t1 t1Var2 = new t1("SkipSubtreeAndContinueTraversal", 1);
        f14555b = t1Var2;
        t1 t1Var3 = new t1("CancelTraversal", 2);
        f14556c = t1Var3;
        f14557d = new t1[]{t1Var, t1Var2, t1Var3};
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) f14557d.clone();
    }
}
