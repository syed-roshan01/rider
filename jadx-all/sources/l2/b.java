package l2;

import e1.j0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f11195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11196b;

    public b(j0 j0Var, float f10) {
        this.f11195a = j0Var;
        this.f11196b = f10;
    }

    @Override // l2.o
    public final float c() {
        return this.f11196b;
    }

    @Override // l2.o
    public final long d() {
        int i10 = e1.r.f5066h;
        return e1.r.f5065g;
    }

    @Override // l2.o
    public final e1.n e() {
        return this.f11195a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return d7.a.d(this.f11195a, bVar.f11195a) && Float.compare(this.f11196b, bVar.f11196b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11196b) + (this.f11195a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f11195a);
        sb.append(", alpha=");
        return l.q.l(sb, this.f11196b, ')');
    }
}
