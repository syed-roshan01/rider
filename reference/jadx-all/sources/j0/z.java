package j0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f8325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f8326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.n f8327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, float f10, t.n nVar, u8.e eVar) {
        super(2, eVar);
        this.f8325b = b0Var;
        this.f8326c = f10;
        this.f8327d = nVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new z(this.f8325b, this.f8326c, this.f8327d, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f8324a;
        if (i10 == 0) {
            d7.t.v0(obj);
            t.d dVar = (t.d) this.f8325b.f8250c;
            Float f10 = new Float(this.f8326c);
            this.f8324a = 1;
            if (t.d.b(dVar, f10, this.f8327d, this) == aVar) {
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
