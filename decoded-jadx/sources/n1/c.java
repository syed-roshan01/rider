package n1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f12104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, u8.e eVar) {
        super(eVar);
        this.f12104b = dVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12103a = obj;
        this.f12105c |= Integer.MIN_VALUE;
        return this.f12104b.b(0L, this);
    }
}
