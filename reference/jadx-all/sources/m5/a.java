package m5;

import l.q;
import t.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11864b;

    public a(int i10, long j10) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f11863a = i10;
        this.f11864b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.f11863a, aVar.f11863a) && this.f11864b == aVar.f11864b;
    }

    public final int hashCode() {
        int iE = (k.e(this.f11863a) ^ 1000003) * 1000003;
        long j10 = this.f11864b;
        return iE ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "BackendResponse{status=" + q.z(this.f11863a) + ", nextRequestWaitMillis=" + this.f11864b + "}";
    }
}
