package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f3691b;

    public /* synthetic */ i(Runnable runnable, int i10) {
        this.f3690a = i10;
        this.f3691b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f3690a;
        Runnable runnable = this.f3691b;
        switch (i10) {
            case 0:
                return LimitedConcurrencyExecutorService.lambda$submit$1(runnable);
            default:
                return PausableExecutorServiceImpl.lambda$submit$1(runnable);
        }
    }
}
