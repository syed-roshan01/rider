package n1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f12115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f12118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12119e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, u8.e eVar) {
        super(eVar);
        this.f12118d = gVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12117c = obj;
        this.f12119e |= Integer.MIN_VALUE;
        return this.f12118d.B(0L, this);
    }
}
