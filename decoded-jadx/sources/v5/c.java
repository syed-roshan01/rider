package v5;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f15901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f15903c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15904d = false;

    public c(a aVar, long j10) {
        this.f15901a = new WeakReference(aVar);
        this.f15902b = j10;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference weakReference = this.f15901a;
        try {
            if (this.f15903c.await(this.f15902b, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.b();
            this.f15904d = true;
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f15904d = true;
            }
        }
    }
}
