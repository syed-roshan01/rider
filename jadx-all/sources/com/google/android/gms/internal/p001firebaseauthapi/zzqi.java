package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
final class zzqi extends zzoi<zzcf, zzue> {
    public zzqi(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzoi
    public final /* synthetic */ zzcf zza(zzakk zzakkVar) throws GeneralSecurityException {
        zzue zzueVar = (zzue) zzakkVar;
        zzuc zzucVarZzb = zzueVar.zze().zzb();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzueVar.zzf().zzg(), "HMAC");
        int iZza = zzueVar.zze().zza();
        int i10 = zzqk.zza[zzucVarZzb.ordinal()];
        if (i10 == 1) {
            return new zzxo(new zzxm("HMACSHA1", secretKeySpec), iZza);
        }
        if (i10 == 2) {
            return new zzxo(new zzxm("HMACSHA224", secretKeySpec), iZza);
        }
        if (i10 == 3) {
            return new zzxo(new zzxm("HMACSHA256", secretKeySpec), iZza);
        }
        if (i10 == 4) {
            return new zzxo(new zzxm("HMACSHA384", secretKeySpec), iZza);
        }
        if (i10 == 5) {
            return new zzxo(new zzxm("HMACSHA512", secretKeySpec), iZza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
