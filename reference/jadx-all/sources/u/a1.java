package u;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d1 f14721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f14723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(d1 d1Var, u8.e eVar) {
        super(eVar);
        this.f14723c = d1Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f14722b = obj;
        this.f14724d |= Integer.MIN_VALUE;
        return this.f14723c.H0(this);
    }
}
