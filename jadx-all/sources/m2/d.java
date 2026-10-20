package m2;

import l.q;
import o1.s;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2.a f11797c;

    public d(float f10, float f11, n2.a aVar) {
        this.f11795a = f10;
        this.f11796b = f11;
        this.f11797c = aVar;
    }

    @Override // m2.b
    public final float F(long j10) {
        if (o.a(n.b(j10), 4294967296L)) {
            return this.f11797c.b(n.c(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Override // m2.b
    public final float c() {
        return this.f11795a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f11795a, dVar.f11795a) == 0 && Float.compare(this.f11796b, dVar.f11796b) == 0 && d7.a.d(this.f11797c, dVar.f11797c);
    }

    public final int hashCode() {
        return this.f11797c.hashCode() + q.a(this.f11796b, Float.hashCode(this.f11795a) * 31, 31);
    }

    @Override // m2.b
    public final float m() {
        return this.f11796b;
    }

    @Override // m2.b
    public final long t(float f10) {
        return s.c0(this.f11797c.a(f10), 4294967296L);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f11795a + ", fontScale=" + this.f11796b + ", converter=" + this.f11797c + ')';
    }
}
