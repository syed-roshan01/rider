package t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f14412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f14413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e1[] f14414c;

    static {
        e1 e1Var = new e1("Width", 0);
        f14412a = e1Var;
        e1 e1Var2 = new e1("Height", 1);
        f14413b = e1Var2;
        f14414c = new e1[]{e1Var, e1Var2};
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) f14414c.clone();
    }
}
