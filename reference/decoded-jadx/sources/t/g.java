package t;

import m0.l3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f14159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f14160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f14161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object obj, d dVar, l3 l3Var, l3 l3Var2, u8.e eVar) {
        super(2, eVar);
        this.f14158b = obj;
        this.f14159c = dVar;
        this.f14160d = l3Var;
        this.f14161e = l3Var2;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new g(this.f14158b, this.f14159c, this.f14160d, this.f14161e, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14157a;
        d dVar = this.f14159c;
        if (i10 == 0) {
            d7.t.v0(obj);
            Object value = dVar.f14112e.getValue();
            Object obj2 = this.f14158b;
            if (!d7.a.d(obj2, value)) {
                int i11 = i.f14196a;
                n nVar = (n) this.f14160d.getValue();
                this.f14157a = 1;
                if (d.b(dVar, obj2, nVar, this) == aVar) {
                    return aVar;
                }
            }
            return q8.l.f13235a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d7.t.v0(obj);
        int i12 = i.f14196a;
        c9.c cVar = (c9.c) this.f14161e.getValue();
        if (cVar != null) {
            cVar.invoke(dVar.d());
        }
        return q8.l.f13235a;
    }
}
