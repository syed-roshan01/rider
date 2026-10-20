package u;

/* JADX INFO: loaded from: classes.dex */
public final class b extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f14727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.o f14728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c0 c0Var, x.o oVar, u8.e eVar) {
        super(2, eVar);
        this.f14727b = c0Var;
        this.f14728c = oVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new b(this.f14727b, this.f14728c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14726a;
        if (i10 == 0) {
            d7.t.v0(obj);
            x.m mVar = this.f14727b.f14742w;
            this.f14726a = 1;
            if (mVar.a(this.f14728c, this) == aVar) {
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
