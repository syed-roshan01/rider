package la;

import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f11415b = null;

    public f(Object obj) {
        this.f11414a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.f11414a, fVar.f11414a) && Objects.equals(this.f11415b, fVar.f11415b);
    }

    public final int hashCode() {
        return Objects.hash(this.f11414a, this.f11415b);
    }
}
