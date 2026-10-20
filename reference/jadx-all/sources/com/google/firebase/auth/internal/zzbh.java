package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import c6.a;
import com.google.android.gms.internal.p001firebaseauthapi.zzxv;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q.f;

/* JADX INFO: loaded from: classes.dex */
final class zzbh {
    private static final a zza = new a("JSONParser", new String[0]);

    private static List<Object> zza(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objZza = jSONArray.get(i10);
            if (objZza instanceof JSONArray) {
                objZza = zza((JSONArray) objZza);
            } else if (objZza instanceof JSONObject) {
                objZza = zza((JSONObject) objZza);
            }
            arrayList.add(objZza);
        }
        return arrayList;
    }

    public static Map<String, Object> zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return zza(jSONObject);
            }
            return null;
        } catch (Exception e4) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzxv(e4);
        }
    }

    public static Map<String, Object> zza(String str) {
        f6.a.u(str);
        List<String> listZza = com.google.android.gms.internal.p001firebaseauthapi.zzac.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            zza.b(q.x("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        String str2 = listZza.get(1);
        try {
            Map<String, Object> mapZzb = zzb(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return mapZzb == null ? new HashMap() : mapZzb;
        } catch (UnsupportedEncodingException e4) {
            zza.a(e4, "Unable to decode token", new Object[0]);
            return new HashMap();
        }
    }

    private static Map<String, Object> zza(JSONObject jSONObject) throws JSONException {
        f fVar = new f();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objZza = jSONObject.get(next);
            if (objZza instanceof JSONArray) {
                objZza = zza((JSONArray) objZza);
            } else if (objZza instanceof JSONObject) {
                objZza = zza((JSONObject) objZza);
            }
            fVar.put(next, objZza);
        }
        return fVar;
    }
}
