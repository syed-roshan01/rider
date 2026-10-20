package g8;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class w extends m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f7179a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e8.c2 f7181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e8.c2 f7182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e8.c2 f7183e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f7185g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7180b = new AtomicInteger(-2147483647);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f7184f = new u(this, 0);

    public w(x xVar, o0 o0Var, String str) {
        this.f7185g = xVar;
        y3.e.J(o0Var, "delegate");
        this.f7179a = o0Var;
        y3.e.J(str, "authority");
    }

    public static void h(w wVar) {
        synchronized (wVar) {
            try {
                if (wVar.f7180b.get() != 0) {
                    return;
                }
                e8.c2 c2Var = wVar.f7182d;
                e8.c2 c2Var2 = wVar.f7183e;
                wVar.f7182d = null;
                wVar.f7183e = null;
                if (c2Var != null) {
                    super.f(c2Var);
                }
                if (c2Var2 != null) {
                    super.c(c2Var2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g8.m1, g8.u3
    public final void c(e8.c2 c2Var) {
        y3.e.J(c2Var, "status");
        synchronized (this) {
            try {
                if (this.f7180b.get() < 0) {
                    this.f7181c = c2Var;
                    this.f7180b.addAndGet(Integer.MAX_VALUE);
                } else if (this.f7183e != null) {
                    return;
                }
                if (this.f7180b.get() != 0) {
                    this.f7183e = c2Var;
                } else {
                    super.c(c2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g8.k0
    public final h0 d(e8.p1 p1Var, e8.l1 l1Var, e8.h hVar, e8.p[] pVarArr) {
        h0 h0Var;
        e8.f vVar = hVar.f5270d;
        if (vVar == null) {
            vVar = this.f7185g.f7207b;
        } else {
            e8.f fVar = this.f7185g.f7207b;
            if (fVar != null) {
                vVar = new e8.v(fVar, vVar);
            }
        }
        if (vVar == null) {
            return this.f7180b.get() >= 0 ? new j1(this.f7181c, pVarArr) : this.f7179a.d(p1Var, l1Var, hVar, pVarArr);
        }
        c4 c4Var = new c4(this.f7179a, p1Var, l1Var, hVar, this.f7184f, pVarArr);
        if (this.f7180b.incrementAndGet() > 0) {
            this.f7184f.d();
            return new j1(this.f7181c, pVarArr);
        }
        try {
            vVar.applyRequestMetadata(new v(), this.f7185g.f7208c, c4Var);
        } catch (Throwable th) {
            c4Var.b(e8.c2.f5221j.g("Credentials should use fail() instead of throwing exceptions").f(th));
        }
        synchronized (c4Var.f6697h) {
            try {
                h0 h0Var2 = c4Var.f6698i;
                h0Var = h0Var2;
                if (h0Var2 == null) {
                    d1 d1Var = new d1();
                    c4Var.f6700k = d1Var;
                    c4Var.f6698i = d1Var;
                    h0Var = d1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h0Var;
    }

    @Override // g8.m1, g8.u3
    public final void f(e8.c2 c2Var) {
        y3.e.J(c2Var, "status");
        synchronized (this) {
            try {
                if (this.f7180b.get() < 0) {
                    this.f7181c = c2Var;
                    this.f7180b.addAndGet(Integer.MAX_VALUE);
                    if (this.f7180b.get() != 0) {
                        this.f7182d = c2Var;
                    } else {
                        super.f(c2Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g8.m1
    public final o0 g() {
        return this.f7179a;
    }
}
