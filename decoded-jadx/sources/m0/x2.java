package m0;

/* JADX INFO: loaded from: classes.dex */
public final class x2 extends w0.i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11760c;

    public x2(Object obj) {
        this.f11760c = obj;
    }

    @Override // w0.i0
    public final void a(w0.i0 i0Var) {
        d7.a.k(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f11760c = ((x2) i0Var).f11760c;
    }

    @Override // w0.i0
    public final w0.i0 b() {
        return new x2(this.f11760c);
    }
}
