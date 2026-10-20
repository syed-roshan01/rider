package com.google.firebase.auth.internal;

import a7.a;
import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzkj;
import com.google.android.gms.internal.p001firebaseauthapi.zzkq;
import com.google.android.gms.internal.p001firebaseauthapi.zzlx;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzq {
    private static zzq zza;
    private final String zzb;
    private final zzlx zzc;

    private zzq(Context context, String str, boolean z10) {
        zzlx zzlxVarZza;
        this.zzb = str;
        try {
            zzkj.zza();
            zzlx.zza zzaVarZza = new zzlx.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzkq.zza);
            zzaVarZza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzlxVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e4) {
            a.t("Exception encountered during crypto setup:\n", e4.getMessage(), "FirebearCryptoHelper");
            zzlxVarZza = null;
        }
        this.zzc = zzlxVarZza;
    }

    public static zzq zza(Context context, String str) {
        zzq zzqVar = zza;
        if (zzqVar == null || !com.google.android.gms.internal.p001firebaseauthapi.zzw.zza(zzqVar.zzb, str)) {
            zza = new zzq(context, str, true);
        }
        return zza;
    }

    public final String zza(String str) {
        String str2;
        zzlx zzlxVar = this.zzc;
        if (zzlxVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzlxVar) {
                str2 = new String(((com.google.android.gms.internal.p001firebaseauthapi.zzbp) this.zzc.zza().zza(com.google.android.gms.internal.p001firebaseauthapi.zzbp.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e4) {
            a.t("Exception encountered while decrypting bytes:\n", e4.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }

    public final String zza() {
        if (this.zzc == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.google.android.gms.internal.p001firebaseauthapi.zzce zzceVarZza = com.google.android.gms.internal.p001firebaseauthapi.zzbj.zza(byteArrayOutputStream);
        try {
            synchronized (this.zzc) {
                this.zzc.zza().zza().zza(zzceVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e4) {
            a.t("Exception encountered when attempting to get Public Key:\n", e4.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }
}
