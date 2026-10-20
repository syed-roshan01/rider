package o1;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f12372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12373c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, u8.e eVar) {
        super(eVar);
        this.f12372b = h0Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12371a = obj;
        this.f12373c |= Integer.MIN_VALUE;
        return this.f12372b.i(0L, null, this);
    }
}
