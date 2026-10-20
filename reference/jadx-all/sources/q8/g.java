package q8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f13227a;

    public g(Throwable th) {
        d7.a.m(th, "exception");
        this.f13227a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (d7.a.d(this.f13227a, ((g) obj).f13227a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13227a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13227a + ')';
    }
}
