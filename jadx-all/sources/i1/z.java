package i1;

/* JADX INFO: loaded from: classes.dex */
public final class z extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7911c;

    public z(float f10) {
        super(false, false, 3);
        this.f7911c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f7911c, ((z) obj).f7911c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7911c);
    }

    public final String toString() {
        return l.q.l(new StringBuilder("RelativeVerticalTo(dy="), this.f7911c, ')');
    }
}
