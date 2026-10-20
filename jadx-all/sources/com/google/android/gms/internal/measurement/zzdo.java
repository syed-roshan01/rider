package com.google.android.gms.internal.measurement;

import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzdo extends zzdf.zza {
    private final /* synthetic */ Boolean zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdo(zzdf zzdfVar, Boolean bool) {
        super(zzdfVar);
        this.zzd = zzdfVar;
        this.zzc = bool;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        if (this.zzc != null) {
            zzcu zzcuVar = this.zzd.zzj;
            a.x(zzcuVar);
            zzcuVar.setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
        } else {
            zzcu zzcuVar2 = this.zzd.zzj;
            a.x(zzcuVar2);
            zzcuVar2.clearMeasurementEnabled(this.zza);
        }
    }
}
