package o9;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f12710b = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12711a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return d7.a.d(this.f12711a, ((j) obj).f12711a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f12711a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f12711a;
        if (obj instanceof h) {
            return ((h) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
