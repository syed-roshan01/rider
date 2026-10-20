package v;

/* JADX INFO: loaded from: classes.dex */
public final class g3 extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m9.d0 f15569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c9.c f15570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c9.c f15571f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d9.u f15572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l1 f15573o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(m9.d0 d0Var, c9.c cVar, c9.c cVar2, d9.u uVar, l1 l1Var, u8.e eVar) {
        super(eVar);
        this.f15569d = d0Var;
        this.f15570e = cVar;
        this.f15571f = cVar2;
        this.f15572n = uVar;
        this.f15573o = l1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        g3 g3Var = new g3(this.f15569d, this.f15570e, this.f15571f, this.f15572n, this.f15573o, eVar);
        g3Var.f15568c = obj;
        return g3Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g3) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15567b;
        if (i10 == 0) {
            d7.t.v0(obj);
            o1.h0 h0Var = (o1.h0) this.f15568c;
            this.f15567b = 1;
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
        o1.u uVar = (o1.u) obj;
        q8.l lVar = q8.l.f13235a;
        m9.d0 d0Var = this.f15569d;
        l1 l1Var = this.f15573o;
        if (uVar != null) {
            uVar.a();
            z6.a.Q(d0Var, null, 0, new e3(l1Var, null), 3);
            this.f15570e.invoke(new d1.c(uVar.f12416c));
            return lVar;
        }
        z6.a.Q(d0Var, null, 0, new f3(l1Var, null), 3);
        c9.c cVar = this.f15571f;
        if (cVar == null) {
            return null;
        }
        cVar.invoke(new d1.c(((o1.u) this.f15572n.f4952a).f12416c));
        return lVar;
    }
}
