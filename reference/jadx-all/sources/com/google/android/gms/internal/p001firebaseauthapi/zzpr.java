package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import l.q;

/* JADX INFO: loaded from: classes.dex */
final class zzpr {
    private static final zzxr zza;
    private static final zzoa<zzpp, zzos> zzb;
    private static final zznw<zzos> zzc;
    private static final zzmx<zzpi, zzot> zzd;
    private static final zzmt<zzot> zze;

    static {
        zzxr zzxrVarZzb = zzpg.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzxrVarZzb;
        zzb = zzoa.zza(new zzoc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpu
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzoc
            public final zzow zza(zzci zzciVar) {
                zzpp zzppVar = (zzpp) zzciVar;
                return zzos.zzb((zzvd) ((zzaja) zzvd.zza().zza("type.googleapis.com/google.crypto.tink.AesCmacKey").zza(((zzrz) ((zzaja) zzrz.zzb().zza(zzpr.zzb(zzppVar)).zza(zzppVar.zzc()).zzf())).zzi()).zza(zzpr.zza(zzppVar.zze())).zzf()));
            }
        }, zzpp.class, zzos.class);
        zzc = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpt
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzny
            public final zzci zza(zzow zzowVar) {
                return zzpr.zzb((zzos) zzowVar);
            }
        }, zzxrVarZzb, zzos.class);
        zzd = zzmx.zza(new zzmz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpw
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmz
            public final zzow zza(zzbu zzbuVar, zzct zzctVar) {
                zzpi zzpiVar = (zzpi) zzbuVar;
                return zzot.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzry) ((zzaja) zzry.zzb().zza(zzpr.zzb((zzpp) zzpiVar.zzc())).zza(zzahm.zza(zzpiVar.zze().zza(zzct.zza(zzctVar)))).zzf())).zzi(), zzux.zzb.SYMMETRIC, zzpr.zza(((zzpp) zzpiVar.zzc()).zze()), zzpiVar.zza());
            }
        }, zzpi.class, zzot.class);
        zze = zzmt.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpv
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmv
            public final zzbu zza(zzow zzowVar, zzct zzctVar) {
                return zzpr.zzb((zzot) zzowVar, zzctVar);
            }
        }, zzxrVarZzb, zzot.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzpi zzb(zzot zzotVar, zzct zzctVar) throws GeneralSecurityException {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzry zzryVarZza = zzry.zza(zzotVar.zzd(), zzaip.zza());
            if (zzryVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzpi.zzb().zza(zzpp.zzd().zza(zzryVarZza.zze().zzb()).zzb(zzryVarZza.zzd().zza()).zza(zza(zzotVar.zzc())).zza()).zza(zzxt.zza(zzryVarZza.zze().zzg(), zzct.zza(zzctVar))).zza(zzotVar.zze()).zza();
        } catch (zzajj | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzpp zzb(zzos zzosVar) throws GeneralSecurityException {
        if (zzosVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzrz zzrzVarZza = zzrz.zza(zzosVar.zza().zze(), zzaip.zza());
                return zzpp.zzd().zza(zzrzVarZza.zza()).zzb(zzrzVarZza.zzd().zza()).zza(zza(zzosVar.zza().zzd())).zza();
            } catch (zzajj e4) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e4);
            }
        }
        throw new IllegalArgumentException(q.x("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", zzosVar.zza().zzf()));
    }

    private static zzpp.zzb zza(zzvt zzvtVar) throws GeneralSecurityException {
        int i10 = zzpy.zza[zzvtVar.ordinal()];
        if (i10 == 1) {
            return zzpp.zzb.zza;
        }
        if (i10 == 2) {
            return zzpp.zzb.zzb;
        }
        if (i10 == 3) {
            return zzpp.zzb.zzc;
        }
        if (i10 == 4) {
            return zzpp.zzb.zzd;
        }
        throw new GeneralSecurityException(q.g("Unable to parse OutputPrefixType: ", zzvtVar.zza()));
    }

    private static zzsc zzb(zzpp zzppVar) {
        return (zzsc) ((zzaja) zzsc.zzb().zza(zzppVar.zzb()).zzf());
    }

    private static zzvt zza(zzpp.zzb zzbVar) throws GeneralSecurityException {
        if (zzpp.zzb.zza.equals(zzbVar)) {
            return zzvt.TINK;
        }
        if (zzpp.zzb.zzb.equals(zzbVar)) {
            return zzvt.CRUNCHY;
        }
        if (zzpp.zzb.zzd.equals(zzbVar)) {
            return zzvt.RAW;
        }
        if (zzpp.zzb.zzc.equals(zzbVar)) {
            return zzvt.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    public static void zza() {
        zznv zznvVarZza = zznv.zza();
        zznvVarZza.zza(zzb);
        zznvVarZza.zza(zzc);
        zznvVarZza.zza(zzd);
        zznvVarZza.zza(zze);
    }
}
