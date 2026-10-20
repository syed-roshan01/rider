package o9;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f12709a;

    public h(Throwable th) {
        this.f12709a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (d7.a.d(this.f12709a, ((h) obj).f12709a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f12709a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // o9.i
    public final String toString() {
        return "Closed(" + this.f12709a + ')';
    }
}
