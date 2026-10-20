package com.google.android.gms.internal.measurement;

import android.net.Uri;
import q6.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzgv {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final e zzh;
    private final boolean zzi;

    public zzgv(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzgv zza() {
        return new zzgv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzgv zzb() {
        if (!this.zzc.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        e eVar = this.zzh;
        if (eVar == null) {
            return new zzgv(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, eVar);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }

    private zzgv(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, e eVar) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = z11;
        this.zzi = z12;
        this.zzg = z13;
    }

    public final zzgn<Double> zza(String str, double d10) {
        return zzgn.zza(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzgn<Long> zza(String str, long j10) {
        return zzgn.zza(this, str, Long.valueOf(j10), true);
    }

    public final zzgn<String> zza(String str, String str2) {
        return zzgn.zza(this, str, str2, true);
    }

    public final zzgn<Boolean> zza(String str, boolean z10) {
        return zzgn.zza(this, str, Boolean.valueOf(z10), true);
    }
}
