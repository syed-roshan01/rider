package w0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0.f f16126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16127d;

    public w(p0.f fVar) {
        this.f16126c = fVar;
    }

    @Override // w0.i0
    public final void a(i0 i0Var) {
        d7.a.k(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        w wVar = (w) i0Var;
        synchronized (y.f16132a) {
            this.f16126c = wVar.f16126c;
            this.f16127d = wVar.f16127d;
        }
    }

    @Override // w0.i0
    public final i0 b() {
        return new w(this.f16126c);
    }
}
