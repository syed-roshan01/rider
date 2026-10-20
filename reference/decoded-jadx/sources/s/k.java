package s;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import f0.c2;
import f0.m1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import k0.c5;
import k0.t2;
import k0.u3;
import k0.v2;
import k0.w2;
import k0.x2;
import m0.g1;
import m0.l2;
import m0.l3;
import m0.r1;
import r1.e1;
import r1.h1;
import t.w1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d9.j implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13809e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(3);
        this.f13805a = i10;
        this.f13806b = obj;
        this.f13807c = obj2;
        this.f13808d = obj3;
        this.f13809e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0506  */
    /* JADX WARN: Code duplicated, block: B:117:0x0513  */
    /* JADX WARN: Code duplicated, block: B:118:0x0516  */
    /* JADX WARN: Code duplicated, block: B:120:0x0519  */
    /* JADX WARN: Code duplicated, block: B:122:0x052b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0531  */
    /* JADX WARN: Code duplicated, block: B:129:0x053f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0561 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x0563  */
    /* JADX WARN: Code duplicated, block: B:137:0x0585 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x0587  */
    /* JADX WARN: Code duplicated, block: B:139:0x058a  */
    /* JADX WARN: Code duplicated, block: B:143:0x05be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:147:0x05fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:149:0x0600  */
    /* JADX WARN: Code duplicated, block: B:153:0x062e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x0633  */
    /* JADX WARN: Code duplicated, block: B:159:0x0694 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x0699  */
    /* JADX WARN: Code duplicated, block: B:165:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:167:0x06db  */
    /* JADX WARN: Code duplicated, block: B:168:0x06df  */
    /* JADX WARN: Code duplicated, block: B:171:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:175:0x0705  */
    /* JADX WARN: Code duplicated, block: B:178:0x0719  */
    /* JADX WARN: Code duplicated, block: B:228:0x088c  */
    /* JADX WARN: Code duplicated, block: B:230:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:235:0x0534 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:34:0x010f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0142  */
    /* JADX WARN: Code duplicated, block: B:39:0x0149  */
    /* JADX WARN: Code duplicated, block: B:40:0x014d  */
    /* JADX WARN: Code duplicated, block: B:47:0x016d  */
    /* JADX WARN: Code duplicated, block: B:50:0x018d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0197  */
    /* JADX WARN: Code duplicated, block: B:54:0x01be  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:71:0x0301  */
    /* JADX WARN: Code duplicated, block: B:73:0x0306  */
    /* JADX WARN: Code duplicated, block: B:76:0x0348  */
    /* JADX WARN: Code duplicated, block: B:78:0x034f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0353  */
    /* JADX WARN: Code duplicated, block: B:86:0x0374  */
    /* JADX WARN: Code duplicated, block: B:89:0x0467  */
    /* JADX WARN: Code duplicated, block: B:92:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:94:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:96:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:98:0x04c0  */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) throws Throwable {
        m0.q qVar;
        Object objP;
        x2 x2Var;
        boolean zD;
        int i10;
        w1 w1Var;
        m0.q qVar2;
        k0.a1 a1Var;
        boolean zG;
        Object obj4;
        c9.a aVar;
        Object objP2;
        Object obj5;
        t.d dVar;
        boolean zI;
        Object obj6;
        w1 w1Var2;
        Object objP3;
        Object obj7;
        t.d dVar2;
        boolean zI2;
        Throwable th;
        Object obj8;
        Throwable th2;
        boolean zG2;
        boolean z10;
        Object obj9;
        r1.j0 j0VarC;
        int i11;
        r1 r1VarP;
        t1.j jVar;
        u0.b bVarI;
        t1.i iVar;
        float f10;
        float f11;
        List list;
        ArrayList arrayList;
        int size;
        int i12;
        Object obj10;
        Context context;
        y0.f fVar;
        r1.j0 j0VarA;
        int i13;
        r1 r1VarP2;
        u0.b bVarI2;
        r1.j0 j0VarA2;
        int i14;
        r1 r1VarP3;
        u0.b bVarI3;
        long jB;
        r1.j0 j0VarC2;
        int i15;
        r1 r1VarP4;
        u0.b bVarI4;
        i1.f fVar2;
        i1.f fVar3;
        long j10;
        r1.j0 j0VarA3;
        int i16;
        r1 r1VarP5;
        u0.b bVarI5;
        k0.y0 y0Var = m0.l.f11578a;
        q8.l lVar = q8.l.f13235a;
        y0.l lVar2 = y0.l.f16729b;
        int i17 = this.f13805a;
        Object obj11 = this.f13809e;
        Object obj12 = this.f13808d;
        Object obj13 = this.f13807c;
        Object obj14 = this.f13806b;
        switch (i17) {
            case 0:
                int i18 = 1;
                e0 e0Var = (e0) obj;
                m0.m mVar = (m0.m) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 14) == 0) {
                    iIntValue |= ((m0.q) mVar).g(e0Var) ? 4 : 2;
                }
                if ((iIntValue & 91) == 18) {
                    m0.q qVar3 = (m0.q) mVar;
                    if (qVar3.G()) {
                        qVar3.U();
                    } else {
                        w wVar = (w) obj14;
                        m0.s.a(e0Var, new b.g((w0.u) obj12, obj13, wVar, i18), mVar);
                        LinkedHashMap linkedHashMap = wVar.f13883d;
                        d7.a.k(e0Var, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                        linkedHashMap.put(obj13, ((f0) e0Var).f13779a);
                        qVar = (m0.q) mVar;
                        qVar.Z(-492369756);
                        objP = qVar.P();
                        if (objP == y0Var) {
                            objP = new q();
                            qVar.l0(objP);
                        }
                        qVar.t(false);
                        ((c9.g) obj11).g((q) objP, obj13, qVar, 0);
                    }
                } else {
                    w wVar2 = (w) obj14;
                    m0.s.a(e0Var, new b.g((w0.u) obj12, obj13, wVar2, i18), mVar);
                    LinkedHashMap linkedHashMap2 = wVar2.f13883d;
                    d7.a.k(e0Var, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                    linkedHashMap2.put(obj13, ((f0) e0Var).f13779a);
                    qVar = (m0.q) mVar;
                    qVar.Z(-492369756);
                    objP = qVar.P();
                    if (objP == y0Var) {
                        objP = new q();
                        qVar.l0(objP);
                    }
                    qVar.t(false);
                    ((c9.g) obj11).g((q) objP, obj13, qVar, 0);
                }
                return lVar;
            case 1:
                v0.e eVar = (v0.e) obj;
                ((Number) obj3).intValue();
                l3 l3Var = (l3) obj11;
                m0.q qVar4 = (m0.q) ((m0.m) obj2);
                qVar4.Z(-492369756);
                Object objP4 = qVar4.P();
                Object obj15 = objP4;
                if (objP4 == y0Var) {
                    a0.q qVar5 = new a0.q(eVar, new z.o(l3Var, 1));
                    qVar4.l0(qVar5);
                    obj15 = qVar5;
                }
                qVar4.t(false);
                a0.q qVar6 = (a0.q) obj15;
                qVar4.Z(-492369756);
                Object objP5 = qVar4.P();
                Object obj16 = objP5;
                if (objP5 == y0Var) {
                    h1 h1Var = new h1(new a0.t(qVar6));
                    qVar4.l0(h1Var);
                    obj16 = h1Var;
                }
                qVar4.t(false);
                h1 h1Var2 = (h1) obj16;
                a0.d0 d0Var = (a0.d0) obj14;
                qVar4.Z(-1523807258);
                if (d0Var != null) {
                    f6.a.h(d0Var, qVar6, h1Var2, qVar4, 576);
                }
                qVar4.t(false);
                y0.o oVar = (y0.o) obj13;
                c9.e eVar2 = (c9.e) obj12;
                qVar4.Z(511388516);
                boolean zG3 = qVar4.g(qVar6) | qVar4.g(eVar2);
                Object objP6 = qVar4.P();
                Object obj17 = objP6;
                if (zG3 || objP6 == y0Var) {
                    v.n0 n0Var = new v.n0(2, qVar6, eVar2);
                    qVar4.l0(n0Var);
                    obj17 = n0Var;
                }
                qVar4.t(false);
                e1.a(h1Var2, oVar, (c9.e) obj17, qVar4, 8, 0);
                return lVar;
            case 2:
                y0.o oVar2 = (y0.o) obj;
                ((Number) obj3).intValue();
                m0.q qVar7 = (m0.q) ((m0.m) obj2);
                qVar7.Z(1634330012);
                qVar7.Z(-492369756);
                Object objP7 = qVar7.P();
                if (objP7 == y0Var) {
                    objP7 = t.e.a(1.0f);
                    qVar7.l0(objP7);
                }
                qVar7.t(false);
                t.d dVar3 = (t.d) objP7;
                e1.n nVar = (e1.n) obj14;
                boolean z11 = ((nVar instanceof e1.n0) && ((e1.n0) nVar).f5052a == e1.r.f5065g) ? false : true;
                c2 c2Var = (c2) obj13;
                y0.o oVarF = lVar2;
                if (c2Var.b()) {
                    g2.a0 a0Var = (g2.a0) obj12;
                    if (a2.b0.b(a0Var.f6510b) && z11) {
                        m0.s.c(a0Var.f6509a, new a2.b0(a0Var.f6510b), new m1(dVar3, null), qVar7);
                        oVarF = androidx.compose.ui.draw.a.f(oVar2, new b.d(dVar3, (g2.s) obj11, a0Var, c2Var, nVar, 1));
                    }
                }
                oVarF = lVar2;
                oVarF = lVar2;
                qVar7.t(false);
                return oVarF;
            case 3:
                c9.e eVar3 = (c9.e) obj;
                m0.m mVar2 = (m0.m) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((m0.q) mVar2).i(eVar3) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18) {
                    m0.q qVar8 = (m0.q) mVar2;
                    if (qVar8.G()) {
                        qVar8.U();
                    } else {
                        x2Var = (x2) obj14;
                        zD = d7.a.d(x2Var, (x2) obj13);
                        int i19 = 75;
                        if (zD) {
                            i10 = 150;
                        } else {
                            i10 = 75;
                        }
                        if (zD) {
                            list = (List) obj12;
                            arrayList = new ArrayList(list.size());
                            size = list.size();
                            for (i12 = 0; i12 < size; i12++) {
                                obj10 = list.get(i12);
                                if (obj10 != null) {
                                    arrayList.add(obj10);
                                }
                            }
                            if (arrayList.size() == 1) {
                            }
                            w1Var = new w1(i10, i19, t.d0.f14122c);
                            qVar2 = (m0.q) mVar2;
                            qVar2.Z(870026295);
                            a1Var = (k0.a1) obj11;
                            zG = qVar2.g(x2Var) | qVar2.i(a1Var);
                            Object objP8 = qVar2.P();
                            obj4 = objP8;
                            if (zG || objP8 == y0Var) {
                                u.r0 r0Var = new u.r0(6, x2Var, a1Var);
                                qVar2.l0(r0Var);
                                obj4 = r0Var;
                            }
                            aVar = (c9.a) obj4;
                            qVar2.t(false);
                            qVar2.Z(1431889134);
                            qVar2.Z(1730440772);
                            objP2 = qVar2.P();
                            obj5 = objP2;
                            if (objP2 == y0Var) {
                                if (zD) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = 1.0f;
                                }
                                t.d dVarA = t.e.a(f11);
                                qVar2.l0(dVarA);
                                obj5 = dVarA;
                            }
                            dVar = (t.d) obj5;
                            qVar2.t(false);
                            Boolean boolValueOf = Boolean.valueOf(zD);
                            qVar2.Z(1730440850);
                            zI = qVar2.i(dVar) | qVar2.h(zD) | qVar2.i(w1Var) | qVar2.g(aVar);
                            Object objP9 = qVar2.P();
                            obj6 = objP9;
                            if (zI || objP9 == y0Var) {
                                v2 v2Var = new v2(dVar, zD, w1Var, aVar, null);
                                qVar2.l0(v2Var);
                                obj6 = v2Var;
                            }
                            qVar2.t(false);
                            m0.s.b(boolValueOf, (c9.e) obj6, qVar2);
                            t.o oVar3 = dVar.f14110c;
                            qVar2.t(false);
                            w1Var2 = new w1(i10, i19, t.d0.f14120a);
                            qVar2.Z(1966809761);
                            qVar2.Z(-92311588);
                            objP3 = qVar2.P();
                            obj7 = objP3;
                            if (objP3 == y0Var) {
                                if (zD) {
                                    f10 = 0.8f;
                                } else {
                                    f10 = 1.0f;
                                }
                                t.d dVarA2 = t.e.a(f10);
                                qVar2.l0(dVarA2);
                                obj7 = dVarA2;
                            }
                            dVar2 = (t.d) obj7;
                            qVar2.t(false);
                            Boolean boolValueOf2 = Boolean.valueOf(zD);
                            qVar2.Z(-92311508);
                            zI2 = qVar2.i(dVar2) | qVar2.h(zD) | qVar2.i(w1Var2);
                            Object objP10 = qVar2.P();
                            if (!zI2 || objP10 == y0Var) {
                                th = null;
                                w2 w2Var = new w2(dVar2, zD, w1Var2, null);
                                qVar2.l0(w2Var);
                                obj8 = w2Var;
                            } else {
                                th = null;
                                obj8 = objP10;
                            }
                            qVar2.t(false);
                            m0.s.b(boolValueOf2, (c9.e) obj8, qVar2);
                            t.o oVar4 = dVar2.f14110c;
                            qVar2.t(false);
                            th2 = th;
                            y0.o oVarK = androidx.compose.ui.graphics.a.k(lVar2, ((Number) oVar4.f14264b.getValue()).floatValue(), ((Number) oVar4.f14264b.getValue()).floatValue(), ((Number) oVar3.f14264b.getValue()).floatValue(), 0.0f, null, false, 131064);
                            qVar2.Z(870027225);
                            zG2 = qVar2.g(x2Var);
                            Object objP11 = qVar2.P();
                            if (!zG2 || objP11 == y0Var) {
                                z10 = false;
                                t2 t2Var = new t2(x2Var, false ? 1 : 0);
                                qVar2.l0(t2Var);
                                obj9 = t2Var;
                            } else {
                                z10 = false;
                                obj9 = objP11;
                            }
                            qVar2.t(z10);
                            y0.o oVarA = y1.l.a(oVarK, z10, (c9.c) obj9);
                            qVar2.Z(733328855);
                            j0VarC = y.p.c(y0.a.f16708a, z10, qVar2);
                            qVar2.Z(-1323940314);
                            i11 = qVar2.P;
                            r1VarP = qVar2.p();
                            t1.l.f14477k.getClass();
                            jVar = t1.k.f14458b;
                            bVarI = androidx.compose.ui.layout.a.i(oVarA);
                            if (qVar2.f11630a instanceof m0.d) {
                                m9.e0.C();
                                throw th2;
                            }
                            qVar2.c0();
                            if (qVar2.O) {
                                qVar2.o(jVar);
                            } else {
                                qVar2.o0();
                            }
                            d7.t.s0(qVar2, j0VarC, t1.k.f14461e);
                            d7.t.s0(qVar2, r1VarP, t1.k.f14460d);
                            iVar = t1.k.f14462f;
                            if (qVar2.O || !d7.a.d(qVar2.P(), Integer.valueOf(i11))) {
                                l.q.r(i11, qVar2, i11, iVar);
                            }
                            l.q.u(qVar2, bVarI, qVar2, 0, 2058660585);
                            l.q.q(iIntValue2 & 14, eVar3, qVar2, false, true);
                            qVar2.t(false);
                            qVar2.t(false);
                        }
                        i19 = 0;
                        w1Var = new w1(i10, i19, t.d0.f14122c);
                        qVar2 = (m0.q) mVar2;
                        qVar2.Z(870026295);
                        a1Var = (k0.a1) obj11;
                        zG = qVar2.g(x2Var) | qVar2.i(a1Var);
                        Object objP12 = qVar2.P();
                        obj4 = objP12;
                        if (zG) {
                            u.r0 r0Var2 = new u.r0(6, x2Var, a1Var);
                            qVar2.l0(r0Var2);
                            obj4 = r0Var2;
                        } else {
                            u.r0 r0Var3 = new u.r0(6, x2Var, a1Var);
                            qVar2.l0(r0Var3);
                            obj4 = r0Var3;
                        }
                        aVar = (c9.a) obj4;
                        qVar2.t(false);
                        qVar2.Z(1431889134);
                        qVar2.Z(1730440772);
                        objP2 = qVar2.P();
                        obj5 = objP2;
                        if (objP2 == y0Var) {
                            if (zD) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            t.d dVarA3 = t.e.a(f11);
                            qVar2.l0(dVarA3);
                            obj5 = dVarA3;
                        }
                        dVar = (t.d) obj5;
                        qVar2.t(false);
                        Boolean boolValueOf3 = Boolean.valueOf(zD);
                        qVar2.Z(1730440850);
                        zI = qVar2.i(dVar) | qVar2.h(zD) | qVar2.i(w1Var) | qVar2.g(aVar);
                        Object objP13 = qVar2.P();
                        obj6 = objP13;
                        if (zI) {
                            v2 v2Var2 = new v2(dVar, zD, w1Var, aVar, null);
                            qVar2.l0(v2Var2);
                            obj6 = v2Var2;
                        } else {
                            v2 v2Var3 = new v2(dVar, zD, w1Var, aVar, null);
                            qVar2.l0(v2Var3);
                            obj6 = v2Var3;
                        }
                        qVar2.t(false);
                        m0.s.b(boolValueOf3, (c9.e) obj6, qVar2);
                        t.o oVar5 = dVar.f14110c;
                        qVar2.t(false);
                        w1Var2 = new w1(i10, i19, t.d0.f14120a);
                        qVar2.Z(1966809761);
                        qVar2.Z(-92311588);
                        objP3 = qVar2.P();
                        obj7 = objP3;
                        if (objP3 == y0Var) {
                            if (zD) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.8f;
                            }
                            t.d dVarA4 = t.e.a(f10);
                            qVar2.l0(dVarA4);
                            obj7 = dVarA4;
                        }
                        dVar2 = (t.d) obj7;
                        qVar2.t(false);
                        Boolean boolValueOf4 = Boolean.valueOf(zD);
                        qVar2.Z(-92311508);
                        zI2 = qVar2.i(dVar2) | qVar2.h(zD) | qVar2.i(w1Var2);
                        Object objP14 = qVar2.P();
                        if (zI2) {
                            th = null;
                            w2 w2Var2 = new w2(dVar2, zD, w1Var2, null);
                            qVar2.l0(w2Var2);
                            obj8 = w2Var2;
                        } else {
                            th = null;
                            w2 w2Var3 = new w2(dVar2, zD, w1Var2, null);
                            qVar2.l0(w2Var3);
                            obj8 = w2Var3;
                        }
                        qVar2.t(false);
                        m0.s.b(boolValueOf4, (c9.e) obj8, qVar2);
                        t.o oVar6 = dVar2.f14110c;
                        qVar2.t(false);
                        th2 = th;
                        y0.o oVarK2 = androidx.compose.ui.graphics.a.k(lVar2, ((Number) oVar6.f14264b.getValue()).floatValue(), ((Number) oVar6.f14264b.getValue()).floatValue(), ((Number) oVar5.f14264b.getValue()).floatValue(), 0.0f, null, false, 131064);
                        qVar2.Z(870027225);
                        zG2 = qVar2.g(x2Var);
                        Object objP15 = qVar2.P();
                        if (zG2) {
                            z10 = false;
                            t2 t2Var2 = new t2(x2Var, false ? 1 : 0);
                            qVar2.l0(t2Var2);
                            obj9 = t2Var2;
                        } else {
                            z10 = false;
                            t2 t2Var3 = new t2(x2Var, false ? 1 : 0);
                            qVar2.l0(t2Var3);
                            obj9 = t2Var3;
                        }
                        qVar2.t(z10);
                        y0.o oVarA2 = y1.l.a(oVarK2, z10, (c9.c) obj9);
                        qVar2.Z(733328855);
                        j0VarC = y.p.c(y0.a.f16708a, z10, qVar2);
                        qVar2.Z(-1323940314);
                        i11 = qVar2.P;
                        r1VarP = qVar2.p();
                        t1.l.f14477k.getClass();
                        jVar = t1.k.f14458b;
                        bVarI = androidx.compose.ui.layout.a.i(oVarA2);
                        if (qVar2.f11630a instanceof m0.d) {
                            m9.e0.C();
                            throw th2;
                        }
                        qVar2.c0();
                        if (qVar2.O) {
                            qVar2.o(jVar);
                        } else {
                            qVar2.o0();
                        }
                        d7.t.s0(qVar2, j0VarC, t1.k.f14461e);
                        d7.t.s0(qVar2, r1VarP, t1.k.f14460d);
                        iVar = t1.k.f14462f;
                        if (qVar2.O) {
                            l.q.r(i11, qVar2, i11, iVar);
                        } else {
                            l.q.r(i11, qVar2, i11, iVar);
                        }
                        l.q.u(qVar2, bVarI, qVar2, 0, 2058660585);
                        l.q.q(iIntValue2 & 14, eVar3, qVar2, false, true);
                        qVar2.t(false);
                        qVar2.t(false);
                    }
                } else {
                    x2Var = (x2) obj14;
                    zD = d7.a.d(x2Var, (x2) obj13);
                    int i110 = 75;
                    if (zD) {
                        i10 = 150;
                    } else {
                        i10 = 75;
                    }
                    if (zD) {
                        list = (List) obj12;
                        arrayList = new ArrayList(list.size());
                        size = list.size();
                        while (i12 < size) {
                            obj10 = list.get(i12);
                            if (obj10 != null) {
                                arrayList.add(obj10);
                            }
                        }
                        if (arrayList.size() == 1) {
                        }
                        w1Var = new w1(i10, i110, t.d0.f14122c);
                        qVar2 = (m0.q) mVar2;
                        qVar2.Z(870026295);
                        a1Var = (k0.a1) obj11;
                        zG = qVar2.g(x2Var) | qVar2.i(a1Var);
                        Object objP16 = qVar2.P();
                        obj4 = objP16;
                        if (zG) {
                            u.r0 r0Var4 = new u.r0(6, x2Var, a1Var);
                            qVar2.l0(r0Var4);
                            obj4 = r0Var4;
                        } else {
                            u.r0 r0Var5 = new u.r0(6, x2Var, a1Var);
                            qVar2.l0(r0Var5);
                            obj4 = r0Var5;
                        }
                        aVar = (c9.a) obj4;
                        qVar2.t(false);
                        qVar2.Z(1431889134);
                        qVar2.Z(1730440772);
                        objP2 = qVar2.P();
                        obj5 = objP2;
                        if (objP2 == y0Var) {
                            if (zD) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            t.d dVarA5 = t.e.a(f11);
                            qVar2.l0(dVarA5);
                            obj5 = dVarA5;
                        }
                        dVar = (t.d) obj5;
                        qVar2.t(false);
                        Boolean boolValueOf5 = Boolean.valueOf(zD);
                        qVar2.Z(1730440850);
                        zI = qVar2.i(dVar) | qVar2.h(zD) | qVar2.i(w1Var) | qVar2.g(aVar);
                        Object objP17 = qVar2.P();
                        obj6 = objP17;
                        if (zI) {
                            v2 v2Var4 = new v2(dVar, zD, w1Var, aVar, null);
                            qVar2.l0(v2Var4);
                            obj6 = v2Var4;
                        } else {
                            v2 v2Var5 = new v2(dVar, zD, w1Var, aVar, null);
                            qVar2.l0(v2Var5);
                            obj6 = v2Var5;
                        }
                        qVar2.t(false);
                        m0.s.b(boolValueOf5, (c9.e) obj6, qVar2);
                        t.o oVar7 = dVar.f14110c;
                        qVar2.t(false);
                        w1Var2 = new w1(i10, i110, t.d0.f14120a);
                        qVar2.Z(1966809761);
                        qVar2.Z(-92311588);
                        objP3 = qVar2.P();
                        obj7 = objP3;
                        if (objP3 == y0Var) {
                            if (zD) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.8f;
                            }
                            t.d dVarA6 = t.e.a(f10);
                            qVar2.l0(dVarA6);
                            obj7 = dVarA6;
                        }
                        dVar2 = (t.d) obj7;
                        qVar2.t(false);
                        Boolean boolValueOf6 = Boolean.valueOf(zD);
                        qVar2.Z(-92311508);
                        zI2 = qVar2.i(dVar2) | qVar2.h(zD) | qVar2.i(w1Var2);
                        Object objP18 = qVar2.P();
                        if (zI2) {
                            th = null;
                            w2 w2Var4 = new w2(dVar2, zD, w1Var2, null);
                            qVar2.l0(w2Var4);
                            obj8 = w2Var4;
                        } else {
                            th = null;
                            w2 w2Var5 = new w2(dVar2, zD, w1Var2, null);
                            qVar2.l0(w2Var5);
                            obj8 = w2Var5;
                        }
                        qVar2.t(false);
                        m0.s.b(boolValueOf6, (c9.e) obj8, qVar2);
                        t.o oVar8 = dVar2.f14110c;
                        qVar2.t(false);
                        th2 = th;
                        y0.o oVarK3 = androidx.compose.ui.graphics.a.k(lVar2, ((Number) oVar8.f14264b.getValue()).floatValue(), ((Number) oVar8.f14264b.getValue()).floatValue(), ((Number) oVar7.f14264b.getValue()).floatValue(), 0.0f, null, false, 131064);
                        qVar2.Z(870027225);
                        zG2 = qVar2.g(x2Var);
                        Object objP19 = qVar2.P();
                        if (zG2) {
                            z10 = false;
                            t2 t2Var4 = new t2(x2Var, false ? 1 : 0);
                            qVar2.l0(t2Var4);
                            obj9 = t2Var4;
                        } else {
                            z10 = false;
                            t2 t2Var5 = new t2(x2Var, false ? 1 : 0);
                            qVar2.l0(t2Var5);
                            obj9 = t2Var5;
                        }
                        qVar2.t(z10);
                        y0.o oVarA3 = y1.l.a(oVarK3, z10, (c9.c) obj9);
                        qVar2.Z(733328855);
                        j0VarC = y.p.c(y0.a.f16708a, z10, qVar2);
                        qVar2.Z(-1323940314);
                        i11 = qVar2.P;
                        r1VarP = qVar2.p();
                        t1.l.f14477k.getClass();
                        jVar = t1.k.f14458b;
                        bVarI = androidx.compose.ui.layout.a.i(oVarA3);
                        if (qVar2.f11630a instanceof m0.d) {
                            m9.e0.C();
                            throw th2;
                        }
                        qVar2.c0();
                        if (qVar2.O) {
                            qVar2.o(jVar);
                        } else {
                            qVar2.o0();
                        }
                        d7.t.s0(qVar2, j0VarC, t1.k.f14461e);
                        d7.t.s0(qVar2, r1VarP, t1.k.f14460d);
                        iVar = t1.k.f14462f;
                        if (qVar2.O) {
                            l.q.r(i11, qVar2, i11, iVar);
                        } else {
                            l.q.r(i11, qVar2, i11, iVar);
                        }
                        l.q.u(qVar2, bVarI, qVar2, 0, 2058660585);
                        l.q.q(iIntValue2 & 14, eVar3, qVar2, false, true);
                        qVar2.t(false);
                        qVar2.t(false);
                    }
                    i110 = 0;
                    w1Var = new w1(i10, i110, t.d0.f14122c);
                    qVar2 = (m0.q) mVar2;
                    qVar2.Z(870026295);
                    a1Var = (k0.a1) obj11;
                    zG = qVar2.g(x2Var) | qVar2.i(a1Var);
                    Object objP110 = qVar2.P();
                    obj4 = objP110;
                    if (zG) {
                        u.r0 r0Var6 = new u.r0(6, x2Var, a1Var);
                        qVar2.l0(r0Var6);
                        obj4 = r0Var6;
                    } else {
                        u.r0 r0Var7 = new u.r0(6, x2Var, a1Var);
                        qVar2.l0(r0Var7);
                        obj4 = r0Var7;
                    }
                    aVar = (c9.a) obj4;
                    qVar2.t(false);
                    qVar2.Z(1431889134);
                    qVar2.Z(1730440772);
                    objP2 = qVar2.P();
                    obj5 = objP2;
                    if (objP2 == y0Var) {
                        if (zD) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        t.d dVarA7 = t.e.a(f11);
                        qVar2.l0(dVarA7);
                        obj5 = dVarA7;
                    }
                    dVar = (t.d) obj5;
                    qVar2.t(false);
                    Boolean boolValueOf7 = Boolean.valueOf(zD);
                    qVar2.Z(1730440850);
                    zI = qVar2.i(dVar) | qVar2.h(zD) | qVar2.i(w1Var) | qVar2.g(aVar);
                    Object objP111 = qVar2.P();
                    obj6 = objP111;
                    if (zI) {
                        v2 v2Var6 = new v2(dVar, zD, w1Var, aVar, null);
                        qVar2.l0(v2Var6);
                        obj6 = v2Var6;
                    } else {
                        v2 v2Var7 = new v2(dVar, zD, w1Var, aVar, null);
                        qVar2.l0(v2Var7);
                        obj6 = v2Var7;
                    }
                    qVar2.t(false);
                    m0.s.b(boolValueOf7, (c9.e) obj6, qVar2);
                    t.o oVar9 = dVar.f14110c;
                    qVar2.t(false);
                    w1Var2 = new w1(i10, i110, t.d0.f14120a);
                    qVar2.Z(1966809761);
                    qVar2.Z(-92311588);
                    objP3 = qVar2.P();
                    obj7 = objP3;
                    if (objP3 == y0Var) {
                        if (zD) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.8f;
                        }
                        t.d dVarA8 = t.e.a(f10);
                        qVar2.l0(dVarA8);
                        obj7 = dVarA8;
                    }
                    dVar2 = (t.d) obj7;
                    qVar2.t(false);
                    Boolean boolValueOf8 = Boolean.valueOf(zD);
                    qVar2.Z(-92311508);
                    zI2 = qVar2.i(dVar2) | qVar2.h(zD) | qVar2.i(w1Var2);
                    Object objP112 = qVar2.P();
                    if (zI2) {
                        th = null;
                        w2 w2Var6 = new w2(dVar2, zD, w1Var2, null);
                        qVar2.l0(w2Var6);
                        obj8 = w2Var6;
                    } else {
                        th = null;
                        w2 w2Var7 = new w2(dVar2, zD, w1Var2, null);
                        qVar2.l0(w2Var7);
                        obj8 = w2Var7;
                    }
                    qVar2.t(false);
                    m0.s.b(boolValueOf8, (c9.e) obj8, qVar2);
                    t.o oVar10 = dVar2.f14110c;
                    qVar2.t(false);
                    th2 = th;
                    y0.o oVarK4 = androidx.compose.ui.graphics.a.k(lVar2, ((Number) oVar10.f14264b.getValue()).floatValue(), ((Number) oVar10.f14264b.getValue()).floatValue(), ((Number) oVar9.f14264b.getValue()).floatValue(), 0.0f, null, false, 131064);
                    qVar2.Z(870027225);
                    zG2 = qVar2.g(x2Var);
                    Object objP113 = qVar2.P();
                    if (zG2) {
                        z10 = false;
                        t2 t2Var6 = new t2(x2Var, false ? 1 : 0);
                        qVar2.l0(t2Var6);
                        obj9 = t2Var6;
                    } else {
                        z10 = false;
                        t2 t2Var7 = new t2(x2Var, false ? 1 : 0);
                        qVar2.l0(t2Var7);
                        obj9 = t2Var7;
                    }
                    qVar2.t(z10);
                    y0.o oVarA4 = y1.l.a(oVarK4, z10, (c9.c) obj9);
                    qVar2.Z(733328855);
                    j0VarC = y.p.c(y0.a.f16708a, z10, qVar2);
                    qVar2.Z(-1323940314);
                    i11 = qVar2.P;
                    r1VarP = qVar2.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarA4);
                    if (qVar2.f11630a instanceof m0.d) {
                        m9.e0.C();
                        throw th2;
                    }
                    qVar2.c0();
                    if (qVar2.O) {
                        qVar2.o(jVar);
                    } else {
                        qVar2.o0();
                    }
                    d7.t.s0(qVar2, j0VarC, t1.k.f14461e);
                    d7.t.s0(qVar2, r1VarP, t1.k.f14460d);
                    iVar = t1.k.f14462f;
                    if (qVar2.O) {
                        l.q.r(i11, qVar2, i11, iVar);
                    } else {
                        l.q.r(i11, qVar2, i11, iVar);
                    }
                    l.q.u(qVar2, bVarI, qVar2, 0, 2058660585);
                    l.q.q(iIntValue2 & 14, eVar3, qVar2, false, true);
                    qVar2.t(false);
                    qVar2.t(false);
                }
                return lVar;
            default:
                m0.m mVar3 = (m0.m) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                d7.a.m((y.v) obj, "$this$Card");
                if ((iIntValue3 & 81) == 16) {
                    m0.q qVar9 = (m0.q) mVar3;
                    if (qVar9.G()) {
                        qVar9.U();
                        return lVar;
                    }
                }
                y0.o oVarL = androidx.compose.foundation.layout.a.l(lVar2, 16);
                g1 g1Var = (g1) obj14;
                l3 l3Var2 = (l3) obj13;
                Context context2 = (Context) obj12;
                g1 g1Var2 = (g1) obj11;
                m0.q qVar10 = (m0.q) mVar3;
                qVar10.Z(-483455358);
                y.e eVar4 = y.k.f16607c;
                y0.e eVar5 = y0.a.f16715o;
                r1.j0 j0VarA4 = y.u.a(eVar4, eVar5, qVar10);
                qVar10.Z(-1323940314);
                int i20 = qVar10.P;
                r1 r1VarP6 = qVar10.p();
                t1.l.f14477k.getClass();
                t1.j jVar2 = t1.k.f14458b;
                u0.b bVarI6 = androidx.compose.ui.layout.a.i(oVarL);
                boolean z12 = qVar10.f11630a instanceof m0.d;
                if (!z12) {
                    m9.e0.C();
                    throw null;
                }
                qVar10.c0();
                if (qVar10.O) {
                    qVar10.o(jVar2);
                } else {
                    qVar10.o0();
                }
                t1.i iVar2 = t1.k.f14461e;
                d7.t.s0(qVar10, j0VarA4, iVar2);
                t1.i iVar3 = t1.k.f14460d;
                d7.t.s0(qVar10, r1VarP6, iVar3);
                t1.i iVar4 = t1.k.f14462f;
                if (!qVar10.O) {
                    context = context2;
                    if (!d7.a.d(qVar10.P(), Integer.valueOf(i20))) {
                    }
                    l.q.u(qVar10, bVarI6, qVar10, 0, 2058660585);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f1667a;
                    y.f fVar4 = y.k.f16611g;
                    fVar = y0.a.f16714n;
                    qVar10.Z(693286680);
                    j0VarA = y.z0.a(fVar4, fVar, qVar10);
                    qVar10.Z(-1323940314);
                    i13 = qVar10.P;
                    r1VarP2 = qVar10.p();
                    bVarI2 = androidx.compose.ui.layout.a.i(fillElement);
                    if (z12) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar10.c0();
                    if (qVar10.O) {
                        qVar10.o(jVar2);
                    } else {
                        qVar10.o0();
                    }
                    d7.t.s0(qVar10, j0VarA, iVar2);
                    d7.t.s0(qVar10, r1VarP2, iVar3);
                    if (qVar10.O || !d7.a.d(qVar10.P(), Integer.valueOf(i13))) {
                        l.q.r(i13, qVar10, i13, iVar4);
                    }
                    bVarI2.e(new l2(qVar10), qVar10, 0);
                    qVar10.Z(2058660585);
                    y0.o oVarA5 = y.a1.a();
                    qVar10.Z(693286680);
                    j0VarA2 = y.z0.a(y.k.f16605a, fVar, qVar10);
                    qVar10.Z(-1323940314);
                    i14 = qVar10.P;
                    r1VarP3 = qVar10.p();
                    bVarI3 = androidx.compose.ui.layout.a.i(oVarA5);
                    if (z12) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar10.c0();
                    if (qVar10.O) {
                        qVar10.o(jVar2);
                    } else {
                        qVar10.o0();
                    }
                    d7.t.s0(qVar10, j0VarA2, iVar2);
                    d7.t.s0(qVar10, r1VarP3, iVar3);
                    if (qVar10.O || !d7.a.d(qVar10.P(), Integer.valueOf(i14))) {
                        l.q.r(i14, qVar10, i14, iVar4);
                    }
                    l.q.u(qVar10, bVarI3, qVar10, 0, 2058660585);
                    y0.o oVarB = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(lVar2, 40), e0.f.f4988a);
                    if (((Boolean) g1Var.getValue()).booleanValue()) {
                        jB = e1.r.b(e5.a.f5125a, 0.2f);
                    } else {
                        jB = e5.a.f5133i;
                    }
                    y0.o oVarE = androidx.compose.foundation.a.e(oVarB, jB, e1.g0.f5008a);
                    y0.g gVar = y0.a.f16710c;
                    qVar10.Z(733328855);
                    j0VarC2 = y.p.c(gVar, false, qVar10);
                    qVar10.Z(-1323940314);
                    i15 = qVar10.P;
                    r1VarP4 = qVar10.p();
                    bVarI4 = androidx.compose.ui.layout.a.i(oVarE);
                    if (z12) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar10.c0();
                    if (qVar10.O) {
                        qVar10.o(jVar2);
                    } else {
                        qVar10.o0();
                    }
                    d7.t.s0(qVar10, j0VarC2, iVar2);
                    d7.t.s0(qVar10, r1VarP4, iVar3);
                    if (qVar10.O || !d7.a.d(qVar10.P(), Integer.valueOf(i15))) {
                        l.q.r(i15, qVar10, i15, iVar4);
                    }
                    l.q.u(qVar10, bVarI4, qVar10, 0, 2058660585);
                    fVar2 = h6.g.f7595r;
                    if (fVar2 != null) {
                        fVar3 = fVar2;
                    } else {
                        i1.e eVar6 = new i1.e("Filled.Speed", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i21 = i1.h0.f7832a;
                        e1.n0 n0Var2 = new e1.n0(e1.r.f5060b);
                        k.f fVar5 = new k.f(7);
                        fVar5.D(20.38f, 8.57f);
                        fVar5.C(-1.23f, 1.85f);
                        fVar5.o(8.0f, 8.0f, true, -0.22f, 7.58f);
                        fVar5.B(5.07f, 18.0f);
                        ((ArrayList) fVar5.f8599b).add(new i1.i(8.0f, 8.0f, 0.0f, false, true, 15.58f, 6.85f));
                        fVar5.C(1.85f, -1.23f);
                        ((ArrayList) fVar5.f8599b).add(new i1.i(10.0f, 10.0f, 0.0f, false, false, 3.35f, 19.0f));
                        fVar5.o(2.0f, 2.0f, false, 1.72f, 1.0f);
                        fVar5.A(13.85f);
                        fVar5.o(2.0f, 2.0f, false, 1.74f, -1.0f);
                        fVar5.o(10.0f, 10.0f, false, -0.27f, -10.44f);
                        fVar5.p();
                        fVar5.D(10.59f, 15.41f);
                        fVar5.o(2.0f, 2.0f, false, 2.83f, 0.0f);
                        fVar5.C(5.66f, -8.49f);
                        fVar5.C(-8.49f, 5.66f);
                        fVar5.o(2.0f, 2.0f, false, 0.0f, 2.83f);
                        fVar5.p();
                        i1.e.a(eVar6, (ArrayList) fVar5.f8599b, n0Var2);
                        i1.f fVarB = eVar6.b();
                        h6.g.f7595r = fVarB;
                        fVar3 = fVarB;
                    }
                    if (((Boolean) g1Var.getValue()).booleanValue()) {
                        j10 = e5.a.f5125a;
                    } else {
                        j10 = e5.a.f5137m;
                    }
                    k0.e1.b(fVar3, null, androidx.compose.foundation.layout.c.h(lVar2, 22), j10, qVar10, 432, 0);
                    l.q.v(qVar10, false, true, false, false);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.k(lVar2, 12), qVar10);
                    qVar10.Z(-483455358);
                    j0VarA3 = y.u.a(eVar4, eVar5, qVar10);
                    qVar10.Z(-1323940314);
                    i16 = qVar10.P;
                    r1VarP5 = qVar10.p();
                    bVarI5 = androidx.compose.ui.layout.a.i(lVar2);
                    if (z12) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar10.c0();
                    if (qVar10.O) {
                        qVar10.o(jVar2);
                    } else {
                        qVar10.o0();
                    }
                    d7.t.s0(qVar10, j0VarA3, iVar2);
                    d7.t.s0(qVar10, r1VarP5, iVar3);
                    if (qVar10.O || !d7.a.d(qVar10.P(), Integer.valueOf(i16))) {
                        l.q.r(i16, qVar10, i16, iVar4);
                    }
                    l.q.u(qVar10, bVarI5, qVar10, 0, 2058660585);
                    List list2 = g5.b.f6616a;
                    c5.b(g5.b.b("accept_timer_title", (String) l3Var2.getValue()), null, e5.a.f5136l, o1.s.N(14), null, f2.l.f6118f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar10, 199680, 0, 131026);
                    l.q.v(qVar10, false, true, false, false);
                    l.q.v(qVar10, false, true, false, false);
                    u3.a(((Boolean) g1Var.getValue()).booleanValue(), new b.g(context, g1Var2, g1Var, 21), null, null, ((Boolean) g1Var2.getValue()).booleanValue(), k0.t0.f(e1.r.f5061c, e5.a.f5125a, 0L, qVar10, 65532), null, qVar10, 0, 76);
                    l.q.v(qVar10, false, true, false, false);
                    c5.b(g5.b.b("accept_timer_desc", (String) l3Var2.getValue()), androidx.compose.foundation.layout.a.o(lVar2, 0.0f, 8, 0.0f, 0.0f, 13), e5.a.f5137m, o1.s.N(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar10, 3120, 0, 131056);
                    qVar10.Z(-1873463225);
                    if (!((Boolean) g1Var2.getValue()).booleanValue()) {
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar2, 6), qVar10);
                        c5.b("\u26a0 Shizuku is not active \u2014 this option is disabled.", null, androidx.compose.ui.graphics.a.c(4294940672L), o1.s.N(11), null, f2.l.f6117e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar10, 200070, 0, 131026);
                    }
                    l.q.v(qVar10, false, false, true, false);
                    qVar10.t(false);
                    return lVar;
                }
                context = context2;
                l.q.r(i20, qVar10, i20, iVar4);
                l.q.u(qVar10, bVarI6, qVar10, 0, 2058660585);
                FillElement fillElement2 = androidx.compose.foundation.layout.c.f1667a;
                y.f fVar6 = y.k.f16611g;
                fVar = y0.a.f16714n;
                qVar10.Z(693286680);
                j0VarA = y.z0.a(fVar6, fVar, qVar10);
                qVar10.Z(-1323940314);
                i13 = qVar10.P;
                r1VarP2 = qVar10.p();
                bVarI2 = androidx.compose.ui.layout.a.i(fillElement2);
                if (z12) {
                    m9.e0.C();
                    throw null;
                }
                qVar10.c0();
                if (qVar10.O) {
                    qVar10.o(jVar2);
                } else {
                    qVar10.o0();
                }
                d7.t.s0(qVar10, j0VarA, iVar2);
                d7.t.s0(qVar10, r1VarP2, iVar3);
                if (qVar10.O) {
                    l.q.r(i13, qVar10, i13, iVar4);
                } else {
                    l.q.r(i13, qVar10, i13, iVar4);
                }
                bVarI2.e(new l2(qVar10), qVar10, 0);
                qVar10.Z(2058660585);
                y0.o oVarA6 = y.a1.a();
                qVar10.Z(693286680);
                j0VarA2 = y.z0.a(y.k.f16605a, fVar, qVar10);
                qVar10.Z(-1323940314);
                i14 = qVar10.P;
                r1VarP3 = qVar10.p();
                bVarI3 = androidx.compose.ui.layout.a.i(oVarA6);
                if (z12) {
                    m9.e0.C();
                    throw null;
                }
                qVar10.c0();
                if (qVar10.O) {
                    qVar10.o(jVar2);
                } else {
                    qVar10.o0();
                }
                d7.t.s0(qVar10, j0VarA2, iVar2);
                d7.t.s0(qVar10, r1VarP3, iVar3);
                if (qVar10.O) {
                    l.q.r(i14, qVar10, i14, iVar4);
                } else {
                    l.q.r(i14, qVar10, i14, iVar4);
                }
                l.q.u(qVar10, bVarI3, qVar10, 0, 2058660585);
                y0.o oVarB2 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(lVar2, 40), e0.f.f4988a);
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    jB = e1.r.b(e5.a.f5125a, 0.2f);
                } else {
                    jB = e5.a.f5133i;
                }
                y0.o oVarE2 = androidx.compose.foundation.a.e(oVarB2, jB, e1.g0.f5008a);
                y0.g gVar2 = y0.a.f16710c;
                qVar10.Z(733328855);
                j0VarC2 = y.p.c(gVar2, false, qVar10);
                qVar10.Z(-1323940314);
                i15 = qVar10.P;
                r1VarP4 = qVar10.p();
                bVarI4 = androidx.compose.ui.layout.a.i(oVarE2);
                if (z12) {
                    m9.e0.C();
                    throw null;
                }
                qVar10.c0();
                if (qVar10.O) {
                    qVar10.o(jVar2);
                } else {
                    qVar10.o0();
                }
                d7.t.s0(qVar10, j0VarC2, iVar2);
                d7.t.s0(qVar10, r1VarP4, iVar3);
                if (qVar10.O) {
                    l.q.r(i15, qVar10, i15, iVar4);
                } else {
                    l.q.r(i15, qVar10, i15, iVar4);
                }
                l.q.u(qVar10, bVarI4, qVar10, 0, 2058660585);
                fVar2 = h6.g.f7595r;
                if (fVar2 != null) {
                    fVar3 = fVar2;
                } else {
                    i1.e eVar7 = new i1.e("Filled.Speed", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i22 = i1.h0.f7832a;
                    e1.n0 n0Var3 = new e1.n0(e1.r.f5060b);
                    k.f fVar7 = new k.f(7);
                    fVar7.D(20.38f, 8.57f);
                    fVar7.C(-1.23f, 1.85f);
                    fVar7.o(8.0f, 8.0f, true, -0.22f, 7.58f);
                    fVar7.B(5.07f, 18.0f);
                    ((ArrayList) fVar7.f8599b).add(new i1.i(8.0f, 8.0f, 0.0f, false, true, 15.58f, 6.85f));
                    fVar7.C(1.85f, -1.23f);
                    ((ArrayList) fVar7.f8599b).add(new i1.i(10.0f, 10.0f, 0.0f, false, false, 3.35f, 19.0f));
                    fVar7.o(2.0f, 2.0f, false, 1.72f, 1.0f);
                    fVar7.A(13.85f);
                    fVar7.o(2.0f, 2.0f, false, 1.74f, -1.0f);
                    fVar7.o(10.0f, 10.0f, false, -0.27f, -10.44f);
                    fVar7.p();
                    fVar7.D(10.59f, 15.41f);
                    fVar7.o(2.0f, 2.0f, false, 2.83f, 0.0f);
                    fVar7.C(5.66f, -8.49f);
                    fVar7.C(-8.49f, 5.66f);
                    fVar7.o(2.0f, 2.0f, false, 0.0f, 2.83f);
                    fVar7.p();
                    i1.e.a(eVar7, (ArrayList) fVar7.f8599b, n0Var3);
                    i1.f fVarB2 = eVar7.b();
                    h6.g.f7595r = fVarB2;
                    fVar3 = fVarB2;
                }
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    j10 = e5.a.f5125a;
                } else {
                    j10 = e5.a.f5137m;
                }
                k0.e1.b(fVar3, null, androidx.compose.foundation.layout.c.h(lVar2, 22), j10, qVar10, 432, 0);
                l.q.v(qVar10, false, true, false, false);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.k(lVar2, 12), qVar10);
                qVar10.Z(-483455358);
                j0VarA3 = y.u.a(eVar4, eVar5, qVar10);
                qVar10.Z(-1323940314);
                i16 = qVar10.P;
                r1VarP5 = qVar10.p();
                bVarI5 = androidx.compose.ui.layout.a.i(lVar2);
                if (z12) {
                    m9.e0.C();
                    throw null;
                }
                qVar10.c0();
                if (qVar10.O) {
                    qVar10.o(jVar2);
                } else {
                    qVar10.o0();
                }
                d7.t.s0(qVar10, j0VarA3, iVar2);
                d7.t.s0(qVar10, r1VarP5, iVar3);
                if (qVar10.O) {
                    l.q.r(i16, qVar10, i16, iVar4);
                } else {
                    l.q.r(i16, qVar10, i16, iVar4);
                }
                l.q.u(qVar10, bVarI5, qVar10, 0, 2058660585);
                List list3 = g5.b.f6616a;
                c5.b(g5.b.b("accept_timer_title", (String) l3Var2.getValue()), null, e5.a.f5136l, o1.s.N(14), null, f2.l.f6118f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar10, 199680, 0, 131026);
                l.q.v(qVar10, false, true, false, false);
                l.q.v(qVar10, false, true, false, false);
                u3.a(((Boolean) g1Var.getValue()).booleanValue(), new b.g(context, g1Var2, g1Var, 21), null, null, ((Boolean) g1Var2.getValue()).booleanValue(), k0.t0.f(e1.r.f5061c, e5.a.f5125a, 0L, qVar10, 65532), null, qVar10, 0, 76);
                l.q.v(qVar10, false, true, false, false);
                c5.b(g5.b.b("accept_timer_desc", (String) l3Var2.getValue()), androidx.compose.foundation.layout.a.o(lVar2, 0.0f, 8, 0.0f, 0.0f, 13), e5.a.f5137m, o1.s.N(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar10, 3120, 0, 131056);
                qVar10.Z(-1873463225);
                if (!((Boolean) g1Var2.getValue()).booleanValue()) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar2, 6), qVar10);
                    c5.b("\u26a0 Shizuku is not active \u2014 this option is disabled.", null, androidx.compose.ui.graphics.a.c(4294940672L), o1.s.N(11), null, f2.l.f6117e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar10, 200070, 0, 131026);
                }
                l.q.v(qVar10, false, false, true, false);
                qVar10.t(false);
                return lVar;
        }
    }
}
