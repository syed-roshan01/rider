package h0;

import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7355b;

    public b1(long j10, long j11) {
        this.f7354a = j10;
        this.f7355b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return e1.r.c(this.f7354a, b1Var.f7354a) && e1.r.c(this.f7355b, b1Var.f7355b);
    }

    public final int hashCode() {
        int i10 = e1.r.f5066h;
        return Long.hashCode(this.f7355b) + (Long.hashCode(this.f7354a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        k1.d(this.f7354a, sb, ", selectionBackgroundColor=");
        sb.append((Object) e1.r.i(this.f7355b));
        sb.append(')');
        return sb.toString();
    }
}
