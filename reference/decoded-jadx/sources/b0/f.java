package b0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f2368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h0 h0Var, u8.e eVar) {
        super(2, eVar);
        this.f2368c = h0Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        f fVar = new f(this.f2368c, eVar);
        fVar.f2367b = obj;
        return fVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((o1.z) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f2366a;
        if (i10 == 0) {
            d7.t.v0(obj);
            e eVar = new e((o1.z) this.f2367b, this.f2368c, null);
            this.f2366a = 1;
            if (d7.a.q(eVar, this) == aVar) {
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
