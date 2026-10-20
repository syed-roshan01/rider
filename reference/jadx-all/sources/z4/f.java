package z4;

import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17235e;

    public f(String str, int i10, boolean z10, long j10, String str2) {
        this.f17231a = str;
        this.f17232b = i10;
        this.f17233c = z10;
        this.f17234d = j10;
        this.f17235e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return d7.a.d(this.f17231a, fVar.f17231a) && this.f17232b == fVar.f17232b && this.f17233c == fVar.f17233c && this.f17234d == fVar.f17234d && d7.a.d(this.f17235e, fVar.f17235e);
    }

    public final int hashCode() {
        return this.f17235e.hashCode() + q.b(this.f17234d, q.c(this.f17233c, a7.a.u(this.f17232b, this.f17231a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "RideEntry(appName=" + this.f17231a + ", fare=" + this.f17232b + ", accepted=" + this.f17233c + ", timestamp=" + this.f17234d + ", location=" + this.f17235e + ")";
    }
}
