package o1;

import m9.x1;
import u1.y2;
import v.n2;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements m2.b, u8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8.e f12375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f12376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m9.k f12377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f12378d = l.f12401b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f12379e;

    public h0(j0 j0Var, m9.l lVar) {
        this.f12379e = j0Var;
        this.f12375a = lVar;
        this.f12376b = j0Var;
    }

    @Override // m2.b
    public final int E(long j10) {
        return this.f12376b.E(j10);
    }

    @Override // m2.b
    public final float F(long j10) {
        return this.f12376b.F(j10);
    }

    @Override // m2.b
    public final int J(float f10) {
        return this.f12376b.J(f10);
    }

    @Override // m2.b
    public final long S(long j10) {
        return this.f12376b.S(j10);
    }

    @Override // m2.b
    public final float Z(long j10) {
        return this.f12376b.Z(j10);
    }

    public final Object a(l lVar, w8.a aVar) {
        m9.l lVar2 = new m9.l(1, d7.t.b0(aVar));
        lVar2.t();
        this.f12378d = lVar;
        this.f12377c = lVar2;
        Object objS = lVar2.s();
        v8.a aVar2 = v8.a.f15963a;
        return objS;
    }

    @Override // m2.b
    public final float c() {
        return this.f12376b.c();
    }

    @Override // m2.b
    public final long e0(float f10) {
        return this.f12376b.e0(f10);
    }

    public final long f() {
        j0 j0Var = this.f12379e;
        j0Var.getClass();
        long jS = j0Var.S(t1.g.y(j0Var).f1754z.f());
        long j10 = j0Var.A;
        return d7.t.j(Math.max(0.0f, d1.f.d(jS) - ((int) (j10 >> 32))) / 2.0f, Math.max(0.0f, d1.f.b(jS) - ((int) (j10 & 4294967295L))) / 2.0f);
    }

    public final y2 g() {
        j0 j0Var = this.f12379e;
        j0Var.getClass();
        return t1.g.y(j0Var).f1754z;
    }

    @Override // u8.e
    public final u8.j getContext() {
        return u8.k.f15438a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [m9.f1] */
    /* JADX WARN: Type inference failed for: r7v4, types: [m9.f1] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [c9.e] */
    public final Object h(long j10, c9.e eVar, u8.e eVar2) {
        e0 e0Var;
        m9.k kVar;
        if (eVar2 instanceof e0) {
            e0Var = (e0) eVar2;
            int i10 = e0Var.f12359d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                e0Var.f12359d = i10 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, eVar2);
            }
        } else {
            e0Var = new e0(this, eVar2);
        }
        Object objInvoke = e0Var.f12357b;
        v8.a aVar = v8.a.f15963a;
        int i11 = e0Var.f12359d;
        try {
            if (i11 == 0) {
                d7.t.v0(objInvoke);
                if (j10 <= 0 && (kVar = this.f12377c) != null) {
                    kVar.resumeWith(d7.t.N(new m(j10)));
                }
                x1 x1VarQ = z6.a.Q(this.f12379e.v0(), null, 0, new f0(j10, this, null), 3);
                e0Var.f12356a = x1VarQ;
                e0Var.f12359d = 1;
                objInvoke = eVar.invoke(this, e0Var);
                j10 = x1VarQ;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x1 x1Var = e0Var.f12356a;
                d7.t.v0(objInvoke);
                j10 = x1Var;
            }
            j10.a(b.f12347a);
            return objInvoke;
        } catch (Throwable th) {
            j10.a(b.f12347a);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(long j10, n2 n2Var, u8.e eVar) {
        g0 g0Var;
        if (eVar instanceof g0) {
            g0Var = (g0) eVar;
            int i10 = g0Var.f12373c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g0Var.f12373c = i10 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, eVar);
            }
        } else {
            g0Var = new g0(this, eVar);
        }
        Object objH = g0Var.f12371a;
        Object obj = v8.a.f15963a;
        int i11 = g0Var.f12373c;
        try {
            if (i11 == 0) {
                d7.t.v0(objH);
                g0Var.f12373c = 1;
                objH = h(j10, n2Var, g0Var);
                if (objH == obj) {
                    return obj;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(objH);
            }
            return objH;
        } catch (m unused) {
            return null;
        }
    }

    @Override // m2.b
    public final float m() {
        return this.f12376b.m();
    }

    @Override // m2.b
    public final float o0(int i10) {
        return this.f12376b.o0(i10);
    }

    @Override // m2.b
    public final float q0(float f10) {
        return f10 / this.f12376b.c();
    }

    @Override // u8.e
    public final void resumeWith(Object obj) {
        j0 j0Var = this.f12379e;
        synchronized (j0Var.f12394x) {
            j0Var.f12394x.m(this);
        }
        this.f12375a.resumeWith(obj);
    }

    @Override // m2.b
    public final long t(float f10) {
        return this.f12376b.t(f10);
    }

    @Override // m2.b
    public final long u(long j10) {
        return this.f12376b.u(j10);
    }

    @Override // m2.b
    public final float v(float f10) {
        return this.f12376b.c() * f10;
    }
}
