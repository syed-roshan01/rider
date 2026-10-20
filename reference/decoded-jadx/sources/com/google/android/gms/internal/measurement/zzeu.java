package com.google.android.gms.internal.measurement;

import android.app.Activity;
import f6.a;
import g6.b;

/* JADX INFO: loaded from: classes.dex */
final class zzeu extends zzdf.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzcs zzd;
    private final /* synthetic */ zzdf.zzd zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeu(zzdf.zzd zzdVar, Activity activity, zzcs zzcsVar) {
        super(zzdf.this);
        this.zze = zzdVar;
        this.zzc = activity;
        this.zzd = zzcsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = zzdf.this.zzj;
        a.x(zzcuVar);
        zzcuVar.onActivitySaveInstanceState(new b(this.zzc), this.zzd, this.zzb);
    }
}
