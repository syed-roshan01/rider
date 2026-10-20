package v;

/* JADX INFO: loaded from: classes.dex */
public final class q extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f15741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m9.f1 f15742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, m9.f1 f1Var, u8.e eVar) {
        super(2, eVar);
        this.f15741c = sVar;
        this.f15742d = f1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        q qVar = new q(this.f15741c, this.f15742d, eVar);
        qVar.f15740b = obj;
        return qVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((r1) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15739a;
        if (i10 == 0) {
            d7.t.v0(obj);
            r1 r1Var = (r1) this.f15740b;
            s sVar = this.f15741c;
            sVar.F.f15708e = s.G0(sVar);
            b.g gVar = new b.g(sVar, r1Var, this.f15742d, 4);
            t.l0 l0Var = new t.l0(sVar, 4);
            this.f15739a = 1;
            if (sVar.F.a(gVar, l0Var, this) == aVar) {
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
