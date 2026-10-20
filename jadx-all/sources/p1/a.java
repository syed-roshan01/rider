package p1;

import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12742b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12741a == aVar.f12741a && Float.compare(this.f12742b, aVar.f12742b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12742b) + (Long.hashCode(this.f12741a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f12741a);
        sb.append(", dataPoint=");
        return q.l(sb, this.f12742b, ')');
    }
}
