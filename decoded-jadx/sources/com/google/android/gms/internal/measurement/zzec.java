package com.google.android.gms.internal.measurement;

import f6.a;
import g6.b;

/* JADX INFO: loaded from: classes.dex */
final class zzec extends zzdf.zza {
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ zzdf zzh;
    private final /* synthetic */ int zzc = 5;
    private final /* synthetic */ Object zzf = null;
    private final /* synthetic */ Object zzg = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzdf zzdfVar, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.zzh = zzdfVar;
        this.zzd = str;
        this.zze = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.zzh.zzj;
        a.x(zzcuVar);
        zzcuVar.logHealthData(this.zzc, this.zzd, new b(this.zze), new b(null), new b(null));
    }
}
