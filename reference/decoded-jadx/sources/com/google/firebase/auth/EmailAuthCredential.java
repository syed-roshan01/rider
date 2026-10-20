package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import f6.a;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new zzg();
    private String zza;
    private String zzb;
    private final String zzc;
    private String zzd;
    private boolean zze;

    public EmailAuthCredential(String str, String str2) {
        this(str, str2, null, null, false);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "password";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return !TextUtils.isEmpty(this.zzb) ? "password" : EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.T0(parcel, 1, this.zza);
        e.T0(parcel, 2, this.zzb);
        e.T0(parcel, 3, this.zzc);
        e.T0(parcel, 4, this.zzd);
        boolean z10 = this.zze;
        e.f1(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e.d1(iY0, parcel);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new EmailAuthCredential(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzc);
    }

    public final boolean zzg() {
        return this.zze;
    }

    public EmailAuthCredential(String str, String str2, String str3, String str4, boolean z10) {
        a.u(str);
        this.zza = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = z10;
    }

    public final EmailAuthCredential zza(FirebaseUser firebaseUser) {
        this.zzd = firebaseUser.zze();
        this.zze = true;
        return this;
    }

    public static boolean zza(String str) {
        ActionCodeUrl link;
        return (TextUtils.isEmpty(str) || (link = ActionCodeUrl.parseLink(str)) == null || link.getOperation() != 4) ? false : true;
    }
}
