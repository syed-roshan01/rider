package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzala implements zzaki {
    private final zzakk zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzala(zzakk zzakkVar, String str, Object[] objArr) {
        this.zza = zzakkVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.zzd = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaki
    public final zzakk zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaki
    public final zzakz zzb() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return zzakz.PROTO2;
        }
        return (i10 & 4) == 4 ? zzakz.EDITIONS : zzakz.PROTO3;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaki
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
