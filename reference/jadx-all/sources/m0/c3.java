package m0;

/* JADX INFO: loaded from: classes.dex */
public final class c3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.e f11472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f11473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(c9.e eVar, g1 g1Var, u8.e eVar2) {
        super(2, eVar2);
        this.f11472c = eVar;
        this.f11473d = g1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        c3 c3Var = new c3(this.f11472c, this.f11473d, eVar);
        c3Var.f11471b = obj;
        return c3Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c3) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f11470a;
        if (i10 == 0) {
            d7.t.v0(obj);
            t1 t1Var = new t1(this.f11473d, ((m9.d0) this.f11471b).q());
            this.f11470a = 1;
            if (this.f11472c.invoke(t1Var, this) == aVar) {
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
