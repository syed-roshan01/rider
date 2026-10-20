package v8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f15966d;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f15963a = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f15964b = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f15965c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f15966d = aVarArr;
        z6.a.y(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15966d.clone();
    }
}
