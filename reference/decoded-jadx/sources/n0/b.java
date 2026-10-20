package n0;

import java.util.ArrayList;
import m0.b1;
import m0.c1;
import m0.k3;
import m0.t0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0.q f12044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f12045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12046c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12050g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12055l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0 f12047d = new t0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12048e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k3 f12051h = new k3();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12052i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12053j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12054k = -1;

    public b(m0.q qVar, a aVar) {
        this.f12044a = qVar;
        this.f12045b = aVar;
    }

    public final void a(ArrayList arrayList, u0.c cVar) {
        a aVar = this.f12045b;
        aVar.getClass();
        if (!arrayList.isEmpty()) {
            f fVar = f.f12064c;
            i0 i0Var = aVar.f12042a;
            i0Var.h(fVar);
            f6.a.g0(i0Var, 1, arrayList);
            f6.a.g0(i0Var, 0, cVar);
            int i10 = i0Var.f12081g;
            int i11 = fVar.f12067a;
            int iA = i0.a(i0Var, i11);
            int i12 = fVar.f12068b;
            if (i10 == iA && i0Var.f12082h == i0.a(i0Var, i12)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                if (((1 << i14) & i0Var.f12081g) != 0) {
                    if (i13 > 0) {
                        sb.append(", ");
                    }
                    sb.append(fVar.b(i14));
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
                    sbN.append(fVar.c(i16));
                    i15++;
                }
            }
            String string2 = sbN.toString();
            d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(fVar);
            sb2.append(". Not all arguments were provided. Missing ");
            l.q.t(sb2, i13, " int arguments (", string, ") and ");
            throw new IllegalStateException(l.q.m(sb2, i15, " object arguments (", string2, ").").toString());
        }
    }

    public final void b(b1 b1Var, m0.u uVar, c1 c1Var, c1 c1Var2) {
        a aVar = this.f12045b;
        aVar.getClass();
        g gVar = g.f12066c;
        i0 i0Var = aVar.f12042a;
        i0Var.h(gVar);
        f6.a.g0(i0Var, 0, b1Var);
        f6.a.g0(i0Var, 1, uVar);
        f6.a.g0(i0Var, 3, c1Var2);
        f6.a.g0(i0Var, 2, c1Var);
        int i10 = i0Var.f12081g;
        int i11 = gVar.f12067a;
        int iA = i0.a(i0Var, i11);
        int i12 = gVar.f12068b;
        if (i10 == iA && i0Var.f12082h == i0.a(i0Var, i12)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if (((1 << i14) & i0Var.f12081g) != 0) {
                if (i13 > 0) {
                    sb.append(", ");
                }
                sb.append(gVar.b(i14));
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
                sbN.append(gVar.c(i16));
                i15++;
            }
        }
        String string2 = sbN.toString();
        d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(gVar);
        sb2.append(". Not all arguments were provided. Missing ");
        l.q.t(sb2, i13, " int arguments (", string, ") and ");
        throw new IllegalStateException(l.q.m(sb2, i15, " object arguments (", string2, ").").toString());
    }

    public final void c(u0.c cVar, m0.c cVar2) {
        f();
        a aVar = this.f12045b;
        aVar.getClass();
        i iVar = i.f12074c;
        i0 i0Var = aVar.f12042a;
        i0Var.h(iVar);
        f6.a.g0(i0Var, 0, cVar);
        f6.a.g0(i0Var, 1, cVar2);
        int i10 = i0Var.f12081g;
        int i11 = iVar.f12067a;
        int iA = i0.a(i0Var, i11);
        int i12 = iVar.f12068b;
        if (i10 == iA && i0Var.f12082h == i0.a(i0Var, i12)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if (((1 << i14) & i0Var.f12081g) != 0) {
                if (i13 > 0) {
                    sb.append(", ");
                }
                sb.append(iVar.b(i14));
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
                sbN.append(iVar.c(i16));
                i15++;
            }
        }
        String string2 = sbN.toString();
        d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(iVar);
        sb2.append(". Not all arguments were provided. Missing ");
        l.q.t(sb2, i13, " int arguments (", string, ") and ");
        throw new IllegalStateException(l.q.m(sb2, i15, " object arguments (", string2, ").").toString());
    }

    public final void d(a aVar, u0.c cVar) {
        a aVar2 = this.f12045b;
        aVar2.getClass();
        if (aVar.f12042a.e()) {
            e eVar = e.f12062c;
            i0 i0Var = aVar2.f12042a;
            i0Var.h(eVar);
            f6.a.g0(i0Var, 0, aVar);
            f6.a.g0(i0Var, 1, cVar);
            int i10 = i0Var.f12081g;
            int i11 = eVar.f12067a;
            int iA = i0.a(i0Var, i11);
            int i12 = eVar.f12068b;
            if (i10 == iA && i0Var.f12082h == i0.a(i0Var, i12)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                if (((1 << i14) & i0Var.f12081g) != 0) {
                    if (i13 > 0) {
                        sb.append(", ");
                    }
                    sb.append(eVar.b(i14));
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
                    sbN.append(eVar.c(i16));
                    i15++;
                }
            }
            String string2 = sbN.toString();
            d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(eVar);
            sb2.append(". Not all arguments were provided. Missing ");
            l.q.t(sb2, i13, " int arguments (", string, ") and ");
            throw new IllegalStateException(l.q.m(sb2, i15, " object arguments (", string2, ").").toString());
        }
    }

    public final void e() {
        k3 k3Var = this.f12051h;
        if (!(!k3Var.f11577a.isEmpty())) {
            this.f12050g++;
        } else {
            ArrayList arrayList = k3Var.f11577a;
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void f() {
        b bVar = this;
        int i10 = bVar.f12050g;
        int i11 = 0;
        if (i10 > 0) {
            a aVar = bVar.f12045b;
            aVar.getClass();
            e0 e0Var = e0.f12063c;
            i0 i0Var = aVar.f12042a;
            i0Var.h(e0Var);
            f6.a.f0(i0Var, 0, i10);
            int i12 = i0Var.f12081g;
            int i13 = e0Var.f12067a;
            int iA = i0.a(i0Var, i13);
            int i14 = e0Var.f12068b;
            if (i12 != iA || i0Var.f12082h != i0.a(i0Var, i14)) {
                StringBuilder sb = new StringBuilder();
                int i15 = 0;
                while (i15 < i13) {
                    int i16 = i13;
                    if (((1 << i15) & i0Var.f12081g) != 0) {
                        if (i11 > 0) {
                            sb.append(", ");
                        }
                        sb.append(e0Var.b(i15));
                        i11++;
                    }
                    i15++;
                    i13 = i16;
                }
                String string = sb.toString();
                StringBuilder sbN = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
                int i17 = 0;
                int i18 = 0;
                while (i18 < i14) {
                    int i19 = i14;
                    if (((1 << i18) & i0Var.f12082h) != 0) {
                        if (i11 > 0) {
                            sbN.append(", ");
                        }
                        sbN.append(e0Var.c(i18));
                        i17++;
                    }
                    i18++;
                    i14 = i19;
                }
                String string2 = sbN.toString();
                d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb2 = new StringBuilder("Error while pushing ");
                sb2.append(e0Var);
                sb2.append(". Not all arguments were provided. Missing ");
                l.q.t(sb2, i11, " int arguments (", string, ") and ");
                throw new IllegalStateException(l.q.m(sb2, i17, " object arguments (", string2, ").").toString());
            }
            bVar.f12050g = 0;
        } else {
            bVar = this;
        }
        k3 k3Var = bVar.f12051h;
        if (!k3Var.f11577a.isEmpty()) {
            a aVar2 = bVar.f12045b;
            ArrayList arrayList = k3Var.f11577a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i20 = 0; i20 < size; i20++) {
                objArr[i20] = arrayList.get(i20);
            }
            aVar2.getClass();
            if (!(size == 0)) {
                j jVar = j.f12083c;
                i0 i0Var2 = aVar2.f12042a;
                i0Var2.h(jVar);
                f6.a.g0(i0Var2, 0, objArr);
                int i21 = i0Var2.f12081g;
                int i22 = jVar.f12067a;
                int iA2 = i0.a(i0Var2, i22);
                int i23 = jVar.f12068b;
                if (i21 != iA2 || i0Var2.f12082h != i0.a(i0Var2, i23)) {
                    StringBuilder sb3 = new StringBuilder();
                    int i24 = 0;
                    for (int i25 = 0; i25 < i22; i25++) {
                        if (((1 << i25) & i0Var2.f12081g) != 0) {
                            if (i24 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(jVar.b(i25));
                            i24++;
                        }
                    }
                    String string3 = sb3.toString();
                    StringBuilder sbN2 = l.q.n(string3, "StringBuilder().apply(builderAction).toString()");
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < i23) {
                        int i28 = i23;
                        if (((1 << i26) & i0Var2.f12082h) != 0) {
                            if (i24 > 0) {
                                sbN2.append(", ");
                            }
                            sbN2.append(jVar.c(i26));
                            i27++;
                        }
                        i26++;
                        i23 = i28;
                    }
                    String string4 = sbN2.toString();
                    d7.a.l(string4, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(jVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    l.q.t(sb4, i24, " int arguments (", string3, ") and ");
                    throw new IllegalStateException(l.q.m(sb4, i27, " object arguments (", string4, ").").toString());
                }
            }
            arrayList.clear();
        }
    }

    public final void g() {
        int i10 = this.f12055l;
        if (i10 > 0) {
            int i11 = this.f12052i;
            if (i11 >= 0) {
                f();
                a aVar = this.f12045b;
                aVar.getClass();
                x xVar = x.f12097c;
                i0 i0Var = aVar.f12042a;
                i0Var.h(xVar);
                f6.a.f0(i0Var, 0, i11);
                f6.a.f0(i0Var, 1, i10);
                int i12 = i0Var.f12081g;
                int i13 = xVar.f12067a;
                int iA = i0.a(i0Var, i13);
                int i14 = xVar.f12068b;
                if (i12 != iA || i0Var.f12082h != i0.a(i0Var, i14)) {
                    StringBuilder sb = new StringBuilder();
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i13) {
                        int i17 = i13;
                        if (((1 << i15) & i0Var.f12081g) != 0) {
                            if (i16 > 0) {
                                sb.append(", ");
                            }
                            sb.append(xVar.b(i15));
                            i16++;
                        }
                        i15++;
                        i13 = i17;
                    }
                    String string = sb.toString();
                    StringBuilder sbN = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
                    int i18 = 0;
                    int i19 = 0;
                    while (i19 < i14) {
                        int i20 = i14;
                        if (((1 << i19) & i0Var.f12082h) != 0) {
                            if (i16 > 0) {
                                sbN.append(", ");
                            }
                            sbN.append(xVar.c(i19));
                            i18++;
                        }
                        i19++;
                        i14 = i20;
                    }
                    String string2 = sbN.toString();
                    d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb2 = new StringBuilder("Error while pushing ");
                    sb2.append(xVar);
                    sb2.append(". Not all arguments were provided. Missing ");
                    l.q.t(sb2, i16, " int arguments (", string, ") and ");
                    throw new IllegalStateException(l.q.m(sb2, i18, " object arguments (", string2, ").").toString());
                }
                this.f12052i = -1;
            } else {
                int i21 = this.f12054k;
                int i22 = this.f12053j;
                f();
                a aVar2 = this.f12045b;
                aVar2.getClass();
                t tVar = t.f12093c;
                i0 i0Var2 = aVar2.f12042a;
                i0Var2.h(tVar);
                f6.a.f0(i0Var2, 1, i21);
                f6.a.f0(i0Var2, 0, i22);
                f6.a.f0(i0Var2, 2, i10);
                int i23 = i0Var2.f12081g;
                int i24 = tVar.f12067a;
                int iA2 = i0.a(i0Var2, i24);
                int i25 = tVar.f12068b;
                if (i23 != iA2 || i0Var2.f12082h != i0.a(i0Var2, i25)) {
                    int i26 = 0;
                    StringBuilder sb3 = new StringBuilder();
                    for (int i27 = 0; i27 < i24; i27++) {
                        if (((1 << i27) & i0Var2.f12081g) != 0) {
                            if (i26 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(tVar.b(i27));
                            i26++;
                        }
                    }
                    String string3 = sb3.toString();
                    StringBuilder sbN2 = l.q.n(string3, "StringBuilder().apply(builderAction).toString()");
                    int i28 = 0;
                    int i29 = 0;
                    while (i29 < i25) {
                        int i30 = i25;
                        if (((1 << i29) & i0Var2.f12082h) != 0) {
                            if (i26 > 0) {
                                sbN2.append(", ");
                            }
                            sbN2.append(tVar.c(i29));
                            i28++;
                        }
                        i29++;
                        i25 = i30;
                    }
                    String string4 = sbN2.toString();
                    d7.a.l(string4, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(tVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    l.q.t(sb4, i26, " int arguments (", string3, ") and ");
                    throw new IllegalStateException(l.q.m(sb4, i28, " object arguments (", string4, ").").toString());
                }
                this.f12053j = -1;
                this.f12054k = -1;
            }
            this.f12055l = 0;
        }
    }

    public final void h(boolean z10) {
        m0.q qVar = this.f12044a;
        int i10 = z10 ? qVar.F.f11591i : qVar.F.f11589g;
        int i11 = i10 - this.f12049f;
        if (i11 < 0) {
            m0.s.g("Tried to seek backward".toString());
            throw null;
        }
        if (i11 > 0) {
            a aVar = this.f12045b;
            aVar.getClass();
            d dVar = d.f12060c;
            i0 i0Var = aVar.f12042a;
            i0Var.h(dVar);
            f6.a.f0(i0Var, 0, i11);
            int i12 = i0Var.f12081g;
            int i13 = dVar.f12067a;
            int iA = i0.a(i0Var, i13);
            int i14 = dVar.f12068b;
            if (i12 == iA && i0Var.f12082h == i0.a(i0Var, i14)) {
                this.f12049f = i10;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                if (((1 << i16) & i0Var.f12081g) != 0) {
                    if (i15 > 0) {
                        sb.append(", ");
                    }
                    sb.append(dVar.b(i16));
                    i15++;
                }
            }
            String string = sb.toString();
            StringBuilder sbN = l.q.n(string, "StringBuilder().apply(builderAction).toString()");
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                if (((1 << i18) & i0Var.f12082h) != 0) {
                    if (i15 > 0) {
                        sbN.append(", ");
                    }
                    sbN.append(dVar.c(i18));
                    i17++;
                }
            }
            String string2 = sbN.toString();
            d7.a.l(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(dVar);
            sb2.append(". Not all arguments were provided. Missing ");
            l.q.t(sb2, i15, " int arguments (", string, ") and ");
            throw new IllegalStateException(l.q.m(sb2, i17, " object arguments (", string2, ").").toString());
        }
    }

    public final void i(int i10, int i11) {
        if (i11 > 0) {
            if (i10 < 0) {
                m0.s.g(("Invalid remove index " + i10).toString());
                throw null;
            }
            if (this.f12052i == i10) {
                this.f12055l += i11;
                return;
            }
            g();
            this.f12052i = i10;
            this.f12055l = i11;
        }
    }
}
