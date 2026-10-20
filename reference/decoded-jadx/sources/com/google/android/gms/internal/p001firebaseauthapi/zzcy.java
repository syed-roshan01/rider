package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class zzcy {
    private static final Charset zza = Charset.forName("UTF-8");

    public static zzvi zza(zzvh zzvhVar) {
        zzvi.zza zzaVarZza = zzvi.zza().zza(zzvhVar.zzb());
        for (zzvh.zza zzaVar : zzvhVar.zze()) {
            zzaVarZza.zza((zzvi.zzb) ((zzaja) zzvi.zzb.zzb().zza(zzaVar.zzb().zzf()).zza(zzaVar.zzc()).zza(zzaVar.zzf()).zza(zzaVar.zza()).zzf()));
        }
        return (zzvi) ((zzaja) zzaVarZza.zzf());
    }

    public static void zzb(zzvh zzvhVar) throws GeneralSecurityException {
        int iZzb = zzvhVar.zzb();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (zzvh.zza zzaVar : zzvhVar.zze()) {
            if (zzaVar.zzc() == zzvb.ENABLED) {
                if (!zzaVar.zzg()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzaVar.zza())));
                }
                if (zzaVar.zzf() == zzvt.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzaVar.zza())));
                }
                if (zzaVar.zzc() == zzvb.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzaVar.zza())));
                }
                if (zzaVar.zza() == iZzb) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (zzaVar.zzb().zzb() != zzux.zzb.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
