package v;

/* JADX INFO: loaded from: classes.dex */
public final class b3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1 f15489a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(l1 l1Var, u8.e eVar) {
        super(2, eVar);
        this.f15489a = l1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new b3(this.f15489a, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        b3 b3Var = (b3) create((m9.d0) obj, (u8.e) obj2);
        q8.l lVar = q8.l.f13235a;
        b3Var.invokeSuspend(lVar);
        return lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        l1 l1Var = this.f15489a;
        l1Var.f15666b = true;
        l1Var.f15668d.d(null);
        return q8.l.f13235a;
    }
}
