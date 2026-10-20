package n3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f12133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12135f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f12136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f12137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ a[] f12138p;

    static {
        a aVar = new a("PENALTY_LOG", 0);
        f12130a = aVar;
        a aVar2 = new a("PENALTY_DEATH", 1);
        f12131b = aVar2;
        a aVar3 = new a("DETECT_FRAGMENT_REUSE", 2);
        f12132c = aVar3;
        a aVar4 = new a("DETECT_FRAGMENT_TAG_USAGE", 3);
        f12133d = aVar4;
        a aVar5 = new a("DETECT_RETAIN_INSTANCE_USAGE", 4);
        f12134e = aVar5;
        a aVar6 = new a("DETECT_SET_USER_VISIBLE_HINT", 5);
        f12135f = aVar6;
        a aVar7 = new a("DETECT_TARGET_FRAGMENT_USAGE", 6);
        f12136n = aVar7;
        a aVar8 = new a("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        f12137o = aVar8;
        f12138p = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f12138p.clone();
    }
}
