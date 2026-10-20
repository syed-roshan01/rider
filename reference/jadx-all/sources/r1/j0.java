package r1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface j0 {
    default int a(t1.c1 c1Var, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new m((p) list.get(i11), 2, 2));
        }
        return e(new r(c1Var, c1Var.f14395p.f1753y), arrayList, o1.s.b(i10, 0, 13)).a();
    }

    default int b(t1.c1 c1Var, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new m((p) list.get(i11), 2, 1));
        }
        return e(new r(c1Var, c1Var.f14395p.f1753y), arrayList, o1.s.b(0, i10, 7)).b();
    }

    default int c(t1.c1 c1Var, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new m((p) list.get(i11), 1, 2));
        }
        return e(new r(c1Var, c1Var.f14395p.f1753y), arrayList, o1.s.b(i10, 0, 13)).a();
    }

    default int d(t1.c1 c1Var, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new m((p) list.get(i11), 1, 1));
        }
        return e(new r(c1Var, c1Var.f14395p.f1753y), arrayList, o1.s.b(0, i10, 7)).b();
    }

    k0 e(l0 l0Var, List list, long j10);
}
