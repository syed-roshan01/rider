package w0;

import m0.h3;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f16055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c9.c f16056g;

    public e(int i10, n nVar, c9.c cVar, i iVar) {
        super(i10, nVar);
        this.f16055f = iVar;
        iVar.k();
        if (cVar != null) {
            c9.c cVarF = iVar.f();
            if (cVarF != null) {
                cVar = new a(cVar, cVarF, 1);
            }
        } else {
            cVar = iVar.f();
        }
        this.f16056g = cVar;
    }

    @Override // w0.i
    public final void c() {
        if (this.f16071c) {
            return;
        }
        int i10 = this.f16070b;
        i iVar = this.f16055f;
        if (i10 != iVar.d()) {
            a();
        }
        iVar.l();
        this.f16071c = true;
        synchronized (p.f16109b) {
            int i11 = this.f16072d;
            if (i11 >= 0) {
                p.s(i11);
                this.f16072d = -1;
            }
        }
    }

    @Override // w0.i
    public final c9.c f() {
        return this.f16056g;
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
        y.a();
        throw null;
    }

    @Override // w0.i
    public final void l() {
        y.a();
        throw null;
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
        return new e(this.f16070b, this.f16069a, cVar, this.f16055f);
    }
}
