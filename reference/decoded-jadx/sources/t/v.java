package t;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f14331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f14332b;

    public v(double d10, double d11) {
        this.f14331a = d10;
        this.f14332b = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Double.compare(this.f14331a, vVar.f14331a) == 0 && Double.compare(this.f14332b, vVar.f14332b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f14332b) + (Double.hashCode(this.f14331a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f14331a + ", _imaginary=" + this.f14332b + ')';
    }
}
