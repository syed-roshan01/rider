package e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1 f5400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x1 f5401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x1[] f5402c;

    static {
        x1 x1Var = new x1("NONE", 0);
        f5400a = x1Var;
        x1 x1Var2 = new x1("INTEGRITY", 1);
        x1 x1Var3 = new x1("PRIVACY_AND_INTEGRITY", 2);
        f5401b = x1Var3;
        f5402c = new x1[]{x1Var, x1Var2, x1Var3};
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) f5402c.clone();
    }
}
