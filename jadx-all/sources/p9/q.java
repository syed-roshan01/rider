package p9;

/* JADX INFO: loaded from: classes.dex */
public final class q extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f12942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f12945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, u8.e eVar) {
        super(eVar);
        this.f12945d = rVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12943b = obj;
        this.f12944c |= Integer.MIN_VALUE;
        return this.f12945d.emit(null, this);
    }
}
