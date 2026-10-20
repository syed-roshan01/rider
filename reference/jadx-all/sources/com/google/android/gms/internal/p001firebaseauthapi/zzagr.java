package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.internal.Code;
import o7.i2;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzagr implements Parcelable.Creator<zzags> {
    @Override // android.os.Parcelable.Creator
    public final zzags createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        String strV7 = null;
        String strV8 = null;
        String strV9 = null;
        String strV10 = null;
        String strV11 = null;
        String strV12 = null;
        String strV13 = null;
        boolean zP0 = false;
        boolean zP1 = false;
        boolean zP2 = false;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    strV = e.V(i10, parcel);
                    break;
                case 3:
                    strV2 = e.V(i10, parcel);
                    break;
                case 4:
                    strV3 = e.V(i10, parcel);
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
                case '\b':
                    strV7 = e.V(i10, parcel);
                    break;
                case '\t':
                    strV8 = e.V(i10, parcel);
                    break;
                case '\n':
                    zP0 = e.p0(i10, parcel);
                    break;
                case 11:
                    zP1 = e.p0(i10, parcel);
                    break;
                case '\f':
                    strV9 = e.V(i10, parcel);
                    break;
                case '\r':
                    strV10 = e.V(i10, parcel);
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    strV11 = e.V(i10, parcel);
                    break;
                case 15:
                    strV12 = e.V(i10, parcel);
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    zP2 = e.p0(i10, parcel);
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    strV13 = e.V(i10, parcel);
                    break;
                default:
                    e.E0(i10, parcel);
                    break;
            }
        }
        e.e0(iI0, parcel);
        return new zzags(strV, strV2, strV3, strV4, strV5, strV6, strV7, strV8, zP0, zP1, strV9, strV10, strV11, strV12, zP2, strV13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzags[] newArray(int i10) {
        return new zzags[i10];
    }
}
