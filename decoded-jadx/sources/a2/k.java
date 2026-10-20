package a2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8.c f944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q8.c f945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f946e;

    public k(e eVar, c0 c0Var, List list, m2.b bVar, f2.d dVar) {
        p pVar;
        String strSubstring;
        int i10;
        int i11;
        e eVar2 = eVar;
        this.f942a = eVar2;
        this.f943b = list;
        q8.d[] dVarArr = q8.d.f13224a;
        this.f944c = z6.a.R(new j(this, 1));
        this.f945d = z6.a.R(new j(this, 0));
        e eVar3 = f.f923a;
        int length = eVar2.f918a.length();
        r8.r rVar = r8.r.f13661a;
        List list2 = eVar2.f920c;
        list2 = list2 == null ? rVar : list2;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            pVar = c0Var.f912b;
            if (i12 >= size) {
                break;
            }
            d dVar2 = (d) list2.get(i12);
            p pVar2 = (p) dVar2.f914a;
            int i14 = dVar2.f915b;
            if (i14 != i13) {
                arrayList.add(new d(pVar, i13, i14));
            }
            p pVarA = pVar.a(pVar2);
            int i15 = dVar2.f916c;
            arrayList.add(new d(pVarA, i14, i15));
            i12++;
            i13 = i15;
        }
        if (i13 != length) {
            arrayList.add(new d(pVar, i13, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new d(pVar, 0, 0));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i16 = 0;
        while (i16 < size2) {
            d dVar3 = (d) arrayList.get(i16);
            int i17 = dVar3.f915b;
            int i18 = dVar3.f916c;
            if (i17 != i18) {
                strSubstring = eVar2.f918a.substring(i17, i18);
                d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            } else {
                strSubstring = "";
            }
            String str = strSubstring;
            List listB = f.b(eVar2, i17, i18);
            p pVar3 = (p) dVar3.f914a;
            if (l2.k.a(pVar3.f958b, Integer.MIN_VALUE)) {
                pVar3 = new p(pVar3.f957a, pVar.f958b, pVar3.f959c, pVar3.f960d, pVar3.f961e, pVar3.f962f, pVar3.f963g, pVar3.f964h, pVar3.f965i);
            }
            c0 c0Var2 = new c0(c0Var.f911a, pVar.a(pVar3));
            List list3 = listB == null ? rVar : listB;
            List list4 = this.f943b;
            ArrayList arrayList3 = new ArrayList(list4.size());
            int size3 = list4.size();
            int i19 = 0;
            while (true) {
                i10 = dVar3.f915b;
                if (i19 >= size3) {
                    break;
                }
                Object obj = list4.get(i19);
                d dVar4 = (d) obj;
                if (f.c(i10, i18, dVar4.f915b, dVar4.f916c)) {
                    arrayList3.add(obj);
                }
                i19++;
            }
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size4 = arrayList3.size();
            for (int i20 = 0; i20 < size4; i20++) {
                d dVar5 = (d) arrayList3.get(i20);
                int i21 = dVar5.f915b;
                if (i10 > i21 || (i11 = dVar5.f916c) > i18) {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
                arrayList4.add(new d(dVar5.f914a, i21 - i10, i11 - i10));
            }
            n nVar = new n(new i2.d(c0Var2, dVar, bVar, str, list3, arrayList4), i10, i18);
            arrayList2 = arrayList2;
            arrayList2.add(nVar);
            i16++;
            eVar2 = eVar;
            rVar = rVar;
            size2 = size2;
            arrayList = arrayList;
        }
        this.f946e = arrayList2;
    }

    @Override // a2.o
    public final float a() {
        return ((Number) this.f944c.getValue()).floatValue();
    }

    @Override // a2.o
    public final boolean b() {
        ArrayList arrayList = this.f946e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) arrayList.get(i10)).f954a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // a2.o
    public final float c() {
        return ((Number) this.f945d.getValue()).floatValue();
    }
}
