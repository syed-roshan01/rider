package j0;

import t.w1;

/* JADX INFO: loaded from: classes.dex */
public final class n extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f8288b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, u8.e eVar) {
        super(2, eVar);
        this.f8288b = pVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new n(this.f8288b, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f8287a;
        if (i10 == 0) {
            d7.t.v0(obj);
            t.d dVar = this.f8288b.f8297g;
            Float f10 = new Float(0.0f);
            w1 w1VarS = t.e.s(150, 0, t.d0.f14122c, 2);
            this.f8287a = 1;
            if (t.d.b(dVar, f10, w1VarS, this) == aVar) {
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
