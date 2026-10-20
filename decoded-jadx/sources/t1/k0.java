package t1;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends r1.x0 implements r1.i0, b {
    public Object B;
    public boolean C;
    public final /* synthetic */ n0 D;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14463f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14468r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14469s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m2.a f14470t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14472v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14476z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14464n = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14465o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14466p = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f14471u = m2.i.f11807b;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o0 f14473w = new o0(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o0.i f14474x = new o0.i(new k0[16]);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14475y = true;
    public boolean A = true;

    public k0(n0 n0Var) {
        this.D = n0Var;
        this.B = n0Var.f14508o.f14489x;
    }

    @Override // t1.b
    public final void B() {
        o0.i iVarT;
        int i10;
        this.f14476z = true;
        o0 o0Var = this.f14473w;
        o0Var.i();
        n0 n0Var = this.D;
        boolean z10 = n0Var.f14501h;
        androidx.compose.ui.node.a aVar = n0Var.f14494a;
        int i11 = 3;
        if (z10 && (i10 = (iVarT = aVar.t()).f12343c) > 0) {
            Object[] objArr = iVarT.f12341a;
            int i12 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i12];
                if (aVar2.D.f14500g && aVar2.p() == 1) {
                    n0 n0Var2 = aVar2.D;
                    k0 k0Var = n0Var2.f14509p;
                    d7.a.j(k0Var);
                    k0 k0Var2 = n0Var2.f14509p;
                    m2.a aVar3 = k0Var2 != null ? k0Var2.f14470t : null;
                    d7.a.j(aVar3);
                    if (k0Var.w0(aVar3.f11792a)) {
                        androidx.compose.ui.node.a.O(aVar, false, 3);
                    }
                }
                i12++;
            } while (i12 < i10);
        }
        r0 r0Var = l().O;
        d7.a.j(r0Var);
        if (n0Var.f14502i || (!this.f14467q && !r0Var.f14532n && n0Var.f14501h)) {
            n0Var.f14501h = false;
            int i13 = n0Var.f14496c;
            n0Var.f14496c = 4;
            l1 l1VarZ = g.z(aVar);
            n0Var.d(false);
            n1 snapshotObserver = ((u1.w) l1VarZ).getSnapshotObserver();
            z.p pVar = new z.p(this, r0Var, n0Var, i11);
            snapshotObserver.getClass();
            if (aVar.f1738c != null) {
                snapshotObserver.a(aVar, snapshotObserver.f14519h, pVar);
            } else {
                snapshotObserver.a(aVar, snapshotObserver.f14516e, pVar);
            }
            n0Var.f14496c = i13;
            if (n0Var.f14505l && r0Var.f14532n) {
                requestLayout();
            }
            n0Var.f14502i = false;
        }
        if (o0Var.f14371d) {
            o0Var.f14372e = true;
        }
        if (o0Var.f14369b && o0Var.f()) {
            o0Var.h();
        }
        this.f14476z = false;
    }

    @Override // t1.b
    public final boolean G() {
        return this.f14472v;
    }

    @Override // r1.p
    public final int Q(int i10) {
        s0();
        r0 r0VarI0 = this.D.a().I0();
        d7.a.j(r0VarI0);
        return ((w) r0VarI0).Q(i10);
    }

    @Override // t1.b
    public final void R() {
        androidx.compose.ui.node.a.O(this.D.f14494a, false, 3);
    }

    @Override // r1.p
    public final int V(int i10) {
        s0();
        r0 r0VarI0 = this.D.a().I0();
        d7.a.j(r0VarI0);
        return ((w) r0VarI0).V(i10);
    }

    @Override // r1.p
    public final int X(int i10) {
        s0();
        r0 r0VarI0 = this.D.a().I0();
        d7.a.j(r0VarI0);
        return ((w) r0VarI0).X(i10);
    }

    @Override // r1.m0, r1.p
    public final Object a() {
        return this.B;
    }

    @Override // r1.x0
    public final int a0() {
        r0 r0VarI0 = this.D.a().I0();
        d7.a.j(r0VarI0);
        return r0VarI0.a0();
    }

    @Override // r1.x0
    public final int b0() {
        r0 r0VarI0 = this.D.a().I0();
        d7.a.j(r0VarI0);
        return r0VarI0.b0();
    }

    @Override // t1.b
    public final a d() {
        return this.f14473w;
    }

    @Override // r1.x0
    public final void d0(long j10, float f10, c9.c cVar) {
        n0 n0Var = this.D;
        if (!(!n0Var.f14494a.J)) {
            throw new IllegalArgumentException("place is called on a deactivated node".toString());
        }
        n0Var.f14496c = 4;
        this.f14468r = true;
        this.C = false;
        if (!m2.i.a(j10, this.f14471u)) {
            if (n0Var.f14506m || n0Var.f14505l) {
                n0Var.f14501h = true;
            }
            r0();
        }
        androidx.compose.ui.node.a aVar = n0Var.f14494a;
        l1 l1VarZ = g.z(aVar);
        if (n0Var.f14501h || !this.f14472v) {
            n0Var.c(false);
            this.f14473w.f14374g = false;
            n1 snapshotObserver = ((u1.w) l1VarZ).getSnapshotObserver();
            j0 j0Var = new j0(n0Var, l1VarZ, j10);
            snapshotObserver.getClass();
            if (aVar.f1738c != null) {
                snapshotObserver.a(aVar, snapshotObserver.f14518g, j0Var);
            } else {
                snapshotObserver.a(aVar, snapshotObserver.f14517f, j0Var);
            }
        } else {
            r0 r0VarI0 = n0Var.a().I0();
            d7.a.j(r0VarI0);
            long j11 = r0VarI0.f13427e;
            long jC = i1.b.c(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)));
            if (!m2.i.a(r0VarI0.f14537q, jC)) {
                r0VarI0.f14537q = jC;
                c1 c1Var = r0VarI0.f14536p;
                k0 k0Var = c1Var.f14395p.D.f14509p;
                if (k0Var != null) {
                    k0Var.r0();
                }
                q0.w0(c1Var);
            }
            v0();
        }
        this.f14471u = j10;
        n0Var.f14496c = 5;
    }

    @Override // r1.i0
    public final r1.x0 f(long j10) {
        androidx.compose.ui.node.a aVarQ;
        n0 n0Var = this.D;
        androidx.compose.ui.node.a aVarQ2 = n0Var.f14494a.q();
        int i10 = 2;
        androidx.compose.ui.node.a aVar = n0Var.f14494a;
        if ((aVarQ2 != null && aVarQ2.D.f14496c == 2) || ((aVarQ = aVar.q()) != null && aVarQ.D.f14496c == 4)) {
            n0Var.f14495b = false;
        }
        androidx.compose.ui.node.a aVarQ3 = aVar.q();
        if (aVarQ3 == null) {
            this.f14466p = 3;
        } else {
            if (this.f14466p != 3 && !aVar.B) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
            }
            n0 n0Var2 = aVarQ3.D;
            int iE = t.k.e(n0Var2.f14496c);
            if (iE == 0 || iE == 1) {
                i10 = 1;
            } else if (iE != 2 && iE != 3) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(l.q.B(n0Var2.f14496c)));
            }
            this.f14466p = i10;
        }
        if (aVar.K == 3) {
            aVar.e();
        }
        w0(j10);
        return this;
    }

    @Override // r1.p
    public final int g(int i10) {
        s0();
        r0 r0VarI0 = this.D.a().I0();
        d7.a.j(r0VarI0);
        return ((w) r0VarI0).g(i10);
    }

    public final void j0() {
        boolean z10 = this.f14472v;
        this.f14472v = true;
        n0 n0Var = this.D;
        if (!z10 && n0Var.f14500g) {
            androidx.compose.ui.node.a.O(n0Var.f14494a, true, 2);
        }
        o0.i iVarT = n0Var.f14494a.t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar.r() != Integer.MAX_VALUE) {
                    k0 k0Var = aVar.D.f14509p;
                    d7.a.j(k0Var);
                    k0Var.j0();
                    androidx.compose.ui.node.a.R(aVar);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // t1.b
    public final void k(c9.c cVar) {
        o0.i iVarT = this.D.f14494a.t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                k0 k0Var = ((androidx.compose.ui.node.a) objArr[i11]).D.f14509p;
                d7.a.j(k0Var);
                cVar.invoke(k0Var);
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // t1.b
    public final x l() {
        return this.D.f14494a.C.f14576b;
    }

    public final void m0() {
        if (this.f14472v) {
            int i10 = 0;
            this.f14472v = false;
            o0.i iVarT = this.D.f14494a.t();
            int i11 = iVarT.f12343c;
            if (i11 > 0) {
                Object[] objArr = iVarT.f12341a;
                do {
                    k0 k0Var = ((androidx.compose.ui.node.a) objArr[i10]).D.f14509p;
                    d7.a.j(k0Var);
                    k0Var.m0();
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    @Override // r1.m0
    public final int p(r1.a aVar) {
        n0 n0Var = this.D;
        androidx.compose.ui.node.a aVarQ = n0Var.f14494a.q();
        int i10 = aVarQ != null ? aVarQ.D.f14496c : 0;
        o0 o0Var = this.f14473w;
        if (i10 == 2) {
            o0Var.f14370c = true;
        } else {
            androidx.compose.ui.node.a aVarQ2 = n0Var.f14494a.q();
            if (aVarQ2 != null && aVarQ2.D.f14496c == 4) {
                o0Var.f14371d = true;
            }
        }
        this.f14467q = true;
        r0 r0VarI0 = n0Var.a().I0();
        d7.a.j(r0VarI0);
        int iP = r0VarI0.p(aVar);
        this.f14467q = false;
        return iP;
    }

    public final void r0() {
        o0.i iVarT;
        int i10;
        n0 n0Var = this.D;
        if (n0Var.f14507n <= 0 || (i10 = (iVarT = n0Var.f14494a.t()).f12343c) <= 0) {
            return;
        }
        Object[] objArr = iVarT.f12341a;
        int i11 = 0;
        do {
            androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) objArr[i11];
            n0 n0Var2 = aVar.D;
            if ((n0Var2.f14505l || n0Var2.f14506m) && !n0Var2.f14498e) {
                aVar.N(false);
            }
            k0 k0Var = n0Var2.f14509p;
            if (k0Var != null) {
                k0Var.r0();
            }
            i11++;
        } while (i11 < i10);
    }

    @Override // t1.b
    public final void requestLayout() {
        this.D.f14494a.N(false);
    }

    public final void s0() {
        int i10;
        n0 n0Var = this.D;
        androidx.compose.ui.node.a.O(n0Var.f14494a, false, 3);
        androidx.compose.ui.node.a aVar = n0Var.f14494a;
        androidx.compose.ui.node.a aVarQ = aVar.q();
        if (aVarQ == null || aVar.K != 3) {
            return;
        }
        int iE = t.k.e(aVarQ.D.f14496c);
        if (iE != 0) {
            i10 = 2;
            if (iE != 2) {
                i10 = aVarQ.K;
            }
        } else {
            i10 = 1;
        }
        aVar.K = i10;
    }

    public final void v0() {
        n0 n0Var;
        int i10;
        this.C = true;
        androidx.compose.ui.node.a aVarQ = this.D.f14494a.q();
        if (!this.f14472v) {
            j0();
            if (this.f14463f && aVarQ != null) {
                aVarQ.N(false);
            }
        }
        if (aVarQ == null) {
            this.f14465o = 0;
        } else if (!this.f14463f && ((i10 = (n0Var = aVarQ.D).f14496c) == 3 || i10 == 4)) {
            if (this.f14465o != Integer.MAX_VALUE) {
                throw new IllegalStateException("Place was called on a node which was placed already".toString());
            }
            int i11 = n0Var.f14503j;
            this.f14465o = i11;
            n0Var.f14503j = i11 + 1;
        }
        B();
    }

    public final boolean w0(long j10) {
        m2.a aVar;
        n0 n0Var = this.D;
        androidx.compose.ui.node.a aVar2 = n0Var.f14494a;
        if (!(!aVar2.J)) {
            throw new IllegalArgumentException("measure is called on a deactivated node".toString());
        }
        androidx.compose.ui.node.a aVarQ = aVar2.q();
        androidx.compose.ui.node.a aVar3 = n0Var.f14494a;
        aVar3.B = aVar3.B || (aVarQ != null && aVarQ.B);
        if (!aVar3.D.f14500g && (aVar = this.f14470t) != null && m2.a.c(aVar.f11792a, j10)) {
            l1 l1Var = aVar3.f1744p;
            if (l1Var != null) {
                ((u1.w) l1Var).j(aVar3, true);
            }
            aVar3.T();
            return false;
        }
        this.f14470t = new m2.a(j10);
        h0(j10);
        this.f14473w.f14373f = false;
        k(f.f14418e);
        long jE = this.f14469s ? this.f13425c : o1.s.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f14469s = true;
        r0 r0VarI0 = n0Var.a().I0();
        if (r0VarI0 == null) {
            throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
        }
        n0Var.f14496c = 2;
        n0Var.f14500g = false;
        n1 snapshotObserver = ((u1.w) g.z(aVar3)).getSnapshotObserver();
        m0 m0Var = new m0(n0Var, j10);
        snapshotObserver.getClass();
        if (aVar3.f1738c != null) {
            snapshotObserver.a(aVar3, snapshotObserver.f14513b, m0Var);
        } else {
            snapshotObserver.a(aVar3, snapshotObserver.f14514c, m0Var);
        }
        n0Var.f14501h = true;
        n0Var.f14502i = true;
        if (g.v(aVar3)) {
            n0Var.f14498e = true;
            n0Var.f14499f = true;
        } else {
            n0Var.f14497d = true;
        }
        n0Var.f14496c = 5;
        g0(o1.s.e(r0VarI0.f13423a, r0VarI0.f13424b));
        return (((int) (jE >> 32)) == r0VarI0.f13423a && ((int) (4294967295L & jE)) == r0VarI0.f13424b) ? false : true;
    }

    @Override // t1.b
    public final b y() {
        n0 n0Var;
        androidx.compose.ui.node.a aVarQ = this.D.f14494a.q();
        if (aVarQ == null || (n0Var = aVarQ.D) == null) {
            return null;
        }
        return n0Var.f14509p;
    }
}
