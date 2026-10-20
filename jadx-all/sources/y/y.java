package y;

/* JADX INFO: loaded from: classes.dex */
public final class y extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.b f16702a;

    public y(y0.b bVar) {
        this.f16702a = bVar;
    }

    @Override // y.a0
    public final int a(int i10, m2.l lVar) {
        return ((y0.e) this.f16702a).a(0, i10, lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && d7.a.d(this.f16702a, ((y) obj).f16702a);
    }

    public final int hashCode() {
        return Float.hashCode(((y0.e) this.f16702a).f16720a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f16702a + ')';
    }
}
