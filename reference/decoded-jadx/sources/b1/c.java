package b1;

import m2.l;
import o1.s;
import t1.f1;
import u.r0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n implements b, f1, a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d f2509u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2510v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c9.c f2511w;

    public c(d dVar, c9.c cVar) {
        this.f2509u = dVar;
        this.f2511w = cVar;
        dVar.f2512a = this;
    }

    @Override // t1.f1
    public final void G() {
        G0();
    }

    public final void G0() {
        this.f2510v = false;
        this.f2509u.f2513b = null;
        t1.g.s(this);
    }

    @Override // b1.a
    public final m2.b c() {
        return t1.g.y(this).f1752x;
    }

    @Override // b1.a
    public final long e() {
        return s.m0(t1.g.x(this, 128).f13425c);
    }

    @Override // b1.a
    public final l getLayoutDirection() {
        return t1.g.y(this).f1753y;
    }

    @Override // t1.s
    public final void i(g1.e eVar) {
        boolean z10 = this.f2510v;
        d dVar = this.f2509u;
        if (!z10) {
            dVar.f2513b = null;
            t1.g.w(this, new r0(9, this, dVar));
            if (dVar.f2513b == null) {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
            }
            this.f2510v = true;
        }
        g gVar = dVar.f2513b;
        d7.a.j(gVar);
        gVar.f2515a.invoke(eVar);
    }

    @Override // t1.s
    public final void j0() {
        G0();
    }
}
