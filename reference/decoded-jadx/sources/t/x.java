package t;

/* JADX INFO: loaded from: classes.dex */
public final class x implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f14342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f14343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f14345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f14346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f14347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f14348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14349h;

    public x(y yVar, x1 x1Var, Object obj, t tVar) {
        d2 d2Var = new d2(yVar.f14353a);
        this.f14342a = d2Var;
        this.f14343b = x1Var;
        this.f14344c = obj;
        t tVar2 = (t) x1Var.f14351a.invoke(obj);
        this.f14345d = tVar2;
        this.f14346e = e.j(tVar);
        this.f14348g = x1Var.f14352b.invoke(d2Var.a(tVar2, tVar));
        if (d2Var.f14128c == null) {
            t tVarC = tVar2.c();
            d7.a.k(tVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            d2Var.f14128c = tVarC;
        }
        t tVar3 = d2Var.f14128c;
        if (tVar3 == null) {
            d7.a.D("velocityVector");
            throw null;
        }
        int iB = tVar3.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            tVar2.a(i10);
            jMax = Math.max(jMax, ((long) (Math.exp(((s.z0) d2Var.f14126a).f13895a.b(tVar.a(i10)) / (((double) s.v0.f13879a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f14349h = jMax;
        t tVarJ = e.j(this.f14342a.b(jMax, this.f14345d, tVar));
        this.f14347f = tVarJ;
        int iB2 = tVarJ.b();
        for (int i11 = 0; i11 < iB2; i11++) {
            t tVar4 = this.f14347f;
            float fA = tVar4.a(i11);
            this.f14342a.getClass();
            this.f14342a.getClass();
            tVar4.e(i11, z6.a.q(fA, -0.0f, 0.0f));
        }
    }

    @Override // t.j
    public final boolean a() {
        return false;
    }

    @Override // t.j
    public final Object b(long j10) {
        if (g(j10)) {
            return this.f14348g;
        }
        c9.c cVar = this.f14343b.f14352b;
        d2 d2Var = this.f14342a;
        t tVar = d2Var.f14127b;
        t tVar2 = this.f14345d;
        if (tVar == null) {
            t tVarC = tVar2.c();
            d7.a.k(tVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            d2Var.f14127b = tVarC;
        }
        t tVar3 = d2Var.f14127b;
        String str = "valueVector";
        if (tVar3 == null) {
            d7.a.D("valueVector");
            throw null;
        }
        int iB = tVar3.b();
        int i10 = 0;
        while (i10 < iB) {
            t tVar4 = d2Var.f14127b;
            if (tVar4 == null) {
                d7.a.D(str);
                throw null;
            }
            float fA = tVar2.a(i10);
            float fA2 = this.f14346e.a(i10);
            s.z0 z0Var = (s.z0) d2Var.f14126a;
            z0Var.getClass();
            long j11 = j10 / 1000000;
            s.t0 t0VarA = z0Var.f13895a.a(fA2);
            String str2 = str;
            long j12 = t0VarA.f13870c;
            tVar4.e(i10, (Math.signum(t0VarA.f13868a) * t0VarA.f13869b * s.b.a(j12 > 0 ? j11 / j12 : 1.0f).f13739a) + fA);
            i10++;
            str = str2;
        }
        String str3 = str;
        t tVar5 = d2Var.f14127b;
        if (tVar5 != null) {
            return cVar.invoke(tVar5);
        }
        d7.a.D(str3);
        throw null;
    }

    @Override // t.j
    public final long c() {
        return this.f14349h;
    }

    @Override // t.j
    public final x1 d() {
        return this.f14343b;
    }

    @Override // t.j
    public final Object e() {
        return this.f14348g;
    }

    @Override // t.j
    public final t f(long j10) {
        if (g(j10)) {
            return this.f14347f;
        }
        return this.f14342a.b(j10, this.f14345d, this.f14346e);
    }
}
