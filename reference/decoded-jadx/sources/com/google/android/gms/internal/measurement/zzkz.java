package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zzkz implements zzkh {
    private final zzkj zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzkz(zzkj zzkjVar, String str, Object[] objArr) {
        this.zza = zzkjVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < '\ud800') {
            this.zzd = cCharAt;
            return;
        }
        int i10 = cCharAt & '\u1fff';
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < '\ud800') {
                this.zzd = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & '\u1fff') << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final zzkj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final zzky zzb() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return zzky.PROTO2;
        }
        return (i10 & 4) == 4 ? zzky.EDITIONS : zzky.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
