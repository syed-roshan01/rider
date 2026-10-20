package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzeo {
    private static final zzoe<zzek, zzbh> zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzen
        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            return zzwg.zza((zzek) zzbuVar);
        }
    }, zzek.class, zzbh.class);
    private static final zzbt<zzbh> zzb = zznd.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", zzbh.class, zzux.zzb.SYMMETRIC, zzst.zze());
    private static final zznp<zzer> zzc = new zznp() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeq
    };
    private static final zznn<zzer> zzd = new zznn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzep
        @Override // com.google.android.gms.internal.p001firebaseauthapi.zznn
        public final zzbu zza(zzci zzciVar, Integer num) {
            return zzeo.zza((zzer) zzciVar, null);
        }
    };

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static /* synthetic */ zzek zza(zzer zzerVar, Integer num) throws GeneralSecurityException {
        if (zzerVar.zzc() != 24) {
            return zzek.zzb().zza(zzerVar).zza(num).zza(zzxt.zza(zzerVar.zzc())).zza();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }

    public static void zza(boolean z10) {
        zzhf.zza();
        zzns.zza().zza(zza);
        zznt zzntVarZza = zznt.zza();
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzgr.zza);
        zzer.zza zzaVarZzc = zzer.zze().zza(12).zzb(16).zzc(16);
        zzer.zzb zzbVar = zzer.zzb.zzc;
        map.put("AES128_GCM_RAW", zzaVarZzc.zza(zzbVar).zza());
        map.put("AES256_GCM", zzgr.zzb);
        map.put("AES256_GCM_RAW", zzer.zze().zza(12).zzb(32).zzc(16).zza(zzbVar).zza());
        zzntVarZza.zza(Collections.unmodifiableMap(map));
        zznm.zza().zza(zzc, zzer.class);
        zznk.zza().zza(zzd, zzer.class);
        zzmn.zza().zza((zzbt) zzb, zzic.zza.zzb, true);
    }
}
