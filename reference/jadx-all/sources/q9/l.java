package q9;

/* JADX INFO: loaded from: classes.dex */
public final class l extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f13266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f13269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13270e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, u8.e eVar) {
        super(eVar);
        this.f13269d = mVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f13268c = obj;
        this.f13270e |= Integer.MIN_VALUE;
        return this.f13269d.emit(null, this);
    }
}
