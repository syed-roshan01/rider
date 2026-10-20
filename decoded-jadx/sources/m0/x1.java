package m0;

/* JADX INFO: loaded from: classes.dex */
public final class x1 implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y1 f11754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f11755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c9.e f11756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q.r f11758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q.s f11759g;

    public x1(x xVar) {
        this.f11754b = xVar;
    }

    public final boolean a() {
        c cVar;
        return (this.f11754b == null || (cVar = this.f11755c) == null || !cVar.a()) ? false : true;
    }

    public final int b(Object obj) {
        int iC;
        y1 y1Var = this.f11754b;
        if (y1Var == null || (iC = y1Var.c(this, obj)) == 0) {
            return 1;
        }
        return iC;
    }

    public final void c(boolean z10) {
        if (z10) {
            this.f11753a |= 32;
        } else {
            this.f11753a &= -33;
        }
    }

    public final void d(c9.e eVar) {
        this.f11756d = eVar;
    }
}
