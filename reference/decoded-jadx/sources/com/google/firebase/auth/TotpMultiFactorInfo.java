package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzagq;
import com.google.android.gms.internal.p001firebaseauthapi.zzxv;
import f6.a;
import org.json.JSONException;
import org.json.JSONObject;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class TotpMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<TotpMultiFactorInfo> CREATOR = new zzat();
    private final String zza;
    private final String zzb;
    private final long zzc;
    private final zzagq zzd;

    public TotpMultiFactorInfo(String str, String str2, long j10, zzagq zzagqVar) {
        a.u(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        if (zzagqVar == null) {
            throw new NullPointerException("totpInfo cannot be null.");
        }
        this.zzd = zzagqVar;
    }

    public static TotpMultiFactorInfo zza(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new TotpMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzagq());
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getDisplayName() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public long getEnrollmentTimestamp() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getFactorId() {
        return TotpMultiFactorGenerator.FACTOR_ID;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getUid() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(MultiFactorInfo.FACTOR_ID_KEY, TotpMultiFactorGenerator.FACTOR_ID);
            jSONObject.putOpt("uid", this.zza);
            jSONObject.putOpt("displayName", this.zzb);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.zzc));
            jSONObject.putOpt("totpInfo", this.zzd);
            return jSONObject;
        } catch (JSONException e4) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxv(e4);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.T0(parcel, 1, getUid());
        e.T0(parcel, 2, getDisplayName());
        long enrollmentTimestamp = getEnrollmentTimestamp();
        e.f1(parcel, 3, 8);
        parcel.writeLong(enrollmentTimestamp);
        e.R0(parcel, 4, this.zzd, i10);
        e.d1(iY0, parcel);
    }
}
