package o7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f12636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k2 f12637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k2 f12638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k2 f12639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k2 f12640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k2[] f12641f;

    static {
        k2 k2Var = new k2("UPDATE", 0);
        f12636a = k2Var;
        k2 k2Var2 = new k2("DELETE", 1);
        f12637b = k2Var2;
        k2 k2Var3 = new k2("VERIFY", 2);
        f12638c = k2Var3;
        k2 k2Var4 = new k2("TRANSFORM", 3);
        f12639d = k2Var4;
        k2 k2Var5 = new k2("OPERATION_NOT_SET", 4);
        f12640e = k2Var5;
        f12641f = new k2[]{k2Var, k2Var2, k2Var3, k2Var4, k2Var5};
    }

    public static k2 valueOf(String str) {
        return (k2) Enum.valueOf(k2.class, str);
    }

    public static k2[] values() {
        return (k2[]) f12641f.clone();
    }
}
