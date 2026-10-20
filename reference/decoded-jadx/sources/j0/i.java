package j0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f8275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f8277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, u8.e eVar) {
        super(eVar);
        this.f8277c = pVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f8276b = obj;
        this.f8278d |= Integer.MIN_VALUE;
        return this.f8277c.a(this);
    }
}
