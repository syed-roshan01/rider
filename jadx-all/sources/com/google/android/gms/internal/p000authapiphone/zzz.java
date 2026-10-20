package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
final class zzz extends zzk {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzz(zzu zzuVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzl
    public final void zza(Status status) {
        e.D0(status, null, this.zza);
    }
}
