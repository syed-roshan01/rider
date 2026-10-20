package h0;

import f0.k1;

/* JADX INFO: loaded from: classes.dex */
public final class y extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f7509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k1 f7510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(l lVar, k1 k1Var, u8.e eVar) {
        super(2, eVar);
        this.f7509c = lVar;
        this.f7510d = k1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        y yVar = new y(this.f7509c, this.f7510d, eVar);
        yVar.f7508b = obj;
        return yVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((o1.z) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f7507a;
        if (i10 == 0) {
            d7.t.v0(obj);
            o1.z zVar = (o1.z) this.f7508b;
            o1.j0 j0Var = (o1.j0) zVar;
            j0Var.getClass();
            x xVar = new x(this.f7509c, new i(t1.g.y(j0Var).f1754z), this.f7510d, null);
            this.f7507a = 1;
            if (m9.e0.q(zVar, xVar, this) == aVar) {
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
