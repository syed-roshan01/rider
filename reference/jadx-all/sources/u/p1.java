package u;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f14882b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, u8.e eVar) {
        super(2, eVar);
        this.f14882b = q1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new p1(this.f14882b, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14881a;
        if (i10 == 0) {
            d7.t.v0(obj);
            r rVar = r.f14912d;
            this.f14881a = 1;
            if (d9.i.p(getContext()).T(new t.k1(3, rVar), this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        c2 c2Var = this.f14882b.G;
        if (c2Var != null) {
            ((e2) c2Var).d();
        }
        return q8.l.f13235a;
    }
}
