package o1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f12400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f12401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f12402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l[] f12403d;

    static {
        l lVar = new l("Initial", 0);
        f12400a = lVar;
        l lVar2 = new l("Main", 1);
        f12401b = lVar2;
        l lVar3 = new l("Final", 2);
        f12402c = lVar3;
        f12403d = new l[]{lVar, lVar2, lVar3};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f12403d.clone();
    }
}
