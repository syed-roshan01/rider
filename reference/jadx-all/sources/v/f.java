package v;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f15534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m9.d0 f15535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f15536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x.b f15537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f15539f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15540n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, u8.e eVar) {
        super(eVar);
        this.f15539f = jVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15538e = obj;
        this.f15540n |= Integer.MIN_VALUE;
        return j.I0(this.f15539f, null, null, this);
    }
}
