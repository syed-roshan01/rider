package p9;

/* JADX INFO: loaded from: classes.dex */
public final class a extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q9.u f12850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a4.c0 f12852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12853d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a4.c0 c0Var, u8.e eVar) {
        super(eVar);
        this.f12852c = c0Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12851b = obj;
        this.f12853d |= Integer.MIN_VALUE;
        return this.f12852c.collect(null, this);
    }
}
