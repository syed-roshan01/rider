package g8;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y5 f6630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j0 f6632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e8.e0 f6634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k.e f6636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f6637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6639q;

    public a(int i10, y5 y5Var, e6 e6Var) {
        super(i10, y5Var, e6Var);
        this.f6634l = e8.e0.f5235d;
        this.f6635m = false;
        this.f6630h = y5Var;
    }

    public final void f(e8.c2 c2Var, i0 i0Var, e8.l1 l1Var) {
        if (this.f6631i) {
            return;
        }
        this.f6631i = true;
        y5 y5Var = this.f6630h;
        if (y5Var.f7293b.compareAndSet(false, true)) {
            for (o7.d0 d0Var : y5Var.f7292a) {
                d0Var.j0(c2Var);
            }
        }
        this.f6632j.c(c2Var, i0Var, l1Var);
        if (this.f6751c != null) {
            c2Var.e();
        }
    }

    public final void g(e8.l1 l1Var) {
        boolean z10 = true;
        y3.e.N("Received headers on closed stream", !this.f6638p);
        for (o7.d0 d0Var : this.f6630h.f7292a) {
            ((e8.p) d0Var).p0();
        }
        String str = (String) l1Var.c(s1.f7090f);
        boolean z11 = this.f6633k;
        e8.r rVar = e8.r.f5354a;
        if (!z11 || str == null) {
            z10 = false;
        } else if (str.equalsIgnoreCase("gzip")) {
            t1 t1Var = new t1();
            x3 x3Var = this.f6752d;
            y3.e.N("per-message decompressor already set", x3Var.f7222e == rVar);
            y3.e.N("full stream decompressor already set", x3Var.f7223f == null);
            x3Var.f7223f = t1Var;
            x3Var.f7230t = null;
            v1 v1Var = (v1) this;
            this.f6749a = new l.z2(v1Var, v1Var, x3Var);
        } else {
            if (!str.equalsIgnoreCase("identity")) {
                ((h8.k) this).b(new e8.e2(e8.c2.f5223l.g(String.format("Can't find full stream decompressor for %s", str))));
                return;
            }
            z10 = false;
        }
        String str2 = (String) l1Var.c(s1.f7088d);
        if (str2 != null) {
            e8.d0 d0Var2 = (e8.d0) this.f6634l.f5236a.get(str2);
            e8.s sVar = d0Var2 != null ? d0Var2.f5230a : null;
            if (sVar == null) {
                ((h8.k) this).b(new e8.e2(e8.c2.f5223l.g(String.format("Can't find decompressor for %s", str2))));
                return;
            } else if (sVar != rVar) {
                if (z10) {
                    ((h8.k) this).b(new e8.e2(e8.c2.f5223l.g("Full stream and gRPC message encoding cannot both be set")));
                    return;
                }
                this.f6749a.g(sVar);
            }
        }
        this.f6632j.d(l1Var);
    }

    public final void h(e8.l1 l1Var, e8.c2 c2Var, boolean z10) {
        i(c2Var, i0.f6839a, z10, l1Var);
    }

    public final void i(e8.c2 c2Var, i0 i0Var, boolean z10, e8.l1 l1Var) {
        y3.e.J(c2Var, "status");
        if (!this.f6638p || z10) {
            this.f6638p = true;
            this.f6639q = c2Var.e();
            synchronized (this.f6750b) {
                this.f6755g = true;
            }
            if (this.f6635m) {
                this.f6636n = null;
                f(c2Var, i0Var, l1Var);
                return;
            }
            this.f6636n = new k.e(this, c2Var, i0Var, l1Var, 6);
            if (z10) {
                this.f6749a.close();
            } else {
                this.f6749a.f();
            }
        }
    }
}
