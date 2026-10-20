package t;

import m0.l3;
import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class q1 implements l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f14286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.n1 f14287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.n1 f14288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.n1 f14289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.n1 f14290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0.m1 f14291f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m0.n1 f14292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m0.n1 f14293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t f14294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d1 f14295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u1 f14296r;

    public q1(u1 u1Var, Object obj, t tVar, x1 x1Var) {
        this.f14296r = u1Var;
        this.f14286a = x1Var;
        o3 o3Var = o3.f11621a;
        m0.n1 n1VarG0 = d7.t.g0(obj, o3Var);
        this.f14287b = n1VarG0;
        Object objInvoke = null;
        this.f14288c = d7.t.g0(e.r(0.0f, null, 7), o3Var);
        this.f14289d = d7.t.g0(new l1(c(), x1Var, obj, n1VarG0.getValue(), tVar), o3Var);
        this.f14290e = d7.t.g0(Boolean.TRUE, o3Var);
        int i10 = m0.b.f11457b;
        this.f14291f = new m0.m1(0L);
        this.f14292n = d7.t.g0(Boolean.FALSE, o3Var);
        this.f14293o = d7.t.g0(obj, o3Var);
        this.f14294p = tVar;
        Float f10 = (Float) i2.f14207a.get(x1Var);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            t tVar2 = (t) x1Var.f14351a.invoke(obj);
            int iB = tVar2.b();
            for (int i11 = 0; i11 < iB; i11++) {
                tVar2.e(i11, fFloatValue);
            }
            objInvoke = this.f14286a.f14352b.invoke(tVar2);
        }
        this.f14295q = e.r(0.0f, objInvoke, 3);
    }

    public static void d(q1 q1Var, Object obj, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            obj = q1Var.f14293o.getValue();
        }
        Object obj2 = obj;
        e0 e0VarC = ((i10 & 2) == 0 && z10 && !(q1Var.c() instanceof d1)) ? q1Var.f14295q : q1Var.c();
        q1Var.f14289d.setValue(new l1(e0VarC, q1Var.f14286a, obj2, q1Var.f14287b.getValue(), q1Var.f14294p));
        u1 u1Var = q1Var.f14296r;
        u1Var.f14325g.setValue(Boolean.TRUE);
        if (u1Var.d()) {
            w0.u uVar = u1Var.f14326h;
            int size = uVar.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                q1 q1Var2 = (q1) uVar.get(i11);
                jMax = Math.max(jMax, q1Var2.b().f14239h);
                long j10 = u1Var.f14329k;
                q1Var2.f14293o.setValue(q1Var2.b().b(j10));
                q1Var2.f14294p = q1Var2.b().f(j10);
            }
            u1Var.f14325g.setValue(Boolean.FALSE);
        }
    }

    public final l1 b() {
        return (l1) this.f14289d.getValue();
    }

    public final e0 c() {
        return (e0) this.f14288c.getValue();
    }

    public final void e(Object obj, Object obj2, e0 e0Var) {
        this.f14287b.setValue(obj2);
        this.f14288c.setValue(e0Var);
        if (d7.a.d(b().f14234c, obj) && d7.a.d(b().f14235d, obj2)) {
            return;
        }
        d(this, obj, false, 2);
    }

    public final void f(Object obj, e0 e0Var) {
        m0.n1 n1Var = this.f14287b;
        boolean zD = d7.a.d(n1Var.getValue(), obj);
        m0.n1 n1Var2 = this.f14292n;
        if (!zD || ((Boolean) n1Var2.getValue()).booleanValue()) {
            n1Var.setValue(obj);
            this.f14288c.setValue(e0Var);
            m0.n1 n1Var3 = this.f14290e;
            d(this, null, !((Boolean) n1Var3.getValue()).booleanValue(), 1);
            Boolean bool = Boolean.FALSE;
            n1Var3.setValue(bool);
            this.f14291f.f(this.f14296r.f14323e.d());
            n1Var2.setValue(bool);
        }
    }

    @Override // m0.l3
    public final Object getValue() {
        return this.f14293o.getValue();
    }

    public final String toString() {
        return "current value: " + this.f14293o.getValue() + ", target: " + this.f14287b.getValue() + ", spec: " + c();
    }
}
