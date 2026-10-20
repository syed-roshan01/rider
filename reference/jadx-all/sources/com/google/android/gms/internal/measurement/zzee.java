package com.google.android.gms.internal.measurement;

import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzee extends zzdf.zza {
    private final /* synthetic */ zzdf.zzc zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzdf zzdfVar, zzdf.zzc zzcVar) {
        super(zzdfVar);
        this.zzd = zzdfVar;
        this.zzc = zzcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.zzd.zzj;
        a.x(zzcuVar);
        zzcuVar.setEventInterceptor(this.zzc);
    }
}
