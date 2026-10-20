package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import f6.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzagx implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzagx() {
    }

    public static zzagx zzb(String str, String str2, boolean z10) {
        zzagx zzagxVar = new zzagx();
        a.u(str);
        zzagxVar.zza = str;
        a.u(str2);
        zzagxVar.zzd = str2;
        zzagxVar.zzf = z10;
        return zzagxVar;
    }

    public final void zza(String str) {
        this.zze = str;
    }

    public static zzagx zza(String str, String str2, boolean z10) {
        zzagx zzagxVar = new zzagx();
        a.u(str);
        zzagxVar.zzb = str;
        a.u(str2);
        zzagxVar.zzc = str2;
        zzagxVar.zzf = z10;
        return zzagxVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
