package q8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13226b;

    public f(Object obj, Object obj2) {
        this.f13225a = obj;
        this.f13226b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return d7.a.d(this.f13225a, fVar.f13225a) && d7.a.d(this.f13226b, fVar.f13226b);
    }

    public final int hashCode() {
        Object obj = this.f13225a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f13226b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f13225a + ", " + this.f13226b + ')';
    }
}
