package w0;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f16096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f16098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c9.c f16099i;

    public m0(i iVar, c9.c cVar, boolean z10) {
        c9.c cVarF;
        super(0, n.f16100e);
        this.f16096f = iVar;
        this.f16097g = false;
        this.f16098h = z10;
        this.f16099i = p.j(cVar, (iVar == null || (cVarF = iVar.f()) == null) ? ((b) p.f16116i.get()).f16036f : cVarF, false);
    }

    @Override // w0.i
    public final void c() {
        i iVar;
        this.f16071c = true;
        if (!this.f16098h || (iVar = this.f16096f) == null) {
            return;
        }
        iVar.c();
    }

    @Override // w0.i
    public final int d() {
        return u().d();
    }

    @Override // w0.i
    public final n e() {
        return u().e();
    }

    @Override // w0.i
    public final c9.c f() {
        return this.f16099i;
    }

    @Override // w0.i
    public final boolean g() {
        return u().g();
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
        u().m();
    }

    @Override // w0.i
    public final void n(g0 g0Var) {
        u().n(g0Var);
    }

    @Override // w0.i
    public final i t(c9.c cVar) {
        c9.c cVarJ = p.j(cVar, this.f16099i, true);
        return !this.f16097g ? p.g(u().t(null), cVarJ, true) : u().t(cVarJ);
    }

    public final i u() {
        i iVar = this.f16096f;
        return iVar == null ? (i) p.f16116i.get() : iVar;
    }
}
