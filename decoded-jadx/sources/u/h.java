package u;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f14793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, u8.e eVar) {
        super(2, eVar);
        this.f14793c = jVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        h hVar = new h(this.f14793c, eVar);
        hVar.f14792b = obj;
        return hVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((o1.z) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14791a;
        if (i10 == 0) {
            d7.t.v0(obj);
            o1.z zVar = (o1.z) this.f14792b;
            g gVar = new g(this.f14793c, null);
            this.f14791a = 1;
            if (m9.e0.q(zVar, gVar, this) == aVar) {
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
