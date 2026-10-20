package v;

/* JADX INFO: loaded from: classes.dex */
public final class p2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f15738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(l1 l1Var, u8.e eVar) {
        super(2, eVar);
        this.f15738b = l1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new p2(this.f15738b, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p2) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15737a;
        if (i10 == 0) {
            d7.t.v0(obj);
            this.f15737a = 1;
            if (this.f15738b.a(this) == aVar) {
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
