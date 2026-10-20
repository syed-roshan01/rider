package v;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l2 f15619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d9.t f15620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l2 f15624f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d9.t f15625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f15626o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(l2 l2Var, d9.t tVar, long j10, u8.e eVar) {
        super(2, eVar);
        this.f15624f = l2Var;
        this.f15625n = tVar;
        this.f15626o = j10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        i2 i2Var = new i2(this.f15624f, this.f15625n, this.f15626o, eVar);
        i2Var.f15623e = obj;
        return i2Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i2) create((r1) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        l2 l2Var;
        d9.t tVar;
        long j10;
        l2 l2Var2;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15622d;
        h1 h1Var = h1.f15594b;
        if (i10 == 0) {
            d7.t.v0(obj);
            r1 r1Var = (r1) this.f15623e;
            l2Var = this.f15624f;
            h2 h2Var = new h2(l2Var, new u.s(4, l2Var, r1Var));
            y0 y0Var = l2Var.f15673e;
            tVar = this.f15625n;
            long j11 = tVar.f4951a;
            h1 h1Var2 = l2Var.f15670b;
            long j12 = this.f15626o;
            float fB = h1Var2 == h1Var ? m2.p.b(j12) : m2.p.c(j12);
            if (l2Var.f15672d) {
                fB *= -1;
            }
            this.f15623e = l2Var;
            this.f15619a = l2Var;
            this.f15620b = tVar;
            this.f15621c = j11;
            this.f15622d = 1;
            obj = y0Var.a(h2Var, fB, this);
            if (obj == aVar) {
                return aVar;
            }
            j10 = j11;
            l2Var2 = l2Var;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f15621c;
            tVar = this.f15620b;
            l2Var = this.f15619a;
            l2Var2 = (l2) this.f15623e;
            d7.t.v0(obj);
        }
        float fFloatValue = ((Number) obj).floatValue();
        if (l2Var2.f15672d) {
            fFloatValue *= -1;
        }
        tVar.f4951a = l2Var.f15670b == h1Var ? m2.p.a(j10, fFloatValue, 0.0f, 2) : m2.p.a(j10, 0.0f, fFloatValue, 1);
        return q8.l.f13235a;
    }
}
