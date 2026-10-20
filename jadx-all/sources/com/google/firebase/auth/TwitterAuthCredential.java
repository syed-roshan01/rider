package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzags;
import f6.a;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class TwitterAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new zzau();
    private String zza;
    private String zzb;

    public TwitterAuthCredential(String str, String str2) {
        a.u(str);
        this.zza = str;
        a.u(str2);
        this.zzb = str2;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "twitter.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.T0(parcel, 1, this.zza);
        e.T0(parcel, 2, this.zzb);
        e.d1(iY0, parcel);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new TwitterAuthCredential(this.zza, this.zzb);
    }

    public static zzags zza(TwitterAuthCredential twitterAuthCredential, String str) {
        a.x(twitterAuthCredential);
        return new zzags(null, twitterAuthCredential.zza, twitterAuthCredential.getProvider(), null, twitterAuthCredential.zzb, null, str, null, null);
    }
}
