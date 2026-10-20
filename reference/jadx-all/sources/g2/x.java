package g2;

/* JADX INFO: loaded from: classes.dex */
public final class x implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6607b;

    public x(int i10, int i11) {
        this.f6606a = i10;
        this.f6607b = i11;
    }

    @Override // g2.i
    public final void a(k kVar) {
        if (kVar.f6574d != -1) {
            kVar.f6574d = -1;
            kVar.f6575e = -1;
        }
        t tVar = kVar.f6571a;
        int iR = z6.a.r(this.f6606a, 0, tVar.a());
        int iR2 = z6.a.r(this.f6607b, 0, tVar.a());
        if (iR != iR2) {
            if (iR < iR2) {
                kVar.e(iR, iR2);
            } else {
                kVar.e(iR2, iR);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f6606a == xVar.f6606a && this.f6607b == xVar.f6607b;
    }

    public final int hashCode() {
        return (this.f6606a * 31) + this.f6607b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f6606a);
        sb.append(", end=");
        return a7.a.o(sb, this.f6607b, ')');
    }
}
