package g2;

/* JADX INFO: loaded from: classes.dex */
public final class z implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6611b;

    public z(int i10, int i11) {
        this.f6610a = i10;
        this.f6611b = i11;
    }

    @Override // g2.i
    public final void a(k kVar) {
        int iR = z6.a.r(this.f6610a, 0, kVar.f6571a.a());
        int iR2 = z6.a.r(this.f6611b, 0, kVar.f6571a.a());
        if (iR < iR2) {
            kVar.f(iR, iR2);
        } else {
            kVar.f(iR2, iR);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f6610a == zVar.f6610a && this.f6611b == zVar.f6611b;
    }

    public final int hashCode() {
        return (this.f6610a * 31) + this.f6611b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f6610a);
        sb.append(", end=");
        return a7.a.o(sb, this.f6611b, ')');
    }
}
