package com.google.android.gms.internal.p001firebaseauthapi;

import e6.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzafu {
    private List<zzafr> zza;

    public zzafu() {
        this.zza = new ArrayList();
    }

    public final List<zzafr> zza() {
        return this.zza;
    }

    public static zzafu zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzafu(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(jSONObject == null ? new zzafr() : new zzafr(e.a(jSONObject.optString("federatedId", null)), e.a(jSONObject.optString("displayName", null)), e.a(jSONObject.optString("photoUrl", null)), e.a(jSONObject.optString("providerId", null)), null, e.a(jSONObject.optString("phoneNumber", null)), e.a(jSONObject.optString("email", null))));
        }
        return new zzafu(arrayList);
    }

    private zzafu(List<zzafr> list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }
}
