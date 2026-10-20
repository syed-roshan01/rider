package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzaa implements Parcelable.Creator<zzab> {
    @Override // android.os.Parcelable.Creator
    public final zzab createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        String strV7 = null;
        boolean zP0 = false;
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
                    strV5 = e.V(i10, parcel);
                    break;
                case 4:
                    strV4 = e.V(i10, parcel);
                    break;
                case 5:
                    strV3 = e.V(i10, parcel);
                    break;
                case 6:
                    strV6 = e.V(i10, parcel);
                    break;
                case 7:
                    zP0 = e.p0(i10, parcel);
                    break;
                case '\b':
                    strV7 = e.V(i10, parcel);
                    break;
                default:
                    e.E0(i10, parcel);
                    break;
            }
        }
        e.e0(iI0, parcel);
        return new zzab(strV, strV2, strV3, strV4, strV5, strV6, zP0, strV7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzab[] newArray(int i10) {
        return new zzab[i10];
    }
}
