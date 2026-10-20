package b0;

import java.util.List;
import k0.y0;
import m0.g1;
import m0.h1;
import m0.k1;
import m0.l1;
import m0.n1;
import m0.o3;
import u.s1;
import v.f2;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 implements f2 {
    public final a0.a0 A;
    public final g1 B;
    public final n1 C;
    public final n1 D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f2393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f2394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f2395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n1 f2396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f2397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f2401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v.y f2403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a0.b0 f2406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n1 f2408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m2.b f2409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x.m f2410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l1 f2411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l1 f2412t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a0.d0 f2413u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a0.j f2414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a0.b f2415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n1 f2416x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z.b0 f2417y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f2418z;

    public h0(int i10, float f10) {
        double d10 = f10;
        if (-0.5d > d10 || d10 > 0.5d) {
            throw new IllegalArgumentException(("initialPageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5").toString());
        }
        d1.c cVar = new d1.c(d1.c.f4326b);
        o3 o3Var = o3.f11621a;
        this.f2393a = d7.t.g0(cVar, o3Var);
        this.f2394b = m9.e0.H(0.0f);
        this.f2395c = new s(this);
        Boolean bool = Boolean.FALSE;
        this.f2396d = d7.t.g0(bool, o3Var);
        this.f2397e = new a0(i10, f10, this);
        this.f2398f = i10;
        this.f2400h = Integer.MAX_VALUE;
        this.f2403k = new v.y(new q.w(this, 17));
        this.f2404l = true;
        this.f2405m = -1;
        x xVar = o0.f2451b;
        h1 h1Var = h1.f11552a;
        this.f2408p = d7.t.g0(xVar, h1Var);
        this.f2409q = o0.f2452c;
        this.f2410r = new x.m();
        this.f2411s = o7.d0.Z(-1);
        this.f2412t = o7.d0.Z(i10);
        d7.t.S(o3Var, new c(2, this));
        d7.t.S(o3Var, new c(3, this));
        this.f2413u = new a0.d0();
        this.f2414v = new a0.j();
        this.f2415w = new a0.b();
        this.f2416x = d7.t.g0(null, o3Var);
        this.f2417y = new z.b0(this, 1);
        this.f2418z = o1.s.b(0, 0, 15);
        this.A = new a0.a0();
        this.B = d7.t.g0(q8.l.f13235a, h1Var);
        this.C = d7.t.g0(bool, o3Var);
        this.D = d7.t.g0(bool, o3Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object r(h0 h0Var, s1 s1Var, c9.e eVar, u8.e eVar2) {
        f0 f0Var;
        if (eVar2 instanceof f0) {
            f0Var = (f0) eVar2;
            int i10 = f0Var.f2374f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f0Var.f2374f = i10 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(h0Var, eVar2);
            }
        } else {
            f0Var = new f0(h0Var, eVar2);
        }
        Object obj = f0Var.f2372d;
        v8.a aVar = v8.a.f15963a;
        int i11 = f0Var.f2374f;
        q8.l lVar = q8.l.f13235a;
        if (i11 != 0) {
            if (i11 == 1) {
                eVar = f0Var.f2371c;
                s1Var = f0Var.f2370b;
                h0Var = f0Var.f2369a;
                d7.t.v0(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = f0Var.f2369a;
                d7.t.v0(obj);
            }
            h0Var.f2411s.f(-1);
            return lVar;
        }
        d7.t.v0(obj);
        f0Var.f2369a = h0Var;
        f0Var.f2370b = s1Var;
        f0Var.f2371c = eVar;
        f0Var.f2374f = 1;
        Object objL = h0Var.f2415w.l(f0Var);
        if (objL != aVar) {
            objL = lVar;
        }
        if (objL == aVar) {
            return aVar;
        }
        if (!h0Var.f2403k.b()) {
            h0Var.f2412t.f(h0Var.f2397e.f2318b.d());
        }
        f0Var.f2369a = h0Var;
        f0Var.f2370b = null;
        f0Var.f2371c = null;
        f0Var.f2374f = 2;
        if (h0Var.f2403k.c(s1Var, eVar, f0Var) == aVar) {
            return aVar;
        }
        h0Var.f2411s.f(-1);
        return lVar;
    }

    @Override // v.f2
    public final boolean a() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // v.f2
    public final boolean b() {
        return this.f2403k.b();
    }

    @Override // v.f2
    public final Object c(s1 s1Var, c9.e eVar, u8.e eVar2) {
        return r(this, s1Var, eVar, eVar2);
    }

    @Override // v.f2
    public final boolean d() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // v.f2
    public final float e(float f10) {
        return this.f2403k.e(f10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object f(int i10, float f10, t.n nVar, u8.e eVar) {
        d0 d0Var;
        h0 h0Var;
        t.n nVar2;
        int i11 = i10;
        float f11 = f10;
        if (eVar instanceof d0) {
            d0Var = (d0) eVar;
            int i12 = d0Var.f2355n;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                d0Var.f2355n = i12 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(this, eVar);
            }
        } else {
            d0Var = new d0(this, eVar);
        }
        Object obj = d0Var.f2353e;
        v8.a aVar = v8.a.f15963a;
        int i13 = d0Var.f2355n;
        q8.l lVar = q8.l.f13235a;
        if (i13 != 0) {
            if (i13 == 1) {
                float f12 = d0Var.f2352d;
                int i14 = d0Var.f2351c;
                t.n nVar3 = d0Var.f2350b;
                h0 h0Var2 = d0Var.f2349a;
                d7.t.v0(obj);
                nVar2 = nVar3;
                h0Var = h0Var2;
                f11 = f12;
                i11 = i14;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
        }
        d7.t.v0(obj);
        a0 a0Var = this.f2397e;
        if ((i11 == a0Var.f2318b.d() && a0Var.f2319c.d() == f11) || k() == 0) {
            return lVar;
        }
        d0Var.f2349a = this;
        d0Var.f2350b = nVar;
        d0Var.f2351c = i11;
        d0Var.f2352d = f11;
        d0Var.f2355n = 1;
        Object objL = this.f2415w.l(d0Var);
        if (objL != aVar) {
            objL = lVar;
        }
        if (objL == aVar) {
            return aVar;
        }
        h0Var = this;
        nVar2 = nVar;
        double d10 = f11;
        if (-0.5d > d10 || d10 > 0.5d) {
            throw new IllegalArgumentException(("pageOffsetFraction " + f11 + " is not within the range -0.5 to 0.5").toString());
        }
        int i15 = h0Var.i(i11);
        int iP0 = d7.t.p0(f11 * h0Var.m());
        s sVar = h0Var.f2395c;
        e0 e0Var = new e0(h0Var, i15, sVar, iP0, nVar2, null);
        d0Var.f2349a = null;
        d0Var.f2350b = null;
        d0Var.f2355n = 2;
        Object objC = sVar.f2464a.c(s1.f14928a, e0Var, d0Var);
        if (objC != aVar) {
            objC = lVar;
        }
        return objC == aVar ? aVar : lVar;
    }

    public final void h(x xVar, boolean z10) {
        a0 a0Var = this.f2397e;
        boolean z11 = true;
        if (z10) {
            a0Var.f2319c.f(xVar.f2503k);
        } else {
            a0Var.getClass();
            g gVar = xVar.f2502j;
            a0Var.f2321e = gVar != null ? gVar.f2379e : null;
            boolean z12 = a0Var.f2320d;
            List list = xVar.f2493a;
            if (z12 || (!list.isEmpty())) {
                a0Var.f2320d = true;
                int i10 = gVar != null ? gVar.f2375a : 0;
                float f10 = xVar.f2503k;
                a0Var.f2318b.f(i10);
                a0Var.f2322f.b(i10);
                if (Math.abs(f10) == 0.0f) {
                    f10 = 0.0f;
                }
                a0Var.f2319c.f(f10);
            }
            if (this.f2405m != -1 && (!list.isEmpty())) {
                boolean z13 = this.f2407o;
                int i11 = xVar.f2500h;
                if (this.f2405m != (z13 ? ((g) ((h) r8.p.L0(list))).f2375a + i11 + 1 : (((g) ((h) r8.p.F0(list))).f2375a - i11) - 1)) {
                    this.f2405m = -1;
                    a0.b0 b0Var = this.f2406n;
                    if (b0Var != null) {
                        b0Var.cancel();
                    }
                    this.f2406n = null;
                }
            }
        }
        this.f2408p.setValue(xVar);
        this.C.setValue(Boolean.valueOf(xVar.f2505m));
        g gVar2 = xVar.f2501i;
        if ((gVar2 == null || gVar2.f2375a == 0) && xVar.f2504l == 0) {
            z11 = false;
        }
        this.D.setValue(Boolean.valueOf(z11));
        if (gVar2 != null) {
            this.f2398f = gVar2.f2375a;
        }
        this.f2399g = xVar.f2504l;
        w0.i iVarC = y0.c();
        try {
            w0.i iVarJ = iVarC.j();
            try {
                if (Math.abs(this.f2402j) > 0.5f && this.f2404l && p(this.f2402j)) {
                    q(this.f2402j, xVar);
                }
                w0.i.p(iVarJ);
                iVarC.c();
                int iK = k();
                float f11 = o0.f2450a;
                int i12 = -xVar.f2498f;
                int i13 = xVar.f2494b;
                int i14 = xVar.f2495c;
                int i15 = ((((i13 + i14) * iK) + i12) + xVar.f2496d) - i14;
                v.h1 h1Var = v.h1.f15593a;
                v.h1 h1Var2 = xVar.f2497e;
                r1.k0 k0Var = xVar.f2507o;
                int iE = i15 - ((int) (h1Var2 == h1Var ? o1.s.e(k0Var.b(), k0Var.a()) & 4294967295L : o1.s.e(k0Var.b(), k0Var.a()) >> 32));
                this.f2400h = iE >= 0 ? iE : 0;
            } catch (Throwable th) {
                w0.i.p(iVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            iVarC.c();
            throw th2;
        }
    }

    public final int i(int i10) {
        if (k() > 0) {
            return z6.a.r(i10, 0, k() - 1);
        }
        return 0;
    }

    public final q j() {
        return (q) this.f2408p.getValue();
    }

    public abstract int k();

    public final int l() {
        return ((x) this.f2408p.getValue()).f2494b;
    }

    public final int m() {
        return n() + l();
    }

    public final int n() {
        return ((x) this.f2408p.getValue()).f2495c;
    }

    public final long o() {
        return ((d1.c) this.f2393a.getValue()).f4330a;
    }

    public final boolean p(float f10) {
        if (((x) j()).f2497e != v.h1.f15593a ? Math.signum(f10) != Math.signum(-d1.c.d(o())) : Math.signum(f10) != Math.signum(-d1.c.e(o()))) {
            if (((int) d1.c.d(o())) != 0 || ((int) d1.c.e(o())) != 0) {
                return false;
            }
        }
        return true;
    }

    public final void q(float f10, q qVar) {
        a0.b0 b0Var;
        if (this.f2404l) {
            x xVar = (x) qVar;
            List list = xVar.f2493a;
            if (!list.isEmpty()) {
                boolean z10 = f10 > 0.0f;
                int i10 = xVar.f2500h;
                int i11 = z10 ? ((g) ((h) r8.p.L0(list))).f2375a + i10 + 1 : (((g) ((h) r8.p.F0(list))).f2375a - i10) - 1;
                if (i11 == this.f2405m || i11 < 0 || i11 >= k()) {
                    return;
                }
                if (this.f2407o != z10 && (b0Var = this.f2406n) != null) {
                    b0Var.cancel();
                }
                this.f2407o = z10;
                this.f2405m = i11;
                this.f2406n = this.f2413u.a(i11, this.f2418z);
            }
        }
    }
}
