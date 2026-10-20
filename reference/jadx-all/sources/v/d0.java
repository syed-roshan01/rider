package v;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15506a;

    public /* synthetic */ d0(int i10) {
        this.f15506a = i10;
    }

    public final float a(long j10) {
        switch (this.f15506a) {
            case 0:
                return d1.c.c(j10);
            case 1:
                return Math.abs(d1.c.d(j10));
            default:
                return Math.abs(d1.c.e(j10));
        }
    }

    public final long b(float f10, long j10) {
        switch (this.f15506a) {
            case 0:
                float fA = a(j10);
                return d1.c.f(j10, d1.c.h(f10, d9.i.f(d1.c.d(j10) / fA, d1.c.e(j10) / fA)));
            case 1:
                return d9.i.f(d1.c.d(j10) - (Math.signum(d1.c.d(j10)) * f10), d1.c.e(j10));
            default:
                return d9.i.f(d1.c.d(j10), d1.c.e(j10) - (Math.signum(d1.c.e(j10)) * f10));
        }
    }
}
