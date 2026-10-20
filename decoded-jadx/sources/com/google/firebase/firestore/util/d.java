package com.google.firebase.firestore.util;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3871c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f3869a = i10;
        this.f3870b = obj;
        this.f3871c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3869a;
        Object obj = this.f3871c;
        Object obj2 = this.f3870b;
        switch (i10) {
            case 0:
                AsyncQueue.SynchronizedShutdownAwareExecutor.lambda$executeAndReportResult$1((TaskCompletionSource) obj2, (Callable) obj);
                break;
            case 1:
                ((ThrottledForwardingExecutor) obj2).lambda$execute$0((Runnable) obj);
                break;
            case 2:
                ((AsyncQueue) obj2).lambda$runDelayedTasksUntil$6((AsyncQueue.TimerId) obj);
                break;
            case 3:
                ((BackgroundQueue) obj2).lambda$execute$0((Runnable) obj);
                break;
            default:
                ((ExponentialBackoff) obj2).lambda$backoffAndRun$0((Runnable) obj);
                break;
        }
    }
}
