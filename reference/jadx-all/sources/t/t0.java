package t;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends s0 {
    public final boolean equals(Object obj) {
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            if (d7.a.d(t0Var.f14310a, this.f14310a) && d7.a.d(t0Var.f14311b, this.f14311b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f14310a;
        return this.f14311b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }
}
