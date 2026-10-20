package v;

/* JADX INFO: loaded from: classes.dex */
public final class l3 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m3 f15676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q8.a f15677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c9.a f15678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m3 f15681f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15682n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(m3 m3Var, u8.e eVar) {
        super(eVar);
        this.f15681f = m3Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15680e = obj;
        this.f15682n |= Integer.MIN_VALUE;
        return this.f15681f.a(null, null, this);
    }
}
