package a2;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f922a;

    public e0(String str) {
        this.f922a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return d7.a.d(this.f922a, ((e0) obj).f922a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f922a.hashCode();
    }

    public final String toString() {
        return "UrlAnnotation(url=" + this.f922a + ')';
    }
}
