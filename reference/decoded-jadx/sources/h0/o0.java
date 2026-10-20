package h0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements r1.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f7435a = new o0();

    @Override // r1.j0
    public final r1.k0 e(r1.l0 l0Var, List list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer numValueOf = 0;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((r1.i0) list.get(i10)).f(j10));
        }
        int size2 = arrayList.size();
        Integer numValueOf2 = numValueOf;
        for (int i11 = 0; i11 < size2; i11++) {
            numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((r1.x0) arrayList.get(i11)).f13423a));
        }
        int iIntValue = numValueOf2.intValue();
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((r1.x0) arrayList.get(i12)).f13424b));
        }
        return l0Var.N(iIntValue, numValueOf.intValue(), r8.s.f13662a, new s.x(1, arrayList));
    }
}
