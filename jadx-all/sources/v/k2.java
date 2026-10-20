package v;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f15661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l2 f15662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, u8.e eVar) {
        super(2, eVar);
        this.f15662d = l2Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        k2 k2Var = new k2(this.f15662d, eVar);
        k2Var.f15661c = ((m2.p) obj).f11825a;
        return k2Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k2) create(new m2.p(((m2.p) obj).f11825a), (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        long j10;
        Object objB;
        Object objB2;
        long j11;
        long j12;
        Object objA;
        long j13;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15660b;
        l2 l2Var = this.f15662d;
        if (i10 != 0) {
            if (i10 == 1) {
                j10 = this.f15661c;
                d7.t.v0(obj);
                objB = obj;
            } else if (i10 == 2) {
                j11 = this.f15659a;
                j10 = this.f15661c;
                d7.t.v0(obj);
                objB2 = obj;
                j12 = ((m2.p) objB2).f11825a;
                n1.d dVar = l2Var.f15674f;
                long jD = m2.p.d(j11, j12);
                this.f15661c = j10;
                this.f15659a = j12;
                this.f15660b = 3;
                objA = dVar.a(jD, j12, this);
                if (objA == aVar) {
                    return aVar;
                }
                j13 = j10;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j14 = this.f15659a;
                j13 = this.f15661c;
                d7.t.v0(obj);
                j12 = j14;
                objA = obj;
            }
            return new m2.p(m2.p.d(j13, m2.p.d(j12, ((m2.p) objA).f11825a)));
        }
        d7.t.v0(obj);
        j10 = this.f15661c;
        n1.d dVar2 = l2Var.f15674f;
        this.f15661c = j10;
        this.f15660b = 1;
        objB = dVar2.b(j10, this);
        if (objB == aVar) {
            return aVar;
        }
        long jD2 = m2.p.d(j10, ((m2.p) objB).f11825a);
        this.f15661c = j10;
        this.f15659a = jD2;
        this.f15660b = 2;
        objB2 = l2Var.b(jD2, this);
        if (objB2 == aVar) {
            return aVar;
        }
        j11 = jD2;
        j12 = ((m2.p) objB2).f11825a;
        n1.d dVar3 = l2Var.f15674f;
        long jD3 = m2.p.d(j11, j12);
        this.f15661c = j10;
        this.f15659a = j12;
        this.f15660b = 3;
        objA = dVar3.a(jD3, j12, this);
        if (objA == aVar) {
            return aVar;
        }
        j13 = j10;
        return new m2.p(m2.p.d(j13, m2.p.d(j12, ((m2.p) objA).f11825a)));
    }
}
