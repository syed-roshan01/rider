package androidx.compose.ui.node;

import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class ForceUpdateElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f1735b;

    public ForceUpdateElement(u0 u0Var) {
        this.f1735b = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateElement) && d7.a.d(this.f1735b, ((ForceUpdateElement) obj).f1735b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1735b.hashCode();
    }

    @Override // t1.u0
    public final n l() {
        throw new IllegalStateException("Shouldn't be called");
    }

    @Override // t1.u0
    public final void m(n nVar) {
        throw new IllegalStateException("Shouldn't be called");
    }

    public final String toString() {
        return "ForceUpdateElement(original=" + this.f1735b + ')';
    }
}
