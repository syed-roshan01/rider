package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzafs implements Parcelable.Creator<zzafp> {
    @Override // android.os.Parcelable.Creator
    public final zzafp createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strV = e.V(i10, parcel);
            } else if (c10 == 2) {
                strV2 = e.V(i10, parcel);
            } else if (c10 != 3) {
                e.E0(i10, parcel);
            } else {
                strV3 = e.V(i10, parcel);
            }
        }
        e.e0(iI0, parcel);
        return new zzafp(strV, strV2, strV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafp[] newArray(int i10) {
        return new zzafp[i10];
    }
}
