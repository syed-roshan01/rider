package l5;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11362a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f11363b;

    public q(Runnable runnable, int i10) {
        this.f11363b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f11362a;
        Runnable runnable = this.f11363b;
        switch (i10) {
            case 0:
                try {
                    runnable.run();
                } catch (Exception e4) {
                    y3.e.d0("Executor", "Background execution failure.", e4);
                    return;
                }
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public q(Runnable runnable) {
        this.f11363b = runnable;
    }
}
