package h0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.c f7353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c9.c cVar, u8.e eVar) {
        super(2, eVar);
        this.f7353c = cVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        b0 b0Var = new b0(this.f7353c, eVar);
        b0Var.f7352b = obj;
        return b0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((o1.z) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f7351a;
        if (i10 == 0) {
            d7.t.v0(obj);
            o1.z zVar = (o1.z) this.f7352b;
            a0 a0Var = new a0(this.f7353c, null);
            this.f7351a = 1;
            if (((o1.j0) zVar).G0(a0Var, this) == aVar) {
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
