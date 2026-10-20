package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzc implements Parcelable.Creator<ActionCodeSettings> {
    @Override // android.os.Parcelable.Creator
    public final ActionCodeSettings createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        String strV7 = null;
        boolean zP0 = false;
        boolean zP1 = false;
        int iS0 = 0;
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
                    strV4 = e.V(i10, parcel);
                    break;
                case 5:
                    zP0 = e.p0(i10, parcel);
                    break;
                case 6:
                    strV5 = e.V(i10, parcel);
                    break;
                case 7:
                    zP1 = e.p0(i10, parcel);
                    break;
                case '\b':
                    strV6 = e.V(i10, parcel);
                    break;
                case '\t':
                    iS0 = e.s0(i10, parcel);
                    break;
                case '\n':
                    strV7 = e.V(i10, parcel);
                    break;
                default:
                    e.E0(i10, parcel);
                    break;
            }
        }
        e.e0(iI0, parcel);
        return new ActionCodeSettings(strV, strV2, strV3, strV4, zP0, strV5, zP1, strV6, iS0, strV7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActionCodeSettings[] newArray(int i10) {
        return new ActionCodeSettings[i10];
    }
}
