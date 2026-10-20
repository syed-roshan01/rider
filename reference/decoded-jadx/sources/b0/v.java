package b0;

import v.h1;

/* JADX INFO: loaded from: classes.dex */
public final class v extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.w f2472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f2474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h1 f2476f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y0.b f2477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y0.c f2478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f2479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2480q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(a0.w wVar, long j10, t tVar, long j11, h1 h1Var, y0.b bVar, y0.c cVar, boolean z10, int i10, int i11) {
        super(1);
        this.f2471a = i11;
        this.f2472b = wVar;
        this.f2473c = j10;
        this.f2474d = tVar;
        this.f2475e = j11;
        this.f2476f = h1Var;
        this.f2477n = bVar;
        this.f2478o = cVar;
        this.f2479p = z10;
        this.f2480q = i10;
    }

    public final g a(int i10) {
        switch (this.f2471a) {
            case 0:
                a0.w wVar = this.f2472b;
                return o7.d0.y(wVar, i10, this.f2473c, this.f2474d, this.f2475e, this.f2476f, this.f2477n, this.f2478o, ((a0.x) wVar).f870b.getLayoutDirection(), this.f2479p, this.f2480q);
            default:
                a0.w wVar2 = this.f2472b;
                return o7.d0.y(wVar2, i10, this.f2473c, this.f2474d, this.f2475e, this.f2476f, this.f2477n, this.f2478o, ((a0.x) wVar2).f870b.getLayoutDirection(), this.f2479p, this.f2480q);
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f2471a) {
            case 0:
                break;
        }
        return a(((Number) obj).intValue());
    }
}
