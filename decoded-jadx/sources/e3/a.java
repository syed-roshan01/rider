package e3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5099i;

    public final float a(long j10) {
        long j11 = this.f5095e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f5097g;
        if (j12 < 0 || j10 < j12) {
            return e.b((j10 - j11) / this.f5091a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f5098h;
        return (e.b((j10 - j12) / this.f5099i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
