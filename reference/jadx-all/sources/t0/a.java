package t0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14366a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f14366a == ((a) obj).f14366a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14366a);
    }

    public final String toString() {
        return a7.a.o(new StringBuilder("DeltaCounter(count="), this.f14366a, ')');
    }
}
