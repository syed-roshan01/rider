package w0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0.d f16121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16123e;

    public t(p0.d dVar) {
        this.f16121c = dVar;
    }

    @Override // w0.i0
    public final void a(i0 i0Var) {
        synchronized (v.f16125a) {
            d7.a.k(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.f16121c = ((t) i0Var).f16121c;
            this.f16122d = ((t) i0Var).f16122d;
            this.f16123e = ((t) i0Var).f16123e;
        }
    }

    @Override // w0.i0
    public final i0 b() {
        return new t(this.f16121c);
    }
}
