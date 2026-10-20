package t;

import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f14319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.n1 f14321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.n1 f14322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.m1 f14323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0.m1 f14324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0.n1 f14325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w0.u f14326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w0.u f14327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m0.n1 f14328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f14329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m0.j0 f14330l;

    public u1(x0 x0Var, String str) {
        this.f14319a = x0Var;
        this.f14320b = str;
        Object objB = b();
        o3 o3Var = o3.f11621a;
        this.f14321c = d7.t.g0(objB, o3Var);
        this.f14322d = d7.t.g0(new p1(b(), b()), o3Var);
        int i10 = m0.b.f11457b;
        this.f14323e = new m0.m1(0L);
        this.f14324f = new m0.m1(Long.MIN_VALUE);
        this.f14325g = d7.t.g0(Boolean.TRUE, o3Var);
        this.f14326h = new w0.u();
        this.f14327i = new w0.u();
        this.f14328j = d7.t.g0(Boolean.FALSE, o3Var);
        this.f14330l = d7.t.R(new s.b0(this, 1));
    }

    public final void a(Object obj, m0.m mVar, int i10) {
        int i11;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-1493585151);
        if ((i10 & 14) == 0) {
            i11 = (qVar.g(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= qVar.g(this) ? 32 : 16;
        }
        int i12 = 0;
        if ((i11 & 91) == 18 && qVar.G()) {
            qVar.U();
        } else if (!d()) {
            h(obj, qVar, (i11 & 112) | (i11 & 14));
            if (!d7.a.d(obj, b()) || this.f14324f.d() != Long.MIN_VALUE || ((Boolean) this.f14325g.getValue()).booleanValue()) {
                qVar.Z(-561029496);
                boolean zG = qVar.g(this);
                Object objP = qVar.P();
                if (zG || objP == m0.l.f11578a) {
                    objP = new s1(this, null);
                    qVar.l0(objP);
                }
                qVar.t(false);
                m0.s.b(this, (c9.e) objP, qVar);
            }
        }
        m0.x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new t1(this, obj, i10, i12);
        }
    }

    public final Object b() {
        return ((x0) this.f14319a).f14350b.getValue();
    }

    public final o1 c() {
        return (o1) this.f14322d.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.f14328j.getValue()).booleanValue();
    }

    public final void e(float f10, long j10) {
        long j11;
        m0.m1 m1Var = this.f14324f;
        if (m1Var.d() == Long.MIN_VALUE) {
            m1Var.f(j10);
            this.f14319a.f14334a.setValue(Boolean.TRUE);
        }
        this.f14325g.setValue(Boolean.FALSE);
        long jD = j10 - m1Var.d();
        m0.m1 m1Var2 = this.f14323e;
        m1Var2.f(jD);
        w0.u uVar = this.f14326h;
        int size = uVar.size();
        boolean z10 = true;
        int i10 = 0;
        while (i10 < size) {
            q1 q1Var = (q1) uVar.get(i10);
            boolean zBooleanValue = ((Boolean) q1Var.f14290e.getValue()).booleanValue();
            m0.n1 n1Var = q1Var.f14290e;
            if (zBooleanValue) {
                i10 = i10;
            } else {
                long jD2 = m1Var2.d();
                m0.m1 m1Var3 = q1Var.f14291f;
                if (f10 > 0.0f) {
                    float fD = (jD2 - m1Var3.d()) / f10;
                    if (!(!Float.isNaN(fD))) {
                        throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f10 + ",playTimeNanos: " + jD2 + ", offsetTimeNanos: " + m1Var3.d()).toString());
                    }
                    j11 = (long) fD;
                } else {
                    j11 = q1Var.b().f14239h;
                }
                q1Var.f14293o.setValue(q1Var.b().b(j11));
                q1Var.f14294p = q1Var.b().f(j11);
                if (q1Var.b().g(j11)) {
                    n1Var.setValue(Boolean.TRUE);
                    m1Var3.f(0L);
                }
            }
            if (!((Boolean) n1Var.getValue()).booleanValue()) {
                z10 = false;
            }
            i10++;
        }
        w0.u uVar2 = this.f14327i;
        int size2 = uVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            u1 u1Var = (u1) uVar2.get(i11);
            if (!d7.a.d(u1Var.f14321c.getValue(), u1Var.b())) {
                u1Var.e(f10, m1Var2.d());
            }
            if (!d7.a.d(u1Var.f14321c.getValue(), u1Var.b())) {
                z10 = false;
            }
        }
        if (z10) {
            f();
        }
    }

    public final void f() {
        this.f14324f.f(Long.MIN_VALUE);
        v1 v1Var = this.f14319a;
        if (v1Var instanceof x0) {
            ((x0) v1Var).f14350b.setValue(this.f14321c.getValue());
        }
        this.f14323e.f(0L);
        v1Var.f14334a.setValue(Boolean.FALSE);
    }

    public final void g(Object obj, long j10, Object obj2) {
        this.f14324f.f(Long.MIN_VALUE);
        v1 v1Var = this.f14319a;
        v1Var.f14334a.setValue(Boolean.FALSE);
        boolean zD = d();
        m0.n1 n1Var = this.f14321c;
        if (!zD || !d7.a.d(b(), obj) || !d7.a.d(n1Var.getValue(), obj2)) {
            if (!d7.a.d(b(), obj) && (v1Var instanceof x0)) {
                ((x0) v1Var).f14350b.setValue(obj);
            }
            n1Var.setValue(obj2);
            this.f14328j.setValue(Boolean.TRUE);
            this.f14322d.setValue(new p1(obj, obj2));
        }
        w0.u uVar = this.f14327i;
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            u1 u1Var = (u1) uVar.get(i10);
            d7.a.k(u1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (u1Var.d()) {
                u1Var.g(u1Var.b(), j10, u1Var.f14321c.getValue());
            }
        }
        w0.u uVar2 = this.f14326h;
        int size2 = uVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            q1 q1Var = (q1) uVar2.get(i11);
            q1Var.f14293o.setValue(q1Var.b().b(j10));
            q1Var.f14294p = q1Var.b().f(j10);
        }
        this.f14329k = j10;
    }

    public final void h(Object obj, m0.m mVar, int i10) {
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-583974681);
        int i11 = (i10 & 14) == 0 ? (qVar.g(obj) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i11 |= qVar.g(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && qVar.G()) {
            qVar.U();
        } else if (!d()) {
            m0.n1 n1Var = this.f14321c;
            if (!d7.a.d(n1Var.getValue(), obj)) {
                this.f14322d.setValue(new p1(n1Var.getValue(), obj));
                if (!d7.a.d(b(), n1Var.getValue())) {
                    v1 v1Var = this.f14319a;
                    if (!(v1Var instanceof x0)) {
                        throw new IllegalStateException("Can only update the current state with MutableTransitionState".toString());
                    }
                    ((x0) v1Var).f14350b.setValue(n1Var.getValue());
                }
                n1Var.setValue(obj);
                if (this.f14324f.d() == Long.MIN_VALUE) {
                    this.f14325g.setValue(Boolean.TRUE);
                }
                w0.u uVar = this.f14326h;
                int size = uVar.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((q1) uVar.get(i12)).f14292n.setValue(Boolean.TRUE);
                }
            }
        }
        m0.x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new t1(this, obj, i10, 1);
        }
    }

    public final String toString() {
        w0.u uVar = this.f14326h;
        int size = uVar.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + ((q1) uVar.get(i10)) + ", ";
        }
        return str;
    }
}
