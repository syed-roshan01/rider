package com.google.firebase.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f3666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f3667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f3668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3669e;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j10, TimeUnit timeUnit, int i10) {
        this.f3665a = i10;
        this.f3666b = delegatingScheduledExecutorService;
        this.f3669e = obj;
        this.f3667c = j10;
        this.f3668d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        int i10 = this.f3665a;
        Object obj = this.f3669e;
        switch (i10) {
            case 0:
                return this.f3666b.lambda$schedule$5((Callable) obj, this.f3667c, this.f3668d, completer);
            default:
                return this.f3666b.lambda$schedule$2((Runnable) obj, this.f3667c, this.f3668d, completer);
        }
    }
}
