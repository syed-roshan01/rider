package m0;

/* JADX INFO: loaded from: classes.dex */
public final class c2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.f f11468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f11469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(c9.f fVar, a1 a1Var, u8.e eVar) {
        super(2, eVar);
        this.f11468c = fVar;
        this.f11469d = a1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        c2 c2Var = new c2(this.f11468c, this.f11469d, eVar);
        c2Var.f11467b = obj;
        return c2Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c2) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f11466a;
        if (i10 == 0) {
            d7.t.v0(obj);
            m9.d0 d0Var = (m9.d0) this.f11467b;
            this.f11466a = 1;
            if (this.f11468c.e(d0Var, this.f11469d, this) == aVar) {
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
