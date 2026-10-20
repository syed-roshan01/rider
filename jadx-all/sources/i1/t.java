package i1;

/* JADX INFO: loaded from: classes.dex */
public final class t extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7896c;

    public t(float f10) {
        super(false, false, 3);
        this.f7896c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f7896c, ((t) obj).f7896c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7896c);
    }

    public final String toString() {
        return l.q.l(new StringBuilder("RelativeHorizontalTo(dx="), this.f7896c, ')');
    }
}
