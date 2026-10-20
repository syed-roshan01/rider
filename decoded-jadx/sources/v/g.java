package v;

/* JADX INFO: loaded from: classes.dex */
public final class g extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f15549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m9.d0 f15550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f15551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f15553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, u8.e eVar) {
        super(eVar);
        this.f15553e = jVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15552d = obj;
        this.f15554f |= Integer.MIN_VALUE;
        return j.J0(this.f15553e, null, null, this);
    }
}
