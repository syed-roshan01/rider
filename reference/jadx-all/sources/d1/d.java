package d1;

import d7.t;
import d9.i;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f4331e = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4335d;

    public d(float f10, float f11, float f12, float f13) {
        this.f4332a = f10;
        this.f4333b = f11;
        this.f4334c = f12;
        this.f4335d = f13;
    }

    public final long a() {
        return i.f((c() / 2.0f) + this.f4332a, (b() / 2.0f) + this.f4333b);
    }

    public final float b() {
        return this.f4335d - this.f4333b;
    }

    public final float c() {
        return this.f4334c - this.f4332a;
    }

    public final d d(d dVar) {
        return new d(Math.max(this.f4332a, dVar.f4332a), Math.max(this.f4333b, dVar.f4333b), Math.min(this.f4334c, dVar.f4334c), Math.min(this.f4335d, dVar.f4335d));
    }

    public final boolean e(d dVar) {
        return this.f4334c > dVar.f4332a && dVar.f4334c > this.f4332a && this.f4335d > dVar.f4333b && dVar.f4335d > this.f4333b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f4332a, dVar.f4332a) == 0 && Float.compare(this.f4333b, dVar.f4333b) == 0 && Float.compare(this.f4334c, dVar.f4334c) == 0 && Float.compare(this.f4335d, dVar.f4335d) == 0;
    }

    public final d f(float f10, float f11) {
        return new d(this.f4332a + f10, this.f4333b + f11, this.f4334c + f10, this.f4335d + f11);
    }

    public final d g(long j10) {
        return new d(c.d(j10) + this.f4332a, c.e(j10) + this.f4333b, c.d(j10) + this.f4334c, c.e(j10) + this.f4335d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4335d) + q.a(this.f4334c, q.a(this.f4333b, Float.hashCode(this.f4332a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + t.w0(this.f4332a) + ", " + t.w0(this.f4333b) + ", " + t.w0(this.f4334c) + ", " + t.w0(this.f4335d) + ')';
    }
}
