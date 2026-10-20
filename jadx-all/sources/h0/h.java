package h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.e f7392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.a0 f7394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2.s f7395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a1 f7396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2.e f7398g;

    public h(a2.e eVar, long j10, a2.a0 a0Var, g2.s sVar, a1 a1Var) {
        this.f7392a = eVar;
        this.f7393b = j10;
        this.f7394c = a0Var;
        this.f7395d = sVar;
        this.f7396e = a1Var;
        this.f7397f = j10;
        this.f7398g = eVar;
    }

    public final Integer a() {
        a2.a0 a0Var = this.f7394c;
        if (a0Var == null) {
            return null;
        }
        int iD = a2.b0.d(this.f7397f);
        g2.s sVar = this.f7395d;
        return Integer.valueOf(sVar.a(a0Var.e(a0Var.f(sVar.b(iD)), true)));
    }

    public final Integer b() {
        a2.a0 a0Var = this.f7394c;
        if (a0Var == null) {
            return null;
        }
        int iE = a2.b0.e(this.f7397f);
        g2.s sVar = this.f7395d;
        return Integer.valueOf(sVar.a(a0Var.j(a0Var.f(sVar.b(iE)))));
    }

    public final Integer c() {
        int length;
        a2.a0 a0Var = this.f7394c;
        if (a0Var == null) {
            return null;
        }
        int iM = m();
        while (true) {
            a2.e eVar = this.f7392a;
            if (iM < eVar.f918a.length()) {
                int length2 = this.f7398g.f918a.length() - 1;
                if (iM <= length2) {
                    length2 = iM;
                }
                long jN = a0Var.n(length2);
                int i10 = a2.b0.f904c;
                int i11 = (int) (jN & 4294967295L);
                if (i11 > iM) {
                    length = this.f7395d.a(i11);
                    break;
                }
                iM++;
            } else {
                length = eVar.f918a.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int iA;
        a2.a0 a0Var = this.f7394c;
        if (a0Var == null) {
            return null;
        }
        for (int iM = m(); iM > 0; iM--) {
            int length = this.f7398g.f918a.length() - 1;
            if (iM <= length) {
                length = iM;
            }
            long jN = a0Var.n(length);
            int i10 = a2.b0.f904c;
            int i11 = (int) (jN >> 32);
            if (i11 < iM) {
                iA = this.f7395d.a(i11);
                return Integer.valueOf(iA);
            }
        }
        iA = 0;
        return Integer.valueOf(iA);
    }

    public final boolean e() {
        a2.a0 a0Var = this.f7394c;
        return (a0Var != null ? a0Var.m(m()) : null) != l2.h.f11208b;
    }

    public final int f(a2.a0 a0Var, int i10) {
        int iM = m();
        a1 a1Var = this.f7396e;
        if (a1Var.f7345a == null) {
            a1Var.f7345a = Float.valueOf(a0Var.c(iM).f4332a);
        }
        int iF = a0Var.f(iM) + i10;
        if (iF < 0) {
            return 0;
        }
        if (iF >= a0Var.f894b.f937f) {
            return this.f7398g.f918a.length();
        }
        float fD = a0Var.d(iF) - 1;
        Float f10 = a1Var.f7345a;
        d7.a.j(f10);
        float fFloatValue = f10.floatValue();
        if ((e() && fFloatValue >= a0Var.i(iF)) || (!e() && fFloatValue <= a0Var.h(iF))) {
            return a0Var.e(iF, true);
        }
        return this.f7395d.a(a0Var.l(d9.i.f(f10.floatValue(), fD)));
    }

    public final void g() {
        this.f7396e.f7345a = null;
        a2.e eVar = this.f7398g;
        if (eVar.f918a.length() > 0) {
            int iD = a2.b0.d(this.f7397f);
            String str = eVar.f918a;
            int iG = f6.a.G(iD, str);
            if (iG == a2.b0.d(this.f7397f) && iG != str.length()) {
                iG = f6.a.G(iG + 1, str);
            }
            l(iG, iG);
        }
    }

    public final void h() {
        this.f7396e.f7345a = null;
        a2.e eVar = this.f7398g;
        if (eVar.f918a.length() > 0) {
            int iE = a2.b0.e(this.f7397f);
            String str = eVar.f918a;
            int iH = f6.a.H(iE, str);
            if (iH == a2.b0.e(this.f7397f) && iH != 0) {
                iH = f6.a.H(iH - 1, str);
            }
            l(iH, iH);
        }
    }

    public final void i() {
        Integer numA;
        this.f7396e.f7345a = null;
        if (this.f7398g.f918a.length() <= 0 || (numA = a()) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        l(iIntValue, iIntValue);
    }

    public final void j() {
        Integer numB;
        this.f7396e.f7345a = null;
        if (this.f7398g.f918a.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        l(iIntValue, iIntValue);
    }

    public final void k() {
        if (this.f7398g.f918a.length() > 0) {
            int i10 = a2.b0.f904c;
            this.f7397f = o1.s.g((int) (this.f7393b >> 32), (int) (this.f7397f & 4294967295L));
        }
    }

    public final void l(int i10, int i11) {
        this.f7397f = o1.s.g(i10, i11);
    }

    public final int m() {
        long j10 = this.f7397f;
        int i10 = a2.b0.f904c;
        return this.f7395d.b((int) (j10 & 4294967295L));
    }
}
