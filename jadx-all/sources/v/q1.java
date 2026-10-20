package v;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f15747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.n f15748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d9.r f15749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(float f10, t.n nVar, d9.r rVar, u8.e eVar) {
        super(2, eVar);
        this.f15747c = f10;
        this.f15748d = nVar;
        this.f15749e = rVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        q1 q1Var = new q1(this.f15747c, this.f15748d, this.f15749e, eVar);
        q1Var.f15746b = obj;
        return q1Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((r1) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15745a;
        if (i10 == 0) {
            d7.t.v0(obj);
            p1 p1Var = new p1(this.f15749e, (r1) this.f15746b, 0);
            this.f15745a = 1;
            if (t.e.d(this.f15747c, this.f15748d, p1Var, this) == aVar) {
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
