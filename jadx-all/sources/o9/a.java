package o9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f12671d;

    static {
        a aVar = new a("SUSPEND", 0);
        f12668a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f12669b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f12670c = aVar3;
        f12671d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f12671d.clone();
    }
}
