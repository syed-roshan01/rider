package t1;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import v.f2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends y0.n implements b0, s, r1, p1, s1.f, s1.h, o1, a0, t, c1.c, c1.j, c1.l, m1, b1.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y0.m f14406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s1.a f14407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HashSet f14408w;

    @Override // y0.n
    public final void A0() {
        H0();
    }

    public final void G0(boolean z10) {
        if (!this.f16742t) {
            throw new IllegalStateException("initializeModifier called on unattached node".toString());
        }
        y0.m mVar = this.f14406u;
        if ((this.f16732c & 32) != 0) {
            if (mVar instanceof s1.d) {
                c cVar = new c(this, 0);
                o0.i iVar = ((u1.w) g.A(this)).f15348u0;
                if (!iVar.h(cVar)) {
                    iVar.c(cVar);
                }
            }
            if (mVar instanceof s1.g) {
                s1.g gVar = (s1.g) mVar;
                s1.a aVar = this.f14407v;
                if (aVar == null || !aVar.B(gVar.getKey())) {
                    s1.a aVar2 = new s1.a();
                    aVar2.f13905z = gVar;
                    this.f14407v = aVar2;
                    if (g.d(this)) {
                        s1.e modifierLocalManager = ((u1.w) g.A(this)).getModifierLocalManager();
                        s1.i key = gVar.getKey();
                        modifierLocalManager.f13909b.c(this);
                        modifierLocalManager.f13910c.c(key);
                        modifierLocalManager.a();
                    }
                } else {
                    aVar.f13905z = gVar;
                    s1.e modifierLocalManager2 = ((u1.w) g.A(this)).getModifierLocalManager();
                    s1.i key2 = gVar.getKey();
                    modifierLocalManager2.f13909b.c(this);
                    modifierLocalManager2.f13910c.c(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f16732c & 4) != 0 && !z10) {
            g.x(this, 2).P0();
        }
        if ((this.f16732c & 2) != 0) {
            if (g.d(this)) {
                c1 c1Var = this.f16737o;
                d7.a.j(c1Var);
                ((c0) c1Var).N = this;
                j1 j1Var = c1Var.H;
                if (j1Var != null) {
                    j1Var.invalidate();
                }
            }
            if (!z10) {
                g.x(this, 2).P0();
                g.y(this).z();
            }
        }
        if (mVar instanceof r1.b1) {
            androidx.compose.ui.node.a aVarY = g.y(this);
            z.b0 b0Var = (z.b0) ((r1.b1) mVar);
            int i10 = b0Var.f17018b;
            f2 f2Var = b0Var.f17019c;
            switch (i10) {
                case 0:
                    ((z.g0) f2Var).f17057m = aVarY;
                    break;
                default:
                    ((b0.h0) f2Var).f2416x.setValue(aVarY);
                    break;
            }
        }
        if ((this.f16732c & 128) != 0 && (mVar instanceof r1.s0) && g.d(this)) {
            g.y(this).z();
        }
        if ((this.f16732c & 256) != 0 && (mVar instanceof r1.q0) && g.d(this)) {
            g.y(this).z();
        }
        if ((this.f16732c & 8) != 0) {
            ((u1.w) g.A(this)).x();
        }
    }

    public final void H0() {
        if (!this.f16742t) {
            throw new IllegalStateException("unInitializeModifier called on unattached node".toString());
        }
        y0.m mVar = this.f14406u;
        if ((this.f16732c & 32) != 0) {
            if (mVar instanceof s1.g) {
                s1.e modifierLocalManager = ((u1.w) g.A(this)).getModifierLocalManager();
                s1.i key = ((s1.g) mVar).getKey();
                modifierLocalManager.f13911d.c(g.y(this));
                modifierLocalManager.f13912e.c(key);
                modifierLocalManager.a();
            }
            if (mVar instanceof s1.d) {
                ((s1.d) mVar).g(g.f14435a);
            }
        }
        if ((this.f16732c & 8) != 0) {
            ((u1.w) g.A(this)).x();
        }
    }

    public final void I0() {
        if (this.f16742t) {
            this.f14408w.clear();
            ((u1.w) g.A(this)).getSnapshotObserver().a(this, f.f14415b, new c(this, 1));
        }
    }

    @Override // t1.p1
    public final boolean P() {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        l.q.w(mVar);
        throw null;
    }

    @Override // t1.r1
    public final void Q(y1.j jVar) {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        y1.j jVarK = ((y1.k) mVar).k();
        d7.a.k(jVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if (jVarK.f16787b) {
            jVar.f16787b = true;
        }
        if (jVarK.f16788c) {
            jVar.f16788c = true;
        }
        for (Map.Entry entry : jVarK.f16786a.entrySet()) {
            y1.u uVar = (y1.u) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = jVar.f16786a;
            if (!linkedHashMap.containsKey(uVar)) {
                linkedHashMap.put(uVar, value);
            } else if (value instanceof y1.a) {
                Object obj = linkedHashMap.get(uVar);
                d7.a.k(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                y1.a aVar = (y1.a) obj;
                String str = aVar.f16745a;
                if (str == null) {
                    str = ((y1.a) value).f16745a;
                }
                q8.a aVar2 = aVar.f16746b;
                if (aVar2 == null) {
                    aVar2 = ((y1.a) value).f16746b;
                }
                linkedHashMap.put(uVar, new y1.a(str, aVar2));
            }
        }
    }

    @Override // t1.a0
    public final void R(c1 c1Var) {
    }

    @Override // t1.b0
    public final int a(r1.q qVar, r1.p pVar, int i10) {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((r1.v) mVar).a(qVar, pVar, i10);
    }

    @Override // c1.c
    public final void a0(c1.o oVar) {
        throw new IllegalStateException("onFocusEvent called on wrong node".toString());
    }

    @Override // t1.b0
    public final int b(r1.q qVar, r1.p pVar, int i10) {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((r1.v) mVar).b(qVar, pVar, i10);
    }

    @Override // t1.p1
    public final void b0() {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        l.q.w(mVar);
        throw null;
    }

    @Override // b1.a
    public final m2.b c() {
        return g.y(this).f1752x;
    }

    @Override // t1.b0
    public final int d(r1.q qVar, r1.p pVar, int i10) {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((r1.v) mVar).d(qVar, pVar, i10);
    }

    @Override // b1.a
    public final long e() {
        return o1.s.m0(g.x(this, 128).f13425c);
    }

    @Override // t1.b0
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((r1.v) mVar).f(l0Var, i0Var, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // s1.f, s1.h
    public final Object g(s1.i iVar) {
        x0 x0Var;
        this.f14408w.add(iVar);
        y0.n nVar = this.f16730a;
        if (!nVar.f16742t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        y0.n nVar2 = nVar.f16734e;
        androidx.compose.ui.node.a aVarY = g.y(this);
        while (aVarY != null) {
            if ((aVarY.C.f14579e.f16733d & 32) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f16732c & 32) != 0) {
                        ?? F = nVar2;
                        ?? iVar2 = 0;
                        while (F != 0) {
                            if (F instanceof s1.f) {
                                s1.f fVar = (s1.f) F;
                                if (fVar.j().B(iVar)) {
                                    return fVar.j().I(iVar);
                                }
                            } else if ((F.f16732c & 32) != 0 && (F instanceof o)) {
                                y0.n nVar3 = ((o) F).f14521v;
                                int i10 = 0;
                                F = F;
                                iVar2 = iVar2;
                                while (nVar3 != null) {
                                    if ((nVar3.f16732c & 32) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            iVar2 = iVar2;
                                            F = nVar3;
                                        } else {
                                            if (iVar2 == 0) {
                                                iVar2 = new o0.i(new y0.n[16]);
                                            }
                                            if (F != 0) {
                                                iVar2.c(F);
                                                F = 0;
                                            }
                                            iVar2.c(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f16735f;
                                    F = F;
                                    iVar2 = iVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            F = g.f(iVar2);
                        }
                    }
                    nVar2 = nVar2.f16734e;
                }
            }
            aVarY = aVarY.q();
            nVar2 = (aVarY == null || (x0Var = aVarY.C) == null) ? null : x0Var.f14578d;
        }
        return iVar.f13907a.invoke();
    }

    @Override // b1.a
    public final m2.l getLayoutDirection() {
        return g.y(this).f1753y;
    }

    @Override // t1.b0
    public final int h(r1.q qVar, r1.p pVar, int i10) {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((r1.v) mVar).h(qVar, pVar, i10);
    }

    @Override // t1.o1
    public final Object h0(Object obj) {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (s.s) ((r1.u0) mVar);
    }

    @Override // t1.s
    public final void i(g1.e eVar) {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((b1.f) mVar).i(eVar);
    }

    @Override // s1.f
    public final f6.a j() {
        s1.a aVar = this.f14407v;
        return aVar != null ? aVar : s1.b.f13906z;
    }

    @Override // t1.s
    public final void j0() {
        g.s(this);
    }

    @Override // t1.p1
    public final boolean m0() {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        l.q.w(mVar);
        throw null;
    }

    @Override // t1.a0
    public final void p(long j10) {
        y0.m mVar = this.f14406u;
        if (mVar instanceof r1.s0) {
            r1.t0 t0Var = (r1.t0) ((r1.s0) mVar);
            if (m2.k.a(t0Var.f13414d, j10)) {
                return;
            }
            t0Var.f13413c.invoke(new m2.k(j10));
            t0Var.f13414d = j10;
        }
    }

    @Override // t1.t
    public final void r0(c1 c1Var) {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        a0.b bVar = (a0.b) ((r1.q0) mVar);
        if (bVar.f776b) {
            return;
        }
        bVar.f776b = true;
        u8.l lVar = bVar.f777c;
        if (lVar != null) {
            lVar.resumeWith(q8.l.f13235a);
        }
        bVar.f777c = null;
    }

    @Override // c1.j
    public final void s0(c1.h hVar) {
        throw new IllegalStateException("applyFocusProperties called on wrong node".toString());
    }

    public final String toString() {
        return this.f14406u.toString();
    }

    @Override // t1.m1
    public final boolean w() {
        return this.f16742t;
    }

    @Override // t1.p1
    public final void y(o1.k kVar, o1.l lVar, long j10) {
        y0.m mVar = this.f14406u;
        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        l.q.w(mVar);
        throw null;
    }

    @Override // y0.n
    public final void z0() {
        G0(true);
    }
}
