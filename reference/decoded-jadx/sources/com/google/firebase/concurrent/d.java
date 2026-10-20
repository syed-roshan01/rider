package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f3674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f3675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f3676d;

    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer, int i10) {
        this.f3673a = i10;
        this.f3674b = delegatingScheduledExecutorService;
        this.f3675c = runnable;
        this.f3676d = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3673a;
        DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f3674b;
        DelegatingScheduledFuture.Completer completer = this.f3676d;
        Runnable runnable = this.f3675c;
        switch (i10) {
            case 0:
                delegatingScheduledExecutorService.lambda$scheduleAtFixedRate$7(runnable, completer);
                break;
            case 1:
                delegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$10(runnable, completer);
                break;
            default:
                delegatingScheduledExecutorService.lambda$schedule$1(runnable, completer);
                break;
        }
    }
}
