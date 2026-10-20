package m0;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends w0.i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f11692c;

    public r2(float f10) {
        this.f11692c = f10;
    }

    @Override // w0.i0
    public final void a(w0.i0 i0Var) {
        d7.a.k(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f11692c = ((r2) i0Var).f11692c;
    }

    @Override // w0.i0
    public final w0.i0 b() {
        return new r2(this.f11692c);
    }
}
