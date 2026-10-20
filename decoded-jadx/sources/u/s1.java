package u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f14928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1 f14929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s1[] f14930c;

    static {
        s1 s1Var = new s1("Default", 0);
        f14928a = s1Var;
        s1 s1Var2 = new s1("UserInput", 1);
        f14929b = s1Var2;
        f14930c = new s1[]{s1Var, s1Var2, new s1("PreventUserInput", 2)};
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) f14930c.clone();
    }
}
