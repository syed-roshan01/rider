package k5;

/* JADX INFO: loaded from: classes.dex */
public final class k extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f9833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9834b;

    public k(q qVar, a aVar) {
        this.f9833a = qVar;
        this.f9834b = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        q qVar = this.f9833a;
        if (qVar != null ? qVar.equals(((k) rVar).f9833a) : ((k) rVar).f9833a == null) {
            a aVar = this.f9834b;
            if (aVar == null) {
                if (((k) rVar).f9834b == null) {
                    return true;
                }
            } else if (aVar.equals(((k) rVar).f9834b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        q qVar = this.f9833a;
        int iHashCode = ((qVar == null ? 0 : qVar.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.f9834b;
        return (aVar != null ? aVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f9833a + ", androidClientInfo=" + this.f9834b + "}";
    }
}
