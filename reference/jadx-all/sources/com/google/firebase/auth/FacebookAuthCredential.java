package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzags;
import f6.a;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class FacebookAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = new zzh();
    private final String zza;

    public FacebookAuthCredential(String str) {
        a.u(str);
        this.zza = str;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "facebook.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.T0(parcel, 1, this.zza);
        e.d1(iY0, parcel);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new FacebookAuthCredential(this.zza);
    }

    public static zzags zza(FacebookAuthCredential facebookAuthCredential, String str) {
        a.x(facebookAuthCredential);
        return new zzags(null, facebookAuthCredential.zza, facebookAuthCredential.getProvider(), null, null, null, str, null, null);
    }
}
