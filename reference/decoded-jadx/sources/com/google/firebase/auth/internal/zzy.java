package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzy implements Parcelable.Creator<zzz> {
    @Override // android.os.Parcelable.Creator
    public final zzz createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        zzaf zzafVar = null;
        zzx zzxVar = null;
        com.google.firebase.auth.zzd zzdVar = null;
        while (parcel.dataPosition() < iI0) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                zzafVar = (zzaf) e.U(parcel, i10, zzaf.CREATOR);
            } else if (c10 == 2) {
                zzxVar = (zzx) e.U(parcel, i10, zzx.CREATOR);
            } else if (c10 != 3) {
                e.E0(i10, parcel);
            } else {
                zzdVar = (com.google.firebase.auth.zzd) e.U(parcel, i10, com.google.firebase.auth.zzd.CREATOR);
            }
        }
        e.e0(iI0, parcel);
        return new zzz(zzafVar, zzxVar, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzz[] newArray(int i10) {
        return new zzz[i10];
    }
}
