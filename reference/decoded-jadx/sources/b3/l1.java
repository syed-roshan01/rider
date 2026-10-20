package b3;

/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f2642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u2.c[] f2643b;

    public l1() {
        this(new u1());
    }

    public final void a() {
        u2.c[] cVarArr = this.f2643b;
        if (cVarArr != null) {
            u2.c cVarF = cVarArr[o1.s.T(1)];
            u2.c cVarF2 = this.f2643b[o1.s.T(2)];
            u1 u1Var = this.f2642a;
            if (cVarF2 == null) {
                cVarF2 = u1Var.f2683a.f(2);
            }
            if (cVarF == null) {
                cVarF = u1Var.f2683a.f(1);
            }
            g(u2.c.a(cVarF, cVarF2));
            u2.c cVar = this.f2643b[o1.s.T(16)];
            if (cVar != null) {
                f(cVar);
            }
            u2.c cVar2 = this.f2643b[o1.s.T(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            u2.c cVar3 = this.f2643b[o1.s.T(64)];
            if (cVar3 != null) {
                h(cVar3);
            }
        }
    }

    public abstract u1 b();

    public void c(int i10, u2.c cVar) {
        if (this.f2643b == null) {
            this.f2643b = new u2.c[9];
        }
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f2643b[o1.s.T(i11)] = cVar;
            }
        }
    }

    public void d(u2.c cVar) {
    }

    public abstract void e(u2.c cVar);

    public void f(u2.c cVar) {
    }

    public abstract void g(u2.c cVar);

    public void h(u2.c cVar) {
    }

    public l1(u1 u1Var) {
        this.f2642a = u1Var;
    }
}
