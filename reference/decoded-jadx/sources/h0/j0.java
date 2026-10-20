package h0;

import m0.l3;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f7414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.d f7415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l3 l3Var, t.d dVar, u8.e eVar) {
        super(2, eVar);
        this.f7414c = l3Var;
        this.f7415d = dVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        j0 j0Var = new j0(this.f7414c, this.f7415d, eVar);
        j0Var.f7413b = obj;
        return j0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f7412a;
        if (i10 == 0) {
            d7.t.v0(obj);
            m9.d0 d0Var = (m9.d0) this.f7413b;
            a4.c0 c0VarT0 = d7.t.t0(new z.o(this.f7414c, 4));
            i0 i0Var = new i0(0, this.f7415d, d0Var);
            this.f7412a = 1;
            if (c0VarT0.collect(i0Var, this) == aVar) {
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
