package j0;

import t.w1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f8284b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, u8.e eVar) {
        super(2, eVar);
        this.f8284b = pVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new l(this.f8284b, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f8283a;
        if (i10 == 0) {
            d7.t.v0(obj);
            t.d dVar = this.f8284b.f8299i;
            Float f10 = new Float(1.0f);
            w1 w1VarS = t.e.s(225, 0, t.d0.f14122c, 2);
            this.f8283a = 1;
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
