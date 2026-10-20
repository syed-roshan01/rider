package y;

/* JADX INFO: loaded from: classes.dex */
public final class m extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0.o f16630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(y0.o oVar, int i10, int i11) {
        super(2);
        this.f16629a = i11;
        this.f16630b = oVar;
        this.f16631c = i10;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f16631c;
        y0.o oVar = this.f16630b;
        int i11 = this.f16629a;
        switch (i11) {
            case 0:
                m0.m mVar = (m0.m) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        p.a(oVar, mVar, m0.s.m(i10 | 1));
                        break;
                    default:
                        f0.f.b(oVar, mVar, m0.s.m(i10 | 1));
                        break;
                }
                break;
            default:
                m0.m mVar2 = (m0.m) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        p.a(oVar, mVar2, m0.s.m(i10 | 1));
                        break;
                    default:
                        f0.f.b(oVar, mVar2, m0.s.m(i10 | 1));
                        break;
                }
                break;
        }
        return lVar;
    }
}
