package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzav implements Parcelable.Creator<UserProfileChangeRequest> {
    @Override // android.os.Parcelable.Creator
    public final UserProfileChangeRequest createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        boolean zP0 = false;
        boolean zP1 = false;
        String strV2 = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                strV = e.V(i10, parcel);
            } else if (c10 == 3) {
                strV2 = e.V(i10, parcel);
            } else if (c10 == 4) {
                zP0 = e.p0(i10, parcel);
            } else if (c10 != 5) {
                e.E0(i10, parcel);
            } else {
                zP1 = e.p0(i10, parcel);
            }
        }
        e.e0(iI0, parcel);
        return new UserProfileChangeRequest(strV, strV2, zP0, zP1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserProfileChangeRequest[] newArray(int i10) {
        return new UserProfileChangeRequest[i10];
    }
}
