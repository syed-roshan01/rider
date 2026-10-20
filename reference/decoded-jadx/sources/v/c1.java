package v;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2 f15496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(l2 l2Var, long j10, u8.e eVar) {
        super(2, eVar);
        this.f15496b = l2Var;
        this.f15497c = j10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        c1 c1Var = new c1(this.f15496b, this.f15497c, eVar);
        c1Var.f15495a = obj;
        return c1Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        c1 c1Var = (c1) create((r1) obj, (u8.e) obj2);
        q8.l lVar = q8.l.f13235a;
        c1Var.invokeSuspend(lVar);
        return lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        this.f15496b.a((r1) this.f15495a, this.f15497c, 4);
        return q8.l.f13235a;
    }
}
