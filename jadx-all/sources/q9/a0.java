package q9;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p9.g f13241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p9.g gVar, u8.e eVar) {
        super(2, eVar);
        this.f13241c = gVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        a0 a0Var = new a0(this.f13241c, eVar);
        a0Var.f13240b = obj;
        return a0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create(obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f13239a;
        if (i10 == 0) {
            d7.t.v0(obj);
            Object obj2 = this.f13240b;
            this.f13239a = 1;
            if (this.f13241c.emit(obj2, this) == aVar) {
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
