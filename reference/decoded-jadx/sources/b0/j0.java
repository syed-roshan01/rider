package b0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f2422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i10, List list) {
        super(0);
        this.f2421a = i10;
        this.f2422b = list;
    }

    @Override // c9.a
    public final Object invoke() {
        List list = this.f2422b;
        int i10 = this.f2421a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        Object obj = list.get(2);
                        d7.a.k(obj, "null cannot be cast to non-null type kotlin.Int");
                        return (Integer) obj;
                    default:
                        return Integer.valueOf(list.size());
                }
            case 1:
                switch (i10) {
                    case 0:
                        Object obj2 = list.get(2);
                        d7.a.k(obj2, "null cannot be cast to non-null type kotlin.Int");
                        return (Integer) obj2;
                    default:
                        return Integer.valueOf(list.size());
                }
            default:
                return list;
        }
    }
}
