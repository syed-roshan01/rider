package w0;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f16087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f16088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f16089r;

    public l0(c cVar, c9.c cVar2, c9.c cVar3, boolean z10, boolean z11) {
        c9.c cVar4;
        c9.c cVar5;
        super(0, n.f16100e, p.j(cVar2, (cVar == null || (cVar5 = cVar.f16036f) == null) ? ((b) p.f16116i.get()).f16036f : cVar5, z10), p.a(cVar3, (cVar == null || (cVar4 = cVar.f16037g) == null) ? ((b) p.f16116i.get()).f16037g : cVar4));
        this.f16087p = cVar;
        this.f16088q = z10;
        this.f16089r = z11;
    }

    @Override // w0.c
    public final c A(c9.c cVar, c9.c cVar2) {
        c9.c cVarJ = p.j(cVar, this.f16036f, true);
        c9.c cVarA = p.a(cVar2, this.f16037g);
        return !this.f16088q ? new l0(B().A(null, cVarA), cVarJ, cVarA, false, true) : B().A(cVarJ, cVarA);
    }

    public final c B() {
        c cVar = this.f16087p;
        return cVar == null ? (c) p.f16116i.get() : cVar;
    }

    @Override // w0.c, w0.i
    public final void c() {
        c cVar;
        this.f16071c = true;
        if (!this.f16089r || (cVar = this.f16087p) == null) {
            return;
        }
        cVar.c();
    }

    @Override // w0.i
    public final int d() {
        return B().d();
    }

    @Override // w0.i
    public final n e() {
        return B().e();
    }

    @Override // w0.c, w0.i
    public final boolean g() {
        return B().g();
    }

    @Override // w0.c, w0.i
    public final int h() {
        return B().h();
    }

    @Override // w0.c, w0.i
    public final void k() {
        y.a();
        throw null;
    }

    @Override // w0.c, w0.i
    public final void l() {
        y.a();
        throw null;
    }

    @Override // w0.c, w0.i
    public final void m() {
        B().m();
    }

    @Override // w0.c, w0.i
    public final void n(g0 g0Var) {
        B().n(g0Var);
    }

    @Override // w0.i
    public final void q(int i10) {
        y.a();
        throw null;
    }

    @Override // w0.i
    public final void r(n nVar) {
        y.a();
        throw null;
    }

    @Override // w0.c, w0.i
    public final void s(int i10) {
        B().s(i10);
    }

    @Override // w0.c, w0.i
    public final i t(c9.c cVar) {
        c9.c cVarJ = p.j(cVar, this.f16036f, true);
        return !this.f16088q ? p.g(B().t(null), cVarJ, true) : B().t(cVarJ);
    }

    @Override // w0.c
    public final y.a0 v() {
        return B().v();
    }

    @Override // w0.c
    public final o0.d w() {
        return B().w();
    }

    @Override // w0.c
    public final void z(o0.d dVar) {
        y.a();
        throw null;
    }
}
