package e1;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5022f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f5023n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f5026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f5027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f5028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f5029t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f5030u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l0 f5031v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5033x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m2.b f5034y;

    public final void a(float f10) {
        if (this.f5020d == f10) {
            return;
        }
        this.f5017a |= 4;
        this.f5020d = f10;
    }

    public final void b(float f10) {
        if (this.f5018b == f10) {
            return;
        }
        this.f5017a |= 1;
        this.f5018b = f10;
    }

    @Override // m2.b
    public final float c() {
        return this.f5034y.c();
    }

    public final void d(float f10) {
        if (this.f5019c == f10) {
            return;
        }
        this.f5017a |= 2;
        this.f5019c = f10;
    }

    public final void f(long j10) {
        long j11 = this.f5030u;
        int i10 = p0.f5056c;
        if (j11 == j10) {
            return;
        }
        this.f5017a |= 4096;
        this.f5030u = j10;
    }

    @Override // m2.b
    public final float m() {
        return this.f5034y.m();
    }
}
