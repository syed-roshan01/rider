package p9;

/* JADX INFO: loaded from: classes.dex */
public final class b extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o9.r f12858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f12860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, u8.e eVar) {
        super(eVar);
        this.f12860c = cVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12859b = obj;
        this.f12861d |= Integer.MIN_VALUE;
        return this.f12860c.c(null, this);
    }
}
