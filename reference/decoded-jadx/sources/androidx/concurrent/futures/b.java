package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f1761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f1762d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f1764b;

    static {
        if (j.GENERATE_CANCELLATION_CAUSES) {
            f1762d = null;
            f1761c = null;
        } else {
            f1762d = new b(null, false);
            f1761c = new b(null, true);
        }
    }

    public b(Throwable th, boolean z10) {
        this.f1763a = z10;
        this.f1764b = th;
    }
}
