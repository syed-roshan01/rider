package com.google.android.gms.internal.p001firebaseauthapi;

import a7.a;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
final class zzqr implements zzcq<zzcf, zzcf> {
    private static final zzqr zza = new zzqr();
    private static final zzoe<zznc, zzcf> zzb = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqu
        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            return zzrj.zza((zznc) zzbuVar);
        }
    }, zznc.class, zzcf.class);

    public static void zzc() {
        zzcu.zza(zza);
        zzns.zza().zza(zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzcq
    public final Class<zzcf> zza() {
        return zzcf.class;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzcq
    public final Class<zzcf> zzb() {
        return zzcf.class;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzcq
    public final /* synthetic */ zzcf zza(zzch<zzcf> zzchVar) throws GeneralSecurityException {
        Iterator<List<zzcm<zzcf>>> it = zzchVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzcm<zzcf> zzcmVar : it.next()) {
                if (zzcmVar.zzb() instanceof zzqp) {
                    zzqp zzqpVar = (zzqp) zzcmVar.zzb();
                    zzxr zzxrVarZza = zzxr.zza(zzcmVar.zzh());
                    if (!zzxrVarZza.equals(zzqpVar.zzd())) {
                        String strValueOf = String.valueOf(zzqpVar.zzc());
                        String strValueOf2 = String.valueOf(zzqpVar.zzd());
                        throw new GeneralSecurityException(a.p(k1.c("Mac Key with parameters ", strValueOf, " has wrong output prefix (", strValueOf2, ") instead of ("), String.valueOf(zzxrVarZza), ")"));
                    }
                }
            }
        }
        return new zzqt(zzchVar);
    }
}
