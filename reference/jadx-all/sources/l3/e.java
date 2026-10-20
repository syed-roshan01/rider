package l3;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11246b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f11245a = 0L;
            this.f11246b = 1L;
        } else {
            this.f11245a = j10;
            this.f11246b = j11;
        }
    }

    public final String toString() {
        return this.f11245a + "/" + this.f11246b;
    }
}
