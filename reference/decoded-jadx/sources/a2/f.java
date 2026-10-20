package a2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f923a = new e("", null, 6);

    public static final ArrayList a(int i10, int i11, List list) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            d dVar = (d) obj;
            if (c(i10, i11, dVar.f915b, dVar.f916c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d dVar2 = (d) arrayList.get(i13);
            arrayList2.add(new d(dVar2.f914a, Math.max(i10, dVar2.f915b) - i10, Math.min(i11, dVar2.f916c) - i10, dVar2.f917d));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final List b(e eVar, int i10, int i11) {
        List list;
        if (i10 == i11 || (list = eVar.f919b) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= eVar.f918a.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            d dVar = (d) obj;
            if (c(i10, i11, dVar.f915b, dVar.f916c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d dVar2 = (d) arrayList.get(i13);
            arrayList2.add(new d(dVar2.f914a, z6.a.r(dVar2.f915b, i10, i11) - i10, z6.a.r(dVar2.f916c, i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final boolean c(int i10, int i11, int i12, int i13) {
        if (Math.max(i10, i12) < Math.min(i11, i13)) {
            return true;
        }
        if (i10 <= i12 && i13 <= i11) {
            if (i11 != i13) {
                return true;
            }
            if ((i12 == i13) == (i10 == i11)) {
                return true;
            }
        }
        if (i12 <= i10 && i11 <= i13) {
            if (i13 != i11) {
                return true;
            }
            if ((i10 == i11) == (i12 == i13)) {
                return true;
            }
        }
        return false;
    }
}
