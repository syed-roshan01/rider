package b0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1.z f2357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f2358c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o1.z zVar, h0 h0Var, u8.e eVar) {
        super(2, eVar);
        this.f2357b = zVar;
        this.f2358c = h0Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new e(this.f2357b, this.f2358c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f2356a;
        if (i10 == 0) {
            d7.t.v0(obj);
            d dVar = new d(this.f2358c, null);
            this.f2356a = 1;
            if (m9.e0.q(this.f2357b, dVar, this) == aVar) {
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
