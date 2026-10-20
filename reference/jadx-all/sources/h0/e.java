package h0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7377a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7381e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y0.o oVar, c9.a aVar, boolean z10, int i10) {
        super(2);
        this.f7380d = oVar;
        this.f7381e = aVar;
        this.f7378b = z10;
        this.f7379c = i10;
    }

    public final void a(m0.m mVar, int i10) {
        int i11 = this.f7377a;
        boolean z10 = this.f7378b;
        int i12 = this.f7379c;
        Object obj = this.f7381e;
        Object obj2 = this.f7380d;
        switch (i11) {
            case 0:
                d7.t.i((y0.o) obj2, (c9.a) obj, z10, mVar, m0.s.m(i12 | 1));
                break;
            default:
                d7.t.m(z10, (l2.h) obj2, (v0) obj, mVar, m0.s.m(i12 | 1));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f7377a) {
            case 0:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z10, l2.h hVar, v0 v0Var, int i10) {
        super(2);
        this.f7378b = z10;
        this.f7380d = hVar;
        this.f7381e = v0Var;
        this.f7379c = i10;
    }
}
