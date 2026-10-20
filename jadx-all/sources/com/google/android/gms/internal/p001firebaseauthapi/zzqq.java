package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzqq {
    private static final String zza = "type.googleapis.com/google.crypto.tink.HmacKey";

    @Deprecated
    private static final zzvv zzb;

    @Deprecated
    private static final zzvv zzc;

    @Deprecated
    private static final zzvv zzd;

    static {
        zzvv zzvvVarZzb = zzvv.zzb();
        zzb = zzvvVarZzb;
        zzc = zzvvVarZzb;
        zzd = zzvvVarZzb;
        try {
            zza();
        } catch (GeneralSecurityException e4) {
            throw new ExceptionInInitializerError(e4);
        }
    }

    public static void zza() {
        zzqr.zzc();
        zzqa.zzc();
        zzqe.zza(true);
        if (zzic.zzb()) {
            return;
        }
        zzpm.zza(true);
    }
}
