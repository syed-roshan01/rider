package u1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static d f15058d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a2.a0 f15059c;

    @Override // u1.g
    public final int[] a(int i10) {
        int iF;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        int length = d().length();
        l2.h hVar = l2.h.f11207a;
        if (i10 > length) {
            a2.a0 a0Var = this.f15059c;
            if (a0Var == null) {
                d7.a.D("layoutResult");
                throw null;
            }
            iF = a0Var.f(d().length());
        } else {
            a2.a0 a0Var2 = this.f15059c;
            if (a0Var2 == null) {
                d7.a.D("layoutResult");
                throw null;
            }
            int iF2 = a0Var2.f(i10);
            iF = e(iF2, hVar) + 1 == i10 ? iF2 : iF2 - 1;
        }
        if (iF < 0) {
            return null;
        }
        return c(e(iF, l2.h.f11208b), e(iF, hVar) + 1);
    }

    @Override // u1.g
    public final int[] b(int i10) {
        int iF;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        l2.h hVar = l2.h.f11208b;
        if (i10 < 0) {
            a2.a0 a0Var = this.f15059c;
            if (a0Var == null) {
                d7.a.D("layoutResult");
                throw null;
            }
            iF = a0Var.f(0);
        } else {
            a2.a0 a0Var2 = this.f15059c;
            if (a0Var2 == null) {
                d7.a.D("layoutResult");
                throw null;
            }
            int iF2 = a0Var2.f(i10);
            iF = e(iF2, hVar) == i10 ? iF2 : iF2 + 1;
        }
        a2.a0 a0Var3 = this.f15059c;
        if (a0Var3 == null) {
            d7.a.D("layoutResult");
            throw null;
        }
        if (iF >= a0Var3.f894b.f937f) {
            return null;
        }
        return c(e(iF, hVar), e(iF, l2.h.f11207a) + 1);
    }

    public final int e(int i10, l2.h hVar) {
        a2.a0 a0Var = this.f15059c;
        if (a0Var == null) {
            d7.a.D("layoutResult");
            throw null;
        }
        int iJ = a0Var.j(i10);
        a2.a0 a0Var2 = this.f15059c;
        if (a0Var2 == null) {
            d7.a.D("layoutResult");
            throw null;
        }
        if (hVar != a0Var2.m(iJ)) {
            a2.a0 a0Var3 = this.f15059c;
            if (a0Var3 != null) {
                return a0Var3.j(i10);
            }
            d7.a.D("layoutResult");
            throw null;
        }
        a2.a0 a0Var4 = this.f15059c;
        if (a0Var4 != null) {
            return a0Var4.e(i10, false) - 1;
        }
        d7.a.D("layoutResult");
        throw null;
    }
}
