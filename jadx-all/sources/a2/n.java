package a2;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f956c;

    public n(i2.d dVar, int i10, int i11) {
        this.f954a = dVar;
        this.f955b = i10;
        this.f956c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return d7.a.d(this.f954a, nVar.f954a) && this.f955b == nVar.f955b && this.f956c == nVar.f956c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f956c) + a7.a.u(this.f955b, this.f954a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f954a);
        sb.append(", startIndex=");
        sb.append(this.f955b);
        sb.append(", endIndex=");
        return a7.a.o(sb, this.f956c, ')');
    }
}
