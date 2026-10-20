package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzag implements Parcelable.Creator<zzah> {
    @Override // android.os.Parcelable.Creator
    public final zzah createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        long jT0 = 0;
        long jT1 = 0;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                jT0 = e.t0(i10, parcel);
            } else if (c10 != 2) {
                e.E0(i10, parcel);
            } else {
                jT1 = e.t0(i10, parcel);
            }
        }
        e.e0(iI0, parcel);
        return new zzah(jT0, jT1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzah[] newArray(int i10) {
        return new zzah[i10];
    }
}
