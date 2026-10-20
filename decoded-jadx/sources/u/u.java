package u;

/* JADX INFO: loaded from: classes.dex */
public final class u extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1.n f14939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f14941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f14942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f14943f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f14944n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g1.k f14945o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z10, e1.n nVar, long j10, float f10, float f11, long j11, long j12, g1.k kVar) {
        super(1);
        this.f14938a = z10;
        this.f14939b = nVar;
        this.f14940c = j10;
        this.f14941d = f10;
        this.f14942e = f11;
        this.f14943f = j11;
        this.f14944n = j12;
        this.f14945o = kVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        t1.i0 i0Var = (t1.i0) ((g1.e) obj);
        i0Var.a();
        if (this.f14938a) {
            g1.g.r(i0Var, this.f14939b, 0L, 0L, this.f14940c, null, 246);
        } else {
            long j10 = this.f14940c;
            float fB = d1.a.b(j10);
            float f10 = this.f14941d;
            if (fB < f10) {
                float f11 = this.f14942e;
                g1.c cVar = i0Var.f14447a;
                float fD = d1.f.d(cVar.e());
                float f12 = this.f14942e;
                float f13 = fD - f12;
                float fB2 = d1.f.b(cVar.e()) - f12;
                e1.n nVar = this.f14939b;
                long j11 = this.f14940c;
                g1.b bVar = cVar.f6497b;
                long jB = bVar.b();
                bVar.a().j();
                bVar.f6494a.f6500a.a().d(f11, f11, f13, fB2, 0);
                g1.g.r(i0Var, nVar, 0L, 0L, j11, null, 246);
                bVar.a().h();
                bVar.c(jB);
            } else {
                g1.g.r(i0Var, this.f14939b, this.f14943f, this.f14944n, androidx.compose.foundation.a.m(f10, j10), this.f14945o, 208);
            }
        }
        return q8.l.f13235a;
    }
}
