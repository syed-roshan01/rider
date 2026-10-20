package z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import r1.x0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0.u f17078b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17077a = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f17079c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17080d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f17081e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f17082f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f17083g = new ArrayList();

    public final void a(int i10, int i11, int i12, ArrayList arrayList, s sVar, boolean z10, boolean z11, boolean z12) {
        int i13;
        int i14;
        a0.u uVar = this.f17078b;
        a0.u uVar2 = sVar.f17123a.f17094d;
        this.f17078b = uVar2;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            x xVar = (x) arrayList.get(i15);
            int size2 = xVar.f17162b.size();
            for (int i16 = 0; i16 < size2; i16++) {
                ((x0) xVar.f17162b.get(i16)).a();
            }
        }
        LinkedHashMap linkedHashMap = this.f17077a;
        if (linkedHashMap.isEmpty()) {
            linkedHashMap.clear();
            this.f17078b = a0.d.f780b;
            return;
        }
        x xVar2 = (x) r8.p.H0(arrayList);
        if (xVar2 != null) {
            int i17 = xVar2.f17161a;
        }
        int i18 = z10 ? i12 : i11;
        if (z10) {
            i1.b.c(0, i10);
        } else {
            i1.b.c(i10, 0);
        }
        boolean z13 = z11 || !z12;
        LinkedHashSet linkedHashSet = this.f17079c;
        linkedHashSet.addAll(linkedHashMap.keySet());
        int size3 = arrayList.size();
        int i19 = 0;
        while (i19 < size3) {
            x xVar3 = (x) arrayList.get(i19);
            linkedHashSet.remove(xVar3.f17170j);
            List list = xVar3.f17162b;
            int size4 = list.size();
            int i20 = size3;
            for (int i21 = 0; i21 < size4; i21++) {
                ((x0) list.get(i21)).a();
            }
            linkedHashMap.remove(xVar3.f17170j);
            i19++;
            size3 = i20;
        }
        ArrayList arrayList2 = this.f17081e;
        ArrayList arrayList3 = this.f17080d;
        if (z13 && uVar != null) {
            if (arrayList3.size() > 1) {
                r8.m.z0(arrayList3, new i(uVar, 2));
            }
            if (arrayList3.size() > 0) {
                x xVar4 = (x) arrayList3.get(0);
                int i22 = 0 - xVar4.f17175o;
                h hVar = (h) r8.v.B0(xVar4.f17170j, linkedHashMap);
                long jA = xVar4.a(0);
                if (xVar4.f17163c) {
                    int i23 = m2.i.f11808c;
                    i1.b.c((int) (jA >> 32), i22);
                } else {
                    int i24 = m2.i.f11808c;
                    i1.b.c(i22, (int) (jA & 4294967295L));
                }
                hVar.getClass();
                throw null;
            }
            if (arrayList2.size() > 1) {
                i14 = 0;
                r8.m.z0(arrayList2, new i(uVar, i14));
            } else {
                i14 = 0;
            }
            if (arrayList2.size() > 0) {
                x xVar5 = (x) arrayList2.get(i14);
                int i25 = xVar5.f17175o;
                h hVar2 = (h) r8.v.B0(xVar5.f17170j, linkedHashMap);
                long jA2 = xVar5.a(i14);
                if (xVar5.f17163c) {
                    int i26 = m2.i.f11808c;
                    i1.b.c((int) (jA2 >> 32), i18);
                } else {
                    int i27 = m2.i.f11808c;
                    i1.b.c(i18, (int) (jA2 & 4294967295L));
                }
                hVar2.getClass();
                throw null;
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList4 = this.f17083g;
            ArrayList arrayList5 = this.f17082f;
            if (!zHasNext) {
                if (arrayList5.size() > 1) {
                    r8.m.z0(arrayList5, new i(uVar2, 3));
                }
                int size5 = arrayList5.size();
                int i28 = 0;
                int i29 = 0;
                while (i28 < size5) {
                    x xVar6 = (x) arrayList5.get(i28);
                    int i30 = size5;
                    i29 += xVar6.f17175o;
                    xVar6.c(z11 ? ((x) r8.p.F0(arrayList)).f17173m - i29 : 0 - i29, i11, i12);
                    if (z13) {
                        b(xVar6);
                        throw null;
                    }
                    i28++;
                    size5 = i30;
                }
                int i31 = 1;
                if (arrayList4.size() > 1) {
                    r8.m.z0(arrayList4, new i(uVar2, i31));
                }
                int i32 = 0;
                int i33 = 0;
                for (int size6 = arrayList4.size(); i32 < size6; size6 = size6) {
                    x xVar7 = (x) arrayList4.get(i32);
                    if (z11) {
                        x xVar8 = (x) r8.p.L0(arrayList);
                        i13 = xVar8.f17173m + xVar8.f17175o + i33;
                    } else {
                        i13 = i18 + i33;
                    }
                    i33 += xVar7.f17175o;
                    xVar7.c(i13, i11, i12);
                    if (z13) {
                        b(xVar7);
                        throw null;
                    }
                    i32++;
                }
                d7.a.m(arrayList5, "<this>");
                Collections.reverse(arrayList5);
                arrayList.addAll(0, arrayList5);
                arrayList.addAll(arrayList4);
                arrayList3.clear();
                arrayList2.clear();
                arrayList5.clear();
                arrayList4.clear();
                linkedHashSet.clear();
                return;
            }
            Object next = it.next();
            int iB = uVar2.b(next);
            if (iB != -1) {
                sVar.a(iB).f17177q = true;
                ((h) r8.v.B0(next, linkedHashMap)).getClass();
                throw null;
            }
            linkedHashMap.remove(next);
        }
    }

    public final void b(x xVar) {
        ((h) r8.v.B0(xVar.f17170j, this.f17077a)).getClass();
        throw null;
    }
}
