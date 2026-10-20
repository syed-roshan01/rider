package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f1777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u6.b f1778b;

    public g(j jVar, u6.b bVar) {
        this.f1777a = jVar;
        this.f1778b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1777a.value != this) {
            return;
        }
        if (j.ATOMIC_HELPER.b(this.f1777a, this, j.getFutureValue(this.f1778b))) {
            j.complete(this.f1777a);
        }
    }
}
