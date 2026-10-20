package com.google.android.gms.internal.p001firebaseauthapi;

import f6.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzafa implements zzacr {
    private String zza = zzaey.REFRESH_TOKEN.toString();
    private String zzb;

    public zzafa(String str) {
        a.u(str);
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
