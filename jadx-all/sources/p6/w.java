package p6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f12820a;

    public w() {
        this.f12820a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f12820a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f12820a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e4) {
            a(e4);
        }
    }

    public w(TaskCompletionSource taskCompletionSource) {
        this.f12820a = taskCompletionSource;
    }
}
