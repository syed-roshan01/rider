package y;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16685d;

    public u0(float f10, float f11, float f12, float f13) {
        this.f16682a = f10;
        this.f16683b = f11;
        this.f16684c = f12;
        this.f16685d = f13;
    }

    @Override // y.t0
    public final float a(m2.l lVar) {
        return lVar == m2.l.f11815a ? this.f16682a : this.f16684c;
    }

    @Override // y.t0
    public final float b(m2.l lVar) {
        return lVar == m2.l.f11815a ? this.f16684c : this.f16682a;
    }

    @Override // y.t0
    public final float c() {
        return this.f16685d;
    }

    @Override // y.t0
    public final float d() {
        return this.f16683b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return m2.e.a(this.f16682a, u0Var.f16682a) && m2.e.a(this.f16683b, u0Var.f16683b) && m2.e.a(this.f16684c, u0Var.f16684c) && m2.e.a(this.f16685d, u0Var.f16685d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f16685d) + l.q.a(this.f16684c, l.q.a(this.f16683b, Float.hashCode(this.f16682a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) m2.e.b(this.f16682a)) + ", top=" + ((Object) m2.e.b(this.f16683b)) + ", end=" + ((Object) m2.e.b(this.f16684c)) + ", bottom=" + ((Object) m2.e.b(this.f16685d)) + ')';
    }
}
