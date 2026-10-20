package v;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f15547c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, u8.e eVar) {
        super(2, eVar);
        this.f15547c = g1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        f1 f1Var = new f1(this.f15547c, eVar);
        f1Var.f15546b = obj;
        return f1Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f1) create((o1.z) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15545a;
        if (i10 == 0) {
            d7.t.v0(obj);
            o1.z zVar = (o1.z) this.f15546b;
            e1 e1Var = new e1(this.f15547c, null);
            this.f15545a = 1;
            if (((o1.j0) zVar).G0(e1Var, this) == aVar) {
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
