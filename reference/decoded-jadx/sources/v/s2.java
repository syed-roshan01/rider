package v;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1 f15776a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(l1 l1Var, u8.e eVar) {
        super(2, eVar);
        this.f15776a = l1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new s2(this.f15776a, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        s2 s2Var = (s2) create((m9.d0) obj, (u8.e) obj2);
        q8.l lVar = q8.l.f13235a;
        s2Var.invokeSuspend(lVar);
        return lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        l1 l1Var = this.f15776a;
        l1Var.f15666b = true;
        l1Var.f15668d.d(null);
        return q8.l.f13235a;
    }
}
