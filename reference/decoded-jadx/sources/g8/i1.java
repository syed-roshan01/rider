package g8;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Random f6844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f6846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f6847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6848e;

    public final long a() {
        long j10 = this.f6848e;
        double d10 = j10;
        this.f6848e = Math.min((long) (this.f6846c * d10), this.f6845b);
        double d11 = this.f6847d;
        double d12 = (-d11) * d10;
        double d13 = d11 * d10;
        y3.e.H(d13 >= d12);
        return j10 + ((long) ((this.f6844a.nextDouble() * (d13 - d12)) + d12));
    }
}
