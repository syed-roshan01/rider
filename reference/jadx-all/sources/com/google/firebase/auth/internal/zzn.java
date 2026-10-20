package com.google.firebase.auth.internal;

import a7.a;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
final class zzn extends zzj {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzj) {
            zzj zzjVar = (zzj) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzjVar.zzc()) : zzjVar.zzc() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzjVar.zza()) : zzjVar.zza() == null) {
                    String str3 = this.zzc;
                    if (str3 != null ? str3.equals(zzjVar.zzb()) : zzjVar.zzb() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.zzc;
        return iHashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return a.p(k1.c("AttestationResult{recaptchaV2Token=", str, ", playIntegrityToken=", str2, ", recaptchaEnterpriseToken="), this.zzc, "}");
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final String zzc() {
        return this.zza;
    }

    private zzn(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
