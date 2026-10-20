package q9;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f13254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, u8.e eVar) {
        super(2, eVar);
        this.f13254c = gVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        f fVar = new f(this.f13254c, eVar);
        fVar.f13253b = obj;
        return fVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((o9.r) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f13252a;
        if (i10 == 0) {
            d7.t.v0(obj);
            o9.r rVar = (o9.r) this.f13253b;
            this.f13252a = 1;
            if (this.f13254c.c(rVar, this) == aVar) {
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
