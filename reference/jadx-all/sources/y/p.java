package y;

import m0.r1;
import m0.x1;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f16652a = new s(y0.a.f16708a, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f16653b = o.f16648a;

    public static final void a(y0.o oVar, m0.m mVar, int i10) {
        int i11;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-211209833);
        if ((i10 & 14) == 0) {
            i11 = (qVar.g(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && qVar.G()) {
            qVar.U();
        } else {
            qVar.Z(544976794);
            int i12 = qVar.P;
            y0.o oVarG = m9.e0.G(qVar, oVar);
            r1 r1VarP = qVar.p();
            t1.l.f14477k.getClass();
            t1.j jVar = t1.k.f14458b;
            qVar.Z(1405779621);
            if (!(qVar.f11630a instanceof m0.d)) {
                m9.e0.C();
                throw null;
            }
            qVar.c0();
            if (qVar.O) {
                qVar.o(new u.e1(jVar, 1));
            } else {
                qVar.o0();
            }
            d7.t.s0(qVar, f16653b, t1.k.f14461e);
            d7.t.s0(qVar, r1VarP, t1.k.f14460d);
            d7.t.s0(qVar, oVarG, t1.k.f14459c);
            t1.i iVar = t1.k.f14462f;
            if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i12))) {
                l.q.r(i12, qVar, i12, iVar);
            }
            qVar.t(true);
            qVar.t(false);
            qVar.t(false);
        }
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new m(oVar, i10, 0);
        }
    }

    public static final void b(r1.w0 w0Var, r1.x0 x0Var, r1.i0 i0Var, m2.l lVar, int i10, int i11, y0.d dVar) {
        y0.d dVar2;
        Object objA = i0Var.a();
        l lVar2 = objA instanceof l ? (l) objA : null;
        if (lVar2 != null && (dVar2 = lVar2.f16617u) != null) {
            dVar = dVar2;
        }
        long jA = ((y0.g) dVar).a(o1.s.e(x0Var.f13423a, x0Var.f13424b), o1.s.e(i10, i11), lVar);
        w0Var.getClass();
        r1.w0.e(x0Var, jA, 0.0f);
    }

    public static final r1.j0 c(y0.g gVar, boolean z10, m0.m mVar) {
        r1.j0 j0Var;
        m0.q qVar = (m0.q) mVar;
        qVar.Z(56522820);
        if (!d7.a.d(gVar, y0.a.f16708a) || z10) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            qVar.Z(511388516);
            boolean zG = qVar.g(boolValueOf) | qVar.g(gVar);
            Object objP = qVar.P();
            if (zG || objP == m0.l.f11578a) {
                objP = new s(gVar, z10);
                qVar.l0(objP);
            }
            qVar.t(false);
            j0Var = (r1.j0) objP;
        } else {
            j0Var = f16652a;
        }
        qVar.t(false);
        return j0Var;
    }
}
