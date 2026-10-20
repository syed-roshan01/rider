package u;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f14764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f14767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14768e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, u8.e eVar) {
        super(eVar);
        this.f14767d = jVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f14766c = obj;
        this.f14768e |= Integer.MIN_VALUE;
        return this.f14767d.d(0L, null, this);
    }
}
