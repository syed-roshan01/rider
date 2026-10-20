package androidx.compose.ui.focus;

import a0.j;
import a0.l;
import a0.m;
import androidx.fragment.app.a0;
import c1.b;
import c1.f;
import c1.p;
import c1.q;
import c1.r;
import c1.s;
import c9.c;
import d1.d;
import d9.u;
import f0.r0;
import f0.x;
import java.util.Arrays;
import o0.i;
import r1.h;
import t.k;
import t.l0;
import t1.c1;
import t1.g;
import t1.l1;
import t1.o;
import t1.x0;
import u1.w;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final boolean A(p pVar, c cVar) {
        Object[] objArrCopyOf = new p[16];
        n nVar = pVar.f16730a;
        if (!nVar.f16742t) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        i iVar = new i(new n[16]);
        n nVar2 = nVar.f16735f;
        if (nVar2 == null) {
            g.b(iVar, nVar);
        } else {
            iVar.c(nVar2);
        }
        int i10 = 0;
        while (iVar.l()) {
            n nVarF = (n) iVar.n(iVar.f12343c - 1);
            if ((nVarF.f16733d & 1024) == 0) {
                g.b(iVar, nVarF);
            } else {
                while (nVarF != null) {
                    if ((nVarF.f16732c & 1024) != 0) {
                        i iVar2 = null;
                        while (nVarF != null) {
                            if (nVarF instanceof p) {
                                p pVar2 = (p) nVarF;
                                int i11 = i10 + 1;
                                if (objArrCopyOf.length < i11) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i11, objArrCopyOf.length * 2));
                                    d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
                                }
                                objArrCopyOf[i10] = pVar2;
                                i10 = i11;
                            } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                                int i12 = 0;
                                for (n nVar3 = ((o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                    if ((nVar3.f16732c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            nVarF = nVar3;
                                        } else {
                                            if (iVar2 == null) {
                                                iVar2 = new i(new n[16]);
                                            }
                                            if (nVarF != null) {
                                                iVar2.c(nVarF);
                                                nVarF = null;
                                            }
                                            iVar2.c(nVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            nVarF = g.f(iVar2);
                        }
                        break;
                    }
                    nVarF = nVarF.f16735f;
                }
            }
        }
        r rVar = r.f2917a;
        d7.a.m(objArrCopyOf, "<this>");
        Arrays.sort(objArrCopyOf, 0, i10, rVar);
        if (i10 <= 0) {
            return false;
        }
        int i13 = 0;
        do {
            p pVar3 = (p) objArrCopyOf[i13];
            if (t(pVar3) && k(pVar3, cVar)) {
                return true;
            }
            i13++;
        } while (i13 < i10);
        return false;
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
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static final void B(p pVar) {
        x0 x0Var;
        n nVar = pVar.f16730a;
        if (!nVar.f16742t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.node.a aVarY = g.y(pVar);
        n nVar2 = nVar;
        while (aVarY != null) {
            if ((aVarY.C.f14579e.f16733d & 5120) != 0) {
                while (nVar2 != null) {
                    int i10 = nVar2.f16732c;
                    if ((i10 & 5120) != 0) {
                        if (nVar2 != nVar && (i10 & 1024) != 0) {
                            return;
                        }
                        if ((i10 & 4096) != 0) {
                            ?? F = nVar2;
                            ?? iVar = 0;
                            while (F != 0) {
                                if (F instanceof c1.c) {
                                    c1.c cVar = (c1.c) F;
                                    cVar.a0(o(cVar));
                                } else if ((F.f16732c & 4096) != 0 && (F instanceof o)) {
                                    n nVar3 = ((o) F).f14521v;
                                    int i11 = 0;
                                    F = F;
                                    iVar = iVar;
                                    while (nVar3 != null) {
                                        if ((nVar3.f16732c & 4096) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                iVar = iVar;
                                                F = nVar3;
                                            } else {
                                                if (iVar == 0) {
                                                    iVar = new i(new n[16]);
                                                }
                                                if (F != 0) {
                                                    iVar.c(F);
                                                    F = 0;
                                                }
                                                iVar.c(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f16735f;
                                        F = F;
                                        iVar = iVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                F = g.f(iVar);
                            }
                        }
                    }
                    nVar2 = nVar2.f16734e;
                }
            }
            aVarY = aVarY.q();
            nVar2 = (aVarY == null || (x0Var = aVarY.C) == null) ? null : x0Var.f14578d;
        }
    }

    public static final boolean C(p pVar) {
        q qVarE = E(pVar);
        try {
            if (qVarE.f2916c) {
                q.a(qVarE);
            }
            boolean zY = true;
            qVarE.f2916c = true;
            int iE = k.e(x(pVar, 7));
            if (iE == 0) {
                zY = y(pVar);
            } else if (iE == 1) {
                zY = false;
            } else if (iE != 2) {
                if (iE != 3) {
                    throw new a0();
                }
                zY = false;
            }
            q.b(qVarE);
            return zY;
        } catch (Throwable th) {
            q.b(qVarE);
            throw th;
        }
    }

    public static final boolean D(p pVar, p pVar2) {
        n nVar;
        n nVarF;
        androidx.compose.ui.node.a aVar;
        l1 l1Var;
        x0 x0Var;
        x0 x0Var2;
        n nVar2 = pVar2.f16730a;
        if (!nVar2.f16742t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        n nVar3 = nVar2.f16734e;
        androidx.compose.ui.node.a aVarY = g.y(pVar2);
        loop0: while (true) {
            nVar = null;
            if (aVarY == null) {
                nVarF = null;
                break;
            }
            if ((aVarY.C.f14579e.f16733d & 1024) != 0) {
                while (nVar3 != null) {
                    if ((nVar3.f16732c & 1024) != 0) {
                        nVarF = nVar3;
                        i iVar = null;
                        while (nVarF != null) {
                            if (nVarF instanceof p) {
                                break loop0;
                            }
                            if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                                int i10 = 0;
                                for (n nVar4 = ((o) nVarF).f14521v; nVar4 != null; nVar4 = nVar4.f16735f) {
                                    if ((nVar4.f16732c & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nVarF = nVar4;
                                        } else {
                                            if (iVar == null) {
                                                iVar = new i(new n[16]);
                                            }
                                            if (nVarF != null) {
                                                iVar.c(nVarF);
                                                nVarF = null;
                                            }
                                            iVar.c(nVar4);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            nVarF = g.f(iVar);
                        }
                    }
                    nVar3 = nVar3.f16734e;
                }
            }
            aVarY = aVarY.q();
            nVar3 = (aVarY == null || (x0Var2 = aVarY.C) == null) ? null : x0Var2.f14578d;
        }
        if (!d7.a.d(nVarF, pVar)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int iOrdinal = pVar.H0().ordinal();
        c1.o oVar = c1.o.f2908b;
        if (iOrdinal == 0) {
            p(pVar2);
            pVar.K0(oVar);
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return false;
                }
                if (iOrdinal != 3) {
                    throw new a0();
                }
                n nVar5 = pVar.f16730a;
                if (!nVar5.f16742t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                n nVar6 = nVar5.f16734e;
                androidx.compose.ui.node.a aVarY2 = g.y(pVar);
                loop4: while (aVarY2 != null) {
                    if ((aVarY2.C.f14579e.f16733d & 1024) != 0) {
                        while (nVar6 != null) {
                            if ((nVar6.f16732c & 1024) != 0) {
                                n nVarF2 = nVar6;
                                i iVar2 = null;
                                while (nVarF2 != null) {
                                    if (nVarF2 instanceof p) {
                                        nVar = nVarF2;
                                        break loop4;
                                    }
                                    if ((nVarF2.f16732c & 1024) != 0 && (nVarF2 instanceof o)) {
                                        int i11 = 0;
                                        for (n nVar7 = ((o) nVarF2).f14521v; nVar7 != null; nVar7 = nVar7.f16735f) {
                                            if ((nVar7.f16732c & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    nVarF2 = nVar7;
                                                } else {
                                                    if (iVar2 == null) {
                                                        iVar2 = new i(new n[16]);
                                                    }
                                                    if (nVarF2 != null) {
                                                        iVar2.c(nVarF2);
                                                        nVarF2 = null;
                                                    }
                                                    iVar2.c(nVar7);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    nVarF2 = g.f(iVar2);
                                }
                            }
                            nVar6 = nVar6.f16734e;
                        }
                    }
                    aVarY2 = aVarY2.q();
                    nVar6 = (aVarY2 == null || (x0Var = aVarY2.C) == null) ? null : x0Var.f14578d;
                }
                p pVar3 = (p) nVar;
                if (pVar3 == null) {
                    c1 c1Var = pVar.f16737o;
                    if (c1Var == null || (aVar = c1Var.f14395p) == null || (l1Var = aVar.f1744p) == null) {
                        throw new IllegalStateException("Owner not initialized.".toString());
                    }
                    if (l1Var.requestFocus()) {
                        pVar.K0(c1.o.f2907a);
                        return D(pVar, pVar2);
                    }
                }
                if (pVar3 == null || !D(pVar3, pVar)) {
                    return false;
                }
                boolean zD = D(pVar, pVar2);
                if (pVar.H0() != oVar) {
                    throw new IllegalStateException("Deactivated node is focused".toString());
                }
                if (!zD) {
                    return zD;
                }
                B(pVar3);
                return zD;
            }
            if (n(pVar) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child".toString());
            }
            p pVarN = n(pVar);
            if (pVarN != null && !d(pVarN, false, true)) {
                return false;
            }
            p(pVar2);
        }
        return true;
    }

    public static final q E(p pVar) {
        return ((f) ((w) g.A(pVar)).getFocusOwner()).f2883c;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a5 A[PHI: r0
  0x00a5: PHI (r0v16 int) = (r0v4 int), (r0v5 int), (r0v6 int), (r0v7 int) binds: [B:53:0x00a3, B:56:0x00ac, B:59:0x00b4, B:62:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object F(p pVar, int i10, s sVar) {
        int i11;
        Object objInvoke;
        n nVarF;
        x0 x0Var;
        n nVar = pVar.f16730a;
        if (!nVar.f16742t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        n nVar2 = nVar.f16734e;
        androidx.compose.ui.node.a aVarY = g.y(pVar);
        loop0: while (true) {
            i11 = 1;
            objInvoke = null;
            if (aVarY == null) {
                nVarF = null;
                break;
            }
            if ((aVarY.C.f14579e.f16733d & 1024) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f16732c & 1024) != 0) {
                        nVarF = nVar2;
                        i iVar = null;
                        while (nVarF != null) {
                            if (nVarF instanceof p) {
                                break loop0;
                            }
                            if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                                int i12 = 0;
                                for (n nVar3 = ((o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                    if ((nVar3.f16732c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
                                if (i12 == 1) {
                                }
                            }
                            nVarF = g.f(iVar);
                        }
                    }
                    nVar2 = nVar2.f16734e;
                }
            }
            aVarY = aVarY.q();
            nVar2 = (aVarY == null || (x0Var = aVarY.C) == null) ? null : x0Var.f14578d;
        }
        p pVar2 = (p) nVarF;
        if (pVar2 != null) {
            s1.i iVar2 = h.f13381a;
            if (d7.a.d((r1.f) pVar2.g(iVar2), (r1.f) pVar.g(iVar2))) {
                return null;
            }
        }
        r1.f fVar = (r1.f) pVar.g(h.f13381a);
        if (fVar == null) {
            return null;
        }
        int i13 = 5;
        if (b.a(i10, 5)) {
            i11 = i13;
        } else {
            i13 = 6;
            if (b.a(i10, 6)) {
                i11 = i13;
            } else {
                i13 = 3;
                if (b.a(i10, 3)) {
                    i11 = i13;
                } else {
                    i13 = 4;
                    if (b.a(i10, 4)) {
                        i11 = i13;
                    } else if (b.a(i10, 1)) {
                        i11 = 2;
                    } else if (!b.a(i10, 2)) {
                        throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                    }
                }
            }
        }
        m mVar = (m) fVar;
        a0.n nVar4 = mVar.f826b;
        if (nVar4.c() <= 0 || !nVar4.e()) {
            return sVar.invoke(m.f825g);
        }
        int iD = mVar.m(i11) ? nVar4.d() : nVar4.g();
        u uVar = new u();
        j jVar = mVar.f827c;
        jVar.getClass();
        a0.i iVar3 = new a0.i(iD, iD);
        i iVar4 = jVar.f813a;
        iVar4.c(iVar3);
        uVar.f4952a = iVar3;
        while (objInvoke == null && mVar.l((a0.i) uVar.f4952a, i11)) {
            a0.i iVar5 = (a0.i) uVar.f4952a;
            int i14 = iVar5.f809a;
            boolean zM = mVar.m(i11);
            int i15 = iVar5.f810b;
            if (zM) {
                i15++;
            } else {
                i14--;
            }
            a0.i iVar6 = new a0.i(i14, i15);
            iVar4.c(iVar6);
            iVar4.m((a0.i) uVar.f4952a);
            uVar.f4952a = iVar6;
            nVar4.f();
            objInvoke = sVar.invoke(new l(mVar, uVar, i11));
        }
        iVar4.m((a0.i) uVar.f4952a);
        nVar4.f();
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01a9  */
    public static final boolean G(p pVar, p pVar2, int i10, c cVar) {
        n nVar;
        x0 x0Var;
        if (pVar.H0() != c1.o.f2908b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        Object[] objArrCopyOf = new p[16];
        n nVar2 = pVar.f16730a;
        if (!nVar2.f16742t) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        i iVar = new i(new n[16]);
        n nVar3 = nVar2.f16735f;
        if (nVar3 == null) {
            g.b(iVar, nVar2);
        } else {
            iVar.c(nVar3);
        }
        int i11 = 0;
        while (iVar.l()) {
            n nVarF = (n) iVar.n(iVar.f12343c - 1);
            if ((nVarF.f16733d & 1024) == 0) {
                g.b(iVar, nVarF);
            } else {
                while (nVarF != null) {
                    if ((nVarF.f16732c & 1024) != 0) {
                        i iVar2 = null;
                        while (nVarF != null) {
                            if (nVarF instanceof p) {
                                p pVar3 = (p) nVarF;
                                int i12 = i11 + 1;
                                if (objArrCopyOf.length < i12) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i12, objArrCopyOf.length * 2));
                                    d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
                                }
                                objArrCopyOf[i11] = pVar3;
                                i11 = i12;
                            } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                                int i13 = 0;
                                for (n nVar4 = ((o) nVarF).f14521v; nVar4 != null; nVar4 = nVar4.f16735f) {
                                    if ((nVar4.f16732c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            nVarF = nVar4;
                                        } else {
                                            if (iVar2 == null) {
                                                iVar2 = new i(new n[16]);
                                            }
                                            if (nVarF != null) {
                                                iVar2.c(nVarF);
                                                nVarF = null;
                                            }
                                            iVar2.c(nVar4);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            nVarF = g.f(iVar2);
                        }
                        break;
                    }
                    nVarF = nVarF.f16735f;
                }
            }
        }
        r rVar = r.f2917a;
        d7.a.m(objArrCopyOf, "<this>");
        Arrays.sort(objArrCopyOf, 0, i11, rVar);
        if (b.a(i10, 1)) {
            int i14 = new i9.g(0, i11 - 1, 1).f8184b;
            if (i14 >= 0) {
                boolean z10 = false;
                int i15 = 0;
                while (true) {
                    if (z10) {
                        p pVar4 = (p) objArrCopyOf[i15];
                        if (t(pVar4) && k(pVar4, cVar)) {
                            return true;
                        }
                    }
                    if (d7.a.d(objArrCopyOf[i15], pVar2)) {
                        z10 = true;
                    }
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                }
            }
        } else {
            if (!b.a(i10, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            int i16 = new i9.g(0, i11 - 1, 1).f8184b;
            if (i16 >= 0) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        p pVar5 = (p) objArrCopyOf[i16];
                        if (t(pVar5) && a(pVar5, cVar)) {
                            return true;
                        }
                    }
                    if (d7.a.d(objArrCopyOf[i16], pVar2)) {
                        z11 = true;
                    }
                    if (i16 == 0) {
                        break;
                    }
                    i16--;
                }
            }
        }
        if (!b.a(i10, 1) && pVar.G0().f2892a) {
            n nVar5 = pVar.f16730a;
            if (!nVar5.f16742t) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            n nVar6 = nVar5.f16734e;
            androidx.compose.ui.node.a aVarY = g.y(pVar);
            while (aVarY != null) {
                if ((aVarY.C.f14579e.f16733d & 1024) != 0) {
                    while (nVar6 != null) {
                        if ((nVar6.f16732c & 1024) != 0) {
                            n nVarF2 = nVar6;
                            i iVar3 = null;
                            while (nVarF2 != null) {
                                if (nVarF2 instanceof p) {
                                    nVar = nVarF2;
                                    if (nVar != null) {
                                        return ((Boolean) cVar.invoke(pVar)).booleanValue();
                                    }
                                } else {
                                    if ((nVarF2.f16732c & 1024) != 0 && (nVarF2 instanceof o)) {
                                        int i17 = 0;
                                        for (n nVar7 = ((o) nVarF2).f14521v; nVar7 != null; nVar7 = nVar7.f16735f) {
                                            if ((nVar7.f16732c & 1024) != 0) {
                                                i17++;
                                                if (i17 == 1) {
                                                    nVarF2 = nVar7;
                                                } else {
                                                    if (iVar3 == null) {
                                                        iVar3 = new i(new n[16]);
                                                    }
                                                    if (nVarF2 != null) {
                                                        iVar3.c(nVarF2);
                                                        nVarF2 = null;
                                                    }
                                                    iVar3.c(nVar7);
                                                }
                                            }
                                        }
                                        if (i17 == 1) {
                                        }
                                    }
                                    nVarF2 = g.f(iVar3);
                                }
                            }
                        }
                        nVar6 = nVar6.f16734e;
                    }
                }
                aVarY = aVarY.q();
                nVar6 = (aVarY == null || (x0Var = aVarY.C) == null) ? null : x0Var.f14578d;
            }
            nVar = null;
            if (nVar != null) {
                return ((Boolean) cVar.invoke(pVar)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean H(p pVar, p pVar2, int i10, c cVar) {
        p pVarG;
        i iVar = new i(new p[16]);
        n nVar = pVar.f16730a;
        if (!nVar.f16742t) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        i iVar2 = new i(new n[16]);
        n nVar2 = nVar.f16735f;
        if (nVar2 == null) {
            g.b(iVar2, nVar);
        } else {
            iVar2.c(nVar2);
        }
        while (iVar2.l()) {
            n nVarF = (n) iVar2.n(iVar2.f12343c - 1);
            if ((nVarF.f16733d & 1024) == 0) {
                g.b(iVar2, nVarF);
            } else {
                while (nVarF != null) {
                    if ((nVarF.f16732c & 1024) != 0) {
                        i iVar3 = null;
                        while (nVarF != null) {
                            if (nVarF instanceof p) {
                                iVar.c((p) nVarF);
                            } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                                int i11 = 0;
                                for (n nVar3 = ((o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                    if ((nVar3.f16732c & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            nVarF = nVar3;
                                        } else {
                                            if (iVar3 == null) {
                                                iVar3 = new i(new n[16]);
                                            }
                                            if (nVarF != null) {
                                                iVar3.c(nVarF);
                                                nVarF = null;
                                            }
                                            iVar3.c(nVar3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            nVarF = g.f(iVar3);
                        }
                        break;
                    }
                    nVarF = nVarF.f16735f;
                }
            }
        }
        while (iVar.l() && (pVarG = g(iVar, i(pVar2), i10)) != null) {
            if (pVarG.G0().f2892a) {
                return ((Boolean) cVar.invoke(pVarG)).booleanValue();
            }
            if (m(pVarG, pVar2, i10, cVar)) {
                return true;
            }
            iVar.m(pVarG);
        }
        return false;
    }

    public static final Boolean I(p pVar, int i10, r0 r0Var) {
        int iOrdinal = pVar.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                p pVarN = n(pVar);
                if (pVarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                int iOrdinal2 = pVarN.H0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolI = I(pVarN, i10, r0Var);
                        if (!d7.a.d(boolI, Boolean.FALSE)) {
                            return boolI;
                        }
                        if (pVarN.H0() != c1.o.f2908b) {
                            throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
                        }
                        p pVarF = f(pVarN);
                        if (pVarF != null) {
                            return Boolean.valueOf(m(pVar, pVarF, i10, r0Var));
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new a0();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                }
                return Boolean.valueOf(m(pVar, pVarN, i10, r0Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return pVar.G0().f2892a ? (Boolean) r0Var.invoke(pVar) : Boolean.FALSE;
                }
                throw new a0();
            }
        }
        return Boolean.valueOf(h(pVar, i10, r0Var));
    }

    public static final boolean a(p pVar, c cVar) {
        int iOrdinal = pVar.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                p pVarN = n(pVar);
                if (pVarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                int iOrdinal2 = pVarN.H0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                throw new a0();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                    } else if (!a(pVarN, cVar) && !l(pVar, pVarN, 2, cVar) && (!pVarN.G0().f2892a || !((Boolean) cVar.invoke(pVarN)).booleanValue())) {
                        return false;
                    }
                }
                return l(pVar, pVarN, 2, cVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new a0();
                }
                if (!z(pVar, cVar) && (!pVar.G0().f2892a || !((Boolean) cVar.invoke(pVar)).booleanValue())) {
                    return false;
                }
            }
            return true;
        }
        return z(pVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    public static final boolean b(d dVar, d dVar2, d dVar3, int i10) {
        float f10;
        float fMax;
        float f11;
        if (!c(i10, dVar3, dVar) && c(i10, dVar2, dVar)) {
            boolean zA = b.a(i10, 3);
            float f12 = dVar3.f4333b;
            float f13 = dVar3.f4335d;
            float f14 = dVar3.f4332a;
            float f15 = dVar3.f4334c;
            float f16 = dVar.f4335d;
            float f17 = dVar.f4333b;
            float f18 = dVar.f4334c;
            float f19 = dVar.f4332a;
            if (zA) {
                if (f19 >= f15) {
                    if (!b.a(i10, 3) && !b.a(i10, 4)) {
                        if (b.a(i10, 3)) {
                            f10 = f19 - dVar2.f4334c;
                        } else if (b.a(i10, 4)) {
                            f10 = dVar2.f4332a - f18;
                        } else if (b.a(i10, 5)) {
                            f10 = f17 - dVar2.f4335d;
                        } else {
                            if (b.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            f10 = dVar2.f4333b - f16;
                        }
                        fMax = Math.max(0.0f, f10);
                        if (b.a(i10, 3)) {
                            f11 = f19 - f14;
                        } else if (b.a(i10, 4)) {
                            f11 = f15 - f18;
                        } else if (b.a(i10, 5)) {
                            f11 = f17 - f12;
                        } else {
                            if (b.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            f11 = f13 - f16;
                        }
                        if (fMax < Math.max(1.0f, f11)) {
                        }
                    }
                }
            } else if (b.a(i10, 4)) {
                if (f18 <= f14) {
                    if (!b.a(i10, 3)) {
                        if (b.a(i10, 3)) {
                            f10 = f19 - dVar2.f4334c;
                        } else if (b.a(i10, 4)) {
                            f10 = dVar2.f4332a - f18;
                        } else if (b.a(i10, 5)) {
                            f10 = f17 - dVar2.f4335d;
                        } else {
                            if (b.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            f10 = dVar2.f4333b - f16;
                        }
                        fMax = Math.max(0.0f, f10);
                        if (b.a(i10, 3)) {
                            f11 = f19 - f14;
                        } else if (b.a(i10, 4)) {
                            f11 = f15 - f18;
                        } else if (b.a(i10, 5)) {
                            f11 = f17 - f12;
                        } else {
                            if (b.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            f11 = f13 - f16;
                        }
                        if (fMax < Math.max(1.0f, f11)) {
                        }
                    }
                }
            } else if (b.a(i10, 5)) {
                if (f17 >= f13) {
                    if (!b.a(i10, 3)) {
                        if (b.a(i10, 3)) {
                            f10 = f19 - dVar2.f4334c;
                        } else if (b.a(i10, 4)) {
                            f10 = dVar2.f4332a - f18;
                        } else if (b.a(i10, 5)) {
                            f10 = f17 - dVar2.f4335d;
                        } else {
                            if (b.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            f10 = dVar2.f4333b - f16;
                        }
                        fMax = Math.max(0.0f, f10);
                        if (b.a(i10, 3)) {
                            f11 = f19 - f14;
                        } else if (b.a(i10, 4)) {
                            f11 = f15 - f18;
                        } else if (b.a(i10, 5)) {
                            f11 = f17 - f12;
                        } else {
                            if (b.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            f11 = f13 - f16;
                        }
                        if (fMax < Math.max(1.0f, f11)) {
                        }
                    }
                }
            } else {
                if (!b.a(i10, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                if (f16 <= f12) {
                    if (!b.a(i10, 3)) {
                        if (b.a(i10, 3)) {
                            f10 = f19 - dVar2.f4334c;
                        } else if (b.a(i10, 4)) {
                            f10 = dVar2.f4332a - f18;
                        } else if (b.a(i10, 5)) {
                            f10 = f17 - dVar2.f4335d;
                        } else {
                            if (b.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            f10 = dVar2.f4333b - f16;
                        }
                        fMax = Math.max(0.0f, f10);
                        if (b.a(i10, 3)) {
                            f11 = f19 - f14;
                        } else if (b.a(i10, 4)) {
                            f11 = f15 - f18;
                        } else if (b.a(i10, 5)) {
                            f11 = f17 - f12;
                        } else {
                            if (b.a(i10, 6)) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            f11 = f13 - f16;
                        }
                        if (fMax < Math.max(1.0f, f11)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean c(int i10, d dVar, d dVar2) {
        if (b.a(i10, 3) || b.a(i10, 4)) {
            if (dVar.f4335d <= dVar2.f4333b || dVar.f4333b >= dVar2.f4335d) {
                return false;
            }
        } else {
            if (!b.a(i10, 5) && !b.a(i10, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (dVar.f4334c <= dVar2.f4332a || dVar.f4332a >= dVar2.f4334c) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(p pVar, boolean z10, boolean z11) {
        int iOrdinal = pVar.H0().ordinal();
        c1.o oVar = c1.o.f2909c;
        if (iOrdinal == 0) {
            pVar.K0(oVar);
            if (z11) {
                B(pVar);
            }
        } else if (iOrdinal == 1) {
            p pVarN = n(pVar);
            if (!(pVarN != null ? d(pVarN, z10, z11) : true)) {
                return false;
            }
            pVar.K0(oVar);
            if (z11) {
                B(pVar);
            }
        } else {
            if (iOrdinal == 2) {
                if (!z10) {
                    return z10;
                }
                pVar.K0(oVar);
                if (!z11) {
                    return z10;
                }
                B(pVar);
                return z10;
            }
            if (iOrdinal != 3) {
                throw new a0();
            }
        }
        return true;
    }

    public static final void e(t1.n nVar, i iVar) {
        n nVar2 = ((n) nVar).f16730a;
        if (!nVar2.f16742t) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        i iVar2 = new i(new n[16]);
        n nVar3 = nVar2.f16735f;
        if (nVar3 == null) {
            g.b(iVar2, nVar2);
        } else {
            iVar2.c(nVar3);
        }
        while (iVar2.l()) {
            n nVarF = (n) iVar2.n(iVar2.f12343c - 1);
            if ((nVarF.f16733d & 1024) == 0) {
                g.b(iVar2, nVarF);
            } else {
                while (nVarF != null) {
                    if ((nVarF.f16732c & 1024) != 0) {
                        i iVar3 = null;
                        while (nVarF != null) {
                            if (nVarF instanceof p) {
                                p pVar = (p) nVarF;
                                if (pVar.f16742t) {
                                    if (pVar.G0().f2892a) {
                                        iVar.c(pVar);
                                    } else {
                                        e(pVar, iVar);
                                    }
                                }
                            } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                                int i10 = 0;
                                for (n nVar4 = ((o) nVarF).f14521v; nVar4 != null; nVar4 = nVar4.f16735f) {
                                    if ((nVar4.f16732c & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nVarF = nVar4;
                                        } else {
                                            if (iVar3 == null) {
                                                iVar3 = new i(new n[16]);
                                            }
                                            if (nVarF != null) {
                                                iVar3.c(nVarF);
                                                nVarF = null;
                                            }
                                            iVar3.c(nVar4);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            nVarF = g.f(iVar3);
                        }
                        break;
                    }
                    nVarF = nVarF.f16735f;
                }
            }
        }
    }

    public static final p f(p pVar) {
        int iOrdinal = pVar.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                n nVar = pVar.f16730a;
                if (!nVar.f16742t) {
                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                }
                i iVar = new i(new n[16]);
                n nVar2 = nVar.f16735f;
                if (nVar2 == null) {
                    g.b(iVar, nVar);
                } else {
                    iVar.c(nVar2);
                }
                while (iVar.l()) {
                    n nVarF = (n) iVar.n(iVar.f12343c - 1);
                    if ((nVarF.f16733d & 1024) == 0) {
                        g.b(iVar, nVarF);
                    } else {
                        while (nVarF != null) {
                            if ((nVarF.f16732c & 1024) != 0) {
                                i iVar2 = null;
                                while (nVarF != null) {
                                    if (nVarF instanceof p) {
                                        p pVarF = f((p) nVarF);
                                        if (pVarF != null) {
                                            return pVarF;
                                        }
                                    } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                                        int i10 = 0;
                                        for (n nVar3 = ((o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                            if ((nVar3.f16732c & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    nVarF = nVar3;
                                                } else {
                                                    if (iVar2 == null) {
                                                        iVar2 = new i(new n[16]);
                                                    }
                                                    if (nVarF != null) {
                                                        iVar2.c(nVarF);
                                                        nVarF = null;
                                                    }
                                                    iVar2.c(nVar3);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    nVarF = g.f(iVar2);
                                }
                                break;
                            }
                            nVarF = nVarF.f16735f;
                        }
                    }
                }
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return null;
                }
                throw new a0();
            }
        }
        return pVar;
    }

    public static final p g(i iVar, d dVar, int i10) {
        d dVarF;
        if (b.a(i10, 3)) {
            dVarF = dVar.f(dVar.c() + 1, 0.0f);
        } else if (b.a(i10, 4)) {
            dVarF = dVar.f(-(dVar.c() + 1), 0.0f);
        } else if (b.a(i10, 5)) {
            dVarF = dVar.f(0.0f, dVar.b() + 1);
        } else {
            if (!b.a(i10, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            dVarF = dVar.f(0.0f, -(dVar.b() + 1));
        }
        int i11 = iVar.f12343c;
        p pVar = null;
        if (i11 > 0) {
            Object[] objArr = iVar.f12341a;
            int i12 = 0;
            do {
                p pVar2 = (p) objArr[i12];
                if (t(pVar2)) {
                    d dVarI = i(pVar2);
                    if (r(i10, dVarI, dVar) && (!r(i10, dVarF, dVar) || b(dVar, dVarI, dVarF, i10) || (!b(dVar, dVarF, dVarI, i10) && s(i10, dVar, dVarI) < s(i10, dVar, dVarF)))) {
                        pVar = pVar2;
                        dVarF = dVarI;
                    }
                }
                i12++;
            } while (i12 < i11);
        }
        return pVar;
    }

    public static final boolean h(p pVar, int i10, c cVar) {
        d dVar;
        i iVar = new i(new p[16]);
        e(pVar, iVar);
        if (iVar.f12343c <= 1) {
            p pVar2 = (p) (iVar.k() ? null : iVar.f12341a[0]);
            if (pVar2 != null) {
                return ((Boolean) cVar.invoke(pVar2)).booleanValue();
            }
            return false;
        }
        if (b.a(i10, 7)) {
            i10 = 4;
        }
        if (b.a(i10, 4) || b.a(i10, 6)) {
            d dVarI = i(pVar);
            float f10 = dVarI.f4333b;
            float f11 = dVarI.f4332a;
            dVar = new d(f11, f10, f11, f10);
        } else {
            if (!b.a(i10, 3) && !b.a(i10, 5)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            d dVarI2 = i(pVar);
            float f12 = dVarI2.f4335d;
            float f13 = dVarI2.f4334c;
            dVar = new d(f13, f12, f13, f12);
        }
        p pVarG = g(iVar, dVar, i10);
        if (pVarG != null) {
            return ((Boolean) cVar.invoke(pVarG)).booleanValue();
        }
        return false;
    }

    public static final d i(p pVar) {
        d dVarB;
        c1 c1Var = pVar.f16737o;
        return (c1Var == null || (dVarB = androidx.compose.ui.layout.a.d(c1Var).b(c1Var, false)) == null) ? d.f4331e : dVarB;
    }

    public static final y0.o j(c1.k kVar) {
        return new FocusRequesterElement(kVar);
    }

    public static final boolean k(p pVar, c cVar) {
        int iOrdinal = pVar.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                p pVarN = n(pVar);
                if (pVarN != null) {
                    return k(pVarN, cVar) || l(pVar, pVarN, 1, cVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return pVar.G0().f2892a ? ((Boolean) cVar.invoke(pVar)).booleanValue() : A(pVar, cVar);
                }
                throw new a0();
            }
        }
        return A(pVar, cVar);
    }

    public static final boolean l(p pVar, p pVar2, int i10, c cVar) {
        if (G(pVar, pVar2, i10, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) F(pVar, i10, new s(pVar, pVar2, i10, cVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(p pVar, p pVar2, int i10, c cVar) {
        if (H(pVar, pVar2, i10, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) F(pVar, i10, new s(pVar, pVar2, i10, cVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final p n(p pVar) {
        int iOrdinal;
        n nVar = pVar.f16730a;
        boolean z10 = nVar.f16742t;
        if (!z10) {
            return null;
        }
        if (!z10) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        i iVar = new i(new n[16]);
        n nVar2 = nVar.f16735f;
        if (nVar2 == null) {
            g.b(iVar, nVar);
        } else {
            iVar.c(nVar2);
        }
        while (iVar.l()) {
            n nVarF = (n) iVar.n(iVar.f12343c - 1);
            if ((nVarF.f16733d & 1024) == 0) {
                g.b(iVar, nVarF);
            } else {
                while (nVarF != null) {
                    if ((nVarF.f16732c & 1024) != 0) {
                        i iVar2 = null;
                        while (nVarF != null) {
                            if (nVarF instanceof p) {
                                p pVar2 = (p) nVarF;
                                if (pVar2.f16730a.f16742t && ((iOrdinal = pVar2.H0().ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2)) {
                                    return pVar2;
                                }
                            } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                                int i10 = 0;
                                for (n nVar3 = ((o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                    if ((nVar3.f16732c & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nVarF = nVar3;
                                        } else {
                                            if (iVar2 == null) {
                                                iVar2 = new i(new n[16]);
                                            }
                                            if (nVarF != null) {
                                                iVar2.c(nVarF);
                                                nVarF = null;
                                            }
                                            iVar2.c(nVar3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            nVarF = g.f(iVar2);
                        }
                        break;
                    }
                    nVarF = nVarF.f16735f;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final c1.o o(c1.c cVar) {
        n nVar = (n) cVar;
        n nVarF = nVar.f16730a;
        i iVar = null;
        while (true) {
            int i10 = 0;
            if (nVarF == null) {
                n nVar2 = nVar.f16730a;
                if (!nVar2.f16742t) {
                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                }
                i iVar2 = new i(new n[16]);
                n nVar3 = nVar2.f16735f;
                if (nVar3 == null) {
                    g.b(iVar2, nVar2);
                } else {
                    iVar2.c(nVar3);
                }
                while (iVar2.l()) {
                    n nVarF2 = (n) iVar2.n(iVar2.f12343c - 1);
                    if ((nVarF2.f16733d & 1024) == 0) {
                        g.b(iVar2, nVarF2);
                    } else {
                        while (nVarF2 != null) {
                            if ((nVarF2.f16732c & 1024) != 0) {
                                i iVar3 = null;
                                while (nVarF2 != null) {
                                    if (nVarF2 instanceof p) {
                                        c1.o oVarH0 = ((p) nVarF2).H0();
                                        int iOrdinal = oVarH0.ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return oVarH0;
                                        }
                                    } else if ((nVarF2.f16732c & 1024) != 0 && (nVarF2 instanceof o)) {
                                        int i11 = 0;
                                        for (n nVar4 = ((o) nVarF2).f14521v; nVar4 != null; nVar4 = nVar4.f16735f) {
                                            if ((nVar4.f16732c & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    nVarF2 = nVar4;
                                                } else {
                                                    if (iVar3 == null) {
                                                        iVar3 = new i(new n[16]);
                                                    }
                                                    if (nVarF2 != null) {
                                                        iVar3.c(nVarF2);
                                                        nVarF2 = null;
                                                    }
                                                    iVar3.c(nVar4);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    nVarF2 = g.f(iVar3);
                                }
                                break;
                            }
                            nVarF2 = nVarF2.f16735f;
                        }
                    }
                }
                return c1.o.f2909c;
            }
            if (nVarF instanceof p) {
                c1.o oVarH1 = ((p) nVarF).H0();
                int iOrdinal2 = oVarH1.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                    return oVarH1;
                }
            } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                for (n nVar5 = ((o) nVarF).f14521v; nVar5 != null; nVar5 = nVar5.f16735f) {
                    if ((nVar5.f16732c & 1024) != 0) {
                        i10++;
                        if (i10 == 1) {
                            nVarF = nVar5;
                        } else {
                            if (iVar == null) {
                                iVar = new i(new n[16]);
                            }
                            if (nVarF != null) {
                                iVar.c(nVarF);
                                nVarF = null;
                            }
                            iVar.c(nVar5);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            nVarF = g.f(iVar);
        }
    }

    public static final void p(p pVar) {
        g.w(pVar, new l0(pVar, 19));
        int iOrdinal = pVar.H0().ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            pVar.K0(c1.o.f2907a);
        }
    }

    public static final void q(c1.c cVar) {
        c1.d dVar = ((f) ((w) g.A(cVar)).getFocusOwner()).f2882b;
        dVar.a(dVar.f2878c, cVar);
    }

    public static final boolean r(int i10, d dVar, d dVar2) {
        boolean zA = b.a(i10, 3);
        float f10 = dVar.f4332a;
        float f11 = dVar.f4334c;
        float f12 = dVar2.f4332a;
        float f13 = dVar2.f4334c;
        if (zA) {
            if ((f13 <= f11 && f12 < f11) || f12 <= f10) {
                return false;
            }
        } else if (!b.a(i10, 4)) {
            boolean zA2 = b.a(i10, 5);
            float f14 = dVar.f4333b;
            float f15 = dVar.f4335d;
            float f16 = dVar2.f4333b;
            float f17 = dVar2.f4335d;
            if (zA2) {
                if ((f17 <= f15 && f16 < f15) || f16 <= f14) {
                    return false;
                }
            } else {
                if (!b.a(i10, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                if ((f16 >= f14 && f17 > f14) || f17 >= f15) {
                    return false;
                }
            }
        } else if ((f12 >= f10 && f13 > f10) || f13 >= f11) {
            return false;
        }
        return true;
    }

    public static final long s(int i10, d dVar, d dVar2) {
        float f10;
        float f11;
        float fB;
        boolean zA = b.a(i10, 3);
        float f12 = dVar.f4333b;
        float f13 = dVar.f4332a;
        float f14 = dVar2.f4333b;
        float f15 = dVar2.f4332a;
        if (zA) {
            f10 = f13 - dVar2.f4334c;
        } else if (b.a(i10, 4)) {
            f10 = f15 - dVar.f4334c;
        } else if (b.a(i10, 5)) {
            f10 = f12 - dVar2.f4335d;
        } else {
            if (!b.a(i10, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f10 = f14 - dVar.f4335d;
        }
        long jAbs = (long) Math.abs(Math.max(0.0f, f10));
        if (b.a(i10, 3) || b.a(i10, 4)) {
            float fB2 = dVar.b();
            float f16 = 2;
            f11 = (fB2 / f16) + f12;
            fB = (dVar2.b() / f16) + f14;
        } else {
            if (!b.a(i10, 5) && !b.a(i10, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            float fC = dVar.c();
            float f17 = 2;
            f11 = (fC / f17) + f13;
            fB = (dVar2.c() / f17) + f15;
        }
        long jAbs2 = (long) Math.abs(f11 - fB);
        return (jAbs2 * jAbs2) + (((long) 13) * jAbs * jAbs);
    }

    public static final boolean t(p pVar) {
        androidx.compose.ui.node.a aVar;
        c1 c1Var;
        androidx.compose.ui.node.a aVar2;
        c1 c1Var2 = pVar.f16737o;
        return (c1Var2 == null || (aVar = c1Var2.f14395p) == null || !aVar.D() || (c1Var = pVar.f16737o) == null || (aVar2 = c1Var.f14395p) == null || !aVar2.C()) ? false : true;
    }

    public static final y0.o u(y0.o oVar, x xVar) {
        return oVar.j(new FocusChangedElement(xVar));
    }

    public static final int v(p pVar, int i10) {
        int iOrdinal = pVar.H0().ordinal();
        int i11 = 1;
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            p pVarN = n(pVar);
            if (pVarN == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child".toString());
            }
            int iV = v(pVarN, i10);
            if (iV == 1) {
                iV = 0;
            }
            if (iV != 0) {
                return iV;
            }
            if (pVar.f2911u) {
                return 1;
            }
            pVar.f2911u = true;
            try {
                c1.k kVar = (c1.k) pVar.G0().f2902k.invoke(new b(i10));
                if (kVar != c1.k.f2903b) {
                    if (kVar != c1.k.f2904c) {
                        i11 = kVar.a() ? 3 : 4;
                    }
                }
                return i11;
            } finally {
                pVar.f2911u = false;
            }
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return 1;
            }
            throw new a0();
        }
        return 2;
    }

    public static final int w(p pVar, int i10) {
        if (!pVar.f2912v) {
            pVar.f2912v = true;
            try {
                c1.k kVar = (c1.k) pVar.G0().f2901j.invoke(new b(i10));
                if (kVar != c1.k.f2903b) {
                    if (kVar == c1.k.f2904c) {
                        return 2;
                    }
                    return kVar.a() ? 3 : 4;
                }
            } finally {
                pVar.f2912v = false;
            }
        }
        return 1;
    }

    public static final int x(p pVar, int i10) {
        n nVar;
        x0 x0Var;
        int iOrdinal = pVar.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                p pVarN = n(pVar);
                if (pVarN != null) {
                    return v(pVarN, i10);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child".toString());
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new a0();
                }
                n nVar2 = pVar.f16730a;
                if (!nVar2.f16742t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                n nVar3 = nVar2.f16734e;
                androidx.compose.ui.node.a aVarY = g.y(pVar);
                loop0: while (true) {
                    nVar = null;
                    if (aVarY == null) {
                        break;
                    }
                    if ((aVarY.C.f14579e.f16733d & 1024) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f16732c & 1024) != 0) {
                                n nVarF = nVar3;
                                i iVar = null;
                                while (nVarF != null) {
                                    if (nVarF instanceof p) {
                                        nVar = nVarF;
                                        break loop0;
                                    }
                                    if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                                        int i11 = 0;
                                        for (n nVar4 = ((o) nVarF).f14521v; nVar4 != null; nVar4 = nVar4.f16735f) {
                                            if ((nVar4.f16732c & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    nVarF = nVar4;
                                                } else {
                                                    if (iVar == null) {
                                                        iVar = new i(new n[16]);
                                                    }
                                                    if (nVarF != null) {
                                                        iVar.c(nVarF);
                                                        nVarF = null;
                                                    }
                                                    iVar.c(nVar4);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    nVarF = g.f(iVar);
                                }
                            }
                            nVar3 = nVar3.f16734e;
                        }
                    }
                    aVarY = aVarY.q();
                    nVar3 = (aVarY == null || (x0Var = aVarY.C) == null) ? null : x0Var.f14578d;
                }
                p pVar2 = (p) nVar;
                if (pVar2 == null) {
                    return 1;
                }
                int iOrdinal2 = pVar2.H0().ordinal();
                if (iOrdinal2 == 0) {
                    return w(pVar2, i10);
                }
                if (iOrdinal2 == 1) {
                    return x(pVar2, i10);
                }
                if (iOrdinal2 == 2) {
                    return 2;
                }
                if (iOrdinal2 != 3) {
                    throw new a0();
                }
                int iX = x(pVar2, i10);
                int i12 = iX == 1 ? 0 : iX;
                return i12 == 0 ? w(pVar2, i10) : i12;
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    public static final boolean y(p pVar) {
        n nVar;
        androidx.compose.ui.node.a aVar;
        l1 l1Var;
        x0 x0Var;
        int iOrdinal = pVar.H0().ordinal();
        boolean zD = true;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                p pVarN = n(pVar);
                if (pVarN != null ? d(pVarN, false, true) : true) {
                    p(pVar);
                } else {
                    zD = false;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new a0();
                }
                n nVar2 = pVar.f16730a;
                if (!nVar2.f16742t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                n nVar3 = nVar2.f16734e;
                androidx.compose.ui.node.a aVarY = g.y(pVar);
                loop0: while (true) {
                    nVar = null;
                    if (aVarY == null) {
                        break;
                    }
                    if ((aVarY.C.f14579e.f16733d & 1024) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f16732c & 1024) != 0) {
                                n nVarF = nVar3;
                                i iVar = null;
                                while (nVarF != null) {
                                    if (nVarF instanceof p) {
                                        nVar = nVarF;
                                        break loop0;
                                    }
                                    if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                                        int i10 = 0;
                                        for (n nVar4 = ((o) nVarF).f14521v; nVar4 != null; nVar4 = nVar4.f16735f) {
                                            if ((nVar4.f16732c & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    nVarF = nVar4;
                                                } else {
                                                    if (iVar == null) {
                                                        iVar = new i(new n[16]);
                                                    }
                                                    if (nVarF != null) {
                                                        iVar.c(nVarF);
                                                        nVarF = null;
                                                    }
                                                    iVar.c(nVar4);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    nVarF = g.f(iVar);
                                }
                            }
                            nVar3 = nVar3.f16734e;
                        }
                    }
                    aVarY = aVarY.q();
                    nVar3 = (aVarY == null || (x0Var = aVarY.C) == null) ? null : x0Var.f14578d;
                }
                p pVar2 = (p) nVar;
                if (pVar2 != null) {
                    c1.o oVarH0 = pVar2.H0();
                    zD = D(pVar2, pVar);
                    if (zD && oVarH0 != pVar2.H0()) {
                        B(pVar2);
                    }
                } else {
                    c1 c1Var = pVar.f16737o;
                    if (c1Var == null || (aVar = c1Var.f14395p) == null || (l1Var = aVar.f1744p) == null) {
                        throw new IllegalStateException("Owner not initialized.".toString());
                    }
                    if (l1Var.requestFocus()) {
                        p(pVar);
                    } else {
                        zD = false;
                    }
                }
            }
        }
        if (zD) {
            B(pVar);
        }
        return zD;
    }

    public static final boolean z(p pVar, c cVar) {
        Object[] objArrCopyOf = new p[16];
        n nVar = pVar.f16730a;
        if (!nVar.f16742t) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        i iVar = new i(new n[16]);
        n nVar2 = nVar.f16735f;
        if (nVar2 == null) {
            g.b(iVar, nVar);
        } else {
            iVar.c(nVar2);
        }
        int i10 = 0;
        while (iVar.l()) {
            n nVarF = (n) iVar.n(iVar.f12343c - 1);
            if ((nVarF.f16733d & 1024) == 0) {
                g.b(iVar, nVarF);
            } else {
                while (nVarF != null) {
                    if ((nVarF.f16732c & 1024) != 0) {
                        i iVar2 = null;
                        while (nVarF != null) {
                            if (nVarF instanceof p) {
                                p pVar2 = (p) nVarF;
                                int i11 = i10 + 1;
                                if (objArrCopyOf.length < i11) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i11, objArrCopyOf.length * 2));
                                    d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
                                }
                                objArrCopyOf[i10] = pVar2;
                                i10 = i11;
                            } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                                int i12 = 0;
                                for (n nVar3 = ((o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                    if ((nVar3.f16732c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            nVarF = nVar3;
                                        } else {
                                            if (iVar2 == null) {
                                                iVar2 = new i(new n[16]);
                                            }
                                            if (nVarF != null) {
                                                iVar2.c(nVarF);
                                                nVarF = null;
                                            }
                                            iVar2.c(nVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            nVarF = g.f(iVar2);
                        }
                        break;
                    }
                    nVarF = nVarF.f16735f;
                }
            }
        }
        r rVar = r.f2917a;
        d7.a.m(objArrCopyOf, "<this>");
        Arrays.sort(objArrCopyOf, 0, i10, rVar);
        if (i10 > 0) {
            int i13 = i10 - 1;
            do {
                p pVar3 = (p) objArrCopyOf[i13];
                if (t(pVar3) && a(pVar3, cVar)) {
                    return true;
                }
                i13--;
            } while (i13 >= 0);
        }
        return false;
    }
}
