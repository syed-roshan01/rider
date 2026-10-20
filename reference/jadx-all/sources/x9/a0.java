package x9;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l.r f16330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f16331b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f16334e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k4.o f16336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0 f16337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b0 f16338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b0 f16339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f16341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ba.d f16342m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16332c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f16335f = new p();

    public static void b(String str, b0 b0Var) {
        if (b0Var != null) {
            if (b0Var.f16350n != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (b0Var.f16351o != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (b0Var.f16352p != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (b0Var.f16353q != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final b0 a() {
        int i10 = this.f16332c;
        if (i10 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f16332c).toString());
        }
        l.r rVar = this.f16330a;
        if (rVar == null) {
            throw new IllegalStateException("request == null".toString());
        }
        x xVar = this.f16331b;
        if (xVar == null) {
            throw new IllegalStateException("protocol == null".toString());
        }
        String str = this.f16333d;
        if (str != null) {
            return new b0(rVar, xVar, str, i10, this.f16334e, this.f16335f.c(), this.f16336g, this.f16337h, this.f16338i, this.f16339j, this.f16340k, this.f16341l, this.f16342m);
        }
        throw new IllegalStateException("message == null".toString());
    }
}
