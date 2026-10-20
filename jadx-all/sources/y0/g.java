package y0;

import d7.t;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16723c;

    public g(float f10, float f11) {
        this.f16722b = f10;
        this.f16723c = f11;
    }

    public final long a(long j10, long j11, m2.l lVar) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        m2.l lVar2 = m2.l.f11815a;
        float f12 = this.f16722b;
        if (lVar != lVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        return i1.b.c(t.p0((f12 + f13) * f10), t.p0((f13 + this.f16723c) * f11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f16722b, gVar.f16722b) == 0 && Float.compare(this.f16723c, gVar.f16723c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16723c) + (Float.hashCode(this.f16722b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f16722b);
        sb.append(", verticalBias=");
        return q.l(sb, this.f16723c, ')');
    }
}
