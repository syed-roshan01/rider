package com.google.firebase.auth.internal;

import a6.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzafb;
import com.google.android.gms.internal.p001firebaseauthapi.zzafr;
import com.google.android.gms.internal.p001firebaseauthapi.zzxv;
import com.google.firebase.auth.UserInfo;
import org.json.JSONException;
import org.json.JSONObject;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzab extends a implements UserInfo {
    public static final Parcelable.Creator<zzab> CREATOR = new zzaa();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private Uri zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private String zzi;

    public zzab(zzafb zzafbVar, String str) {
        f6.a.x(zzafbVar);
        f6.a.u(str);
        String strZzi = zzafbVar.zzi();
        f6.a.u(strZzi);
        this.zza = strZzi;
        this.zzb = str;
        this.zzf = zzafbVar.zzh();
        this.zzc = zzafbVar.zzg();
        Uri uriZzc = zzafbVar.zzc();
        if (uriZzc != null) {
            this.zzd = uriZzc.toString();
            this.zze = uriZzc;
        }
        this.zzh = zzafbVar.zzm();
        this.zzi = null;
        this.zzg = zzafbVar.zzj();
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getDisplayName() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getEmail() {
        return this.zzf;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getPhoneNumber() {
        return this.zzg;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final Uri getPhotoUrl() {
        if (!TextUtils.isEmpty(this.zzd) && this.zze == null) {
            this.zze = Uri.parse(this.zzd);
        }
        return this.zze;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getProviderId() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getUid() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final boolean isEmailVerified() {
        return this.zzh;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.T0(parcel, 1, getUid());
        e.T0(parcel, 2, getProviderId());
        e.T0(parcel, 3, getDisplayName());
        e.T0(parcel, 4, this.zzd);
        e.T0(parcel, 5, getEmail());
        e.T0(parcel, 6, getPhoneNumber());
        boolean zIsEmailVerified = isEmailVerified();
        e.f1(parcel, 7, 4);
        parcel.writeInt(zIsEmailVerified ? 1 : 0);
        e.T0(parcel, 8, this.zzi);
        e.d1(iY0, parcel);
    }

    public final String zza() {
        return this.zzi;
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.zza);
            jSONObject.putOpt("providerId", this.zzb);
            jSONObject.putOpt("displayName", this.zzc);
            jSONObject.putOpt("photoUrl", this.zzd);
            jSONObject.putOpt("email", this.zzf);
            jSONObject.putOpt("phoneNumber", this.zzg);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.zzh));
            jSONObject.putOpt("rawUserInfo", this.zzi);
            return jSONObject.toString();
        } catch (JSONException e4) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzxv(e4);
        }
    }

    public static zzab zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzab(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e4) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzxv(e4);
        }
    }

    public zzab(zzafr zzafrVar) {
        f6.a.x(zzafrVar);
        this.zza = zzafrVar.zzd();
        String strZzf = zzafrVar.zzf();
        f6.a.u(strZzf);
        this.zzb = strZzf;
        this.zzc = zzafrVar.zzb();
        Uri uriZza = zzafrVar.zza();
        if (uriZza != null) {
            this.zzd = uriZza.toString();
            this.zze = uriZza;
        }
        this.zzf = zzafrVar.zzc();
        this.zzg = zzafrVar.zze();
        this.zzh = false;
        this.zzi = zzafrVar.zzg();
    }

    public zzab(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzc = str5;
        this.zzd = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.zze = Uri.parse(this.zzd);
        }
        this.zzh = z10;
        this.zzi = str7;
    }
}
