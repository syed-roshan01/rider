package q9;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f13260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, u8.e eVar) {
        super(2, eVar);
        this.f13260c = iVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        h hVar = new h(this.f13260c, eVar);
        hVar.f13259b = obj;
        return hVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((p9.g) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f13258a;
        if (i10 == 0) {
            d7.t.v0(obj);
            p9.g gVar = (p9.g) this.f13259b;
            this.f13258a = 1;
            if (this.f13260c.g(gVar, this) == aVar) {
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
