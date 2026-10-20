package m0;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends w0.i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11708c;

    public t2(int i10) {
        this.f11708c = i10;
    }

    @Override // w0.i0
    public final void a(w0.i0 i0Var) {
        d7.a.k(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f11708c = ((t2) i0Var).f11708c;
    }

    @Override // w0.i0
    public final w0.i0 b() {
        return new t2(this.f11708c);
    }
}
