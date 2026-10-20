package h0;

import t.d1;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.d f7400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7401c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(t.d dVar, long j10, u8.e eVar) {
        super(2, eVar);
        this.f7400b = dVar;
        this.f7401c = j10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new h0(this.f7400b, this.f7401c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f7399a;
        if (i10 == 0) {
            d7.t.v0(obj);
            d1.c cVar = new d1.c(this.f7401c);
            d1 d1Var = k0.f7423d;
            this.f7399a = 1;
            if (t.d.b(this.f7400b, cVar, d1Var, this) == aVar) {
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
