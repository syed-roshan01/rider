package u;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x.m f14856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.k f14857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(x.m mVar, x.k kVar, u8.e eVar) {
        super(2, eVar);
        this.f14856b = mVar;
        this.f14857c = kVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new n0(this.f14856b, this.f14857c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14855a;
        if (i10 == 0) {
            d7.t.v0(obj);
            this.f14855a = 1;
            if (this.f14856b.a(this.f14857c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        return q8.l.f13235a;
    }
}
