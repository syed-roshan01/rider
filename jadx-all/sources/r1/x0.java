package r1;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13425c = o1.s.e(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13426d = z0.f13439a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13427e;

    public x0() {
        int i10 = m2.i.f11808c;
        this.f13427e = m2.i.f11807b;
    }

    public int a0() {
        return (int) (this.f13425c & 4294967295L);
    }

    public int b0() {
        return (int) (this.f13425c >> 32);
    }

    public final void c0() {
        this.f13423a = z6.a.r((int) (this.f13425c >> 32), m2.a.k(this.f13426d), m2.a.i(this.f13426d));
        int iR = z6.a.r((int) (this.f13425c & 4294967295L), m2.a.j(this.f13426d), m2.a.h(this.f13426d));
        this.f13424b = iR;
        int i10 = this.f13423a;
        long j10 = this.f13425c;
        this.f13427e = i1.b.c((i10 - ((int) (j10 >> 32))) / 2, (iR - ((int) (j10 & 4294967295L))) / 2);
    }

    public abstract void d0(long j10, float f10, c9.c cVar);

    public final void g0(long j10) {
        if (m2.k.a(this.f13425c, j10)) {
            return;
        }
        this.f13425c = j10;
        c0();
    }

    public final void h0(long j10) {
        if (m2.a.c(this.f13426d, j10)) {
            return;
        }
        this.f13426d = j10;
        c0();
    }
}
