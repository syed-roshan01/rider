package y;

import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements r1.v, s1.d, s1.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f16561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.n1 f16562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.n1 f16563d;

    public i0(i1 i1Var) {
        this.f16561b = i1Var;
        o3 o3Var = o3.f11621a;
        this.f16562c = d7.t.g0(i1Var, o3Var);
        this.f16563d = d7.t.g0(i1Var, o3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return d7.a.d(((i0) obj).f16561b, this.f16561b);
        }
        return false;
    }

    @Override // r1.v
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        m0.n1 n1Var = this.f16562c;
        int iA = ((i1) n1Var.getValue()).a(l0Var, l0Var.getLayoutDirection());
        int iD = ((i1) n1Var.getValue()).d(l0Var);
        int iC = ((i1) n1Var.getValue()).c(l0Var, l0Var.getLayoutDirection()) + iA;
        int iB = ((i1) n1Var.getValue()).b(l0Var) + iD;
        r1.x0 x0VarF = i0Var.f(o1.s.a0(j10, -iC, -iB));
        return l0Var.N(o1.s.q(x0VarF.f13423a + iC, j10), o1.s.p(x0VarF.f13424b + iB, j10), r8.s.f13662a, new h0(x0VarF, iA, iD));
    }

    @Override // s1.d
    public final void g(s1.h hVar) {
        i1 i1Var = (i1) hVar.g(l1.f16628a);
        i1 i1Var2 = this.f16561b;
        this.f16562c.setValue(new b0(i1Var2, i1Var));
        this.f16563d.setValue(new e1(i1Var, i1Var2));
    }

    @Override // s1.g
    public final s1.i getKey() {
        return l1.f16628a;
    }

    @Override // s1.g
    public final Object getValue() {
        return (i1) this.f16563d.getValue();
    }

    public final int hashCode() {
        return this.f16561b.hashCode();
    }
}
