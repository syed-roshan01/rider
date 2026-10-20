package j0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8274d;

    public h(float f10, float f11, float f12, float f13) {
        this.f8271a = f10;
        this.f8272b = f11;
        this.f8273c = f12;
        this.f8274d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f8271a == hVar.f8271a && this.f8272b == hVar.f8272b && this.f8273c == hVar.f8273c && this.f8274d == hVar.f8274d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8274d) + l.q.a(this.f8273c, l.q.a(this.f8272b, Float.hashCode(this.f8271a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f8271a);
        sb.append(", focusedAlpha=");
        sb.append(this.f8272b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f8273c);
        sb.append(", pressedAlpha=");
        return l.q.l(sb, this.f8274d, ')');
    }
}
