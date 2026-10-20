package d7;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f4909b;

    public q(Class cls, Class cls2) {
        this.f4908a = cls;
        this.f4909b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f4908a.equals(this.f4908a) && qVar.f4909b.equals(this.f4909b);
    }

    public final int hashCode() {
        return Objects.hash(this.f4908a, this.f4909b);
    }

    public final String toString() {
        return this.f4908a.getSimpleName() + " with primitive type: " + this.f4909b.getSimpleName();
    }
}
