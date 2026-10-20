package a2;

import com.google.firebase.remoteconfig.internal.Code;
import e1.k0;
import java.util.ArrayList;
import java.util.List;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final class u extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f974b = new u(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f975c = new u(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f976d = new u(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f977e = new u(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u f978f = new u(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f979n = new u(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f980o = new u(6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u f981p = new u(7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f982q = new u(8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f983r = new u(9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f984s = new u(10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u f985t = new u(11);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final u f986u = new u(12);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f987v = new u(13);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u f988w = new u(14);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final u f989x = new u(15);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final u f990y = new u(16);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final u f991z = new u(17);
    public static final u A = new u(18);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10) {
        super(2);
        this.f992a = i10;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        g gVar;
        int i10 = 0;
        switch (this.f992a) {
            case 0:
                v0.d dVar = (v0.d) obj;
                e eVar = (e) obj2;
                Object[] objArr = new Object[4];
                String str = eVar.f918a;
                v0.p pVar = w.f1012a;
                objArr[0] = str;
                List list = r8.r.f13661a;
                List list2 = eVar.f919b;
                if (list2 == null) {
                    list2 = list;
                }
                v0.p pVar2 = w.f1013b;
                objArr[1] = w.a(list2, pVar2, dVar);
                List list3 = eVar.f920c;
                if (list3 != null) {
                    list = list3;
                }
                objArr[2] = w.a(list, pVar2, dVar);
                objArr[3] = w.a(eVar.f921d, pVar2, dVar);
                return d7.t.D(objArr);
            case 1:
                v0.d dVar2 = (v0.d) obj;
                List list4 = (List) obj2;
                ArrayList arrayList = new ArrayList(list4.size());
                int size = list4.size();
                while (i10 < size) {
                    arrayList.add(w.a((d) list4.get(i10), w.f1014c, dVar2));
                    i10++;
                }
                return arrayList;
            case 2:
                v0.d dVar3 = (v0.d) obj;
                d dVar4 = (d) obj2;
                Object obj3 = dVar4.f914a;
                if (obj3 instanceof p) {
                    gVar = g.f925a;
                } else if (obj3 instanceof x) {
                    gVar = g.f926b;
                } else if (obj3 instanceof f0) {
                    gVar = g.f927c;
                } else {
                    gVar = obj3 instanceof e0 ? g.f928d : g.f929e;
                }
                int iOrdinal = gVar.ordinal();
                Object objA = dVar4.f914a;
                if (iOrdinal == 0) {
                    d7.a.k(objA, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                    objA = w.a((p) objA, w.f1017f, dVar3);
                } else if (iOrdinal == 1) {
                    d7.a.k(objA, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    objA = w.a((x) objA, w.f1018g, dVar3);
                } else if (iOrdinal == 2) {
                    d7.a.k(objA, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    objA = w.a((f0) objA, w.f1015d, dVar3);
                } else if (iOrdinal == 3) {
                    d7.a.k(objA, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    objA = w.a((e0) objA, w.f1016e, dVar3);
                } else {
                    if (iOrdinal != 4) {
                        throw new androidx.fragment.app.a0();
                    }
                    v0.p pVar3 = w.f1012a;
                }
                return d7.t.D(gVar, objA, Integer.valueOf(dVar4.f915b), Integer.valueOf(dVar4.f916c), dVar4.f917d);
            case 3:
                return Float.valueOf(((l2.a) obj2).f11194a);
            case 4:
                return new q8.j(((e1.r) obj2).f5067a);
            case 5:
                return Integer.valueOf(((f2.l) obj2).f6122a);
            case 6:
                v0.d dVar5 = (v0.d) obj;
                List list5 = ((h2.d) obj2).f7539a;
                ArrayList arrayList2 = new ArrayList(list5.size());
                int size2 = list5.size();
                while (i10 < size2) {
                    arrayList2.add(w.a((h2.c) list5.get(i10), w.f1030s, dVar5));
                    i10++;
                }
                return arrayList2;
            case 7:
                return ((h2.a) ((h2.c) obj2).f7538a).f7534a.toLanguageTag();
            case 8:
                long j10 = ((d1.c) obj2).f4330a;
                if (d1.c.b(j10, d1.c.f4328d)) {
                    return Boolean.FALSE;
                }
                Float fValueOf = Float.valueOf(d1.c.d(j10));
                v0.p pVar4 = w.f1012a;
                return d7.t.D(fValueOf, Float.valueOf(d1.c.e(j10)));
            case 9:
                v0.d dVar6 = (v0.d) obj;
                p pVar5 = (p) obj2;
                l2.i iVar = new l2.i(pVar5.f957a);
                v0.p pVar6 = w.f1012a;
                l2.k kVar = new l2.k(pVar5.f958b);
                Object objA2 = w.a(new m2.n(pVar5.f959c), w.f1027p, dVar6);
                l2.q qVar = l2.q.f11222c;
                return d7.t.D(iVar, kVar, objA2, w.a(pVar5.f960d, w.f1021j, dVar6));
            case 10:
                v0.d dVar7 = (v0.d) obj;
                k0 k0Var = (k0) obj2;
                return d7.t.D(w.a(new e1.r(k0Var.f5039a), w.f1026o, dVar7), w.a(new d1.c(k0Var.f5040b), w.f1028q, dVar7), Float.valueOf(k0Var.f5041c));
            case 11:
                v0.d dVar8 = (v0.d) obj;
                x xVar = (x) obj2;
                e1.r rVar = new e1.r(xVar.f1031a.d());
                v0.p pVar7 = w.f1026o;
                Object objA3 = w.a(rVar, pVar7, dVar8);
                m2.n nVar = new m2.n(xVar.f1032b);
                v0.p pVar8 = w.f1027p;
                Object objA4 = w.a(nVar, pVar8, dVar8);
                f2.l lVar = f2.l.f6114b;
                Object objA5 = w.a(xVar.f1033c, w.f1022k, dVar8);
                f2.j jVar = xVar.f1034d;
                f2.k kVar2 = xVar.f1035e;
                String str2 = xVar.f1037g;
                Object objA6 = w.a(new m2.n(xVar.f1038h), pVar8, dVar8);
                Object objA7 = w.a(xVar.f1039i, w.f1023l, dVar8);
                Object objA8 = w.a(xVar.f1040j, w.f1020i, dVar8);
                Object objA9 = w.a(xVar.f1041k, w.f1029r, dVar8);
                Object objA10 = w.a(new e1.r(xVar.f1042l), pVar7, dVar8);
                Object objA11 = w.a(xVar.f1043m, w.f1019h, dVar8);
                k0 k0Var2 = k0.f5038d;
                return d7.t.D(objA3, objA4, objA5, jVar, kVar2, -1, str2, objA6, objA7, objA8, objA9, objA10, objA11, w.a(xVar.f1044n, w.f1025n, dVar8));
            case 12:
                return Integer.valueOf(((l2.j) obj2).f11214a);
            case 13:
                l2.p pVar9 = (l2.p) obj2;
                return d7.t.D(Float.valueOf(pVar9.f11220a), Float.valueOf(pVar9.f11221b));
            case Code.UNAVAILABLE /* 14 */:
                v0.d dVar9 = (v0.d) obj;
                l2.q qVar2 = (l2.q) obj2;
                m2.n nVar2 = new m2.n(qVar2.f11223a);
                v0.p pVar10 = w.f1027p;
                return d7.t.D(w.a(nVar2, pVar10, dVar9), w.a(new m2.n(qVar2.f11224b), pVar10, dVar9));
            case 15:
                long j11 = ((b0) obj2).f905a;
                int i11 = b0.f904c;
                Integer numValueOf = Integer.valueOf((int) (j11 >> 32));
                v0.p pVar11 = w.f1012a;
                return d7.t.D(numValueOf, Integer.valueOf((int) (j11 & 4294967295L)));
            case Code.UNAUTHENTICATED /* 16 */:
                long j12 = ((m2.n) obj2).f11821a;
                Float fValueOf2 = Float.valueOf(m2.n.c(j12));
                v0.p pVar12 = w.f1012a;
                return d7.t.D(fValueOf2, new m2.o(m2.n.b(j12)));
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                String str3 = ((e0) obj2).f922a;
                v0.p pVar13 = w.f1012a;
                return str3;
            default:
                String str4 = ((f0) obj2).f924a;
                v0.p pVar14 = w.f1012a;
                return str4;
        }
    }
}
