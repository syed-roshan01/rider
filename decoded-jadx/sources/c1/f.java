package c1;

import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.fragment.app.a0;
import f0.r0;
import t1.u0;
import t1.x0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f2882b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m2.l f2885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q.q f2886f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f2881a = new p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f2883c = new q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f2884d = new u0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // t1.u0
        public final int hashCode() {
            return this.f1702b.f2881a.hashCode();
        }

        @Override // t1.u0
        public final n l() {
            return this.f1702b.f2881a;
        }

        @Override // t1.u0
        public final /* bridge */ /* synthetic */ void m(n nVar) {
        }
    };

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public f(u1.r rVar) {
        this.f2882b = new d(rVar);
    }

    public final void a(boolean z10, boolean z11) {
        o oVar;
        int iE;
        q qVar = this.f2883c;
        try {
            if (qVar.f2916c) {
                q.a(qVar);
            }
            qVar.f2916c = true;
            p pVar = this.f2881a;
            if (!z10 && ((iE = t.k.e(androidx.compose.ui.focus.a.v(pVar, 8))) == 1 || iE == 2 || iE == 3)) {
                q.b(qVar);
                return;
            }
            o oVarH0 = pVar.H0();
            if (androidx.compose.ui.focus.a.d(pVar, z10, z11)) {
                int iOrdinal = oVarH0.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                    oVar = o.f2907a;
                } else {
                    if (iOrdinal != 3) {
                        throw new a0();
                    }
                    oVar = o.f2909c;
                }
                pVar.K0(oVar);
            }
            q.b(qVar);
        } catch (Throwable th) {
            q.b(qVar);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x012e  */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0258, code lost:
    
        if (b(r18) == false) goto L189;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i10) {
        k kVar;
        boolean zA;
        boolean z10;
        p pVar;
        p pVar2;
        x0 x0Var;
        Boolean boolI;
        p pVar3 = this.f2881a;
        p pVarF = androidx.compose.ui.focus.a.f(pVar3);
        if (pVarF == null) {
            return false;
        }
        m2.l lVar = this.f2885e;
        if (lVar == null) {
            d7.a.D("layoutDirection");
            throw null;
        }
        i iVarG0 = pVarF.G0();
        int i11 = 4;
        if (b.a(i10, 1)) {
            kVar = iVarG0.f2893b;
        } else if (b.a(i10, 2)) {
            kVar = iVarG0.f2894c;
        } else if (b.a(i10, 5)) {
            kVar = iVarG0.f2895d;
        } else if (b.a(i10, 6)) {
            kVar = iVarG0.f2896e;
        } else if (b.a(i10, 3)) {
            int iOrdinal = lVar.ordinal();
            if (iOrdinal == 0) {
                kVar = iVarG0.f2899h;
            } else {
                if (iOrdinal != 1) {
                    throw new a0();
                }
                kVar = iVarG0.f2900i;
            }
            if (kVar == k.f2903b) {
                kVar = null;
            }
            if (kVar == null) {
                kVar = iVarG0.f2897f;
            }
        } else if (b.a(i10, 4)) {
            int iOrdinal2 = lVar.ordinal();
            if (iOrdinal2 == 0) {
                kVar = iVarG0.f2900i;
            } else {
                if (iOrdinal2 != 1) {
                    throw new a0();
                }
                kVar = iVarG0.f2899h;
            }
            if (kVar == k.f2903b) {
                kVar = null;
            }
            if (kVar == null) {
                kVar = iVarG0.f2898g;
            }
        } else if (b.a(i10, 7)) {
            kVar = (k) iVarG0.f2901j.invoke(new b(i10));
        } else {
            if (!b.a(i10, 8)) {
                throw new IllegalStateException("invalid FocusDirection".toString());
            }
            kVar = (k) iVarG0.f2902k.invoke(new b(i10));
        }
        if (kVar != k.f2903b) {
            return kVar != k.f2904c && kVar.a();
        }
        d9.q qVar = new d9.q();
        m2.l lVar2 = this.f2885e;
        if (lVar2 == null) {
            d7.a.D("layoutDirection");
            throw null;
        }
        r0 r0Var = new r0(pVarF, this, i10, qVar);
        if (b.a(i10, 1) || b.a(i10, 2)) {
            if (b.a(i10, 1)) {
                zA = androidx.compose.ui.focus.a.k(pVar3, r0Var);
            } else {
                if (!b.a(i10, 2)) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                zA = androidx.compose.ui.focus.a.a(pVar3, r0Var);
            }
        } else if (b.a(i10, 3) || b.a(i10, 4) || b.a(i10, 5) || b.a(i10, 6)) {
            Boolean boolI2 = androidx.compose.ui.focus.a.I(pVar3, i10, r0Var);
            if (boolI2 != null) {
                zA = boolI2.booleanValue();
            } else {
                zA = false;
            }
        } else if (b.a(i10, 7)) {
            int iOrdinal3 = lVar2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new a0();
                }
                i11 = 3;
            }
            p pVarF2 = androidx.compose.ui.focus.a.f(pVar3);
            if (pVarF2 == null || (boolI = androidx.compose.ui.focus.a.I(pVarF2, i11, r0Var)) == null) {
                zA = false;
            } else {
                zA = boolI.booleanValue();
            }
        } else {
            if (!b.a(i10, 8)) {
                throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) b.b(i10))).toString());
            }
            p pVarF3 = androidx.compose.ui.focus.a.f(pVar3);
            if (pVarF3 != null) {
                y0.n nVar = pVarF3.f16730a;
                if (!nVar.f16742t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                y0.n nVar2 = nVar.f16734e;
                androidx.compose.ui.node.a aVarY = t1.g.y(pVarF3);
                loop0: while (true) {
                    if (aVarY == null) {
                        pVar2 = null;
                        break;
                    }
                    if ((aVarY.C.f14579e.f16733d & 1024) != 0) {
                        while (nVar2 != null) {
                            if ((nVar2.f16732c & 1024) != 0) {
                                y0.n nVarF = nVar2;
                                o0.i iVar = null;
                                while (nVarF != null) {
                                    if (nVarF instanceof p) {
                                        p pVar4 = (p) nVarF;
                                        if (pVar4.G0().f2892a) {
                                            pVar2 = pVar4;
                                            break loop0;
                                        }
                                    } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof t1.o)) {
                                        int i12 = 0;
                                        for (y0.n nVar3 = ((t1.o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                            if ((nVar3.f16732c & 1024) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    nVarF = nVar3;
                                                } else {
                                                    if (iVar == null) {
                                                        iVar = new o0.i(new y0.n[16]);
                                                    }
                                                    if (nVarF != null) {
                                                        iVar.c(nVarF);
                                                        nVarF = null;
                                                    }
                                                    iVar.c(nVar3);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    nVarF = t1.g.f(iVar);
                                }
                            }
                            nVar2 = nVar2.f16734e;
                        }
                    }
                    aVarY = aVarY.q();
                    nVar2 = (aVarY == null || (x0Var = aVarY.C) == null) ? null : x0Var.f14578d;
                }
                pVar = pVar2;
            } else {
                pVar = null;
            }
            if (pVar == null || d7.a.d(pVar, pVar3)) {
                zA = false;
            } else {
                zA = ((Boolean) r0Var.invoke(pVar)).booleanValue();
            }
        }
        if (!qVar.f4948a) {
            if (!zA) {
                int iOrdinal4 = pVar3.H0().ordinal();
                if (iOrdinal4 == 0 || iOrdinal4 == 1 || iOrdinal4 == 2) {
                    if (!pVar3.H0().a() && (b.a(i10, 1) || b.a(i10, 2))) {
                        z10 = false;
                        a(false, true);
                        if (pVar3.H0().a()) {
                        }
                    }
                } else if (iOrdinal4 != 3) {
                    throw new a0();
                }
                z10 = false;
            }
            return true;
        }
        z10 = false;
        return z10;
    }
}
