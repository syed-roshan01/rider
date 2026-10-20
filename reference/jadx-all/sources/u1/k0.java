package u1;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p0 f15139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q.g f15140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o9.b f15141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f15143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p0 p0Var, u8.e eVar) {
        super(eVar);
        this.f15143e = p0Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15142d = obj;
        this.f15144f |= Integer.MIN_VALUE;
        return this.f15143e.k(this);
    }
}
