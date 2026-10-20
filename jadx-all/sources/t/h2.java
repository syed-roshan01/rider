package t;

/* JADX INFO: loaded from: classes.dex */
public final class h2 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f14195c;

    public h2(int i10, int i11, a0 a0Var) {
        this.f14193a = i10;
        this.f14194b = i11;
        this.f14195c = new c2(new i0(i10, i11, a0Var));
    }

    @Override // t.z1
    public final t c(long j10, t tVar, t tVar2, t tVar3) {
        return this.f14195c.c(j10, tVar, tVar2, tVar3);
    }

    @Override // t.z1
    public final t d(long j10, t tVar, t tVar2, t tVar3) {
        return this.f14195c.d(j10, tVar, tVar2, tVar3);
    }

    @Override // t.a2
    public final int e() {
        return this.f14194b;
    }

    @Override // t.a2
    public final int f() {
        return this.f14193a;
    }
}
