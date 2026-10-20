package m0;

/* JADX INFO: loaded from: classes.dex */
public final class b2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11459a;

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        b2 b2Var = new b2(2, eVar);
        b2Var.f11459a = obj;
        return b2Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b2) create((a2) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        return Boolean.valueOf(((a2) this.f11459a) == a2.f11447a);
    }
}
