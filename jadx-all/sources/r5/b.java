package r5;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l5.j f13481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l5.i f13482c;

    public b(long j10, l5.j jVar, l5.i iVar) {
        this.f13480a = j10;
        if (jVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f13481b = jVar;
        this.f13482c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13480a == bVar.f13480a && this.f13481b.equals(bVar.f13481b) && this.f13482c.equals(bVar.f13482c);
    }

    public final int hashCode() {
        long j10 = this.f13480a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13481b.hashCode()) * 1000003) ^ this.f13482c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f13480a + ", transportContext=" + this.f13481b + ", event=" + this.f13482c + "}";
    }
}
