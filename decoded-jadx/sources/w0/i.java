package w0;

import m0.h3;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f16068e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f16069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16072d;

    public i(int i10, n nVar) {
        int iA;
        int iE;
        this.f16069a = nVar;
        this.f16070b = i10;
        if (i10 != 0) {
            n nVarE = e();
            h3 h3Var = p.f16108a;
            int[] iArr = nVarE.f16104d;
            if (iArr != null) {
                i10 = iArr[0];
            } else {
                long j10 = nVarE.f16102b;
                int i11 = nVarE.f16103c;
                if (j10 != 0) {
                    iE = o7.d0.e(j10);
                } else {
                    long j11 = nVarE.f16101a;
                    if (j11 != 0) {
                        i11 += 64;
                        iE = o7.d0.e(j11);
                    }
                }
                i10 = iE + i11;
            }
            synchronized (p.f16109b) {
                iA = p.f16112e.a(i10);
            }
        } else {
            iA = -1;
        }
        this.f16072d = iA;
    }

    public static void p(i iVar) {
        p.f16108a.b(iVar);
    }

    public final void a() {
        synchronized (p.f16109b) {
            b();
            o();
        }
    }

    public void b() {
        p.f16110c = p.f16110c.i(d());
    }

    public abstract void c();

    public int d() {
        return this.f16070b;
    }

    public n e() {
        return this.f16069a;
    }

    public abstract c9.c f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract c9.c i();

    public final i j() {
        h3 h3Var = p.f16108a;
        i iVar = (i) h3Var.a();
        h3Var.b(this);
        return iVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(g0 g0Var);

    public void o() {
        int i10 = this.f16072d;
        if (i10 >= 0) {
            p.s(i10);
            this.f16072d = -1;
        }
    }

    public void q(int i10) {
        this.f16070b = i10;
    }

    public void r(n nVar) {
        this.f16069a = nVar;
    }

    public void s(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public abstract i t(c9.c cVar);
}
