package n0;

import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f12074c = new i(0, 2, 1);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        int i10;
        u0.c cVar = (u0.c) h0Var.b(0);
        m0.c cVar2 = (m0.c) h0Var.b(1);
        d7.a.k(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        int iC = q2Var.c(cVar2);
        m0.s.l(q2Var.f11682r < iC);
        m9.e0.J(q2Var, dVar, iC);
        int i11 = q2Var.f11682r;
        int iY = q2Var.f11684t;
        while (iY >= 0 && !d7.t.v(q2Var.f11666b, q2Var.o(iY))) {
            iY = q2Var.y(q2Var.f11666b, iY);
        }
        int iP = iY + 1;
        int iE = 0;
        while (iP < i11) {
            if (q2Var.q(i11, iP)) {
                if (d7.t.v(q2Var.f11666b, q2Var.o(iP))) {
                    iE = 0;
                }
                iP++;
            } else {
                iE += d7.t.v(q2Var.f11666b, q2Var.o(iP)) ? 1 : d7.t.x(q2Var.f11666b, q2Var.o(iP));
                iP += q2Var.p(iP);
            }
        }
        while (true) {
            i10 = q2Var.f11682r;
            if (i10 >= iC) {
                break;
            }
            if (q2Var.q(iC, i10)) {
                int i12 = q2Var.f11682r;
                if (i12 < q2Var.f11683s && d7.t.v(q2Var.f11666b, q2Var.o(i12))) {
                    dVar.b(q2Var.x(q2Var.f11682r));
                    iE = 0;
                }
                q2Var.I();
            } else {
                iE += q2Var.E();
            }
        }
        m0.s.l(i10 == iC);
        cVar.f15006a = iE;
    }

    @Override // n0.g0
    public final String c(int i10) {
        if (d9.i.o(i10, 0)) {
            return "effectiveNodeIndexOut";
        }
        return d9.i.o(i10, 1) ? "anchor" : super.c(i10);
    }
}
