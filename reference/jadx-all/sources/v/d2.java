package v;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2 f15511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(l2 l2Var, long j10, u8.e eVar) {
        super(2, eVar);
        this.f15511b = l2Var;
        this.f15512c = j10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new d2(this.f15511b, this.f15512c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d2) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15510a;
        if (i10 == 0) {
            d7.t.v0(obj);
            l2 l2Var = this.f15511b;
            f2 f2Var = l2Var.f15669a;
            u.s1 s1Var = u.s1.f14929b;
            c2 c2Var = new c2(l2Var, this.f15512c, null);
            this.f15510a = 1;
            if (f2Var.c(s1Var, c2Var, this) == aVar) {
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
