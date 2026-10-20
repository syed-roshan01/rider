package com.google.android.gms.internal.p001firebaseauthapi;

import e6.e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzafc implements zzacq<zzafc> {
    private static final String zza = "zzafc";
    private zzafe zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacq
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafc zza(String str) throws zzaah {
        zzafe zzafeVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzafeVar = new zzafe(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    boolean z10 = false;
                    int i10 = 0;
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                        arrayList.add(jSONObject2 == null ? new zzafb() : new zzafb(e.a(jSONObject2.optString("localId", null)), e.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z10), e.a(jSONObject2.optString("displayName", null)), e.a(jSONObject2.optString("photoUrl", null)), zzafu.zza(jSONObject2.optJSONArray("providerUserInfo")), e.a(jSONObject2.optString("rawPassword", null)), e.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzafq.zza(jSONObject2.optJSONArray("mfaInfo")), zzafp.zza(jSONObject2.optJSONArray("passkeyInfo"))));
                        i10++;
                        z10 = false;
                    }
                    zzafeVar = new zzafe(arrayList);
                }
            } else {
                zzafeVar = new zzafe();
            }
            this.zzb = zzafeVar;
            return this;
        } catch (NullPointerException e4) {
            e = e4;
            throw zzahb.zza(e, zza, str);
        } catch (JSONException e10) {
            e = e10;
            throw zzahb.zza(e, zza, str);
        }
    }

    public final List<zzafb> zza() {
        return this.zzb.zza();
    }
}
