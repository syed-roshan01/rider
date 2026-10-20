package j0;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f8242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.n f8243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, t.n nVar, u8.e eVar) {
        super(2, eVar);
        this.f8242b = b0Var;
        this.f8243c = nVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new a0(this.f8242b, this.f8243c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f8241a;
        if (i10 == 0) {
            d7.t.v0(obj);
            t.d dVar = (t.d) this.f8242b.f8250c;
            Float f10 = new Float(0.0f);
            this.f8241a = 1;
            if (t.d.b(dVar, f10, this.f8243c, this) == aVar) {
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
