package l2;

import o1.s;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f11222c = new q(s.N(0), s.N(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11224b;

    public q(long j10, long j11) {
        this.f11223a = j10;
        this.f11224b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return m2.n.a(this.f11223a, qVar.f11223a) && m2.n.a(this.f11224b, qVar.f11224b);
    }

    public final int hashCode() {
        m2.o[] oVarArr = m2.n.f11819b;
        return Long.hashCode(this.f11224b) + (Long.hashCode(this.f11223a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) m2.n.d(this.f11223a)) + ", restLine=" + ((Object) m2.n.d(this.f11224b)) + ')';
    }
}
