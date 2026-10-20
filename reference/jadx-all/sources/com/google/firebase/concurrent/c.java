package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f3671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f3672c;

    public /* synthetic */ c(Runnable runnable, DelegatingScheduledFuture.Completer completer, int i10) {
        this.f3670a = i10;
        this.f3671b = runnable;
        this.f3672c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i10 = this.f3670a;
        DelegatingScheduledFuture.Completer completer = this.f3672c;
        Runnable runnable = this.f3671b;
        switch (i10) {
            case 0:
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(runnable, completer);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$0(runnable, completer);
                break;
            default:
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(runnable, completer);
                break;
        }
    }
}
