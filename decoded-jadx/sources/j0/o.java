package j0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f8290b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, u8.e eVar) {
        super(2, eVar);
        this.f8290b = pVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        o oVar = new o(this.f8290b, eVar);
        oVar.f8289a = obj;
        return oVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        return z6.a.Q((m9.d0) this.f8289a, null, 0, new n(this.f8290b, null), 3);
    }
}
