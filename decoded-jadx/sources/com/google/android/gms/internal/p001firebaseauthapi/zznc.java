package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zznc extends zzbu {
    private final zzot zza;

    public zznc(zzot zzotVar, zzct zzctVar) throws GeneralSecurityException {
        zza(zzotVar, zzctVar);
        this.zza = zzotVar;
    }

    public final zzot zza(zzct zzctVar) throws GeneralSecurityException {
        zza(this.zza, zzctVar);
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbu
    public final Integer zza() {
        return this.zza.zze();
    }

    private static void zza(zzot zzotVar, zzct zzctVar) throws GeneralSecurityException {
        int i10 = zznf.zza[zzotVar.zza().ordinal()];
        if (i10 == 1 || i10 == 2) {
            zzct.zza(zzctVar);
        }
    }
}
