package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f1766b = new d(new c("Failure occurred while trying to finish a future.", 0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f1767a;

    public d(Throwable th) {
        this.f1767a = (Throwable) j.checkNotNull(th);
    }
}
