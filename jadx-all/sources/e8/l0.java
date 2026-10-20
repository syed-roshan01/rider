package e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f5298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f5299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f5300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l0[] f5301d;

    /* JADX INFO: Fake field, exist only in values array */
    l0 EF0;

    static {
        l0 l0Var = new l0("CT_UNKNOWN", 0);
        l0 l0Var2 = new l0("CT_INFO", 1);
        f5298a = l0Var2;
        l0 l0Var3 = new l0("CT_WARNING", 2);
        f5299b = l0Var3;
        l0 l0Var4 = new l0("CT_ERROR", 3);
        f5300c = l0Var4;
        f5301d = new l0[]{l0Var, l0Var2, l0Var3, l0Var4};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f5301d.clone();
    }
}
