package com.google.android.gms.internal.p001firebaseauthapi;

import f6.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzaed {
    private final String zza;

    public zzaed(String str) {
        a.u(str);
        this.zza = str;
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}
