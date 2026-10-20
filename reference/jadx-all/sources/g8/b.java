package g8;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends l implements h0, a4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f6647i = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e6 f6648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1 f6649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e8.l1 f6652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f6653h;

    public b(a4.q qVar, y5 y5Var, e6 e6Var, e8.l1 l1Var, e8.h hVar, boolean z10) {
        y3.e.J(l1Var, "headers");
        y3.e.J(e6Var, "transportTracer");
        this.f6648c = e6Var;
        this.f6650e = !Boolean.TRUE.equals(hVar.a(s1.f7098n));
        this.f6651f = z10;
        if (!z10) {
            this.f6649d = new b4(this, qVar, y5Var);
            this.f6652g = l1Var;
            return;
        }
        j0.b0 b0Var = new j0.b0();
        b0Var.f8252e = this;
        b0Var.f8249b = l1Var;
        b0Var.f8250c = y5Var;
        this.f6649d = b0Var;
    }

    public final void A(h8.t tVar, boolean z10, boolean z11, int i10) {
        ja.g gVar;
        y3.e.G("null frame before EOS", tVar != null || z10);
        k6.w4 w4Var = ((h8.l) this).f7669o;
        w4Var.getClass();
        o8.b.d();
        try {
            if (tVar == null) {
                gVar = h8.l.f7663r;
            } else {
                gVar = tVar.f7718a;
                int i11 = (int) gVar.f8534b;
                if (i11 > 0) {
                    h8.k kVar = ((h8.l) w4Var.f10455b).f7668n;
                    synchronized (kVar.f6750b) {
                        kVar.f6753e += i11;
                    }
                }
            }
            synchronized (((h8.l) w4Var.f10455b).f7668n.f7660x) {
                h8.k.m(((h8.l) w4Var.f10455b).f7668n, gVar, z10, z11);
                e6 e6Var = ((h8.l) w4Var.f10455b).f6648c;
                if (i10 == 0) {
                    e6Var.getClass();
                } else {
                    e6Var.getClass();
                    ((k4) e6Var.f6747a).a();
                }
            }
            o8.b.f12664a.getClass();
        } catch (Throwable th) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // g8.h0
    public final void b(int i10) {
        ((h8.l) this).f7668n.f6749a.b(i10);
    }

    @Override // g8.h0
    public final void e(int i10) {
        this.f6649d.e(i10);
    }

    @Override // g8.h0
    public final void f(u uVar) {
        uVar.c(((h8.l) this).f7670p.f5207a.get(e8.i.f5280a), "remote_addr");
    }

    @Override // g8.h0
    public final void g(e8.c0 c0Var) {
        e8.l1 l1Var = this.f6652g;
        e8.g1 g1Var = s1.f7087c;
        l1Var.a(g1Var);
        this.f6652g.f(g1Var, Long.valueOf(Math.max(0L, c0Var.c(TimeUnit.NANOSECONDS))));
    }

    @Override // g8.h0
    public final void h(e8.e0 e0Var) {
        h8.k kVar = ((h8.l) this).f7668n;
        y3.e.N("Already called start", kVar.f6632j == null);
        y3.e.J(e0Var, "decompressorRegistry");
        kVar.f6634l = e0Var;
    }

    @Override // g8.h0
    public final void i(e8.c2 c2Var) {
        y3.e.G("Should not cancel with OK status", !c2Var.e());
        this.f6653h = true;
        k6.w4 w4Var = ((h8.l) this).f7669o;
        w4Var.getClass();
        o8.b.d();
        try {
            synchronized (((h8.l) w4Var.f10455b).f7668n.f7660x) {
                ((h8.l) w4Var.f10455b).f7668n.n(null, c2Var, true);
            }
            o8.b.f12664a.getClass();
        } catch (Throwable th) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // g8.h0
    public final void j(j0 j0Var) {
        h8.l lVar = (h8.l) this;
        h8.k kVar = lVar.f7668n;
        y3.e.N("Already called setListener", kVar.f6632j == null);
        kVar.f6632j = j0Var;
        if (this.f6651f) {
            return;
        }
        lVar.f7669o.A(this.f6652g, null);
        this.f6652g = null;
    }

    @Override // g8.l, g8.z5
    public final boolean k() {
        return super.k() && !this.f6653h;
    }

    @Override // g8.h0
    public final void o() {
        h8.l lVar = (h8.l) this;
        if (lVar.f7668n.f6637o) {
            return;
        }
        lVar.f7668n.f6637o = true;
        this.f6649d.close();
    }

    @Override // g8.h0
    public final void q(boolean z10) {
        ((h8.l) this).f7668n.f6633k = z10;
    }

    @Override // g8.l
    public final p1 s() {
        return this.f6649d;
    }
}
