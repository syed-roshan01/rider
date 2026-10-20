package s4;

import java.util.Map;
import r8.s;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f14046b = new r(s.f13662a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f14047a;

    public r(Map map) {
        this.f14047a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            if (d7.a.d(this.f14047a, ((r) obj).f14047a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14047a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f14047a + ')';
    }
}
