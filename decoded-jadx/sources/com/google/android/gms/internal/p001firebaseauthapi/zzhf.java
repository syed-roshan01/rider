package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class zzhf {
    private static final zzxr zza;
    private static final zzoa<zzer, zzos> zzb;
    private static final zznw<zzos> zzc;
    private static final zzmx<zzek, zzot> zzd;
    private static final zzmt<zzot> zze;

    static {
        zzxr zzxrVarZzb = zzpg.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzxrVarZzb;
        zzb = zzoa.zza(new zzoc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhh
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzoc
            public final zzow zza(zzci zzciVar) {
                return zzhf.zza((zzer) zzciVar);
            }
        }, zzer.class, zzos.class);
        zzc = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhg
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzny
            public final zzci zza(zzow zzowVar) {
                return zzhf.zzb((zzos) zzowVar);
            }
        }, zzxrVarZzb, zzos.class);
        zzd = zzmx.zza(new zzmz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhj
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmz
            public final zzow zza(zzbu zzbuVar, zzct zzctVar) {
                return zzhf.zza((zzek) zzbuVar, zzctVar);
            }
        }, zzek.class, zzot.class);
        zze = zzmt.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhi
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmv
            public final zzbu zza(zzow zzowVar, zzct zzctVar) {
                return zzhf.zzb((zzot) zzowVar, zzctVar);
            }
        }, zzxrVarZzb, zzot.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzek zzb(zzot zzotVar, zzct zzctVar) throws GeneralSecurityException {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzst zzstVarZza = zzst.zza(zzotVar.zzd(), zzaip.zza());
            if (zzstVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzek.zzb().zza(zzer.zze().zzb(zzstVarZza.zzd().zzb()).zza(12).zzc(16).zza(zza(zzotVar.zzc())).zza()).zza(zzxt.zza(zzstVarZza.zzd().zzg(), zzct.zza(zzctVar))).zza(zzotVar.zze()).zza();
        } catch (zzajj unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzer.zzb zza(zzvt zzvtVar) throws GeneralSecurityException {
        int i10 = zzhl.zza[zzvtVar.ordinal()];
        if (i10 == 1) {
            return zzer.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzer.zzb.zzb;
        }
        if (i10 == 4) {
            return zzer.zzb.zzc;
        }
        throw new GeneralSecurityException(q.g("Unable to parse OutputPrefixType: ", zzvtVar.zza()));
    }

    public static /* synthetic */ zzot zza(zzek zzekVar, zzct zzctVar) throws GeneralSecurityException {
        zzb(zzekVar.zzc());
        return zzot.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzst) ((zzaja) zzst.zzb().zza(zzahm.zza(zzekVar.zze().zza(zzct.zza(zzctVar)))).zzf())).zzi(), zzux.zzb.SYMMETRIC, zza(zzekVar.zzc().zzf()), zzekVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzer zzb(zzos zzosVar) throws GeneralSecurityException {
        if (zzosVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzsw zzswVarZza = zzsw.zza(zzosVar.zza().zze(), zzaip.zza());
                if (zzswVarZza.zzb() == 0) {
                    return zzer.zze().zzb(zzswVarZza.zza()).zza(12).zzc(16).zza(zza(zzosVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzajj e4) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e4);
            }
        }
        throw new IllegalArgumentException(q.x("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", zzosVar.zza().zzf()));
    }

    public static /* synthetic */ zzos zza(zzer zzerVar) throws GeneralSecurityException {
        zzb(zzerVar);
        return zzos.zzb((zzvd) ((zzaja) zzvd.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmKey").zza(((zzsw) ((zzaja) zzsw.zzc().zza(zzerVar.zzc()).zzf())).zzi()).zza(zza(zzerVar.zzf())).zzf()));
    }

    private static zzvt zza(zzer.zzb zzbVar) throws GeneralSecurityException {
        if (zzer.zzb.zza.equals(zzbVar)) {
            return zzvt.TINK;
        }
        if (zzer.zzb.zzb.equals(zzbVar)) {
            return zzvt.CRUNCHY;
        }
        if (zzer.zzb.zzc.equals(zzbVar)) {
            return zzvt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    private static void zzb(zzer zzerVar) throws GeneralSecurityException {
        if (zzerVar.zzd() == 16) {
            if (zzerVar.zzb() != 12) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(zzerVar.zzb())));
            }
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(zzerVar.zzd())));
    }

    public static void zza() {
        zznv zznvVarZza = zznv.zza();
        zznvVarZza.zza(zzb);
        zznvVarZza.zza(zzc);
        zznvVarZza.zza(zzd);
        zznvVarZza.zza(zze);
    }
}
