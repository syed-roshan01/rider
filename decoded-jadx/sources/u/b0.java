package u;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v.l1 f14732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x.m f14734f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a f14735n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c9.a f14736o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(v.l1 l1Var, long j10, x.m mVar, a aVar, c9.a aVar2, u8.e eVar) {
        super(2, eVar);
        this.f14732d = l1Var;
        this.f14733e = j10;
        this.f14734f = mVar;
        this.f14735n = aVar;
        this.f14736o = aVar2;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        b0 b0Var = new b0(this.f14732d, this.f14733e, this.f14734f, this.f14735n, this.f14736o, eVar);
        b0Var.f14731c = obj;
        return b0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[RETURN] */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        m9.f1 f1VarQ;
        Object objB;
        boolean z10;
        x.o oVar;
        x.p pVar;
        x.p pVar2;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14730b;
        q8.l lVar = q8.l.f13235a;
        a aVar2 = this.f14735n;
        x.m mVar = this.f14734f;
        if (i10 != 0) {
            if (i10 == 1) {
                f1VarQ = (m9.f1) this.f14731c;
                d7.t.v0(obj);
                objB = obj;
            } else if (i10 == 2) {
                z10 = this.f14729a;
                d7.t.v0(obj);
                if (z10) {
                    oVar = new x.o(this.f14733e);
                    pVar = new x.p(oVar);
                    this.f14731c = pVar;
                    this.f14730b = 3;
                    if (mVar.a(oVar, this) == aVar) {
                        return aVar;
                    }
                    pVar2 = pVar;
                    this.f14731c = null;
                    this.f14730b = 4;
                    if (mVar.a(pVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i10 == 3) {
                pVar2 = (x.p) this.f14731c;
                d7.t.v0(obj);
                this.f14731c = null;
                this.f14730b = 4;
                if (mVar.a(pVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            aVar2.f14713b = null;
            return lVar;
        }
        d7.t.v0(obj);
        f1VarQ = z6.a.Q((m9.d0) this.f14731c, null, 0, new a0(this.f14736o, this.f14733e, this.f14734f, this.f14735n, null), 3);
        this.f14731c = f1VarQ;
        this.f14730b = 1;
        objB = this.f14732d.b(this);
        if (objB == aVar) {
            return aVar;
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        if (f1VarQ.b()) {
            this.f14731c = null;
            this.f14729a = zBooleanValue;
            this.f14730b = 2;
            f1VarQ.a(null);
            Object objW = ((m9.p1) f1VarQ).W(this);
            if (objW != aVar) {
                objW = lVar;
            }
            if (objW == aVar) {
                return aVar;
            }
            z10 = zBooleanValue;
            if (z10) {
                oVar = new x.o(this.f14733e);
                pVar = new x.p(oVar);
                this.f14731c = pVar;
                this.f14730b = 3;
                if (mVar.a(oVar, this) == aVar) {
                    return aVar;
                }
                pVar2 = pVar;
                this.f14731c = null;
                this.f14730b = 4;
                if (mVar.a(pVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            x.o oVar2 = aVar2.f14713b;
            if (oVar2 != null) {
                x.k pVar3 = zBooleanValue ? new x.p(oVar2) : new x.n(oVar2);
                this.f14731c = null;
                this.f14730b = 5;
                if (mVar.a(pVar3, this) == aVar) {
                    return aVar;
                }
            }
        }
        aVar2.f14713b = null;
        return lVar;
    }
}
