package z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f17194c;

    static {
        a aVar = new a("On", 0);
        f17192a = aVar;
        a aVar2 = new a("Off", 1);
        f17193b = aVar2;
        f17194c = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f17194c.clone();
    }
}
