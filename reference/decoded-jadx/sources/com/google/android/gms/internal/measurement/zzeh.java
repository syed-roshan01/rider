package com.google.android.gms.internal.measurement;

import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzeh extends zzdf.zza {
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeh(zzdf zzdfVar, boolean z10) {
        super(zzdfVar);
        this.zzd = zzdfVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.zzd.zzj;
        a.x(zzcuVar);
        zzcuVar.setDataCollectionEnabled(this.zzc);
    }
}
