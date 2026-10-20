package t4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f14650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f14651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f14652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f14653d;

    static {
        d dVar = new d("EXACT", 0);
        f14650a = dVar;
        d dVar2 = new d("INEXACT", 1);
        f14651b = dVar2;
        d dVar3 = new d("AUTOMATIC", 2);
        f14652c = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        f14653d = dVarArr;
        z6.a.y(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14653d.clone();
    }
}
