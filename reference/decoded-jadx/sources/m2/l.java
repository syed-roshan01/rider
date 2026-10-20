package m2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f11815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f11816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f11817c;

    static {
        l lVar = new l("Ltr", 0);
        f11815a = lVar;
        l lVar2 = new l("Rtl", 1);
        f11816b = lVar2;
        f11817c = new l[]{lVar, lVar2};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f11817c.clone();
    }
}
