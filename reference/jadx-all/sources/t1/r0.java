package t1;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 extends q0 implements r1.i0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c1 f14536p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinkedHashMap f14538r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r1.k0 f14540t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f14537q = m2.i.f11807b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r1.h0 f14539s = new r1.h0(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f14541u = new LinkedHashMap();

    public r0(c1 c1Var) {
        this.f14536p = c1Var;
    }

    public static final void y0(r0 r0Var, r1.k0 k0Var) {
        q8.l lVar;
        LinkedHashMap linkedHashMap;
        if (k0Var != null) {
            r0Var.getClass();
            r0Var.g0(o1.s.e(k0Var.b(), k0Var.a()));
            lVar = q8.l.f13235a;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            r0Var.g0(0L);
        }
        if (!d7.a.d(r0Var.f14540t, k0Var) && k0Var != null && ((((linkedHashMap = r0Var.f14538r) != null && !linkedHashMap.isEmpty()) || (!k0Var.d().isEmpty())) && !d7.a.d(k0Var.d(), r0Var.f14538r))) {
            k0 k0Var2 = r0Var.f14536p.f14395p.D.f14509p;
            d7.a.j(k0Var2);
            k0Var2.f14473w.g();
            LinkedHashMap linkedHashMap2 = r0Var.f14538r;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                r0Var.f14538r = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(k0Var.d());
        }
        r0Var.f14540t = k0Var;
    }

    @Override // r1.m0, r1.p
    public final Object a() {
        return this.f14536p.a();
    }

    @Override // m2.b
    public final float c() {
        return this.f14536p.c();
    }

    @Override // r1.x0
    public final void d0(long j10, float f10, c9.c cVar) {
        if (!m2.i.a(this.f14537q, j10)) {
            this.f14537q = j10;
            c1 c1Var = this.f14536p;
            k0 k0Var = c1Var.f14395p.D.f14509p;
            if (k0Var != null) {
                k0Var.r0();
            }
            q0.w0(c1Var);
        }
        if (this.f14531f) {
        }
        w wVar = (w) this;
        switch (wVar.f14567v) {
            case 0:
                k0 k0Var2 = wVar.f14536p.f14395p.D.f14509p;
                d7.a.j(k0Var2);
                k0Var2.v0();
                break;
            default:
                wVar.s0().e();
                break;
        }
    }

    @Override // r1.q
    public final m2.l getLayoutDirection() {
        return this.f14536p.f14395p.f1753y;
    }

    @Override // m2.b
    public final float m() {
        return this.f14536p.m();
    }

    @Override // t1.q0
    public final q0 m0() {
        c1 c1Var = this.f14536p.f14396q;
        if (c1Var != null) {
            return c1Var.I0();
        }
        return null;
    }

    @Override // t1.q0, r1.q
    public final boolean q() {
        return true;
    }

    @Override // t1.q0
    public final boolean r0() {
        return this.f14540t != null;
    }

    @Override // t1.q0
    public final r1.k0 s0() {
        r1.k0 k0Var = this.f14540t;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // t1.q0
    public final long v0() {
        return this.f14537q;
    }

    @Override // t1.q0
    public final void x0() {
        d0(this.f14537q, 0.0f, null);
    }

    public final long z0(r0 r0Var) {
        long jC = m2.i.f11807b;
        r0 r0VarI0 = this;
        while (!d7.a.d(r0VarI0, r0Var)) {
            long j10 = r0VarI0.f14537q;
            jC = i1.b.c(((int) (jC >> 32)) + ((int) (j10 >> 32)), ((int) (jC & 4294967295L)) + ((int) (j10 & 4294967295L)));
            c1 c1Var = r0VarI0.f14536p.f14397r;
            d7.a.j(c1Var);
            r0VarI0 = c1Var.I0();
            d7.a.j(r0VarI0);
        }
        return jC;
    }
}
