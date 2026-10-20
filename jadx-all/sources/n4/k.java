package n4;

/* JADX INFO: loaded from: classes.dex */
public final class k extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f12216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f12217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f12219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, u8.e eVar) {
        super(eVar);
        this.f12219d = lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12218c = obj;
        this.f12220e |= Integer.MIN_VALUE;
        return this.f12219d.b(null, this);
    }
}
