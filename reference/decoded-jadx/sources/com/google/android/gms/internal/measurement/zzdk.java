package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
final class zzdk extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Bundle zze;
    private final /* synthetic */ zzdf zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(zzdf zzdfVar, String str, String str2, Bundle bundle) {
        super(zzdfVar);
        this.zzf = zzdfVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.zzf.zzj;
        a.x(zzcuVar);
        zzcuVar.clearConditionalUserProperty(this.zzc, this.zzd, this.zze);
    }
}
