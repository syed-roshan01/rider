package s;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t.e0 f13864b;

    public s0(float f10, t.e0 e0Var) {
        this.f13863a = f10;
        this.f13864b = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Float.compare(this.f13863a, s0Var.f13863a) == 0 && d7.a.d(this.f13864b, s0Var.f13864b);
    }

    public final int hashCode() {
        return this.f13864b.hashCode() + (Float.hashCode(this.f13863a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f13863a + ", animationSpec=" + this.f13864b + ')';
    }
}
