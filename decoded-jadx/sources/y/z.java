package y;

/* JADX INFO: loaded from: classes.dex */
public final class z extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.c f16706a;

    public z(y0.c cVar) {
        this.f16706a = cVar;
    }

    @Override // y.a0
    public final int a(int i10, m2.l lVar) {
        return ((y0.f) this.f16706a).a(0, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && d7.a.d(this.f16706a, ((z) obj).f16706a);
    }

    public final int hashCode() {
        return Float.hashCode(((y0.f) this.f16706a).f16721a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f16706a + ')';
    }
}
