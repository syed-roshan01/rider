package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f3678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f3679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f3680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f3682f;

    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f3677a = i10;
        this.f3678b = delegatingScheduledExecutorService;
        this.f3679c = runnable;
        this.f3680d = j10;
        this.f3681e = j11;
        this.f3682f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        switch (this.f3677a) {
            case 0:
                return this.f3678b.lambda$scheduleWithFixedDelay$11(this.f3679c, this.f3680d, this.f3681e, this.f3682f, completer);
            default:
                return this.f3678b.lambda$scheduleAtFixedRate$8(this.f3679c, this.f3680d, this.f3681e, this.f3682f, completer);
        }
    }
}
