package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzw implements Parcelable.Creator<zzx> {
    @Override // android.os.Parcelable.Creator
    public final zzx createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        String strV = null;
        boolean zP0 = false;
        String strV2 = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strV = e.V(i10, parcel);
            } else if (c10 == 2) {
                strV2 = e.V(i10, parcel);
            } else if (c10 != 3) {
                e.E0(i10, parcel);
            } else {
                zP0 = e.p0(i10, parcel);
            }
        }
        e.e0(iI0, parcel);
        return new zzx(strV, strV2, zP0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzx[] newArray(int i10) {
        return new zzx[i10];
    }
}
