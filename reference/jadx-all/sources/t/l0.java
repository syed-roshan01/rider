package t;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import v.l2;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14231b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, int i10) {
        super(0);
        this.f14230a = i10;
        this.f14231b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008e A[PHI: r0
  0x008e: PHI (r0v38 c1.p) = (r0v25 c1.p), (r0v40 c1.p) binds: [B:72:0x011d, B:29:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[PHI: r0
  0x0095: PHI (r0v34 c1.p) = (r0v25 c1.p), (r0v40 c1.p) binds: [B:72:0x011d, B:29:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    public final Boolean a() {
        c1.p pVar;
        boolean zH;
        u.b2 b2Var;
        int i10 = this.f14230a;
        boolean z10 = false;
        Object obj = this.f14231b;
        switch (i10) {
            case 1:
                u.e eVar = (u.e) obj;
                if (((Boolean) eVar.g(androidx.compose.foundation.gestures.a.f1634c)).booleanValue()) {
                    z10 = true;
                } else {
                    int i11 = u.h0.f14795b;
                    ViewParent parent = ((View) t1.g.p(eVar, u1.y0.f15381f)).getParent();
                    while (parent != null && (parent instanceof ViewGroup)) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (viewGroup.shouldDelayChildPressedState()) {
                            z10 = true;
                        } else {
                            parent = viewGroup.getParent();
                        }
                    }
                }
                return Boolean.valueOf(z10);
            case 2:
                u.t0 t0Var = (u.t0) obj;
                y0.n nVarF = t0Var.f16730a;
                o0.i iVar = null;
                while (true) {
                    c1.g gVar = c1.g.f2890e;
                    if (nVarF == null) {
                        y0.n nVar = t0Var.f16730a;
                        if (!nVar.f16742t) {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                        o0.i iVar2 = new o0.i(new y0.n[16]);
                        y0.n nVar2 = nVar.f16735f;
                        if (nVar2 == null) {
                            t1.g.b(iVar2, nVar);
                        } else {
                            iVar2.c(nVar2);
                        }
                        while (true) {
                            if (iVar2.l()) {
                                y0.n nVarF2 = (y0.n) iVar2.n(iVar2.f12343c - 1);
                                if ((nVarF2.f16733d & 1024) == 0) {
                                    t1.g.b(iVar2, nVarF2);
                                } else {
                                    while (true) {
                                        if (nVarF2 == null) {
                                            continue;
                                        } else if ((nVarF2.f16732c & 1024) != 0) {
                                            o0.i iVar3 = null;
                                            while (true) {
                                                if (nVarF2 == null) {
                                                    continue;
                                                } else if (nVarF2 instanceof c1.p) {
                                                    pVar = (c1.p) nVarF2;
                                                    if (pVar.G0().f2892a) {
                                                        zH = androidx.compose.ui.focus.a.C(pVar);
                                                    } else {
                                                        zH = androidx.compose.ui.focus.a.h(pVar, 7, gVar);
                                                    }
                                                    z10 = zH;
                                                } else {
                                                    if ((nVarF2.f16732c & 1024) != 0 && (nVarF2 instanceof t1.o)) {
                                                        int i12 = 0;
                                                        for (y0.n nVar3 = ((t1.o) nVarF2).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                                            if ((nVar3.f16732c & 1024) != 0) {
                                                                i12++;
                                                                if (i12 == 1) {
                                                                    nVarF2 = nVar3;
                                                                } else {
                                                                    if (iVar3 == null) {
                                                                        iVar3 = new o0.i(new y0.n[16]);
                                                                    }
                                                                    if (nVarF2 != null) {
                                                                        iVar3.c(nVarF2);
                                                                        nVarF2 = null;
                                                                    }
                                                                    iVar3.c(nVar3);
                                                                }
                                                            }
                                                        }
                                                        if (i12 == 1) {
                                                        }
                                                    }
                                                    nVarF2 = t1.g.f(iVar3);
                                                }
                                            }
                                        } else {
                                            nVarF2 = nVarF2.f16735f;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (nVarF instanceof c1.p) {
                        pVar = (c1.p) nVarF;
                        if (pVar.G0().f2892a) {
                            zH = androidx.compose.ui.focus.a.C(pVar);
                        } else {
                            zH = androidx.compose.ui.focus.a.h(pVar, 7, gVar);
                        }
                        z10 = zH;
                    } else {
                        if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof t1.o)) {
                            int i13 = 0;
                            for (y0.n nVar4 = ((t1.o) nVarF).f14521v; nVar4 != null; nVar4 = nVar4.f16735f) {
                                if ((nVar4.f16732c & 1024) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        nVarF = nVar4;
                                    } else {
                                        if (iVar == null) {
                                            iVar = new o0.i(new y0.n[16]);
                                        }
                                        if (nVarF != null) {
                                            iVar.c(nVarF);
                                            nVarF = null;
                                        }
                                        iVar.c(nVar4);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                        nVarF = t1.g.f(iVar);
                    }
                    return Boolean.valueOf(z10);
                }
            case 3:
                return (Boolean) ((v.j) obj).f15637z.invoke();
            case 5:
                l2 l2Var = ((v.u1) obj).f15795w;
                if (l2Var.f15669a.b() || ((Boolean) l2Var.f15675g.getValue()).booleanValue() || ((b2Var = l2Var.f15671c) != null && b2Var.b())) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 11:
                g0.h hVar = (g0.h) obj;
                hVar.H.setValue(null);
                t1.g.u(hVar);
                t1.g.t(hVar);
                t1.g.s(hVar);
                return Boolean.TRUE;
            case 12:
                g0.k kVar = (g0.k) obj;
                kVar.E.setValue(null);
                t1.g.u(kVar);
                t1.g.t(kVar);
                t1.g.s(kVar);
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(d9.i.u(((h0.m) obj).a()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m8209invoke() {
        d1.d dVarH0;
        m9.k kVarU;
        w0.a0 a0Var;
        Object[] objArr;
        int i10;
        char c10;
        c1.o oVarO;
        c1.o oVarH0;
        int i11 = 2;
        int i12 = 0;
        int i13 = 1;
        switch (this.f14230a) {
            case 4:
                v.s sVar = (v.s) this.f14231b;
                v.l lVar = sVar.f15769y;
                while (lVar.f15664a.l()) {
                    o0.i iVar = lVar.f15664a;
                    if (iVar.k()) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    d1.d dVar = (d1.d) ((v.p) iVar.f12341a[iVar.f12343c - 1]).f15731a.invoke();
                    if (dVar != null && !sVar.I0(sVar.D, dVar)) {
                        if (sVar.C && (dVarH0 = sVar.H0()) != null && sVar.I0(sVar.D, dVarH0)) {
                            sVar.C = false;
                        }
                        sVar.F.f15708e = v.s.G0(sVar);
                        return;
                    }
                    ((v.p) iVar.n(iVar.f12343c - 1)).f15732b.resumeWith(q8.l.f13235a);
                }
                if (sVar.C) {
                    sVar.C = false;
                }
                sVar.F.f15708e = v.s.G0(sVar);
                return;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 21:
            case 22:
            default:
                ((c9.c) this.f14231b).invoke(t1.c1.I);
                return;
            case 6:
                t1.g.p((v.e2) this.f14231b, u1.s1.f15275e);
                return;
            case Code.UNAVAILABLE /* 14 */:
                j0.a aVar = (j0.a) this.f14231b;
                aVar.f8237p.setValue(Boolean.valueOf(!((Boolean) aVar.f8237p.getValue()).booleanValue()));
                return;
            case Code.UNAUTHENTICATED /* 16 */:
                m0.g2 g2Var = (m0.g2) this.f14231b;
                synchronized (g2Var.f11520b) {
                    kVarU = g2Var.u();
                    if (((m0.a2) g2Var.f11536r.getValue()).compareTo(m0.a2.f11448b) <= 0) {
                        throw d7.a.a("Recomposer shutdown; frame clock awaiter will never resume", g2Var.f11522d);
                    }
                }
                if (kVarU != null) {
                    kVarU.resumeWith(q8.l.f13235a);
                    return;
                }
                return;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                break;
            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                c1.d dVar2 = (c1.d) this.f14231b;
                Iterator it = dVar2.f2879d.iterator();
                while (true) {
                    char c11 = 16;
                    if (!it.hasNext()) {
                        dVar2.f2879d.clear();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (c1.c cVar : dVar2.f2878c) {
                            y0.n nVar = (y0.n) cVar;
                            y0.n nVarF = nVar.f16730a;
                            boolean z10 = nVarF.f16742t;
                            c1.o oVar = c1.o.f2909c;
                            if (z10) {
                                int i14 = i12;
                                int i15 = i13;
                                c1.p pVar = null;
                                o0.i iVar2 = null;
                                while (nVarF != null) {
                                    if (nVarF instanceof c1.p) {
                                        c1.p pVar2 = (c1.p) nVarF;
                                        if (pVar != null) {
                                            i14 = i13;
                                        }
                                        if (dVar2.f2877b.contains(pVar2)) {
                                            linkedHashSet.add(pVar2);
                                            i15 = i12;
                                        }
                                        pVar = pVar2;
                                    } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof t1.o)) {
                                        y0.n nVar2 = ((t1.o) nVarF).f14521v;
                                        while (nVar2 != null) {
                                            if ((nVar2.f16732c & 1024) != 0) {
                                                i12++;
                                                if (i12 == i13) {
                                                    nVarF = nVar2;
                                                } else {
                                                    if (iVar2 == null) {
                                                        iVar2 = new o0.i(new y0.n[16]);
                                                    }
                                                    if (nVarF != null) {
                                                        iVar2.c(nVarF);
                                                        nVarF = null;
                                                    }
                                                    iVar2.c(nVar2);
                                                }
                                            }
                                            nVar2 = nVar2.f16735f;
                                            i13 = 1;
                                        }
                                        i12 = i12 == i13 ? 0 : 0;
                                    }
                                    nVarF = t1.g.f(iVar2);
                                    i13 = 1;
                                }
                                y0.n nVar3 = nVar.f16730a;
                                if (!nVar3.f16742t) {
                                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                }
                                o0.i iVar3 = new o0.i(new y0.n[16]);
                                y0.n nVar4 = nVar3.f16735f;
                                if (nVar4 == null) {
                                    t1.g.b(iVar3, nVar3);
                                } else {
                                    iVar3.c(nVar4);
                                }
                                while (iVar3.l()) {
                                    y0.n nVarF2 = (y0.n) iVar3.n(iVar3.f12343c - 1);
                                    if ((nVarF2.f16733d & 1024) == 0) {
                                        t1.g.b(iVar3, nVarF2);
                                    } else {
                                        while (true) {
                                            if (nVarF2 != null) {
                                                if ((nVarF2.f16732c & 1024) != 0) {
                                                    o0.i iVar4 = null;
                                                    while (nVarF2 != null) {
                                                        if (nVarF2 instanceof c1.p) {
                                                            c1.p pVar3 = (c1.p) nVarF2;
                                                            if (pVar != null) {
                                                                i14 = 1;
                                                            }
                                                            if (dVar2.f2877b.contains(pVar3)) {
                                                                linkedHashSet.add(pVar3);
                                                                i15 = 0;
                                                            }
                                                            pVar = pVar3;
                                                        } else if ((nVarF2.f16732c & 1024) != 0 && (nVarF2 instanceof t1.o)) {
                                                            int i16 = 0;
                                                            for (y0.n nVar5 = ((t1.o) nVarF2).f14521v; nVar5 != null; nVar5 = nVar5.f16735f) {
                                                                if ((nVar5.f16732c & 1024) != 0) {
                                                                    i16++;
                                                                    if (i16 == 1) {
                                                                        nVarF2 = nVar5;
                                                                    } else {
                                                                        if (iVar4 == null) {
                                                                            iVar4 = new o0.i(new y0.n[16]);
                                                                        }
                                                                        if (nVarF2 != null) {
                                                                            iVar4.c(nVarF2);
                                                                            nVarF2 = null;
                                                                        }
                                                                        iVar4.c(nVar5);
                                                                    }
                                                                }
                                                            }
                                                            if (i16 != 1) {
                                                                nVarF2 = t1.g.f(iVar4);
                                                            }
                                                        }
                                                        nVarF2 = t1.g.f(iVar4);
                                                    }
                                                }
                                                nVarF2 = nVarF2.f16735f;
                                                break;
                                            }
                                        }
                                    }
                                }
                                c10 = 16;
                                if (i15 != 0) {
                                    if (i14 != 0) {
                                        oVarO = androidx.compose.ui.focus.a.o(cVar);
                                    } else {
                                        if (pVar != null && (oVarH0 = pVar.H0()) != null) {
                                            oVar = oVarH0;
                                        }
                                        oVarO = oVar;
                                    }
                                    cVar.a0(oVarO);
                                }
                            } else {
                                cVar.a0(oVar);
                                c10 = c11;
                            }
                            c11 = c10;
                            i12 = 0;
                            i13 = 1;
                        }
                        dVar2.f2878c.clear();
                        for (c1.p pVar4 : dVar2.f2877b) {
                            if (pVar4.f16742t) {
                                c1.o oVarH1 = pVar4.H0();
                                pVar4.I0();
                                if (oVarH1 != pVar4.H0() || linkedHashSet.contains(pVar4)) {
                                    androidx.compose.ui.focus.a.B(pVar4);
                                }
                            }
                        }
                        dVar2.f2877b.clear();
                        linkedHashSet.clear();
                        if (!dVar2.f2879d.isEmpty()) {
                            throw new IllegalStateException("Unprocessed FocusProperties nodes".toString());
                        }
                        if (!dVar2.f2878c.isEmpty()) {
                            throw new IllegalStateException("Unprocessed FocusEvent nodes".toString());
                        }
                        if (!dVar2.f2877b.isEmpty()) {
                            throw new IllegalStateException("Unprocessed FocusTarget nodes".toString());
                        }
                        return;
                    }
                    y0.n nVar6 = (y0.n) ((c1.j) it.next());
                    y0.n nVarF3 = nVar6.f16730a;
                    if (nVarF3.f16742t) {
                        o0.i iVar5 = null;
                        while (nVarF3 != null) {
                            if (nVarF3 instanceof c1.p) {
                                dVar2.f2877b.add((c1.p) nVarF3);
                            } else if ((nVarF3.f16732c & 1024) != 0 && (nVarF3 instanceof t1.o)) {
                                int i17 = 0;
                                for (y0.n nVar7 = ((t1.o) nVarF3).f14521v; nVar7 != null; nVar7 = nVar7.f16735f) {
                                    if ((nVar7.f16732c & 1024) != 0) {
                                        i17++;
                                        if (i17 == 1) {
                                            nVarF3 = nVar7;
                                        } else {
                                            if (iVar5 == null) {
                                                iVar5 = new o0.i(new y0.n[16]);
                                            }
                                            if (nVarF3 != null) {
                                                iVar5.c(nVarF3);
                                                nVarF3 = null;
                                            }
                                            iVar5.c(nVar7);
                                        }
                                    }
                                }
                                if (i17 == 1) {
                                }
                            }
                            nVarF3 = t1.g.f(iVar5);
                        }
                        y0.n nVar8 = nVar6.f16730a;
                        if (!nVar8.f16742t) {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                        o0.i iVar6 = new o0.i(new y0.n[16]);
                        y0.n nVar9 = nVar8.f16735f;
                        if (nVar9 == null) {
                            t1.g.b(iVar6, nVar8);
                        } else {
                            iVar6.c(nVar9);
                        }
                        while (iVar6.l()) {
                            y0.n nVarF4 = (y0.n) iVar6.n(iVar6.f12343c - 1);
                            if ((nVarF4.f16733d & 1024) == 0) {
                                t1.g.b(iVar6, nVarF4);
                            } else {
                                while (nVarF4 != null) {
                                    if ((nVarF4.f16732c & 1024) != 0) {
                                        o0.i iVar7 = null;
                                        while (nVarF4 != null) {
                                            if (nVarF4 instanceof c1.p) {
                                                dVar2.f2877b.add((c1.p) nVarF4);
                                            } else if ((nVarF4.f16732c & 1024) != 0 && (nVarF4 instanceof t1.o)) {
                                                int i18 = 0;
                                                for (y0.n nVar10 = ((t1.o) nVarF4).f14521v; nVar10 != null; nVar10 = nVar10.f16735f) {
                                                    if ((nVar10.f16732c & 1024) != 0) {
                                                        i18++;
                                                        if (i18 == 1) {
                                                            nVarF4 = nVar10;
                                                        } else {
                                                            if (iVar7 == null) {
                                                                iVar7 = new o0.i(new y0.n[16]);
                                                            }
                                                            if (nVarF4 != null) {
                                                                iVar7.c(nVarF4);
                                                                nVarF4 = null;
                                                            }
                                                            iVar7.c(nVar10);
                                                        }
                                                    }
                                                }
                                                if (i18 == 1) {
                                                }
                                            }
                                            nVarF4 = t1.g.f(iVar7);
                                        }
                                    }
                                    nVarF4 = nVarF4.f16735f;
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            case 19:
                ((c1.p) this.f14231b).G0();
                return;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                i1.j0 j0Var = (i1.j0) this.f14231b;
                if (j0Var.f7847s == j0Var.f7844p.d()) {
                    j0Var.f7844p.f(j0Var.f7844p.d() + 1);
                    return;
                }
                return;
            case 23:
                r1.f0 f0VarA = ((r1.h1) this.f14231b).a();
                androidx.compose.ui.node.a aVar2 = f0VarA.f13359a;
                if (f0VarA.f13372u != aVar2.o().size()) {
                    Iterator it2 = f0VarA.f13364f.entrySet().iterator();
                    while (it2.hasNext()) {
                        ((r1.x) ((Map.Entry) it2.next()).getValue()).f13420d = true;
                    }
                    if (aVar2.D.f14497d) {
                        return;
                    }
                    androidx.compose.ui.node.a.Q(aVar2, false, 3);
                    return;
                }
                return;
            case 24:
                s1.e eVar = (s1.e) this.f14231b;
                eVar.f13913f = false;
                HashSet hashSet = new HashSet();
                o0.i iVar8 = eVar.f13911d;
                int i19 = iVar8.f12343c;
                o0.i iVar9 = eVar.f13912e;
                if (i19 > 0) {
                    Object[] objArr2 = iVar8.f12341a;
                    int i20 = 0;
                    do {
                        androidx.compose.ui.node.a aVar3 = (androidx.compose.ui.node.a) objArr2[i20];
                        s1.c cVar2 = (s1.c) iVar9.f12341a[i20];
                        y0.n nVar11 = aVar3.C.f14579e;
                        if (nVar11.f16742t) {
                            s1.e.b(nVar11, cVar2, hashSet);
                        }
                        i20++;
                    } while (i20 < i19);
                }
                iVar8.g();
                iVar9.g();
                o0.i iVar10 = eVar.f13909b;
                int i21 = iVar10.f12343c;
                o0.i iVar11 = eVar.f13910c;
                if (i21 > 0) {
                    Object[] objArr3 = iVar10.f12341a;
                    do {
                        t1.d dVar3 = (t1.d) objArr3[i12];
                        s1.c cVar3 = (s1.c) iVar11.f12341a[i12];
                        if (dVar3.f16742t) {
                            s1.e.b(dVar3, cVar3, hashSet);
                        }
                        i12++;
                    } while (i12 < i21);
                }
                iVar10.g();
                iVar11.g();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    ((t1.d) it3.next()).I0();
                }
                return;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                t1.n0 n0Var = ((androidx.compose.ui.node.a) this.f14231b).D;
                n0Var.f14508o.C = true;
                t1.k0 k0Var = n0Var.f14509p;
                if (k0Var != null) {
                    k0Var.f14475y = true;
                    return;
                }
                return;
            case 26:
                t1.l0 l0Var = (t1.l0) this.f14231b;
                t1.n0 n0Var2 = l0Var.L;
                n0Var2.f14504k = 0;
                o0.i iVarT = n0Var2.f14494a.t();
                int i22 = iVarT.f12343c;
                if (i22 > 0) {
                    Object[] objArr4 = iVarT.f12341a;
                    int i23 = 0;
                    do {
                        t1.l0 l0Var2 = ((androidx.compose.ui.node.a) objArr4[i23]).D.f14508o;
                        l0Var2.f14479n = l0Var2.f14480o;
                        l0Var2.f14480o = Integer.MAX_VALUE;
                        l0Var2.f14491z = false;
                        if (l0Var2.f14483r == 2) {
                            l0Var2.f14483r = 3;
                        }
                        i23++;
                    } while (i23 < i22);
                }
                l0Var.k(t1.f.f14419f);
                l0Var.l().s0().e();
                androidx.compose.ui.node.a aVar4 = l0Var.L.f14494a;
                o0.i iVarT2 = aVar4.t();
                int i24 = iVarT2.f12343c;
                if (i24 > 0) {
                    Object[] objArr5 = iVarT2.f12341a;
                    do {
                        androidx.compose.ui.node.a aVar5 = (androidx.compose.ui.node.a) objArr5[i12];
                        if (aVar5.D.f14508o.f14479n != aVar5.r()) {
                            aVar4.J();
                            aVar4.x();
                            if (aVar5.r() == Integer.MAX_VALUE) {
                                aVar5.D.f14508o.r0();
                            }
                        }
                        i12++;
                    } while (i12 < i24);
                }
                l0Var.k(t1.f.f14420n);
                return;
            case 27:
                t1.n0 n0Var3 = (t1.n0) this.f14231b;
                n0Var3.a().f(n0Var3.f14510q);
                return;
            case 28:
                t1.c1 c1Var = ((t1.c1) this.f14231b).f14397r;
                if (c1Var != null) {
                    c1Var.P0();
                    return;
                }
                return;
        }
        while (true) {
            w0.a0 a0Var2 = (w0.a0) this.f14231b;
            synchronized (a0Var2.f16027f) {
                if (!a0Var2.f16024c) {
                    a0Var2.f16024c = true;
                    try {
                        o0.i iVar12 = a0Var2.f16027f;
                        int i25 = iVar12.f12343c;
                        if (i25 > 0) {
                            try {
                                Object[] objArr6 = iVar12.f12341a;
                                int i26 = 0;
                                while (true) {
                                    try {
                                        w0.z zVar = (w0.z) objArr6[i26];
                                        q.t tVar = zVar.f16139g;
                                        Object[] objArr7 = tVar.f13039b;
                                        long[] jArr = tVar.f13038a;
                                        int length = jArr.length - i11;
                                        if (length >= 0) {
                                            int i27 = 0;
                                            while (true) {
                                                long j10 = jArr[i27];
                                                a0Var = a0Var2;
                                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i28 = 8;
                                                    int i29 = 8 - ((~(i27 - length)) >>> 31);
                                                    int i30 = 0;
                                                    while (i30 < i29) {
                                                        if ((j10 & 255) < 128) {
                                                            try {
                                                                zVar.f16133a.invoke(objArr7[(i27 << 3) + i30]);
                                                                i10 = 8;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                a0Var2 = a0Var;
                                                                a0Var2.f16024c = false;
                                                                throw th;
                                                            }
                                                        } else {
                                                            i10 = i28;
                                                        }
                                                        j10 >>= i10;
                                                        i30++;
                                                        i28 = i10;
                                                        objArr6 = objArr6;
                                                    }
                                                    objArr = objArr6;
                                                    if (i29 == i28) {
                                                    }
                                                } else {
                                                    objArr = objArr6;
                                                }
                                                if (i27 != length) {
                                                    i27++;
                                                    a0Var2 = a0Var;
                                                    objArr6 = objArr;
                                                }
                                            }
                                        } else {
                                            objArr = objArr6;
                                            a0Var = a0Var2;
                                        }
                                        tVar.d();
                                        i26++;
                                        a0Var2 = a0Var;
                                        if (i26 < i25) {
                                            objArr6 = objArr;
                                            i11 = 2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        a0Var2.f16024c = false;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                a0Var = a0Var2;
                            }
                        }
                        a0Var2.f16024c = false;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            }
            if (!w0.a0.a((w0.a0) this.f14231b)) {
                return;
            } else {
                i11 = 2;
            }
        }
    }

    @Override // c9.a
    public final Object invoke() {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f14230a;
        Object obj = this.f14231b;
        switch (i10) {
            case 0:
                return Float.valueOf(e.o(((m9.d0) obj).q()));
            case 1:
                return a();
            case 2:
                return a();
            case 3:
                return a();
            case 4:
                m8209invoke();
                return lVar;
            case 5:
                return a();
            case 6:
                m8209invoke();
                return lVar;
            case 7:
                return new a0.o0((v0.l) obj, r8.s.f13662a);
            case 8:
            default:
                m8209invoke();
                return lVar;
            case 9:
                return ((f0.c2) obj).d();
            case 10:
                return new f0.a2((v.h1) obj, 0.0f);
            case 11:
                return a();
            case 12:
                return a();
            case 13:
                return a();
            case Code.UNAVAILABLE /* 14 */:
                m8209invoke();
                return lVar;
            case 15:
                HashMap map = new HashMap();
                m0.q1 q1Var = (m0.q1) obj;
                int size = q1Var.f11659a.size();
                for (int i11 = 0; i11 < size; i11++) {
                    m0.w0 w0Var = (m0.w0) q1Var.f11659a.get(i11);
                    Object obj2 = w0Var.f11726b;
                    int i12 = w0Var.f11725a;
                    Object v0Var = obj2 != null ? new m0.v0(Integer.valueOf(i12), w0Var.f11726b) : Integer.valueOf(i12);
                    Object linkedHashSet = map.get(v0Var);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        map.put(v0Var, linkedHashSet);
                    }
                    ((LinkedHashSet) linkedHashSet).add(w0Var);
                }
                return map;
            case Code.UNAUTHENTICATED /* 16 */:
                m8209invoke();
                return lVar;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                m8209invoke();
                return lVar;
            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                m8209invoke();
                return lVar;
            case 19:
                m8209invoke();
                return lVar;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                m8209invoke();
                return lVar;
            case 21:
                switch (i10) {
                    case 21:
                        return ((n1.d) obj).f12108c;
                    default:
                        return ((n1.g) obj).G0();
                }
            case 22:
                switch (i10) {
                    case 21:
                        return ((n1.d) obj).f12108c;
                    default:
                        return ((n1.g) obj).G0();
                }
            case 23:
                m8209invoke();
                return lVar;
            case 24:
                m8209invoke();
                return lVar;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                m8209invoke();
                return lVar;
            case 26:
                m8209invoke();
                return lVar;
            case 27:
                m8209invoke();
                return lVar;
            case 28:
                m8209invoke();
                return lVar;
        }
    }
}
