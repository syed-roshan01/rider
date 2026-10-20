package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzbm implements Parcelable.Creator<zzbj> {
    @Override // android.os.Parcelable.Creator
    public final zzbj createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        ArrayList arrayListY = null;
        ArrayList arrayListY2 = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                arrayListY = e.Y(parcel, i10, PhoneMultiFactorInfo.CREATOR);
            } else if (c10 != 2) {
                e.E0(i10, parcel);
            } else {
                arrayListY2 = e.Y(parcel, i10, TotpMultiFactorInfo.CREATOR);
            }
        }
        e.e0(iI0, parcel);
        return new zzbj(arrayListY, arrayListY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbj[] newArray(int i10) {
        return new zzbj[i10];
    }
}
