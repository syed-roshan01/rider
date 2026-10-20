package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzne extends zzci {
    private final zzos zza;

    public zzne(zzos zzosVar) {
        this.zza = zzosVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzne)) {
            return false;
        }
        zzos zzosVar = ((zzne) obj).zza;
        return this.zza.zza().zzd().equals(zzosVar.zza().zzd()) && this.zza.zza().zzf().equals(zzosVar.zza().zzf()) && this.zza.zza().zze().equals(zzosVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzb());
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zza().zzf();
        int i10 = zznh.zza[this.zza.zza().zzd().ordinal()];
        if (i10 == 1) {
            str = "TINK";
        } else if (i10 == 2) {
            str = "LEGACY";
        } else if (i10 != 3) {
            str = i10 != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzci
    public final boolean zza() {
        return this.zza.zza().zzd() != zzvt.RAW;
    }

    public final zzos zzb() {
        return this.zza;
    }
}
