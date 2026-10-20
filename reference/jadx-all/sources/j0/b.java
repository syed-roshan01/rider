package j0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f8245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f8246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x.o f8247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, c cVar, x.o oVar, u8.e eVar) {
        super(2, eVar);
        this.f8245b = pVar;
        this.f8246c = cVar;
        this.f8247d = oVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new b(this.f8245b, this.f8246c, this.f8247d, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f8244a;
        x.o oVar = this.f8247d;
        c cVar = this.f8246c;
        try {
            if (i10 == 0) {
                d7.t.v0(obj);
                p pVar = this.f8245b;
                this.f8244a = 1;
                if (pVar.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            cVar.f8257f.remove(oVar);
            return q8.l.f13235a;
        } catch (Throwable th) {
            cVar.f8257f.remove(oVar);
            throw th;
        }
    }
}
