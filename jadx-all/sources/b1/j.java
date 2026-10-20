package b1;

import d7.t;
import r1.i0;
import r1.k0;
import r1.l;
import r1.l0;
import r1.p;
import r1.q;
import r1.x0;
import s.z;
import t1.b0;
import t1.s;
import x9.v;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n implements b0, s {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h1.c f2521u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2522v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y0.d f2523w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l f2524x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f2525y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e1.l f2526z;

    public static boolean H0(long j10) {
        if (!d1.f.a(j10, d1.f.f4345c)) {
            float fB = d1.f.b(j10);
            if (!Float.isInfinite(fB) && !Float.isNaN(fB)) {
                return true;
            }
        }
        return false;
    }

    public static boolean I0(long j10) {
        if (!d1.f.a(j10, d1.f.f4345c)) {
            float fD = d1.f.d(j10);
            if (!Float.isInfinite(fD) && !Float.isNaN(fD)) {
                return true;
            }
        }
        return false;
    }

    public final boolean G0() {
        if (this.f2522v) {
            long jH = this.f2521u.h();
            int i10 = d1.f.f4346d;
            if (jH != d1.f.f4345c) {
                return true;
            }
        }
        return false;
    }

    public final long J0(long j10) {
        boolean z10 = false;
        boolean z11 = m2.a.e(j10) && m2.a.d(j10);
        if (m2.a.g(j10) && m2.a.f(j10)) {
            z10 = true;
        }
        if ((!G0() && z11) || z10) {
            return m2.a.b(j10, m2.a.i(j10), 0, m2.a.h(j10), 0, 10);
        }
        long jH = this.f2521u.h();
        long j11 = t.j(o1.s.q(I0(jH) ? t.p0(d1.f.d(jH)) : m2.a.k(j10), j10), o1.s.p(H0(jH) ? t.p0(d1.f.b(jH)) : m2.a.j(j10), j10));
        if (G0()) {
            long j12 = t.j(!I0(this.f2521u.h()) ? d1.f.d(j11) : d1.f.d(this.f2521u.h()), !H0(this.f2521u.h()) ? d1.f.b(j11) : d1.f.b(this.f2521u.h()));
            j11 = (d1.f.d(j11) == 0.0f || d1.f.b(j11) == 0.0f) ? d1.f.f4344b : androidx.compose.ui.layout.a.l(j12, ((v) this.f2524x).j(j12, j11));
        }
        return m2.a.b(j10, o1.s.q(t.p0(d1.f.d(j11)), j10), 0, o1.s.p(t.p0(d1.f.b(j11)), j10), 0, 10);
    }

    @Override // t1.b0
    public final int a(q qVar, p pVar, int i10) {
        if (!G0()) {
            return pVar.g(i10);
        }
        long jJ0 = J0(o1.s.b(i10, 0, 13));
        return Math.max(m2.a.j(jJ0), pVar.g(i10));
    }

    @Override // t1.b0
    public final int b(q qVar, p pVar, int i10) {
        if (!G0()) {
            return pVar.V(i10);
        }
        long jJ0 = J0(o1.s.b(0, i10, 7));
        return Math.max(m2.a.k(jJ0), pVar.V(i10));
    }

    @Override // t1.b0
    public final int d(q qVar, p pVar, int i10) {
        if (!G0()) {
            return pVar.Q(i10);
        }
        long jJ0 = J0(o1.s.b(0, i10, 7));
        return Math.max(m2.a.k(jJ0), pVar.Q(i10));
    }

    @Override // t1.b0
    public final k0 f(l0 l0Var, i0 i0Var, long j10) {
        x0 x0VarF = i0Var.f(J0(j10));
        return l0Var.N(x0VarF.f13423a, x0VarF.f13424b, r8.s.f13662a, new z(x0VarF, 8));
    }

    @Override // t1.b0
    public final int h(q qVar, p pVar, int i10) {
        if (!G0()) {
            return pVar.X(i10);
        }
        long jJ0 = J0(o1.s.b(i10, 0, 13));
        return Math.max(m2.a.j(jJ0), pVar.X(i10));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    @Override // t1.s
    public final void i(g1.e eVar) {
        long jL;
        long jH = this.f2521u.h();
        long j10 = t.j(I0(jH) ? d1.f.d(jH) : d1.f.d(((t1.i0) eVar).f14447a.e()), H0(jH) ? d1.f.b(jH) : d1.f.b(((t1.i0) eVar).f14447a.e()));
        t1.i0 i0Var = (t1.i0) eVar;
        if (d1.f.d(i0Var.f14447a.e()) == 0.0f) {
            jL = d1.f.f4344b;
        } else {
            g1.c cVar = i0Var.f14447a;
            if (d1.f.b(cVar.e()) == 0.0f) {
                jL = d1.f.f4344b;
            } else {
                jL = androidx.compose.ui.layout.a.l(j10, ((v) this.f2524x).j(j10, cVar.e()));
            }
        }
        long j11 = jL;
        y0.d dVar = this.f2523w;
        long jE = o1.s.e(t.p0(d1.f.d(j11)), t.p0(d1.f.b(j11)));
        g1.c cVar2 = i0Var.f14447a;
        long jA = ((y0.g) dVar).a(jE, o1.s.e(t.p0(d1.f.d(cVar2.e())), t.p0(d1.f.b(cVar2.e()))), i0Var.getLayoutDirection());
        int i10 = m2.i.f11808c;
        float f10 = (int) (jA >> 32);
        float f11 = (int) (jA & 4294967295L);
        i0Var.f14447a.f6497b.f6494a.f6500a.a().e(f10, f11);
        this.f2521u.g(eVar, j11, this.f2525y, this.f2526z);
        ((t1.i0) eVar).f14447a.f6497b.f6494a.f6500a.a().e(-f10, -f11);
        i0Var.a();
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f2521u + ", sizeToIntrinsics=" + this.f2522v + ", alignment=" + this.f2523w + ", alpha=" + this.f2525y + ", colorFilter=" + this.f2526z + ')';
    }
}
