package com.google.android.gms.internal.p001firebaseauthapi;

import e6.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzagk implements zzacq<zzagk> {
    private static final String zza = "zzagk";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacq
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagk zza(String str) throws zzaah {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (jSONObjectOptJSONObject != null) {
                this.zzb = e.a(jSONObjectOptJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e4) {
            throw zzahb.zza(e4, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
