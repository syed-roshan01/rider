package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
class ThrottledForwardingExecutor implements Executor {
    private final Semaphore availableSlots;
    private final Executor executor;

    public ThrottledForwardingExecutor(int i10, Executor executor) {
        this.availableSlots = new Semaphore(i10);
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Runnable runnable) {
        runnable.run();
        this.availableSlots.release();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.availableSlots.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.executor.execute(new d(1, this, runnable));
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
