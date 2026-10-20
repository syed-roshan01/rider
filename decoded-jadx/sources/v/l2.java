package v;

import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f2 f15669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h1 f15670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u.b2 f15671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y0 f15673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n1.d f15674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0.n1 f15675g = d7.t.g0(Boolean.FALSE, o3.f11621a);

    public l2(f2 f2Var, h1 h1Var, u.b2 b2Var, boolean z10, y0 y0Var, n1.d dVar) {
        this.f15669a = f2Var;
        this.f15670b = h1Var;
        this.f15671c = b2Var;
        this.f15672d = z10;
        this.f15673e = y0Var;
        this.f15674f = dVar;
    }

    public final long a(r1 r1Var, long j10, int i10) {
        u.q2 q2Var = new u.q2(this, i10, r1Var, 1);
        u.b2 b2Var = this.f15671c;
        if (i10 == 4) {
            return ((d1.c) q2Var.invoke(new d1.c(j10))).f4330a;
        }
        return (b2Var == null || !(this.f15669a.d() || this.f15669a.a())) ? ((d1.c) q2Var.invoke(new d1.c(j10))).f4330a : b2Var.a(j10, i10, q2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j10, u8.e eVar) {
        g2 g2Var;
        d9.t tVar;
        if (eVar instanceof g2) {
            g2Var = (g2) eVar;
            int i10 = g2Var.f15566d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g2Var.f15566d = i10 - Integer.MIN_VALUE;
            } else {
                g2Var = new g2(this, eVar);
            }
        } else {
            g2Var = new g2(this, eVar);
        }
        Object obj = g2Var.f15564b;
        v8.a aVar = v8.a.f15963a;
        int i11 = g2Var.f15566d;
        if (i11 == 0) {
            d7.t.v0(obj);
            d9.t tVar2 = new d9.t();
            tVar2.f4951a = j10;
            f2 f2Var = this.f15669a;
            i2 i2Var = new i2(this, tVar2, j10, null);
            g2Var.f15563a = tVar2;
            g2Var.f15566d = 1;
            if (f2Var.c(u.s1.f14928a, i2Var, g2Var) == aVar) {
                return aVar;
            }
            tVar = tVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = g2Var.f15563a;
            d7.t.v0(obj);
        }
        return new m2.p(tVar.f4951a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j10, u8.e eVar) {
        j2 j2Var;
        l2 l2Var;
        if (eVar instanceof j2) {
            j2Var = (j2) eVar;
            int i10 = j2Var.f15649d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j2Var.f15649d = i10 - Integer.MIN_VALUE;
            } else {
                j2Var = new j2(this, eVar);
            }
        } else {
            j2Var = new j2(this, eVar);
        }
        Object obj = j2Var.f15647b;
        v8.a aVar = v8.a.f15963a;
        int i11 = j2Var.f15649d;
        if (i11 == 0) {
            d7.t.v0(obj);
            this.f15675g.setValue(Boolean.TRUE);
            long jA = this.f15670b == h1.f15594b ? m2.p.a(j10, 0.0f, 0.0f, 1) : m2.p.a(j10, 0.0f, 0.0f, 2);
            k2 k2Var = new k2(this, null);
            u.b2 b2Var = this.f15671c;
            if (b2Var == null || !(this.f15669a.d() || this.f15669a.a())) {
                m2.p pVar = new m2.p(jA);
                j2Var.f15646a = this;
                j2Var.f15649d = 2;
                if (k2Var.invoke(pVar, j2Var) == aVar) {
                    return aVar;
                }
            } else {
                j2Var.f15646a = this;
                j2Var.f15649d = 1;
                if (b2Var.d(jA, k2Var, j2Var) == aVar) {
                    return aVar;
                }
            }
            l2Var = this;
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l2Var = j2Var.f15646a;
            d7.t.v0(obj);
        }
        l2Var.f15675g.setValue(Boolean.FALSE);
        return q8.l.f13235a;
    }

    public final long d(float f10) {
        if (f10 != 0.0f) {
            return this.f15670b == h1.f15594b ? d9.i.f(f10, 0.0f) : d9.i.f(0.0f, f10);
        }
        int i10 = d1.c.f4329e;
        return d1.c.f4326b;
    }
}
