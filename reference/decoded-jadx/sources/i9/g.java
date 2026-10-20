package i9;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f8190d = new g(1, 0, 1);

    @Override // i9.e
    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f8183a == gVar.f8183a) {
                    if (this.f8184b == gVar.f8184b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // i9.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f8183a * 31) + this.f8184b;
    }

    public final boolean i(int i10) {
        return this.f8183a <= i10 && i10 <= this.f8184b;
    }

    @Override // i9.e
    public final boolean isEmpty() {
        return this.f8183a > this.f8184b;
    }

    @Override // i9.e
    public final String toString() {
        return this.f8183a + ".." + this.f8184b;
    }
}
