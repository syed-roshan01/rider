package n1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f12101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12102c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, u8.e eVar) {
        super(eVar);
        this.f12101b = dVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12100a = obj;
        this.f12102c |= Integer.MIN_VALUE;
        return this.f12101b.a(0L, 0L, this);
    }
}
