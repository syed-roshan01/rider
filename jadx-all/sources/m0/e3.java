package m0;

/* JADX INFO: loaded from: classes.dex */
public final class e3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p9.f f11492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f11493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(p9.f fVar, t1 t1Var, u8.e eVar) {
        super(2, eVar);
        this.f11492b = fVar;
        this.f11493c = t1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new e3(this.f11492b, this.f11493c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e3) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f11491a;
        if (i10 == 0) {
            d7.t.v0(obj);
            d3 d3Var = new d3(this.f11493c, 1);
            this.f11491a = 1;
            if (this.f11492b.collect(d3Var, this) == aVar) {
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
