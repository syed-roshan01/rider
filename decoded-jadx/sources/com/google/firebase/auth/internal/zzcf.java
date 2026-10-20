package com.google.firebase.auth.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import f6.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzcf {
    private static final Map<String, String> zza;

    static {
        HashMap map = new HashMap();
        zza = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status zza(Intent intent) {
        a.x(intent);
        a.r(zzb(intent));
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.STATUS");
        return (Status) (byteArrayExtra == null ? null : e.c0(byteArrayExtra, creator));
    }

    public static boolean zzb(Intent intent) {
        a.x(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }

    public static void zza(Intent intent, Status status) {
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
    }

    public static Status zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map<String, String> map = zza;
                if (map.containsKey(string)) {
                    return zzao.zza(map.get(string) + ":" + string2);
                }
            }
            return zzao.zza("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e4) {
            return zzao.zza("WEB_INTERNAL_ERROR:" + str + "[ " + e4.getLocalizedMessage() + " ]");
        }
    }
}
