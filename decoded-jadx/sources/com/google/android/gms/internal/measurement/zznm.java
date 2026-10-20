package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zznm implements zznn {
    private static final zzgn<Boolean> zza;
    private static final zzgn<Long> zzb;

    static {
        zzgv zzgvVarZza = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzgvVarZza.zza("measurement.service.deferred_first_open", false);
        zzb = zzgvVarZza.zza("measurement.id.service.deferred_first_open", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zznn
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznn
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
