package t;

/* JADX INFO: loaded from: classes.dex */
public final class c extends w8.i implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f14093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Object obj, u8.e eVar) {
        super(1, eVar);
        this.f14093a = dVar;
        this.f14094b = obj;
    }

    @Override // w8.a
    public final u8.e create(u8.e eVar) {
        return new c(this.f14093a, this.f14094b, eVar);
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        c cVar = (c) create((u8.e) obj);
        q8.l lVar = q8.l.f13235a;
        cVar.invokeSuspend(lVar);
        return lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        d dVar = this.f14093a;
        d.a(dVar);
        Object objC = dVar.c(this.f14094b);
        dVar.f14110c.f14264b.setValue(objC);
        dVar.f14112e.setValue(objC);
        return q8.l.f13235a;
    }
}
