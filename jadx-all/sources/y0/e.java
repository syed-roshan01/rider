package y0;

import d7.t;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16720a;

    public e(float f10) {
        this.f16720a = f10;
    }

    public final int a(int i10, int i11, m2.l lVar) {
        float f10 = (i11 - i10) / 2.0f;
        m2.l lVar2 = m2.l.f11815a;
        float f11 = this.f16720a;
        if (lVar != lVar2) {
            f11 *= -1;
        }
        return t.p0((1 + f11) * f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f16720a, ((e) obj).f16720a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16720a);
    }

    public final String toString() {
        return q.l(new StringBuilder("Horizontal(bias="), this.f16720a, ')');
    }
}
