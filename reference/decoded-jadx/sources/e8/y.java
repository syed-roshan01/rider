package e8;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f5403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f5404b;

    public y(x xVar, c2 c2Var) {
        this.f5403a = xVar;
        y3.e.J(c2Var, "status is null");
        this.f5404b = c2Var;
    }

    public static y a(x xVar) {
        y3.e.G("state is TRANSIENT_ERROR. Use forError() instead", xVar != x.f5396c);
        return new y(xVar, c2.f5216e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f5403a.equals(yVar.f5403a) && this.f5404b.equals(yVar.f5404b);
    }

    public final int hashCode() {
        return this.f5403a.hashCode() ^ this.f5404b.hashCode();
    }

    public final String toString() {
        c2 c2Var = this.f5404b;
        boolean zE = c2Var.e();
        x xVar = this.f5403a;
        if (zE) {
            return xVar.toString();
        }
        return xVar + "(" + c2Var + ")";
    }
}
