package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3664c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f3662a = i10;
        this.f3663b = obj;
        this.f3664c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3662a;
        Object obj = this.f3664c;
        Object obj2 = this.f3663b;
        switch (i10) {
            case 0:
                ((CustomThreadFactory) obj2).lambda$newThread$0((Runnable) obj);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$3((Callable) obj2, (DelegatingScheduledFuture.Completer) obj);
                break;
            default:
                ((LimitedConcurrencyExecutor) obj2).lambda$decorate$0((Runnable) obj);
                break;
        }
    }
}
