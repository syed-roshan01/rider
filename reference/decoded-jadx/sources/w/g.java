package w;

/* JADX INFO: loaded from: classes.dex */
public final class g extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f15995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, u8.e eVar) {
        super(eVar);
        this.f15995b = hVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15994a = obj;
        this.f15996c |= Integer.MIN_VALUE;
        return h.b(this.f15995b, null, 0.0f, 0.0f, null, this);
    }
}
