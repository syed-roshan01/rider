package com.google.android.gms.internal.p001firebaseauthapi;

import a6.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzafp extends a {
    public static final Parcelable.Creator<zzafp> CREATOR = new zzafs();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzafp(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public static zzaq<zzafp> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzaq.zza(new ArrayList());
        }
        zzap zzapVarZzg = zzaq.zzg();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            zzapVarZzg.zza(new zzafp(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzapVarZzg.zza();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.T0(parcel, 1, this.zza);
        e.T0(parcel, 2, this.zzb);
        e.T0(parcel, 3, this.zzc);
        e.d1(iY0, parcel);
    }
}
