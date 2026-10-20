package v;

/* JADX INFO: loaded from: classes.dex */
public final class d extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f15505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, u8.e eVar) {
        super(2, eVar);
        this.f15505c = jVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        d dVar = new d(this.f15505c, eVar);
        dVar.f15504b = obj;
        return dVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((o1.z) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15503a;
        q8.l lVar = q8.l.f13235a;
        if (i10 == 0) {
            d7.t.v0(obj);
            o1.z zVar = (o1.z) this.f15504b;
            j jVar = this.f15505c;
            if (!jVar.f15635x) {
                return lVar;
            }
            c cVar = new c(zVar, jVar, null);
            this.f15503a = 1;
            if (d7.a.q(cVar, this) == aVar) {
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
