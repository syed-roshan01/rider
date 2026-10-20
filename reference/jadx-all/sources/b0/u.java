package b0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f2468b = new u(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f2469c = new u(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2470a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10) {
        super(1);
        this.f2470a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        switch (this.f2470a) {
            case 0:
                return q8.l.f13235a;
            default:
                List list = (List) obj;
                Object obj2 = list.get(0);
                d7.a.k(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                d7.a.k(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new k0(iIntValue, ((Float) obj3).floatValue(), new j0(0, list));
        }
    }
}
