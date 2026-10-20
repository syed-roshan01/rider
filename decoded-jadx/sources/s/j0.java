package s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f13801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f13802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f13803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j0[] f13804d;

    static {
        j0 j0Var = new j0("PreEnter", 0);
        f13801a = j0Var;
        j0 j0Var2 = new j0("Visible", 1);
        f13802b = j0Var2;
        j0 j0Var3 = new j0("PostExit", 2);
        f13803c = j0Var3;
        f13804d = new j0[]{j0Var, j0Var2, j0Var3};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f13804d.clone();
    }
}
