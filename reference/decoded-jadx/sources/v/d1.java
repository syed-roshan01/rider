package v;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2 f15508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(l2 l2Var, long j10, u8.e eVar) {
        super(2, eVar);
        this.f15508b = l2Var;
        this.f15509c = j10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new d1(this.f15508b, this.f15509c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15507a;
        if (i10 == 0) {
            d7.t.v0(obj);
            l2 l2Var = this.f15508b;
            f2 f2Var = l2Var.f15669a;
            u.s1 s1Var = u.s1.f14929b;
            c1 c1Var = new c1(l2Var, this.f15509c, null);
            this.f15507a = 1;
            if (f2Var.c(s1Var, c1Var, this) == aVar) {
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
