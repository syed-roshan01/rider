package o1;

import t1.p1;
import t1.u1;
import u1.s1;
import u1.u0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends y0.n implements u1, p1, t1.m {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q f12406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12408w;

    public o(q qVar, boolean z10) {
        this.f12406u = qVar;
        this.f12407v = z10;
    }

    @Override // y0.n
    public final void A0() {
        this.f12408w = false;
        H0();
    }

    public final void G0() {
        q qVar;
        d9.u uVar = new d9.u();
        t1.g.B(this, new n(2, uVar));
        o oVar = (o) uVar.f4952a;
        if (oVar == null || (qVar = oVar.f12406u) == null) {
            qVar = this.f12406u;
        }
        r rVar = (r) t1.g.p(this, s1.f15288r);
        if (rVar != null) {
            u1.t tVar = (u1.t) rVar;
            if (qVar == null) {
                q.f12410a.getClass();
                qVar = s.f12411a;
            }
            u0.f15306a.a(tVar.f15299a, qVar);
        }
    }

    public final void H0() {
        q8.l lVar;
        r rVar;
        d9.u uVar = new d9.u();
        t1.g.B(this, new n(0, uVar));
        o oVar = (o) uVar.f4952a;
        if (oVar != null) {
            oVar.G0();
            lVar = q8.l.f13235a;
        } else {
            lVar = null;
        }
        if (lVar != null || (rVar = (r) t1.g.p(this, s1.f15288r)) == null) {
            return;
        }
        q.f12410a.getClass();
        u0.f15306a.a(((u1.t) rVar).f15299a, s.f12411a);
    }

    public final void I0() {
        d9.q qVar = new d9.q();
        qVar.f4948a = true;
        if (!this.f12407v) {
            t1.g.D(this, new h0.f0(qVar));
        }
        if (qVar.f4948a) {
            G0();
        }
    }

    @Override // t1.p1
    public final void b0() {
    }

    @Override // t1.u1
    public final /* bridge */ /* synthetic */ Object o() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // t1.p1
    public final void y(k kVar, l lVar, long j10) {
        if (lVar == l.f12401b) {
            if (s.t(kVar.f12399c, 4)) {
                this.f12408w = true;
                I0();
            } else if (s.t(kVar.f12399c, 5)) {
                this.f12408w = false;
                H0();
            }
        }
    }
}
