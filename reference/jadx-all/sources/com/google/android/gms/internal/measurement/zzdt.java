package com.google.android.gms.internal.measurement;

import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzdt extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdt(zzdf zzdfVar, String str) {
        super(zzdfVar);
        this.zzd = zzdfVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.zzd.zzj;
        a.x(zzcuVar);
        zzcuVar.endAdUnitExposure(this.zzc, this.zzb);
    }
}
