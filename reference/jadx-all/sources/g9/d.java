package g9;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7313a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7314b;

    static {
        Integer num = a9.a.f1335a;
        f7314b = (num == null || num.intValue() >= 34) ? new h9.a() : new b();
    }

    public abstract int a();

    public int b() {
        int iA;
        int i10;
        do {
            iA = a() >>> 1;
            i10 = iA % 7;
        } while ((iA - i10) + 6 < 0);
        return (-3) + i10;
    }
}
