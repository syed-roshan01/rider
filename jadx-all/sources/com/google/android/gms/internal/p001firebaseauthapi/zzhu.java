package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class zzhu {
    private static final zzxr zza;
    private static final zzoa<zzhd, zzos> zzb;
    private static final zznw<zzos> zzc;
    private static final zzmx<zzha, zzot> zzd;
    private static final zzmt<zzot> zze;

    static {
        zzxr zzxrVarZzb = zzpg.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza = zzxrVarZzb;
        zzb = zzoa.zza(new zzoc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhx
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzoc
            public final zzow zza(zzci zzciVar) {
                return zzos.zzb((zzvd) ((zzaja) zzvd.zza().zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").zza(zzvz.zzc().zzi()).zza(zzhu.zza(((zzhd) zzciVar).zzb())).zzf()));
            }
        }, zzhd.class, zzos.class);
        zzc = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhw
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzny
            public final zzci zza(zzow zzowVar) {
                return zzhu.zzb((zzos) zzowVar);
            }
        }, zzxrVarZzb, zzos.class);
        zzd = zzmx.zza(new zzmz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhz
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmz
            public final zzow zza(zzbu zzbuVar, zzct zzctVar) {
                zzha zzhaVar = (zzha) zzbuVar;
                return zzot.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzvw) ((zzaja) zzvw.zzb().zza(zzahm.zza(zzhaVar.zzd().zza(zzct.zza(zzctVar)))).zzf())).zzi(), zzux.zzb.SYMMETRIC, zzhu.zza(zzhaVar.zzb().zzb()), zzhaVar.zza());
            }
        }, zzha.class, zzot.class);
        zze = zzmt.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhy
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmv
            public final zzbu zza(zzow zzowVar, zzct zzctVar) {
                return zzhu.zzb((zzot) zzowVar, zzctVar);
            }
        }, zzxrVarZzb, zzot.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzha zzb(zzot zzotVar, zzct zzctVar) throws GeneralSecurityException {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzvw zzvwVarZza = zzvw.zza(zzotVar.zzd(), zzaip.zza());
            if (zzvwVarZza.zza() == 0) {
                return zzha.zza(zza(zzotVar.zzc()), zzxt.zza(zzvwVarZza.zzd().zzg(), zzct.zza(zzctVar)), zzotVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzajj unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static zzhd.zza zza(zzvt zzvtVar) throws GeneralSecurityException {
        int i10 = zzib.zza[zzvtVar.ordinal()];
        if (i10 == 1) {
            return zzhd.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzhd.zza.zzb;
        }
        if (i10 == 4) {
            return zzhd.zza.zzc;
        }
        throw new GeneralSecurityException(q.g("Unable to parse OutputPrefixType: ", zzvtVar.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzhd zzb(zzos zzosVar) throws GeneralSecurityException {
        if (zzosVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzvz.zza(zzosVar.zza().zze(), zzaip.zza()).zza() == 0) {
                    return zzhd.zza(zza(zzosVar.zza().zzd()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzajj e4) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e4);
            }
        }
        throw new IllegalArgumentException(q.x("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", zzosVar.zza().zzf()));
    }

    private static zzvt zza(zzhd.zza zzaVar) throws GeneralSecurityException {
        if (zzhd.zza.zza.equals(zzaVar)) {
            return zzvt.TINK;
        }
        if (zzhd.zza.zzb.equals(zzaVar)) {
            return zzvt.CRUNCHY;
        }
        if (zzhd.zza.zzc.equals(zzaVar)) {
            return zzvt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }

    public static void zza() {
        zznv zznvVarZza = zznv.zza();
        zznvVarZza.zza(zzb);
        zznvVarZza.zza(zzc);
        zznvVarZza.zza(zzd);
        zznvVarZza.zza(zze);
    }
}
