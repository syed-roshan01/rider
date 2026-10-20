package p9;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f12912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o0 o0Var, u8.e eVar) {
        super(2, eVar);
        this.f12912c = o0Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        k0 k0Var = new k0(this.f12912c, eVar);
        k0Var.f12911b = obj;
        return k0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        ((k0) create((g) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
        return v8.a.f15963a;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f12910a;
        if (i10 == 0) {
            d7.t.v0(obj);
            int i11 = 2;
            h0.i0 i0Var = new h0.i0(i11, new d9.q(), (g) this.f12911b);
            this.f12910a = 1;
            if (this.f12912c.collect(i0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        throw new androidx.fragment.app.a0();
    }
}
