package i1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a4.q f7787k = new a4.q();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f7788l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f7794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f7797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7798j;

    public f(String str, float f10, float f11, float f12, float f13, g0 g0Var, long j10, int i10, boolean z10) {
        int i11;
        synchronized (f7787k) {
            i11 = f7788l;
            f7788l = i11 + 1;
        }
        this.f7789a = str;
        this.f7790b = f10;
        this.f7791c = f11;
        this.f7792d = f12;
        this.f7793e = f13;
        this.f7794f = g0Var;
        this.f7795g = j10;
        this.f7796h = i10;
        this.f7797i = z10;
        this.f7798j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return d7.a.d(this.f7789a, fVar.f7789a) && m2.e.a(this.f7790b, fVar.f7790b) && m2.e.a(this.f7791c, fVar.f7791c) && this.f7792d == fVar.f7792d && this.f7793e == fVar.f7793e && d7.a.d(this.f7794f, fVar.f7794f) && e1.r.c(this.f7795g, fVar.f7795g) && e1.g0.b(this.f7796h, fVar.f7796h) && this.f7797i == fVar.f7797i;
    }

    public final int hashCode() {
        int iHashCode = (this.f7794f.hashCode() + l.q.a(this.f7793e, l.q.a(this.f7792d, l.q.a(this.f7791c, l.q.a(this.f7790b, this.f7789a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i10 = e1.r.f5066h;
        return Boolean.hashCode(this.f7797i) + a7.a.u(this.f7796h, l.q.b(this.f7795g, iHashCode, 31), 31);
    }
}
