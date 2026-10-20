package v;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends w8.i implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ long f15784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f15785b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, u8.e eVar) {
        super(3, eVar);
        this.f15785b = u1Var;
    }

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        long j10 = ((m2.p) obj2).f11825a;
        t1 t1Var = new t1(this.f15785b, (u8.e) obj3);
        t1Var.f15784a = j10;
        q8.l lVar = q8.l.f13235a;
        t1Var.invokeSuspend(lVar);
        return lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        long j10 = this.f15784a;
        u1 u1Var = this.f15785b;
        m9.d0 d0Var = (m9.d0) u1Var.f15796x.f12107b.invoke();
        if (d0Var == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        z6.a.Q(d0Var, null, 0, new s1(u1Var, j10, null), 3);
        return q8.l.f13235a;
    }
}
