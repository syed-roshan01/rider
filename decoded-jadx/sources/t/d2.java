package t;

/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f14126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f14127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f14128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f14129d;

    public d2(g0 g0Var) {
        this.f14126a = g0Var;
        g0Var.getClass();
    }

    public final t a(t tVar, t tVar2) {
        if (this.f14129d == null) {
            t tVarC = tVar.c();
            d7.a.k(tVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f14129d = tVarC;
        }
        t tVar3 = this.f14129d;
        if (tVar3 == null) {
            d7.a.D("targetVector");
            throw null;
        }
        int i10 = 0;
        for (int iB = tVar3.b(); i10 < iB; iB = iB) {
            t tVar4 = this.f14129d;
            if (tVar4 == null) {
                d7.a.D("targetVector");
                throw null;
            }
            float fA = tVar.a(i10);
            float fA2 = tVar2.a(i10);
            s.u0 u0Var = ((s.z0) this.f14126a).f13895a;
            double dB = u0Var.b(fA2);
            double d10 = s.v0.f13879a;
            float f10 = u0Var.f13874a * u0Var.f13875b;
            tVar4.e(i10, (Math.signum(fA2) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * dB) * ((double) f10)))) + fA);
            i10++;
        }
        t tVar5 = this.f14129d;
        if (tVar5 != null) {
            return tVar5;
        }
        d7.a.D("targetVector");
        throw null;
    }

    public final t b(long j10, t tVar, t tVar2) {
        if (this.f14128c == null) {
            t tVarC = tVar.c();
            d7.a.k(tVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f14128c = tVarC;
        }
        t tVar3 = this.f14128c;
        if (tVar3 == null) {
            d7.a.D("velocityVector");
            throw null;
        }
        int iB = tVar3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t tVar4 = this.f14128c;
            if (tVar4 == null) {
                d7.a.D("velocityVector");
                throw null;
            }
            tVar.a(i10);
            float fA = tVar2.a(i10);
            s.z0 z0Var = (s.z0) this.f14126a;
            z0Var.getClass();
            long j11 = j10 / 1000000;
            s.t0 t0VarA = z0Var.f13895a.a(fA);
            long j12 = t0VarA.f13870c;
            tVar4.e(i10, (((Math.signum(t0VarA.f13868a) * s.b.a(j12 > 0 ? j11 / j12 : 1.0f).f13740b) * t0VarA.f13869b) / j12) * 1000.0f);
        }
        t tVar5 = this.f14128c;
        if (tVar5 != null) {
            return tVar5;
        }
        d7.a.D("velocityVector");
        throw null;
    }
}
