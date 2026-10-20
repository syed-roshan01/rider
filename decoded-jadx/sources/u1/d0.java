package u1;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f15060a = new d0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        d1.d dVarF = ((y1.o) obj).f();
        d1.d dVarF2 = ((y1.o) obj2).f();
        int iCompare = Float.compare(dVarF.f4332a, dVarF2.f4332a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(dVarF.f4333b, dVarF2.f4333b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(dVarF.f4335d, dVarF2.f4335d);
        return iCompare3 != 0 ? iCompare3 : Float.compare(dVarF.f4334c, dVarF2.f4334c);
    }
}
