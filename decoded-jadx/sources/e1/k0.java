package e1;

import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f5038d = new k0(0L, 0.0f, 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f5041c;

    public k0(long j10, long j11, float f10) {
        this.f5039a = j10;
        this.f5040b = j11;
        this.f5041c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return r.c(this.f5039a, k0Var.f5039a) && d1.c.b(this.f5040b, k0Var.f5040b) && this.f5041c == k0Var.f5041c;
    }

    public final int hashCode() {
        int i10 = r.f5066h;
        int iHashCode = Long.hashCode(this.f5039a) * 31;
        int i11 = d1.c.f4329e;
        return Float.hashCode(this.f5041c) + l.q.b(this.f5040b, iHashCode, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        k1.d(this.f5039a, sb, ", offset=");
        sb.append((Object) d1.c.i(this.f5040b));
        sb.append(", blurRadius=");
        return l.q.l(sb, this.f5041c, ')');
    }

    public k0(long j10, float f10, int i10) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.a.c(4278190080L) : j10, (i10 & 2) != 0 ? d1.c.f4326b : 0L, (i10 & 4) != 0 ? 0.0f : f10);
    }
}
