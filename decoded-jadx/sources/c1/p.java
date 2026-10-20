package c1;

import d9.u;
import t1.c1;
import t1.f1;
import t1.l1;
import t1.x0;
import u.r0;
import u1.w;

/* JADX INFO: loaded from: classes.dex */
public final class p extends y0.n implements t1.m, f1, s1.f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2911u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f2913w = o.f2909c;

    @Override // y0.n
    public final void B0() {
        int iOrdinal = H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                J0();
                q qVarE = androidx.compose.ui.focus.a.E(this);
                try {
                    if (qVarE.f2916c) {
                        q.a(qVarE);
                    }
                    qVarE.f2916c = true;
                    K0(o.f2909c);
                    return;
                } finally {
                    q.b(qVarE);
                }
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return;
                }
                J0();
                return;
            }
        }
        ((f) ((w) t1.g.A(this)).getFocusOwner()).a(true, true);
    }

    @Override // t1.f1
    public final void G() {
        o oVarH0 = H0();
        I0();
        if (oVarH0 != H0()) {
            androidx.compose.ui.focus.a.B(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final i G0() {
        x0 x0Var;
        i iVar = new i();
        iVar.f2892a = true;
        k kVar = k.f2903b;
        iVar.f2893b = kVar;
        iVar.f2894c = kVar;
        iVar.f2895d = kVar;
        iVar.f2896e = kVar;
        iVar.f2897f = kVar;
        iVar.f2898g = kVar;
        iVar.f2899h = kVar;
        iVar.f2900i = kVar;
        iVar.f2901j = g.f2887b;
        iVar.f2902k = g.f2888c;
        y0.n nVar = this.f16730a;
        if (!nVar.f16742t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.node.a aVarY = t1.g.y(this);
        y0.n nVar2 = nVar;
        loop0: while (aVarY != null) {
            if ((aVarY.C.f14579e.f16733d & 3072) != 0) {
                while (nVar2 != null) {
                    int i10 = nVar2.f16732c;
                    if ((i10 & 3072) != 0) {
                        if (nVar2 != nVar && (i10 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i10 & 2048) != 0) {
                            ?? F = nVar2;
                            ?? iVar2 = 0;
                            while (F != 0) {
                                if (F instanceof j) {
                                    ((j) F).s0(iVar);
                                } else if ((F.f16732c & 2048) != 0 && (F instanceof t1.o)) {
                                    y0.n nVar3 = ((t1.o) F).f14521v;
                                    int i11 = 0;
                                    while (nVar3 != null) {
                                        if ((nVar3.f16732c & 2048) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                F = F;
                                                iVar2 = iVar2;
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
                                        } else {
                                            F = F;
                                            iVar2 = iVar2;
                                        }
                                        nVar3 = nVar3.f16735f;
                                        F = F;
                                        iVar2 = iVar2;
                                    }
                                    if (i11 == 1) {
                                        F = F;
                                        iVar2 = iVar2;
                                    } else {
                                        F = F;
                                        iVar2 = iVar2;
                                    }
                                }
                                F = t1.g.f(iVar2);
                            }
                        }
                    }
                    nVar2 = nVar2.f16734e;
                }
            }
            aVarY = aVarY.q();
            nVar2 = (aVarY == null || (x0Var = aVarY.C) == null) ? null : x0Var.f14578d;
        }
        return iVar;
    }

    public final o H0() {
        o oVar;
        androidx.compose.ui.node.a aVar;
        l1 l1Var;
        e focusOwner;
        c1 c1Var = this.f16730a.f16737o;
        q qVar = (c1Var == null || (aVar = c1Var.f14395p) == null || (l1Var = aVar.f1744p) == null || (focusOwner = ((w) l1Var).getFocusOwner()) == null) ? null : ((f) focusOwner).f2883c;
        return (qVar == null || (oVar = (o) qVar.f2914a.get(this)) == null) ? this.f2913w : oVar;
    }

    public final void I0() {
        int iOrdinal = H0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            u uVar = new u();
            t1.g.w(this, new r0(10, uVar, this));
            Object obj = uVar.f4952a;
            if (obj == null) {
                d7.a.D("focusProperties");
                throw null;
            }
            if (((h) obj).a()) {
                return;
            }
            ((f) ((w) t1.g.A(this)).getFocusOwner()).a(true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final void J0() {
        x0 x0Var;
        ?? F = this.f16730a;
        ?? iVar = 0;
        while (true) {
            int i10 = 0;
            if (F == 0) {
                break;
            }
            if (F instanceof c) {
                androidx.compose.ui.focus.a.q((c) F);
            } else if ((F.f16732c & 4096) != 0 && (F instanceof t1.o)) {
                y0.n nVar = ((t1.o) F).f14521v;
                while (nVar != null) {
                    if ((nVar.f16732c & 4096) != 0) {
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
            F = t1.g.f(iVar);
        }
        y0.n nVar2 = this.f16730a;
        if (!nVar2.f16742t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        y0.n nVar3 = nVar2.f16734e;
        androidx.compose.ui.node.a aVarY = t1.g.y(this);
        while (aVarY != null) {
            if ((aVarY.C.f14579e.f16733d & 5120) != 0) {
                while (nVar3 != null) {
                    int i11 = nVar3.f16732c;
                    if ((i11 & 5120) != 0 && (i11 & 1024) == 0 && nVar3.f16742t) {
                        ?? F2 = nVar3;
                        ?? iVar2 = 0;
                        while (F2 != 0) {
                            if (F2 instanceof c) {
                                androidx.compose.ui.focus.a.q((c) F2);
                            } else if ((F2.f16732c & 4096) != 0 && (F2 instanceof t1.o)) {
                                y0.n nVar4 = ((t1.o) F2).f14521v;
                                int i12 = 0;
                                while (nVar4 != null) {
                                    if ((nVar4.f16732c & 4096) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            F2 = F2;
                                            iVar2 = iVar2;
                                            iVar2 = iVar2;
                                            F2 = nVar4;
                                        } else {
                                            if (iVar2 == 0) {
                                                iVar2 = new o0.i(new y0.n[16]);
                                            }
                                            if (F2 != 0) {
                                                iVar2.c(F2);
                                                F2 = 0;
                                            }
                                            iVar2.c(nVar4);
                                        }
                                    } else {
                                        F2 = F2;
                                        iVar2 = iVar2;
                                    }
                                    nVar4 = nVar4.f16735f;
                                    F2 = F2;
                                    iVar2 = iVar2;
                                }
                                if (i12 == 1) {
                                    F2 = F2;
                                    iVar2 = iVar2;
                                } else {
                                    F2 = F2;
                                    iVar2 = iVar2;
                                }
                            }
                            F2 = t1.g.f(iVar2);
                        }
                    }
                    nVar3 = nVar3.f16734e;
                }
            }
            aVarY = aVarY.q();
            nVar3 = (aVarY == null || (x0Var = aVarY.C) == null) ? null : x0Var.f14578d;
        }
    }

    public final void K0(o oVar) {
        androidx.compose.ui.focus.a.E(this).f2914a.put(this, oVar);
    }
}
