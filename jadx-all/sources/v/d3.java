package v;

/* JADX INFO: loaded from: classes.dex */
public final class d3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.f f15514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f15515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1.u f15516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(c9.f fVar, l1 l1Var, o1.u uVar, u8.e eVar) {
        super(2, eVar);
        this.f15514b = fVar;
        this.f15515c = l1Var;
        this.f15516d = uVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new d3(this.f15514b, this.f15515c, this.f15516d, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d3) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15513a;
        if (i10 == 0) {
            d7.t.v0(obj);
            d1.c cVar = new d1.c(this.f15516d.f12416c);
            this.f15513a = 1;
            if (this.f15514b.e(this.f15515c, cVar, this) == aVar) {
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
