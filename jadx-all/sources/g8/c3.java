package g8;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class c3 extends e8.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i3.a0 f6688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f6689b;

    public c3(l3 l3Var) {
        this.f6689b = l3Var;
    }

    @Override // e8.j0
    public final e8.x0 h(e8.u0 u0Var) {
        l3 l3Var = this.f6689b;
        l3Var.f6939m.d();
        y3.e.N("Channel is being terminated", !l3Var.H);
        return new k3(l3Var, u0Var);
    }

    @Override // e8.j0
    public final e8.i i() {
        return this.f6689b.N;
    }

    @Override // e8.j0
    public final ScheduledExecutorService j() {
        return this.f6689b.f6933g;
    }

    @Override // e8.j0
    public final e8.h2 l() {
        return this.f6689b.f6939m;
    }

    @Override // e8.j0
    public final void o() {
        l3 l3Var = this.f6689b;
        l3Var.f6939m.d();
        l3Var.f6939m.execute(new t0(this, 5));
    }

    @Override // e8.j0
    public final void r(e8.x xVar, z6.a aVar) {
        l3 l3Var = this.f6689b;
        l3Var.f6939m.d();
        y3.e.J(xVar, "newState");
        y3.e.J(aVar, "newPicker");
        l3Var.f6939m.execute(new y2.a(this, aVar, xVar, 21));
    }
}
