package w;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f15992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, u8.e eVar) {
        super(eVar);
        this.f15992b = hVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15991a = obj;
        this.f15993c |= Integer.MIN_VALUE;
        return this.f15992b.d(null, 0.0f, null, this);
    }
}
