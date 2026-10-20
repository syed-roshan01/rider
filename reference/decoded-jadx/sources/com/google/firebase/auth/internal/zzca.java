package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.b;

/* JADX INFO: loaded from: classes.dex */
final class zzca implements b {
    private final /* synthetic */ zzcb zza;

    public zzca(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void onBackgroundStateChanged(boolean z10) {
        if (z10) {
            this.zza.zzc = true;
            this.zza.zza();
        } else {
            this.zza.zzc = false;
            if (this.zza.zzb()) {
                this.zza.zzb.zzc();
            }
        }
    }
}
