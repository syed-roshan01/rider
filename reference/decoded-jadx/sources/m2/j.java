package m2;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11813d;

    public j(int i10, int i11, int i12, int i13) {
        this.f11810a = i10;
        this.f11811b = i11;
        this.f11812c = i12;
        this.f11813d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f11810a == jVar.f11810a && this.f11811b == jVar.f11811b && this.f11812c == jVar.f11812c && this.f11813d == jVar.f11813d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11813d) + a7.a.u(this.f11812c, a7.a.u(this.f11811b, Integer.hashCode(this.f11810a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f11810a);
        sb.append(", ");
        sb.append(this.f11811b);
        sb.append(", ");
        sb.append(this.f11812c);
        sb.append(", ");
        return a7.a.o(sb, this.f11813d, ')');
    }
}
