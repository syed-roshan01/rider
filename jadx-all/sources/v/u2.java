package v;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1.z f15801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c9.f f15802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c9.c f15803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1 f15804f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(o1.z zVar, c9.f fVar, c9.c cVar, l1 l1Var, u8.e eVar) {
        super(2, eVar);
        this.f15801c = zVar;
        this.f15802d = fVar;
        this.f15803e = cVar;
        this.f15804f = l1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        u2 u2Var = new u2(this.f15801c, this.f15802d, this.f15803e, this.f15804f, eVar);
        u2Var.f15800b = obj;
        return u2Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u2) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15799a;
        if (i10 == 0) {
            d7.t.v0(obj);
            t2 t2Var = new t2((m9.d0) this.f15800b, this.f15802d, this.f15803e, this.f15804f, null);
            this.f15799a = 1;
            if (m9.e0.q(this.f15801c, t2Var, this) == aVar) {
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
