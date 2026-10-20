package v;

/* JADX INFO: loaded from: classes.dex */
public final class y2 extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15831c;

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        y2 y2Var = new y2(eVar);
        y2Var.f15831c = obj;
        return y2Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y2) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15830b;
        if (i10 == 0) {
            d7.t.v0(obj);
            o1.h0 h0Var = (o1.h0) this.f15831c;
            this.f15830b = 1;
            obj = k3.d(h0Var, o1.l.f12401b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        return obj;
    }
}
