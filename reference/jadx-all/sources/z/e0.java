package z;

import t.d1;
import t.g1;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f17037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, u8.e eVar) {
        super(2, eVar);
        this.f17037b = g0Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new e0(this.f17037b, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f17036a;
        if (i10 == 0) {
            d7.t.v0(obj);
            t.o oVar = this.f17037b.f17069y;
            Float f10 = new Float(0.0f);
            d1 d1VarR = t.e.r(400.0f, new Float(0.5f), 1);
            this.f17036a = 1;
            if (t.e.g(oVar, f10, d1VarR, true, g1.f14162b, this) == aVar) {
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
