package g8;

/* JADX INFO: loaded from: classes.dex */
public final class z4 extends e8.p {
    public final /* synthetic */ y2 A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g5 f7310y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f7311z;

    public z4(y2 y2Var, g5 g5Var) {
        this.A = y2Var;
        this.f7310y = g5Var;
    }

    @Override // o7.d0
    public final void f0(long j10) {
        if (this.A.f7277o.f6706f != null) {
            return;
        }
        synchronized (this.A.f7271i) {
            try {
                if (this.A.f7277o.f6706f == null) {
                    g5 g5Var = this.f7310y;
                    if (!g5Var.f6818b) {
                        long j11 = this.f7311z + j10;
                        this.f7311z = j11;
                        y2 y2Var = this.A;
                        long j12 = y2Var.f7282t;
                        if (j11 <= j12) {
                            return;
                        }
                        if (j11 > y2Var.f7273k) {
                            g5Var.f6819c = true;
                        } else {
                            long jAddAndGet = y2Var.f7272j.f7013a.addAndGet(j11 - j12);
                            y2 y2Var2 = this.A;
                            y2Var2.f7282t = this.f7311z;
                            if (jAddAndGet > y2Var2.f7274l) {
                                this.f7310y.f6819c = true;
                            }
                        }
                        g5 g5Var2 = this.f7310y;
                        b3.a1 a1VarS = g5Var2.f6819c ? this.A.s(g5Var2) : null;
                        if (a1VarS != null) {
                            a1VarS.run();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
