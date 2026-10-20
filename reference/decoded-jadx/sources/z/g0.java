package z;

import java.util.List;
import k0.y0;
import m0.g1;
import m0.h1;
import m0.n1;
import m0.o3;
import r1.a1;
import t.y1;
import u.s1;
import v.f2;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f17046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f17047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n1 f17048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.m f17049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f17050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m2.b f17051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v.y f17052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f17053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a0.b0 f17055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a1 f17057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b0 f17058n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a0.b f17059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f17060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a0.j f17061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f17062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a0.a0 f17063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n1 f17064t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n1 f17065u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g1 f17066v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a0.d0 f17067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m9.d0 f17068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public t.o f17069y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a.a f17044z = new a.a(12, 0);
    public static final v0.p A = m9.e0.F(a0.f17017a, v.f17148c);

    public g0(int i10, int i11) {
        this.f17047c = new z(i10, i11);
        w wVar = j0.f17085b;
        h1 h1Var = h1.f11552a;
        this.f17048d = d7.t.g0(wVar, h1Var);
        this.f17049e = new x.m();
        this.f17051g = new m2.c(1.0f, 1.0f);
        this.f17052h = new v.y(new q.w(this, 14));
        this.f17053i = true;
        this.f17054j = -1;
        this.f17058n = new b0(this, 0);
        this.f17059o = new a0.b();
        this.f17060p = new j();
        this.f17061q = new a0.j();
        this.f17062r = o1.s.b(0, 0, 15);
        this.f17063s = new a0.a0();
        Boolean bool = Boolean.FALSE;
        o3 o3Var = o3.f11621a;
        this.f17064t = d7.t.g0(bool, o3Var);
        this.f17065u = d7.t.g0(bool, o3Var);
        this.f17066v = d7.t.g0(q8.l.f13235a, h1Var);
        this.f17067w = new a0.d0();
        this.f17069y = new t.o(y1.f14355a, Float.valueOf(0.0f), (t.t) t.g1.f14167n.invoke(Float.valueOf(0.0f)), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // v.f2
    public final boolean a() {
        return ((Boolean) this.f17065u.getValue()).booleanValue();
    }

    @Override // v.f2
    public final boolean b() {
        return this.f17052h.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v.f2
    public final Object c(s1 s1Var, c9.e eVar, u8.e eVar2) {
        c0 c0Var;
        g0 g0Var;
        if (eVar2 instanceof c0) {
            c0Var = (c0) eVar2;
            int i10 = c0Var.f17027f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0Var.f17027f = i10 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, eVar2);
            }
        } else {
            c0Var = new c0(this, eVar2);
        }
        Object obj = c0Var.f17025d;
        v8.a aVar = v8.a.f15963a;
        int i11 = c0Var.f17027f;
        if (i11 != 0) {
            if (i11 == 1) {
                eVar = c0Var.f17024c;
                s1Var = c0Var.f17023b;
                g0Var = c0Var.f17022a;
                d7.t.v0(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            return q8.l.f13235a;
        }
        d7.t.v0(obj);
        c0Var.f17022a = this;
        c0Var.f17023b = s1Var;
        c0Var.f17024c = eVar;
        c0Var.f17027f = 1;
        if (this.f17059o.l(c0Var) == aVar) {
            return aVar;
        }
        g0Var = this;
        v.y yVar = g0Var.f17052h;
        c0Var.f17022a = null;
        c0Var.f17023b = null;
        c0Var.f17024c = null;
        c0Var.f17027f = 2;
        if (yVar.c(s1Var, eVar, c0Var) == aVar) {
            return aVar;
        }
        return q8.l.f13235a;
    }

    @Override // v.f2
    public final boolean d() {
        return ((Boolean) this.f17064t.getValue()).booleanValue();
    }

    @Override // v.f2
    public final float e(float f10) {
        return this.f17052h.e(f10);
    }

    public final void f(w wVar, boolean z10, boolean z11) {
        if (!z10 && this.f17045a) {
            this.f17046b = wVar;
            return;
        }
        boolean z12 = true;
        if (z10) {
            this.f17045a = true;
        }
        x xVar = wVar.f17150a;
        z zVar = this.f17047c;
        if (z11) {
            int i10 = wVar.f17151b;
            if (i10 < 0.0f) {
                zVar.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i10 + ')').toString());
            }
            zVar.f17181b.f(i10);
        } else {
            zVar.getClass();
            zVar.f17183d = xVar != null ? xVar.f17170j : null;
            if (zVar.f17182c || wVar.f17159j > 0) {
                zVar.f17182c = true;
                int i11 = wVar.f17151b;
                if (i11 < 0.0f) {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i11 + ')').toString());
                }
                zVar.a(xVar != null ? xVar.f17161a : 0, i11);
            }
            if (this.f17054j != -1) {
                List list = wVar.f17156g;
                if (!list.isEmpty()) {
                    if (this.f17054j != (this.f17056l ? ((x) ((k) r8.p.L0(list))).f17161a + 1 : ((x) ((k) r8.p.F0(list))).f17161a - 1)) {
                        this.f17054j = -1;
                        a0.b0 b0Var = this.f17055k;
                        if (b0Var != null) {
                            b0Var.cancel();
                        }
                        this.f17055k = null;
                    }
                }
            }
        }
        if ((xVar == null || xVar.f17161a == 0) && wVar.f17151b == 0) {
            z12 = false;
        }
        this.f17065u.setValue(Boolean.valueOf(z12));
        this.f17064t.setValue(Boolean.valueOf(wVar.f17152c));
        this.f17050f -= wVar.f17153d;
        this.f17048d.setValue(wVar);
        if (z10) {
            float fV = this.f17051g.v(j0.f17084a);
            float f10 = wVar.f17154e;
            if (f10 <= fV) {
                return;
            }
            w0.i iVarC = y0.c();
            try {
                w0.i iVarJ = iVarC.j();
                try {
                    float fFloatValue = ((Number) this.f17069y.f14264b.getValue()).floatValue();
                    t.o oVar = this.f17069y;
                    if (oVar.f14268f) {
                        this.f17069y = t.e.k(oVar, fFloatValue - f10, 0.0f, 30);
                        m9.d0 d0Var = this.f17068x;
                        if (d0Var != null) {
                            z6.a.Q(d0Var, null, 0, new e0(this, null), 3);
                        }
                    } else {
                        this.f17069y = new t.o(y1.f14355a, Float.valueOf(-f10), null, 60);
                        m9.d0 d0Var2 = this.f17068x;
                        if (d0Var2 != null) {
                            z6.a.Q(d0Var2, null, 0, new f0(this, null), 3);
                        }
                    }
                    w0.i.p(iVarJ);
                    iVarC.c();
                } catch (Throwable th) {
                    w0.i.p(iVarJ);
                    throw th;
                }
            } catch (Throwable th2) {
                iVarC.c();
                throw th2;
            }
        }
    }

    public final void g(float f10, u uVar) {
        a0.b0 b0Var;
        if (this.f17053i && (!((w) uVar).f17156g.isEmpty())) {
            boolean z10 = f10 < 0.0f;
            int i10 = z10 ? ((x) ((k) r8.p.L0(((w) uVar).f17156g))).f17161a + 1 : ((x) ((k) r8.p.F0(((w) uVar).f17156g))).f17161a - 1;
            if (i10 == this.f17054j || i10 < 0 || i10 >= ((w) uVar).f17159j) {
                return;
            }
            if (this.f17056l != z10 && (b0Var = this.f17055k) != null) {
                b0Var.cancel();
            }
            this.f17056l = z10;
            this.f17054j = i10;
            this.f17055k = this.f17067w.a(i10, this.f17062r);
        }
    }
}
