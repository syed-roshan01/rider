package k5;

/* JADX INFO: loaded from: classes.dex */
public final class o extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f9850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f9851b;

    public o(v vVar, u uVar) {
        this.f9850a = vVar;
        this.f9851b = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        v vVar = this.f9850a;
        if (vVar != null ? vVar.equals(((o) wVar).f9850a) : ((o) wVar).f9850a == null) {
            u uVar = this.f9851b;
            if (uVar == null) {
                if (((o) wVar).f9851b == null) {
                    return true;
                }
            } else if (uVar.equals(((o) wVar).f9851b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        v vVar = this.f9850a;
        int iHashCode = ((vVar == null ? 0 : vVar.hashCode()) ^ 1000003) * 1000003;
        u uVar = this.f9851b;
        return (uVar != null ? uVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f9850a + ", mobileSubtype=" + this.f9851b + "}";
    }
}
