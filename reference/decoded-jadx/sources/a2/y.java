package a2;

import e1.k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f1047a = o1.s.N(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f1048b = o1.s.N(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f1049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f1050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f1051e = 0;

    static {
        int i10 = e1.r.f5066h;
        f1049c = e1.r.f5064f;
        f1050d = e1.r.f5060b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0030  */
    public static final x a(x xVar, long j10, e1.n nVar, float f10, long j11, f2.l lVar, f2.j jVar, f2.k kVar, f2.e eVar, String str, long j12, l2.a aVar, l2.p pVar, h2.d dVar, long j13, l2.j jVar2, k0 k0Var, s sVar, g1.h hVar) {
        k0 k0Var2;
        g1.h hVar2;
        l2.o cVar;
        f2.l lVar2 = lVar;
        f2.j jVar3 = jVar;
        f2.k kVar2 = kVar;
        String str2 = str;
        l2.a aVar2 = aVar;
        if ((!o1.s.V(j11)) && !m2.n.a(j11, xVar.f1032b)) {
            k0Var2 = k0Var;
            hVar2 = hVar;
        } else if ((nVar != null || j10 == e1.r.f5065g || e1.r.c(j10, xVar.f1031a.d())) && ((jVar3 == null || d7.a.d(jVar3, xVar.f1034d)) && ((lVar2 == null || d7.a.d(lVar2, xVar.f1033c)) && ((eVar == null || eVar == xVar.f1036f) && (!(!o1.s.V(j12)) || m2.n.a(j12, xVar.f1038h)))))) {
            if ((jVar2 == null || d7.a.d(jVar2, xVar.f1043m)) && d7.a.d(nVar, xVar.f1031a.e()) && ((nVar == null || f10 == xVar.f1031a.c()) && ((kVar2 == null || d7.a.d(kVar2, xVar.f1035e)) && ((str2 == null || d7.a.d(str2, xVar.f1037g)) && ((aVar2 == null || d7.a.d(aVar2, xVar.f1039i)) && ((pVar == null || d7.a.d(pVar, xVar.f1040j)) && (dVar == null || d7.a.d(dVar, xVar.f1041k)))))))) {
                if (j13 == e1.r.f5065g || e1.r.c(j13, xVar.f1042l)) {
                    k0Var2 = k0Var;
                    if ((k0Var2 == null || d7.a.d(k0Var2, xVar.f1044n)) && (sVar == null || d7.a.d(sVar, xVar.f1045o))) {
                        hVar2 = hVar;
                        if (hVar2 == null || d7.a.d(hVar2, xVar.f1046p)) {
                            return xVar;
                        }
                    }
                }
                hVar2 = hVar;
            }
            k0Var2 = k0Var;
            hVar2 = hVar;
        } else {
            k0Var2 = k0Var;
            hVar2 = hVar;
        }
        l2.m mVar = l2.m.f11216a;
        if (nVar != null) {
            cVar = l2.l.e(f10, nVar);
        } else {
            cVar = j10 != e1.r.f5065g ? new l2.c(j10) : mVar;
        }
        l2.o oVar = xVar.f1031a;
        oVar.getClass();
        boolean z10 = cVar instanceof l2.b;
        if (z10 && (oVar instanceof l2.b)) {
            l2.b bVar = (l2.b) cVar;
            float fC = cVar.c();
            l2.n nVar2 = new l2.n(oVar, 0);
            if (Float.isNaN(fC)) {
                fC = ((Number) nVar2.invoke()).floatValue();
            }
            cVar = new l2.b(bVar.f11195a, fC);
        } else if (!z10 || (oVar instanceof l2.b)) {
            if (z10 || !(oVar instanceof l2.b)) {
                l2.n nVar3 = new l2.n(oVar, 1);
                if (d7.a.d(cVar, mVar)) {
                    cVar = (l2.o) nVar3.invoke();
                }
            } else {
                cVar = oVar;
            }
        }
        f2.e eVar2 = eVar == null ? xVar.f1036f : eVar;
        long j14 = !o1.s.V(j11) ? j11 : xVar.f1032b;
        if (lVar2 == null) {
            lVar2 = xVar.f1033c;
        }
        if (jVar3 == null) {
            jVar3 = xVar.f1034d;
        }
        if (kVar2 == null) {
            kVar2 = xVar.f1035e;
        }
        if (str2 == null) {
            str2 = xVar.f1037g;
        }
        long j15 = !o1.s.V(j12) ? j12 : xVar.f1038h;
        if (aVar2 == null) {
            aVar2 = xVar.f1039i;
        }
        l2.p pVar2 = pVar == null ? xVar.f1040j : pVar;
        h2.d dVar2 = dVar == null ? xVar.f1041k : dVar;
        long j16 = j13 != e1.r.f5065g ? j13 : xVar.f1042l;
        l2.j jVar4 = jVar2 == null ? xVar.f1043m : jVar2;
        if (k0Var2 == null) {
            k0Var2 = xVar.f1044n;
        }
        s sVar2 = xVar.f1045o;
        if (sVar2 == null) {
            sVar2 = sVar;
        }
        if (hVar2 == null) {
            hVar2 = xVar.f1046p;
        }
        return new x(cVar, j14, lVar2, jVar3, kVar2, eVar2, str2, j15, aVar2, pVar2, dVar2, j16, jVar4, k0Var2, sVar2, hVar2);
    }

    public static final Object b(float f10, Object obj, Object obj2) {
        return ((double) f10) < 0.5d ? obj : obj2;
    }

    public static final long c(long j10, long j11, float f10) {
        if (o1.s.V(j10) || o1.s.V(j11)) {
            return ((m2.n) b(f10, new m2.n(j10), new m2.n(j11))).f11821a;
        }
        if (o1.s.V(j10) || o1.s.V(j11)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (m2.o.a(m2.n.b(j10), m2.n.b(j11))) {
            return o1.s.c0(o1.s.W(m2.n.c(j10), m2.n.c(j11), f10), 1095216660480L & j10);
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) m2.o.b(m2.n.b(j10))) + " and " + ((Object) m2.o.b(m2.n.b(j11)))).toString());
    }
}
