package v;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f15696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c9.e f15697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, c9.e eVar, u8.e eVar2) {
        super(2, eVar2);
        this.f15696c = n1Var;
        this.f15697d = eVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        m1 m1Var = new m1(this.f15696c, this.f15697d, eVar);
        m1Var.f15695b = obj;
        return m1Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m1) create((r1) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15694a;
        if (i10 == 0) {
            d7.t.v0(obj);
            r1 r1Var = (r1) this.f15695b;
            n1 n1Var = this.f15696c;
            n1Var.f15716b = r1Var;
            this.f15694a = 1;
            if (this.f15697d.invoke(n1Var, this) == aVar) {
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
