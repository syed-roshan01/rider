package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class aq extends p6.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f3442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f3443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(ax axVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f3443b = axVar;
        this.f3442a = context;
    }

    @Override // p6.w
    public final void b() {
        this.f3443b.f3460d.trySetResult(Boolean.valueOf(p6.e.a(this.f3442a)));
    }
}
