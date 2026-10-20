package v;

import java.util.List;
import k0.c5;
import k0.e5;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i10, Object obj, Object obj2) {
        super(2);
        this.f15712a = i10;
        this.f15713b = obj;
        this.f15714c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(m0.m mVar, int i10) {
        y0.l lVar = y0.l.f16729b;
        int i11 = this.f15712a;
        int i12 = 1;
        Object obj = this.f15714c;
        Object obj2 = this.f15713b;
        int i13 = 2;
        switch (i11) {
            case 1:
                if ((i10 & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                        return;
                    }
                }
                a0.q qVar2 = (a0.q) obj2;
                a0.s sVar = (a0.s) qVar2.f846b.invoke();
                a0.p pVar = (a0.p) obj;
                int iB = pVar.f839c;
                int iC = sVar.c();
                Object obj3 = pVar.f837a;
                if ((iB >= iC || !d7.a.d(sVar.a(iB), obj3)) && (iB = sVar.b(obj3)) != -1) {
                    pVar.f839c = iB;
                }
                boolean z10 = iB != -1;
                m0.q qVar3 = (m0.q) mVar;
                qVar3.b0(Boolean.valueOf(z10));
                boolean zH = qVar3.h(z10);
                if (z10) {
                    f6.a.k(sVar, qVar2.f845a, iB, pVar.f837a, qVar3, 0);
                } else {
                    qVar3.q(zH);
                }
                qVar3.y();
                m0.s.a(obj3, new q.w(pVar, 15), qVar3);
                return;
            case 2:
            default:
                if ((i10 & 11) == 2) {
                    m0.q qVar4 = (m0.q) mVar;
                    if (qVar4.G()) {
                        qVar4.U();
                        return;
                    }
                }
                k0.x.b(d7.t.K(mVar, -13817032, new o2.c((m0.l3) obj2, 5)), null, d7.t.K(mVar, 1585332026, new d5.b1((c9.a) obj, null == true ? 1 : 0)), null, null, k0.t0.j(e5.a.f5131g, mVar), mVar, 390, 90);
                return;
            case 3:
                if ((i10 & 11) == 2) {
                    m0.q qVar5 = (m0.q) mVar;
                    if (qVar5.G()) {
                        qVar5.U();
                        return;
                    }
                }
                a0.o0 o0Var = (a0.o0) obj2;
                m0.q qVar6 = (m0.q) mVar;
                qVar6.Z(15454635);
                v0.j jVar = (v0.j) x3.c.d(new Object[0], v0.j.f15865d, v0.k.f15869b, qVar6, 4);
                jVar.f15868c = (v0.l) qVar6.m(v0.o.f15878a);
                qVar6.t(false);
                o0Var.f835b.setValue(jVar);
                ((c9.f) obj).e(o0Var, mVar, 8);
                return;
            case 4:
                if ((i10 & 3) == 2) {
                    m0.q qVar7 = (m0.q) mVar;
                    if (qVar7.G()) {
                        qVar7.U();
                        return;
                    }
                }
                y0.o oVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.a(lVar, k0.z.f9685c, k0.z.f9686d), (y.t0) obj2);
                y.f fVar = y.k.f16609e;
                y0.f fVar2 = y0.a.f16714n;
                c9.f fVar3 = (c9.f) obj;
                m0.q qVar8 = (m0.q) mVar;
                qVar8.Z(693286680);
                r1.j0 j0VarA = y.z0.a(fVar, fVar2, qVar8);
                qVar8.Z(-1323940314);
                int i14 = qVar8.P;
                m0.r1 r1VarP = qVar8.p();
                t1.l.f14477k.getClass();
                t1.j jVar2 = t1.k.f14458b;
                u0.b bVarI = androidx.compose.ui.layout.a.i(oVarK);
                if (!(qVar8.f11630a instanceof m0.d)) {
                    m9.e0.C();
                    throw null;
                }
                qVar8.c0();
                if (qVar8.O) {
                    qVar8.o(jVar2);
                } else {
                    qVar8.o0();
                }
                d7.t.s0(qVar8, j0VarA, t1.k.f14461e);
                d7.t.s0(qVar8, r1VarP, t1.k.f14460d);
                t1.i iVar = t1.k.f14462f;
                if (qVar8.O || !d7.a.d(qVar8.P(), Integer.valueOf(i14))) {
                    l.q.r(i14, qVar8, i14, iVar);
                }
                l.q.u(qVar8, bVarI, qVar8, 0, 2058660585);
                fVar3.e(y.b1.f16518a, qVar8, 6);
                l.q.v(qVar8, false, true, false, false);
                return;
            case 5:
                if ((i10 & 3) == 2) {
                    m0.q qVar9 = (m0.q) mVar;
                    if (qVar9.G()) {
                        qVar9.U();
                        return;
                    }
                }
                c5.a(((e5) obj2).f8889j, (c9.e) obj, mVar, 0);
                return;
            case 6:
                if ((i10 & 3) == 2) {
                    m0.q qVar10 = (m0.q) mVar;
                    if (qVar10.G()) {
                        qVar10.U();
                        return;
                    }
                }
                k0.x2 x2Var = (k0.x2) obj;
                d7.a.j(x2Var);
                ((c9.f) obj2).e(x2Var, mVar, 0);
                return;
            case 7:
                if ((i10 & 3) == 2) {
                    m0.q qVar11 = (m0.q) mVar;
                    if (qVar11.G()) {
                        qVar11.U();
                        return;
                    }
                }
                ((c9.f) obj2).e((List) obj, mVar, 0);
                return;
            case 8:
                if ((i10 & 11) == 2) {
                    m0.q qVar12 = (m0.q) mVar;
                    if (qVar12.G()) {
                        qVar12.U();
                        return;
                    }
                }
                a7.a.w(obj2);
                throw null;
            case 9:
                if ((i10 & 11) == 2) {
                    m0.q qVar13 = (m0.q) mVar;
                    if (qVar13.G()) {
                        qVar13.U();
                        return;
                    }
                }
                boolean zBooleanValue = ((Boolean) ((r1.x) obj2).f13422f.getValue()).booleanValue();
                c9.e eVar = (c9.e) obj;
                m0.q qVar14 = (m0.q) mVar;
                qVar14.b0(Boolean.valueOf(zBooleanValue));
                boolean zH2 = qVar14.h(zBooleanValue);
                if (zBooleanValue) {
                    eVar.invoke(qVar14, 0);
                } else {
                    qVar14.q(zH2);
                }
                qVar14.y();
                return;
            case 10:
                if ((i10 & 11) == 2) {
                    m0.q qVar15 = (m0.q) mVar;
                    if (qVar15.G()) {
                        qVar15.U();
                        return;
                    }
                }
                o2.r rVar = (o2.r) obj2;
                y0.o oVarA = androidx.compose.ui.draw.a.a(y1.l.a(lVar, false, o2.b.f12453e).j(new r1.t0(new o2.i(rVar, i12))), rVar.getCanCalculatePosition() ? 1.0f : 0.0f);
                u0.b bVarK = d7.t.K(mVar, 606497925, new o2.c((m0.l3) obj, i13));
                m0.q qVar16 = (m0.q) mVar;
                qVar16.Z(1406149896);
                o2.e eVar2 = o2.e.f12464c;
                qVar16.Z(-1323940314);
                int i15 = qVar16.P;
                m0.r1 r1VarP2 = qVar16.p();
                t1.l.f14477k.getClass();
                t1.j jVar3 = t1.k.f14458b;
                u0.b bVarI2 = androidx.compose.ui.layout.a.i(oVarA);
                if (!(qVar16.f11630a instanceof m0.d)) {
                    m9.e0.C();
                    throw null;
                }
                qVar16.c0();
                if (qVar16.O) {
                    qVar16.o(jVar3);
                } else {
                    qVar16.o0();
                }
                d7.t.s0(qVar16, eVar2, t1.k.f14461e);
                d7.t.s0(qVar16, r1VarP2, t1.k.f14460d);
                t1.i iVar2 = t1.k.f14462f;
                if (qVar16.O || !d7.a.d(qVar16.P(), Integer.valueOf(i15))) {
                    l.q.r(i15, qVar16, i15, iVar2);
                }
                l.q.u(qVar16, bVarI2, qVar16, 0, 2058660585);
                bVarK.invoke(qVar16, 6);
                qVar16.t(false);
                qVar16.t(true);
                qVar16.t(false);
                qVar16.t(false);
                return;
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f15712a;
        Object obj3 = this.f15714c;
        Object obj4 = this.f15713b;
        switch (i10) {
            case 0:
                o1.u uVar = (o1.u) obj;
                long j10 = ((d1.c) obj2).f4330a;
                p1.e.a((p1.d) obj4, uVar);
                uVar.a();
                ((d9.t) obj3).f4951a = j10;
                return lVar;
            case 1:
                a((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
            case 2:
                return (r1.k0) ((c9.e) obj3).invoke(new a0.x((a0.q) obj4, (r1.i1) obj), new m2.a(((m2.a) obj2).f11792a));
            case 3:
                a((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
            case 4:
                a((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
            case 5:
                a((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
            case 6:
                a((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
            case 7:
                a((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
            case 8:
                a((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
            case 9:
                a((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
            case 10:
                a((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                return lVar;
        }
    }
}
