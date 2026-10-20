package u1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static e f15063e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a2.a0 f15064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y1.o f15065d;

    @Override // u1.g
    public final int[] a(int i10) {
        int iG;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            y1.o oVar = this.f15065d;
            if (oVar == null) {
                d7.a.D("node");
                throw null;
            }
            int iP0 = d7.t.p0(oVar.e().b());
            int length = d().length();
            if (length <= i10) {
                i10 = length;
            }
            a2.a0 a0Var = this.f15064c;
            if (a0Var == null) {
                d7.a.D("layoutResult");
                throw null;
            }
            int iF = a0Var.f(i10);
            a2.a0 a0Var2 = this.f15064c;
            if (a0Var2 == null) {
                d7.a.D("layoutResult");
                throw null;
            }
            float fK = a0Var2.k(iF) - iP0;
            if (fK > 0.0f) {
                a2.a0 a0Var3 = this.f15064c;
                if (a0Var3 == null) {
                    d7.a.D("layoutResult");
                    throw null;
                }
                iG = a0Var3.g(fK);
            } else {
                iG = 0;
            }
            if (i10 == d().length() && iG < iF) {
                iG++;
            }
            return c(e(iG, l2.h.f11208b), i10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // u1.g
    public final int[] b(int i10) {
        int iG;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        try {
            y1.o oVar = this.f15065d;
            if (oVar == null) {
                d7.a.D("node");
                throw null;
            }
            int iP0 = d7.t.p0(oVar.e().b());
            if (i10 <= 0) {
                i10 = 0;
            }
            a2.a0 a0Var = this.f15064c;
            if (a0Var == null) {
                d7.a.D("layoutResult");
                throw null;
            }
            int iF = a0Var.f(i10);
            a2.a0 a0Var2 = this.f15064c;
            if (a0Var2 == null) {
                d7.a.D("layoutResult");
                throw null;
            }
            float fK = a0Var2.k(iF) + iP0;
            a2.a0 a0Var3 = this.f15064c;
            if (a0Var3 == null) {
                d7.a.D("layoutResult");
                throw null;
            }
            if (fK < a0Var3.k(a0Var3.f894b.f937f - 1)) {
                a2.a0 a0Var4 = this.f15064c;
                if (a0Var4 == null) {
                    d7.a.D("layoutResult");
                    throw null;
                }
                iG = a0Var4.g(fK);
            } else {
                a2.a0 a0Var5 = this.f15064c;
                if (a0Var5 == null) {
                    d7.a.D("layoutResult");
                    throw null;
                }
                iG = a0Var5.f894b.f937f;
            }
            return c(i10, e(iG - 1, l2.h.f11207a) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i10, l2.h hVar) {
        a2.a0 a0Var = this.f15064c;
        if (a0Var == null) {
            d7.a.D("layoutResult");
            throw null;
        }
        int iJ = a0Var.j(i10);
        a2.a0 a0Var2 = this.f15064c;
        if (a0Var2 == null) {
            d7.a.D("layoutResult");
            throw null;
        }
        if (hVar != a0Var2.m(iJ)) {
            a2.a0 a0Var3 = this.f15064c;
            if (a0Var3 != null) {
                return a0Var3.j(i10);
            }
            d7.a.D("layoutResult");
            throw null;
        }
        a2.a0 a0Var4 = this.f15064c;
        if (a0Var4 != null) {
            return a0Var4.e(i10, false) - 1;
        }
        d7.a.D("layoutResult");
        throw null;
    }
}
