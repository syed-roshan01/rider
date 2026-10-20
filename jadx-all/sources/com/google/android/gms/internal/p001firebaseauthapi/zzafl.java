package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzafl implements Parcelable.Creator<zzafm> {
    @Override // android.os.Parcelable.Creator
    public final zzafm createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        String strV2 = null;
        Long lU0 = null;
        String strV3 = null;
        Long lU1 = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                strV = e.V(i10, parcel);
            } else if (c10 == 3) {
                strV2 = e.V(i10, parcel);
            } else if (c10 == 4) {
                lU0 = e.u0(i10, parcel);
            } else if (c10 == 5) {
                strV3 = e.V(i10, parcel);
            } else if (c10 != 6) {
                e.E0(i10, parcel);
            } else {
                lU1 = e.u0(i10, parcel);
            }
        }
        e.e0(iI0, parcel);
        return new zzafm(strV, strV2, lU0, strV3, lU1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafm[] newArray(int i10) {
        return new zzafm[i10];
    }
}
