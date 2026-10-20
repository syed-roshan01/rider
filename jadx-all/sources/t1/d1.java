package t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f14409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d1 f14410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d1[] f14411c;

    static {
        d1 d1Var = new d1("Min", 0);
        f14409a = d1Var;
        d1 d1Var2 = new d1("Max", 1);
        f14410b = d1Var2;
        f14411c = new d1[]{d1Var, d1Var2};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) f14411c.clone();
    }
}
