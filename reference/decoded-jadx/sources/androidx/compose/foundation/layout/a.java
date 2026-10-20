package androidx.compose.foundation.layout;

import d7.t;
import java.util.List;
import m0.d;
import m0.m;
import m0.q;
import m0.r1;
import m9.e0;
import o1.s;
import r1.p;
import t1.i;
import t1.j;
import t1.k;
import t1.l;
import u.e1;
import y.d1;
import y.k0;
import y.l0;
import y.t0;
import y.u0;
import y.y0;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static u0 a(float f10, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        float f11 = (i10 & 2) != 0 ? 0 : 0.0f;
        return new u0(f10, f11, f10, f11);
    }

    public static u0 b(float f10) {
        return new u0(0, 0, 0, f10);
    }

    public static final void c(o oVar, m mVar) {
        q qVar = (q) mVar;
        qVar.Z(-72882467);
        d1 d1Var = d1.f16531a;
        qVar.Z(544976794);
        int i10 = qVar.P;
        o oVarG = e0.G(qVar, oVar);
        r1 r1VarP = qVar.p();
        l.f14477k.getClass();
        j jVar = k.f14458b;
        qVar.Z(1405779621);
        if (!(qVar.f11630a instanceof d)) {
            e0.C();
            throw null;
        }
        qVar.c0();
        if (qVar.O) {
            qVar.o(new e1(jVar, 2));
        } else {
            qVar.o0();
        }
        t.s0(qVar, d1Var, k.f14461e);
        t.s0(qVar, r1VarP, k.f14460d);
        t.s0(qVar, oVarG, k.f14459c);
        i iVar = k.f14462f;
        if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i10))) {
            l.q.r(i10, qVar, i10, iVar);
        }
        l.q.v(qVar, true, false, false, false);
    }

    public static final int d(List list, y.j jVar, y.j jVar2, int i10, int i11, int i12, int i13) {
        int i14 = 0;
        if (i12 == i13) {
            if (list.isEmpty()) {
                return 0;
            }
            int size = list.size();
            float f10 = 0.0f;
            int iMax = 0;
            int i15 = 0;
            while (i14 < size) {
                p pVar = (p) list.get(i14);
                float fH = h(g(pVar));
                int iIntValue = ((Number) jVar.invoke(pVar, Integer.valueOf(i10))).intValue();
                if (fH == 0.0f) {
                    i15 += iIntValue;
                } else if (fH > 0.0f) {
                    f10 += fH;
                    iMax = Math.max(iMax, t.p0(iIntValue / fH));
                }
                i14++;
            }
            return ((list.size() - 1) * i11) + t.p0(iMax * f10) + i15;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size2 = list.size();
        float f11 = 0.0f;
        int iMax2 = 0;
        for (int i16 = 0; i16 < size2; i16++) {
            p pVar2 = (p) list.get(i16);
            float fH2 = h(g(pVar2));
            if (fH2 == 0.0f) {
                int iMin2 = Math.min(((Number) jVar2.invoke(pVar2, Integer.MAX_VALUE)).intValue(), i10 - iMin);
                iMin += iMin2;
                iMax2 = Math.max(iMax2, ((Number) jVar.invoke(pVar2, Integer.valueOf(iMin2))).intValue());
            } else if (fH2 > 0.0f) {
                f11 += fH2;
            }
        }
        int iP0 = f11 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : t.p0(Math.max(i10 - iMin, 0) / f11);
        int size3 = list.size();
        while (i14 < size3) {
            p pVar3 = (p) list.get(i14);
            float fH3 = h(g(pVar3));
            if (fH3 > 0.0f) {
                iMax2 = Math.max(iMax2, ((Number) jVar.invoke(pVar3, Integer.valueOf(iP0 != Integer.MAX_VALUE ? t.p0(iP0 * fH3) : Integer.MAX_VALUE))).intValue());
            }
            i14++;
        }
        return iMax2;
    }

    public static final float e(t0 t0Var, m2.l lVar) {
        return lVar == m2.l.f11815a ? t0Var.b(lVar) : t0Var.a(lVar);
    }

    public static final float f(t0 t0Var, m2.l lVar) {
        return lVar == m2.l.f11815a ? t0Var.a(lVar) : t0Var.b(lVar);
    }

    public static final y0 g(p pVar) {
        Object objA = pVar.a();
        if (objA instanceof y0) {
            return (y0) objA;
        }
        return null;
    }

    public static final float h(y0 y0Var) {
        if (y0Var != null) {
            return y0Var.f16703a;
        }
        return 0.0f;
    }

    public static final o i(o oVar, c9.c cVar) {
        return oVar.j(new OffsetPxElement(cVar));
    }

    public static final o j(o oVar, float f10, float f11) {
        return oVar.j(new OffsetElement(f10, f11));
    }

    public static final o k(o oVar, t0 t0Var) {
        return oVar.j(new PaddingValuesElement(t0Var));
    }

    public static final o l(o oVar, float f10) {
        return oVar.j(new PaddingElement(f10, f10, f10, f10));
    }

    public static final o m(o oVar, float f10, float f11) {
        return oVar.j(new PaddingElement(f10, f11, f10, f11));
    }

    public static o n(o oVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return m(oVar, f10, f11);
    }

    public static o o(o oVar, float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return oVar.j(new PaddingElement(f10, f11, f12, f13));
    }

    public static o p(r1.o oVar, float f10, float f11, int i10) {
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 4) != 0) {
            f11 = Float.NaN;
        }
        return new AlignmentLineOffsetDpElement(oVar, f10, f11);
    }

    public static final o q(o oVar) {
        return e0.v(oVar, new l0(8));
    }

    public static final long r(long j10, int i10) {
        return i10 == 1 ? s.a(m2.a.k(j10), m2.a.i(j10), m2.a.j(j10), m2.a.h(j10)) : s.a(m2.a.j(j10), m2.a.h(j10), m2.a.k(j10), m2.a.i(j10));
    }

    public static final k0 s(u2.c cVar) {
        return new k0(cVar.f15395a, cVar.f15396b, cVar.f15397c, cVar.f15398d);
    }
}
