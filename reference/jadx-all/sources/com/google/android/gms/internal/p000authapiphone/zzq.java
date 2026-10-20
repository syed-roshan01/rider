package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.tasks.TaskCompletionSource;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
final class zzq extends g {
    private final /* synthetic */ TaskCompletionSource zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(zzn zznVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void onResult(Status status) {
        if (status.f3150b == 6) {
            this.zza.trySetException(status.f3152d != null ? new m(status) : new com.google.android.gms.common.api.g(status));
        } else {
            e.D0(status, null, this.zza);
        }
    }
}
