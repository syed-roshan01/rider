package i1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7868c;

    public l(float f10) {
        super(false, false, 3);
        this.f7868c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f7868c, ((l) obj).f7868c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7868c);
    }

    public final String toString() {
        return l.q.l(new StringBuilder("HorizontalTo(x="), this.f7868c, ')');
    }
}
