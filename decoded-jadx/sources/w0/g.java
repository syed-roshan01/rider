package w0;

import m0.h3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.c f16063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16064g;

    public g(int i10, n nVar, c9.c cVar) {
        super(i10, nVar);
        this.f16063f = cVar;
        this.f16064g = 1;
    }

    @Override // w0.i
    public final void c() {
        if (this.f16071c) {
            return;
        }
        l();
        this.f16071c = true;
        synchronized (p.f16109b) {
            int i10 = this.f16072d;
            if (i10 >= 0) {
                p.s(i10);
                this.f16072d = -1;
            }
        }
    }

    @Override // w0.i
    public final c9.c f() {
        return this.f16063f;
    }

    @Override // w0.i
    public final boolean g() {
        return true;
    }

    @Override // w0.i
    public final c9.c i() {
        return null;
    }

    @Override // w0.i
    public final void k() {
        this.f16064g++;
    }

    @Override // w0.i
    public final void l() {
        int i10 = this.f16064g - 1;
        this.f16064g = i10;
        if (i10 == 0) {
            a();
        }
    }

    @Override // w0.i
    public final void m() {
    }

    @Override // w0.i
    public final void n(g0 g0Var) {
        h3 h3Var = p.f16108a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // w0.i
    public final i t(c9.c cVar) {
        p.c(this);
        return new e(this.f16070b, this.f16069a, cVar, this);
    }
}
