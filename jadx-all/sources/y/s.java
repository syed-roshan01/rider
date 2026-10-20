package y;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s implements r1.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.d f16674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16675b;

    public s(y0.g gVar, boolean z10) {
        this.f16674a = gVar;
        this.f16675b = z10;
    }

    @Override // r1.j0
    public final r1.k0 e(r1.l0 l0Var, List list, long j10) {
        int iMax;
        int iMax2;
        r1.x0 x0VarF;
        boolean zIsEmpty = list.isEmpty();
        r8.s sVar = r8.s.f13662a;
        if (zIsEmpty) {
            return l0Var.N(m2.a.k(j10), m2.a.j(j10), sVar, n.f16640c);
        }
        long jB = this.f16675b ? j10 : m2.a.b(j10, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            r1.i0 i0Var = (r1.i0) list.get(0);
            Object objA = i0Var.a();
            l lVar = objA instanceof l ? (l) objA : null;
            if (lVar == null || !lVar.f16618v) {
                r1.x0 x0VarF2 = i0Var.f(jB);
                iMax = Math.max(m2.a.k(j10), x0VarF2.f13423a);
                iMax2 = Math.max(m2.a.j(j10), x0VarF2.f13424b);
                x0VarF = x0VarF2;
            } else {
                iMax = m2.a.k(j10);
                iMax2 = m2.a.j(j10);
                x0VarF = i0Var.f(l2.l.d(m2.a.k(j10), m2.a.j(j10)));
            }
            return l0Var.N(iMax, iMax2, sVar, new q(x0VarF, i0Var, l0Var, iMax, iMax2, this));
        }
        r1.x0[] x0VarArr = new r1.x0[list.size()];
        d9.s sVar2 = new d9.s();
        sVar2.f4950a = m2.a.k(j10);
        d9.s sVar3 = new d9.s();
        sVar3.f4950a = m2.a.j(j10);
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            r1.i0 i0Var2 = (r1.i0) list.get(i10);
            Object objA2 = i0Var2.a();
            l lVar2 = objA2 instanceof l ? (l) objA2 : null;
            if (lVar2 == null || !lVar2.f16618v) {
                r1.x0 x0VarF3 = i0Var2.f(jB);
                x0VarArr[i10] = x0VarF3;
                sVar2.f4950a = Math.max(sVar2.f4950a, x0VarF3.f13423a);
                sVar3.f4950a = Math.max(sVar3.f4950a, x0VarF3.f13424b);
            } else {
                z10 = true;
            }
        }
        if (z10) {
            int i11 = sVar2.f4950a;
            int i12 = i11 != Integer.MAX_VALUE ? i11 : 0;
            int i13 = sVar3.f4950a;
            long jA = o1.s.a(i12, i11, i13 != Integer.MAX_VALUE ? i13 : 0, i13);
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                r1.i0 i0Var3 = (r1.i0) list.get(i14);
                Object objA3 = i0Var3.a();
                l lVar3 = objA3 instanceof l ? (l) objA3 : null;
                if (lVar3 != null && lVar3.f16618v) {
                    x0VarArr[i14] = i0Var3.f(jA);
                }
            }
        }
        return l0Var.N(sVar2.f4950a, sVar3.f4950a, sVar, new r(x0VarArr, list, l0Var, sVar2, sVar3, this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return d7.a.d(this.f16674a, sVar.f16674a) && this.f16675b == sVar.f16675b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16675b) + (this.f16674a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f16674a + ", propagateMinConstraints=" + this.f16675b + ')';
    }
}
