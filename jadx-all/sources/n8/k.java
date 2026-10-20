package n8;

import e8.c2;
import e8.l1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends e8.p {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e8.p f12284y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m f12285z;

    public k(m mVar, e8.p pVar) {
        this.f12285z = mVar;
        this.f12284y = pVar;
    }

    @Override // o7.d0
    public final void I(int i10) {
        this.f12284y.I(i10);
    }

    @Override // o7.d0
    public final void J(long j10, int i10) {
        this.f12284y.J(j10, i10);
    }

    @Override // o7.d0
    public final void K(long j10) {
        this.f12284y.K(j10);
    }

    @Override // o7.d0
    public final void L(long j10) {
        this.f12284y.L(j10);
    }

    @Override // o7.d0
    public final void c0(int i10) {
        this.f12284y.c0(i10);
    }

    @Override // o7.d0
    public final void d0(long j10, long j11, int i10) {
        this.f12284y.d0(j10, j11, i10);
    }

    @Override // o7.d0
    public final void e0(long j10) {
        this.f12284y.e0(j10);
    }

    @Override // o7.d0
    public final void f0(long j10) {
        this.f12284y.f0(j10);
    }

    @Override // o7.d0
    public final void j0(c2 c2Var) {
        this.f12285z.f12287a.d(c2Var.e());
        this.f12284y.j0(c2Var);
    }

    @Override // e8.p
    public final void o0() {
        this.f12284y.o0();
    }

    @Override // e8.p
    public final void p0() {
        this.f12284y.p0();
    }

    @Override // e8.p
    public final void q0(l1 l1Var) {
        this.f12284y.q0(l1Var);
    }

    @Override // e8.p
    public final void r0() {
        this.f12284y.r0();
    }

    @Override // e8.p
    public final void s0(e8.c cVar, l1 l1Var) {
        this.f12284y.s0(cVar, l1Var);
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f12284y, "delegate");
        return gVarJ0.toString();
    }
}
