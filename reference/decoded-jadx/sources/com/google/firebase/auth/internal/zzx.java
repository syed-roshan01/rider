package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AdditionalUserInfo;
import f6.a;
import java.util.Map;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzx implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzx> CREATOR = new zzw();
    private final String zza;
    private final String zzb;
    private Map<String, Object> zzc;
    private boolean zzd;

    public zzx(boolean z10) {
        this.zzd = z10;
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final Map<String, Object> getProfile() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String getProviderId() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String getUsername() {
        if ("github.com".equals(this.zza)) {
            return (String) this.zzc.get(FirebaseAnalytics.Event.LOGIN);
        }
        if ("twitter.com".equals(this.zza)) {
            return (String) this.zzc.get(FirebaseAnalytics.Param.SCREEN_NAME);
        }
        return null;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final boolean isNewUser() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.T0(parcel, 1, getProviderId());
        e.T0(parcel, 2, this.zzb);
        boolean zIsNewUser = isNewUser();
        e.f1(parcel, 3, 4);
        parcel.writeInt(zIsNewUser ? 1 : 0);
        e.d1(iY0, parcel);
    }

    public zzx(String str, String str2, boolean z10) {
        a.u(str);
        a.u(str2);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzbh.zzb(str2);
        this.zzd = z10;
    }
}
