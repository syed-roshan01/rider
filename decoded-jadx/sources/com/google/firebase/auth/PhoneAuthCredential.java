package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import f6.a;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new zzap();
    private String zza;
    private String zzb;
    private String zzc;
    private boolean zzd;
    private String zze;

    public PhoneAuthCredential(String str, String str2, String str3, boolean z10, String str4) {
        a.q("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z10;
        this.zze = str4;
    }

    public /* synthetic */ Object clone() {
        return new PhoneAuthCredential(this.zza, getSmsCode(), this.zzc, this.zzd, this.zze);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "phone";
    }

    public String getSmsCode() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.T0(parcel, 1, this.zza);
        e.T0(parcel, 2, getSmsCode());
        e.T0(parcel, 4, this.zzc);
        boolean z10 = this.zzd;
        e.f1(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e.T0(parcel, 6, this.zze);
        e.d1(iY0, parcel);
    }

    public final PhoneAuthCredential zza(boolean z10) {
        this.zzd = false;
        return this;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzd;
    }

    public static PhoneAuthCredential zzb(String str, String str2) {
        return new PhoneAuthCredential(null, null, str, true, str2);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return (PhoneAuthCredential) clone();
    }

    public static PhoneAuthCredential zza(String str, String str2) {
        return new PhoneAuthCredential(str, str2, null, true, null);
    }
}
