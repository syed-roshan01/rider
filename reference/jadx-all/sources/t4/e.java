package t4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f14654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f14655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f14656c;

    static {
        e eVar = new e("FILL", 0);
        f14654a = eVar;
        e eVar2 = new e("FIT", 1);
        f14655b = eVar2;
        e[] eVarArr = {eVar, eVar2};
        f14656c = eVarArr;
        z6.a.y(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f14656c.clone();
    }
}
