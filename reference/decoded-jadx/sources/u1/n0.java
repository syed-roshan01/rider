package u1;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15169b;

    public /* synthetic */ n0(Object obj, int i10) {
        this.f15168a = i10;
        this.f15169b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iG;
        int iG2;
        int i10 = this.f15168a;
        Object obj3 = this.f15169b;
        switch (i10) {
            case 0:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : d7.t.J(Integer.valueOf(((y1.o) obj).f16801g), Integer.valueOf(((y1.o) obj2).f16801g));
            case 1:
                return ((e8.e1) obj).c() - ((e8.e1) obj2).c();
            default:
                r7.e eVar = (r7.e) ((e8.y1) obj3);
                switch (eVar.f13598a) {
                    case 10:
                        iG = ((e8.a1) obj).g();
                        break;
                    case 11:
                        iG = ((e8.e1) obj).c();
                        break;
                    default:
                        iG = ((e8.t1) obj).o0();
                        break;
                }
                switch (eVar.f13598a) {
                    case 10:
                        iG2 = ((e8.a1) obj2).g();
                        break;
                    case 11:
                        iG2 = ((e8.e1) obj2).c();
                        break;
                    default:
                        iG2 = ((e8.t1) obj2).o0();
                        break;
                }
                int i11 = iG - iG2;
                return i11 != 0 ? i11 : obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
    }
}
