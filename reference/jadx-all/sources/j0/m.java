package j0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f8286b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, u8.e eVar) {
        super(2, eVar);
        this.f8286b = pVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        m mVar = new m(this.f8286b, eVar);
        mVar.f8285a = obj;
        return mVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        m9.d0 d0Var = (m9.d0) this.f8285a;
        p pVar = this.f8286b;
        z6.a.Q(d0Var, null, 0, new j(pVar, null), 3);
        z6.a.Q(d0Var, null, 0, new k(pVar, null), 3);
        return z6.a.Q(d0Var, null, 0, new l(pVar, null), 3);
    }
}
