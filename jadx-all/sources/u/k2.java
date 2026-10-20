package u;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2 f14836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f14837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f14838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(boolean z10, p2 p2Var, float f10, float f11, u8.e eVar) {
        super(2, eVar);
        this.f14835b = z10;
        this.f14836c = p2Var;
        this.f14837d = f10;
        this.f14838e = f11;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new k2(this.f14835b, this.f14836c, this.f14837d, this.f14838e, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k2) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14834a;
        if (i10 == 0) {
            d7.t.v0(obj);
            boolean z10 = this.f14835b;
            p2 p2Var = this.f14836c;
            if (z10) {
                d7.a.k(p2Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                this.f14834a = 1;
                if (f6.a.m(p2Var, this.f14837d, t.e.r(0.0f, null, 7), this) == aVar) {
                    return aVar;
                }
            } else {
                d7.a.k(p2Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                this.f14834a = 2;
                if (f6.a.m(p2Var, this.f14838e, t.e.r(0.0f, null, 7), this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        return q8.l.f13235a;
    }
}
