package p9;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12925a;

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        m0 m0Var = new m0(2, eVar);
        m0Var.f12925a = obj;
        return m0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((f0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        return Boolean.valueOf(((f0) this.f12925a) != f0.f12890a);
    }
}
