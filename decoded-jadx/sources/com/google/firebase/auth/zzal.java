package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzal implements Parcelable.Creator<GoogleAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final GoogleAuthCredential createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        String strV2 = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strV = e.V(i10, parcel);
            } else if (c10 != 2) {
                e.E0(i10, parcel);
            } else {
                strV2 = e.V(i10, parcel);
            }
        }
        e.e0(iI0, parcel);
        return new GoogleAuthCredential(strV, strV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleAuthCredential[] newArray(int i10) {
        return new GoogleAuthCredential[i10];
    }
}
