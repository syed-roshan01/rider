package m0;

/* JADX INFO: loaded from: classes.dex */
public final class v2 extends w0.i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11719c;

    public v2(long j10) {
        this.f11719c = j10;
    }

    @Override // w0.i0
    public final void a(w0.i0 i0Var) {
        d7.a.k(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f11719c = ((v2) i0Var).f11719c;
    }

    @Override // w0.i0
    public final w0.i0 b() {
        return new v2(this.f11719c);
    }
}
