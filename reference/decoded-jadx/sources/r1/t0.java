package r1;

import u1.x1;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends x1 implements s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.c f13413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13414d = o1.s.e(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public t0(c9.c cVar) {
        this.f13413c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        return d7.a.d(this.f13413c, ((t0) obj).f13413c);
    }

    public final int hashCode() {
        return this.f13413c.hashCode();
    }
}
