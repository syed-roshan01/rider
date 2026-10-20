package h0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f7339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m mVar, boolean z10, boolean z11) {
        super(1);
        this.f7339a = mVar;
        this.f7340b = z10;
        this.f7341c = z11;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        y1.v vVar = (y1.v) obj;
        long jA = this.f7339a.a();
        ((y1.j) vVar).k(d0.f7376c, new c0(this.f7340b ? f0.n0.f5824b : f0.n0.f5825c, jA, this.f7341c ? 1 : 3, d9.i.u(jA)));
        return q8.l.f13235a;
    }
}
