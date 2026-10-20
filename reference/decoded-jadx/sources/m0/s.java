package m0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f11693a = new j1("provider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1 f11694b = new j1("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j1 f11695c = new j1("compositionLocalMap");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j1 f11696d = new j1("providers");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j1 f11697e = new j1("reference");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f11698f = new r(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o0 f11699g = new o0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f11700h = 0;

    public static final void a(Object obj, c9.c cVar, m mVar) {
        q qVar = (q) mVar;
        qVar.Z(-1371986847);
        qVar.Z(1157296644);
        boolean zG = qVar.g(obj);
        Object objP = qVar.P();
        if (zG || objP == l.f11578a) {
            qVar.l0(new m0(cVar));
        }
        qVar.t(false);
        qVar.t(false);
    }

    public static final void b(Object obj, c9.e eVar, m mVar) {
        q qVar = (q) mVar;
        qVar.Z(1179185413);
        u8.j jVarG = qVar.f11631b.g();
        qVar.Z(1157296644);
        boolean zG = qVar.g(obj);
        Object objP = qVar.P();
        if (zG || objP == l.f11578a) {
            qVar.l0(new y0(jVarG, eVar));
        }
        qVar.t(false);
        qVar.t(false);
    }

    public static final void c(Object obj, Object obj2, c9.e eVar, m mVar) {
        q qVar = (q) mVar;
        qVar.Z(590241125);
        u8.j jVarG = qVar.f11631b.g();
        qVar.Z(511388516);
        boolean zG = qVar.g(obj) | qVar.g(obj2);
        Object objP = qVar.P();
        if (zG || objP == l.f11578a) {
            qVar.l0(new y0(jVarG, eVar));
        }
        qVar.t(false);
        qVar.t(false);
    }

    public static final void d(c9.a aVar, m mVar) {
        n0.a aVar2 = ((q) mVar).L.f12045b;
        aVar2.getClass();
        n0.z zVar = n0.z.f12099c;
        n0.i0 i0Var = aVar2.f12042a;
        i0Var.h(zVar);
        f6.a.g0(i0Var, 0, aVar);
        int i10 = i0Var.f12081g;
        int i11 = zVar.f12067a;
        int iA = n0.i0.a(i0Var, i11);
        int i12 = zVar.f12068b;
        if (i10 == iA && i0Var.f12082h == n0.i0.a(i0Var, i12)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if (((1 << i14) & i0Var.f12081g) != 0) {
                if (i13 > 0) {
                    sb.append(", ");
                }
                sb.append(zVar.b(i14));
                i13++;
            }
        }
        String string = sb.toString();
        StringBuilder sbN = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            if (((1 << i16) & i0Var.f12082h) != 0) {
                if (i13 > 0) {
                    sbN.append(", ");
                }
                sbN.append(zVar.c(i16));
                i15++;
            }
        }
        String string2 = sbN.toString();
        d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(zVar);
        sb2.append(". Not all arguments were provided. Missing ");
        l.q.t(sb2, i13, " int arguments (", string, ") and ");
        throw new IllegalStateException(l.q.m(sb2, i15, " object arguments (", string2, ").").toString());
    }

    public static final void e(int i10, int i11, ArrayList arrayList) {
        int iJ = j(i10, arrayList);
        if (iJ < 0) {
            iJ = -(iJ + 1);
        }
        while (iJ < arrayList.size() && ((u0) arrayList.get(iJ)).f11710b < i11) {
            arrayList.remove(iJ);
        }
    }

    public static final void f(m2 m2Var, ArrayList arrayList, int i10) {
        int[] iArr = m2Var.f11584b;
        if (d7.t.v(iArr, i10)) {
            arrayList.add(m2Var.i(i10));
            return;
        }
        int iS = d7.t.s(iArr, i10) + i10;
        for (int i11 = i10 + 1; i11 < iS; i11 += iArr[(i11 * 5) + 3]) {
            f(m2Var, arrayList, i11);
        }
    }

    public static final void g(String str) {
        throw new k(l.q.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final r9.e h(m mVar) {
        u8.k kVar = u8.k.f15438a;
        m9.a0 a0Var = m9.a0.f11902b;
        u8.j jVarG = ((q) mVar).f11631b.g();
        return d7.a.b(jVarG.O(new m9.i1((m9.f1) jVarG.f(a0Var))).O(kVar));
    }

    public static final void i(q2 q2Var, w wVar) {
        int i10 = q2Var.f11682r;
        int i11 = q2Var.f11683s;
        while (i10 < i11) {
            Object objX = q2Var.x(i10);
            boolean z10 = objX instanceof j;
            ArrayList arrayList = wVar.f11722c;
            if (z10) {
                arrayList.add((j) objX);
            }
            int iG = q2Var.G(q2Var.f11666b, q2Var.o(i10));
            int i12 = i10 + 1;
            int iF = q2Var.f(q2Var.f11666b, q2Var.o(i12));
            for (int i13 = iG; i13 < iF; i13++) {
                int i14 = i13 - iG;
                Object obj = q2Var.f11667c[q2Var.g(i13)];
                boolean z11 = obj instanceof j2;
                k0.y0 y0Var = l.f11578a;
                if (z11) {
                    i2 i2Var = ((j2) obj).f11574a;
                    if (i2Var instanceof n) {
                        continue;
                    } else {
                        if (obj != q2Var.D(y0Var, i10, i14)) {
                            g("Slot table is out of sync".toString());
                            throw null;
                        }
                        arrayList.add(i2Var);
                    }
                } else if (!(obj instanceof x1)) {
                    continue;
                } else {
                    if (obj != q2Var.D(y0Var, i10, i14)) {
                        g("Slot table is out of sync".toString());
                        throw null;
                    }
                    x1 x1Var = (x1) obj;
                    y1 y1Var = x1Var.f11754b;
                    if (y1Var != null) {
                        y1Var.b();
                    }
                    x1Var.f11754b = null;
                    x1Var.f11758f = null;
                    x1Var.f11759g = null;
                }
            }
            i10 = i12;
        }
    }

    public static final int j(int i10, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iO = d7.a.o(((u0) arrayList.get(i12)).f11710b, i10);
            if (iO < 0) {
                i11 = i12 + 1;
            } else {
                if (iO <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void k(q2 q2Var, w wVar) {
        int iF = q2Var.f(q2Var.f11666b, q2Var.o(q2Var.f11682r));
        int[] iArr = q2Var.f11666b;
        int i10 = q2Var.f11682r;
        p2 p2Var = new p2(iF, q2Var.f(iArr, q2Var.o(q2Var.p(i10) + i10)), q2Var);
        while (p2Var.hasNext()) {
            Object next = p2Var.next();
            boolean z10 = next instanceof j;
            ArrayList arrayList = wVar.f11722c;
            if (z10) {
                j jVar = (j) next;
                q.t tVar = wVar.f11724e;
                if (tVar == null) {
                    int i11 = q.y.f13042a;
                    tVar = new q.t();
                    wVar.f11724e = tVar;
                }
                tVar.f13039b[tVar.e(jVar)] = jVar;
                arrayList.add(jVar);
            }
            if (next instanceof j2) {
                arrayList.add(((j2) next).f11574a);
            }
            if (next instanceof x1) {
                x1 x1Var = (x1) next;
                y1 y1Var = x1Var.f11754b;
                if (y1Var != null) {
                    y1Var.b();
                }
                x1Var.f11754b = null;
                x1Var.f11758f = null;
                x1Var.f11759g = null;
            }
        }
        q2Var.A();
    }

    public static final void l(boolean z10) {
        if (z10) {
            return;
        }
        g("Check failed".toString());
        throw null;
    }

    public static final int m(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }
}
