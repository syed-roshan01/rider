package com.google.android.gms.internal.p001firebaseauthapi;

import e6.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzagc implements zzacq<zzagc> {
    private static final String zza = "zzagc";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacq
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagc zza(String str) throws zzaah {
        try {
            this.zzb = e.a(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e4) {
            throw zzahb.zza(e4, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
