package t;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1 f14314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(u1 u1Var, u8.e eVar) {
        super(2, eVar);
        this.f14314c = u1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        s1 s1Var = new s1(this.f14314c, eVar);
        s1Var.f14313b = obj;
        return s1Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s1) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        m9.d0 d0Var;
        r1 r1Var;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14312a;
        if (i10 == 0) {
            d7.t.v0(obj);
            d0Var = (m9.d0) this.f14313b;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0Var = (m9.d0) this.f14313b;
            d7.t.v0(obj);
        }
        do {
            r1Var = new r1(this.f14314c, e.o(d0Var.q()));
            this.f14313b = d0Var;
            this.f14312a = 1;
        } while (d9.i.p(getContext()).T(r1Var, this) != aVar);
        return aVar;
    }
}
