package f1;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6027c;

    public d(String str, long j10, int i10) {
        this.f6025a = str;
        this.f6026b = j10;
        this.f6027c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i10);

    public abstract float b(int i10);

    public boolean c() {
        return false;
    }

    public abstract long d(float f10, float f11, float f12);

    public abstract float e(float f10, float f11, float f12);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f6027c == dVar.f6027c && d7.a.d(this.f6025a, dVar.f6025a)) {
            return c.a(this.f6026b, dVar.f6026b);
        }
        return false;
    }

    public abstract long f(float f10, float f11, float f12, float f13, d dVar);

    public int hashCode() {
        int iHashCode = this.f6025a.hashCode() * 31;
        int i10 = c.f6024e;
        return l.q.b(this.f6026b, iHashCode, 31) + this.f6027c;
    }

    public final String toString() {
        return this.f6025a + " (id=" + this.f6027c + ", model=" + ((Object) c.b(this.f6026b)) + ')';
    }
}
