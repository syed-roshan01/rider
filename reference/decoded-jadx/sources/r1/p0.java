package r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f13406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p0 f13407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p0[] f13408c;

    static {
        p0 p0Var = new p0("Width", 0);
        f13406a = p0Var;
        p0 p0Var2 = new p0("Height", 1);
        f13407b = p0Var2;
        f13408c = new p0[]{p0Var, p0Var2};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f13408c.clone();
    }
}
