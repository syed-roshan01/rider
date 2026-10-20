package i5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f8066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f8067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f8068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f8069d;

    static {
        d dVar = new d("DEFAULT", 0);
        f8066a = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f8067b = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f8068c = dVar3;
        f8069d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f8069d.clone();
    }
}
