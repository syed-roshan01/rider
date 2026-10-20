package a0;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.f f843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(c9.f fVar, int i10, int i11) {
        super(2);
        this.f842a = i11;
        this.f843b = fVar;
        this.f844c = i10;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f844c;
        c9.f fVar = this.f843b;
        int i11 = this.f842a;
        switch (i11) {
            case 0:
                m0.m mVar = (m0.m) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        f6.a.i(fVar, mVar, m0.s.m(i10 | 1));
                        break;
                    default:
                        y3.e.f(fVar, mVar, m0.s.m(i10 | 1));
                        break;
                }
                break;
            default:
                m0.m mVar2 = (m0.m) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        f6.a.i(fVar, mVar2, m0.s.m(i10 | 1));
                        break;
                    default:
                        y3.e.f(fVar, mVar2, m0.s.m(i10 | 1));
                        break;
                }
                break;
        }
        return lVar;
    }
}
