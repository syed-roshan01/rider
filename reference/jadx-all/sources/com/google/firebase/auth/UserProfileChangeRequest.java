package com.google.firebase.auth;

import a6.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class UserProfileChangeRequest extends a {
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new zzav();
    private String zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private Uri zze;

    public static class Builder {
        private String zza;
        private Uri zzb;
        private boolean zzc;
        private boolean zzd;

        public UserProfileChangeRequest build() {
            String str = this.zza;
            Uri uri = this.zzb;
            return new UserProfileChangeRequest(str, uri == null ? null : uri.toString(), this.zzc, this.zzd);
        }

        public String getDisplayName() {
            return this.zza;
        }

        public Uri getPhotoUri() {
            return this.zzb;
        }

        public Builder setDisplayName(String str) {
            if (str == null) {
                this.zzc = true;
            } else {
                this.zza = str;
            }
            return this;
        }

        public Builder setPhotoUri(Uri uri) {
            if (uri == null) {
                this.zzd = true;
            } else {
                this.zzb = uri;
            }
            return this;
        }
    }

    public UserProfileChangeRequest(String str, String str2, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public String getDisplayName() {
        return this.zza;
    }

    public Uri getPhotoUri() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.T0(parcel, 2, getDisplayName());
        e.T0(parcel, 3, this.zzb);
        boolean z10 = this.zzc;
        e.f1(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzd;
        e.f1(parcel, 5, 4);
        parcel.writeInt(z11 ? 1 : 0);
        e.d1(iY0, parcel);
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
