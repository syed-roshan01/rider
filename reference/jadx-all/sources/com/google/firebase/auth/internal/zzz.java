package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import java.util.List;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzz implements AuthResult {
    public static final Parcelable.Creator<zzz> CREATOR = new zzy();
    private zzaf zza;
    private zzx zzb;
    private com.google.firebase.auth.zzd zzc;

    public zzz(zzaf zzafVar) {
        if (zzafVar == null) {
            throw new NullPointerException("null reference");
        }
        this.zza = zzafVar;
        List<zzab> listZzi = zzafVar.zzi();
        this.zzb = null;
        for (int i10 = 0; i10 < listZzi.size(); i10++) {
            if (!TextUtils.isEmpty(listZzi.get(i10).zza())) {
                this.zzb = new zzx(listZzi.get(i10).getProviderId(), listZzi.get(i10).zza(), zzafVar.zzj());
            }
        }
        if (this.zzb == null) {
            this.zzb = new zzx(zzafVar.zzj());
        }
        this.zzc = zzafVar.zzg();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final AdditionalUserInfo getAdditionalUserInfo() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final AuthCredential getCredential() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final FirebaseUser getUser() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.R0(parcel, 1, getUser(), i10);
        e.R0(parcel, 2, getAdditionalUserInfo(), i10);
        e.R0(parcel, 3, this.zzc, i10);
        e.d1(iY0, parcel);
    }

    public zzz(zzaf zzafVar, zzx zzxVar, com.google.firebase.auth.zzd zzdVar) {
        this.zza = zzafVar;
        this.zzb = zzxVar;
        this.zzc = zzdVar;
    }
}
