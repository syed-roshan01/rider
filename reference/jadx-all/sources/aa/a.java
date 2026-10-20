package aa;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f1338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1339d;

    public a(String str, boolean z10) {
        d7.a.m(str, "name");
        this.f1336a = str;
        this.f1337b = z10;
        this.f1339d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f1336a;
    }
}
