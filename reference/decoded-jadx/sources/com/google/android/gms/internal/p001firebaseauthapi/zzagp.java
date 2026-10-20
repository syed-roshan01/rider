package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzagp implements Parcelable.Creator<zzagq> {
    @Override // android.os.Parcelable.Creator
    public final zzagq createFromParcel(Parcel parcel) {
        int iI0 = e.I0(parcel);
        while (parcel.dataPosition() < iI0) {
            e.E0(parcel.readInt(), parcel);
        }
        e.e0(iI0, parcel);
        return new zzagq();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagq[] newArray(int i10) {
        return new zzagq[i10];
    }
}
