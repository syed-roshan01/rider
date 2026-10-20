package t1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends r1.x0 implements r1.i0, b {
    public final h0 A;
    public final o0.i B;
    public boolean C;
    public boolean D;
    public final t.l0 E;
    public float F;
    public boolean G;
    public c9.c H;
    public long I;
    public float J;
    public final u.r0 K;
    public final /* synthetic */ n0 L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14478f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14482q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f14485t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c9.c f14486u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f14487v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f14489x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14490y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14491z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14479n = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14480o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14483r = 3;

    public l0(n0 n0Var) {
        this.L = n0Var;
        long j10 = m2.i.f11807b;
        this.f14485t = j10;
        this.f14488w = true;
        this.A = new h0(this);
        this.B = new o0.i(new l0[16]);
        this.C = true;
        this.E = new t.l0(this, 26);
        this.I = j10;
        this.K = new u.r0(13, n0Var, this);
    }

    @Override // t1.b
    public final void B() {
        o0.i iVarT;
        int i10;
        this.D = true;
        h0 h0Var = this.A;
        h0Var.i();
        n0 n0Var = this.L;
        boolean z10 = n0Var.f14498e;
        androidx.compose.ui.node.a aVar = n0Var.f14494a;
        if (z10 && (i10 = (iVarT = aVar.t()).f12343c) > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                n0 n0Var2 = aVar2.D;
                if (n0Var2.f14497d) {
                    l0 l0Var = n0Var2.f14508o;
                    if (l0Var.f14483r == 1) {
                        m2.a aVar3 = l0Var.f14481p ? new m2.a(l0Var.f13426d) : null;
                        if (aVar3 != null) {
                            if (aVar2.K == 3) {
                                aVar2.e();
                            }
                            if (aVar2.D.f14508o.y0(aVar3.f11792a)) {
                                androidx.compose.ui.node.a.Q(aVar, false, 3);
                            }
                        }
                    }
                }
                i11++;
            } while (i11 < i10);
        }
        if (n0Var.f14499f || (!this.f14484s && !l().f14532n && n0Var.f14498e)) {
            n0Var.f14498e = false;
            int i12 = n0Var.f14496c;
            n0Var.f14496c = 3;
            n0Var.d(false);
            n1 snapshotObserver = ((u1.w) g.z(aVar)).getSnapshotObserver();
            snapshotObserver.a(aVar, snapshotObserver.f14516e, this.E);
            n0Var.f14496c = i12;
            if (l().f14532n && n0Var.f14505l) {
                requestLayout();
            }
            n0Var.f14499f = false;
        }
        if (h0Var.f14371d) {
            h0Var.f14372e = true;
        }
        if (h0Var.f14369b && h0Var.f()) {
            h0Var.h();
        }
        this.D = false;
    }

    @Override // t1.b
    public final boolean G() {
        return this.f14490y;
    }

    @Override // r1.p
    public final int Q(int i10) {
        v0();
        return this.L.a().Q(i10);
    }

    @Override // t1.b
    public final void R() {
        androidx.compose.ui.node.a.Q(this.L.f14494a, false, 3);
    }

    @Override // r1.p
    public final int V(int i10) {
        v0();
        return this.L.a().V(i10);
    }

    @Override // r1.p
    public final int X(int i10) {
        v0();
        return this.L.a().X(i10);
    }

    @Override // r1.m0, r1.p
    public final Object a() {
        return this.f14489x;
    }

    @Override // r1.x0
    public final int a0() {
        return this.L.a().a0();
    }

    @Override // r1.x0
    public final int b0() {
        return this.L.a().b0();
    }

    @Override // t1.b
    public final a d() {
        return this.A;
    }

    @Override // r1.x0
    public final void d0(long j10, float f10, c9.c cVar) {
        r1.w0 placementScope;
        this.f14491z = true;
        boolean zA = m2.i.a(j10, this.f14485t);
        n0 n0Var = this.L;
        if (!zA) {
            if (n0Var.f14506m || n0Var.f14505l) {
                n0Var.f14498e = true;
            }
            s0();
        }
        boolean z10 = false;
        if (g.v(n0Var.f14494a)) {
            c1 c1Var = n0Var.a().f14397r;
            androidx.compose.ui.node.a aVar = n0Var.f14494a;
            if (c1Var == null || (placementScope = c1Var.f14533o) == null) {
                placementScope = ((u1.w) g.z(aVar)).getPlacementScope();
            }
            k0 k0Var = n0Var.f14509p;
            d7.a.j(k0Var);
            androidx.compose.ui.node.a aVarQ = aVar.q();
            if (aVarQ != null) {
                aVarQ.D.f14503j = 0;
            }
            k0Var.f14465o = Integer.MAX_VALUE;
            r1.w0.d(placementScope, k0Var, (int) (j10 >> 32), (int) (4294967295L & j10));
        }
        k0 k0Var2 = n0Var.f14509p;
        if (k0Var2 != null && !k0Var2.f14468r) {
            z10 = true;
        }
        if (!(true ^ z10)) {
            throw new IllegalArgumentException("Error: Placement happened before lookahead.".toString());
        }
        x0(j10, f10, cVar);
    }

    @Override // r1.i0
    public final r1.x0 f(long j10) {
        int i10;
        n0 n0Var = this.L;
        androidx.compose.ui.node.a aVar = n0Var.f14494a;
        if (aVar.K == 3) {
            aVar.e();
        }
        androidx.compose.ui.node.a aVar2 = n0Var.f14494a;
        if (g.v(aVar2)) {
            k0 k0Var = n0Var.f14509p;
            d7.a.j(k0Var);
            k0Var.f14466p = 3;
            k0Var.f(j10);
        }
        androidx.compose.ui.node.a aVarQ = aVar2.q();
        if (aVarQ == null) {
            this.f14483r = 3;
        } else {
            if (this.f14483r != 3 && !aVar2.B) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
            }
            n0 n0Var2 = aVarQ.D;
            int iE = t.k.e(n0Var2.f14496c);
            if (iE != 0) {
                i10 = 2;
                if (iE != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(l.q.B(n0Var2.f14496c)));
                }
            } else {
                i10 = 1;
            }
            this.f14483r = i10;
        }
        y0(j10);
        return this;
    }

    @Override // r1.p
    public final int g(int i10) {
        v0();
        return this.L.a().g(i10);
    }

    public final List j0() {
        n0 n0Var = this.L;
        n0Var.f14494a.Z();
        boolean z10 = this.C;
        o0.i iVar = this.B;
        if (!z10) {
            return iVar.f();
        }
        androidx.compose.ui.node.a aVar = n0Var.f14494a;
        o0.i iVarT = aVar.t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (iVar.f12343c <= i11) {
                    iVar.c(aVar2.D.f14508o);
                } else {
                    iVar.p(i11, aVar2.D.f14508o);
                }
                i11++;
            } while (i11 < i10);
        }
        iVar.o(aVar.m().size(), iVar.f12343c);
        this.C = false;
        return iVar.f();
    }

    @Override // t1.b
    public final void k(c9.c cVar) {
        o0.i iVarT = this.L.f14494a.t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                cVar.invoke(((androidx.compose.ui.node.a) objArr[i11]).D.f14508o);
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // t1.b
    public final x l() {
        return this.L.f14494a.C.f14576b;
    }

    public final void m0() {
        boolean z10 = this.f14490y;
        this.f14490y = true;
        androidx.compose.ui.node.a aVar = this.L.f14494a;
        if (!z10) {
            n0 n0Var = aVar.D;
            if (n0Var.f14497d) {
                androidx.compose.ui.node.a.Q(aVar, true, 2);
            } else if (n0Var.f14500g) {
                androidx.compose.ui.node.a.O(aVar, true, 2);
            }
        }
        x0 x0Var = aVar.C;
        c1 c1Var = x0Var.f14576b.f14396q;
        for (c1 c1Var2 = x0Var.f14577c; !d7.a.d(c1Var2, c1Var) && c1Var2 != null; c1Var2 = c1Var2.f14396q) {
            if (c1Var2.G) {
                c1Var2.P0();
            }
        }
        o0.i iVarT = aVar.t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar2.r() != Integer.MAX_VALUE) {
                    aVar2.D.f14508o.m0();
                    androidx.compose.ui.node.a.R(aVar2);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // r1.m0
    public final int p(r1.a aVar) {
        n0 n0Var = this.L;
        androidx.compose.ui.node.a aVarQ = n0Var.f14494a.q();
        int i10 = aVarQ != null ? aVarQ.D.f14496c : 0;
        h0 h0Var = this.A;
        if (i10 == 1) {
            h0Var.f14370c = true;
        } else {
            androidx.compose.ui.node.a aVarQ2 = n0Var.f14494a.q();
            if (aVarQ2 != null && aVarQ2.D.f14496c == 3) {
                h0Var.f14371d = true;
            }
        }
        this.f14484s = true;
        int iP = n0Var.a().p(aVar);
        this.f14484s = false;
        return iP;
    }

    public final void r0() {
        if (this.f14490y) {
            int i10 = 0;
            this.f14490y = false;
            o0.i iVarT = this.L.f14494a.t();
            int i11 = iVarT.f12343c;
            if (i11 > 0) {
                Object[] objArr = iVarT.f12341a;
                do {
                    ((androidx.compose.ui.node.a) objArr[i10]).D.f14508o.r0();
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    @Override // t1.b
    public final void requestLayout() {
        this.L.f14494a.P(false);
    }

    public final void s0() {
        o0.i iVarT;
        int i10;
        n0 n0Var = this.L;
        if (n0Var.f14507n <= 0 || (i10 = (iVarT = n0Var.f14494a.t()).f12343c) <= 0) {
            return;
        }
        Object[] objArr = iVarT.f12341a;
        int i11 = 0;
        do {
            androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) objArr[i11];
            n0 n0Var2 = aVar.D;
            if ((n0Var2.f14505l || n0Var2.f14506m) && !n0Var2.f14498e) {
                aVar.P(false);
            }
            n0Var2.f14508o.s0();
            i11++;
        } while (i11 < i10);
    }

    public final void v0() {
        int i10;
        n0 n0Var = this.L;
        androidx.compose.ui.node.a.Q(n0Var.f14494a, false, 3);
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

    public final void w0() {
        this.G = true;
        n0 n0Var = this.L;
        androidx.compose.ui.node.a aVarQ = n0Var.f14494a.q();
        float f10 = l().B;
        x0 x0Var = n0Var.f14494a.C;
        c1 c1Var = x0Var.f14577c;
        while (c1Var != x0Var.f14576b) {
            d7.a.k(c1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            c0 c0Var = (c0) c1Var;
            f10 += c0Var.B;
            c1Var = c0Var.f14396q;
        }
        if (f10 != this.F) {
            this.F = f10;
            if (aVarQ != null) {
                aVarQ.J();
            }
            if (aVarQ != null) {
                aVarQ.x();
            }
        }
        if (!this.f14490y) {
            if (aVarQ != null) {
                aVarQ.x();
            }
            m0();
            if (this.f14478f && aVarQ != null) {
                aVarQ.P(false);
            }
        }
        if (aVarQ == null) {
            this.f14480o = 0;
        } else if (!this.f14478f) {
            n0 n0Var2 = aVarQ.D;
            if (n0Var2.f14496c == 3) {
                if (this.f14480o != Integer.MAX_VALUE) {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
                int i10 = n0Var2.f14504k;
                this.f14480o = i10;
                n0Var2.f14504k = i10 + 1;
            }
        }
        B();
    }

    public final void x0(long j10, float f10, c9.c cVar) {
        n0 n0Var = this.L;
        androidx.compose.ui.node.a aVar = n0Var.f14494a;
        if (!(!aVar.J)) {
            throw new IllegalArgumentException("place is called on a deactivated node".toString());
        }
        n0Var.f14496c = 3;
        this.f14485t = j10;
        this.f14487v = f10;
        this.f14486u = cVar;
        this.f14482q = true;
        this.G = false;
        l1 l1VarZ = g.z(aVar);
        if (n0Var.f14498e || !this.f14490y) {
            this.A.f14374g = false;
            n0Var.c(false);
            this.H = cVar;
            this.I = j10;
            this.J = f10;
            n1 snapshotObserver = ((u1.w) l1VarZ).getSnapshotObserver();
            snapshotObserver.a(n0Var.f14494a, snapshotObserver.f14517f, this.K);
            this.H = null;
        } else {
            c1 c1VarA = n0Var.a();
            long j11 = c1VarA.f13427e;
            int i10 = m2.i.f11808c;
            c1VarA.V0(i1.b.c(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))), f10, cVar);
            w0();
        }
        n0Var.f14496c = 5;
    }

    @Override // t1.b
    public final b y() {
        n0 n0Var;
        androidx.compose.ui.node.a aVarQ = this.L.f14494a.q();
        if (aVarQ == null || (n0Var = aVarQ.D) == null) {
            return null;
        }
        return n0Var.f14508o;
    }

    public final boolean y0(long j10) {
        n0 n0Var = this.L;
        androidx.compose.ui.node.a aVar = n0Var.f14494a;
        boolean z10 = true;
        if (!(!aVar.J)) {
            throw new IllegalArgumentException("measure is called on a deactivated node".toString());
        }
        l1 l1VarZ = g.z(aVar);
        androidx.compose.ui.node.a aVar2 = n0Var.f14494a;
        androidx.compose.ui.node.a aVarQ = aVar2.q();
        aVar2.B = aVar2.B || (aVarQ != null && aVarQ.B);
        if (!aVar2.D.f14497d && m2.a.c(this.f13426d, j10)) {
            ((u1.w) l1VarZ).j(aVar2, false);
            aVar2.T();
            return false;
        }
        this.A.f14373f = false;
        k(f.f14421o);
        this.f14481p = true;
        long j11 = n0Var.a().f13425c;
        h0(j10);
        if (n0Var.f14496c != 5) {
            throw new IllegalStateException("layout state is not idle before measure starts".toString());
        }
        n0Var.f14496c = 1;
        n0Var.f14497d = false;
        n0Var.f14510q = j10;
        n1 snapshotObserver = ((u1.w) g.z(aVar2)).getSnapshotObserver();
        snapshotObserver.a(aVar2, snapshotObserver.f14514c, n0Var.f14511r);
        if (n0Var.f14496c == 1) {
            n0Var.f14498e = true;
            n0Var.f14499f = true;
            n0Var.f14496c = 5;
        }
        if (m2.k.a(n0Var.a().f13425c, j11) && n0Var.a().f13423a == this.f13423a && n0Var.a().f13424b == this.f13424b) {
            z10 = false;
        }
        g0(o1.s.e(n0Var.a().f13423a, n0Var.a().f13424b));
        return z10;
    }
}
