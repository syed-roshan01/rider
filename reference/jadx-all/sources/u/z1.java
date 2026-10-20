package u;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.t0 f15000b;

    public z1() {
        long jC = androidx.compose.ui.graphics.a.c(4284900966L);
        y.u0 u0VarA = androidx.compose.foundation.layout.a.a(0.0f, 3);
        this.f14999a = jC;
        this.f15000b = u0VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d7.a.d(z1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        d7.a.k(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        z1 z1Var = (z1) obj;
        return e1.r.c(this.f14999a, z1Var.f14999a) && d7.a.d(this.f15000b, z1Var.f15000b);
    }

    public final int hashCode() {
        int i10 = e1.r.f5066h;
        return this.f15000b.hashCode() + (Long.hashCode(this.f14999a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        k1.d(this.f14999a, sb, ", drawPadding=");
        sb.append(this.f15000b);
        sb.append(')');
        return sb.toString();
    }
}
