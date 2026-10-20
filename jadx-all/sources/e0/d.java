package e0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4987a;

    public d(float f10) {
        this.f4987a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // e0.b
    public final float a(long j10, m2.b bVar) {
        return (this.f4987a / 100.0f) * d1.f.c(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f4987a, ((d) obj).f4987a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4987a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f4987a + "%)";
    }
}
