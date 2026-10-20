package i5;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8065a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f8065a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f8065a.equals(((c) obj).f8065a);
    }

    public final int hashCode() {
        return this.f8065a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a7.a.p(new StringBuilder("Encoding{name=\""), this.f8065a, "\"}");
    }
}
