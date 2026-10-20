package i1;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7728c;

    public a0(float f10) {
        super(false, false, 3);
        this.f7728c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Float.compare(this.f7728c, ((a0) obj).f7728c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7728c);
    }

    public final String toString() {
        return l.q.l(new StringBuilder("VerticalTo(y="), this.f7728c, ')');
    }
}
