package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzdg implements Parcelable.Creator<zzdd> {
    @Override // android.os.Parcelable.Creator
    public final zzdd createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        long jT0 = 0;
        long jT1 = 0;
        boolean zP0 = false;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        Bundle bundleS = null;
        String strV4 = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    jT0 = e.t0(i10, parcel);
                    break;
                case 2:
                    jT1 = e.t0(i10, parcel);
                    break;
                case 3:
                    zP0 = e.p0(i10, parcel);
                    break;
                case 4:
                    strV = e.V(i10, parcel);
                    break;
                case 5:
                    strV2 = e.V(i10, parcel);
                    break;
                case 6:
                    strV3 = e.V(i10, parcel);
                    break;
                case 7:
                    bundleS = e.S(i10, parcel);
                    break;
                case '\b':
                    strV4 = e.V(i10, parcel);
                    break;
                default:
                    e.E0(i10, parcel);
                    break;
            }
        }
        e.e0(iI0, parcel);
        return new zzdd(jT0, jT1, zP0, strV, strV2, strV3, bundleS, strV4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdd[] newArray(int i10) {
        return new zzdd[i10];
    }
}
