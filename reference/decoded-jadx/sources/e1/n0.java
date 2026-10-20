package e1;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5052a;

    public n0(long j10) {
        this.f5052a = j10;
    }

    @Override // e1.n
    public final void a(float f10, long j10, g gVar) {
        gVar.c(1.0f);
        long jB = this.f5052a;
        if (f10 != 1.0f) {
            jB = r.b(jB, r.d(jB) * f10);
        }
        gVar.e(jB);
        if (gVar.f5006c != null) {
            gVar.h(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return r.c(this.f5052a, ((n0) obj).f5052a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r.f5066h;
        return Long.hashCode(this.f5052a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) r.i(this.f5052a)) + ')';
    }
}
