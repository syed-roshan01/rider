package s;

import t.m1;
import t.n1;
import t.u1;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends y0.n implements t1.b0 {
    public k0 A;
    public long B = g0.f13781a;
    public y0.g C;
    public final o0 D;
    public final o0 E;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public u1 f13851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n1 f13852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n1 f13853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n1 f13854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q0 f13855y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r0 f13856z;

    public p0(u1 u1Var, n1 n1Var, n1 n1Var2, n1 n1Var3, q0 q0Var, r0 r0Var, k0 k0Var) {
        this.f13851u = u1Var;
        this.f13852v = n1Var;
        this.f13853w = n1Var2;
        this.f13854x = n1Var3;
        this.f13855y = q0Var;
        this.f13856z = r0Var;
        this.A = k0Var;
        o1.s.b(0, 0, 15);
        this.D = new o0(this, 0);
        this.E = new o0(this, 1);
    }

    public final y0.d G0() {
        if (this.f13851u.c().b(j0.f13801a, j0.f13802b)) {
            this.f13855y.f13858a.getClass();
            this.f13856z.f13861a.getClass();
            return null;
        }
        this.f13856z.f13861a.getClass();
        this.f13855y.f13858a.getClass();
        return null;
    }

    @Override // t1.b0
    public final int a(r1.q qVar, r1.p pVar, int i10) {
        return pVar.g(i10);
    }

    @Override // t1.b0
    public final int b(r1.q qVar, r1.p pVar, int i10) {
        return pVar.V(i10);
    }

    @Override // t1.b0
    public final int d(r1.q qVar, r1.p pVar, int i10) {
        return pVar.Q(i10);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    @Override // t1.b0
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        e1.p0 p0Var;
        m1 m1VarA;
        long j11;
        long jA;
        if (this.f13851u.b() == this.f13851u.f14321c.getValue()) {
            this.C = null;
        } else if (this.C == null) {
            G0();
            this.C = y0.a.f16708a;
        }
        boolean zQ = l0Var.q();
        r8.s sVar = r8.s.f13662a;
        if (zQ) {
            r1.x0 x0VarF = i0Var.f(j10);
            long jE = o1.s.e(x0VarF.f13423a, x0VarF.f13424b);
            this.B = jE;
            return l0Var.N((int) (jE >> 32), (int) (4294967295L & jE), sVar, new z(x0VarF, 1));
        }
        k0 k0Var = this.A;
        n1 n1Var = k0Var.f13810a;
        q0 q0Var = k0Var.f13813d;
        r0 r0Var = k0Var.f13814e;
        m1 m1VarA2 = n1Var != null ? n1Var.a(new l0(q0Var, r0Var, 0), new l0(q0Var, r0Var, 1)) : null;
        int i10 = 2;
        n1 n1Var2 = k0Var.f13811b;
        int i11 = 3;
        m1 m1VarA3 = n1Var2 != null ? n1Var2.a(new l0(q0Var, r0Var, 2), new l0(q0Var, r0Var, 3)) : null;
        if (k0Var.f13812c.b() == j0.f13801a) {
            w0 w0Var = q0Var.f13858a.f13755b;
            if (w0Var != null) {
                p0Var = new e1.p0(w0Var.f13885b);
            } else {
                w0 w0Var2 = r0Var.f13861a.f13755b;
                if (w0Var2 != null) {
                    p0Var = new e1.p0(w0Var2.f13885b);
                } else {
                    p0Var = null;
                }
            }
        } else {
            w0 w0Var3 = r0Var.f13861a.f13755b;
            if (w0Var3 != null) {
                p0Var = new e1.p0(w0Var3.f13885b);
            } else {
                w0 w0Var4 = q0Var.f13858a.f13755b;
                if (w0Var4 != null) {
                    p0Var = new e1.p0(w0Var4.f13885b);
                } else {
                    p0Var = null;
                }
            }
        }
        n1 n1Var3 = k0Var.f13815f;
        b.g gVar = new b.g(m1VarA2, m1VarA3, n1Var3 != null ? n1Var3.a(h0.f13788f, new b.g(p0Var, q0Var, r0Var, i11)) : null, i10);
        r1.x0 x0VarF2 = i0Var.f(j10);
        long jE2 = o1.s.e(x0VarF2.f13423a, x0VarF2.f13424b);
        long j12 = m2.k.a(this.B, g0.f13781a) ^ true ? this.B : jE2;
        n1 n1Var4 = this.f13852v;
        if (n1Var4 != null) {
            m1VarA = n1Var4.a(this.D, new n0(this, j12, 0));
        } else {
            m1VarA = null;
        }
        if (m1VarA != null) {
            jE2 = ((m2.k) m1VarA.getValue()).f11814a;
        }
        long jO = o1.s.o(j10, jE2);
        n1 n1Var5 = this.f13853w;
        long j13 = n1Var5 != null ? ((m2.i) n1Var5.a(h0.f13789n, new n0(this, j12, 1)).getValue()).f11809a : m2.i.f11807b;
        n1 n1Var6 = this.f13854x;
        if (n1Var6 != null) {
            j11 = ((m2.i) n1Var6.a(this.E, new n0(this, j12, 2)).getValue()).f11809a;
        } else {
            j11 = m2.i.f11807b;
        }
        y0.g gVar2 = this.C;
        if (gVar2 != null) {
            jA = gVar2.a(j12, jO, m2.l.f11815a);
        } else {
            jA = m2.i.f11807b;
        }
        int i12 = m2.i.f11808c;
        return l0Var.N((int) (jO >> 32), (int) (4294967295L & jO), sVar, new m0(x0VarF2, i1.b.c(((int) (jA >> 32)) + ((int) (j11 >> 32)), ((int) (jA & 4294967295L)) + ((int) (j11 & 4294967295L))), j13, gVar, 0));
    }

    @Override // t1.b0
    public final int h(r1.q qVar, r1.p pVar, int i10) {
        return pVar.X(i10);
    }

    @Override // y0.n
    public final void z0() {
        this.B = g0.f13781a;
    }
}
