package t;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9.u f14200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f14202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f14203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f14204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f14205f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c9.c f14206n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(d9.u uVar, Object obj, j jVar, t tVar, o oVar, float f10, c9.c cVar) {
        super(1);
        this.f14200a = uVar;
        this.f14201b = obj;
        this.f14202c = jVar;
        this.f14203d = tVar;
        this.f14204e = oVar;
        this.f14205f = f10;
        this.f14206n = cVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.f14201b;
        j jVar = this.f14202c;
        m mVar = new m(obj2, jVar.d(), this.f14203d, jLongValue, jVar.e(), jLongValue, new h1(this.f14204e, 0));
        e.n(mVar, jLongValue, this.f14205f, this.f14202c, this.f14204e, this.f14206n);
        this.f14200a.f4952a = mVar;
        return q8.l.f13235a;
    }
}
