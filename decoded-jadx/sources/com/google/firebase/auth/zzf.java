package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzags;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzf implements Parcelable.Creator<zzd> {
    @Override // android.os.Parcelable.Creator
    public final zzd createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        zzags zzagsVar = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    strV = e.V(i10, parcel);
                    break;
                case 2:
                    strV2 = e.V(i10, parcel);
                    break;
                case 3:
                    strV3 = e.V(i10, parcel);
                    break;
                case 4:
                    zzagsVar = (zzags) e.U(parcel, i10, zzags.CREATOR);
                    break;
                case 5:
                    strV4 = e.V(i10, parcel);
                    break;
                case 6:
                    strV5 = e.V(i10, parcel);
                    break;
                case 7:
                    strV6 = e.V(i10, parcel);
                    break;
                default:
                    e.E0(i10, parcel);
                    break;
            }
        }
        e.e0(iI0, parcel);
        return new zzd(strV, strV2, strV3, zzagsVar, strV4, strV5, strV6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzd[] newArray(int i10) {
        return new zzd[i10];
    }
}
