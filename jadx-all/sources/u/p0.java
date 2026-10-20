package u;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f14880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, u8.e eVar) {
        super(2, eVar);
        this.f14880b = q0Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new p0(this.f14880b, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14879a;
        if (i10 == 0) {
            d7.t.v0(obj);
            c0.f fVar = this.f14880b.B;
            this.f14879a = 1;
            if (fVar.a(null, this) == aVar) {
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
