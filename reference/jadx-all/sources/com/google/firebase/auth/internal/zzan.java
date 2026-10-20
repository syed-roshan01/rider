package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzan implements Parcelable.Creator<zzal> {
    @Override // android.os.Parcelable.Creator
    public final zzal createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        ArrayList arrayListY = null;
        zzam zzamVar = null;
        String strV = null;
        com.google.firebase.auth.zzd zzdVar = null;
        zzaf zzafVar = null;
        ArrayList arrayListY2 = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    arrayListY = e.Y(parcel, i10, PhoneMultiFactorInfo.CREATOR);
                    break;
                case 2:
                    zzamVar = (zzam) e.U(parcel, i10, zzam.CREATOR);
                    break;
                case 3:
                    strV = e.V(i10, parcel);
                    break;
                case 4:
                    zzdVar = (com.google.firebase.auth.zzd) e.U(parcel, i10, com.google.firebase.auth.zzd.CREATOR);
                    break;
                case 5:
                    zzafVar = (zzaf) e.U(parcel, i10, zzaf.CREATOR);
                    break;
                case 6:
                    arrayListY2 = e.Y(parcel, i10, TotpMultiFactorInfo.CREATOR);
                    break;
                default:
                    e.E0(i10, parcel);
                    break;
            }
        }
        e.e0(iI0, parcel);
        return new zzal(arrayListY, zzamVar, strV, zzdVar, zzafVar, arrayListY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal[] newArray(int i10) {
        return new zzal[i10];
    }
}
