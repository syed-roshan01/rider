package a0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f810b;

    public i(int i10, int i11) {
        this.f809a = i10;
        this.f810b = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException("negative start index".toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("end index greater than start".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f809a == iVar.f809a && this.f810b == iVar.f810b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f810b) + (Integer.hashCode(this.f809a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f809a);
        sb.append(", end=");
        return a7.a.o(sb, this.f810b, ')');
    }
}
