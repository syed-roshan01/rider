package v;

/* JADX INFO: loaded from: classes.dex */
public final class b2 implements n1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f15487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15488b;

    public b2(l2 l2Var, boolean z10) {
        this.f15487a = l2Var;
        this.f15488b = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // n1.a
    public final Object L(long j10, long j11, u8.e eVar) {
        a2 a2Var;
        long jD;
        b2 b2Var;
        if (eVar instanceof a2) {
            a2Var = (a2) eVar;
            int i10 = a2Var.f15476e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a2Var.f15476e = i10 - Integer.MIN_VALUE;
            } else {
                a2Var = new a2(this, eVar);
            }
        } else {
            a2Var = new a2(this, eVar);
        }
        Object objB = a2Var.f15474c;
        v8.a aVar = v8.a.f15963a;
        int i11 = a2Var.f15476e;
        if (i11 == 0) {
            d7.t.v0(objB);
            if (this.f15488b) {
                a2Var.f15472a = this;
                a2Var.f15473b = j11;
                a2Var.f15476e = 1;
                objB = this.f15487a.b(j11, a2Var);
                if (objB == aVar) {
                    return aVar;
                }
                b2Var = this;
            } else {
                jD = m2.p.f11823b;
                b2Var = this;
            }
            m2.p pVar = new m2.p(jD);
            b2Var.f15487a.f15675g.setValue(Boolean.FALSE);
            return pVar;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j11 = a2Var.f15473b;
        b2Var = a2Var.f15472a;
        d7.t.v0(objB);
        jD = m2.p.d(j11, ((m2.p) objB).f11825a);
        m2.p pVar2 = new m2.p(jD);
        b2Var.f15487a.f15675g.setValue(Boolean.FALSE);
        return pVar2;
    }

    @Override // n1.a
    public final long V(long j10, long j11, int i10) {
        if (!this.f15488b) {
            return d1.c.f4326b;
        }
        l2 l2Var = this.f15487a;
        if (l2Var.f15669a.b()) {
            return d1.c.f4326b;
        }
        f2 f2Var = l2Var.f15669a;
        float fD = l2Var.f15670b == h1.f15594b ? d1.c.d(j11) : d1.c.e(j11);
        if (l2Var.f15672d) {
            fD *= -1;
        }
        float fE = f2Var.e(fD);
        if (l2Var.f15672d) {
            fE *= -1;
        }
        return l2Var.d(fE);
    }

    @Override // n1.a
    public final long g0(int i10, long j10) {
        if (i10 == 2) {
            this.f15487a.f15675g.setValue(Boolean.TRUE);
        }
        return d1.c.f4326b;
    }
}
