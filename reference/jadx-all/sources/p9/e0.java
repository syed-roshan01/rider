package p9;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends q9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m9.l f12889b;

    @Override // q9.d
    public final boolean a(q9.b bVar) {
        c0 c0Var = (c0) bVar;
        if (this.f12888a >= 0) {
            return false;
        }
        long j10 = c0Var.f12875p;
        if (j10 < c0Var.f12876q) {
            c0Var.f12876q = j10;
        }
        this.f12888a = j10;
        return true;
    }

    @Override // q9.d
    public final u8.e[] b(q9.b bVar) {
        long j10 = this.f12888a;
        this.f12888a = -1L;
        this.f12889b = null;
        return ((c0) bVar).u(j10);
    }
}
