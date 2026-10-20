package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2 f11447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a2 f11448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a2 f11449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a2 f11450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a2 f11451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a2 f11452f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a2[] f11453n;

    static {
        a2 a2Var = new a2("ShutDown", 0);
        f11447a = a2Var;
        a2 a2Var2 = new a2("ShuttingDown", 1);
        f11448b = a2Var2;
        a2 a2Var3 = new a2("Inactive", 2);
        f11449c = a2Var3;
        a2 a2Var4 = new a2("InactivePendingWork", 3);
        f11450d = a2Var4;
        a2 a2Var5 = new a2("Idle", 4);
        f11451e = a2Var5;
        a2 a2Var6 = new a2("PendingWork", 5);
        f11452f = a2Var6;
        f11453n = new a2[]{a2Var, a2Var2, a2Var3, a2Var4, a2Var5, a2Var6};
    }

    public static a2 valueOf(String str) {
        return (a2) Enum.valueOf(a2.class, str);
    }

    public static a2[] values() {
        return (a2[]) f11453n.clone();
    }
}
