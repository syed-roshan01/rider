package w;

/* JADX INFO: loaded from: classes.dex */
public final class b extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c9.c f15977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f15979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, u8.e eVar) {
        super(eVar);
        this.f15979c = hVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15978b = obj;
        this.f15980d |= Integer.MIN_VALUE;
        return this.f15979c.c(null, 0.0f, null, this);
    }
}
