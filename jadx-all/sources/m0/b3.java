package m0;

/* JADX INFO: loaded from: classes.dex */
public final class b3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.e f11462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f11463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(c9.e eVar, g1 g1Var, u8.e eVar2) {
        super(2, eVar2);
        this.f11462c = eVar;
        this.f11463d = g1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        b3 b3Var = new b3(this.f11462c, this.f11463d, eVar);
        b3Var.f11461b = obj;
        return b3Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b3) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f11460a;
        if (i10 == 0) {
            d7.t.v0(obj);
            t1 t1Var = new t1(this.f11463d, ((m9.d0) this.f11461b).q());
            this.f11460a = 1;
            if (this.f11462c.invoke(t1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        return q8.l.f13235a;
    }
}
