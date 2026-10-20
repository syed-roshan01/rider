package com.google.android.gms.internal.measurement;

import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzds extends zzdf.zza {
    private final /* synthetic */ long zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdf zzdfVar, long j10) {
        super(zzdfVar);
        this.zzd = zzdfVar;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.zzd.zzj;
        a.x(zzcuVar);
        zzcuVar.setSessionTimeoutDuration(this.zzc);
    }
}
