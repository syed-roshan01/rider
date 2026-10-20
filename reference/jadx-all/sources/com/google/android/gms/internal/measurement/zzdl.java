package com.google.android.gms.internal.measurement;

import android.app.Activity;
import f6.a;
import g6.b;

/* JADX INFO: loaded from: classes.dex */
final class zzdl extends zzdf.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzdf zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzdf zzdfVar, Activity activity, String str, String str2) {
        super(zzdfVar);
        this.zzf = zzdfVar;
        this.zzc = activity;
        this.zzd = str;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.zzf.zzj;
        a.x(zzcuVar);
        zzcuVar.setCurrentScreen(new b(this.zzc), this.zzd, this.zze, this.zza);
    }
}
