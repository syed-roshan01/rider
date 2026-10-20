package o1;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f12364c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(long j10, h0 h0Var, u8.e eVar) {
        super(2, eVar);
        this.f12363b = j10;
        this.f12364c = h0Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new f0(this.f12363b, this.f12364c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        m9.k kVar;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f12362a;
        long j10 = this.f12363b;
        if (i10 != 0) {
            if (i10 == 1) {
                d7.t.v0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            kVar = this.f12364c.f12377c;
            if (kVar != null) {
                kVar.resumeWith(d7.t.N(new m(j10)));
            }
            return q8.l.f13235a;
        }
        d7.t.v0(obj);
        this.f12362a = 1;
        if (d7.t.P(j10 - 1, this) == aVar) {
            return aVar;
        }
        this.f12362a = 2;
        if (d7.t.P(1L, this) == aVar) {
            return aVar;
        }
        kVar = this.f12364c.f12377c;
        if (kVar != null) {
            kVar.resumeWith(d7.t.N(new m(j10)));
        }
        return q8.l.f13235a;
    }
}
