package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzap implements Parcelable.Creator<zzam> {
    @Override // android.os.Parcelable.Creator
    public final zzam createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        String strV2 = null;
        ArrayList arrayListY = null;
        ArrayList arrayListY2 = null;
        zzaf zzafVar = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strV = e.V(i10, parcel);
            } else if (c10 == 2) {
                strV2 = e.V(i10, parcel);
            } else if (c10 == 3) {
                arrayListY = e.Y(parcel, i10, PhoneMultiFactorInfo.CREATOR);
            } else if (c10 == 4) {
                arrayListY2 = e.Y(parcel, i10, TotpMultiFactorInfo.CREATOR);
            } else if (c10 != 5) {
                e.E0(i10, parcel);
            } else {
                zzafVar = (zzaf) e.U(parcel, i10, zzaf.CREATOR);
            }
        }
        e.e0(iI0, parcel);
        return new zzam(strV, strV2, arrayListY, arrayListY2, zzafVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzam[] newArray(int i10) {
        return new zzam[i10];
    }
}
