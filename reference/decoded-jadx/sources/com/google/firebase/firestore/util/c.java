package com.google.firebase.firestore.util;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f3868b;

    public /* synthetic */ c(Runnable runnable, int i10) {
        this.f3867a = i10;
        this.f3868b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f3867a;
        Runnable runnable = this.f3868b;
        switch (i10) {
            case 0:
                return AsyncQueue.SynchronizedShutdownAwareExecutor.lambda$executeAndInitiateShutdown$2(runnable);
            default:
                return AsyncQueue.lambda$enqueue$2(runnable);
        }
    }
}
