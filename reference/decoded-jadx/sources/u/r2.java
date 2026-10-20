package u;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends y0.n implements t1.b0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p2 f14920u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14921v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14922w;

    @Override // t1.b0
    public final int a(r1.q qVar, r1.p pVar, int i10) {
        return this.f14922w ? pVar.g(i10) : pVar.g(Integer.MAX_VALUE);
    }

    @Override // t1.b0
    public final int b(r1.q qVar, r1.p pVar, int i10) {
        return this.f14922w ? pVar.V(Integer.MAX_VALUE) : pVar.V(i10);
    }

    @Override // t1.b0
    public final int d(r1.q qVar, r1.p pVar, int i10) {
        return this.f14922w ? pVar.Q(Integer.MAX_VALUE) : pVar.Q(i10);
    }

    @Override // t1.b0
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        androidx.compose.foundation.a.h(j10, this.f14922w ? v.h1.f15593a : v.h1.f15594b);
        r1.x0 x0VarF = i0Var.f(m2.a.b(j10, 0, this.f14922w ? m2.a.i(j10) : Integer.MAX_VALUE, 0, this.f14922w ? Integer.MAX_VALUE : m2.a.h(j10), 5));
        int i10 = x0VarF.f13423a;
        int i11 = m2.a.i(j10);
        if (i10 > i11) {
            i10 = i11;
        }
        int i12 = x0VarF.f13424b;
        int iH = m2.a.h(j10);
        if (i12 > iH) {
            i12 = iH;
        }
        int i13 = x0VarF.f13424b - i12;
        int i14 = x0VarF.f13423a - i10;
        if (!this.f14922w) {
            i13 = i14;
        }
        p2 p2Var = this.f14920u;
        m0.l1 l1Var = p2Var.f14887d;
        m0.l1 l1Var2 = p2Var.f14884a;
        l1Var.f(i13);
        w0.i iVarC = k0.y0.c();
        try {
            w0.i iVarJ = iVarC.j();
            try {
                if (l1Var2.d() > i13) {
                    l1Var2.f(i13);
                }
                w0.i.p(iVarJ);
                iVarC.c();
                this.f14920u.f14885b.f(this.f14922w ? i12 : i10);
                return l0Var.N(i10, i12, r8.s.f13662a, new q2(this, i13, x0VarF, 0));
            } catch (Throwable th) {
                w0.i.p(iVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            iVarC.c();
            throw th2;
        }
    }

    @Override // t1.b0
    public final int h(r1.q qVar, r1.p pVar, int i10) {
        return this.f14922w ? pVar.X(i10) : pVar.X(Integer.MAX_VALUE);
    }
}
