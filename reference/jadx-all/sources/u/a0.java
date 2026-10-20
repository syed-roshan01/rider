package u;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x.o f14715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.a f14717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f14718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x.m f14719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f14720f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c9.a aVar, long j10, x.m mVar, a aVar2, u8.e eVar) {
        super(2, eVar);
        this.f14717c = aVar;
        this.f14718d = j10;
        this.f14719e = mVar;
        this.f14720f = aVar2;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new a0(this.f14717c, this.f14718d, this.f14719e, this.f14720f, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        x.o oVar;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14716b;
        if (i10 != 0) {
            if (i10 == 1) {
                d7.t.v0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = this.f14715a;
                d7.t.v0(obj);
            }
            this.f14720f.f14713b = oVar;
            return q8.l.f13235a;
        }
        d7.t.v0(obj);
        if (((Boolean) this.f14717c.invoke()).booleanValue()) {
            long j10 = h0.f14794a;
            this.f14716b = 1;
            if (d7.t.P(j10, this) == aVar) {
                return aVar;
            }
        }
        x.o oVar2 = new x.o(this.f14718d);
        this.f14715a = oVar2;
        this.f14716b = 2;
        if (this.f14719e.a(oVar2, this) == aVar) {
            return aVar;
        }
        oVar = oVar2;
        this.f14720f.f14713b = oVar;
        return q8.l.f13235a;
    }
}
