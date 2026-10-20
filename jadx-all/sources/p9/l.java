package p9;

/* JADX INFO: loaded from: classes.dex */
public final class l extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f12913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f12916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, u8.e eVar) {
        super(eVar);
        this.f12916d = mVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12915c = obj;
        this.f12917e |= Integer.MIN_VALUE;
        return this.f12916d.emit(null, this);
    }
}
