package n4;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f12188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f12189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f12191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12192e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, u8.e eVar) {
        super(eVar);
        this.f12191d = iVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12190c = obj;
        this.f12192e |= Integer.MIN_VALUE;
        return this.f12191d.d(null, this);
    }
}
