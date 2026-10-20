package q8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13228b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13229a;

    public /* synthetic */ h(Object obj) {
        this.f13229a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof g) {
            return ((g) obj).f13227a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return d7.a.d(this.f13229a, ((h) obj).f13229a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13229a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f13229a;
        if (obj instanceof g) {
            return ((g) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
