package a2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f930f;

    static {
        g gVar = new g("Paragraph", 0);
        f925a = gVar;
        g gVar2 = new g("Span", 1);
        f926b = gVar2;
        g gVar3 = new g("VerbatimTts", 2);
        f927c = gVar3;
        g gVar4 = new g("Url", 3);
        f928d = gVar4;
        g gVar5 = new g("String", 4);
        f929e = gVar5;
        f930f = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f930f.clone();
    }
}
