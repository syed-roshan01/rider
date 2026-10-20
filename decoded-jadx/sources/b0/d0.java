package b0;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f2349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t.n f2350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h0 f2354f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2355n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h0 h0Var, u8.e eVar) {
        super(eVar);
        this.f2354f = h0Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f2353e = obj;
        this.f2355n |= Integer.MIN_VALUE;
        return this.f2354f.f(0, 0.0f, null, this);
    }
}
