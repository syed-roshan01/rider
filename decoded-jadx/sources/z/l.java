package z;

/* JADX INFO: loaded from: classes.dex */
public final class l extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.s f17090e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(a0.s sVar, int i10, Object obj, int i11, int i12) {
        super(2);
        this.f17086a = i12;
        this.f17090e = sVar;
        this.f17087b = i10;
        this.f17088c = obj;
        this.f17089d = i11;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f17086a;
        Object obj = this.f17088c;
        int i12 = this.f17087b;
        int i13 = this.f17089d;
        a0.s sVar = this.f17090e;
        switch (i11) {
            case 0:
                ((m) sVar).e(i12, obj, mVar, m0.s.m(i13 | 1));
                break;
            default:
                ((b0.t) sVar).e(i12, obj, mVar, m0.s.m(i13 | 1));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f17086a) {
            case 0:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }
}
