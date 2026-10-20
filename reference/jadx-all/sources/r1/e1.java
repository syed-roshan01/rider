package r1;

import m0.r1;
import m0.x1;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1.b f13358a = new k1.b(10);

    public static final void a(h1 h1Var, y0.o oVar, c9.e eVar, m0.m mVar, int i10, int i11) {
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-511989831);
        if ((i11 & 2) != 0) {
            oVar = y0.l.f16729b;
        }
        y0.o oVar2 = oVar;
        int i12 = qVar.P;
        m0.o oVarK = m9.e0.K(qVar);
        y0.o oVarG = m9.e0.G(qVar, oVar2);
        r1 r1VarP = qVar.p();
        t1.j jVar = t1.j.f14452c;
        qVar.Z(1405779621);
        if (!(qVar.f11630a instanceof m0.d)) {
            m9.e0.C();
            throw null;
        }
        qVar.c0();
        if (qVar.O) {
            qVar.o(new u.e1(jVar, 4));
        } else {
            qVar.o0();
        }
        d7.t.s0(qVar, h1Var, h1Var.f13385c);
        d7.t.s0(qVar, oVarK, h1Var.f13386d);
        d7.t.s0(qVar, eVar, h1Var.f13387e);
        t1.l.f14477k.getClass();
        d7.t.s0(qVar, r1VarP, t1.k.f14460d);
        d7.t.s0(qVar, oVarG, t1.k.f14459c);
        t1.i iVar = t1.k.f14462f;
        if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i12))) {
            l.q.r(i12, qVar, i12, iVar);
        }
        qVar.t(true);
        qVar.t(false);
        if (!qVar.G()) {
            m0.s.d(new t.l0(h1Var, 23), qVar);
        }
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new a0.r(h1Var, oVar2, eVar, i10, i11, 4);
        }
    }

    public static final void b(y0.o oVar, c9.e eVar, m0.m mVar, int i10, int i11) {
        int i12;
        y0.o oVar2;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (qVar.g(oVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= qVar.i(eVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && qVar.G()) {
            qVar.U();
            oVar2 = oVar;
        } else {
            y0.o oVar3 = i13 != 0 ? y0.l.f16729b : oVar;
            qVar.Z(-492369756);
            Object objP = qVar.P();
            if (objP == m0.l.f11578a) {
                objP = new h1(k.f13395e);
                qVar.l0(objP);
            }
            qVar.t(false);
            int i14 = i12 << 3;
            a((h1) objP, oVar3, eVar, qVar, (i14 & 112) | 8 | (i14 & 896), 0);
            oVar2 = oVar3;
        }
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new h0.p0(oVar2, eVar, i10, i11, 1);
        }
    }

    public static final boolean c(int i10, int i11) {
        return i10 == i11;
    }
}
