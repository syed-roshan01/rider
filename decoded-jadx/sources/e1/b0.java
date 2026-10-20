package e1;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1.d f4990e;

    public b0(d1.d dVar) {
        this.f4990e = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return d7.a.d(this.f4990e, ((b0) obj).f4990e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4990e.hashCode();
    }
}
