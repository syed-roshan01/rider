package v;

/* JADX INFO: loaded from: classes.dex */
public final class c2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2 f15499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(l2 l2Var, long j10, u8.e eVar) {
        super(2, eVar);
        this.f15499b = l2Var;
        this.f15500c = j10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        c2 c2Var = new c2(this.f15499b, this.f15500c, eVar);
        c2Var.f15498a = obj;
        return c2Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        c2 c2Var = (c2) create((r1) obj, (u8.e) obj2);
        q8.l lVar = q8.l.f13235a;
        c2Var.invokeSuspend(lVar);
        return lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        this.f15499b.a((r1) this.f15498a, this.f15500c, 4);
        return q8.l.f13235a;
    }
}
