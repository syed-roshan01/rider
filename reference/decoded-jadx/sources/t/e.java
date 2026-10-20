package t;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f14130a = new p(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f14131b = new q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f14132c = new r(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f14133d = new s(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f14134e = new p(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f14135f = new q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f14136g = new r(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s f14137h = new s(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static d a(float f10) {
        return new d(Float.valueOf(f10), y1.f14355a, Float.valueOf(0.01f), 8);
    }

    public static o b(float f10, float f11) {
        return new o(y1.f14355a, Float.valueOf(f10), new p(f11), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [d9.u] */
    /* JADX WARN: Type inference failed for: r19v1, types: [t.o] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13, types: [d9.u] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [d9.u] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [t.o] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [t.o] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static final Object c(o oVar, j jVar, long j10, c9.c cVar, u8.e eVar) {
        f1 f1Var;
        ?? r10;
        ?? r11;
        ?? r12;
        d9.u uVar;
        c9.c cVar2;
        Object objT;
        Object objT2;
        o oVar2 = oVar;
        j jVar2 = jVar;
        if (eVar instanceof f1) {
            f1Var = (f1) eVar;
            int i10 = f1Var.f14152f;
            r10 = -2147483648;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f1Var.f14152f = i10 - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(eVar);
            }
        } else {
            f1Var = new f1(eVar);
        }
        f1 f1Var2 = f1Var;
        Object obj = f1Var2.f14151e;
        v8.a aVar = v8.a.f15963a;
        ?? r13 = f1Var2.f14152f;
        u1.c2 c2Var = u1.c2.f15056a;
        int i11 = 1;
        try {
            if (r13 == 0) {
                d7.t.v0(obj);
                Object objB = jVar2.b(0L);
                t tVarF = jVar2.f(0L);
                d9.u uVar2 = new d9.u();
                try {
                    if (j10 == Long.MIN_VALUE) {
                        try {
                            uVar = uVar2;
                            i1 i1Var = new i1(uVar2, objB, jVar, tVarF, oVar, o(f1Var2.getContext()), cVar);
                            f1Var2.f14147a = oVar2;
                            f1Var2.f14148b = jVar2;
                            cVar2 = cVar;
                            f1Var2.f14149c = cVar2;
                            f1Var2.f14150d = uVar;
                            f1Var2.f14152f = 1;
                            if (jVar.a()) {
                                k.d(f1Var2.getContext().f(c2Var));
                                objT = d9.i.p(f1Var2.getContext()).T(i1Var, f1Var2);
                            } else {
                                objT = d9.i.p(f1Var2.getContext()).T(new k1(0, i1Var), f1Var2);
                            }
                            if (objT == aVar) {
                                return aVar;
                            }
                        } catch (CancellationException e4) {
                            e = e4;
                            r12 = uVar2;
                            r11 = oVar2;
                            m mVar = (m) r12.f4952a;
                            if (mVar != null) {
                                mVar.f14249i.setValue(Boolean.FALSE);
                            }
                            m mVar2 = (m) r12.f4952a;
                            if (mVar2 != null && mVar2.f14247g == r11.f14266d) {
                                r11.f14268f = false;
                            }
                            throw e;
                        }
                    } else {
                        uVar = uVar2;
                        cVar2 = cVar;
                        m mVar3 = new m(objB, jVar.d(), tVarF, j10, jVar.e(), j10, new h1(oVar2, i11));
                        n(mVar3, j10, o(f1Var2.getContext()), jVar, oVar, cVar);
                        uVar.f4952a = mVar3;
                    }
                    r10 = oVar2;
                    r13 = uVar;
                } catch (CancellationException e10) {
                    e = e10;
                }
            } else if (r13 == 1) {
                d9.u uVar3 = f1Var2.f14150d;
                c9.c cVar3 = f1Var2.f14149c;
                j jVar3 = f1Var2.f14148b;
                o oVar3 = f1Var2.f14147a;
                d7.t.v0(obj);
                cVar2 = cVar3;
                jVar2 = jVar3;
                r13 = uVar3;
                r10 = oVar3;
            } else {
                if (r13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d9.u uVar4 = f1Var2.f14150d;
                c9.c cVar4 = f1Var2.f14149c;
                j jVar4 = f1Var2.f14148b;
                o oVar4 = f1Var2.f14147a;
                d7.t.v0(obj);
                cVar2 = cVar4;
                jVar2 = jVar4;
                r13 = uVar4;
                r10 = oVar4;
            }
            do {
                Object obj2 = r13.f4952a;
                d7.a.j(obj2);
                if (!((Boolean) ((m) obj2).f14249i.getValue()).booleanValue()) {
                    return q8.l.f13235a;
                }
                j1 j1Var = new j1(r13, o(f1Var2.getContext()), jVar2, r10, cVar2);
                f1Var2.f14147a = r10;
                f1Var2.f14148b = jVar2;
                f1Var2.f14149c = cVar2;
                f1Var2.f14150d = r13;
                f1Var2.f14152f = 2;
                if (jVar2.a()) {
                    k.d(f1Var2.getContext().f(c2Var));
                    objT2 = d9.i.p(f1Var2.getContext()).T(j1Var, f1Var2);
                } else {
                    objT2 = d9.i.p(f1Var2.getContext()).T(new k1(0, j1Var), f1Var2);
                }
            } while (objT2 != aVar);
            return aVar;
        } catch (CancellationException e11) {
            e = e11;
            r11 = r10;
            r12 = r13;
        }
    }

    public static Object d(float f10, n nVar, v.p1 p1Var, u8.e eVar) {
        x1 x1Var = y1.f14355a;
        Float f11 = new Float(0.0f);
        Float f12 = new Float(f10);
        Float f13 = new Float(0.0f);
        g1 g1Var = g1.f14167n;
        t tVarC = (t) g1Var.invoke(f13);
        if (tVarC == null) {
            tVarC = ((t) g1Var.invoke(f11)).c();
            d7.a.k(tVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        }
        t tVar = tVarC;
        Object objC = c(new o(x1Var, f11, tVar, 56), new l1(nVar, x1Var, f11, f12, tVar), Long.MIN_VALUE, new e1(0, p1Var, x1Var), eVar);
        v8.a aVar = v8.a.f15963a;
        q8.l lVar = q8.l.f13235a;
        if (objC != aVar) {
            objC = lVar;
        }
        return objC == aVar ? objC : lVar;
    }

    public static final Object e(o oVar, y yVar, boolean z10, c9.c cVar, u8.e eVar) {
        Object objC = c(oVar, new x(yVar, oVar.f14263a, oVar.f14264b.getValue(), oVar.f14265c), z10 ? oVar.f14266d : Long.MIN_VALUE, cVar, eVar);
        return objC == v8.a.f15963a ? objC : q8.l.f13235a;
    }

    public static final k0 f(p0 p0Var, float f10, float f11, j0 j0Var, String str, m0.m mVar, int i10, int i11) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(-644770905);
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        k0 k0VarI = i(p0Var, Float.valueOf(f10), Float.valueOf(f11), y1.f14355a, j0Var, str, qVar, 0);
        qVar.t(false);
        return k0VarI;
    }

    public static final Object g(o oVar, Float f10, n nVar, boolean z10, c9.c cVar, u8.e eVar) {
        Object objC = c(oVar, new l1(nVar, oVar.f14263a, oVar.f14264b.getValue(), f10, oVar.f14265c), z10 ? oVar.f14266d : Long.MIN_VALUE, cVar, eVar);
        return objC == v8.a.f15963a ? objC : q8.l.f13235a;
    }

    public static final k0 i(p0 p0Var, Number number, Number number2, x1 x1Var, j0 j0Var, String str, m0.m mVar, int i10) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(-1062847727);
        qVar.Z(-492369756);
        Object objP = qVar.P();
        if (objP == m0.l.f11578a) {
            objP = new k0(p0Var, number, number2, x1Var, j0Var);
            qVar.l0(objP);
        }
        qVar.t(false);
        k0 k0Var = (k0) objP;
        m0.s.d(new q0(number, k0Var, number2, j0Var), qVar);
        m0.s.a(k0Var, new e1(1, p0Var, k0Var), qVar);
        qVar.t(false);
        return k0Var;
    }

    public static final t j(t tVar) {
        t tVarC = tVar.c();
        d7.a.k(tVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        int iB = tVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            tVarC.e(i10, tVar.a(i10));
        }
        return tVarC;
    }

    public static o k(o oVar, float f10, float f11, int i10) {
        return new o(oVar.f14263a, Float.valueOf((i10 & 1) != 0 ? ((Number) oVar.f14264b.getValue()).floatValue() : f10), new p((i10 & 2) != 0 ? ((p) oVar.f14265c).f14272a : f11), (i10 & 4) != 0 ? oVar.f14266d : 0L, (i10 & 8) != 0 ? oVar.f14267e : 0L, (i10 & 16) != 0 ? oVar.f14268f : false);
    }

    public static final n1 l(u1 u1Var, x1 x1Var, String str, m0.m mVar, int i10) {
        m1 m1Var;
        m0.q qVar = (m0.q) mVar;
        qVar.Z(-1714122528);
        if ((i10 & 2) != 0) {
            str = "DeferredAnimation";
        }
        qVar.Z(1157296644);
        boolean zG = qVar.g(u1Var);
        Object objP = qVar.P();
        if (zG || objP == m0.l.f11578a) {
            objP = new n1(u1Var, x1Var, str);
            qVar.l0(objP);
        }
        qVar.t(false);
        n1 n1Var = (n1) objP;
        m0.s.a(n1Var, new e1(3, u1Var, n1Var), qVar);
        if (u1Var.d() && (m1Var = (m1) n1Var.f14261b.getValue()) != null) {
            c9.c cVar = m1Var.f14253c;
            u1 u1Var2 = n1Var.f14262c;
            m1Var.f14251a.e(cVar.invoke(u1Var2.c().a()), m1Var.f14253c.invoke(u1Var2.c().c()), (e0) m1Var.f14252b.invoke(u1Var2.c()));
        }
        qVar.t(false);
        return n1Var;
    }

    public static final q1 m(u1 u1Var, Object obj, Object obj2, e0 e0Var, x1 x1Var, m0.m mVar) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(-304821198);
        qVar.Z(1157296644);
        boolean zG = qVar.g(u1Var);
        Object objP = qVar.P();
        k0.y0 y0Var = m0.l.f11578a;
        if (zG || objP == y0Var) {
            t tVar = (t) x1Var.f14351a.invoke(obj2);
            tVar.d();
            objP = new q1(u1Var, obj, tVar, x1Var);
            qVar.l0(objP);
        }
        qVar.t(false);
        q1 q1Var = (q1) objP;
        if (u1Var.d()) {
            q1Var.e(obj, obj2, e0Var);
        } else {
            q1Var.f(obj2, e0Var);
        }
        qVar.Z(-561010487);
        boolean zG2 = qVar.g(u1Var) | qVar.g(q1Var);
        Object objP2 = qVar.P();
        if (zG2 || objP2 == y0Var) {
            objP2 = new e1(4, u1Var, q1Var);
            qVar.l0(objP2);
        }
        qVar.t(false);
        m0.s.a(q1Var, (c9.c) objP2, qVar);
        qVar.t(false);
        return q1Var;
    }

    public static final void n(m mVar, long j10, float f10, j jVar, o oVar, c9.c cVar) {
        long jC = f10 == 0.0f ? jVar.c() : (long) ((j10 - mVar.f14243c) / f10);
        mVar.f14247g = j10;
        mVar.f14245e.setValue(jVar.b(jC));
        mVar.f14246f = jVar.f(jC);
        if (jVar.g(jC)) {
            mVar.f14248h = mVar.f14247g;
            mVar.f14249i.setValue(Boolean.FALSE);
        }
        t(mVar, oVar);
        cVar.invoke(mVar);
    }

    public static final float o(u8.j jVar) {
        y0.p pVar = (y0.p) jVar.f(y0.a.f16718r);
        float fP = pVar != null ? pVar.P() : 1.0f;
        if (fP >= 0.0f) {
            return fP;
        }
        throw new IllegalStateException("negative scale factor".toString());
    }

    public static j0 p(z zVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return new j0(zVar, i10, (i11 & 4) != 0 ? 0 : 0L);
    }

    public static final p0 q(String str, m0.m mVar, int i10) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(1013651573);
        qVar.Z(-492369756);
        Object objP = qVar.P();
        if (objP == m0.l.f11578a) {
            objP = new p0();
            qVar.l0(objP);
        }
        qVar.t(false);
        p0 p0Var = (p0) objP;
        p0Var.a(qVar, 8);
        qVar.t(false);
        return p0Var;
    }

    public static d1 r(float f10, Object obj, int i10) {
        float f11 = (i10 & 1) != 0 ? 1.0f : 0.0f;
        if ((i10 & 2) != 0) {
            f10 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new d1(f11, f10, obj);
    }

    public static w1 s(int i10, int i11, a0 a0Var, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            a0Var = d0.f14120a;
        }
        return new w1(i10, i11, a0Var);
    }

    public static final void t(m mVar, o oVar) {
        oVar.f14264b.setValue(mVar.f14245e.getValue());
        t tVar = oVar.f14265c;
        t tVar2 = mVar.f14246f;
        int iB = tVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            tVar.e(i10, tVar2.a(i10));
        }
        oVar.f14267e = mVar.f14248h;
        oVar.f14266d = mVar.f14247g;
        oVar.f14268f = ((Boolean) mVar.f14249i.getValue()).booleanValue();
    }

    public static final u1 u(Object obj, String str, m0.m mVar, int i10, int i11) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(2029166765);
        if ((i11 & 2) != 0) {
            str = null;
        }
        qVar.Z(-492369756);
        Object objP = qVar.P();
        Object obj2 = m0.l.f11578a;
        if (objP == obj2) {
            objP = new u1(new x0(obj), str);
            qVar.l0(objP);
        }
        qVar.t(false);
        u1 u1Var = (u1) objP;
        u1Var.a(obj, qVar, (i10 & 14) | (i10 & 8) | 48);
        qVar.Z(-561051652);
        boolean zG = qVar.g(u1Var);
        Object objP2 = qVar.P();
        if (zG || objP2 == obj2) {
            objP2 = new q.w(u1Var, 4);
            qVar.l0(objP2);
        }
        qVar.t(false);
        m0.s.a(u1Var, (c9.c) objP2, qVar);
        qVar.t(false);
        return u1Var;
    }
}
