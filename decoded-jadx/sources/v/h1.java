package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f15593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h1 f15594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h1[] f15595c;

    static {
        h1 h1Var = new h1("Vertical", 0);
        f15593a = h1Var;
        h1 h1Var2 = new h1("Horizontal", 1);
        f15594b = h1Var2;
        f15595c = new h1[]{h1Var, h1Var2};
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) f15595c.clone();
    }
}
