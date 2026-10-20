package d7;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7.a f4919b;

    public v(Class cls, k7.a aVar) {
        this.f4918a = cls;
        this.f4919b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.f4918a.equals(this.f4918a) && vVar.f4919b.equals(this.f4919b);
    }

    public final int hashCode() {
        return Objects.hash(this.f4918a, this.f4919b);
    }

    public final String toString() {
        return this.f4918a.getSimpleName() + ", object identifier: " + this.f4919b;
    }
}
