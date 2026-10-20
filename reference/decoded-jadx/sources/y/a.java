package y;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1.a f16506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f16507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1.x0 f16511f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f16512n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r1.a aVar, float f10, int i10, int i11, int i12, r1.x0 x0Var, int i13) {
        super(1);
        this.f16506a = aVar;
        this.f16507b = f10;
        this.f16508c = i10;
        this.f16509d = i11;
        this.f16510e = i12;
        this.f16511f = x0Var;
        this.f16512n = i13;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10;
        r1.w0 w0Var = (r1.w0) obj;
        boolean z10 = this.f16506a instanceof r1.o;
        r1.x0 x0Var = this.f16511f;
        int i11 = this.f16510e;
        int i12 = this.f16508c;
        float f10 = this.f16507b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = !m2.e.a(f10, Float.NaN) ? i12 : (this.f16509d - i11) - x0Var.f13423a;
        }
        if (!z10) {
            i12 = 0;
        } else if (m2.e.a(f10, Float.NaN)) {
            i12 = (this.f16512n - i11) - x0Var.f13424b;
        }
        r1.w0.g(w0Var, x0Var, i10, i12);
        return q8.l.f13235a;
    }
}
