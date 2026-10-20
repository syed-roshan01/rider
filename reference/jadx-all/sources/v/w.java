package v;

/* JADX INFO: loaded from: classes.dex */
public final class w extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f15815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u.s1 f15816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c9.e f15817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, u.s1 s1Var, c9.e eVar, u8.e eVar2) {
        super(2, eVar2);
        this.f15815b = yVar;
        this.f15816c = s1Var;
        this.f15817d = eVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new w(this.f15815b, this.f15816c, this.f15817d, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15814a;
        if (i10 == 0) {
            d7.t.v0(obj);
            y yVar = this.f15815b;
            u.v1 v1Var = yVar.f15828c;
            x xVar = yVar.f15827b;
            v vVar = new v(yVar, this.f15817d, null);
            this.f15814a = 1;
            u.s1 s1Var = this.f15816c;
            v1Var.getClass();
            if (d7.a.q(new u.u1(s1Var, v1Var, vVar, xVar, null), this) == aVar) {
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
