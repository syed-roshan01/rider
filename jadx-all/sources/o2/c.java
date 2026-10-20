package o2;

import com.auto.accept.data.model.TransactionData;
import e1.n0;
import i1.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.c5;
import k0.e1;
import k0.t0;
import m0.l3;
import m0.p0;
import m0.r1;
import m9.e0;
import o7.d0;
import r1.j0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f12458b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(l3 l3Var, int i10) {
        super(2);
        this.f12457a = i10;
        this.f12458b = l3Var;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = 0;
        y0.l lVar = y0.l.f16729b;
        int i12 = this.f12457a;
        l3 l3Var = this.f12458b;
        switch (i12) {
            case 0:
                if ((i10 & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                        return;
                    }
                }
                ((c9.e) l3Var.getValue()).invoke(mVar, 0);
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                        return;
                    }
                }
                o1.s.h(y1.l.a(lVar, false, b.f12450b), d7.t.K(mVar, -533674951, new c(l3Var, i11)), mVar, 48, 0);
                return;
            case 2:
                if ((i10 & 11) == 2) {
                    m0.q qVar3 = (m0.q) mVar;
                    if (qVar3.G()) {
                        qVar3.U();
                        return;
                    }
                }
                p0 p0Var = j.f12477a;
                ((c9.e) l3Var.getValue()).invoke(mVar, 0);
                return;
            case 3:
                if ((i10 & 11) == 2) {
                    m0.q qVar4 = (m0.q) mVar;
                    if (qVar4.G()) {
                        qVar4.U();
                        return;
                    }
                }
                c5.b(l.q.k("The app \"", (String) l3Var.getValue(), "\" is not allowed on this device while using this app. Please uninstall it to continue."), null, e5.a.f5136l, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 384, 0, 131066);
                return;
            case 4:
                if ((i10 & 11) == 2) {
                    m0.q qVar5 = (m0.q) mVar;
                    if (qVar5.G()) {
                        qVar5.U();
                        return;
                    }
                }
                String str = (String) l3Var.getValue();
                if (str != null && str.length() != 0) {
                    m0.q qVar6 = (m0.q) mVar;
                    qVar6.Z(-1809117459);
                    androidx.compose.foundation.a.c(y3.e.B0((String) l3Var.getValue(), qVar6), "Profile", androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(lVar, 30), e0.f.f4988a), null, r1.k.f13391a, 0.0f, null, qVar6, 24624, 104);
                    qVar6.t(false);
                    return;
                }
                m0.q qVar7 = (m0.q) mVar;
                qVar7.Z(-1809116913);
                i1.f fVarB = d0.f12579h;
                if (fVarB == null) {
                    i1.e eVar = new i1.e("Filled.AccountCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i13 = h0.f7832a;
                    n0 n0Var = new n0(e1.r.f5060b);
                    k.f fVarC = t.k.c(7, 12.0f, 2.0f);
                    fVarC.u(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    fVarC.H(4.48f, 10.0f, 10.0f, 10.0f);
                    fVarC.H(10.0f, -4.48f, 10.0f, -10.0f);
                    fVarC.G(17.52f, 2.0f, 12.0f, 2.0f);
                    fVarC.p();
                    fVarC.D(12.0f, 6.0f);
                    fVarC.v(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
                    fVarC.G(13.93f, 13.0f, 12.0f, 13.0f);
                    fVarC.H(-3.5f, -1.57f, -3.5f, -3.5f);
                    fVarC.G(10.07f, 6.0f, 12.0f, 6.0f);
                    fVarC.p();
                    fVarC.D(12.0f, 20.0f);
                    fVarC.v(-2.03f, 0.0f, -4.43f, -0.82f, -6.14f, -2.88f);
                    fVarC.u(7.55f, 15.8f, 9.68f, 15.0f, 12.0f, 15.0f);
                    fVarC.H(4.45f, 0.8f, 6.14f, 2.12f);
                    fVarC.u(16.43f, 19.18f, 14.03f, 20.0f, 12.0f, 20.0f);
                    fVarC.p();
                    i1.e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
                    fVarB = eVar.b();
                    d0.f12579h = fVarB;
                }
                e1.b(fVarB, "Profile", null, e5.a.f5137m, qVar7, 48, 4);
                qVar7.t(false);
                return;
            case 5:
                if ((i10 & 11) == 2) {
                    m0.q qVar8 = (m0.q) mVar;
                    if (qVar8.G()) {
                        qVar8.U();
                        return;
                    }
                }
                List list = g5.b.f6616a;
                c5.b(g5.b.b("profile", (String) l3Var.getValue()), null, e5.a.f5136l, 0L, null, f2.l.f6118f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 196608, 0, 131034);
                return;
            default:
                if ((i10 & 11) == 2) {
                    m0.q qVar9 = (m0.q) mVar;
                    if (qVar9.G()) {
                        qVar9.U();
                        return;
                    }
                }
                if (((List) l3Var.getValue()).isEmpty()) {
                    m0.q qVar10 = (m0.q) mVar;
                    qVar10.Z(-554290972);
                    c5.b("No transactions yet.", null, e5.a.f5137m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar10, 390, 0, 131066);
                    qVar10.t(false);
                    return;
                }
                m0.q qVar11 = (m0.q) mVar;
                qVar11.Z(-554290872);
                y0.o oVarN = androidx.compose.foundation.a.n(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.f1667a, 0.0f, 400, 1), androidx.compose.foundation.a.l(qVar11));
                y.h hVarJ = y.k.j(8);
                qVar11.Z(-483455358);
                j0 j0VarA = y.u.a(hVarJ, y0.a.f16715o, qVar11);
                qVar11.Z(-1323940314);
                int i14 = qVar11.P;
                r1 r1VarP = qVar11.p();
                t1.l.f14477k.getClass();
                t1.j jVar = t1.k.f14458b;
                u0.b bVarI = androidx.compose.ui.layout.a.i(oVarN);
                if (!(qVar11.f11630a instanceof m0.d)) {
                    e0.C();
                    throw null;
                }
                qVar11.c0();
                if (qVar11.O) {
                    qVar11.o(jVar);
                } else {
                    qVar11.o0();
                }
                d7.t.s0(qVar11, j0VarA, t1.k.f14461e);
                d7.t.s0(qVar11, r1VarP, t1.k.f14460d);
                t1.i iVar = t1.k.f14462f;
                if (qVar11.O || !d7.a.d(qVar11.P(), Integer.valueOf(i14))) {
                    l.q.r(i14, qVar11, i14, iVar);
                }
                l.q.u(qVar11, bVarI, qVar11, 0, 2058660585);
                qVar11.Z(-554290500);
                Iterator it = ((List) l3Var.getValue()).iterator();
                while (it.hasNext()) {
                    f6.a.a(null, e0.f.a(12), t0.d(e1.r.b(e5.a.f5133i, 0.3f), qVar11, 6), null, null, d7.t.K(qVar11, 1934769594, new s.h((TransactionData) it.next(), 10)), qVar11, 196608, 25);
                }
                l.q.v(qVar11, false, false, true, false);
                qVar11.t(false);
                qVar11.t(false);
                return;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f12457a) {
            case 0:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 1:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 2:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 3:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 4:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 5:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }
}
