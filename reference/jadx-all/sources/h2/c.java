package h2;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7538a;

    public c(a aVar) {
        this.f7538a = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d7.a.d(((a) this.f7538a).f7534a.toLanguageTag(), ((a) ((c) obj).f7538a).f7534a.toLanguageTag());
    }

    public final int hashCode() {
        return ((a) this.f7538a).f7534a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return ((a) this.f7538a).f7534a.toLanguageTag();
    }
}
