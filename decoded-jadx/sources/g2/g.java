package g2;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6560b;

    public g(int i10, int i11) {
        this.f6559a = i10;
        this.f6560b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
        }
    }

    @Override // g2.i
    public final void a(k kVar) {
        int i10 = kVar.f6573c;
        int i11 = this.f6560b;
        int iA = i10 + i11;
        int i12 = (i10 ^ iA) & (i11 ^ iA);
        t tVar = kVar.f6571a;
        if (i12 < 0) {
            iA = tVar.a();
        }
        kVar.a(kVar.f6573c, Math.min(iA, tVar.a()));
        int i13 = kVar.f6572b;
        int i14 = this.f6559a;
        int i15 = i13 - i14;
        if (((i13 ^ i15) & (i14 ^ i13)) < 0) {
            i15 = 0;
        }
        kVar.a(Math.max(0, i15), kVar.f6572b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f6559a == gVar.f6559a && this.f6560b == gVar.f6560b;
    }

    public final int hashCode() {
        return (this.f6559a * 31) + this.f6560b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f6559a);
        sb.append(", lengthAfterCursor=");
        return a7.a.o(sb, this.f6560b, ')');
    }
}
