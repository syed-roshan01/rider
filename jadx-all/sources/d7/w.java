package d7;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f4921b;

    public w(Class cls, Class cls2) {
        this.f4920a = cls;
        this.f4921b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return wVar.f4920a.equals(this.f4920a) && wVar.f4921b.equals(this.f4921b);
    }

    public final int hashCode() {
        return Objects.hash(this.f4920a, this.f4921b);
    }

    public final String toString() {
        return this.f4920a.getSimpleName() + " with serialization type: " + this.f4921b.getSimpleName();
    }
}
