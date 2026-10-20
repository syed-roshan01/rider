package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
class at extends p6.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f3452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f3453b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(ax axVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f3453b = axVar;
        this.f3452a = taskCompletionSource;
    }

    @Override // p6.p
    public final void b(Bundle bundle) {
        this.f3453b.f3457a.c(this.f3452a);
    }

    @Override // p6.p
    public void c(Bundle bundle) {
        this.f3453b.f3457a.c(this.f3452a);
    }

    @Override // p6.p
    public final void d(Bundle bundle) {
        this.f3453b.f3457a.c(this.f3452a);
    }

    @Override // p6.p
    public void e(Bundle bundle) {
        this.f3453b.f3457a.c(this.f3452a);
    }
}
