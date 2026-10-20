package z;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f17123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0.w f17124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f17126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.w f17127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0.b f17130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y0.c f17131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f17132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f17135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g0 f17136n;

    public s(long j10, boolean z10, m mVar, a0.w wVar, int i10, int i11, y0.b bVar, y0.c cVar, boolean z11, int i12, int i13, long j11, g0 g0Var) {
        this.f17126d = z10;
        this.f17127e = wVar;
        this.f17128f = i10;
        this.f17129g = i11;
        this.f17130h = bVar;
        this.f17131i = cVar;
        this.f17132j = z11;
        this.f17133k = i12;
        this.f17134l = i13;
        this.f17135m = j11;
        this.f17136n = g0Var;
        this.f17123a = mVar;
        this.f17124b = wVar;
        this.f17125c = o1.s.b(z10 ? m2.a.i(j10) : Integer.MAX_VALUE, z10 ? Integer.MAX_VALUE : m2.a.h(j10), 5);
    }

    public final x a(int i10) {
        m mVar = this.f17123a;
        return new x(i10, ((a0.x) this.f17124b).a(i10, this.f17125c), this.f17126d, this.f17130h, this.f17131i, ((a0.x) this.f17127e).f870b.getLayoutDirection(), this.f17132j, this.f17133k, this.f17134l, i10 == this.f17128f + (-1) ? 0 : this.f17129g, this.f17135m, mVar.a(i10), mVar.d(i10), this.f17136n.f17060p);
    }
}
