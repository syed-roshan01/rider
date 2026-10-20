package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m implements u6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f1787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f1788b = new l(this);

    public m(k kVar) {
        this.f1787a = new WeakReference(kVar);
    }

    @Override // u6.b
    public final void addListener(Runnable runnable, Executor executor) {
        this.f1788b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        k kVar = (k) this.f1787a.get();
        boolean zCancel = this.f1788b.cancel(z10);
        if (zCancel && kVar != null) {
            kVar.f1782a = null;
            kVar.f1783b = null;
            kVar.f1784c.set(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f1788b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1788b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1788b.isDone();
    }

    public final String toString() {
        return this.f1788b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f1788b.get(j10, timeUnit);
    }
}
