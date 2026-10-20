package v;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f15811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c9.e f15812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, c9.e eVar, u8.e eVar2) {
        super(2, eVar2);
        this.f15811c = w0Var;
        this.f15812d = eVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        v0 v0Var = new v0(this.f15811c, this.f15812d, eVar);
        v0Var.f15810b = obj;
        return v0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((k0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15809a;
        if (i10 == 0) {
            d7.t.v0(obj);
            k0 k0Var = (k0) this.f15810b;
            w0 w0Var = this.f15811c;
            w0Var.M = k0Var;
            u0 u0Var = w0Var.N;
            this.f15809a = 1;
            if (this.f15812d.invoke(u0Var, this) == aVar) {
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
