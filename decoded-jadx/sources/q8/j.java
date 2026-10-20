package q8;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13233a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = ((j) obj).f13233a;
        long j11 = this.f13233a ^ Long.MIN_VALUE;
        long j12 = j10 ^ Long.MIN_VALUE;
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f13233a == ((j) obj).f13233a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13233a);
    }

    public final String toString() {
        long j10 = this.f13233a;
        if (j10 >= 0) {
            d7.a.n(10);
            String string = Long.toString(j10, 10);
            d7.a.l(string, "toString(...)");
            return string;
        }
        long j11 = 10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        d7.a.n(10);
        String string2 = Long.toString(j12, 10);
        d7.a.l(string2, "toString(...)");
        d7.a.n(10);
        String string3 = Long.toString(j13, 10);
        d7.a.l(string3, "toString(...)");
        return string2.concat(string3);
    }
}
