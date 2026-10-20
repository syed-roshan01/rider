package t;

/* JADX INFO: loaded from: classes.dex */
public final class g2 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f14181a;

    public g2(float f10, float f11, t tVar) {
        this.f14181a = new c2(tVar != null ? new a4.c0(f10, f11, tVar) : new a4.c0(f10, f11));
    }

    @Override // t.b2, t.z1
    public final boolean a() {
        this.f14181a.getClass();
        return false;
    }

    @Override // t.z1
    public final long b(t tVar, t tVar2, t tVar3) {
        return this.f14181a.b(tVar, tVar2, tVar3);
    }

    @Override // t.z1
    public final t c(long j10, t tVar, t tVar2, t tVar3) {
        return this.f14181a.c(j10, tVar, tVar2, tVar3);
    }

    @Override // t.z1
    public final t d(long j10, t tVar, t tVar2, t tVar3) {
        return this.f14181a.d(j10, tVar, tVar2, tVar3);
    }

    @Override // t.z1
    public final t g(t tVar, t tVar2, t tVar3) {
        return this.f14181a.g(tVar, tVar2, tVar3);
    }
}
