package com.google.firebase.auth;

import android.net.Uri;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import f6.a;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ActionCodeUrl {
    private static final com.google.android.gms.internal.p001firebaseauthapi.zzau<String, Integer> zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    static {
        HashMap map = new HashMap();
        map.put("recoverEmail", 2);
        map.put("resetPassword", 0);
        map.put("signIn", 4);
        map.put("verifyEmail", 1);
        map.put("verifyBeforeChangeEmail", 5);
        map.put("revertSecondFactorAddition", 6);
        zza = com.google.android.gms.internal.p001firebaseauthapi.zzau.zza(map);
    }

    private ActionCodeUrl(String str) {
        String strZza = zza(str, "apiKey");
        String strZza2 = zza(str, "oobCode");
        String strZza3 = zza(str, "mode");
        if (strZza == null || strZza2 == null || strZza3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        a.u(strZza);
        this.zzb = strZza;
        a.u(strZza2);
        this.zzc = strZza2;
        a.u(strZza3);
        this.zzd = strZza3;
        this.zze = zza(str, "continueUrl");
        this.zzf = zza(str, RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE);
        this.zzg = zza(str, "tenantId");
    }

    public static ActionCodeUrl parseLink(String str) {
        a.u(str);
        try {
            return new ActionCodeUrl(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String getApiKey() {
        return this.zzb;
    }

    public String getCode() {
        return this.zzc;
    }

    public String getContinueUrl() {
        return this.zze;
    }

    public String getLanguageCode() {
        return this.zzf;
    }

    public int getOperation() {
        com.google.android.gms.internal.p001firebaseauthapi.zzau<String, Integer> zzauVar = zza;
        if (zzauVar.containsKey(this.zzd)) {
            return zzauVar.get(this.zzd).intValue();
        }
        return 3;
    }

    public final String zza() {
        return this.zzg;
    }

    private static String zza(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("link");
            a.u(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
