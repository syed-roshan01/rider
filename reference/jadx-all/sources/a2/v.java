package a2;

import com.google.firebase.remoteconfig.internal.Code;
import e1.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final class v extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f993b = new v(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f994c = new v(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f995d = new v(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f996e = new v(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f997f = new v(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v f998n = new v(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v f999o = new v(6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v f1000p = new v(7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final v f1001q = new v(8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v f1002r = new v(9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v f1003s = new v(10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v f1004t = new v(11);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v f1005u = new v(12);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final v f1006v = new v(13);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final v f1007w = new v(14);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final v f1008x = new v(15);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final v f1009y = new v(16);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final v f1010z = new v(17);
    public static final v A = new v(18);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i10) {
        super(1);
        this.f1011a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        List list;
        List list2;
        int i10 = 0;
        switch (this.f1011a) {
            case 0:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj2 = list3.get(1);
                v0.p pVar = w.f1013b;
                Boolean bool = Boolean.FALSE;
                List list4 = (d7.a.d(obj2, bool) || obj2 == null) ? null : (List) pVar.f15880b.invoke(obj2);
                Object obj3 = list3.get(2);
                List list5 = (d7.a.d(obj3, bool) || obj3 == null) ? null : (List) pVar.f15880b.invoke(obj3);
                Object obj4 = list3.get(0);
                String str = obj4 != null ? (String) obj4 : null;
                d7.a.j(str);
                if (list4 != null) {
                    List list6 = list4;
                    if (list6.isEmpty()) {
                        list6 = null;
                    }
                    list = list6;
                } else {
                    list = null;
                }
                if (list5 != null) {
                    List list7 = list5;
                    if (list7.isEmpty()) {
                        list7 = null;
                    }
                    list2 = list7;
                } else {
                    list2 = null;
                }
                Object obj5 = list3.get(3);
                return new e(str, list, list2, (d7.a.d(obj5, bool) || obj5 == null) ? null : (List) pVar.f15880b.invoke(obj5));
            case 1:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                ArrayList arrayList = new ArrayList(list8.size());
                int size = list8.size();
                while (i10 < size) {
                    Object obj6 = list8.get(i10);
                    d dVar = (d7.a.d(obj6, Boolean.FALSE) || obj6 == null) ? null : (d) w.f1014c.f15880b.invoke(obj6);
                    d7.a.j(dVar);
                    arrayList.add(dVar);
                    i10++;
                }
                return arrayList;
            case 2:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                Object obj7 = list9.get(0);
                g gVar = obj7 != null ? (g) obj7 : null;
                d7.a.j(gVar);
                Object obj8 = list9.get(2);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                d7.a.j(num);
                int iIntValue = num.intValue();
                Object obj9 = list9.get(3);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                d7.a.j(num2);
                int iIntValue2 = num2.intValue();
                Object obj10 = list9.get(4);
                String str2 = obj10 != null ? (String) obj10 : null;
                d7.a.j(str2);
                int iOrdinal = gVar.ordinal();
                if (iOrdinal == 0) {
                    Object obj11 = list9.get(1);
                    p pVar2 = (d7.a.d(obj11, Boolean.FALSE) || obj11 == null) ? null : (p) w.f1017f.f15880b.invoke(obj11);
                    d7.a.j(pVar2);
                    return new d(pVar2, iIntValue, iIntValue2, str2);
                }
                if (iOrdinal == 1) {
                    Object obj12 = list9.get(1);
                    x xVar = (d7.a.d(obj12, Boolean.FALSE) || obj12 == null) ? null : (x) w.f1018g.f15880b.invoke(obj12);
                    d7.a.j(xVar);
                    return new d(xVar, iIntValue, iIntValue2, str2);
                }
                if (iOrdinal == 2) {
                    Object obj13 = list9.get(1);
                    f0 f0Var = (d7.a.d(obj13, Boolean.FALSE) || obj13 == null) ? null : (f0) w.f1015d.f15880b.invoke(obj13);
                    d7.a.j(f0Var);
                    return new d(f0Var, iIntValue, iIntValue2, str2);
                }
                if (iOrdinal == 3) {
                    Object obj14 = list9.get(1);
                    e0 e0Var = (d7.a.d(obj14, Boolean.FALSE) || obj14 == null) ? null : (e0) w.f1016e.f15880b.invoke(obj14);
                    d7.a.j(e0Var);
                    return new d(e0Var, iIntValue, iIntValue2, str2);
                }
                if (iOrdinal != 4) {
                    throw new androidx.fragment.app.a0();
                }
                Object obj15 = list9.get(1);
                String str3 = obj15 != null ? (String) obj15 : null;
                d7.a.j(str3);
                return new d(str3, iIntValue, iIntValue2, str2);
            case 3:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.Float");
                return new l2.a(((Float) obj).floatValue());
            case 4:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.ULong");
                return new e1.r(((q8.j) obj).f13233a);
            case 5:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.Int");
                return new f2.l(((Integer) obj).intValue());
            case 6:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list10 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list10.size());
                int size2 = list10.size();
                while (i10 < size2) {
                    Object obj16 = list10.get(i10);
                    h2.c cVar = (d7.a.d(obj16, Boolean.FALSE) || obj16 == null) ? null : (h2.c) w.f1030s.f15880b.invoke(obj16);
                    d7.a.j(cVar);
                    arrayList2.add(cVar);
                    i10++;
                }
                return new h2.d(arrayList2);
            case 7:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.String");
                h2.f.f7541a.getClass();
                return new h2.c(new h2.a(Locale.forLanguageTag((String) obj)));
            case 8:
                if (d7.a.d(obj, Boolean.FALSE)) {
                    return new d1.c(d1.c.f4328d);
                }
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj17 = list11.get(0);
                Float f10 = obj17 != null ? (Float) obj17 : null;
                d7.a.j(f10);
                float fFloatValue = f10.floatValue();
                Object obj18 = list11.get(1);
                Float f11 = obj18 != null ? (Float) obj18 : null;
                d7.a.j(f11);
                return new d1.c(d9.i.f(fFloatValue, f11.floatValue()));
            case 9:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list12 = (List) obj;
                Object obj19 = list12.get(0);
                l2.i iVar = obj19 != null ? (l2.i) obj19 : null;
                d7.a.j(iVar);
                int i11 = iVar.f11210a;
                Object obj20 = list12.get(1);
                l2.k kVar = obj20 != null ? (l2.k) obj20 : null;
                d7.a.j(kVar);
                int i12 = kVar.f11215a;
                Object obj21 = list12.get(2);
                m2.o[] oVarArr = m2.n.f11819b;
                v0.p pVar3 = w.f1027p;
                Boolean bool2 = Boolean.FALSE;
                m2.n nVar = (d7.a.d(obj21, bool2) || obj21 == null) ? null : (m2.n) pVar3.f15880b.invoke(obj21);
                d7.a.j(nVar);
                long j10 = nVar.f11821a;
                Object obj22 = list12.get(3);
                l2.q qVar = l2.q.f11222c;
                return new p(i11, i12, j10, (d7.a.d(obj22, bool2) || obj22 == null) ? null : (l2.q) w.f1021j.f15880b.invoke(obj22), null, null, 0, Integer.MIN_VALUE, null);
            case 10:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                int i13 = e1.r.f5066h;
                v0.p pVar4 = w.f1026o;
                Boolean bool3 = Boolean.FALSE;
                e1.r rVar = (d7.a.d(obj23, bool3) || obj23 == null) ? null : (e1.r) pVar4.f15880b.invoke(obj23);
                d7.a.j(rVar);
                long j11 = rVar.f5067a;
                Object obj24 = list13.get(1);
                int i14 = d1.c.f4329e;
                d1.c cVar2 = (d7.a.d(obj24, bool3) || obj24 == null) ? null : (d1.c) w.f1028q.f15880b.invoke(obj24);
                d7.a.j(cVar2);
                long j12 = cVar2.f4330a;
                Object obj25 = list13.get(2);
                Float f12 = obj25 != null ? (Float) obj25 : null;
                d7.a.j(f12);
                return new k0(j11, j12, f12.floatValue());
            case 11:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                int i15 = e1.r.f5066h;
                v0.p pVar5 = w.f1026o;
                Boolean bool4 = Boolean.FALSE;
                e1.r rVar2 = (d7.a.d(obj26, bool4) || obj26 == null) ? null : (e1.r) pVar5.f15880b.invoke(obj26);
                d7.a.j(rVar2);
                long j13 = rVar2.f5067a;
                Object obj27 = list14.get(1);
                m2.o[] oVarArr2 = m2.n.f11819b;
                v0.p pVar6 = w.f1027p;
                m2.n nVar2 = (d7.a.d(obj27, bool4) || obj27 == null) ? null : (m2.n) pVar6.f15880b.invoke(obj27);
                d7.a.j(nVar2);
                long j14 = nVar2.f11821a;
                Object obj28 = list14.get(2);
                f2.l lVar = f2.l.f6114b;
                f2.l lVar2 = (d7.a.d(obj28, bool4) || obj28 == null) ? null : (f2.l) w.f1022k.f15880b.invoke(obj28);
                Object obj29 = list14.get(3);
                f2.j jVar = obj29 != null ? (f2.j) obj29 : null;
                Object obj30 = list14.get(4);
                f2.k kVar2 = obj30 != null ? (f2.k) obj30 : null;
                Object obj31 = list14.get(6);
                String str4 = obj31 != null ? (String) obj31 : null;
                Object obj32 = list14.get(7);
                m2.n nVar3 = (d7.a.d(obj32, bool4) || obj32 == null) ? null : (m2.n) pVar6.f15880b.invoke(obj32);
                d7.a.j(nVar3);
                long j15 = nVar3.f11821a;
                Object obj33 = list14.get(8);
                l2.a aVar = (d7.a.d(obj33, bool4) || obj33 == null) ? null : (l2.a) w.f1023l.f15880b.invoke(obj33);
                Object obj34 = list14.get(9);
                l2.p pVar7 = (d7.a.d(obj34, bool4) || obj34 == null) ? null : (l2.p) w.f1020i.f15880b.invoke(obj34);
                Object obj35 = list14.get(10);
                h2.d dVar2 = (d7.a.d(obj35, bool4) || obj35 == null) ? null : (h2.d) w.f1029r.f15880b.invoke(obj35);
                Object obj36 = list14.get(11);
                e1.r rVar3 = (d7.a.d(obj36, bool4) || obj36 == null) ? null : (e1.r) pVar5.f15880b.invoke(obj36);
                d7.a.j(rVar3);
                long j16 = rVar3.f5067a;
                Object obj37 = list14.get(12);
                l2.j jVar2 = (d7.a.d(obj37, bool4) || obj37 == null) ? null : (l2.j) w.f1019h.f15880b.invoke(obj37);
                Object obj38 = list14.get(13);
                k0 k0Var = k0.f5038d;
                return new x(j13, j14, lVar2, jVar, kVar2, null, str4, j15, aVar, pVar7, dVar2, j16, jVar2, (d7.a.d(obj38, bool4) || obj38 == null) ? null : (k0) w.f1025n.f15880b.invoke(obj38), 49184);
            case 12:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.Int");
                return new l2.j(((Integer) obj).intValue());
            case 13:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list15 = (List) obj;
                return new l2.p(((Number) list15.get(0)).floatValue(), ((Number) list15.get(1)).floatValue());
            case Code.UNAVAILABLE /* 14 */:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list16 = (List) obj;
                Object obj39 = list16.get(0);
                m2.o[] oVarArr3 = m2.n.f11819b;
                v0.p pVar8 = w.f1027p;
                Boolean bool5 = Boolean.FALSE;
                m2.n nVar4 = (d7.a.d(obj39, bool5) || obj39 == null) ? null : (m2.n) pVar8.f15880b.invoke(obj39);
                d7.a.j(nVar4);
                Object obj40 = list16.get(1);
                m2.n nVar5 = (d7.a.d(obj40, bool5) || obj40 == null) ? null : (m2.n) pVar8.f15880b.invoke(obj40);
                d7.a.j(nVar5);
                return new l2.q(nVar4.f11821a, nVar5.f11821a);
            case 15:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list17 = (List) obj;
                Object obj41 = list17.get(0);
                Integer num3 = obj41 != null ? (Integer) obj41 : null;
                d7.a.j(num3);
                int iIntValue3 = num3.intValue();
                Object obj42 = list17.get(1);
                Integer num4 = obj42 != null ? (Integer) obj42 : null;
                d7.a.j(num4);
                return new b0(o1.s.g(iIntValue3, num4.intValue()));
            case Code.UNAUTHENTICATED /* 16 */:
                d7.a.k(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj43 = list18.get(0);
                Float f13 = obj43 != null ? (Float) obj43 : null;
                d7.a.j(f13);
                float fFloatValue2 = f13.floatValue();
                Object obj44 = list18.get(1);
                m2.o oVar = obj44 != null ? (m2.o) obj44 : null;
                d7.a.j(oVar);
                return new m2.n(o1.s.c0(fFloatValue2, oVar.f11822a));
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                String str5 = obj != null ? (String) obj : null;
                d7.a.j(str5);
                return new e0(str5);
            default:
                String str6 = obj != null ? (String) obj : null;
                d7.a.j(str6);
                return new f0(str6);
        }
    }
}
