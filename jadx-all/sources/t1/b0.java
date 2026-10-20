package t1;

/* JADX INFO: loaded from: classes.dex */
public interface b0 extends n {
    default int a(r1.q qVar, r1.p pVar, int i10) {
        return f(new r1.r(qVar, qVar.getLayoutDirection()), new r1.n0(pVar, d1.f14410b, e1.f14413b, 1), o1.s.b(i10, 0, 13)).a();
    }

    default int b(r1.q qVar, r1.p pVar, int i10) {
        return f(new r1.r(qVar, qVar.getLayoutDirection()), new r1.n0(pVar, d1.f14410b, e1.f14412a, 1), o1.s.b(0, i10, 7)).b();
    }

    default int d(r1.q qVar, r1.p pVar, int i10) {
        return f(new r1.r(qVar, qVar.getLayoutDirection()), new r1.n0(pVar, d1.f14409a, e1.f14412a, 1), o1.s.b(0, i10, 7)).b();
    }

    r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10);

    default int h(r1.q qVar, r1.p pVar, int i10) {
        return f(new r1.r(qVar, qVar.getLayoutDirection()), new r1.n0(pVar, d1.f14409a, e1.f14413b, 1), o1.s.b(i10, 0, 13)).a();
    }
}
