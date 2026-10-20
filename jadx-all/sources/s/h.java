package s;

import com.auto.accept.data.model.TransactionData;
import com.auto.accept.ui.viewmodel.MainViewModel;
import f0.b2;
import f0.o1;
import k0.c5;
import k0.e1;
import m0.g1;
import m0.l2;
import m0.l3;
import m0.o3;
import m0.r1;
import u.l1;
import u1.s1;
import y.i1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d9.j implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13783b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i10) {
        super(3);
        this.f13782a = i10;
        this.f13783b = obj;
    }

    public final y0.o a(y0.o oVar, m0.m mVar) {
        k0.y0 y0Var = m0.l.f11578a;
        int i10 = this.f13782a;
        int i11 = 1;
        Object obj = this.f13783b;
        switch (i10) {
            case 2:
                m0.q qVar = (m0.q) mVar;
                qVar.Z(-1608161351);
                c9.c cVar = (c9.c) obj;
                qVar.Z(1157296644);
                boolean zG = qVar.g(cVar);
                Object objP = qVar.P();
                if (zG || objP == y0Var) {
                    objP = new y.x(cVar);
                    qVar.l0(objP);
                }
                qVar.t(false);
                y.x xVar = (y.x) objP;
                qVar.t(false);
                return xVar;
            case 3:
                m0.q qVar2 = (m0.q) mVar;
                qVar2.Z(-1415685722);
                i1 i1Var = (i1) obj;
                qVar2.Z(1157296644);
                boolean zG2 = qVar2.g(i1Var);
                Object objP2 = qVar2.P();
                if (zG2 || objP2 == y0Var) {
                    objP2 = new y.i0(i1Var);
                    qVar2.l0(objP2);
                }
                qVar2.t(false);
                y.i0 i0Var = (y.i0) objP2;
                qVar2.t(false);
                return i0Var;
            case 4:
            default:
                m0.q qVar3 = (m0.q) mVar;
                qVar3.Z(1980580247);
                m2.b bVar = (m2.b) qVar3.m(s1.f15275e);
                qVar3.Z(-492369756);
                Object objP3 = qVar3.P();
                if (objP3 == y0Var) {
                    objP3 = d7.t.g0(new m2.k(0L), o3.f11621a);
                    qVar3.l0(objP3);
                }
                qVar3.t(false);
                g1 g1Var = (g1) objP3;
                u.r0 r0Var = new u.r0(5, (h0.v0) obj, g1Var);
                qVar3.Z(-233457119);
                boolean zG3 = qVar3.g(g1Var) | qVar3.g(bVar);
                Object objP4 = qVar3.P();
                if (zG3 || objP4 == y0Var) {
                    objP4 = new h0.z0(bVar, g1Var, i11);
                    qVar3.l0(objP4);
                }
                qVar3.t(false);
                t.q qVar4 = h0.k0.f7420a;
                y0.o oVarV = m9.e0.v(oVar, new l1(2, r0Var, (c9.c) objP4));
                qVar3.t(false);
                return oVarV;
            case 5:
                m0.q qVar5 = (m0.q) mVar;
                qVar5.Z(1582736677);
                m2.b bVar2 = (m2.b) qVar5.m(s1.f15275e);
                f2.d dVar = (f2.d) qVar5.m(s1.f15278h);
                m2.l lVar = (m2.l) qVar5.m(s1.f15281k);
                a2.c0 c0Var = (a2.c0) obj;
                qVar5.Z(511388516);
                boolean zG4 = qVar5.g(c0Var) | qVar5.g(lVar);
                Object objP5 = qVar5.P();
                if (zG4 || objP5 == y0Var) {
                    objP5 = o1.s.g0(c0Var, lVar);
                    qVar5.l0(objP5);
                }
                qVar5.t(false);
                a2.c0 c0Var2 = (a2.c0) objP5;
                qVar5.Z(511388516);
                boolean zG5 = qVar5.g(dVar) | qVar5.g(c0Var2);
                Object objP6 = qVar5.P();
                if (zG5 || objP6 == y0Var) {
                    a2.x xVar2 = c0Var2.f911a;
                    f2.e eVar = xVar2.f1036f;
                    f2.l lVar2 = xVar2.f1033c;
                    if (lVar2 == null) {
                        lVar2 = f2.l.f6115c;
                    }
                    f2.j jVar = xVar2.f1034d;
                    int i12 = jVar != null ? jVar.f6112a : 0;
                    f2.k kVar = xVar2.f1035e;
                    objP6 = ((f2.f) dVar).b(eVar, lVar2, i12, kVar != null ? kVar.f6113a : 1);
                    qVar5.l0(objP6);
                }
                qVar5.t(false);
                l3 l3Var = (l3) objP6;
                qVar5.Z(-492369756);
                Object objP7 = qVar5.P();
                Object obj2 = objP7;
                if (objP7 == y0Var) {
                    Object value = l3Var.getValue();
                    b2 b2Var = new b2();
                    b2Var.f5617a = lVar;
                    b2Var.f5618b = bVar2;
                    b2Var.f5619c = dVar;
                    b2Var.f5620d = c0Var;
                    b2Var.f5621e = value;
                    b2Var.f5622f = o1.b(c0Var, bVar2, dVar);
                    qVar5.l0(b2Var);
                    obj2 = b2Var;
                }
                qVar5.t(false);
                b2 b2Var2 = (b2) obj2;
                Object value2 = l3Var.getValue();
                if (lVar != b2Var2.f5617a || !d7.a.d(bVar2, b2Var2.f5618b) || !d7.a.d(dVar, b2Var2.f5619c) || !d7.a.d(c0Var2, b2Var2.f5620d) || !d7.a.d(value2, b2Var2.f5621e)) {
                    b2Var2.f5617a = lVar;
                    b2Var2.f5618b = bVar2;
                    b2Var2.f5619c = dVar;
                    b2Var2.f5620d = c0Var2;
                    b2Var2.f5621e = value2;
                    b2Var2.f5622f = o1.b(c0Var2, bVar2, dVar);
                }
                y0.o oVarG = androidx.compose.ui.layout.a.g(y0.l.f16729b, new h(b2Var2, 4));
                qVar5.t(false);
                return oVarG;
        }
    }

    public final void b(y.a1 a1Var, m0.m mVar, int i10) {
        int i11 = this.f13782a;
        Object obj = this.f13783b;
        switch (i11) {
            case 8:
                d7.a.m(a1Var, "$this$Button");
                if ((i10 & 81) == 16) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    }
                }
                boolean zBooleanValue = ((Boolean) ((g1) obj).getValue()).booleanValue();
                y0.l lVar = y0.l.f16729b;
                if (!zBooleanValue) {
                    m0.q qVar2 = (m0.q) mVar;
                    qVar2.Z(-748798962);
                    i1.f fVarB = o7.d0.B();
                    long j10 = e5.a.f5134j;
                    e1.b(fVarB, null, null, j10, qVar2, 3120, 4);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.k(lVar, 8), qVar2);
                    c5.b("Download Update", null, j10, o1.s.N(16), null, f2.l.f6118f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar2, 200070, 0, 131026);
                    qVar2.t(false);
                } else {
                    m0.q qVar3 = (m0.q) mVar;
                    qVar3.Z(-748799528);
                    y0.o oVarH = androidx.compose.foundation.layout.c.h(lVar, 22);
                    long j11 = e5.a.f5134j;
                    k0.b2.a(oVarH, j11, 2, 0L, 0, qVar3, 438, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.k(lVar, 8), qVar3);
                    c5.b("Downloading...", null, j11, o1.s.N(16), null, f2.l.f6118f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 131026);
                    qVar3.t(false);
                }
                break;
            default:
                d7.a.m(a1Var, "$this$TopAppBar");
                if ((i10 & 81) == 16) {
                    m0.q qVar4 = (m0.q) mVar;
                    if (qVar4.G()) {
                        qVar4.U();
                    }
                }
                MainViewModel mainViewModel = (MainViewModel) obj;
                o7.d0.b(new c5.j(mainViewModel, 15), null, false, null, null, d7.t.K(mVar, -538727672, new o2.c(d7.t.I(mainViewModel.C0, mVar), 4)), mVar, 196608, 30);
                break;
        }
    }

    public final r1.k0 d(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        r8.s sVar = r8.s.f13662a;
        int i10 = this.f13782a;
        Object obj = this.f13783b;
        switch (i10) {
            case 0:
                r1.x0 x0VarF = i0Var.f(j10);
                return l0Var.N(x0VarF.f13423a, x0VarF.f13424b, sVar, new u(1, x0VarF, (i0) obj));
            case 1:
                r1.x0 x0VarF2 = i0Var.f(j10);
                a7.a.w(obj);
                if (!l0Var.q()) {
                    return l0Var.N(x0VarF2.f13423a, x0VarF2.f13424b, sVar, new z(x0VarF2, 0));
                }
                int i11 = x0VarF2.f13423a;
                throw null;
            default:
                androidx.compose.foundation.layout.c.a(y0.l.f16729b, Float.NaN, Float.NaN);
                long j11 = ((b2) obj).f5622f;
                r1.x0 x0VarF3 = i0Var.f(m2.a.b(j10, z6.a.r((int) (j11 >> 32), m2.a.k(j10), m2.a.i(j10)), 0, z6.a.r((int) (j11 & 4294967295L), m2.a.j(j10), m2.a.h(j10)), 0, 10));
                return l0Var.N(x0VarF3.f13423a, x0VarF3.f13424b, sVar, new z(x0VarF3, 5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0076  */
    /* JADX WARN: Code duplicated, block: B:14:0x007d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:33:0x0101  */
    /* JADX WARN: Code duplicated, block: B:36:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x0212  */
    /* JADX WARN: Code duplicated, block: B:41:0x0219  */
    /* JADX WARN: Code duplicated, block: B:42:0x021f  */
    /* JADX WARN: Code duplicated, block: B:47:0x023a  */
    /* JADX WARN: Code duplicated, block: B:52:0x025e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0261  */
    /* JADX WARN: Code duplicated, block: B:56:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:63:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x02e1  */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        y0.l lVar;
        TransactionData transactionData;
        m0.q qVar;
        r1.j0 j0VarA;
        int i10;
        r1 r1VarP;
        t1.j jVar;
        u0.b bVarI;
        boolean z10;
        t1.i iVar;
        t1.i iVar2;
        t1.i iVar3;
        y.e eVar;
        r1.j0 j0VarA2;
        int i11;
        r1 r1VarP2;
        u0.b bVarI2;
        f2.l lVar2;
        r1.j0 j0VarA3;
        int i12;
        r1 r1VarP3;
        u0.b bVarI3;
        long j10;
        long j11;
        q8.l lVar3 = q8.l.f13235a;
        int i13 = this.f13782a;
        Object obj4 = this.f13783b;
        switch (i13) {
            case 0:
                return d((r1.l0) obj, (r1.i0) obj2, ((m2.a) obj3).f11792a);
            case 1:
                return d((r1.l0) obj, (r1.i0) obj2, ((m2.a) obj3).f11792a);
            case 2:
                ((Number) obj3).intValue();
                return a((y0.o) obj, (m0.m) obj2);
            case 3:
                ((Number) obj3).intValue();
                return a((y0.o) obj, (m0.m) obj2);
            case 4:
                return d((r1.l0) obj, (r1.i0) obj2, ((m2.a) obj3).f11792a);
            case 5:
                ((Number) obj3).intValue();
                return a((y0.o) obj, (m0.m) obj2);
            case 6:
                ((Number) obj3).intValue();
                return a((y0.o) obj, (m0.m) obj2);
            case 7:
                m0.m mVar = ((l2) obj).f11580a;
                m0.m mVar2 = (m0.m) obj2;
                ((Number) obj3).intValue();
                int i14 = ((m0.q) mVar2).P;
                y0.o oVarG = m9.e0.G(mVar2, (y0.o) obj4);
                m0.q qVar2 = (m0.q) mVar;
                qVar2.Z(509942095);
                t1.l.f14477k.getClass();
                d7.t.s0(qVar2, oVarG, t1.k.f14459c);
                t1.i iVar4 = t1.k.f14462f;
                if (qVar2.O || !d7.a.d(qVar2.P(), Integer.valueOf(i14))) {
                    l.q.r(i14, qVar2, i14, iVar4);
                }
                qVar2.t(false);
                return lVar3;
            case 8:
                b((y.a1) obj, (m0.m) obj2, ((Number) obj3).intValue());
                return lVar3;
            case 9:
                b((y.a1) obj, (m0.m) obj2, ((Number) obj3).intValue());
                return lVar3;
            default:
                m0.m mVar3 = (m0.m) obj2;
                int iIntValue = ((Number) obj3).intValue();
                d7.a.m((y.v) obj, "$this$Card");
                if ((iIntValue & 81) == 16) {
                    m0.q qVar3 = (m0.q) mVar3;
                    if (qVar3.G()) {
                        qVar3.U();
                    } else {
                        lVar = y0.l.f16729b;
                        y0.o oVarL = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.f1667a, 12);
                        y0.f fVar = y0.a.f16714n;
                        transactionData = (TransactionData) obj4;
                        qVar = (m0.q) mVar3;
                        qVar.Z(693286680);
                        j0VarA = y.z0.a(y.k.f16605a, fVar, qVar);
                        qVar.Z(-1323940314);
                        i10 = qVar.P;
                        r1VarP = qVar.p();
                        t1.l.f14477k.getClass();
                        jVar = t1.k.f14458b;
                        bVarI = androidx.compose.ui.layout.a.i(oVarL);
                        z10 = qVar.f11630a instanceof m0.d;
                        if (z10) {
                            m9.e0.C();
                            throw null;
                        }
                        qVar.c0();
                        if (qVar.O) {
                            qVar.o(jVar);
                        } else {
                            qVar.o0();
                        }
                        iVar = t1.k.f14461e;
                        d7.t.s0(qVar, j0VarA, iVar);
                        iVar2 = t1.k.f14460d;
                        d7.t.s0(qVar, r1VarP, iVar2);
                        iVar3 = t1.k.f14462f;
                        if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i10))) {
                            l.q.r(i10, qVar, i10, iVar3);
                        }
                        bVarI.e(new l2(qVar), qVar, 0);
                        qVar.Z(2058660585);
                        y0.o oVarA = y.a1.a();
                        qVar.Z(-483455358);
                        eVar = y.k.f16607c;
                        j0VarA2 = y.u.a(eVar, y0.a.f16715o, qVar);
                        qVar.Z(-1323940314);
                        i11 = qVar.P;
                        r1VarP2 = qVar.p();
                        bVarI2 = androidx.compose.ui.layout.a.i(oVarA);
                        if (z10) {
                            m9.e0.C();
                            throw null;
                        }
                        qVar.c0();
                        if (qVar.O) {
                            qVar.o(jVar);
                        } else {
                            qVar.o0();
                        }
                        d7.t.s0(qVar, j0VarA2, iVar);
                        d7.t.s0(qVar, r1VarP2, iVar2);
                        if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i11))) {
                            l.q.r(i11, qVar, i11, iVar3);
                        }
                        l.q.u(qVar, bVarI2, qVar, 0, 2058660585);
                        String strConcat = l9.i.c1(transactionData.getPlanType(), "_", " ").concat(" Plan");
                        lVar2 = f2.l.f6118f;
                        c5.b(strConcat, null, e1.r.f5061c, o1.s.N(13), null, lVar2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 200064, 0, 131026);
                        c5.b(transactionData.getOrderId(), null, e5.a.f5137m, o1.s.N(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new a2.c0(0L, 0L, null, f2.e.f6103c, null, 16777183), qVar, 3456, 0, 65522);
                        qVar.Z(1624581636);
                        if (transactionData.getCouponCode().length() > 0) {
                            c5.b(l.q.x("Coupon: ", transactionData.getCouponCode()), null, e5.a.f5125a, o1.s.N(10), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 3456, 0, 131058);
                        }
                        l.q.v(qVar, false, false, true, false);
                        qVar.t(false);
                        y0.e eVar2 = y0.a.f16717q;
                        qVar.Z(-483455358);
                        j0VarA3 = y.u.a(eVar, eVar2, qVar);
                        qVar.Z(-1323940314);
                        i12 = qVar.P;
                        r1VarP3 = qVar.p();
                        bVarI3 = androidx.compose.ui.layout.a.i(lVar);
                        if (z10) {
                            m9.e0.C();
                            throw null;
                        }
                        qVar.c0();
                        if (qVar.O) {
                            qVar.o(jVar);
                        } else {
                            qVar.o0();
                        }
                        d7.t.s0(qVar, j0VarA3, iVar);
                        d7.t.s0(qVar, r1VarP3, iVar2);
                        if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i12))) {
                            l.q.r(i12, qVar, i12, iVar3);
                        }
                        l.q.u(qVar, bVarI3, qVar, 0, 2058660585);
                        String strG = l.q.g("₹", transactionData.getAmount());
                        if (d7.a.d(transactionData.getStatus(), "SUCCESS")) {
                            j10 = e5.a.f5139o;
                        } else {
                            j10 = e5.a.f5138n;
                        }
                        c5.b(strG, null, j10, o1.s.N(14), null, lVar2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 199680, 0, 131026);
                        String status = transactionData.getStatus();
                        long jN = o1.s.N(10);
                        if (d7.a.d(transactionData.getStatus(), "SUCCESS")) {
                            j11 = e5.a.f5139o;
                        } else {
                            j11 = e5.a.f5138n;
                        }
                        c5.b(status, null, j11, jN, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 3072, 0, 131058);
                        l.q.v(qVar, false, true, false, false);
                        l.q.v(qVar, false, true, false, false);
                    }
                } else {
                    lVar = y0.l.f16729b;
                    y0.o oVarL2 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.f1667a, 12);
                    y0.f fVar2 = y0.a.f16714n;
                    transactionData = (TransactionData) obj4;
                    qVar = (m0.q) mVar3;
                    qVar.Z(693286680);
                    j0VarA = y.z0.a(y.k.f16605a, fVar2, qVar);
                    qVar.Z(-1323940314);
                    i10 = qVar.P;
                    r1VarP = qVar.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarL2);
                    z10 = qVar.f11630a instanceof m0.d;
                    if (z10) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar.c0();
                    if (qVar.O) {
                        qVar.o(jVar);
                    } else {
                        qVar.o0();
                    }
                    iVar = t1.k.f14461e;
                    d7.t.s0(qVar, j0VarA, iVar);
                    iVar2 = t1.k.f14460d;
                    d7.t.s0(qVar, r1VarP, iVar2);
                    iVar3 = t1.k.f14462f;
                    if (qVar.O) {
                        l.q.r(i10, qVar, i10, iVar3);
                    } else {
                        l.q.r(i10, qVar, i10, iVar3);
                    }
                    bVarI.e(new l2(qVar), qVar, 0);
                    qVar.Z(2058660585);
                    y0.o oVarA2 = y.a1.a();
                    qVar.Z(-483455358);
                    eVar = y.k.f16607c;
                    j0VarA2 = y.u.a(eVar, y0.a.f16715o, qVar);
                    qVar.Z(-1323940314);
                    i11 = qVar.P;
                    r1VarP2 = qVar.p();
                    bVarI2 = androidx.compose.ui.layout.a.i(oVarA2);
                    if (z10) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar.c0();
                    if (qVar.O) {
                        qVar.o(jVar);
                    } else {
                        qVar.o0();
                    }
                    d7.t.s0(qVar, j0VarA2, iVar);
                    d7.t.s0(qVar, r1VarP2, iVar2);
                    if (qVar.O) {
                        l.q.r(i11, qVar, i11, iVar3);
                    } else {
                        l.q.r(i11, qVar, i11, iVar3);
                    }
                    l.q.u(qVar, bVarI2, qVar, 0, 2058660585);
                    String strConcat2 = l9.i.c1(transactionData.getPlanType(), "_", " ").concat(" Plan");
                    lVar2 = f2.l.f6118f;
                    c5.b(strConcat2, null, e1.r.f5061c, o1.s.N(13), null, lVar2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 200064, 0, 131026);
                    c5.b(transactionData.getOrderId(), null, e5.a.f5137m, o1.s.N(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new a2.c0(0L, 0L, null, f2.e.f6103c, null, 16777183), qVar, 3456, 0, 65522);
                    qVar.Z(1624581636);
                    if (transactionData.getCouponCode().length() > 0) {
                        c5.b(l.q.x("Coupon: ", transactionData.getCouponCode()), null, e5.a.f5125a, o1.s.N(10), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 3456, 0, 131058);
                    }
                    l.q.v(qVar, false, false, true, false);
                    qVar.t(false);
                    y0.e eVar3 = y0.a.f16717q;
                    qVar.Z(-483455358);
                    j0VarA3 = y.u.a(eVar, eVar3, qVar);
                    qVar.Z(-1323940314);
                    i12 = qVar.P;
                    r1VarP3 = qVar.p();
                    bVarI3 = androidx.compose.ui.layout.a.i(lVar);
                    if (z10) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar.c0();
                    if (qVar.O) {
                        qVar.o(jVar);
                    } else {
                        qVar.o0();
                    }
                    d7.t.s0(qVar, j0VarA3, iVar);
                    d7.t.s0(qVar, r1VarP3, iVar2);
                    if (qVar.O) {
                        l.q.r(i12, qVar, i12, iVar3);
                    } else {
                        l.q.r(i12, qVar, i12, iVar3);
                    }
                    l.q.u(qVar, bVarI3, qVar, 0, 2058660585);
                    String strG2 = l.q.g("₹", transactionData.getAmount());
                    if (d7.a.d(transactionData.getStatus(), "SUCCESS")) {
                        j10 = e5.a.f5139o;
                    } else {
                        j10 = e5.a.f5138n;
                    }
                    c5.b(strG2, null, j10, o1.s.N(14), null, lVar2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 199680, 0, 131026);
                    String status2 = transactionData.getStatus();
                    long jN2 = o1.s.N(10);
                    if (d7.a.d(transactionData.getStatus(), "SUCCESS")) {
                        j11 = e5.a.f5139o;
                    } else {
                        j11 = e5.a.f5138n;
                    }
                    c5.b(status2, null, j11, jN2, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 3072, 0, 131058);
                    l.q.v(qVar, false, true, false, false);
                    l.q.v(qVar, false, true, false, false);
                }
                return lVar3;
        }
    }
}
