package r1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends t1.f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c1 f13351b = new c1("Undefined intrinsics block and it is required");

    @Override // r1.j0
    public final k0 e(l0 l0Var, List list, long j10) {
        boolean zIsEmpty = list.isEmpty();
        r8.s sVar = r8.s.f13662a;
        if (zIsEmpty) {
            return l0Var.N(m2.a.k(j10), m2.a.j(j10), sVar, y0.f13431c);
        }
        if (list.size() == 1) {
            x0 x0VarF = ((i0) list.get(0)).f(j10);
            return l0Var.N(o1.s.q(x0VarF.f13423a, j10), o1.s.p(x0VarF.f13424b, j10), sVar, new s.z(x0VarF, 9));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((i0) list.get(i10)).f(j10));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            x0 x0Var = (x0) arrayList.get(i11);
            iMax = Math.max(x0Var.f13423a, iMax);
            iMax2 = Math.max(x0Var.f13424b, iMax2);
        }
        return l0Var.N(o1.s.q(iMax, j10), o1.s.p(iMax2, j10), sVar, new s.x(3, arrayList));
    }
}
