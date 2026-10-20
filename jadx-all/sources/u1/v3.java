package u1;

/* JADX INFO: loaded from: classes.dex */
public final class v3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3 f15314b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(x3 x3Var, u8.e eVar) {
        super(2, eVar);
        this.f15314b = x3Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new v3(this.f15314b, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v3) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15313a;
        q8.l lVar = q8.l.f13235a;
        if (i10 == 0) {
            d7.t.v0(obj);
            w wVar = this.f15314b.f15370a;
            this.f15313a = 1;
            Object objK = wVar.f15345t.k(this);
            if (objK != aVar) {
                objK = lVar;
            }
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        return lVar;
    }
}
