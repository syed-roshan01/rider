package c5;

/* JADX INFO: loaded from: classes.dex */
public final class w extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i10, int i11) {
        super(2);
        this.f3021a = i11;
        this.f3022b = i10;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f3022b;
        int i11 = this.f3021a;
        switch (i11) {
            case 0:
                m0.m mVar = (m0.m) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        y3.e.d(mVar, m0.s.m(i10 | 1));
                        break;
                    default:
                        y3.e.x(mVar, m0.s.m(i10 | 1));
                        break;
                }
                break;
            default:
                m0.m mVar2 = (m0.m) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        y3.e.d(mVar2, m0.s.m(i10 | 1));
                        break;
                    default:
                        y3.e.x(mVar2, m0.s.m(i10 | 1));
                        break;
                }
                break;
        }
        return lVar;
    }
}
