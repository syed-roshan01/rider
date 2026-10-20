package g2;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.e f6509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.b0 f6511c;

    static {
        v0.p pVar = v0.q.f15881a;
    }

    public a0(String str, long j10, int i10) {
        this(new a2.e((i10 & 1) != 0 ? "" : str, null, 6), (i10 & 2) != 0 ? a2.b0.f903b : j10, (a2.b0) null);
    }

    public static a0 a(a0 a0Var, a2.e eVar, long j10, int i10) {
        if ((i10 & 1) != 0) {
            eVar = a0Var.f6509a;
        }
        if ((i10 & 2) != 0) {
            j10 = a0Var.f6510b;
        }
        a2.b0 b0Var = (i10 & 4) != 0 ? a0Var.f6511c : null;
        a0Var.getClass();
        return new a0(eVar, j10, b0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return a2.b0.a(this.f6510b, a0Var.f6510b) && d7.a.d(this.f6511c, a0Var.f6511c) && d7.a.d(this.f6509a, a0Var.f6509a);
    }

    public final int hashCode() {
        int iHashCode = this.f6509a.hashCode() * 31;
        int i10 = a2.b0.f904c;
        int iB = l.q.b(this.f6510b, iHashCode, 31);
        a2.b0 b0Var = this.f6511c;
        return iB + (b0Var != null ? Long.hashCode(b0Var.f905a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f6509a) + "', selection=" + ((Object) a2.b0.g(this.f6510b)) + ", composition=" + this.f6511c + ')';
    }

    public a0(a2.e eVar, long j10, a2.b0 b0Var) {
        a2.b0 b0Var2;
        this.f6509a = eVar;
        int length = eVar.f918a.length();
        int i10 = a2.b0.f904c;
        int i11 = (int) (j10 >> 32);
        int iR = z6.a.r(i11, 0, length);
        int i12 = (int) (j10 & 4294967295L);
        int iR2 = z6.a.r(i12, 0, length);
        this.f6510b = (iR == i11 && iR2 == i12) ? j10 : o1.s.g(iR, iR2);
        if (b0Var != null) {
            int length2 = eVar.f918a.length();
            long j11 = b0Var.f905a;
            int i13 = (int) (j11 >> 32);
            int iR3 = z6.a.r(i13, 0, length2);
            int i14 = (int) (j11 & 4294967295L);
            int iR4 = z6.a.r(i14, 0, length2);
            b0Var2 = new a2.b0((iR3 == i13 && iR4 == i14) ? j11 : o1.s.g(iR3, iR4));
        } else {
            b0Var2 = null;
        }
        this.f6511c = b0Var2;
    }
}
