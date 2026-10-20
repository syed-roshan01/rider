package t;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f14232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f14233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f14236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f14237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f14238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f14240i;

    public l1(n nVar, x1 x1Var, Object obj, Object obj2, t tVar) {
        t tVarC;
        z1 z1VarA = nVar.a(x1Var);
        this.f14232a = z1VarA;
        this.f14233b = x1Var;
        this.f14234c = obj;
        this.f14235d = obj2;
        t tVar2 = (t) x1Var.f14351a.invoke(obj);
        this.f14236e = tVar2;
        c9.c cVar = x1Var.f14351a;
        t tVar3 = (t) cVar.invoke(obj2);
        this.f14237f = tVar3;
        if (tVar != null) {
            tVarC = e.j(tVar);
        } else {
            tVarC = ((t) cVar.invoke(obj)).c();
            d7.a.k(tVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        }
        this.f14238g = tVarC;
        this.f14239h = z1VarA.b(tVar2, tVar3, tVarC);
        this.f14240i = z1VarA.g(tVar2, tVar3, tVarC);
    }

    @Override // t.j
    public final boolean a() {
        return this.f14232a.a();
    }

    @Override // t.j
    public final Object b(long j10) {
        if (g(j10)) {
            return this.f14235d;
        }
        t tVarD = this.f14232a.d(j10, this.f14236e, this.f14237f, this.f14238g);
        int iB = tVarD.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (!(!Float.isNaN(tVarD.a(i10)))) {
                throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + tVarD + ". Animation: " + this + ", playTimeNanos: " + j10).toString());
            }
        }
        return this.f14233b.f14352b.invoke(tVarD);
    }

    @Override // t.j
    public final long c() {
        return this.f14239h;
    }

    @Override // t.j
    public final x1 d() {
        return this.f14233b;
    }

    @Override // t.j
    public final Object e() {
        return this.f14235d;
    }

    @Override // t.j
    public final t f(long j10) {
        return !g(j10) ? this.f14232a.c(j10, this.f14236e, this.f14237f, this.f14238g) : this.f14240i;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f14234c + " -> " + this.f14235d + ",initial velocity: " + this.f14238g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f14232a;
    }
}
