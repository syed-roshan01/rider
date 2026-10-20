package com.google.android.gms.internal.measurement;

import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzej extends zzdf.zza {
    private final /* synthetic */ zzdf.zzb zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzej(zzdf zzdfVar, zzdf.zzb zzbVar) {
        super(zzdfVar);
        this.zzd = zzdfVar;
        this.zzc = zzbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.zzd.zzj;
        a.x(zzcuVar);
        zzcuVar.registerOnMeasurementEventListener(this.zzc);
    }
}
