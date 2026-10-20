package v;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1.z f15629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c9.f f15630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c9.c f15631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c9.c f15632f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c9.c f15633n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(o1.z zVar, u8.e eVar, c9.c cVar, c9.c cVar2, c9.c cVar3, c9.f fVar) {
        super(2, eVar);
        this.f15629c = zVar;
        this.f15630d = fVar;
        this.f15631e = cVar;
        this.f15632f = cVar2;
        this.f15633n = cVar3;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        i3 i3Var = new i3(this.f15629c, eVar, this.f15631e, this.f15632f, this.f15633n, this.f15630d);
        i3Var.f15628b = obj;
        return i3Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i3) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15627a;
        if (i10 == 0) {
            d7.t.v0(obj);
            m9.d0 d0Var = (m9.d0) this.f15628b;
            o1.z zVar = this.f15629c;
            h3 h3Var = new h3(d0Var, this.f15630d, this.f15631e, this.f15632f, this.f15633n, new l1(zVar), null);
            this.f15627a = 1;
            if (m9.e0.q(zVar, h3Var, this) == aVar) {
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
