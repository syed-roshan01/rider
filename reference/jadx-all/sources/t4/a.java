package t4;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f6.a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f14647z;

    public a(int i10) {
        this.f14647z = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("px must be > 0.".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (this.f14647z == ((a) obj).f14647z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14647z;
    }

    public final String toString() {
        return String.valueOf(this.f14647z);
    }
}
