package a2;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f924a;

    public f0(String str) {
        this.f924a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return d7.a.d(this.f924a, ((f0) obj).f924a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f924a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f924a + ')';
    }
}
