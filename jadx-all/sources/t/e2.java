package t;

/* JADX INFO: loaded from: classes.dex */
public final class e2 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f14141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14144d;

    public e2(a2 a2Var, int i10, long j10) {
        this.f14141a = a2Var;
        this.f14142b = i10;
        this.f14143c = ((long) (a2Var.f() + a2Var.e())) * 1000000;
        this.f14144d = j10 * 1000000;
    }

    @Override // t.z1
    public final boolean a() {
        return true;
    }

    @Override // t.z1
    public final long b(t tVar, t tVar2, t tVar3) {
        return Long.MAX_VALUE;
    }

    @Override // t.z1
    public final t c(long j10, t tVar, t tVar2, t tVar3) {
        return this.f14141a.c(h(j10), tVar, tVar2, i(j10, tVar, tVar3, tVar2));
    }

    @Override // t.z1
    public final t d(long j10, t tVar, t tVar2, t tVar3) {
        return this.f14141a.d(h(j10), tVar, tVar2, i(j10, tVar, tVar3, tVar2));
    }

    public final long h(long j10) {
        long j11 = j10 + this.f14144d;
        if (j11 <= 0) {
            return 0L;
        }
        long j12 = this.f14143c;
        long j13 = j11 / j12;
        return (this.f14142b == 1 || j13 % ((long) 2) == 0) ? j11 - (j13 * j12) : ((j13 + 1) * j12) - j11;
    }

    public final t i(long j10, t tVar, t tVar2, t tVar3) {
        long j11 = this.f14144d;
        long j12 = j10 + j11;
        long j13 = this.f14143c;
        return j12 > j13 ? this.f14141a.c(j13 - j11, tVar, tVar3, tVar2) : tVar2;
    }
}
