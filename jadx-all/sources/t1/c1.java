package t1;

import android.view.View;
import java.lang.ref.Reference;
import java.util.LinkedHashMap;
import u1.b3;
import u1.c3;
import u1.f3;
import u1.o2;
import u1.z1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c1 extends q0 implements r1.i0, r1.s, m1 {
    public static final e1.i0 I;
    public static final z J;
    public static final float[] K;
    public static final x9.v L;
    public static final x9.v M;
    public float B;
    public d1.b C;
    public z D;
    public boolean G;
    public j1 H;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.compose.ui.node.a f14395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c1 f14396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c1 f14397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14399t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c9.c f14400u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m2.b f14401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m2.l f14402w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r1.k0 f14404y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinkedHashMap f14405z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f14403x = 0.8f;
    public long A = m2.i.f11807b;
    public final h1.b E = new h1.b(this, 6);
    public final t.l0 F = new t.l0(this, 28);

    static {
        e1.i0 i0Var = new e1.i0();
        i0Var.f5018b = 1.0f;
        i0Var.f5019c = 1.0f;
        i0Var.f5020d = 1.0f;
        long j10 = e1.x.f5074a;
        i0Var.f5024o = j10;
        i0Var.f5025p = j10;
        i0Var.f5029t = 8.0f;
        i0Var.f5030u = e1.p0.f5055b;
        i0Var.f5031v = e1.g0.f5008a;
        i0Var.f5033x = 0;
        int i10 = d1.f.f4346d;
        i0Var.f5034y = new m2.c(1.0f, 1.0f);
        I = i0Var;
        J = new z();
        K = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        L = new x9.v(0);
        M = new x9.v(1);
    }

    public c1(androidx.compose.ui.node.a aVar) {
        this.f14395p = aVar;
        this.f14401v = aVar.f1752x;
        this.f14402w = aVar.f1753y;
    }

    public static c1 Z0(r1.s sVar) {
        c1 c1Var;
        r1.h0 h0Var = sVar instanceof r1.h0 ? (r1.h0) sVar : null;
        if (h0Var != null && (c1Var = h0Var.f13382a.f14536p) != null) {
            return c1Var;
        }
        d7.a.k(sVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (c1) sVar;
    }

    public final long A0(long j10) {
        return d7.t.j(Math.max(0.0f, (d1.f.d(j10) - b0()) / 2.0f), Math.max(0.0f, (d1.f.b(j10) - a0()) / 2.0f));
    }

    public final float B0(long j10, long j11) {
        if (b0() >= d1.f.d(j11) && a0() >= d1.f.b(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        long jA0 = A0(j11);
        float fD = d1.f.d(jA0);
        float fB = d1.f.b(jA0);
        float fD2 = d1.c.d(j10);
        float fMax = Math.max(0.0f, fD2 < 0.0f ? -fD2 : fD2 - b0());
        float fE = d1.c.e(j10);
        long jF = d9.i.f(fMax, Math.max(0.0f, fE < 0.0f ? -fE : fE - a0()));
        if ((fD > 0.0f || fB > 0.0f) && d1.c.d(jF) <= fD && d1.c.e(jF) <= fB) {
            return (d1.c.e(jF) * d1.c.e(jF)) + (d1.c.d(jF) * d1.c.d(jF));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void C0(e1.p pVar) {
        j1 j1Var = this.H;
        if (j1Var != null) {
            j1Var.l(pVar);
            return;
        }
        long j10 = this.A;
        int i10 = m2.i.f11808c;
        float f10 = (int) (j10 >> 32);
        float f11 = (int) (j10 & 4294967295L);
        pVar.e(f10, f11);
        E0(pVar);
        pVar.e(-f10, -f11);
    }

    public final void D0(e1.p pVar, e1.g gVar) {
        long j10 = this.f13425c;
        pVar.getClass();
        pVar.s(0.5f, 0.5f, ((int) (j10 >> 32)) - 0.5f, ((int) (j10 & 4294967295L)) - 0.5f, gVar);
    }

    public final void E0(e1.p pVar) {
        y0.n nVarL0 = L0(4);
        if (nVarL0 == null) {
            U0(pVar);
            return;
        }
        androidx.compose.ui.node.a aVar = this.f14395p;
        aVar.getClass();
        i0 sharedDrawScope = ((u1.w) g.z(aVar)).getSharedDrawScope();
        long jM0 = o1.s.m0(this.f13425c);
        sharedDrawScope.getClass();
        o0.i iVar = null;
        while (nVarL0 != null) {
            if (nVarL0 instanceof s) {
                sharedDrawScope.b(pVar, jM0, this, (s) nVarL0);
            } else if ((nVarL0.f16732c & 4) != 0 && (nVarL0 instanceof o)) {
                int i10 = 0;
                for (y0.n nVar = ((o) nVarL0).f14521v; nVar != null; nVar = nVar.f16735f) {
                    if ((nVar.f16732c & 4) != 0) {
                        i10++;
                        if (i10 == 1) {
                            nVarL0 = nVar;
                        } else {
                            if (iVar == null) {
                                iVar = new o0.i(new y0.n[16]);
                            }
                            if (nVarL0 != null) {
                                iVar.c(nVarL0);
                                nVarL0 = null;
                            }
                            iVar.c(nVar);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            nVarL0 = g.f(iVar);
        }
    }

    public abstract void F0();

    public final c1 G0(c1 c1Var) {
        androidx.compose.ui.node.a aVarQ = c1Var.f14395p;
        androidx.compose.ui.node.a aVar = this.f14395p;
        if (aVarQ == aVar) {
            y0.n nVarK0 = c1Var.K0();
            y0.n nVar = K0().f16730a;
            if (!nVar.f16742t) {
                throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
            }
            for (y0.n nVar2 = nVar.f16734e; nVar2 != null; nVar2 = nVar2.f16734e) {
                if ((nVar2.f16732c & 2) != 0 && nVar2 == nVarK0) {
                    return c1Var;
                }
            }
            return this;
        }
        while (aVarQ.f1745q > aVar.f1745q) {
            aVarQ = aVarQ.q();
            d7.a.j(aVarQ);
        }
        androidx.compose.ui.node.a aVarQ2 = aVar;
        while (aVarQ2.f1745q > aVarQ.f1745q) {
            aVarQ2 = aVarQ2.q();
            d7.a.j(aVarQ2);
        }
        while (aVarQ != aVarQ2) {
            aVarQ = aVarQ.q();
            aVarQ2 = aVarQ2.q();
            if (aVarQ == null || aVarQ2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (aVarQ2 == aVar) {
            return this;
        }
        return aVarQ == c1Var.f14395p ? c1Var : aVarQ.C.f14576b;
    }

    public final long H0(long j10) {
        long j11 = this.A;
        float fD = d1.c.d(j10);
        int i10 = m2.i.f11808c;
        long jF = d9.i.f(fD - ((int) (j11 >> 32)), d1.c.e(j10) - ((int) (j11 & 4294967295L)));
        j1 j1Var = this.H;
        return j1Var != null ? j1Var.a(jF, true) : jF;
    }

    public abstract r0 I0();

    public final long J0() {
        return this.f14401v.S(this.f14395p.f1754z.f());
    }

    public abstract y0.n K0();

    @Override // r1.s
    public final boolean L() {
        return K0().f16742t;
    }

    public final y0.n L0(int i10) {
        boolean zR = g.r(i10);
        y0.n nVarK0 = K0();
        if (!zR && (nVarK0 = nVarK0.f16734e) == null) {
            return null;
        }
        for (y0.n nVarM0 = M0(zR); nVarM0 != null && (nVarM0.f16733d & i10) != 0; nVarM0 = nVarM0.f16735f) {
            if ((nVarM0.f16732c & i10) != 0) {
                return nVarM0;
            }
            if (nVarM0 == nVarK0) {
                return null;
            }
        }
        return null;
    }

    @Override // r1.s
    public final long M() {
        return this.f13425c;
    }

    public final y0.n M0(boolean z10) {
        y0.n nVarK0;
        x0 x0Var = this.f14395p.C;
        if (x0Var.f14577c == this) {
            return x0Var.f14579e;
        }
        if (z10) {
            c1 c1Var = this.f14397r;
            if (c1Var != null && (nVarK0 = c1Var.K0()) != null) {
                return nVarK0.f16735f;
            }
        } else {
            c1 c1Var2 = this.f14397r;
            if (c1Var2 != null) {
                return c1Var2.K0();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x010c, code lost:
    
        if (t1.g.o(r21.e(), t1.g.a(r15, r23)) > 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(t1.z0 r18, long r19, t1.v r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c1.N0(t1.z0, long, t1.v, boolean, boolean):void");
    }

    public void O0(z0 z0Var, long j10, v vVar, boolean z10, boolean z11) {
        c1 c1Var = this.f14396q;
        if (c1Var != null) {
            c1Var.N0(z0Var, c1Var.H0(j10), vVar, z10, z11);
        }
    }

    @Override // r1.s
    public final long P(long j10) {
        if (!K0().f16742t) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        R0();
        for (c1 c1Var = this; c1Var != null; c1Var = c1Var.f14397r) {
            j10 = c1Var.a1(j10);
        }
        return j10;
    }

    public final void P0() {
        j1 j1Var = this.H;
        if (j1Var != null) {
            j1Var.invalidate();
            return;
        }
        c1 c1Var = this.f14397r;
        if (c1Var != null) {
            c1Var.P0();
        }
    }

    public final boolean Q0() {
        if (this.H != null && this.f14403x <= 0.0f) {
            return true;
        }
        c1 c1Var = this.f14397r;
        if (c1Var != null) {
            return c1Var.Q0();
        }
        return false;
    }

    public final void R0() {
        n0 n0Var = this.f14395p.D;
        int i10 = n0Var.f14494a.D.f14496c;
        if (i10 == 3 || i10 == 4) {
            if (n0Var.f14508o.D) {
                n0Var.d(true);
            } else {
                n0Var.c(true);
            }
        }
        if (i10 == 4) {
            k0 k0Var = n0Var.f14509p;
            if (k0Var == null || !k0Var.f14476z) {
                n0Var.c(true);
            } else {
                n0Var.d(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final void S0() {
        y0.n nVarK0;
        y0.n nVarM0 = M0(g.r(128));
        if (nVarM0 == null || (nVarM0.f16730a.f16733d & 128) == 0) {
            return;
        }
        w0.i iVarC = k0.y0.c();
        try {
            w0.i iVarJ = iVarC.j();
            try {
                boolean zR = g.r(128);
                if (!zR) {
                    nVarK0 = K0().f16734e;
                    if (nVarK0 == null) {
                    }
                    iVarC.c();
                }
                nVarK0 = K0();
                for (y0.n nVarM1 = M0(zR); nVarM1 != null && (nVarM1.f16733d & 128) != 0; nVarM1 = nVarM1.f16735f) {
                    if ((nVarM1.f16732c & 128) != 0) {
                        ?? F = nVarM1;
                        ?? iVar = 0;
                        while (F != 0) {
                            if (F instanceof a0) {
                                ((a0) F).p(this.f13425c);
                            } else if ((F.f16732c & 128) != 0 && (F instanceof o)) {
                                y0.n nVar = ((o) F).f14521v;
                                int i10 = 0;
                                F = F;
                                iVar = iVar;
                                while (nVar != null) {
                                    if ((nVar.f16732c & 128) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            iVar = iVar;
                                            F = nVar;
                                        } else {
                                            if (iVar == 0) {
                                                iVar = new o0.i(new y0.n[16]);
                                            }
                                            if (F != 0) {
                                                iVar.c(F);
                                                F = 0;
                                            }
                                            iVar.c(nVar);
                                        }
                                    }
                                    nVar = nVar.f16735f;
                                    F = F;
                                    iVar = iVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            F = g.f(iVar);
                        }
                    }
                    if (nVarM1 != nVarK0) {
                    }
                }
                iVarC.c();
            } finally {
                w0.i.p(iVarJ);
            }
        } catch (Throwable th) {
            iVarC.c();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void T0() {
        boolean zR = g.r(128);
        y0.n nVarK0 = K0();
        if (!zR && (nVarK0 = nVarK0.f16734e) == null) {
            return;
        }
        for (y0.n nVarM0 = M0(zR); nVarM0 != null && (nVarM0.f16733d & 128) != 0; nVarM0 = nVarM0.f16735f) {
            if ((nVarM0.f16732c & 128) != 0) {
                ?? F = nVarM0;
                ?? iVar = 0;
                while (F != 0) {
                    if (F instanceof a0) {
                        ((a0) F).R(this);
                    } else if ((F.f16732c & 128) != 0 && (F instanceof o)) {
                        y0.n nVar = ((o) F).f14521v;
                        int i10 = 0;
                        F = F;
                        iVar = iVar;
                        while (nVar != null) {
                            if ((nVar.f16732c & 128) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    iVar = iVar;
                                    F = nVar;
                                } else {
                                    if (iVar == 0) {
                                        iVar = new o0.i(new y0.n[16]);
                                    }
                                    if (F != 0) {
                                        iVar.c(F);
                                        F = 0;
                                    }
                                    iVar.c(nVar);
                                }
                            }
                            nVar = nVar.f16735f;
                            F = F;
                            iVar = iVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    F = g.f(iVar);
                }
            }
            if (nVarM0 == nVarK0) {
                return;
            }
        }
    }

    public abstract void U0(e1.p pVar);

    public final void V0(long j10, float f10, c9.c cVar) {
        c1(cVar, false);
        if (!m2.i.a(this.A, j10)) {
            this.A = j10;
            androidx.compose.ui.node.a aVar = this.f14395p;
            aVar.D.f14508o.s0();
            j1 j1Var = this.H;
            if (j1Var != null) {
                j1Var.g(j10);
            } else {
                c1 c1Var = this.f14397r;
                if (c1Var != null) {
                    c1Var.P0();
                }
            }
            q0.w0(this);
            l1 l1Var = aVar.f1744p;
            if (l1Var != null) {
                ((u1.w) l1Var).v(aVar);
            }
        }
        this.B = f10;
    }

    public final void W0(d1.b bVar, boolean z10, boolean z11) {
        j1 j1Var = this.H;
        if (j1Var != null) {
            if (this.f14399t) {
                if (z11) {
                    long jJ0 = J0();
                    float fD = d1.f.d(jJ0) / 2.0f;
                    float fB = d1.f.b(jJ0) / 2.0f;
                    long j10 = this.f13425c;
                    bVar.a(-fD, -fB, ((int) (j10 >> 32)) + fD, ((int) (j10 & 4294967295L)) + fB);
                } else if (z10) {
                    long j11 = this.f13425c;
                    bVar.a(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L));
                }
                if (bVar.b()) {
                    return;
                }
            }
            j1Var.j(bVar, false);
        }
        long j12 = this.A;
        int i10 = m2.i.f11808c;
        float f10 = (int) (j12 >> 32);
        bVar.f4322a += f10;
        bVar.f4324c += f10;
        float f11 = (int) (j12 & 4294967295L);
        bVar.f4323b += f11;
        bVar.f4325d += f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final void X0(r1.k0 k0Var) {
        r1.k0 k0Var2 = this.f14404y;
        if (k0Var != k0Var2) {
            this.f14404y = k0Var;
            androidx.compose.ui.node.a aVar = this.f14395p;
            if (k0Var2 == null || k0Var.b() != k0Var2.b() || k0Var.a() != k0Var2.a()) {
                int iB = k0Var.b();
                int iA = k0Var.a();
                j1 j1Var = this.H;
                if (j1Var != null) {
                    j1Var.b(o1.s.e(iB, iA));
                } else {
                    c1 c1Var = this.f14397r;
                    if (c1Var != null) {
                        c1Var.P0();
                    }
                }
                g0(o1.s.e(iB, iA));
                d1(false);
                boolean zR = g.r(4);
                y0.n nVarK0 = K0();
                if (zR || (nVarK0 = nVarK0.f16734e) != null) {
                    for (y0.n nVarM0 = M0(zR); nVarM0 != null && (nVarM0.f16733d & 4) != 0; nVarM0 = nVarM0.f16735f) {
                        if ((nVarM0.f16732c & 4) != 0) {
                            ?? F = nVarM0;
                            ?? iVar = 0;
                            while (F != 0) {
                                if (F instanceof s) {
                                    ((s) F).j0();
                                } else if ((F.f16732c & 4) != 0 && (F instanceof o)) {
                                    y0.n nVar = ((o) F).f14521v;
                                    int i10 = 0;
                                    while (nVar != null) {
                                        if ((nVar.f16732c & 4) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                F = F;
                                                iVar = iVar;
                                                iVar = iVar;
                                                F = nVar;
                                            } else {
                                                if (iVar == 0) {
                                                    iVar = new o0.i(new y0.n[16]);
                                                }
                                                if (F != 0) {
                                                    iVar.c(F);
                                                    F = 0;
                                                }
                                                iVar.c(nVar);
                                            }
                                        } else {
                                            F = F;
                                            iVar = iVar;
                                        }
                                        nVar = nVar.f16735f;
                                        F = F;
                                        iVar = iVar;
                                    }
                                    if (i10 == 1) {
                                        F = F;
                                        iVar = iVar;
                                    } else {
                                        F = F;
                                        iVar = iVar;
                                    }
                                }
                                F = g.f(iVar);
                            }
                        }
                        if (nVarM0 == nVarK0) {
                            break;
                        }
                    }
                }
                l1 l1Var = aVar.f1744p;
                if (l1Var != null) {
                    ((u1.w) l1Var).v(aVar);
                }
            }
            LinkedHashMap linkedHashMap = this.f14405z;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && !(!k0Var.d().isEmpty())) || d7.a.d(k0Var.d(), this.f14405z)) {
                return;
            }
            aVar.D.f14508o.A.g();
            LinkedHashMap linkedHashMap2 = this.f14405z;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f14405z = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(k0Var.d());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final void Y0(y0.n nVar, z0 z0Var, long j10, v vVar, boolean z10, boolean z11, float f10) {
        if (nVar == null) {
            O0(z0Var, j10, vVar, z10, z11);
            return;
        }
        x9.v vVar2 = (x9.v) z0Var;
        int i10 = 16;
        switch (vVar2.f16473a) {
            case 0:
                ?? iVar = 0;
                ?? F = nVar;
                while (F != 0) {
                    if (F instanceof p1) {
                        if (((p1) F).m0()) {
                            b1 b1Var = new b1(this, nVar, z0Var, j10, vVar, z10, z11, f10, 1);
                            if (vVar.f14563c == d7.t.Y(vVar)) {
                                vVar.i(nVar, f10, z11, b1Var);
                                if (vVar.f14563c + 1 == d7.t.Y(vVar)) {
                                    vVar.k();
                                    return;
                                }
                                return;
                            }
                            long jE = vVar.e();
                            int i11 = vVar.f14563c;
                            vVar.f14563c = d7.t.Y(vVar);
                            vVar.i(nVar, f10, z11, b1Var);
                            if (vVar.f14563c + 1 < d7.t.Y(vVar) && g.o(jE, vVar.e()) > 0) {
                                int i12 = vVar.f14563c + 1;
                                int i13 = i11 + 1;
                                Object[] objArr = vVar.f14561a;
                                b9.b.H(i13, i12, vVar.f14564d, objArr, objArr);
                                long[] jArr = vVar.f14562b;
                                int i14 = vVar.f14564d;
                                d7.a.m(jArr, "<this>");
                                System.arraycopy(jArr, i12, jArr, i13, i14 - i12);
                                vVar.f14563c = ((vVar.f14564d + i11) - vVar.f14563c) - 1;
                            }
                            vVar.k();
                            vVar.f14563c = i11;
                            return;
                        }
                    } else if ((F.f16732c & 16) != 0 && (F instanceof o)) {
                        y0.n nVar2 = ((o) F).f14521v;
                        int i15 = 0;
                        while (nVar2 != null) {
                            if ((nVar2.f16732c & 16) != 0) {
                                i15++;
                                if (i15 == 1) {
                                    F = F;
                                    iVar = iVar;
                                    iVar = iVar;
                                    F = nVar2;
                                } else {
                                    if (iVar == 0) {
                                        iVar = new o0.i(new y0.n[16]);
                                    }
                                    if (F != 0) {
                                        iVar.c(F);
                                        F = 0;
                                    }
                                    iVar.c(nVar2);
                                }
                            } else {
                                F = F;
                                iVar = iVar;
                            }
                            nVar2 = nVar2.f16735f;
                            F = F;
                            iVar = iVar;
                        }
                        F = F;
                        iVar = iVar;
                        if (i15 == 1) {
                        }
                    }
                    F = g.f(iVar);
                }
                break;
        }
        switch (vVar2.f16473a) {
            case 0:
                break;
            default:
                i10 = 8;
                break;
        }
        Y0(g.e(nVar, i10), z0Var, j10, vVar, z10, z11, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // r1.m0, r1.p
    public final Object a() {
        androidx.compose.ui.node.a aVar = this.f14395p;
        if (!aVar.C.d(64)) {
            return null;
        }
        K0();
        Object objH0 = null;
        for (y0.n nVar = aVar.C.f14578d; nVar != null; nVar = nVar.f16734e) {
            if ((nVar.f16732c & 64) != 0) {
                ?? F = nVar;
                ?? iVar = 0;
                while (F != 0) {
                    if (F instanceof o1) {
                        objH0 = ((o1) F).h0(objH0);
                    } else if ((F.f16732c & 64) != 0 && (F instanceof o)) {
                        y0.n nVar2 = ((o) F).f14521v;
                        int i10 = 0;
                        F = F;
                        iVar = iVar;
                        while (nVar2 != null) {
                            if ((nVar2.f16732c & 64) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    iVar = iVar;
                                    F = nVar2;
                                } else {
                                    if (iVar == 0) {
                                        iVar = new o0.i(new y0.n[16]);
                                    }
                                    if (F != 0) {
                                        iVar.c(F);
                                        F = 0;
                                    }
                                    iVar.c(nVar2);
                                }
                            }
                            nVar2 = nVar2.f16735f;
                            F = F;
                            iVar = iVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    F = g.f(iVar);
                }
            }
        }
        return objH0;
    }

    public final long a1(long j10) {
        j1 j1Var = this.H;
        if (j1Var != null) {
            j10 = j1Var.a(j10, false);
        }
        long j11 = this.A;
        float fD = d1.c.d(j10);
        int i10 = m2.i.f11808c;
        return d9.i.f(fD + ((int) (j11 >> 32)), d1.c.e(j10) + ((int) (j11 & 4294967295L)));
    }

    @Override // r1.s
    public final d1.d b(r1.s sVar, boolean z10) {
        if (!K0().f16742t) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        if (!sVar.L()) {
            throw new IllegalStateException(("LayoutCoordinates " + sVar + " is not attached!").toString());
        }
        c1 c1VarZ0 = Z0(sVar);
        c1VarZ0.R0();
        c1 c1VarG0 = G0(c1VarZ0);
        d1.b bVar = this.C;
        if (bVar == null) {
            bVar = new d1.b();
            bVar.f4322a = 0.0f;
            bVar.f4323b = 0.0f;
            bVar.f4324c = 0.0f;
            bVar.f4325d = 0.0f;
            this.C = bVar;
        }
        bVar.f4322a = 0.0f;
        bVar.f4323b = 0.0f;
        bVar.f4324c = (int) (sVar.M() >> 32);
        bVar.f4325d = (int) (sVar.M() & 4294967295L);
        while (c1VarZ0 != c1VarG0) {
            c1VarZ0.W0(bVar, z10, false);
            if (bVar.b()) {
                return d1.d.f4331e;
            }
            c1VarZ0 = c1VarZ0.f14397r;
            d7.a.j(c1VarZ0);
        }
        y0(c1VarG0, bVar, z10);
        return new d1.d(bVar.f4322a, bVar.f4323b, bVar.f4324c, bVar.f4325d);
    }

    public final void b1(c1 c1Var, float[] fArr) {
        if (d7.a.d(c1Var, this)) {
            return;
        }
        c1 c1Var2 = this.f14397r;
        d7.a.j(c1Var2);
        c1Var2.b1(c1Var, fArr);
        if (!m2.i.a(this.A, m2.i.f11807b)) {
            float[] fArr2 = K;
            e1.a0.c(fArr2);
            long j10 = this.A;
            e1.a0.e(fArr2, -((int) (j10 >> 32)), -((int) (j10 & 4294967295L)));
            e1.a0.d(fArr, fArr2);
        }
        j1 j1Var = this.H;
        if (j1Var != null) {
            j1Var.d(fArr);
        }
    }

    @Override // m2.b
    public final float c() {
        return this.f14395p.f1752x.c();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    public final void c1(c9.c cVar, boolean z10) {
        l1 l1Var;
        Reference referencePoll;
        o0.i iVar;
        z1 c3Var;
        androidx.compose.ui.node.a aVar = this.f14395p;
        boolean z11 = (!z10 && this.f14400u == cVar && d7.a.d(this.f14401v, aVar.f1752x) && this.f14402w == aVar.f1753y) ? false : true;
        this.f14400u = cVar;
        this.f14401v = aVar.f1752x;
        this.f14402w = aVar.f1753y;
        boolean zC = aVar.C();
        t.l0 l0Var = this.F;
        Object obj = null;
        if (!zC || cVar == null) {
            j1 j1Var = this.H;
            if (j1Var != null) {
                j1Var.f();
                aVar.G = true;
                l0Var.invoke();
                if (K0().f16742t && (l1Var = aVar.f1744p) != null) {
                    ((u1.w) l1Var).v(aVar);
                }
            }
            this.H = null;
            this.G = false;
            return;
        }
        if (this.H != null) {
            if (z11) {
                d1(true);
                return;
            }
            return;
        }
        u1.w wVar = (u1.w) g.z(aVar);
        do {
            f3 f3Var = wVar.f15346t0;
            referencePoll = f3Var.f15092b.poll();
            iVar = f3Var.f15091a;
            if (referencePoll != null) {
                iVar.m(referencePoll);
            }
        } while (referencePoll != null);
        while (iVar.l()) {
            Object obj2 = ((Reference) iVar.n(iVar.f12343c - 1)).get();
            if (obj2 != null) {
                obj = obj2;
                break;
            }
        }
        j1 b3Var = (j1) obj;
        h1.b bVar = this.E;
        if (b3Var != null) {
            b3Var.i(l0Var, bVar);
        } else if (wVar.isHardwareAccelerated() && wVar.V) {
            try {
                b3Var = new o2(wVar, bVar, l0Var);
            } catch (Throwable unused) {
                wVar.V = false;
                if (wVar.I == null) {
                    if (!b3.f15036z) {
                        k1.b.b(new View(wVar.getContext()));
                    }
                    if (b3.A) {
                        c3Var = new z1(wVar.getContext());
                    } else {
                        c3Var = new c3(wVar.getContext());
                    }
                    wVar.I = c3Var;
                    wVar.addView(c3Var);
                }
                z1 z1Var = wVar.I;
                d7.a.j(z1Var);
                b3Var = new b3(wVar, z1Var, bVar, l0Var);
            }
        } else {
            if (wVar.I == null) {
                if (!b3.f15036z) {
                    k1.b.b(new View(wVar.getContext()));
                }
                if (b3.A) {
                    c3Var = new z1(wVar.getContext());
                } else {
                    c3Var = new c3(wVar.getContext());
                }
                wVar.I = c3Var;
                wVar.addView(c3Var);
            }
            z1 z1Var2 = wVar.I;
            d7.a.j(z1Var2);
            b3Var = new b3(wVar, z1Var2, bVar, l0Var);
        }
        b3Var.b(this.f13425c);
        b3Var.g(this.A);
        this.H = b3Var;
        d1(true);
        aVar.G = true;
        l0Var.invoke();
    }

    public final void d1(boolean z10) {
        l1 l1Var;
        j1 j1Var = this.H;
        if (j1Var == null) {
            if (this.f14400u != null) {
                throw new IllegalStateException("null layer with a non-null layerBlock".toString());
            }
            return;
        }
        c9.c cVar = this.f14400u;
        if (cVar == null) {
            throw new IllegalStateException("updateLayerParameters requires a non-null layerBlock".toString());
        }
        e1.i0 i0Var = I;
        i0Var.b(1.0f);
        i0Var.d(1.0f);
        i0Var.a(1.0f);
        if (i0Var.f5021e != 0.0f) {
            i0Var.f5017a |= 8;
            i0Var.f5021e = 0.0f;
        }
        if (i0Var.f5022f != 0.0f) {
            i0Var.f5017a |= 16;
            i0Var.f5022f = 0.0f;
        }
        if (i0Var.f5023n != 0.0f) {
            i0Var.f5017a |= 32;
            i0Var.f5023n = 0.0f;
        }
        long j10 = e1.x.f5074a;
        if (!e1.r.c(i0Var.f5024o, j10)) {
            i0Var.f5017a |= 64;
            i0Var.f5024o = j10;
        }
        if (!e1.r.c(i0Var.f5025p, j10)) {
            i0Var.f5017a |= 128;
            i0Var.f5025p = j10;
        }
        if (i0Var.f5026q != 0.0f) {
            i0Var.f5017a |= 256;
            i0Var.f5026q = 0.0f;
        }
        if (i0Var.f5027r != 0.0f) {
            i0Var.f5017a |= 512;
            i0Var.f5027r = 0.0f;
        }
        if (i0Var.f5028s != 0.0f) {
            i0Var.f5017a |= 1024;
            i0Var.f5028s = 0.0f;
        }
        if (i0Var.f5029t != 8.0f) {
            i0Var.f5017a |= 2048;
            i0Var.f5029t = 8.0f;
        }
        i0Var.f(e1.p0.f5055b);
        e1.f0 f0Var = e1.g0.f5008a;
        if (!d7.a.d(i0Var.f5031v, f0Var)) {
            i0Var.f5017a |= 8192;
            i0Var.f5031v = f0Var;
        }
        if (i0Var.f5032w) {
            i0Var.f5017a |= 16384;
            i0Var.f5032w = false;
        }
        if (!d7.a.d(null, null)) {
            i0Var.f5017a |= 131072;
        }
        if (!e1.g0.c(i0Var.f5033x, 0)) {
            i0Var.f5017a |= 32768;
            i0Var.f5033x = 0;
        }
        int i10 = d1.f.f4346d;
        i0Var.f5017a = 0;
        androidx.compose.ui.node.a aVar = this.f14395p;
        i0Var.f5034y = aVar.f1752x;
        o1.s.m0(this.f13425c);
        ((u1.w) g.z(aVar)).getSnapshotObserver().a(this, f.f14423q, new t.l0(cVar, 29));
        z zVar = this.D;
        if (zVar == null) {
            zVar = new z();
            this.D = zVar;
        }
        zVar.f14585a = i0Var.f5018b;
        zVar.f14586b = i0Var.f5019c;
        zVar.f14587c = i0Var.f5021e;
        zVar.f14588d = i0Var.f5022f;
        zVar.f14589e = i0Var.f5026q;
        zVar.f14590f = i0Var.f5027r;
        zVar.f14591g = i0Var.f5028s;
        zVar.f14592h = i0Var.f5029t;
        zVar.f14593i = i0Var.f5030u;
        j1Var.e(i0Var, aVar.f1753y, aVar.f1752x);
        this.f14399t = i0Var.f5032w;
        this.f14403x = i0Var.f5020d;
        if (!z10 || (l1Var = aVar.f1744p) == null) {
            return;
        }
        ((u1.w) l1Var).v(aVar);
    }

    @Override // r1.q
    public final m2.l getLayoutDirection() {
        return this.f14395p.f1753y;
    }

    @Override // r1.s
    public final long h(long j10) {
        if (!K0().f16742t) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        r1.s sVarD = androidx.compose.ui.layout.a.d(this);
        u1.w wVar = (u1.w) g.z(this.f14395p);
        wVar.y();
        return o(sVarD, d1.c.f(e1.a0.a(wVar.R, j10), androidx.compose.ui.layout.a.k(sVarD)));
    }

    @Override // r1.s
    public final long i(long j10) {
        long jP = P(j10);
        u1.w wVar = (u1.w) g.z(this.f14395p);
        wVar.y();
        return e1.a0.a(wVar.Q, jP);
    }

    @Override // r1.s
    public final r1.s j() {
        if (!K0().f16742t) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        R0();
        return this.f14395p.C.f14577c.f14397r;
    }

    @Override // m2.b
    public final float m() {
        return this.f14395p.f1752x.m();
    }

    @Override // t1.q0
    public final q0 m0() {
        return this.f14396q;
    }

    @Override // r1.s
    public final long o(r1.s sVar, long j10) {
        if (sVar instanceof r1.h0) {
            long jO = sVar.o(this, d9.i.f(-d1.c.d(j10), -d1.c.e(j10)));
            return d9.i.f(-d1.c.d(jO), -d1.c.e(jO));
        }
        c1 c1VarZ0 = Z0(sVar);
        c1VarZ0.R0();
        c1 c1VarG0 = G0(c1VarZ0);
        while (c1VarZ0 != c1VarG0) {
            j10 = c1VarZ0.a1(j10);
            c1VarZ0 = c1VarZ0.f14397r;
            d7.a.j(c1VarZ0);
        }
        return z0(c1VarG0, j10);
    }

    @Override // t1.q0
    public final boolean r0() {
        return this.f14404y != null;
    }

    @Override // t1.q0
    public final r1.k0 s0() {
        r1.k0 k0Var = this.f14404y;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    @Override // t1.q0
    public final long v0() {
        return this.A;
    }

    @Override // t1.m1
    public final boolean w() {
        return (this.H == null || this.f14398s || !this.f14395p.C()) ? false : true;
    }

    @Override // r1.s
    public final void x(r1.s sVar, float[] fArr) {
        c1 c1VarZ0 = Z0(sVar);
        c1VarZ0.R0();
        c1 c1VarG0 = G0(c1VarZ0);
        e1.a0.c(fArr);
        while (!d7.a.d(c1VarZ0, c1VarG0)) {
            j1 j1Var = c1VarZ0.H;
            if (j1Var != null) {
                j1Var.c(fArr);
            }
            long j10 = c1VarZ0.A;
            if (!m2.i.a(j10, m2.i.f11807b)) {
                float[] fArr2 = K;
                e1.a0.c(fArr2);
                e1.a0.e(fArr2, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                e1.a0.d(fArr, fArr2);
            }
            c1VarZ0 = c1VarZ0.f14397r;
            d7.a.j(c1VarZ0);
        }
        b1(c1VarG0, fArr);
    }

    @Override // t1.q0
    public final void x0() {
        d0(this.A, this.B, this.f14400u);
    }

    public final void y0(c1 c1Var, d1.b bVar, boolean z10) {
        if (c1Var == this) {
            return;
        }
        c1 c1Var2 = this.f14397r;
        if (c1Var2 != null) {
            c1Var2.y0(c1Var, bVar, z10);
        }
        long j10 = this.A;
        int i10 = m2.i.f11808c;
        float f10 = (int) (j10 >> 32);
        bVar.f4322a -= f10;
        bVar.f4324c -= f10;
        float f11 = (int) (j10 & 4294967295L);
        bVar.f4323b -= f11;
        bVar.f4325d -= f11;
        j1 j1Var = this.H;
        if (j1Var != null) {
            j1Var.j(bVar, true);
            if (this.f14399t && z10) {
                long j11 = this.f13425c;
                bVar.a(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L));
            }
        }
    }

    public final long z0(c1 c1Var, long j10) {
        if (c1Var == this) {
            return j10;
        }
        c1 c1Var2 = this.f14397r;
        return (c1Var2 == null || d7.a.d(c1Var, c1Var2)) ? H0(j10) : H0(c1Var2.z0(c1Var, j10));
    }
}
