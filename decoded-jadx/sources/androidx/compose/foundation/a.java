package androidx.compose.foundation;

import c9.c;
import d5.x0;
import d7.t;
import e0.e;
import e1.g0;
import e1.j0;
import e1.l0;
import e1.n;
import e1.n0;
import m0.m;
import m0.m3;
import m0.q;
import m0.r1;
import m0.x1;
import m9.e0;
import r1.k;
import r1.l;
import t1.i;
import t1.j;
import u.e1;
import u.f1;
import u.g1;
import u.h1;
import u.i1;
import u.i2;
import u.l1;
import u.m1;
import u.n2;
import u.p2;
import u.w;
import u.x;
import v0.p;
import y0.d;
import y0.o;
import y1.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final w a(float f10, long j10) {
        return new w(f10, new n0(j10));
    }

    public static final void b(o oVar, c cVar, m mVar, int i10) {
        int i11;
        q qVar = (q) mVar;
        qVar.a0(-932836462);
        if ((i10 & 14) == 0) {
            i11 = (qVar.g(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= qVar.i(cVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && qVar.G()) {
            qVar.U();
        } else {
            androidx.compose.foundation.layout.a.c(androidx.compose.ui.draw.a.d(oVar, cVar), qVar);
        }
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new x(oVar, cVar, i10, 0);
        }
    }

    public static final void c(h1.c cVar, String str, o oVar, d dVar, l lVar, float f10, e1.l lVar2, m mVar, int i10, int i11) {
        q qVar = (q) mVar;
        qVar.a0(1142754848);
        int i12 = i11 & 4;
        o oVarA = y0.l.f16729b;
        o oVar2 = i12 != 0 ? oVarA : oVar;
        d dVar2 = (i11 & 8) != 0 ? y0.a.f16710c : dVar;
        l lVar3 = (i11 & 16) != 0 ? k.f13392b : lVar;
        float f11 = (i11 & 32) != 0 ? 1.0f : f10;
        e1.l lVar4 = (i11 & 64) != 0 ? null : lVar2;
        int i13 = 0;
        if (str != null) {
            qVar.Z(-1521136142);
            boolean zG = qVar.g(str);
            Object objP = qVar.P();
            if (zG || objP == m0.l.f11578a) {
                objP = new h1(str, i13);
                qVar.l0(objP);
            }
            qVar.t(false);
            oVarA = y1.l.a(oVarA, false, (c) objP);
        }
        o oVarG = androidx.compose.ui.draw.a.g(androidx.compose.ui.draw.a.c(oVar2.j(oVarA)), cVar, dVar2, lVar3, f11, lVar4, 2);
        f1 f1Var = f1.f14771a;
        qVar.Z(544976794);
        int i14 = qVar.P;
        o oVarG2 = e0.G(qVar, oVarG);
        r1 r1VarP = qVar.p();
        t1.l.f14477k.getClass();
        j jVar = t1.k.f14458b;
        qVar.Z(1405779621);
        if (!(qVar.f11630a instanceof m0.d)) {
            e0.C();
            throw null;
        }
        qVar.c0();
        if (qVar.O) {
            qVar.o(new e1(jVar, i13));
        } else {
            qVar.o0();
        }
        t.s0(qVar, f1Var, t1.k.f14461e);
        t.s0(qVar, r1VarP, t1.k.f14460d);
        t.s0(qVar, oVarG2, t1.k.f14459c);
        i iVar = t1.k.f14462f;
        if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i14))) {
            l.q.r(i14, qVar, i14, iVar);
        }
        qVar.t(true);
        qVar.t(false);
        qVar.t(false);
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new g1(cVar, str, oVar2, dVar2, lVar3, f11, lVar4, i10, i11);
        }
    }

    public static o d(o oVar, j0 j0Var, e eVar, int i10) {
        l0 l0Var = eVar;
        if ((i10 & 2) != 0) {
            l0Var = g0.f5008a;
        }
        return oVar.j(new BackgroundElement(0L, j0Var, (i10 & 4) != 0 ? 1.0f : 0.0f, l0Var, 1));
    }

    public static final o e(o oVar, long j10, l0 l0Var) {
        return oVar.j(new BackgroundElement(j10, null, 1.0f, l0Var, 2));
    }

    public static final o f(o oVar, float f10, long j10, l0 l0Var) {
        return g(f10, oVar, new n0(j10), l0Var);
    }

    public static final o g(float f10, o oVar, n nVar, l0 l0Var) {
        return oVar.j(new BorderModifierNodeElement(f10, nVar, l0Var));
    }

    public static final void h(long j10, v.h1 h1Var) {
        if (h1Var == v.h1.f15593a) {
            if (m2.a.h(j10) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        } else if (m2.a.i(j10) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
        }
    }

    public static final o i(o oVar, x.m mVar, i1 i1Var, boolean z10, String str, g gVar, c9.a aVar) {
        o hoverableElement = y0.l.f16729b;
        m3 m3Var = m1.f14851a;
        o oVarV = e0.v(hoverableElement, new l1(0, i1Var, mVar));
        if (z10) {
            hoverableElement = new HoverableElement(mVar);
        }
        return u1.x1.q(oVar, u1.x1.q(oVarV.j(hoverableElement), b.a(mVar, b.f1623a, z10)).j(new ClickableElement(mVar, z10, str, gVar, aVar)));
    }

    public static /* synthetic */ o j(o oVar, x.m mVar, i1 i1Var, boolean z10, g gVar, c9.a aVar, int i10) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return i(oVar, mVar, i1Var, z11, null, gVar, aVar);
    }

    public static o k(o oVar, c9.a aVar) {
        return e0.v(oVar, new x0(true, null, null, aVar));
    }

    public static final p2 l(m mVar) {
        q qVar = (q) mVar;
        qVar.Z(-1464256199);
        Object[] objArr = new Object[0];
        p pVar = p2.f14883i;
        qVar.Z(546516376);
        boolean zE = qVar.e(0);
        Object objP = qVar.P();
        if (zE || objP == m0.l.f11578a) {
            objP = new i2(0);
            qVar.l0(objP);
        }
        qVar.t(false);
        p2 p2Var = (p2) x3.c.d(objArr, pVar, (c9.a) objP, qVar, 4);
        qVar.t(false);
        return p2Var;
    }

    public static final long m(float f10, long j10) {
        return f6.a.d(Math.max(0.0f, d1.a.b(j10) - f10), Math.max(0.0f, d1.a.c(j10) - f10));
    }

    public static o n(o oVar, p2 p2Var) {
        return e0.v(oVar, new n2(p2Var, null, false, true));
    }
}
