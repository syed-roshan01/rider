package t;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f14199c;

    public i0(int i10, int i11, a0 a0Var) {
        this.f14197a = i10;
        this.f14198b = i11;
        this.f14199c = a0Var;
    }

    @Override // t.f0
    public final float b(long j10, float f10, float f11, float f12) {
        long j11 = (j10 / 1000000) - ((long) this.f14198b);
        int i10 = this.f14197a;
        float fA = this.f14199c.a(z6.a.q(i10 == 0 ? 1.0f : z6.a.s(j11, 0L, i10) / i10, 0.0f, 1.0f));
        x1 x1Var = y1.f14355a;
        return (f11 * fA) + ((1 - fA) * f10);
    }

    @Override // t.f0
    public final float c(long j10, float f10, float f11, float f12) {
        long jS = z6.a.s((j10 / 1000000) - ((long) this.f14198b), 0L, this.f14197a);
        if (jS < 0) {
            return 0.0f;
        }
        if (jS == 0) {
            return f12;
        }
        return (b(jS * 1000000, f10, f11, f12) - b((jS - 1) * 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // t.f0
    public final long d(float f10, float f11, float f12) {
        return ((long) (this.f14198b + this.f14197a)) * 1000000;
    }
}
