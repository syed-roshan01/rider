package t;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f14316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(u1 u1Var, Object obj, int i10, int i11) {
        super(2);
        this.f14315a = i11;
        this.f14316b = u1Var;
        this.f14317c = obj;
        this.f14318d = i10;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f14318d;
        u1 u1Var = this.f14316b;
        Object obj3 = this.f14317c;
        int i11 = this.f14315a;
        switch (i11) {
            case 0:
                m0.m mVar = (m0.m) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        u1Var.a(obj3, mVar, m0.s.m(i10 | 1));
                        break;
                    default:
                        u1Var.h(obj3, mVar, m0.s.m(i10 | 1));
                        break;
                }
                break;
            default:
                m0.m mVar2 = (m0.m) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        u1Var.a(obj3, mVar2, m0.s.m(i10 | 1));
                        break;
                    default:
                        u1Var.h(obj3, mVar2, m0.s.m(i10 | 1));
                        break;
                }
                break;
        }
        return lVar;
    }
}
