package r1;

/* JADX INFO: loaded from: classes.dex */
public interface v extends y0.m {
    default int a(q qVar, p pVar, int i10) {
        return f(new r(qVar, qVar.getLayoutDirection()), new n0(pVar, o0.f13404b, p0.f13407b, 0), o1.s.b(i10, 0, 13)).a();
    }

    default int b(q qVar, p pVar, int i10) {
        return f(new r(qVar, qVar.getLayoutDirection()), new n0(pVar, o0.f13404b, p0.f13406a, 0), o1.s.b(0, i10, 7)).b();
    }

    default int d(q qVar, p pVar, int i10) {
        return f(new r(qVar, qVar.getLayoutDirection()), new n0(pVar, o0.f13403a, p0.f13406a, 0), o1.s.b(0, i10, 7)).b();
    }

    k0 f(l0 l0Var, i0 i0Var, long j10);

    default int h(q qVar, p pVar, int i10) {
        return f(new r(qVar, qVar.getLayoutDirection()), new n0(pVar, o0.f13403a, p0.f13407b, 0), o1.s.b(i10, 0, 13)).a();
    }
}
