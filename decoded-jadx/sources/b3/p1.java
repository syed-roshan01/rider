package b3;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class p1 extends o1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u2.c f2667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u2.c f2668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u2.c f2669p;

    public p1(u1 u1Var, WindowInsets windowInsets) {
        super(u1Var, windowInsets);
        this.f2667n = null;
        this.f2668o = null;
        this.f2669p = null;
    }

    @Override // b3.r1
    public u2.c h() {
        if (this.f2668o == null) {
            this.f2668o = u2.c.c(this.f2652c.getMandatorySystemGestureInsets());
        }
        return this.f2668o;
    }

    @Override // b3.r1
    public u2.c j() {
        if (this.f2667n == null) {
            this.f2667n = u2.c.c(this.f2652c.getSystemGestureInsets());
        }
        return this.f2667n;
    }

    @Override // b3.r1
    public u2.c l() {
        if (this.f2669p == null) {
            this.f2669p = u2.c.c(this.f2652c.getTappableElementInsets());
        }
        return this.f2669p;
    }

    @Override // b3.m1, b3.r1
    public u1 m(int i10, int i11, int i12, int i13) {
        return u1.c(null, this.f2652c.inset(i10, i11, i12, i13));
    }

    @Override // b3.n1, b3.r1
    public void s(u2.c cVar) {
    }
}
