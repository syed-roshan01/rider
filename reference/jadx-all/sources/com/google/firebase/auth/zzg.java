package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzg implements Parcelable.Creator<EmailAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final EmailAuthCredential createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        boolean zP0 = false;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strV = e.V(i10, parcel);
            } else if (c10 == 2) {
                strV2 = e.V(i10, parcel);
            } else if (c10 == 3) {
                strV3 = e.V(i10, parcel);
            } else if (c10 == 4) {
                strV4 = e.V(i10, parcel);
            } else if (c10 != 5) {
                e.E0(i10, parcel);
            } else {
                zP0 = e.p0(i10, parcel);
            }
        }
        e.e0(iI0, parcel);
        return new EmailAuthCredential(strV, strV2, strV3, strV4, zP0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EmailAuthCredential[] newArray(int i10) {
        return new EmailAuthCredential[i10];
    }
}
