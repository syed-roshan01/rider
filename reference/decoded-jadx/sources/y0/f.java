package y0;

import d7.t;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16721a;

    public f(float f10) {
        this.f16721a = f10;
    }

    public final int a(int i10, int i11) {
        return t.p0((1 + this.f16721a) * ((i11 - i10) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f16721a, ((f) obj).f16721a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16721a);
    }

    public final String toString() {
        return q.l(new StringBuilder("Vertical(bias="), this.f16721a, ')');
    }
}
