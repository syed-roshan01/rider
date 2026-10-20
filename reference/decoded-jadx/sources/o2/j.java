package o2;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;
import k0.a4;
import m0.g1;
import m0.l2;
import m0.o3;
import m0.p0;
import m0.r1;
import m0.x1;
import m9.e0;
import u1.s1;
import u1.y0;
import v.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f12477a = new p0(o3.f11621a, d.f12460c);

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x0184  */
    /* JADX WARN: Code duplicated, block: B:71:0x0197  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean, int] */
    public static final void a(t tVar, c9.a aVar, u uVar, c9.e eVar, m0.m mVar, int i10, int i11) {
        int i12;
        c9.a aVar2;
        int i13;
        u uVar2;
        int i14;
        int i15;
        c9.a aVar3;
        u uVar3;
        View view;
        m2.b bVar;
        String str;
        m0.o oVarK;
        g1 g1VarM0;
        UUID uuid;
        Object objP;
        ?? r10;
        ?? r11;
        a4 a4Var;
        int i16;
        r1 r1VarP;
        t1.j jVar;
        u0.b bVarI;
        t1.i iVar;
        u uVar4;
        x1 x1VarX;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-830247068);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (qVar.g(tVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                aVar2 = aVar;
                i12 |= qVar.i(aVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    uVar2 = uVar;
                    if (qVar.g(uVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (qVar.i(eVar)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 5851) == 1170 || !qVar.G()) {
                    if (i17 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i13 != 0) {
                        uVar3 = new u(false, 63);
                    } else {
                        uVar3 = uVar2;
                    }
                    view = (View) qVar.m(y0.f15381f);
                    bVar = (m2.b) qVar.m(s1.f15275e);
                    str = (String) qVar.m(f12477a);
                    m2.l lVar = (m2.l) qVar.m(s1.f15281k);
                    oVarK = e0.K(qVar);
                    g1VarM0 = d7.t.m0(eVar, qVar);
                    uuid = (UUID) x3.c.d(new Object[0], null, d.f12461d, qVar, 6);
                    qVar.Z(-492369756);
                    objP = qVar.P();
                    if (objP == m0.l.f11578a) {
                        r rVar = new r(aVar3, uVar3, str, view, bVar, tVar, uuid);
                        n0 n0Var = new n0(10, rVar, g1VarM0);
                        r10 = 1;
                        rVar.h(oVarK, new u0.b(1302892335, n0Var, true));
                        qVar.l0(rVar);
                        objP = rVar;
                        r11 = 0;
                    } else {
                        r10 = 1;
                        r11 = 0;
                    }
                    qVar.t(r11);
                    r rVar2 = (r) objP;
                    c9.a aVar4 = aVar3;
                    u uVar5 = uVar3;
                    m0.s.a(rVar2, new b.d(rVar2, aVar4, uVar5, str, lVar), qVar);
                    m0.s.d(new f(rVar2, aVar4, uVar5, str, lVar, 0), qVar);
                    m0.s.a(tVar, new u.s(27, rVar2, tVar), qVar);
                    m0.s.b(rVar2, new h(rVar2, null), qVar);
                    y0.o oVarJ = androidx.compose.ui.layout.a.j(y0.l.f16729b, new i(rVar2, r11));
                    a4Var = new a4(r10, rVar2, lVar);
                    qVar.Z(-1323940314);
                    i16 = qVar.P;
                    r1VarP = qVar.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarJ);
                    if (!(qVar.f11630a instanceof m0.d)) {
                        e0.C();
                        throw null;
                    }
                    qVar.c0();
                    if (qVar.O) {
                        qVar.o(jVar);
                    } else {
                        qVar.o0();
                    }
                    d7.t.s0(qVar, a4Var, t1.k.f14461e);
                    d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                    iVar = t1.k.f14462f;
                    if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i16))) {
                        l.q.r(i16, qVar, i16, iVar);
                    }
                    l.q.s(r11, bVarI, new l2(qVar), qVar, 2058660585);
                    qVar.t(r11);
                    qVar.t(r10);
                    qVar.t(r11);
                    aVar2 = aVar3;
                    uVar4 = uVar3;
                } else {
                    qVar.U();
                    uVar4 = uVar2;
                }
                x1VarX = qVar.x();
                if (x1VarX != null) {
                    x1VarX.f11756d = new a0.v(tVar, aVar2, uVar4, eVar, i10, i11);
                }
            }
            i12 |= 384;
            uVar2 = uVar;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (qVar.i(eVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) == 1170) {
                if (i17 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i13 != 0) {
                    uVar3 = new u(false, 63);
                } else {
                    uVar3 = uVar2;
                }
                view = (View) qVar.m(y0.f15381f);
                bVar = (m2.b) qVar.m(s1.f15275e);
                str = (String) qVar.m(f12477a);
                m2.l lVar2 = (m2.l) qVar.m(s1.f15281k);
                oVarK = e0.K(qVar);
                g1VarM0 = d7.t.m0(eVar, qVar);
                uuid = (UUID) x3.c.d(new Object[0], null, d.f12461d, qVar, 6);
                qVar.Z(-492369756);
                objP = qVar.P();
                if (objP == m0.l.f11578a) {
                    r rVar3 = new r(aVar3, uVar3, str, view, bVar, tVar, uuid);
                    n0 n0Var2 = new n0(10, rVar3, g1VarM0);
                    r10 = 1;
                    rVar3.h(oVarK, new u0.b(1302892335, n0Var2, true));
                    qVar.l0(rVar3);
                    objP = rVar3;
                    r11 = 0;
                } else {
                    r10 = 1;
                    r11 = 0;
                }
                qVar.t(r11);
                r rVar4 = (r) objP;
                c9.a aVar5 = aVar3;
                u uVar6 = uVar3;
                m0.s.a(rVar4, new b.d(rVar4, aVar5, uVar6, str, lVar2), qVar);
                m0.s.d(new f(rVar4, aVar5, uVar6, str, lVar2, 0), qVar);
                m0.s.a(tVar, new u.s(27, rVar4, tVar), qVar);
                m0.s.b(rVar4, new h(rVar4, null), qVar);
                y0.o oVarJ2 = androidx.compose.ui.layout.a.j(y0.l.f16729b, new i(rVar4, r11));
                a4Var = new a4(r10, rVar4, lVar2);
                qVar.Z(-1323940314);
                i16 = qVar.P;
                r1VarP = qVar.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarJ2);
                if (!(qVar.f11630a instanceof m0.d)) {
                    e0.C();
                    throw null;
                }
                qVar.c0();
                if (qVar.O) {
                    qVar.o(jVar);
                } else {
                    qVar.o0();
                }
                d7.t.s0(qVar, a4Var, t1.k.f14461e);
                d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                iVar = t1.k.f14462f;
                if (qVar.O) {
                    l.q.r(i16, qVar, i16, iVar);
                } else {
                    l.q.r(i16, qVar, i16, iVar);
                }
                l.q.s(r11, bVarI, new l2(qVar), qVar, 2058660585);
                qVar.t(r11);
                qVar.t(r10);
                qVar.t(r11);
                aVar2 = aVar3;
                uVar4 = uVar3;
            } else {
                if (i17 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i13 != 0) {
                    uVar3 = new u(false, 63);
                } else {
                    uVar3 = uVar2;
                }
                view = (View) qVar.m(y0.f15381f);
                bVar = (m2.b) qVar.m(s1.f15275e);
                str = (String) qVar.m(f12477a);
                m2.l lVar3 = (m2.l) qVar.m(s1.f15281k);
                oVarK = e0.K(qVar);
                g1VarM0 = d7.t.m0(eVar, qVar);
                uuid = (UUID) x3.c.d(new Object[0], null, d.f12461d, qVar, 6);
                qVar.Z(-492369756);
                objP = qVar.P();
                if (objP == m0.l.f11578a) {
                    r rVar5 = new r(aVar3, uVar3, str, view, bVar, tVar, uuid);
                    n0 n0Var3 = new n0(10, rVar5, g1VarM0);
                    r10 = 1;
                    rVar5.h(oVarK, new u0.b(1302892335, n0Var3, true));
                    qVar.l0(rVar5);
                    objP = rVar5;
                    r11 = 0;
                } else {
                    r10 = 1;
                    r11 = 0;
                }
                qVar.t(r11);
                r rVar6 = (r) objP;
                c9.a aVar6 = aVar3;
                u uVar7 = uVar3;
                m0.s.a(rVar6, new b.d(rVar6, aVar6, uVar7, str, lVar3), qVar);
                m0.s.d(new f(rVar6, aVar6, uVar7, str, lVar3, 0), qVar);
                m0.s.a(tVar, new u.s(27, rVar6, tVar), qVar);
                m0.s.b(rVar6, new h(rVar6, null), qVar);
                y0.o oVarJ3 = androidx.compose.ui.layout.a.j(y0.l.f16729b, new i(rVar6, r11));
                a4Var = new a4(r10, rVar6, lVar3);
                qVar.Z(-1323940314);
                i16 = qVar.P;
                r1VarP = qVar.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarJ3);
                if (!(qVar.f11630a instanceof m0.d)) {
                    e0.C();
                    throw null;
                }
                qVar.c0();
                if (qVar.O) {
                    qVar.o(jVar);
                } else {
                    qVar.o0();
                }
                d7.t.s0(qVar, a4Var, t1.k.f14461e);
                d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                iVar = t1.k.f14462f;
                if (qVar.O) {
                    l.q.r(i16, qVar, i16, iVar);
                } else {
                    l.q.r(i16, qVar, i16, iVar);
                }
                l.q.s(r11, bVarI, new l2(qVar), qVar, 2058660585);
                qVar.t(r11);
                qVar.t(r10);
                qVar.t(r11);
                aVar2 = aVar3;
                uVar4 = uVar3;
            }
            x1VarX = qVar.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new a0.v(tVar, aVar2, uVar4, eVar, i10, i11);
            }
        }
        i12 |= 48;
        aVar2 = aVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                uVar2 = uVar;
                if (qVar.g(uVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (qVar.i(eVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) == 1170) {
                if (i17 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i13 != 0) {
                    uVar3 = new u(false, 63);
                } else {
                    uVar3 = uVar2;
                }
                view = (View) qVar.m(y0.f15381f);
                bVar = (m2.b) qVar.m(s1.f15275e);
                str = (String) qVar.m(f12477a);
                m2.l lVar4 = (m2.l) qVar.m(s1.f15281k);
                oVarK = e0.K(qVar);
                g1VarM0 = d7.t.m0(eVar, qVar);
                uuid = (UUID) x3.c.d(new Object[0], null, d.f12461d, qVar, 6);
                qVar.Z(-492369756);
                objP = qVar.P();
                if (objP == m0.l.f11578a) {
                    r rVar7 = new r(aVar3, uVar3, str, view, bVar, tVar, uuid);
                    n0 n0Var4 = new n0(10, rVar7, g1VarM0);
                    r10 = 1;
                    rVar7.h(oVarK, new u0.b(1302892335, n0Var4, true));
                    qVar.l0(rVar7);
                    objP = rVar7;
                    r11 = 0;
                } else {
                    r10 = 1;
                    r11 = 0;
                }
                qVar.t(r11);
                r rVar8 = (r) objP;
                c9.a aVar7 = aVar3;
                u uVar8 = uVar3;
                m0.s.a(rVar8, new b.d(rVar8, aVar7, uVar8, str, lVar4), qVar);
                m0.s.d(new f(rVar8, aVar7, uVar8, str, lVar4, 0), qVar);
                m0.s.a(tVar, new u.s(27, rVar8, tVar), qVar);
                m0.s.b(rVar8, new h(rVar8, null), qVar);
                y0.o oVarJ4 = androidx.compose.ui.layout.a.j(y0.l.f16729b, new i(rVar8, r11));
                a4Var = new a4(r10, rVar8, lVar4);
                qVar.Z(-1323940314);
                i16 = qVar.P;
                r1VarP = qVar.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarJ4);
                if (!(qVar.f11630a instanceof m0.d)) {
                    e0.C();
                    throw null;
                }
                qVar.c0();
                if (qVar.O) {
                    qVar.o(jVar);
                } else {
                    qVar.o0();
                }
                d7.t.s0(qVar, a4Var, t1.k.f14461e);
                d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                iVar = t1.k.f14462f;
                if (qVar.O) {
                    l.q.r(i16, qVar, i16, iVar);
                } else {
                    l.q.r(i16, qVar, i16, iVar);
                }
                l.q.s(r11, bVarI, new l2(qVar), qVar, 2058660585);
                qVar.t(r11);
                qVar.t(r10);
                qVar.t(r11);
                aVar2 = aVar3;
                uVar4 = uVar3;
            } else {
                if (i17 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i13 != 0) {
                    uVar3 = new u(false, 63);
                } else {
                    uVar3 = uVar2;
                }
                view = (View) qVar.m(y0.f15381f);
                bVar = (m2.b) qVar.m(s1.f15275e);
                str = (String) qVar.m(f12477a);
                m2.l lVar5 = (m2.l) qVar.m(s1.f15281k);
                oVarK = e0.K(qVar);
                g1VarM0 = d7.t.m0(eVar, qVar);
                uuid = (UUID) x3.c.d(new Object[0], null, d.f12461d, qVar, 6);
                qVar.Z(-492369756);
                objP = qVar.P();
                if (objP == m0.l.f11578a) {
                    r rVar9 = new r(aVar3, uVar3, str, view, bVar, tVar, uuid);
                    n0 n0Var5 = new n0(10, rVar9, g1VarM0);
                    r10 = 1;
                    rVar9.h(oVarK, new u0.b(1302892335, n0Var5, true));
                    qVar.l0(rVar9);
                    objP = rVar9;
                    r11 = 0;
                } else {
                    r10 = 1;
                    r11 = 0;
                }
                qVar.t(r11);
                r rVar10 = (r) objP;
                c9.a aVar8 = aVar3;
                u uVar9 = uVar3;
                m0.s.a(rVar10, new b.d(rVar10, aVar8, uVar9, str, lVar5), qVar);
                m0.s.d(new f(rVar10, aVar8, uVar9, str, lVar5, 0), qVar);
                m0.s.a(tVar, new u.s(27, rVar10, tVar), qVar);
                m0.s.b(rVar10, new h(rVar10, null), qVar);
                y0.o oVarJ5 = androidx.compose.ui.layout.a.j(y0.l.f16729b, new i(rVar10, r11));
                a4Var = new a4(r10, rVar10, lVar5);
                qVar.Z(-1323940314);
                i16 = qVar.P;
                r1VarP = qVar.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarJ5);
                if (!(qVar.f11630a instanceof m0.d)) {
                    e0.C();
                    throw null;
                }
                qVar.c0();
                if (qVar.O) {
                    qVar.o(jVar);
                } else {
                    qVar.o0();
                }
                d7.t.s0(qVar, a4Var, t1.k.f14461e);
                d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                iVar = t1.k.f14462f;
                if (qVar.O) {
                    l.q.r(i16, qVar, i16, iVar);
                } else {
                    l.q.r(i16, qVar, i16, iVar);
                }
                l.q.s(r11, bVarI, new l2(qVar), qVar, 2058660585);
                qVar.t(r11);
                qVar.t(r10);
                qVar.t(r11);
                aVar2 = aVar3;
                uVar4 = uVar3;
            }
            x1VarX = qVar.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new a0.v(tVar, aVar2, uVar4, eVar, i10, i11);
            }
        }
        i12 |= 384;
        uVar2 = uVar;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (qVar.i(eVar)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 5851) == 1170) {
            if (i17 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            if (i13 != 0) {
                uVar3 = new u(false, 63);
            } else {
                uVar3 = uVar2;
            }
            view = (View) qVar.m(y0.f15381f);
            bVar = (m2.b) qVar.m(s1.f15275e);
            str = (String) qVar.m(f12477a);
            m2.l lVar6 = (m2.l) qVar.m(s1.f15281k);
            oVarK = e0.K(qVar);
            g1VarM0 = d7.t.m0(eVar, qVar);
            uuid = (UUID) x3.c.d(new Object[0], null, d.f12461d, qVar, 6);
            qVar.Z(-492369756);
            objP = qVar.P();
            if (objP == m0.l.f11578a) {
                r rVar11 = new r(aVar3, uVar3, str, view, bVar, tVar, uuid);
                n0 n0Var6 = new n0(10, rVar11, g1VarM0);
                r10 = 1;
                rVar11.h(oVarK, new u0.b(1302892335, n0Var6, true));
                qVar.l0(rVar11);
                objP = rVar11;
                r11 = 0;
            } else {
                r10 = 1;
                r11 = 0;
            }
            qVar.t(r11);
            r rVar12 = (r) objP;
            c9.a aVar9 = aVar3;
            u uVar10 = uVar3;
            m0.s.a(rVar12, new b.d(rVar12, aVar9, uVar10, str, lVar6), qVar);
            m0.s.d(new f(rVar12, aVar9, uVar10, str, lVar6, 0), qVar);
            m0.s.a(tVar, new u.s(27, rVar12, tVar), qVar);
            m0.s.b(rVar12, new h(rVar12, null), qVar);
            y0.o oVarJ6 = androidx.compose.ui.layout.a.j(y0.l.f16729b, new i(rVar12, r11));
            a4Var = new a4(r10, rVar12, lVar6);
            qVar.Z(-1323940314);
            i16 = qVar.P;
            r1VarP = qVar.p();
            t1.l.f14477k.getClass();
            jVar = t1.k.f14458b;
            bVarI = androidx.compose.ui.layout.a.i(oVarJ6);
            if (!(qVar.f11630a instanceof m0.d)) {
                e0.C();
                throw null;
            }
            qVar.c0();
            if (qVar.O) {
                qVar.o(jVar);
            } else {
                qVar.o0();
            }
            d7.t.s0(qVar, a4Var, t1.k.f14461e);
            d7.t.s0(qVar, r1VarP, t1.k.f14460d);
            iVar = t1.k.f14462f;
            if (qVar.O) {
                l.q.r(i16, qVar, i16, iVar);
            } else {
                l.q.r(i16, qVar, i16, iVar);
            }
            l.q.s(r11, bVarI, new l2(qVar), qVar, 2058660585);
            qVar.t(r11);
            qVar.t(r10);
            qVar.t(r11);
            aVar2 = aVar3;
            uVar4 = uVar3;
        } else {
            if (i17 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            if (i13 != 0) {
                uVar3 = new u(false, 63);
            } else {
                uVar3 = uVar2;
            }
            view = (View) qVar.m(y0.f15381f);
            bVar = (m2.b) qVar.m(s1.f15275e);
            str = (String) qVar.m(f12477a);
            m2.l lVar7 = (m2.l) qVar.m(s1.f15281k);
            oVarK = e0.K(qVar);
            g1VarM0 = d7.t.m0(eVar, qVar);
            uuid = (UUID) x3.c.d(new Object[0], null, d.f12461d, qVar, 6);
            qVar.Z(-492369756);
            objP = qVar.P();
            if (objP == m0.l.f11578a) {
                r rVar13 = new r(aVar3, uVar3, str, view, bVar, tVar, uuid);
                n0 n0Var7 = new n0(10, rVar13, g1VarM0);
                r10 = 1;
                rVar13.h(oVarK, new u0.b(1302892335, n0Var7, true));
                qVar.l0(rVar13);
                objP = rVar13;
                r11 = 0;
            } else {
                r10 = 1;
                r11 = 0;
            }
            qVar.t(r11);
            r rVar14 = (r) objP;
            c9.a aVar10 = aVar3;
            u uVar11 = uVar3;
            m0.s.a(rVar14, new b.d(rVar14, aVar10, uVar11, str, lVar7), qVar);
            m0.s.d(new f(rVar14, aVar10, uVar11, str, lVar7, 0), qVar);
            m0.s.a(tVar, new u.s(27, rVar14, tVar), qVar);
            m0.s.b(rVar14, new h(rVar14, null), qVar);
            y0.o oVarJ7 = androidx.compose.ui.layout.a.j(y0.l.f16729b, new i(rVar14, r11));
            a4Var = new a4(r10, rVar14, lVar7);
            qVar.Z(-1323940314);
            i16 = qVar.P;
            r1VarP = qVar.p();
            t1.l.f14477k.getClass();
            jVar = t1.k.f14458b;
            bVarI = androidx.compose.ui.layout.a.i(oVarJ7);
            if (!(qVar.f11630a instanceof m0.d)) {
                e0.C();
                throw null;
            }
            qVar.c0();
            if (qVar.O) {
                qVar.o(jVar);
            } else {
                qVar.o0();
            }
            d7.t.s0(qVar, a4Var, t1.k.f14461e);
            d7.t.s0(qVar, r1VarP, t1.k.f14460d);
            iVar = t1.k.f14462f;
            if (qVar.O) {
                l.q.r(i16, qVar, i16, iVar);
            } else {
                l.q.r(i16, qVar, i16, iVar);
            }
            l.q.s(r11, bVarI, new l2(qVar), qVar, 2058660585);
            qVar.t(r11);
            qVar.t(r10);
            qVar.t(r11);
            aVar2 = aVar3;
            uVar4 = uVar3;
        }
        x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new a0.v(tVar, aVar2, uVar4, eVar, i10, i11);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
