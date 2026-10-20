package o1;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f12389b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, u8.e eVar) {
        super(2, eVar);
        this.f12389b = j0Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new i0(this.f12389b, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f12388a;
        if (i10 == 0) {
            d7.t.v0(obj);
            j0 j0Var = this.f12389b;
            c9.e eVar = j0Var.f12391u;
            this.f12388a = 1;
            if (eVar.invoke(j0Var, this) == aVar) {
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
