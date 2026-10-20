package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzis {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesSivKey";

    @Deprecated
    private static final zzvv zzb = zzvv.zzb();

    @Deprecated
    private static final zzvv zzc = zzvv.zzb();

    static {
        try {
            zza();
        } catch (GeneralSecurityException e4) {
            throw new ExceptionInInitializerError(e4);
        }
    }

    public static void zza() {
        zzix.zzc();
        if (zzic.zzb()) {
            return;
        }
        zzin.zza(true);
    }
}
