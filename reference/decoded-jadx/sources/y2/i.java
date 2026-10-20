package y2;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16870a;

    public i(Runnable runnable, String str, int i10) {
        super(runnable, str);
        this.f16870a = i10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f16870a);
        super.run();
    }
}
