package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f3688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3689c;

    public /* synthetic */ h(Runnable runnable, Object obj, int i10) {
        this.f3687a = i10;
        this.f3688b = runnable;
        this.f3689c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f3687a;
        Object obj = this.f3689c;
        Runnable runnable = this.f3688b;
        switch (i10) {
            case 0:
                return LimitedConcurrencyExecutorService.lambda$submit$0(runnable, obj);
            default:
                return PausableExecutorServiceImpl.lambda$submit$0(runnable, obj);
        }
    }
}
