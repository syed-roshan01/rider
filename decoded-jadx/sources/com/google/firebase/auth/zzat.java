package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzagq;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzat implements Parcelable.Creator<TotpMultiFactorInfo> {
    @Override // android.os.Parcelable.Creator
    public final TotpMultiFactorInfo createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        String strV2 = null;
        zzagq zzagqVar = null;
        long jT0 = 0;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strV = e.V(i10, parcel);
            } else if (c10 == 2) {
                strV2 = e.V(i10, parcel);
            } else if (c10 == 3) {
                jT0 = e.t0(i10, parcel);
            } else if (c10 != 4) {
                e.E0(i10, parcel);
            } else {
                zzagqVar = (zzagq) e.U(parcel, i10, zzagq.CREATOR);
            }
        }
        e.e0(iI0, parcel);
        return new TotpMultiFactorInfo(strV, strV2, jT0, zzagqVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TotpMultiFactorInfo[] newArray(int i10) {
        return new TotpMultiFactorInfo[i10];
    }
}
