package l2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f11207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f11208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f11209c;

    static {
        h hVar = new h("Ltr", 0);
        f11207a = hVar;
        h hVar2 = new h("Rtl", 1);
        f11208b = hVar2;
        f11209c = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f11209c.clone();
    }
}
