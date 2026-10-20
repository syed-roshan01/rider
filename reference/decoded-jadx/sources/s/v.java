package s;

import m0.g1;
import m0.l3;
import t.m1;
import t.n1;

/* JADX INFO: loaded from: classes.dex */
public final class v implements r1.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f13876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3 f13877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f13878d;

    public v(w wVar, n1 n1Var, g1 g1Var) {
        this.f13878d = wVar;
        this.f13876b = n1Var;
        this.f13877c = g1Var;
    }

    @Override // r1.v
    public final int a(r1.q qVar, r1.p pVar, int i10) {
        return pVar.g(i10);
    }

    @Override // r1.v
    public final int b(r1.q qVar, r1.p pVar, int i10) {
        return pVar.V(i10);
    }

    @Override // r1.v
    public final int d(r1.q qVar, r1.p pVar, int i10) {
        return pVar.Q(i10);
    }

    @Override // r1.v
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        r1.x0 x0VarF = i0Var.f(j10);
        w wVar = this.f13878d;
        m1 m1VarA = this.f13876b.a(new u(0, wVar, this), new q.w(wVar, 2));
        wVar.getClass();
        long jA = ((y0.g) wVar.f13881b).a(o1.s.e(x0VarF.f13423a, x0VarF.f13424b), ((m2.k) m1VarA.getValue()).f11814a, m2.l.f11815a);
        return l0Var.N((int) (((m2.k) m1VarA.getValue()).f11814a >> 32), (int) (((m2.k) m1VarA.getValue()).f11814a & 4294967295L), r8.s.f13662a, new t(x0VarF, jA));
    }

    @Override // r1.v
    public final int h(r1.q qVar, r1.p pVar, int i10) {
        return pVar.X(i10);
    }
}
