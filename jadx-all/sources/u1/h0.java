package u1;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f15108a = new h0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q8.f fVar = (q8.f) obj;
        q8.f fVar2 = (q8.f) obj2;
        int iCompare = Float.compare(((d1.d) fVar.f13225a).f4333b, ((d1.d) fVar2.f13225a).f4333b);
        return iCompare != 0 ? iCompare : Float.compare(((d1.d) fVar.f13225a).f4335d, ((d1.d) fVar2.f13225a).f4335d);
    }
}
