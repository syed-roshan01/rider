package com.google.android.gms.internal.measurement;

import android.app.Activity;
import f6.a;
import g6.b;

/* JADX INFO: loaded from: classes.dex */
final class zzeq extends zzdf.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdf.zzd zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzdf.zzd zzdVar, Activity activity) {
        super(zzdf.this);
        this.zzd = zzdVar;
        this.zzc = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = zzdf.this.zzj;
        a.x(zzcuVar);
        zzcuVar.onActivityStarted(new b(this.zzc), this.zzb);
    }
}
