package u1;

/* JADX INFO: loaded from: classes.dex */
public final class p3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p9.o0 f15213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2 f15214c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(p9.o0 o0Var, h2 h2Var, u8.e eVar) {
        super(2, eVar);
        this.f15213b = o0Var;
        this.f15214c = h2Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new p3(this.f15213b, this.f15214c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        ((p3) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
        return v8.a.f15963a;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15212a;
        if (i10 == 0) {
            d7.t.v0(obj);
            o3 o3Var = new o3(this.f15214c, 0);
            this.f15212a = 1;
            if (this.f15213b.collect(o3Var, this) == aVar) {
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
