package b0;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f2459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, u8.e eVar) {
        super(eVar);
        this.f2459b = q0Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f2458a = obj;
        this.f2460c |= Integer.MIN_VALUE;
        return this.f2459b.a(null, 0.0f, this);
    }
}
