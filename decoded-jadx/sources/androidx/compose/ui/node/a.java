package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import c1.f;
import c1.p;
import d9.u;
import e1.i0;
import java.util.Arrays;
import java.util.List;
import l.q;
import m0.b0;
import m0.j;
import m0.r;
import o0.i;
import r1.a1;
import r1.f0;
import r1.j0;
import t.k;
import t1.a0;
import t1.c0;
import t1.c1;
import t1.d0;
import t1.e0;
import t1.g;
import t1.g0;
import t1.h0;
import t1.j1;
import t1.k0;
import t1.k1;
import t1.l;
import t1.l0;
import t1.l1;
import t1.m1;
import t1.n0;
import t1.n1;
import t1.o0;
import t1.p1;
import t1.u0;
import t1.v;
import t1.v0;
import t1.x;
import t1.x0;
import t1.y;
import t1.y0;
import u.r0;
import u1.w;
import u1.y2;
import y0.m;
import y0.n;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j, a1, m1, l, k1 {
    public static final e0 M = new e0("Undefined intrinsics block and it is required");
    public static final d0 N = new d0();
    public static final r O = new r(1);
    public b0 A;
    public boolean B;
    public final x0 C;
    public final n0 D;
    public f0 E;
    public c1 F;
    public boolean G;
    public o H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f1738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f1740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f1741f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f1743o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l1 f1744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y1.j f1747s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f1748t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1749u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j0 f1750v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f1751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m2.b f1752x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m2.l f1753y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public y2 f1754z;

    public a(boolean z10, int i10) {
        this((i10 & 2) != 0 ? y1.l.f16789a.addAndGet(1) : 0, (i10 & 1) != 0 ? false : z10);
    }

    public static void O(a aVar, boolean z10, int i10) {
        a aVarQ;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        if (aVar.f1738c == null) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope".toString());
        }
        l1 l1Var = aVar.f1744p;
        if (l1Var == null || aVar.f1746r || aVar.f1736a) {
            return;
        }
        ((w) l1Var).w(aVar, true, z10, z11);
        k0 k0Var = aVar.D.f14509p;
        d7.a.j(k0Var);
        n0 n0Var = k0Var.D;
        a aVarQ2 = n0Var.f14494a.q();
        int i11 = n0Var.f14494a.K;
        if (aVarQ2 == null || i11 == 3) {
            return;
        }
        while (aVarQ2.K == i11 && (aVarQ = aVarQ2.q()) != null) {
            aVarQ2 = aVarQ;
        }
        int iE = k.e(i11);
        if (iE == 0) {
            if (aVarQ2.f1738c != null) {
                O(aVarQ2, z10, 2);
                return;
            } else {
                Q(aVarQ2, z10, 2);
                return;
            }
        }
        if (iE != 1) {
            throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
        }
        if (aVarQ2.f1738c != null) {
            aVarQ2.N(z10);
        } else {
            aVarQ2.P(z10);
        }
    }

    public static void Q(a aVar, boolean z10, int i10) {
        l1 l1Var;
        a aVarQ;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        if (aVar.f1746r || aVar.f1736a || (l1Var = aVar.f1744p) == null) {
            return;
        }
        ((w) l1Var).w(aVar, false, z10, z11);
        n0 n0Var = aVar.D.f14508o.L;
        a aVarQ2 = n0Var.f14494a.q();
        int i11 = n0Var.f14494a.K;
        if (aVarQ2 == null || i11 == 3) {
            return;
        }
        while (aVarQ2.K == i11 && (aVarQ = aVarQ2.q()) != null) {
            aVarQ2 = aVarQ;
        }
        int iE = k.e(i11);
        if (iE == 0) {
            Q(aVarQ2, z10, 2);
        } else {
            if (iE != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
            aVarQ2.P(z10);
        }
    }

    public static void R(a aVar) {
        int i10 = g0.f14437a[k.e(aVar.D.f14496c)];
        n0 n0Var = aVar.D;
        if (i10 != 1) {
            throw new IllegalStateException("Unexpected state ".concat(q.B(n0Var.f14496c)));
        }
        if (n0Var.f14500g) {
            O(aVar, true, 2);
            return;
        }
        if (n0Var.f14501h) {
            aVar.N(true);
        }
        if (n0Var.f14497d) {
            Q(aVar, true, 2);
        } else if (n0Var.f14498e) {
            aVar.P(true);
        }
    }

    public final void A() {
        this.f1747s = null;
        ((w) g.z(this)).x();
    }

    public final void B() {
        a aVar;
        if (this.f1739d > 0) {
            this.f1742n = true;
        }
        if (!this.f1736a || (aVar = this.f1743o) == null) {
            return;
        }
        aVar.B();
    }

    public final boolean C() {
        return this.f1744p != null;
    }

    public final boolean D() {
        return this.D.f14508o.f14490y;
    }

    public final Boolean E() {
        k0 k0Var = this.D.f14509p;
        if (k0Var != null) {
            return Boolean.valueOf(k0Var.f14472v);
        }
        return null;
    }

    public final void F() {
        a aVarQ;
        if (this.K == 3) {
            f();
        }
        k0 k0Var = this.D.f14509p;
        d7.a.j(k0Var);
        try {
            k0Var.f14463f = true;
            if (!k0Var.f14468r) {
                throw new IllegalStateException("replace() called on item that was not placed".toString());
            }
            k0Var.C = false;
            boolean z10 = k0Var.f14472v;
            k0Var.d0(k0Var.f14471u, 0.0f, null);
            if (z10 && !k0Var.C && (aVarQ = k0Var.D.f14494a.q()) != null) {
                aVarQ.N(false);
            }
            k0Var.f14463f = false;
        } catch (Throwable th) {
            k0Var.f14463f = false;
            throw th;
        }
    }

    public final void G(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 > i11 ? i10 + i13 : i10;
            int i15 = i10 > i11 ? i11 + i13 : (i11 + i12) - 2;
            v0 v0Var = this.f1740e;
            Object objN = v0Var.f14565a.n(i14);
            c9.a aVar = v0Var.f14566b;
            aVar.invoke();
            v0Var.f14565a.b(i15, (a) objN);
            aVar.invoke();
        }
        J();
        B();
        z();
    }

    public final void H(a aVar) {
        if (aVar.D.f14507n > 0) {
            n0 n0Var = this.D;
            n0Var.b(n0Var.f14507n - 1);
        }
        if (this.f1744p != null) {
            aVar.h();
        }
        aVar.f1743o = null;
        aVar.C.f14577c.f14397r = null;
        if (aVar.f1736a) {
            this.f1739d--;
            i iVar = aVar.f1740e.f14565a;
            int i10 = iVar.f12343c;
            if (i10 > 0) {
                Object[] objArr = iVar.f12341a;
                int i11 = 0;
                do {
                    ((a) objArr[i11]).C.f14577c.f14397r = null;
                    i11++;
                } while (i11 < i10);
            }
        }
        B();
        J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void I() {
        n nVar;
        x0 x0Var = this.C;
        x xVar = x0Var.f14576b;
        boolean zR = g.r(128);
        if (zR) {
            nVar = xVar.N;
        } else {
            nVar = xVar.N.f16734e;
            if (nVar == null) {
                return;
            }
        }
        i0 i0Var = c1.I;
        for (n nVarM0 = xVar.M0(zR); nVarM0 != null && (nVarM0.f16733d & 128) != 0; nVarM0 = nVarM0.f16735f) {
            if ((nVarM0.f16732c & 128) != 0) {
                ?? F = nVarM0;
                ?? iVar = 0;
                while (F != 0) {
                    if (F instanceof a0) {
                        ((a0) F).R(x0Var.f14576b);
                    } else if ((F.f16732c & 128) != 0 && (F instanceof t1.o)) {
                        n nVar2 = ((t1.o) F).f14521v;
                        int i10 = 0;
                        F = F;
                        iVar = iVar;
                        while (nVar2 != null) {
                            if ((nVar2.f16732c & 128) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    iVar = iVar;
                                    F = nVar2;
                                } else {
                                    if (iVar == 0) {
                                        iVar = new i(new n[16]);
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
            if (nVarM0 == nVar) {
                return;
            }
        }
    }

    public final void J() {
        if (!this.f1736a) {
            this.f1749u = true;
            return;
        }
        a aVarQ = q();
        if (aVarQ != null) {
            aVarQ.J();
        }
    }

    public final void K() {
        v0 v0Var = this.f1740e;
        int i10 = v0Var.f14565a.f12343c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                v0Var.f14565a.g();
                v0Var.f14566b.invoke();
                return;
            }
            H((a) v0Var.f14565a.f12341a[i10]);
        }
    }

    public final void L(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(q.h("count (", i11, ") must be greater than 0").toString());
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            v0 v0Var = this.f1740e;
            Object objN = v0Var.f14565a.n(i12);
            v0Var.f14566b.invoke();
            H((a) objN);
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    public final void M() {
        a aVarQ;
        if (this.K == 3) {
            f();
        }
        l0 l0Var = this.D.f14508o;
        l0Var.getClass();
        try {
            l0Var.f14478f = true;
            if (!l0Var.f14482q) {
                throw new IllegalStateException("replace called on unplaced item".toString());
            }
            boolean z10 = l0Var.f14490y;
            l0Var.x0(l0Var.f14485t, l0Var.f14487v, l0Var.f14486u);
            if (z10 && !l0Var.G && (aVarQ = l0Var.L.f14494a.q()) != null) {
                aVarQ.P(false);
            }
            l0Var.f14478f = false;
        } catch (Throwable th) {
            l0Var.f14478f = false;
            throw th;
        }
    }

    public final void N(boolean z10) {
        l1 l1Var;
        if (this.f1736a || (l1Var = this.f1744p) == null) {
            return;
        }
        w wVar = (w) l1Var;
        if (wVar.L.n(this, z10)) {
            wVar.z(null);
        }
    }

    public final void P(boolean z10) {
        l1 l1Var;
        if (this.f1736a || (l1Var = this.f1744p) == null) {
            return;
        }
        w wVar = (w) l1Var;
        if (wVar.L.p(this, z10)) {
            wVar.z(null);
        }
    }

    public final void S() {
        int i10;
        x0 x0Var = this.C;
        for (n nVar = x0Var.f14578d; nVar != null; nVar = nVar.f16734e) {
            if (nVar.f16742t) {
                nVar.C0();
            }
        }
        i iVar = x0Var.f14580f;
        if (iVar != null && (i10 = iVar.f12343c) > 0) {
            Object[] objArr = iVar.f12341a;
            int i11 = 0;
            do {
                m mVar = (m) objArr[i11];
                if (mVar instanceof SuspendPointerInputElement) {
                    iVar.p(i11, new ForceUpdateElement((u0) mVar));
                }
                i11++;
            } while (i11 < i10);
        }
        n nVar2 = x0Var.f14578d;
        for (n nVar3 = nVar2; nVar3 != null; nVar3 = nVar3.f16734e) {
            if (nVar3.f16742t) {
                nVar3.E0();
            }
        }
        while (nVar2 != null) {
            if (nVar2.f16742t) {
                nVar2.y0();
            }
            nVar2 = nVar2.f16734e;
        }
    }

    public final void T() {
        i iVarT = t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                a aVar = (a) objArr[i11];
                int i12 = aVar.L;
                aVar.K = i12;
                if (i12 != 3) {
                    aVar.T();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void U(m2.b bVar) {
        if (d7.a.d(this.f1752x, bVar)) {
            return;
        }
        this.f1752x = bVar;
        z();
        a aVarQ = q();
        if (aVarQ != null) {
            aVarQ.x();
        }
        y();
        n nVar = this.C.f14579e;
        if ((nVar.f16733d & 16) != 0) {
            while (nVar != null) {
                if ((nVar.f16732c & 16) != 0) {
                    ?? F = nVar;
                    ?? iVar = 0;
                    while (F != 0) {
                        if (F instanceof p1) {
                            ((p1) F).k();
                        } else if ((F.f16732c & 16) != 0 && (F instanceof t1.o)) {
                            n nVar2 = ((t1.o) F).f14521v;
                            int i10 = 0;
                            F = F;
                            iVar = iVar;
                            while (nVar2 != null) {
                                if ((nVar2.f16732c & 16) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        iVar = iVar;
                                        F = nVar2;
                                    } else {
                                        if (iVar == 0) {
                                            iVar = new i(new n[16]);
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
                if ((nVar.f16733d & 16) == 0) {
                    return;
                } else {
                    nVar = nVar.f16735f;
                }
            }
        }
    }

    public final void V(a aVar) {
        if (d7.a.d(aVar, this.f1738c)) {
            return;
        }
        this.f1738c = aVar;
        if (aVar != null) {
            n0 n0Var = this.D;
            if (n0Var.f14509p == null) {
                n0Var.f14509p = new k0(n0Var);
            }
            x0 x0Var = this.C;
            c1 c1Var = x0Var.f14576b.f14396q;
            for (c1 c1Var2 = x0Var.f14577c; !d7.a.d(c1Var2, c1Var) && c1Var2 != null; c1Var2 = c1Var2.f14396q) {
                c1Var2.F0();
            }
        }
        z();
    }

    public final void W(j0 j0Var) {
        if (d7.a.d(this.f1750v, j0Var)) {
            return;
        }
        this.f1750v = j0Var;
        this.f1751w.f14584b.setValue(j0Var);
        z();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void X(o oVar) {
        if (this.f1736a && this.H != y0.l.f16729b) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        boolean z10 = true;
        if (!(!this.J)) {
            throw new IllegalArgumentException("modifier is updated when deactivated".toString());
        }
        this.H = oVar;
        x0 x0Var = this.C;
        n nVar = x0Var.f14579e;
        n nVarB = b.f1755a;
        if (nVar == nVarB) {
            throw new IllegalStateException("padChain called on already padded chain".toString());
        }
        nVar.f16734e = nVarB;
        nVarB.f16735f = nVar;
        i iVar = x0Var.f14580f;
        int i10 = 0;
        int i11 = iVar != null ? iVar.f12343c : 0;
        i iVar2 = x0Var.f14581g;
        if (iVar2 == null) {
            iVar2 = new i(new m[16]);
        }
        i iVar3 = iVar2;
        int i12 = iVar3.f12343c;
        if (i12 < 16) {
            i12 = 16;
        }
        i iVar4 = new i(new o[i12]);
        iVar4.c(oVar);
        h1.b bVar = null;
        while (iVar4.l()) {
            o oVar2 = (o) iVar4.n(iVar4.f12343c - 1);
            if (oVar2 instanceof y0.i) {
                y0.i iVar5 = (y0.i) oVar2;
                iVar4.c(iVar5.f16726c);
                iVar4.c(iVar5.f16725b);
            } else if (oVar2 instanceof m) {
                iVar3.c(oVar2);
            } else {
                if (bVar == null) {
                    bVar = new h1.b(iVar3, 5);
                }
                oVar2.c(bVar);
                bVar = bVar;
            }
        }
        int i13 = iVar3.f12343c;
        n nVar2 = x0Var.f14578d;
        a aVar = x0Var.f14575a;
        if (i13 == i11) {
            n nVar3 = nVarB.f16735f;
            int i14 = 0;
            while (nVar3 != null && i14 < i11) {
                if (iVar == null) {
                    throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                }
                m mVar = (m) iVar.f12341a[i14];
                m mVar2 = (m) iVar3.f12341a[i14];
                int iA = b.a(mVar, mVar2);
                if (iA == 0) {
                    nVar3 = nVar3.f16734e;
                    break;
                }
                if (iA == 1) {
                    x0.h(mVar, mVar2, nVar3);
                }
                nVar3 = nVar3.f16735f;
                i14++;
            }
            n nVar4 = nVar3;
            if (i14 >= i11) {
                z10 = false;
            } else {
                if (iVar == null) {
                    throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                }
                if (nVar4 == null) {
                    throw new IllegalStateException("structuralUpdate requires a non-null tail".toString());
                }
                x0Var.f(i14, iVar, iVar3, nVar4, aVar.C());
            }
        } else if (!aVar.C() && i11 == 0) {
            for (int i15 = 0; i15 < iVar3.f12343c; i15++) {
                nVarB = x0.b((m) iVar3.f12341a[i15], nVarB);
            }
            for (n nVar5 = nVar2.f16734e; nVar5 != null && nVar5 != b.f1755a; nVar5 = nVar5.f16734e) {
                i10 |= nVar5.f16732c;
                nVar5.f16733d = i10;
            }
        } else if (iVar3.f12343c != 0) {
            if (iVar == null) {
                iVar = new i(new m[16]);
            }
            x0Var.f(0, iVar, iVar3, nVarB, aVar.C());
        } else {
            if (iVar == null) {
                throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
            }
            n nVar6 = nVarB.f16735f;
            for (int i16 = 0; nVar6 != null && i16 < iVar.f12343c; i16++) {
                nVar6 = x0.c(nVar6).f16735f;
            }
            a aVarQ = aVar.q();
            x xVar = aVarQ != null ? aVarQ.C.f14576b : null;
            x xVar2 = x0Var.f14576b;
            xVar2.f14397r = xVar;
            x0Var.f14577c = xVar2;
            z10 = false;
        }
        x0Var.f14580f = iVar3;
        if (iVar != null) {
            iVar.g();
        } else {
            iVar = null;
        }
        x0Var.f14581g = iVar;
        y0 y0Var = b.f1755a;
        n nVar7 = y0Var.f16735f;
        if (nVar7 != null) {
            nVar2 = nVar7;
        }
        nVar2.f16734e = null;
        y0Var.f16735f = null;
        y0Var.f16733d = -1;
        y0Var.f16737o = null;
        if (nVar2 == y0Var) {
            throw new IllegalStateException("trimChain did not update the head".toString());
        }
        x0Var.f14579e = nVar2;
        if (z10) {
            x0Var.g();
        }
        this.D.e();
        if (x0Var.d(512) && this.f1738c == null) {
            V(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void Y(y2 y2Var) {
        if (d7.a.d(this.f1754z, y2Var)) {
            return;
        }
        this.f1754z = y2Var;
        n nVar = this.C.f14579e;
        if ((nVar.f16733d & 16) != 0) {
            while (nVar != null) {
                if ((nVar.f16732c & 16) != 0) {
                    ?? F = nVar;
                    ?? iVar = 0;
                    while (F != 0) {
                        if (F instanceof p1) {
                            ((p1) F).X();
                        } else if ((F.f16732c & 16) != 0 && (F instanceof t1.o)) {
                            n nVar2 = ((t1.o) F).f14521v;
                            int i10 = 0;
                            F = F;
                            iVar = iVar;
                            while (nVar2 != null) {
                                if ((nVar2.f16732c & 16) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        iVar = iVar;
                                        F = nVar2;
                                    } else {
                                        if (iVar == 0) {
                                            iVar = new i(new n[16]);
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
                if ((nVar.f16733d & 16) == 0) {
                    return;
                } else {
                    nVar = nVar.f16735f;
                }
            }
        }
    }

    public final void Z() {
        if (this.f1739d <= 0 || !this.f1742n) {
            return;
        }
        int i10 = 0;
        this.f1742n = false;
        i iVar = this.f1741f;
        if (iVar == null) {
            iVar = new i(new a[16]);
            this.f1741f = iVar;
        }
        iVar.g();
        i iVar2 = this.f1740e.f14565a;
        int i11 = iVar2.f12343c;
        if (i11 > 0) {
            Object[] objArr = iVar2.f12341a;
            do {
                a aVar = (a) objArr[i10];
                if (aVar.f1736a) {
                    iVar.d(iVar.f12343c, aVar.t());
                } else {
                    iVar.c(aVar);
                }
                i10++;
            } while (i10 < i11);
        }
        n0 n0Var = this.D;
        n0Var.f14508o.C = true;
        k0 k0Var = n0Var.f14509p;
        if (k0Var != null) {
            k0Var.f14475y = true;
        }
    }

    @Override // m0.j
    public final void a() {
        if (!C()) {
            throw new IllegalArgumentException("onReuse is only expected on attached node".toString());
        }
        f0 f0Var = this.E;
        if (f0Var != null) {
            f0Var.f(false);
        }
        if (this.J) {
            this.J = false;
            A();
        } else {
            S();
        }
        this.f1737b = y1.l.f16789a.addAndGet(1);
        x0 x0Var = this.C;
        for (n nVar = x0Var.f14579e; nVar != null; nVar = nVar.f16735f) {
            nVar.x0();
        }
        x0Var.e();
        R(this);
    }

    @Override // m0.j
    public final void b() {
        f0 f0Var = this.E;
        if (f0Var != null) {
            f0Var.b();
        }
        x0 x0Var = this.C;
        c1 c1Var = x0Var.f14576b.f14396q;
        for (c1 c1Var2 = x0Var.f14577c; !d7.a.d(c1Var2, c1Var) && c1Var2 != null; c1Var2 = c1Var2.f14396q) {
            c1Var2.f14398s = true;
            c1Var2.F.invoke();
            if (c1Var2.H != null) {
                c1Var2.c1(null, false);
            }
        }
    }

    @Override // m0.j
    public final void c() {
        f0 f0Var = this.E;
        if (f0Var != null) {
            f0Var.f(true);
        }
        this.J = true;
        S();
        if (C()) {
            A();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(l1 l1Var) {
        a aVar;
        if (this.f1744p != null) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + g(0)).toString());
        }
        a aVar2 = this.f1743o;
        if (aVar2 != null && !d7.a.d(aVar2.f1744p, l1Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(l1Var);
            sb.append(") than the parent's owner(");
            a aVarQ = q();
            sb.append(aVarQ != null ? aVarQ.f1744p : null);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            a aVar3 = this.f1743o;
            sb.append(aVar3 != null ? aVar3.g(0) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        a aVarQ2 = q();
        n0 n0Var = this.D;
        if (aVarQ2 == null) {
            n0Var.f14508o.f14490y = true;
            k0 k0Var = n0Var.f14509p;
            if (k0Var != null) {
                k0Var.f14472v = true;
            }
        }
        x0 x0Var = this.C;
        x0Var.f14577c.f14397r = aVarQ2 != null ? aVarQ2.C.f14576b : null;
        this.f1744p = l1Var;
        this.f1745q = (aVarQ2 != null ? aVarQ2.f1745q : -1) + 1;
        if (x0Var.d(8)) {
            A();
        }
        l1Var.getClass();
        a aVar4 = this.f1743o;
        if (aVar4 == null || (aVar = aVar4.f1738c) == null) {
            aVar = this.f1738c;
        }
        V(aVar);
        if (!this.J) {
            for (n nVar = x0Var.f14579e; nVar != null; nVar = nVar.f16735f) {
                nVar.x0();
            }
        }
        i iVar = this.f1740e.f14565a;
        int i10 = iVar.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVar.f12341a;
            int i11 = 0;
            do {
                ((a) objArr[i11]).d(l1Var);
                i11++;
            } while (i11 < i10);
        }
        if (!this.J) {
            x0Var.e();
        }
        z();
        if (aVarQ2 != null) {
            aVarQ2.z();
        }
        c1 c1Var = x0Var.f14576b.f14396q;
        for (c1 c1Var2 = x0Var.f14577c; !d7.a.d(c1Var2, c1Var) && c1Var2 != null; c1Var2 = c1Var2.f14396q) {
            c1Var2.c1(c1Var2.f14400u, true);
            j1 j1Var = c1Var2.H;
            if (j1Var != null) {
                j1Var.invalidate();
            }
        }
        n0Var.e();
        if (this.J) {
            return;
        }
        n nVar2 = x0Var.f14579e;
        if ((nVar2.f16733d & 7168) != 0) {
            while (nVar2 != null) {
                int i12 = nVar2.f16732c;
                if (((i12 & 4096) != 0) | (((i12 & 1024) != 0) | ((i12 & 2048) != 0) ? 1 : 0)) {
                    g.h(nVar2);
                }
                nVar2 = nVar2.f16735f;
            }
        }
    }

    public final void e() {
        this.L = this.K;
        this.K = 3;
        i iVarT = t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                a aVar = (a) objArr[i11];
                if (aVar.K != 3) {
                    aVar.e();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final void f() {
        this.L = this.K;
        this.K = 3;
        i iVarT = t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                a aVar = (a) objArr[i11];
                if (aVar.K == 2) {
                    aVar.f();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final String g(int i10) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        i iVarT = t();
        int i12 = iVarT.f12343c;
        if (i12 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i13 = 0;
            do {
                sb.append(((a) objArr[i13]).g(i10 + 1));
                i13++;
            } while (i13 < i12);
        }
        String string = sb.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final void h() {
        o0 o0Var;
        l1 l1Var = this.f1744p;
        if (l1Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            a aVarQ = q();
            sb.append(aVarQ != null ? aVarQ.g(0) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        x0 x0Var = this.C;
        int i10 = x0Var.f14579e.f16733d & 1024;
        n nVar = x0Var.f14578d;
        if (i10 != 0) {
            for (n nVar2 = nVar; nVar2 != null; nVar2 = nVar2.f16734e) {
                if ((nVar2.f16732c & 1024) != 0) {
                    i iVar = null;
                    n nVarF = nVar2;
                    while (nVarF != null) {
                        if (nVarF instanceof p) {
                            p pVar = (p) nVarF;
                            if (pVar.H0().a()) {
                                ((f) ((w) g.z(this)).getFocusOwner()).a(true, false);
                                pVar.J0();
                            }
                        } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof t1.o)) {
                            int i11 = 0;
                            for (n nVar3 = ((t1.o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                if ((nVar3.f16732c & 1024) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        nVarF = nVar3;
                                    } else {
                                        if (iVar == null) {
                                            iVar = new i(new n[16]);
                                        }
                                        if (nVarF != null) {
                                            iVar.c(nVarF);
                                            nVarF = null;
                                        }
                                        iVar.c(nVar3);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        nVarF = g.f(iVar);
                    }
                }
            }
        }
        a aVarQ2 = q();
        n0 n0Var = this.D;
        if (aVarQ2 != null) {
            aVarQ2.x();
            aVarQ2.z();
            n0Var.f14508o.f14483r = 3;
            k0 k0Var = n0Var.f14509p;
            if (k0Var != null) {
                k0Var.f14466p = 3;
            }
        }
        h0 h0Var = n0Var.f14508o.A;
        h0Var.f14369b = true;
        h0Var.f14370c = false;
        h0Var.f14372e = false;
        h0Var.f14371d = false;
        h0Var.f14373f = false;
        h0Var.f14374g = false;
        h0Var.f14375h = null;
        k0 k0Var2 = n0Var.f14509p;
        if (k0Var2 != null && (o0Var = k0Var2.f14473w) != null) {
            o0Var.f14369b = true;
            o0Var.f14370c = false;
            o0Var.f14372e = false;
            o0Var.f14371d = false;
            o0Var.f14373f = false;
            o0Var.f14374g = false;
            o0Var.f14375h = null;
        }
        if (x0Var.d(8)) {
            A();
        }
        for (n nVar4 = nVar; nVar4 != null; nVar4 = nVar4.f16734e) {
            if (nVar4.f16742t) {
                nVar4.E0();
            }
        }
        this.f1746r = true;
        i iVar2 = this.f1740e.f14565a;
        int i12 = iVar2.f12343c;
        if (i12 > 0) {
            Object[] objArr = iVar2.f12341a;
            int i13 = 0;
            do {
                ((a) objArr[i13]).h();
                i13++;
            } while (i13 < i12);
        }
        this.f1746r = false;
        while (nVar != null) {
            if (nVar.f16742t) {
                nVar.y0();
            }
            nVar = nVar.f16734e;
        }
        w wVar = (w) l1Var;
        t1.r rVar = wVar.L.f14547b;
        rVar.f14534a.c(this);
        rVar.f14535b.c(this);
        wVar.C = true;
        this.f1744p = null;
        V(null);
        this.f1745q = 0;
        l0 l0Var = n0Var.f14508o;
        l0Var.f14480o = Integer.MAX_VALUE;
        l0Var.f14479n = Integer.MAX_VALUE;
        l0Var.f14490y = false;
        k0 k0Var3 = n0Var.f14509p;
        if (k0Var3 != null) {
            k0Var3.f14465o = Integer.MAX_VALUE;
            k0Var3.f14464n = Integer.MAX_VALUE;
            k0Var3.f14472v = false;
        }
    }

    public final void i(e1.p pVar) {
        this.C.f14577c.C0(pVar);
    }

    public final void j() {
        if (this.f1738c != null) {
            O(this, false, 1);
        } else {
            Q(this, false, 1);
        }
        l0 l0Var = this.D.f14508o;
        m2.a aVar = l0Var.f14481p ? new m2.a(l0Var.f13426d) : null;
        if (aVar != null) {
            l1 l1Var = this.f1744p;
            if (l1Var != null) {
                ((w) l1Var).s(this, aVar.f11792a);
                return;
            }
            return;
        }
        l1 l1Var2 = this.f1744p;
        if (l1Var2 != null) {
            ((w) l1Var2).r(true);
        }
    }

    public final List k() {
        k0 k0Var = this.D.f14509p;
        d7.a.j(k0Var);
        n0 n0Var = k0Var.D;
        n0Var.f14494a.m();
        boolean z10 = k0Var.f14475y;
        i iVar = k0Var.f14474x;
        if (!z10) {
            return iVar.f();
        }
        a aVar = n0Var.f14494a;
        i iVarT = aVar.t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                a aVar2 = (a) objArr[i11];
                if (iVar.f12343c <= i11) {
                    k0 k0Var2 = aVar2.D.f14509p;
                    d7.a.j(k0Var2);
                    iVar.c(k0Var2);
                } else {
                    k0 k0Var3 = aVar2.D.f14509p;
                    d7.a.j(k0Var3);
                    iVar.p(i11, k0Var3);
                }
                i11++;
            } while (i11 < i10);
        }
        iVar.o(aVar.m().size(), iVar.f12343c);
        k0Var.f14475y = false;
        return iVar.f();
    }

    public final List l() {
        return this.D.f14508o.j0();
    }

    public final List m() {
        return t().f();
    }

    public final y1.j n() {
        if (!this.C.d(8) || this.f1747s != null) {
            return this.f1747s;
        }
        u uVar = new u();
        uVar.f4952a = new y1.j();
        n1 snapshotObserver = ((w) g.z(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f14515d, new r0(this, uVar));
        y1.j jVar = (y1.j) uVar.f4952a;
        this.f1747s = jVar;
        return jVar;
    }

    public final List o() {
        return this.f1740e.f14565a.f();
    }

    public final int p() {
        int i10;
        k0 k0Var = this.D.f14509p;
        if (k0Var == null || (i10 = k0Var.f14466p) == 0) {
            return 3;
        }
        return i10;
    }

    public final a q() {
        a aVar = this.f1743o;
        while (aVar != null && aVar.f1736a) {
            aVar = aVar.f1743o;
        }
        return aVar;
    }

    public final int r() {
        return this.D.f14508o.f14480o;
    }

    public final i s() {
        boolean z10 = this.f1749u;
        i iVar = this.f1748t;
        if (z10) {
            iVar.g();
            iVar.d(iVar.f12343c, t());
            r rVar = O;
            Object[] objArr = iVar.f12341a;
            int i10 = iVar.f12343c;
            d7.a.m(objArr, "<this>");
            Arrays.sort(objArr, 0, i10, rVar);
            this.f1749u = false;
        }
        return iVar;
    }

    public final i t() {
        Z();
        if (this.f1739d == 0) {
            return this.f1740e.f14565a;
        }
        i iVar = this.f1741f;
        d7.a.j(iVar);
        return iVar;
    }

    public final String toString() {
        return i1.b.I(this) + " children: " + m().size() + " measurePolicy: " + this.f1750v;
    }

    public final void u(long j10, v vVar, boolean z10, boolean z11) {
        x0 x0Var = this.C;
        x0Var.f14577c.N0(c1.L, x0Var.f14577c.H0(j10), vVar, z10, z11);
    }

    public final void v(int i10, a aVar) {
        if (aVar.f1743o != null) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(aVar);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(g(0));
            sb.append(" Other tree: ");
            a aVar2 = aVar.f1743o;
            sb.append(aVar2 != null ? aVar2.g(0) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (aVar.f1744p != null) {
            throw new IllegalStateException(("Cannot insert " + aVar + " because it already has an owner. This tree: " + g(0) + " Other tree: " + aVar.g(0)).toString());
        }
        aVar.f1743o = this;
        v0 v0Var = this.f1740e;
        v0Var.f14565a.b(i10, aVar);
        v0Var.f14566b.invoke();
        J();
        if (aVar.f1736a) {
            this.f1739d++;
        }
        B();
        l1 l1Var = this.f1744p;
        if (l1Var != null) {
            aVar.d(l1Var);
        }
        if (aVar.D.f14507n > 0) {
            n0 n0Var = this.D;
            n0Var.b(n0Var.f14507n + 1);
        }
    }

    @Override // t1.m1
    public final boolean w() {
        return C();
    }

    public final void x() {
        if (this.G) {
            x0 x0Var = this.C;
            c1 c1Var = x0Var.f14576b;
            c1 c1Var2 = x0Var.f14577c.f14397r;
            this.F = null;
            while (!d7.a.d(c1Var, c1Var2)) {
                if ((c1Var != null ? c1Var.H : null) != null) {
                    this.F = c1Var;
                    break;
                }
                c1Var = c1Var != null ? c1Var.f14397r : null;
            }
        }
        c1 c1Var3 = this.F;
        if (c1Var3 != null && c1Var3.H == null) {
            throw new IllegalStateException("layer was not set".toString());
        }
        if (c1Var3 != null) {
            c1Var3.P0();
            return;
        }
        a aVarQ = q();
        if (aVarQ != null) {
            aVarQ.x();
        }
    }

    public final void y() {
        x0 x0Var = this.C;
        c1 c1Var = x0Var.f14577c;
        x xVar = x0Var.f14576b;
        while (c1Var != xVar) {
            d7.a.k(c1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            c0 c0Var = (c0) c1Var;
            j1 j1Var = c0Var.H;
            if (j1Var != null) {
                j1Var.invalidate();
            }
            c1Var = c0Var.f14396q;
        }
        j1 j1Var2 = x0Var.f14576b.H;
        if (j1Var2 != null) {
            j1Var2.invalidate();
        }
    }

    public final void z() {
        if (this.f1738c != null) {
            O(this, false, 3);
        } else {
            Q(this, false, 3);
        }
    }

    public a(int i10, boolean z10) {
        this.f1736a = z10;
        this.f1737b = i10;
        this.f1740e = new v0(new i(new a[16]), new t.l0(this, 25));
        this.f1748t = new i(new a[16]);
        this.f1749u = true;
        this.f1750v = M;
        this.f1751w = new y(this);
        this.f1752x = g.f14436b;
        this.f1753y = m2.l.f11815a;
        this.f1754z = N;
        b0.f11458g.getClass();
        this.A = m0.a0.f11445b;
        this.K = 3;
        this.L = 3;
        this.C = new x0(this);
        this.D = new n0(this);
        this.G = true;
        this.H = y0.l.f16729b;
    }
}
