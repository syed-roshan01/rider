package v;

/* JADX INFO: loaded from: classes.dex */
public final class s extends y0.n implements c0.h, t1.a0 {
    public r1.s A;
    public d1.d B;
    public boolean C;
    public boolean E;
    public final m3 F;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h1 f15765u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f2 f15766v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o f15768x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r1.s f15770z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l f15769y = new l();
    public long D = 0;

    public s(h1 h1Var, f2 f2Var, boolean z10, o oVar) {
        this.f15765u = h1Var;
        this.f15766v = f2Var;
        this.f15767w = z10;
        this.f15768x = oVar;
        this.F = new m3(this.f15768x.b());
    }

    public static final float G0(s sVar) {
        d1.d dVar;
        float fA;
        int iCompare;
        if (m2.k.a(sVar.D, 0L)) {
            return 0.0f;
        }
        o0.i iVar = sVar.f15769y.f15664a;
        int i10 = iVar.f12343c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = iVar.f12341a;
            dVar = null;
            do {
                d1.d dVar2 = (d1.d) ((p) objArr[i11]).f15731a.invoke();
                if (dVar2 != null) {
                    long j10 = d7.t.j(dVar2.c(), dVar2.b());
                    long jM0 = o1.s.m0(sVar.D);
                    int iOrdinal = sVar.f15765u.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(d1.f.b(j10), d1.f.b(jM0));
                    } else {
                        if (iOrdinal != 1) {
                            throw new androidx.fragment.app.a0();
                        }
                        iCompare = Float.compare(d1.f.d(j10), d1.f.d(jM0));
                    }
                    if (iCompare > 0) {
                        if (dVar != null) {
                            break;
                        }
                        dVar = dVar2;
                        break;
                    }
                    dVar = dVar2;
                    i11--;
                } else {
                    i11--;
                }
            } while (i11 >= 0);
        } else {
            dVar = null;
        }
        if (dVar == null) {
            d1.d dVarH0 = sVar.C ? sVar.H0() : null;
            if (dVarH0 == null) {
                return 0.0f;
            }
            dVar = dVarH0;
        }
        long jM1 = o1.s.m0(sVar.D);
        int iOrdinal2 = sVar.f15765u.ordinal();
        if (iOrdinal2 == 0) {
            o oVar = sVar.f15768x;
            float f10 = dVar.f4335d;
            float f11 = dVar.f4333b;
            fA = oVar.a(f11, f10 - f11, d1.f.b(jM1));
        } else {
            if (iOrdinal2 != 1) {
                throw new androidx.fragment.app.a0();
            }
            o oVar2 = sVar.f15768x;
            float f12 = dVar.f4334c;
            float f13 = dVar.f4332a;
            fA = oVar2.a(f13, f12 - f13, d1.f.d(jM1));
        }
        return fA;
    }

    public final d1.d H0() {
        r1.s sVar;
        r1.s sVar2 = this.f15770z;
        if (sVar2 != null) {
            if (!sVar2.L()) {
                sVar2 = null;
            }
            if (sVar2 != null && (sVar = this.A) != null) {
                if (!sVar.L()) {
                    sVar = null;
                }
                if (sVar != null) {
                    return sVar2.b(sVar, false);
                }
            }
        }
        return null;
    }

    public final boolean I0(long j10, d1.d dVar) {
        long jK0 = K0(j10, dVar);
        return Math.abs(d1.c.d(jK0)) <= 0.5f && Math.abs(d1.c.e(jK0)) <= 0.5f;
    }

    public final void J0() {
        if (!(!this.E)) {
            throw new IllegalStateException("launchAnimation called when previous animation was running".toString());
        }
        z6.a.Q(v0(), null, 4, new r(this, null), 1);
    }

    public final long K0(long j10, d1.d dVar) {
        long jM0 = o1.s.m0(j10);
        int iOrdinal = this.f15765u.ordinal();
        if (iOrdinal == 0) {
            o oVar = this.f15768x;
            float f10 = dVar.f4335d;
            float f11 = dVar.f4333b;
            return d9.i.f(0.0f, oVar.a(f11, f10 - f11, d1.f.b(jM0)));
        }
        if (iOrdinal != 1) {
            throw new androidx.fragment.app.a0();
        }
        o oVar2 = this.f15768x;
        float f12 = dVar.f4334c;
        float f13 = dVar.f4332a;
        return d9.i.f(oVar2.a(f13, f12 - f13, d1.f.d(jM0)), 0.0f);
    }

    @Override // t1.a0
    public final void R(t1.c1 c1Var) {
        this.f15770z = c1Var;
    }

    @Override // t1.a0
    public final void p(long j10) {
        int iO;
        d1.d dVarH0;
        long j11 = this.D;
        this.D = j10;
        int iOrdinal = this.f15765u.ordinal();
        if (iOrdinal == 0) {
            iO = d7.a.o((int) (j10 & 4294967295L), (int) (4294967295L & j11));
        } else {
            if (iOrdinal != 1) {
                throw new androidx.fragment.app.a0();
            }
            iO = d7.a.o((int) (j10 >> 32), (int) (j11 >> 32));
        }
        if (iO < 0 && (dVarH0 = H0()) != null) {
            d1.d dVar = this.B;
            if (dVar == null) {
                dVar = dVarH0;
            }
            if (!this.E && !this.C && I0(j11, dVar) && !I0(j10, dVarH0)) {
                this.C = true;
                J0();
            }
            this.B = dVarH0;
        }
    }
}
